package com.lazarus.cobol.screen;

import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

/**
 * 3270 Screen Server — lightweight HTTP server that bridges web browsers
 * to translated CICS programs via ScreenSession.
 *
 * REST API:
 *   GET  /                           → serves the 3270 terminal HTML page
 *   GET  /api/screen?session={id}    → get current screen state (JSON)
 *   POST /api/input?session={id}     → submit AID + field values
 *   POST /api/session                → create new session
 *   GET  /api/sessions               → list active sessions
 *   DELETE /api/session?session={id} → close session
 *
 * No external dependencies — uses com.sun.net.httpserver (built into JDK).
 */
public class ScreenServer {

    private final int port;
    private HttpServer server;
    private final Map<String, ScreenSession> sessions = new ConcurrentHashMap<>();
    private int nextSessionId = 1;

    // HTML template for the 3270 terminal (inline)
    private String terminalHtml;

    public ScreenServer(int port) {
        this.port = port;
        this.terminalHtml = buildTerminalHtml();
    }

    /** Start the server */
    public void start() throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.setExecutor(Executors.newFixedThreadPool(8));

        server.createContext("/", this::handleRoot);
        server.createContext("/api/screen", this::handleGetScreen);
        server.createContext("/api/input", this::handleInput);
        server.createContext("/api/session", this::handleSession);
        server.createContext("/api/sessions", this::handleListSessions);

        server.start();
    }

    /** Stop the server */
    public void stop() {
        if (server != null) server.stop(0);
    }

    /** Get or create a session */
    public ScreenSession getSession(String id) {
        return sessions.get(id);
    }

    /** Create a new session and return its ID */
    public String createSession() {
        String id = "S" + (nextSessionId++);
        sessions.put(id, new ScreenSession(id));
        return id;
    }

    /** Register a session externally */
    public void registerSession(ScreenSession session) {
        sessions.put(session.getSessionId(), session);
    }

    /** Get the port this server is bound to */
    public int getPort() { return port; }

    // --- HTTP Handlers ---

    private void handleRoot(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            byte[] response = terminalHtml.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
        } else {
            exchange.sendResponseHeaders(405, -1);
        }
        exchange.close();
    }

    private void handleGetScreen(HttpExchange exchange) throws IOException {
        if (!"GET".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(405, -1);
            exchange.close();
            return;
        }

        String sessionId = getQueryParam(exchange.getRequestURI(), "session");
        ScreenSession session = sessions.get(sessionId);
        if (session == null) {
            sendJson(exchange, 404, "{\"error\": \"Session not found\"}");
            return;
        }

        // Try to get new screen, with short wait
        String screen = session.getScreen(500);
        if (screen == null) {
            // Return current screen state if no new screen
            screen = session.getCurrentScreenJson();
        }
        if (screen == null) {
            sendJson(exchange, 200, "{\"waiting\": true}");
        } else {
            sendJson(exchange, 200, screen);
        }
    }

    private void handleInput(HttpExchange exchange) throws IOException {
        if (!"POST".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(405, -1);
            exchange.close();
            return;
        }

        String sessionId = getQueryParam(exchange.getRequestURI(), "session");
        ScreenSession session = sessions.get(sessionId);
        if (session == null) {
            sendJson(exchange, 404, "{\"error\": \"Session not found\"}");
            return;
        }

        // Read POST body
        String body = readBody(exchange);

        // Parse JSON manually (no external deps): {"aid":"ENTER","fields":{"FIELD1":"val",...}}
        String aid = extractJsonString(body, "aid");
        Map<String, String> fields = extractJsonObject(body, "fields");

        session.submitInput(aid, fields);
        sendJson(exchange, 200, "{\"ok\": true}");
    }

    private void handleSession(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        if ("POST".equals(method)) {
            String id = createSession();
            sendJson(exchange, 200, "{\"session\": \"" + id + "\"}");
        } else if ("DELETE".equals(method)) {
            String sessionId = getQueryParam(exchange.getRequestURI(), "session");
            ScreenSession session = sessions.remove(sessionId);
            if (session != null) session.close();
            sendJson(exchange, 200, "{\"ok\": true}");
        } else {
            exchange.sendResponseHeaders(405, -1);
            exchange.close();
        }
    }

    private void handleListSessions(HttpExchange exchange) throws IOException {
        if (!"GET".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(405, -1);
            exchange.close();
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (Map.Entry<String, ScreenSession> entry : sessions.entrySet()) {
            if (!first) sb.append(",");
            sb.append("{\"id\":\"").append(entry.getKey())
              .append("\",\"active\":").append(entry.getValue().isActive()).append("}");
            first = false;
        }
        sb.append("]");
        sendJson(exchange, 200, sb.toString());
    }

    // --- Helpers ---

    private void sendJson(HttpExchange exchange, int code, String json) throws IOException {
        byte[] response = json.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
        exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
        exchange.sendResponseHeaders(code, response.length);
        exchange.getResponseBody().write(response);
        exchange.close();
    }

    private String readBody(HttpExchange exchange) throws IOException {
        InputStream is = exchange.getRequestBody();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = is.read(buf)) != -1) baos.write(buf, 0, n);
        return baos.toString("UTF-8");
    }

    private String getQueryParam(URI uri, String name) {
        String query = uri.getQuery();
        if (query == null) return "";
        for (String pair : query.split("&")) {
            String[] kv = pair.split("=", 2);
            if (kv[0].equals(name)) {
                try { return URLDecoder.decode(kv.length > 1 ? kv[1] : "", "UTF-8"); }
                catch (UnsupportedEncodingException e) { return kv.length > 1 ? kv[1] : ""; }
            }
        }
        return "";
    }

    /** Simple JSON string extraction: "key": "value" */
    static String extractJsonString(String json, String key) {
        int idx = json.indexOf("\"" + key + "\"");
        if (idx < 0) return "";
        int colon = json.indexOf(':', idx + key.length() + 2);
        if (colon < 0) return "";
        int qStart = json.indexOf('"', colon + 1);
        if (qStart < 0) return "";
        int qEnd = json.indexOf('"', qStart + 1);
        if (qEnd < 0) return "";
        return json.substring(qStart + 1, qEnd);
    }

    /** Simple JSON object extraction: "key": {"k1":"v1","k2":"v2"} */
    static Map<String, String> extractJsonObject(String json, String key) {
        Map<String, String> result = new LinkedHashMap<>();
        int idx = json.indexOf("\"" + key + "\"");
        if (idx < 0) return result;
        int braceStart = json.indexOf('{', idx + key.length() + 2);
        if (braceStart < 0) return result;
        int depth = 0;
        int braceEnd = -1;
        for (int i = braceStart; i < json.length(); i++) {
            if (json.charAt(i) == '{') depth++;
            else if (json.charAt(i) == '}') { depth--; if (depth == 0) { braceEnd = i; break; } }
        }
        if (braceEnd < 0) return result;
        String obj = json.substring(braceStart + 1, braceEnd);
        // Parse simple key-value pairs
        int pos = 0;
        while (pos < obj.length()) {
            int kStart = obj.indexOf('"', pos);
            if (kStart < 0) break;
            int kEnd = obj.indexOf('"', kStart + 1);
            if (kEnd < 0) break;
            String k = obj.substring(kStart + 1, kEnd);
            int vStart = obj.indexOf('"', kEnd + 1);
            if (vStart < 0) break;
            int vEnd = obj.indexOf('"', vStart + 1);
            if (vEnd < 0) break;
            result.put(k, obj.substring(vStart + 1, vEnd));
            pos = vEnd + 1;
        }
        return result;
    }

    /** Remove a session by ID */
    public void removeSession(String sessionId) {
        ScreenSession session = sessions.remove(sessionId);
        if (session != null) session.close();
    }

    /** Get total session count */
    public int getSessionCount() { return sessions.size(); }

    /**
     * Render a standalone ScreenField-based screen as an HTML form.
     * Used for direct field-level rendering without CicsMap dependency.
     */
    public String renderStandaloneScreen(ScreenSession session) {
        if (session == null) return "<html><body>No session</body></html>";
        return generateFieldHtml(session);
    }

    /**
     * Process a form submission: extract field values and set AID key.
     * Used for direct POST form processing (non-JSON).
     */
    public void processFormInput(ScreenSession session, Map<String, String> formData) {
        if (session == null || formData == null) return;
        String aid = formData.getOrDefault("_aid", "ENTER");
        Map<String, String> fields = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : formData.entrySet()) {
            if (!entry.getKey().startsWith("_")) {
                fields.put(entry.getKey(), entry.getValue());
            }
        }
        session.submitInput(aid, fields);
    }

    /**
     * Generate HTML for a 3270 screen using ScreenSession's standalone fields (24x80 grid).
     * Renders input fields as form elements with AID key buttons.
     */
    private String generateFieldHtml(ScreenSession session) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html><html><head><meta charset='UTF-8'>");
        sb.append("<title>3270 Screen — ").append(session.getSessionId()).append("</title>");
        sb.append("<style>");
        sb.append("*{margin:0;padding:0;box-sizing:border-box;}");
        sb.append("body{background:#000;color:#33ff33;font-family:'Courier New',monospace;font-size:14px;padding:20px;}");
        sb.append(".screen{width:680px;margin:0 auto;border:2px solid #333;padding:10px;background:#0a0a0a;}");
        sb.append(".row{height:18px;line-height:18px;white-space:pre;position:relative;}");
        sb.append("input.fld{background:#111;border:1px solid #333;color:#33ff33;font-family:inherit;font-size:inherit;padding:0 2px;}");
        sb.append("input.fld:focus{border-color:#33ff33;}");
        sb.append(".aid-bar{margin-top:10px;text-align:center;}");
        sb.append(".aid-btn{background:#222;color:#33ff33;border:1px solid #444;padding:4px 10px;margin:2px;cursor:pointer;font-family:inherit;font-size:12px;}");
        sb.append(".aid-btn:hover{background:#333;}");
        sb.append("</style></head><body>");
        sb.append("<form method='POST' action='/api/form?session=").append(session.getSessionId()).append("'>");

        // Build 24x80 char grid
        int rows = 24, cols = 80;
        char[][] grid = new char[rows][cols];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                grid[r][c] = ' ';

        // Place protected field values on the grid
        for (ScreenSession.ScreenField field : session.getStandaloneFields().values()) {
            if (!field.isInputField() && field.getValue() != null) {
                int fr = field.getRow() - 1;
                int fc = field.getCol() - 1;
                String val = field.getValue();
                if (fr >= 0 && fr < rows) {
                    for (int i = 0; i < field.getLength() && fc + i < cols; i++) {
                        grid[fr][fc + i] = i < val.length() ? val.charAt(i) : ' ';
                    }
                }
            }
        }

        sb.append("<div class='screen'>");
        for (int r = 0; r < rows; r++) {
            sb.append("<div class='row'>");
            sb.append(escapeHtml(new String(grid[r])));
            // Overlay input fields on this row
            for (ScreenSession.ScreenField field : session.getStandaloneFields().values()) {
                if (field.isInputField() && field.getRow() - 1 == r) {
                    sb.append("<input class='fld' name='").append(escapeHtml(field.getName())).append("'");
                    sb.append(" maxlength='").append(field.getLength()).append("'");
                    sb.append(" size='").append(field.getLength()).append("'");
                    sb.append(" value='").append(escapeHtml(field.getValue() != null ? field.getValue() : "")).append("'");
                    sb.append(" style='position:absolute;left:").append((field.getCol() - 1) * 8.4).append("px;'");
                    sb.append(">");
                }
            }
            sb.append("</div>");
        }
        sb.append("</div>");

        // AID key buttons
        sb.append("<div class='aid-bar'>");
        sb.append("<button type='submit' name='_aid' value='ENTER' class='aid-btn'>ENTER</button>");
        sb.append("<button type='submit' name='_aid' value='CLEAR' class='aid-btn'>CLEAR</button>");
        for (int i = 1; i <= 24; i++) {
            sb.append("<button type='submit' name='_aid' value='PF").append(i).append("' class='aid-btn'>PF").append(i).append("</button>");
        }
        sb.append("<button type='submit' name='_aid' value='PA1' class='aid-btn'>PA1</button>");
        sb.append("<button type='submit' name='_aid' value='PA2' class='aid-btn'>PA2</button>");
        sb.append("<button type='submit' name='_aid' value='PA3' class='aid-btn'>PA3</button>");
        sb.append("</div>");

        sb.append("</form></body></html>");
        return sb.toString();
    }

    private static String escapeHtml(String s) {
        if (s == null) return "";
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                .replace("\"", "&quot;").replace("'", "&#39;");
    }

    /** Build the 3270 terminal HTML page (self-contained, no external deps) */
    private static String buildTerminalHtml() {
        return "<!DOCTYPE html>\n" +
            "<html><head><meta charset='UTF-8'><title>3270 Terminal</title>\n" +
            "<style>\n" +
            "* { margin:0; padding:0; box-sizing:border-box; }\n" +
            "body { background:#000; color:#33ff33; font-family:'Courier New',monospace;\n" +
            "       font-size:14px; display:flex; flex-direction:column; align-items:center;\n" +
            "       min-height:100vh; padding:20px; }\n" +
            "#header { color:#888; margin-bottom:10px; font-size:12px; }\n" +
            "#terminal { border:2px solid #333; padding:10px; background:#0a0a0a;\n" +
            "            width:740px; position:relative; }\n" +
            ".row { height:18px; line-height:18px; white-space:pre; position:relative; }\n" +
            ".field-input { background:transparent; border:none; color:#33ff33;\n" +
            "               font-family:inherit; font-size:inherit; outline:none;\n" +
            "               padding:0; position:absolute; }\n" +
            ".field-input.numeric { color:#ffff33; }\n" +
            ".field-protected { color:#33ff33; }\n" +
            ".field-bright { color:#ffffff !important; }\n" +
            ".field-dark { color:#0a0a0a !important; }\n" +
            ".cursor-field { border-bottom:1px solid #33ff33; }\n" +
            "#status { color:#888; margin-top:10px; font-size:11px; width:740px;\n" +
            "          display:flex; justify-content:space-between; }\n" +
            "#keybar { color:#555; margin-top:5px; font-size:11px; }\n" +
            "</style></head><body>\n" +
            "<div id='header'>LAZARUS 3270 TERMINAL</div>\n" +
            "<div id='terminal'></div>\n" +
            "<div id='status'><span id='session'></span><span id='aid'></span></div>\n" +
            "<div id='keybar'>Enter=Submit | F1-F12 | Esc=Clear | Tab=Next Field</div>\n" +
            "<script>\n" +
            "let SID='';\n" +
            "async function init(){\n" +
            "  let r=await fetch('/api/session',{method:'POST'});\n" +
            "  let d=await r.json(); SID=d.session;\n" +
            "  document.getElementById('session').textContent='Session: '+SID;\n" +
            "  poll();\n" +
            "}\n" +
            "async function poll(){\n" +
            "  if(!SID)return;\n" +
            "  try{\n" +
            "    let r=await fetch('/api/screen?session='+SID);\n" +
            "    let d=await r.json();\n" +
            "    if(d.fields) render(d);\n" +
            "  }catch(e){}\n" +
            "  setTimeout(poll,500);\n" +
            "}\n" +
            "function render(screen){\n" +
            "  let t=document.getElementById('terminal'); t.innerHTML='';\n" +
            "  let grid=[];\n" +
            "  for(let i=0;i<(screen.rows||24);i++){\n" +
            "    grid.push(Array((screen.cols||80)+1).join(' '));\n" +
            "  }\n" +
            "  // Place protected field values on grid\n" +
            "  screen.fields.forEach(f=>{\n" +
            "    if(f.protected && f.value){\n" +
            "      let r=f.row-1, c=f.col-1;\n" +
            "      if(r>=0 && r<grid.length){\n" +
            "        let row=grid[r];\n" +
            "        let v=f.value.substring(0,f.len);\n" +
            "        while(v.length<f.len) v+=' ';\n" +
            "        grid[r]=row.substring(0,c)+v+row.substring(c+f.len);\n" +
            "      }\n" +
            "    }\n" +
            "  });\n" +
            "  // Render rows\n" +
            "  grid.forEach((row,ri)=>{\n" +
            "    let div=document.createElement('div');\n" +
            "    div.className='row'; div.textContent=row;\n" +
            "    // Overlay input fields\n" +
            "    screen.fields.forEach(f=>{\n" +
            "      if(f.row-1===ri && !f.protected){\n" +
            "        let inp=document.createElement('input');\n" +
            "        inp.className='field-input'+(f.type==='numeric'?' numeric':'')+(f.cursor?' cursor-field':'');\n" +
            "        inp.style.left=(f.col-1)*8.4+'px';\n" +
            "        inp.style.width=f.len*8.4+'px';\n" +
            "        inp.maxLength=f.len;\n" +
            "        inp.value=f.value||'';\n" +
            "        inp.dataset.name=f.name;\n" +
            "        if(f.cursor) setTimeout(()=>inp.focus(),50);\n" +
            "        div.appendChild(inp);\n" +
            "      } else if(f.row-1===ri && f.bright){\n" +
            "        // Re-render bright text\n" +
            "      }\n" +
            "    });\n" +
            "    t.appendChild(div);\n" +
            "  });\n" +
            "}\n" +
            "async function submit(aid){\n" +
            "  let fields={};\n" +
            "  document.querySelectorAll('.field-input').forEach(inp=>{\n" +
            "    if(inp.dataset.name) fields[inp.dataset.name]=inp.value;\n" +
            "  });\n" +
            "  document.getElementById('aid').textContent='AID: '+aid;\n" +
            "  await fetch('/api/input?session='+SID,{\n" +
            "    method:'POST', headers:{'Content-Type':'application/json'},\n" +
            "    body:JSON.stringify({aid:aid,fields:fields})\n" +
            "  });\n" +
            "}\n" +
            "document.addEventListener('keydown',e=>{\n" +
            "  if(e.key==='Enter'){e.preventDefault(); submit('ENTER');}\n" +
            "  else if(e.key==='Escape'){e.preventDefault(); submit('CLEAR');}\n" +
            "  else if(e.key.match(/^F(\\d+)$/)){\n" +
            "    e.preventDefault(); submit('PF'+e.key.substring(1));\n" +
            "  } else if(e.key==='Tab'){\n" +
            "    e.preventDefault();\n" +
            "    let inputs=[...document.querySelectorAll('.field-input')];\n" +
            "    let cur=inputs.indexOf(document.activeElement);\n" +
            "    if(inputs.length>0) inputs[(cur+1)%inputs.length].focus();\n" +
            "  }\n" +
            "});\n" +
            "init();\n" +
            "</script></body></html>\n";
    }
}
