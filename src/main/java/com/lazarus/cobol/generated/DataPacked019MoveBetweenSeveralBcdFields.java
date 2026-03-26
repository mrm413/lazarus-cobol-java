package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked019MoveBetweenSeveralBcdFields extends CobolProgram {
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
    private int cob_crt_status = 0;
    private int length_an = 0;
    private CobolString when_compiled = new CobolString(21);
    private CobolString debug_item = new CobolString(256);
    private CobolString debug_line = new CobolString(6);
    private CobolString debug_name = new CobolString(30);
    private CobolString debug_sub_1 = new CobolString(4);
    private CobolString debug_sub_2 = new CobolString(4);
    private CobolString debug_sub_3 = new CobolString(4);
    private CobolString debug_contents = new CobolString(256);

    private CobolString on = new CobolString(256); // fallback
    private CobolString error = new CobolString(256); // fallback
    private CobolString no_disp = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString some = new CobolString(256); // fallback
    private CobolString fld0001a = new CobolString(256); // fallback
    private CobolString fld0001c = new CobolString(256); // fallback
    private CobolString fld0002a = new CobolString(256); // fallback
    private CobolString fld0002c = new CobolString(256); // fallback
    private CobolString fld0003a = new CobolString(256); // fallback
    private CobolString fld0003c = new CobolString(256); // fallback
    private CobolString fld0004a = new CobolString(256); // fallback
    private CobolString fld0004c = new CobolString(256); // fallback
    private CobolString fld0005a = new CobolString(256); // fallback
    private CobolString fld0005c = new CobolString(256); // fallback
    private CobolString fld0006a = new CobolString(256); // fallback
    private CobolString fld0006c = new CobolString(256); // fallback
    private CobolString fld0007a = new CobolString(256); // fallback
    private CobolString fld0007c = new CobolString(256); // fallback
    private CobolString fld0008a = new CobolString(256); // fallback
    private CobolString fld0008c = new CobolString(256); // fallback
    private CobolString fld0009a = new CobolString(256); // fallback
    private CobolString fld0009c = new CobolString(256); // fallback
    private CobolString fld0010a = new CobolString(256); // fallback
    private CobolString fld0010c = new CobolString(256); // fallback
    private CobolString fld0011a = new CobolString(256); // fallback
    private CobolString fld0011c = new CobolString(256); // fallback
    private CobolString fld0012a = new CobolString(256); // fallback
    private CobolString fld0012c = new CobolString(256); // fallback
    private CobolString fld0013a = new CobolString(256); // fallback
    private CobolString fld0013c = new CobolString(256); // fallback
    private CobolString fld0014a = new CobolString(256); // fallback
    private CobolString fld0014c = new CobolString(256); // fallback
    private CobolString fld0015a = new CobolString(256); // fallback
    private CobolString fld0015c = new CobolString(256); // fallback
    private CobolString fld0016a = new CobolString(256); // fallback
    private CobolString fld0016c = new CobolString(256); // fallback
    private CobolString fld0017a = new CobolString(256); // fallback
    private CobolString fld0017c = new CobolString(256); // fallback
    private CobolString fld0018a = new CobolString(256); // fallback
    private CobolString fld0018c = new CobolString(256); // fallback
    private CobolString fld0019a = new CobolString(256); // fallback
    private CobolString fld0019c = new CobolString(256); // fallback
    private CobolString fld0020a = new CobolString(256); // fallback
    private CobolString fld0020c = new CobolString(256); // fallback
    private CobolString fld0021a = new CobolString(256); // fallback
    private CobolString fld0021c = new CobolString(256); // fallback
    private CobolString fld0022a = new CobolString(256); // fallback
    private CobolString fld0022c = new CobolString(256); // fallback
    private CobolString fld0023a = new CobolString(256); // fallback
    private CobolString fld0023c = new CobolString(256); // fallback
    private CobolString fld0024a = new CobolString(256); // fallback
    private CobolString fld0024c = new CobolString(256); // fallback
    private CobolString fld0025a = new CobolString(256); // fallback
    private CobolString fld0025c = new CobolString(256); // fallback
    private CobolString fld0026a = new CobolString(256); // fallback
    private CobolString fld0026c = new CobolString(256); // fallback
    private CobolString fld0027a = new CobolString(256); // fallback
    private CobolString fld0027c = new CobolString(256); // fallback
    private CobolString fld0028a = new CobolString(256); // fallback
    private CobolString fld0028c = new CobolString(256); // fallback
    private CobolString fld0029a = new CobolString(256); // fallback
    private CobolString fld0029c = new CobolString(256); // fallback
    private CobolString fld0030a = new CobolString(256); // fallback
    private CobolString fld0030c = new CobolString(256); // fallback
    private CobolString fld0031a = new CobolString(256); // fallback
    private CobolString fld0031c = new CobolString(256); // fallback
    private CobolString fld0032a = new CobolString(256); // fallback
    private CobolString fld0032c = new CobolString(256); // fallback
    private CobolString fld0033a = new CobolString(256); // fallback
    private CobolString fld0033c = new CobolString(256); // fallback
    private CobolString fld0034a = new CobolString(256); // fallback
    private CobolString fld0034c = new CobolString(256); // fallback
    private CobolString fld0035a = new CobolString(256); // fallback
    private CobolString fld0035c = new CobolString(256); // fallback
    private CobolString fld0036a = new CobolString(256); // fallback
    private CobolString fld0036c = new CobolString(256); // fallback
    private CobolString fld0037a = new CobolString(256); // fallback
    private CobolString fld0037c = new CobolString(256); // fallback
    private CobolString fld0038a = new CobolString(256); // fallback
    private CobolString fld0038c = new CobolString(256); // fallback
    private CobolString fld0039a = new CobolString(256); // fallback
    private CobolString fld0039c = new CobolString(256); // fallback
    private CobolString fld0040a = new CobolString(256); // fallback
    private CobolString fld0040c = new CobolString(256); // fallback
    private CobolString fld0041a = new CobolString(256); // fallback
    private CobolString fld0041c = new CobolString(256); // fallback
    private CobolString fld0042a = new CobolString(256); // fallback
    private CobolString fld0042c = new CobolString(256); // fallback
    private CobolString fld0043a = new CobolString(256); // fallback
    private CobolString fld0043c = new CobolString(256); // fallback
    private CobolString fld0044a = new CobolString(256); // fallback
    private CobolString fld0044c = new CobolString(256); // fallback
    private CobolString fld0045a = new CobolString(256); // fallback
    private CobolString fld0045c = new CobolString(256); // fallback
    private CobolString fld0046a = new CobolString(256); // fallback
    private CobolString fld0046c = new CobolString(256); // fallback
    private CobolString fld0047a = new CobolString(256); // fallback
    private CobolString fld0047c = new CobolString(256); // fallback
    private CobolString fld0048a = new CobolString(256); // fallback
    private CobolString fld0048c = new CobolString(256); // fallback
    private CobolString fld0049a = new CobolString(256); // fallback
    private CobolString fld0049c = new CobolString(256); // fallback
    private CobolString fld0050a = new CobolString(256); // fallback
    private CobolString fld0050c = new CobolString(256); // fallback
    private CobolString fld0051a = new CobolString(256); // fallback
    private CobolString fld0051c = new CobolString(256); // fallback
    private CobolString fld0052a = new CobolString(256); // fallback
    private CobolString fld0052c = new CobolString(256); // fallback
    private CobolString fld0053a = new CobolString(256); // fallback
    private CobolString fld0053c = new CobolString(256); // fallback
    private CobolString fld0054a = new CobolString(256); // fallback
    private CobolString fld0054c = new CobolString(256); // fallback
    private CobolString fld0055a = new CobolString(256); // fallback
    private CobolString fld0055c = new CobolString(256); // fallback
    private CobolString fld0056a = new CobolString(256); // fallback
    private CobolString fld0056c = new CobolString(256); // fallback
    private CobolString fld0057a = new CobolString(256); // fallback
    private CobolString fld0057c = new CobolString(256); // fallback
    private CobolString fld0058a = new CobolString(256); // fallback
    private CobolString fld0058c = new CobolString(256); // fallback
    private CobolString fld0059a = new CobolString(256); // fallback
    private CobolString fld0059c = new CobolString(256); // fallback
    private CobolString fld0060a = new CobolString(256); // fallback
    private CobolString fld0060c = new CobolString(256); // fallback
    private CobolString fld0061a = new CobolString(256); // fallback
    private CobolString fld0061c = new CobolString(256); // fallback
    private CobolString fld0062a = new CobolString(256); // fallback
    private CobolString fld0062c = new CobolString(256); // fallback
    private CobolString fld0063a = new CobolString(256); // fallback
    private CobolString fld0063c = new CobolString(256); // fallback
    private CobolString fld0064a = new CobolString(256); // fallback
    private CobolString fld0064c = new CobolString(256); // fallback
    private CobolString fld0065a = new CobolString(256); // fallback
    private CobolString fld0065c = new CobolString(256); // fallback
    private CobolString fld0066a = new CobolString(256); // fallback
    private CobolString fld0066c = new CobolString(256); // fallback
    private CobolString fld0067a = new CobolString(256); // fallback
    private CobolString fld0067c = new CobolString(256); // fallback
    private CobolString fld0068a = new CobolString(256); // fallback
    private CobolString fld0068c = new CobolString(256); // fallback
    private CobolString fld0069a = new CobolString(256); // fallback
    private CobolString fld0069c = new CobolString(256); // fallback
    private CobolString fld0070a = new CobolString(256); // fallback
    private CobolString fld0070c = new CobolString(256); // fallback
    private CobolString fld0071a = new CobolString(256); // fallback
    private CobolString fld0071c = new CobolString(256); // fallback
    private CobolString fld0072a = new CobolString(256); // fallback
    private CobolString fld0072c = new CobolString(256); // fallback
    private CobolString fld0073a = new CobolString(256); // fallback
    private CobolString fld0073c = new CobolString(256); // fallback
    private CobolString fld0074a = new CobolString(256); // fallback
    private CobolString fld0074c = new CobolString(256); // fallback
    private CobolString fld0075a = new CobolString(256); // fallback
    private CobolString fld0075c = new CobolString(256); // fallback
    private CobolString fld0076a = new CobolString(256); // fallback
    private CobolString fld0076c = new CobolString(256); // fallback
    private CobolString fld0077a = new CobolString(256); // fallback
    private CobolString fld0077c = new CobolString(256); // fallback
    private CobolString fld0078a = new CobolString(256); // fallback
    private CobolString fld0078c = new CobolString(256); // fallback
    private CobolString fld0079a = new CobolString(256); // fallback
    private CobolString fld0079c = new CobolString(256); // fallback
    private CobolString fld0080a = new CobolString(256); // fallback
    private CobolString fld0080c = new CobolString(256); // fallback
    private CobolString fld0081a = new CobolString(256); // fallback
    private CobolString fld0081c = new CobolString(256); // fallback
    private CobolString fld0082a = new CobolString(256); // fallback
    private CobolString fld0082c = new CobolString(256); // fallback
    private CobolString fld0083a = new CobolString(256); // fallback
    private CobolString fld0083c = new CobolString(256); // fallback
    private CobolString fld0084a = new CobolString(256); // fallback
    private CobolString fld0084c = new CobolString(256); // fallback
    private CobolString fld0085a = new CobolString(256); // fallback
    private CobolString fld0085c = new CobolString(256); // fallback
    private CobolString fld0086a = new CobolString(256); // fallback
    private CobolString fld0086c = new CobolString(256); // fallback
    private CobolString fld0087a = new CobolString(256); // fallback
    private CobolString fld0087c = new CobolString(256); // fallback
    private CobolString fld0088a = new CobolString(256); // fallback
    private CobolString fld0088c = new CobolString(256); // fallback
    private CobolString fld0089a = new CobolString(256); // fallback
    private CobolString fld0089c = new CobolString(256); // fallback
    private CobolString fld0090a = new CobolString(256); // fallback
    private CobolString fld0090c = new CobolString(256); // fallback
    private CobolString fld0091a = new CobolString(256); // fallback
    private CobolString fld0091c = new CobolString(256); // fallback
    private CobolString fld0092a = new CobolString(256); // fallback
    private CobolString fld0092c = new CobolString(256); // fallback
    private CobolString fld0093a = new CobolString(256); // fallback
    private CobolString fld0093c = new CobolString(256); // fallback
    private CobolString fld0094a = new CobolString(256); // fallback
    private CobolString fld0094c = new CobolString(256); // fallback
    private CobolString fld0095a = new CobolString(256); // fallback
    private CobolString fld0095c = new CobolString(256); // fallback
    private CobolString fld0096a = new CobolString(256); // fallback
    private CobolString fld0096c = new CobolString(256); // fallback
    private CobolString fld0097a = new CobolString(256); // fallback
    private CobolString fld0097c = new CobolString(256); // fallback
    private CobolString fld0098a = new CobolString(256); // fallback
    private CobolString fld0098c = new CobolString(256); // fallback
    private CobolString fld0099a = new CobolString(256); // fallback
    private CobolString fld0099c = new CobolString(256); // fallback
    private CobolString fld0100a = new CobolString(256); // fallback
    private CobolString fld0100c = new CobolString(256); // fallback
    private CobolString fld0101a = new CobolString(256); // fallback
    private CobolString fld0101c = new CobolString(256); // fallback
    private CobolString fld0102a = new CobolString(256); // fallback
    private CobolString fld0102c = new CobolString(256); // fallback
    private CobolString fld0103a = new CobolString(256); // fallback
    private CobolString fld0103c = new CobolString(256); // fallback
    private CobolString fld0104a = new CobolString(256); // fallback
    private CobolString fld0104c = new CobolString(256); // fallback
    private CobolString fld0105a = new CobolString(256); // fallback
    private CobolString fld0105c = new CobolString(256); // fallback
    private CobolString fld0106a = new CobolString(256); // fallback
    private CobolString fld0106c = new CobolString(256); // fallback
    private CobolString fld0107a = new CobolString(256); // fallback
    private CobolString fld0107c = new CobolString(256); // fallback
    private CobolString fld0108a = new CobolString(256); // fallback
    private CobolString fld0108c = new CobolString(256); // fallback
    private CobolString fld0109a = new CobolString(256); // fallback
    private CobolString fld0109c = new CobolString(256); // fallback
    private CobolString fld0110a = new CobolString(256); // fallback
    private CobolString fld0110c = new CobolString(256); // fallback
    private CobolString fld0111a = new CobolString(256); // fallback
    private CobolString fld0111c = new CobolString(256); // fallback
    private CobolString fld0112a = new CobolString(256); // fallback
    private CobolString fld0112c = new CobolString(256); // fallback
    private CobolString fld0113a = new CobolString(256); // fallback
    private CobolString fld0113c = new CobolString(256); // fallback
    private CobolString fld0114a = new CobolString(256); // fallback
    private CobolString fld0114c = new CobolString(256); // fallback
    private CobolString fld0115a = new CobolString(256); // fallback
    private CobolString fld0115c = new CobolString(256); // fallback
    private CobolString fld0116a = new CobolString(256); // fallback
    private CobolString fld0116c = new CobolString(256); // fallback
    private CobolString fld0117a = new CobolString(256); // fallback
    private CobolString fld0117c = new CobolString(256); // fallback
    private CobolString fld0118a = new CobolString(256); // fallback
    private CobolString fld0118c = new CobolString(256); // fallback
    private CobolString fld0119a = new CobolString(256); // fallback
    private CobolString fld0119c = new CobolString(256); // fallback
    private CobolString fld0120a = new CobolString(256); // fallback
    private CobolString fld0120c = new CobolString(256); // fallback
    private CobolString fld0121a = new CobolString(256); // fallback
    private CobolString fld0121c = new CobolString(256); // fallback
    private CobolString fld0122a = new CobolString(256); // fallback
    private CobolString fld0122c = new CobolString(256); // fallback
    private CobolString fld0123a = new CobolString(256); // fallback
    private CobolString fld0123c = new CobolString(256); // fallback
    private CobolString fld0124a = new CobolString(256); // fallback
    private CobolString fld0124c = new CobolString(256); // fallback
    private CobolString fld0125a = new CobolString(256); // fallback
    private CobolString fld0125c = new CobolString(256); // fallback
    private CobolString fld0126a = new CobolString(256); // fallback
    private CobolString fld0126c = new CobolString(256); // fallback
    private CobolString fld0127a = new CobolString(256); // fallback
    private CobolString fld0127c = new CobolString(256); // fallback
    private CobolString fld0128a = new CobolString(256); // fallback
    private CobolString fld0128c = new CobolString(256); // fallback
    private CobolString fld0129a = new CobolString(256); // fallback
    private CobolString fld0129c = new CobolString(256); // fallback
    private CobolString fld0130a = new CobolString(256); // fallback
    private CobolString fld0130c = new CobolString(256); // fallback
    private CobolString fld0131a = new CobolString(256); // fallback
    private CobolString fld0131c = new CobolString(256); // fallback
    private CobolString fld0132a = new CobolString(256); // fallback
    private CobolString fld0132c = new CobolString(256); // fallback
    private CobolString fld0133a = new CobolString(256); // fallback
    private CobolString fld0133c = new CobolString(256); // fallback
    private CobolString fld0134a = new CobolString(256); // fallback
    private CobolString fld0134c = new CobolString(256); // fallback
    private CobolString fld0135a = new CobolString(256); // fallback
    private CobolString fld0135c = new CobolString(256); // fallback
    private CobolString fld0136a = new CobolString(256); // fallback
    private CobolString fld0136c = new CobolString(256); // fallback
    private CobolString fld0137a = new CobolString(256); // fallback
    private CobolString fld0137c = new CobolString(256); // fallback
    private CobolString fld0138a = new CobolString(256); // fallback
    private CobolString fld0138c = new CobolString(256); // fallback
    private CobolString fld0139a = new CobolString(256); // fallback
    private CobolString fld0139c = new CobolString(256); // fallback
    private CobolString fld0140a = new CobolString(256); // fallback
    private CobolString fld0140c = new CobolString(256); // fallback
    private CobolString fld0141a = new CobolString(256); // fallback
    private CobolString fld0141c = new CobolString(256); // fallback
    private CobolString fld0142a = new CobolString(256); // fallback
    private CobolString fld0142c = new CobolString(256); // fallback
    private CobolString fld0143a = new CobolString(256); // fallback
    private CobolString fld0143c = new CobolString(256); // fallback
    private CobolString fld0144a = new CobolString(256); // fallback
    private CobolString fld0144c = new CobolString(256); // fallback
    private CobolString fld0145a = new CobolString(256); // fallback
    private CobolString fld0145c = new CobolString(256); // fallback
    private CobolString fld0146a = new CobolString(256); // fallback
    private CobolString fld0146c = new CobolString(256); // fallback
    private CobolString fld0147a = new CobolString(256); // fallback
    private CobolString fld0147c = new CobolString(256); // fallback
    private CobolString fld0148a = new CobolString(256); // fallback
    private CobolString fld0148c = new CobolString(256); // fallback
    private CobolString fld0149a = new CobolString(256); // fallback
    private CobolString fld0149c = new CobolString(256); // fallback
    private CobolString fld0150a = new CobolString(256); // fallback
    private CobolString fld0150c = new CobolString(256); // fallback
    private CobolString fld0151a = new CobolString(256); // fallback
    private CobolString fld0151c = new CobolString(256); // fallback
    private CobolString fld0152a = new CobolString(256); // fallback
    private CobolString fld0152c = new CobolString(256); // fallback
    private CobolString fld0153a = new CobolString(256); // fallback
    private CobolString fld0153c = new CobolString(256); // fallback
    private CobolString fld0154a = new CobolString(256); // fallback
    private CobolString fld0154c = new CobolString(256); // fallback
    private CobolString fld0155a = new CobolString(256); // fallback
    private CobolString fld0155c = new CobolString(256); // fallback
    private CobolString fld0156a = new CobolString(256); // fallback
    private CobolString fld0156c = new CobolString(256); // fallback
    private CobolString fld0157a = new CobolString(256); // fallback
    private CobolString fld0157c = new CobolString(256); // fallback
    private CobolString fld0158a = new CobolString(256); // fallback
    private CobolString fld0158c = new CobolString(256); // fallback
    private CobolString fld0159a = new CobolString(256); // fallback
    private CobolString fld0159c = new CobolString(256); // fallback
    private CobolString fld0160a = new CobolString(256); // fallback
    private CobolString fld0160c = new CobolString(256); // fallback
    private CobolString fld0161a = new CobolString(256); // fallback
    private CobolString fld0161c = new CobolString(256); // fallback
    private CobolString fld0162a = new CobolString(256); // fallback
    private CobolString fld0162c = new CobolString(256); // fallback
    private CobolString fld0163a = new CobolString(256); // fallback
    private CobolString fld0163c = new CobolString(256); // fallback
    private CobolString fld0164a = new CobolString(256); // fallback
    private CobolString fld0164c = new CobolString(256); // fallback
    private CobolString fld0165a = new CobolString(256); // fallback
    private CobolString fld0165c = new CobolString(256); // fallback
    private CobolString fld0166a = new CobolString(256); // fallback
    private CobolString fld0166c = new CobolString(256); // fallback
    private CobolString fld0167a = new CobolString(256); // fallback
    private CobolString fld0167c = new CobolString(256); // fallback
    private CobolString fld0168a = new CobolString(256); // fallback
    private CobolString fld0168c = new CobolString(256); // fallback
    private CobolString fld0169a = new CobolString(256); // fallback
    private CobolString fld0169c = new CobolString(256); // fallback
    private CobolString fld0170a = new CobolString(256); // fallback
    private CobolString fld0170c = new CobolString(256); // fallback
    private CobolString fld0171a = new CobolString(256); // fallback
    private CobolString fld0171c = new CobolString(256); // fallback
    private CobolString fld0172a = new CobolString(256); // fallback
    private CobolString fld0172c = new CobolString(256); // fallback
    private CobolString fld0173a = new CobolString(256); // fallback
    private CobolString fld0173c = new CobolString(256); // fallback
    private CobolString fld0174a = new CobolString(256); // fallback
    private CobolString fld0174c = new CobolString(256); // fallback
    private CobolString fld0175a = new CobolString(256); // fallback
    private CobolString fld0175c = new CobolString(256); // fallback
    private CobolString fld0176a = new CobolString(256); // fallback
    private CobolString fld0176c = new CobolString(256); // fallback
    private CobolString fld0177a = new CobolString(256); // fallback
    private CobolString fld0177c = new CobolString(256); // fallback
    private CobolString fld0178a = new CobolString(256); // fallback
    private CobolString fld0178c = new CobolString(256); // fallback
    private CobolString fld0179a = new CobolString(256); // fallback
    private CobolString fld0179c = new CobolString(256); // fallback
    private CobolString fld0180a = new CobolString(256); // fallback
    private CobolString fld0180c = new CobolString(256); // fallback
    private CobolString fld0181a = new CobolString(256); // fallback
    private CobolString fld0181c = new CobolString(256); // fallback
    private CobolString fld0182a = new CobolString(256); // fallback
    private CobolString fld0182c = new CobolString(256); // fallback
    private CobolString fld0183a = new CobolString(256); // fallback
    private CobolString fld0183c = new CobolString(256); // fallback
    private CobolString fld0184a = new CobolString(256); // fallback
    private CobolString fld0184c = new CobolString(256); // fallback
    private CobolString fld0185a = new CobolString(256); // fallback
    private CobolString fld0185c = new CobolString(256); // fallback
    private CobolString fld0186a = new CobolString(256); // fallback
    private CobolString fld0186c = new CobolString(256); // fallback
    private CobolString fld0187a = new CobolString(256); // fallback
    private CobolString fld0187c = new CobolString(256); // fallback
    private CobolString fld0188a = new CobolString(256); // fallback
    private CobolString fld0188c = new CobolString(256); // fallback
    private CobolString fld0189a = new CobolString(256); // fallback
    private CobolString fld0189c = new CobolString(256); // fallback
    private CobolString fld0190a = new CobolString(256); // fallback
    private CobolString fld0190c = new CobolString(256); // fallback
    private CobolString fld0191a = new CobolString(256); // fallback
    private CobolString fld0191c = new CobolString(256); // fallback
    private CobolString fld0192a = new CobolString(256); // fallback
    private CobolString fld0192c = new CobolString(256); // fallback
    private CobolString fld0193a = new CobolString(256); // fallback
    private CobolString fld0193c = new CobolString(256); // fallback
    private CobolString fld0194a = new CobolString(256); // fallback
    private CobolString fld0194c = new CobolString(256); // fallback
    private CobolString fld0195a = new CobolString(256); // fallback
    private CobolString fld0195c = new CobolString(256); // fallback
    private CobolString fld0196a = new CobolString(256); // fallback
    private CobolString fld0196c = new CobolString(256); // fallback
    private CobolString fld0197a = new CobolString(256); // fallback
    private CobolString fld0197c = new CobolString(256); // fallback
    private CobolString fld0198a = new CobolString(256); // fallback
    private CobolString fld0198c = new CobolString(256); // fallback
    private CobolString fld0199a = new CobolString(256); // fallback
    private CobolString fld0199c = new CobolString(256); // fallback
    private CobolString fld0200a = new CobolString(256); // fallback
    private CobolString fld0200c = new CobolString(256); // fallback
    private CobolString fld0201a = new CobolString(256); // fallback
    private CobolString fld0201c = new CobolString(256); // fallback
    private CobolString fld0202a = new CobolString(256); // fallback
    private CobolString fld0202c = new CobolString(256); // fallback
    private CobolString fld0203a = new CobolString(256); // fallback
    private CobolString fld0203c = new CobolString(256); // fallback
    private CobolString fld0204a = new CobolString(256); // fallback
    private CobolString fld0204c = new CobolString(256); // fallback
    private CobolString fld0205a = new CobolString(256); // fallback
    private CobolString fld0205c = new CobolString(256); // fallback
    private CobolString fld0206a = new CobolString(256); // fallback
    private CobolString fld0206c = new CobolString(256); // fallback
    private CobolString fld0207a = new CobolString(256); // fallback
    private CobolString fld0207c = new CobolString(256); // fallback
    private CobolString fld0208a = new CobolString(256); // fallback
    private CobolString fld0208c = new CobolString(256); // fallback
    private CobolString fld0209a = new CobolString(256); // fallback
    private CobolString fld0209c = new CobolString(256); // fallback
    private CobolString fld0210a = new CobolString(256); // fallback
    private CobolString fld0210c = new CobolString(256); // fallback
    private CobolString fld0211a = new CobolString(256); // fallback
    private CobolString fld0211c = new CobolString(256); // fallback
    private CobolString fld0212a = new CobolString(256); // fallback
    private CobolString fld0212c = new CobolString(256); // fallback
    private CobolString fld0213a = new CobolString(256); // fallback
    private CobolString fld0213c = new CobolString(256); // fallback
    private CobolString fld0214a = new CobolString(256); // fallback
    private CobolString fld0214c = new CobolString(256); // fallback
    private CobolString fld0215a = new CobolString(256); // fallback
    private CobolString fld0215c = new CobolString(256); // fallback
    private CobolString fld0216a = new CobolString(256); // fallback
    private CobolString fld0216c = new CobolString(256); // fallback
    private CobolString fld0217a = new CobolString(256); // fallback
    private CobolString fld0217c = new CobolString(256); // fallback
    private CobolString fld0218a = new CobolString(256); // fallback
    private CobolString fld0218c = new CobolString(256); // fallback
    private CobolString fld0219a = new CobolString(256); // fallback
    private CobolString fld0219c = new CobolString(256); // fallback
    private CobolString fld0220a = new CobolString(256); // fallback
    private CobolString fld0220c = new CobolString(256); // fallback
    private CobolString fld0221a = new CobolString(256); // fallback
    private CobolString fld0221c = new CobolString(256); // fallback
    private CobolString fld0222a = new CobolString(256); // fallback
    private CobolString fld0222c = new CobolString(256); // fallback
    private CobolString fld0223a = new CobolString(256); // fallback
    private CobolString fld0223c = new CobolString(256); // fallback
    private CobolString fld0224a = new CobolString(256); // fallback
    private CobolString fld0224c = new CobolString(256); // fallback
    private CobolString fld0225a = new CobolString(256); // fallback
    private CobolString fld0225c = new CobolString(256); // fallback
    private CobolString fld0226a = new CobolString(256); // fallback
    private CobolString fld0226c = new CobolString(256); // fallback
    private CobolString fld0227a = new CobolString(256); // fallback
    private CobolString fld0227c = new CobolString(256); // fallback
    private CobolString fld0228a = new CobolString(256); // fallback
    private CobolString fld0228c = new CobolString(256); // fallback
    private CobolString fld0229a = new CobolString(256); // fallback
    private CobolString fld0229c = new CobolString(256); // fallback
    private CobolString fld0230a = new CobolString(256); // fallback
    private CobolString fld0230c = new CobolString(256); // fallback
    private CobolString fld0231a = new CobolString(256); // fallback
    private CobolString fld0231c = new CobolString(256); // fallback
    private CobolString fld0232a = new CobolString(256); // fallback
    private CobolString fld0232c = new CobolString(256); // fallback
    private CobolString fld0233a = new CobolString(256); // fallback
    private CobolString fld0233c = new CobolString(256); // fallback
    private CobolString fld0234a = new CobolString(256); // fallback
    private CobolString fld0234c = new CobolString(256); // fallback
    private CobolString fld0235a = new CobolString(256); // fallback
    private CobolString fld0235c = new CobolString(256); // fallback
    private CobolString fld0236a = new CobolString(256); // fallback
    private CobolString fld0236c = new CobolString(256); // fallback
    private CobolString fld0237a = new CobolString(256); // fallback
    private CobolString fld0237c = new CobolString(256); // fallback
    private CobolString fld0238a = new CobolString(256); // fallback
    private CobolString fld0238c = new CobolString(256); // fallback
    private CobolString fld0239a = new CobolString(256); // fallback
    private CobolString fld0239c = new CobolString(256); // fallback
    private CobolString fld0240a = new CobolString(256); // fallback
    private CobolString fld0240c = new CobolString(256); // fallback
    private CobolString fld0241a = new CobolString(256); // fallback
    private CobolString fld0241c = new CobolString(256); // fallback
    private CobolString fld0242a = new CobolString(256); // fallback
    private CobolString fld0242c = new CobolString(256); // fallback
    private CobolString fld0243a = new CobolString(256); // fallback
    private CobolString fld0243c = new CobolString(256); // fallback
    private CobolString fld0244a = new CobolString(256); // fallback
    private CobolString fld0244c = new CobolString(256); // fallback
    private CobolString fld0245a = new CobolString(256); // fallback
    private CobolString fld0245c = new CobolString(256); // fallback
    private CobolString fld0246a = new CobolString(256); // fallback
    private CobolString fld0246c = new CobolString(256); // fallback
    private CobolString fld0247a = new CobolString(256); // fallback
    private CobolString fld0247c = new CobolString(256); // fallback
    private CobolString fld0248a = new CobolString(256); // fallback
    private CobolString fld0248c = new CobolString(256); // fallback
    private CobolString fld0249a = new CobolString(256); // fallback
    private CobolString fld0249c = new CobolString(256); // fallback
    private CobolString fld0250a = new CobolString(256); // fallback
    private CobolString fld0250c = new CobolString(256); // fallback
    private CobolString fld0251a = new CobolString(256); // fallback
    private CobolString fld0251c = new CobolString(256); // fallback
    private CobolString fld0252a = new CobolString(256); // fallback
    private CobolString fld0252c = new CobolString(256); // fallback
    private CobolString fld0253a = new CobolString(256); // fallback
    private CobolString fld0253c = new CobolString(256); // fallback
    private CobolString fld0254a = new CobolString(256); // fallback
    private CobolString fld0254c = new CobolString(256); // fallback
    private CobolString fld0255a = new CobolString(256); // fallback
    private CobolString fld0255c = new CobolString(256); // fallback
    private CobolString fld0256a = new CobolString(256); // fallback
    private CobolString fld0256c = new CobolString(256); // fallback
    private CobolString fld0257a = new CobolString(256); // fallback
    private CobolString fld0257c = new CobolString(256); // fallback
    private CobolString fld0258a = new CobolString(256); // fallback
    private CobolString fld0258c = new CobolString(256); // fallback
    private CobolString fld0259a = new CobolString(256); // fallback
    private CobolString fld0259c = new CobolString(256); // fallback
    private CobolString fld0260a = new CobolString(256); // fallback
    private CobolString fld0260c = new CobolString(256); // fallback
    private CobolString fld0261a = new CobolString(256); // fallback
    private CobolString fld0261c = new CobolString(256); // fallback
    private CobolString fld0262a = new CobolString(256); // fallback
    private CobolString fld0262c = new CobolString(256); // fallback
    private CobolString fld0263a = new CobolString(256); // fallback
    private CobolString fld0263c = new CobolString(256); // fallback
    private CobolString fld0264a = new CobolString(256); // fallback
    private CobolString fld0264c = new CobolString(256); // fallback
    private CobolString fld0265a = new CobolString(256); // fallback
    private CobolString fld0265c = new CobolString(256); // fallback
    private CobolString fld0266a = new CobolString(256); // fallback
    private CobolString fld0266c = new CobolString(256); // fallback
    private CobolString fld0267a = new CobolString(256); // fallback
    private CobolString fld0267c = new CobolString(256); // fallback
    private CobolString fld0268a = new CobolString(256); // fallback
    private CobolString fld0268c = new CobolString(256); // fallback
    private CobolString fld0269a = new CobolString(256); // fallback
    private CobolString fld0269c = new CobolString(256); // fallback
    private CobolString fld0270a = new CobolString(256); // fallback
    private CobolString fld0270c = new CobolString(256); // fallback
    private CobolString fld0271a = new CobolString(256); // fallback
    private CobolString fld0271c = new CobolString(256); // fallback
    private CobolString fld0272a = new CobolString(256); // fallback
    private CobolString fld0272c = new CobolString(256); // fallback
    private CobolString fld0273a = new CobolString(256); // fallback
    private CobolString fld0273c = new CobolString(256); // fallback
    private CobolString fld0274a = new CobolString(256); // fallback
    private CobolString fld0274c = new CobolString(256); // fallback
    private CobolString fld0275a = new CobolString(256); // fallback
    private CobolString fld0275c = new CobolString(256); // fallback
    private CobolString fld0276a = new CobolString(256); // fallback
    private CobolString fld0276c = new CobolString(256); // fallback
    private CobolString fld0277a = new CobolString(256); // fallback
    private CobolString fld0277c = new CobolString(256); // fallback
    private CobolString fld0278a = new CobolString(256); // fallback
    private CobolString fld0278c = new CobolString(256); // fallback
    private CobolString fld0279a = new CobolString(256); // fallback
    private CobolString fld0279c = new CobolString(256); // fallback
    private CobolString fld0280a = new CobolString(256); // fallback
    private CobolString fld0280c = new CobolString(256); // fallback
    private CobolString fld0281a = new CobolString(256); // fallback
    private CobolString fld0281c = new CobolString(256); // fallback
    private CobolString fld0282a = new CobolString(256); // fallback
    private CobolString fld0282c = new CobolString(256); // fallback
    private CobolString fld0283a = new CobolString(256); // fallback
    private CobolString fld0283c = new CobolString(256); // fallback
    private CobolString fld0284a = new CobolString(256); // fallback
    private CobolString fld0284c = new CobolString(256); // fallback
    private CobolString fld0285a = new CobolString(256); // fallback
    private CobolString fld0285c = new CobolString(256); // fallback
    private CobolString fld0286a = new CobolString(256); // fallback
    private CobolString fld0286c = new CobolString(256); // fallback
    private CobolString fld0287a = new CobolString(256); // fallback
    private CobolString fld0287c = new CobolString(256); // fallback
    private CobolString fld0288a = new CobolString(256); // fallback
    private CobolString fld0288c = new CobolString(256); // fallback
    private CobolString fld0289a = new CobolString(256); // fallback
    private CobolString fld0289c = new CobolString(256); // fallback
    private CobolString fld0290a = new CobolString(256); // fallback
    private CobolString fld0290c = new CobolString(256); // fallback
    private CobolString fld0291a = new CobolString(256); // fallback
    private CobolString fld0291c = new CobolString(256); // fallback
    private CobolString fld0292a = new CobolString(256); // fallback
    private CobolString fld0292c = new CobolString(256); // fallback
    private CobolString fld0293a = new CobolString(256); // fallback
    private CobolString fld0293c = new CobolString(256); // fallback
    private CobolString fld0294a = new CobolString(256); // fallback
    private CobolString fld0294c = new CobolString(256); // fallback
    private CobolString fld0295a = new CobolString(256); // fallback
    private CobolString fld0295c = new CobolString(256); // fallback
    private CobolString fld0296a = new CobolString(256); // fallback
    private CobolString fld0296c = new CobolString(256); // fallback
    private CobolString fld0297a = new CobolString(256); // fallback
    private CobolString fld0297c = new CobolString(256); // fallback
    private CobolString fld0298a = new CobolString(256); // fallback
    private CobolString fld0298c = new CobolString(256); // fallback
    private CobolString fld0299a = new CobolString(256); // fallback
    private CobolString fld0299c = new CobolString(256); // fallback
    private CobolString fld0300a = new CobolString(256); // fallback
    private CobolString fld0300c = new CobolString(256); // fallback
    private CobolString fld0301a = new CobolString(256); // fallback
    private CobolString fld0301c = new CobolString(256); // fallback
    private CobolString fld0302a = new CobolString(256); // fallback
    private CobolString fld0302c = new CobolString(256); // fallback
    private CobolString fld0303a = new CobolString(256); // fallback
    private CobolString fld0303c = new CobolString(256); // fallback
    private CobolString fld0304a = new CobolString(256); // fallback
    private CobolString fld0304c = new CobolString(256); // fallback
    private CobolString fld0305a = new CobolString(256); // fallback
    private CobolString fld0305c = new CobolString(256); // fallback
    private CobolString fld0306a = new CobolString(256); // fallback
    private CobolString fld0306c = new CobolString(256); // fallback
    private CobolString fld0307a = new CobolString(256); // fallback
    private CobolString fld0307c = new CobolString(256); // fallback
    private CobolString fld0308a = new CobolString(256); // fallback
    private CobolString fld0308c = new CobolString(256); // fallback
    private CobolString fld0309a = new CobolString(256); // fallback
    private CobolString fld0309c = new CobolString(256); // fallback
    private CobolString fld0310a = new CobolString(256); // fallback
    private CobolString fld0310c = new CobolString(256); // fallback
    private CobolString fld0311a = new CobolString(256); // fallback
    private CobolString fld0311c = new CobolString(256); // fallback
    private CobolString fld0312a = new CobolString(256); // fallback
    private CobolString fld0312c = new CobolString(256); // fallback
    private CobolString fld0313a = new CobolString(256); // fallback
    private CobolString fld0313c = new CobolString(256); // fallback
    private CobolString fld0314a = new CobolString(256); // fallback
    private CobolString fld0314c = new CobolString(256); // fallback
    private CobolString fld0315a = new CobolString(256); // fallback
    private CobolString fld0315c = new CobolString(256); // fallback
    private CobolString fld0316a = new CobolString(256); // fallback
    private CobolString fld0316c = new CobolString(256); // fallback
    private CobolString fld0317a = new CobolString(256); // fallback
    private CobolString fld0317c = new CobolString(256); // fallback
    private CobolString fld0318a = new CobolString(256); // fallback
    private CobolString fld0318c = new CobolString(256); // fallback
    private CobolString fld0319a = new CobolString(256); // fallback
    private CobolString fld0319c = new CobolString(256); // fallback
    private CobolString fld0320a = new CobolString(256); // fallback
    private CobolString fld0320c = new CobolString(256); // fallback
    private CobolString fld0321a = new CobolString(256); // fallback
    private CobolString fld0321c = new CobolString(256); // fallback
    private CobolString fld0322a = new CobolString(256); // fallback
    private CobolString fld0322c = new CobolString(256); // fallback
    private CobolString fld0323a = new CobolString(256); // fallback
    private CobolString fld0323c = new CobolString(256); // fallback
    private CobolString fld0324a = new CobolString(256); // fallback
    private CobolString fld0324c = new CobolString(256); // fallback
    private CobolString fld0325a = new CobolString(256); // fallback
    private CobolString fld0325c = new CobolString(256); // fallback
    private CobolString fld0326a = new CobolString(256); // fallback
    private CobolString fld0326c = new CobolString(256); // fallback
    private CobolString fld0327a = new CobolString(256); // fallback
    private CobolString fld0327c = new CobolString(256); // fallback
    private CobolString fld0328a = new CobolString(256); // fallback
    private CobolString fld0328c = new CobolString(256); // fallback
    private CobolString fld0329a = new CobolString(256); // fallback
    private CobolString fld0329c = new CobolString(256); // fallback
    private CobolString fld0330a = new CobolString(256); // fallback
    private CobolString fld0330c = new CobolString(256); // fallback
    private CobolString fld0331a = new CobolString(256); // fallback
    private CobolString fld0331c = new CobolString(256); // fallback
    private CobolString fld0332a = new CobolString(256); // fallback
    private CobolString fld0332c = new CobolString(256); // fallback
    private CobolString fld0333a = new CobolString(256); // fallback
    private CobolString fld0333c = new CobolString(256); // fallback
    private CobolString fld0334a = new CobolString(256); // fallback
    private CobolString fld0334c = new CobolString(256); // fallback
    private CobolString fld0335a = new CobolString(256); // fallback
    private CobolString fld0335c = new CobolString(256); // fallback
    private CobolString fld0336a = new CobolString(256); // fallback
    private CobolString fld0336c = new CobolString(256); // fallback
    private CobolString fld0337a = new CobolString(256); // fallback
    private CobolString fld0337c = new CobolString(256); // fallback
    private CobolString fld0338a = new CobolString(256); // fallback
    private CobolString fld0338c = new CobolString(256); // fallback
    private CobolString fld0339a = new CobolString(256); // fallback
    private CobolString fld0339c = new CobolString(256); // fallback
    private CobolString fld0340a = new CobolString(256); // fallback
    private CobolString fld0340c = new CobolString(256); // fallback
    private CobolString fld0341a = new CobolString(256); // fallback
    private CobolString fld0341c = new CobolString(256); // fallback
    private CobolString fld0342a = new CobolString(256); // fallback
    private CobolString fld0342c = new CobolString(256); // fallback
    private CobolString fld0343a = new CobolString(256); // fallback
    private CobolString fld0343c = new CobolString(256); // fallback
    private CobolString fld0344a = new CobolString(256); // fallback
    private CobolString fld0344c = new CobolString(256); // fallback
    private CobolString fld0345a = new CobolString(256); // fallback
    private CobolString fld0345c = new CobolString(256); // fallback
    private CobolString fld0346a = new CobolString(256); // fallback
    private CobolString fld0346c = new CobolString(256); // fallback
    private CobolString fld0347a = new CobolString(256); // fallback
    private CobolString fld0347c = new CobolString(256); // fallback
    private CobolString fld0348a = new CobolString(256); // fallback
    private CobolString fld0348c = new CobolString(256); // fallback
    private CobolString fld0349a = new CobolString(256); // fallback
    private CobolString fld0349c = new CobolString(256); // fallback
    private CobolString fld0350a = new CobolString(256); // fallback
    private CobolString fld0350c = new CobolString(256); // fallback
    private CobolString fld0351a = new CobolString(256); // fallback
    private CobolString fld0351c = new CobolString(256); // fallback
    private CobolString fld0352a = new CobolString(256); // fallback
    private CobolString fld0352c = new CobolString(256); // fallback
    private CobolString fld0353a = new CobolString(256); // fallback
    private CobolString fld0353c = new CobolString(256); // fallback
    private CobolString fld0354a = new CobolString(256); // fallback
    private CobolString fld0354c = new CobolString(256); // fallback
    private CobolString fld0355a = new CobolString(256); // fallback
    private CobolString fld0355c = new CobolString(256); // fallback
    private CobolString fld0356a = new CobolString(256); // fallback
    private CobolString fld0356c = new CobolString(256); // fallback
    private CobolString fld0357a = new CobolString(256); // fallback
    private CobolString fld0357c = new CobolString(256); // fallback
    private CobolString fld0358a = new CobolString(256); // fallback
    private CobolString fld0358c = new CobolString(256); // fallback
    private CobolString fld0359a = new CobolString(256); // fallback
    private CobolString fld0359c = new CobolString(256); // fallback
    private CobolString fld0360a = new CobolString(256); // fallback
    private CobolString fld0360c = new CobolString(256); // fallback
    private CobolString fld0361a = new CobolString(256); // fallback
    private CobolString fld0361c = new CobolString(256); // fallback
    private CobolString fld0362a = new CobolString(256); // fallback
    private CobolString fld0362c = new CobolString(256); // fallback
    private CobolString fld0363a = new CobolString(256); // fallback
    private CobolString fld0363c = new CobolString(256); // fallback
    private CobolString fld0364a = new CobolString(256); // fallback
    private CobolString fld0364c = new CobolString(256); // fallback
    private CobolString fld0365a = new CobolString(256); // fallback
    private CobolString fld0365c = new CobolString(256); // fallback
    private CobolString fld0366a = new CobolString(256); // fallback
    private CobolString fld0366c = new CobolString(256); // fallback
    private CobolString fld0367a = new CobolString(256); // fallback
    private CobolString fld0367c = new CobolString(256); // fallback
    private CobolString fld0368a = new CobolString(256); // fallback
    private CobolString fld0368c = new CobolString(256); // fallback
    private CobolString fld0369a = new CobolString(256); // fallback
    private CobolString fld0369c = new CobolString(256); // fallback
    private CobolString fld0370a = new CobolString(256); // fallback
    private CobolString fld0370c = new CobolString(256); // fallback
    private CobolString fld0371a = new CobolString(256); // fallback
    private CobolString fld0371c = new CobolString(256); // fallback
    private CobolString fld0372a = new CobolString(256); // fallback
    private CobolString fld0372c = new CobolString(256); // fallback
    private CobolString fld0373a = new CobolString(256); // fallback
    private CobolString fld0373c = new CobolString(256); // fallback
    private CobolString fld0374a = new CobolString(256); // fallback
    private CobolString fld0374c = new CobolString(256); // fallback
    private CobolString fld0375a = new CobolString(256); // fallback
    private CobolString fld0375c = new CobolString(256); // fallback
    private CobolString fld0376a = new CobolString(256); // fallback
    private CobolString fld0376c = new CobolString(256); // fallback
    private CobolString fld0377a = new CobolString(256); // fallback
    private CobolString fld0377c = new CobolString(256); // fallback
    private CobolString fld0378a = new CobolString(256); // fallback
    private CobolString fld0378c = new CobolString(256); // fallback
    private CobolString fld0379a = new CobolString(256); // fallback
    private CobolString fld0379c = new CobolString(256); // fallback
    private CobolString fld0380a = new CobolString(256); // fallback
    private CobolString fld0380c = new CobolString(256); // fallback
    private CobolString fld0381a = new CobolString(256); // fallback
    private CobolString fld0381c = new CobolString(256); // fallback
    private CobolString fld0382a = new CobolString(256); // fallback
    private CobolString fld0382c = new CobolString(256); // fallback
    private CobolString fld0383a = new CobolString(256); // fallback
    private CobolString fld0383c = new CobolString(256); // fallback
    private CobolString fld0384a = new CobolString(256); // fallback
    private CobolString fld0384c = new CobolString(256); // fallback
    private CobolString fld0385a = new CobolString(256); // fallback
    private CobolString fld0385c = new CobolString(256); // fallback
    private CobolString fld0386a = new CobolString(256); // fallback
    private CobolString fld0386c = new CobolString(256); // fallback
    private CobolString fld0387a = new CobolString(256); // fallback
    private CobolString fld0387c = new CobolString(256); // fallback
    private CobolString fld0388a = new CobolString(256); // fallback
    private CobolString fld0388c = new CobolString(256); // fallback
    private CobolString fld0389a = new CobolString(256); // fallback
    private CobolString fld0389c = new CobolString(256); // fallback
    private CobolString fld0390a = new CobolString(256); // fallback
    private CobolString fld0390c = new CobolString(256); // fallback
    private CobolString fld0391a = new CobolString(256); // fallback
    private CobolString fld0391c = new CobolString(256); // fallback
    private CobolString fld0392a = new CobolString(256); // fallback
    private CobolString fld0392c = new CobolString(256); // fallback
    private CobolString fld0393a = new CobolString(256); // fallback
    private CobolString fld0393c = new CobolString(256); // fallback
    private CobolString fld0394a = new CobolString(256); // fallback
    private CobolString fld0394c = new CobolString(256); // fallback
    private CobolString fld0395a = new CobolString(256); // fallback
    private CobolString fld0395c = new CobolString(256); // fallback
    private CobolString fld0396a = new CobolString(256); // fallback
    private CobolString fld0396c = new CobolString(256); // fallback
    private CobolString fld0397a = new CobolString(256); // fallback
    private CobolString fld0397c = new CobolString(256); // fallback
    private CobolString fld0398a = new CobolString(256); // fallback
    private CobolString fld0398c = new CobolString(256); // fallback
    private CobolString fld0399a = new CobolString(256); // fallback
    private CobolString fld0399c = new CobolString(256); // fallback
    private CobolString fld0400a = new CobolString(256); // fallback
    private CobolString fld0400c = new CobolString(256); // fallback
    private CobolString fld0401a = new CobolString(256); // fallback
    private CobolString fld0401c = new CobolString(256); // fallback
    private CobolString fld0402a = new CobolString(256); // fallback
    private CobolString fld0402c = new CobolString(256); // fallback
    private CobolString fld0403a = new CobolString(256); // fallback
    private CobolString fld0403c = new CobolString(256); // fallback
    private CobolString fld0404a = new CobolString(256); // fallback
    private CobolString fld0404c = new CobolString(256); // fallback
    private CobolString fld0405a = new CobolString(256); // fallback
    private CobolString fld0405c = new CobolString(256); // fallback
    private CobolString fld0406a = new CobolString(256); // fallback
    private CobolString fld0406c = new CobolString(256); // fallback
    private CobolString fld0407a = new CobolString(256); // fallback
    private CobolString fld0407c = new CobolString(256); // fallback
    private CobolString fld0408a = new CobolString(256); // fallback
    private CobolString fld0408c = new CobolString(256); // fallback
    private CobolString fld0409a = new CobolString(256); // fallback
    private CobolString fld0409c = new CobolString(256); // fallback
    private CobolString fld0410a = new CobolString(256); // fallback
    private CobolString fld0410c = new CobolString(256); // fallback
    private CobolString fld0411a = new CobolString(256); // fallback
    private CobolString fld0411c = new CobolString(256); // fallback
    private CobolString fld0412a = new CobolString(256); // fallback
    private CobolString fld0412c = new CobolString(256); // fallback
    private CobolString fld0413a = new CobolString(256); // fallback
    private CobolString fld0413c = new CobolString(256); // fallback
    private CobolString fld0414a = new CobolString(256); // fallback
    private CobolString fld0414c = new CobolString(256); // fallback
    private CobolString fld0415a = new CobolString(256); // fallback
    private CobolString fld0415c = new CobolString(256); // fallback
    private CobolString fld0416a = new CobolString(256); // fallback
    private CobolString fld0416c = new CobolString(256); // fallback
    private CobolString fld0417a = new CobolString(256); // fallback
    private CobolString fld0417c = new CobolString(256); // fallback
    private CobolString fld0418a = new CobolString(256); // fallback
    private CobolString fld0418c = new CobolString(256); // fallback
    private CobolString fld0419a = new CobolString(256); // fallback
    private CobolString fld0419c = new CobolString(256); // fallback
    private CobolString fld0420a = new CobolString(256); // fallback
    private CobolString fld0420c = new CobolString(256); // fallback
    private CobolString fld0421a = new CobolString(256); // fallback
    private CobolString fld0421c = new CobolString(256); // fallback
    private CobolString fld0422a = new CobolString(256); // fallback
    private CobolString fld0422c = new CobolString(256); // fallback
    private CobolString fld0423a = new CobolString(256); // fallback
    private CobolString fld0423c = new CobolString(256); // fallback
    private CobolString fld0424a = new CobolString(256); // fallback
    private CobolString fld0424c = new CobolString(256); // fallback
    private CobolString fld0425a = new CobolString(256); // fallback
    private CobolString fld0425c = new CobolString(256); // fallback
    private CobolString fld0426a = new CobolString(256); // fallback
    private CobolString fld0426c = new CobolString(256); // fallback
    private CobolString fld0427a = new CobolString(256); // fallback
    private CobolString fld0427c = new CobolString(256); // fallback
    private CobolString fld0428a = new CobolString(256); // fallback
    private CobolString fld0428c = new CobolString(256); // fallback
    private CobolString fld0429a = new CobolString(256); // fallback
    private CobolString fld0429c = new CobolString(256); // fallback
    private CobolString fld0430a = new CobolString(256); // fallback
    private CobolString fld0430c = new CobolString(256); // fallback
    private CobolString fld0431a = new CobolString(256); // fallback
    private CobolString fld0431c = new CobolString(256); // fallback
    private CobolString fld0432a = new CobolString(256); // fallback
    private CobolString fld0432c = new CobolString(256); // fallback
    private CobolString fld0433a = new CobolString(256); // fallback
    private CobolString fld0433c = new CobolString(256); // fallback
    private CobolString fld0434a = new CobolString(256); // fallback
    private CobolString fld0434c = new CobolString(256); // fallback
    private CobolString fld0435a = new CobolString(256); // fallback
    private CobolString fld0435c = new CobolString(256); // fallback
    private CobolString fld0436a = new CobolString(256); // fallback
    private CobolString fld0436c = new CobolString(256); // fallback
    private CobolString fld0437a = new CobolString(256); // fallback
    private CobolString fld0437c = new CobolString(256); // fallback
    private CobolString fld0438a = new CobolString(256); // fallback
    private CobolString fld0438c = new CobolString(256); // fallback
    private CobolString fld0439a = new CobolString(256); // fallback
    private CobolString fld0439c = new CobolString(256); // fallback
    private CobolString fld0440a = new CobolString(256); // fallback
    private CobolString fld0440c = new CobolString(256); // fallback
    private CobolString fld0441a = new CobolString(256); // fallback
    private CobolString fld0441c = new CobolString(256); // fallback
    private CobolString fld0442a = new CobolString(256); // fallback
    private CobolString fld0442c = new CobolString(256); // fallback
    private CobolString fld0443a = new CobolString(256); // fallback
    private CobolString fld0443c = new CobolString(256); // fallback
    private CobolString fld0444a = new CobolString(256); // fallback
    private CobolString fld0444c = new CobolString(256); // fallback
    private CobolString fld0445a = new CobolString(256); // fallback
    private CobolString fld0445c = new CobolString(256); // fallback
    private CobolString fld0446a = new CobolString(256); // fallback
    private CobolString fld0446c = new CobolString(256); // fallback
    private CobolString fld0447a = new CobolString(256); // fallback
    private CobolString fld0447c = new CobolString(256); // fallback
    private CobolString fld0448a = new CobolString(256); // fallback
    private CobolString fld0448c = new CobolString(256); // fallback
    private CobolString fld0449a = new CobolString(256); // fallback
    private CobolString fld0449c = new CobolString(256); // fallback
    private CobolString fld0450a = new CobolString(256); // fallback
    private CobolString fld0450c = new CobolString(256); // fallback
    private CobolString fld0451a = new CobolString(256); // fallback
    private CobolString fld0451c = new CobolString(256); // fallback
    private CobolString fld0452a = new CobolString(256); // fallback
    private CobolString fld0452c = new CobolString(256); // fallback
    private CobolString fld0453a = new CobolString(256); // fallback
    private CobolString fld0453c = new CobolString(256); // fallback
    private CobolString fld0454a = new CobolString(256); // fallback
    private CobolString fld0454c = new CobolString(256); // fallback
    private CobolString fld0455a = new CobolString(256); // fallback
    private CobolString fld0455c = new CobolString(256); // fallback
    private CobolString fld0456a = new CobolString(256); // fallback
    private CobolString fld0456c = new CobolString(256); // fallback
    private CobolString fld0457a = new CobolString(256); // fallback
    private CobolString fld0457c = new CobolString(256); // fallback
    private CobolString fld0458a = new CobolString(256); // fallback
    private CobolString fld0458c = new CobolString(256); // fallback
    private CobolString fld0459a = new CobolString(256); // fallback
    private CobolString fld0459c = new CobolString(256); // fallback
    private CobolString fld0460a = new CobolString(256); // fallback
    private CobolString fld0460c = new CobolString(256); // fallback
    private CobolString fld0461a = new CobolString(256); // fallback
    private CobolString fld0461c = new CobolString(256); // fallback
    private CobolString fld0462a = new CobolString(256); // fallback
    private CobolString fld0462c = new CobolString(256); // fallback
    private CobolString fld0463a = new CobolString(256); // fallback
    private CobolString fld0463c = new CobolString(256); // fallback
    private CobolString fld0464a = new CobolString(256); // fallback
    private CobolString fld0464c = new CobolString(256); // fallback
    private CobolString fld0465a = new CobolString(256); // fallback
    private CobolString fld0465c = new CobolString(256); // fallback
    private CobolString fld0466a = new CobolString(256); // fallback
    private CobolString fld0466c = new CobolString(256); // fallback
    private CobolString fld0467a = new CobolString(256); // fallback
    private CobolString fld0467c = new CobolString(256); // fallback
    private CobolString fld0468a = new CobolString(256); // fallback
    private CobolString fld0468c = new CobolString(256); // fallback
    private CobolString fld0469a = new CobolString(256); // fallback
    private CobolString fld0469c = new CobolString(256); // fallback
    private CobolString fld0470a = new CobolString(256); // fallback
    private CobolString fld0470c = new CobolString(256); // fallback
    private CobolString fld0471a = new CobolString(256); // fallback
    private CobolString fld0471c = new CobolString(256); // fallback
    private CobolString fld0472a = new CobolString(256); // fallback
    private CobolString fld0472c = new CobolString(256); // fallback
    private CobolString fld0473a = new CobolString(256); // fallback
    private CobolString fld0473c = new CobolString(256); // fallback
    private CobolString fld0474a = new CobolString(256); // fallback
    private CobolString fld0474c = new CobolString(256); // fallback
    private CobolString fld0475a = new CobolString(256); // fallback
    private CobolString fld0475c = new CobolString(256); // fallback
    private CobolString fld0476a = new CobolString(256); // fallback
    private CobolString fld0476c = new CobolString(256); // fallback
    private CobolString fld0477a = new CobolString(256); // fallback
    private CobolString fld0477c = new CobolString(256); // fallback
    private CobolString fld0478a = new CobolString(256); // fallback
    private CobolString fld0478c = new CobolString(256); // fallback
    private CobolString fld0479a = new CobolString(256); // fallback
    private CobolString fld0479c = new CobolString(256); // fallback
    private CobolString fld0480a = new CobolString(256); // fallback
    private CobolString fld0480c = new CobolString(256); // fallback
    private CobolString fld0481a = new CobolString(256); // fallback
    private CobolString fld0481c = new CobolString(256); // fallback
    private CobolString fld0482a = new CobolString(256); // fallback
    private CobolString fld0482c = new CobolString(256); // fallback
    private CobolString fld0483a = new CobolString(256); // fallback
    private CobolString fld0483c = new CobolString(256); // fallback
    private CobolString fld0484a = new CobolString(256); // fallback
    private CobolString fld0484c = new CobolString(256); // fallback
    private CobolString fld0485a = new CobolString(256); // fallback
    private CobolString fld0485c = new CobolString(256); // fallback
    private CobolString fld0486a = new CobolString(256); // fallback
    private CobolString fld0486c = new CobolString(256); // fallback
    private CobolString fld0487a = new CobolString(256); // fallback
    private CobolString fld0487c = new CobolString(256); // fallback
    private CobolString fld0488a = new CobolString(256); // fallback
    private CobolString fld0488c = new CobolString(256); // fallback
    private CobolString fld0489a = new CobolString(256); // fallback
    private CobolString fld0489c = new CobolString(256); // fallback
    private CobolString fld0490a = new CobolString(256); // fallback
    private CobolString fld0490c = new CobolString(256); // fallback
    private CobolString fld0491a = new CobolString(256); // fallback
    private CobolString fld0491c = new CobolString(256); // fallback
    private CobolString fld0492a = new CobolString(256); // fallback
    private CobolString fld0492c = new CobolString(256); // fallback
    private CobolString fld0493a = new CobolString(256); // fallback
    private CobolString fld0493c = new CobolString(256); // fallback
    private CobolString fld0494a = new CobolString(256); // fallback
    private CobolString fld0494c = new CobolString(256); // fallback
    private CobolString fld0495a = new CobolString(256); // fallback
    private CobolString fld0495c = new CobolString(256); // fallback
    private CobolString fld0496a = new CobolString(256); // fallback
    private CobolString fld0496c = new CobolString(256); // fallback
    private CobolString fld0497a = new CobolString(256); // fallback
    private CobolString fld0497c = new CobolString(256); // fallback
    private CobolString fld0498a = new CobolString(256); // fallback
    private CobolString fld0498c = new CobolString(256); // fallback
    private CobolString fld0499a = new CobolString(256); // fallback
    private CobolString fld0499c = new CobolString(256); // fallback
    private CobolString xpc_fld0001c = new CobolString(256); // fallback
    private CobolString[] hex_of = new CobolString[100]; // fallback array
    private CobolString xpc_fld0002c = new CobolString(256); // fallback
    private CobolString xpc_fld0003c = new CobolString(256); // fallback
    private CobolString xpc_fld0004c = new CobolString(256); // fallback
    private CobolString xpc_fld0005c = new CobolString(256); // fallback
    private CobolString xpc_fld0006c = new CobolString(256); // fallback
    private CobolString xpc_fld0007c = new CobolString(256); // fallback
    private CobolString xpc_fld0008c = new CobolString(256); // fallback
    private CobolString xpc_fld0009c = new CobolString(256); // fallback
    private CobolString xpc_fld0010c = new CobolString(256); // fallback
    private CobolString xpc_fld0011c = new CobolString(256); // fallback
    private CobolString xpc_fld0012c = new CobolString(256); // fallback
    private CobolString xpc_fld0013c = new CobolString(256); // fallback
    private CobolString xpc_fld0014c = new CobolString(256); // fallback
    private CobolString xpc_fld0015c = new CobolString(256); // fallback
    private CobolString xpc_fld0016c = new CobolString(256); // fallback
    private CobolString xpc_fld0017c = new CobolString(256); // fallback
    private CobolString xpc_fld0018c = new CobolString(256); // fallback
    private CobolString xpc_fld0019c = new CobolString(256); // fallback
    private CobolString xpc_fld0020c = new CobolString(256); // fallback
    private CobolString xpc_fld0021c = new CobolString(256); // fallback
    private CobolString xpc_fld0022c = new CobolString(256); // fallback
    private CobolString xpc_fld0023c = new CobolString(256); // fallback
    private CobolString xpc_fld0024c = new CobolString(256); // fallback
    private CobolString xpc_fld0025c = new CobolString(256); // fallback
    private CobolString xpc_fld0026c = new CobolString(256); // fallback
    private CobolString xpc_fld0027c = new CobolString(256); // fallback
    private CobolString xpc_fld0028c = new CobolString(256); // fallback
    private CobolString xpc_fld0029c = new CobolString(256); // fallback
    private CobolString xpc_fld0030c = new CobolString(256); // fallback
    private CobolString xpc_fld0031c = new CobolString(256); // fallback
    private CobolString xpc_fld0032c = new CobolString(256); // fallback
    private CobolString xpc_fld0033c = new CobolString(256); // fallback
    private CobolString xpc_fld0034c = new CobolString(256); // fallback
    private CobolString xpc_fld0035c = new CobolString(256); // fallback
    private CobolString xpc_fld0036c = new CobolString(256); // fallback
    private CobolString xpc_fld0037c = new CobolString(256); // fallback
    private CobolString xpc_fld0038c = new CobolString(256); // fallback
    private CobolString xpc_fld0039c = new CobolString(256); // fallback
    private CobolString xpc_fld0040c = new CobolString(256); // fallback
    private CobolString xpc_fld0041c = new CobolString(256); // fallback
    private CobolString xpc_fld0042c = new CobolString(256); // fallback
    private CobolString xpc_fld0043c = new CobolString(256); // fallback
    private CobolString xpc_fld0044c = new CobolString(256); // fallback
    private CobolString xpc_fld0045c = new CobolString(256); // fallback
    private CobolString xpc_fld0046c = new CobolString(256); // fallback
    private CobolString xpc_fld0047c = new CobolString(256); // fallback
    private CobolString xpc_fld0048c = new CobolString(256); // fallback
    private CobolString xpc_fld0049c = new CobolString(256); // fallback
    private CobolString xpc_fld0050c = new CobolString(256); // fallback
    private CobolString xpc_fld0051c = new CobolString(256); // fallback
    private CobolString xpc_fld0052c = new CobolString(256); // fallback
    private CobolString xpc_fld0053c = new CobolString(256); // fallback
    private CobolString xpc_fld0054c = new CobolString(256); // fallback
    private CobolString xpc_fld0055c = new CobolString(256); // fallback
    private CobolString xpc_fld0056c = new CobolString(256); // fallback
    private CobolString xpc_fld0057c = new CobolString(256); // fallback
    private CobolString xpc_fld0058c = new CobolString(256); // fallback
    private CobolString xpc_fld0059c = new CobolString(256); // fallback
    private CobolString xpc_fld0060c = new CobolString(256); // fallback
    private CobolString xpc_fld0061c = new CobolString(256); // fallback
    private CobolString xpc_fld0062c = new CobolString(256); // fallback
    private CobolString xpc_fld0063c = new CobolString(256); // fallback
    private CobolString xpc_fld0064c = new CobolString(256); // fallback
    private CobolString xpc_fld0065c = new CobolString(256); // fallback
    private CobolString xpc_fld0066c = new CobolString(256); // fallback
    private CobolString xpc_fld0067c = new CobolString(256); // fallback
    private CobolString xpc_fld0068c = new CobolString(256); // fallback
    private CobolString xpc_fld0069c = new CobolString(256); // fallback
    private CobolString xpc_fld0070c = new CobolString(256); // fallback
    private CobolString xpc_fld0071c = new CobolString(256); // fallback
    private CobolString xpc_fld0072c = new CobolString(256); // fallback
    private CobolString xpc_fld0073c = new CobolString(256); // fallback
    private CobolString xpc_fld0074c = new CobolString(256); // fallback
    private CobolString xpc_fld0075c = new CobolString(256); // fallback
    private CobolString xpc_fld0076c = new CobolString(256); // fallback
    private CobolString xpc_fld0077c = new CobolString(256); // fallback
    private CobolString xpc_fld0078c = new CobolString(256); // fallback
    private CobolString xpc_fld0079c = new CobolString(256); // fallback
    private CobolString xpc_fld0080c = new CobolString(256); // fallback
    private CobolString xpc_fld0081c = new CobolString(256); // fallback
    private CobolString xpc_fld0082c = new CobolString(256); // fallback
    private CobolString xpc_fld0083c = new CobolString(256); // fallback
    private CobolString xpc_fld0084c = new CobolString(256); // fallback
    private CobolString xpc_fld0085c = new CobolString(256); // fallback
    private CobolString xpc_fld0086c = new CobolString(256); // fallback
    private CobolString xpc_fld0087c = new CobolString(256); // fallback
    private CobolString xpc_fld0088c = new CobolString(256); // fallback
    private CobolString xpc_fld0089c = new CobolString(256); // fallback
    private CobolString xpc_fld0090c = new CobolString(256); // fallback
    private CobolString xpc_fld0091c = new CobolString(256); // fallback
    private CobolString xpc_fld0092c = new CobolString(256); // fallback
    private CobolString xpc_fld0093c = new CobolString(256); // fallback
    private CobolString xpc_fld0094c = new CobolString(256); // fallback
    private CobolString xpc_fld0095c = new CobolString(256); // fallback
    private CobolString xpc_fld0096c = new CobolString(256); // fallback
    private CobolString xpc_fld0097c = new CobolString(256); // fallback
    private CobolString xpc_fld0098c = new CobolString(256); // fallback
    private CobolString xpc_fld0099c = new CobolString(256); // fallback
    private CobolString xpc_fld0100c = new CobolString(256); // fallback
    private CobolString xpc_fld0101c = new CobolString(256); // fallback
    private CobolString xpc_fld0102c = new CobolString(256); // fallback
    private CobolString xpc_fld0103c = new CobolString(256); // fallback
    private CobolString xpc_fld0104c = new CobolString(256); // fallback
    private CobolString xpc_fld0105c = new CobolString(256); // fallback
    private CobolString xpc_fld0106c = new CobolString(256); // fallback
    private CobolString xpc_fld0107c = new CobolString(256); // fallback
    private CobolString xpc_fld0108c = new CobolString(256); // fallback
    private CobolString xpc_fld0109c = new CobolString(256); // fallback
    private CobolString xpc_fld0110c = new CobolString(256); // fallback
    private CobolString xpc_fld0111c = new CobolString(256); // fallback
    private CobolString xpc_fld0112c = new CobolString(256); // fallback
    private CobolString xpc_fld0113c = new CobolString(256); // fallback
    private CobolString xpc_fld0114c = new CobolString(256); // fallback
    private CobolString xpc_fld0115c = new CobolString(256); // fallback
    private CobolString xpc_fld0116c = new CobolString(256); // fallback
    private CobolString xpc_fld0117c = new CobolString(256); // fallback
    private CobolString xpc_fld0118c = new CobolString(256); // fallback
    private CobolString xpc_fld0119c = new CobolString(256); // fallback
    private CobolString xpc_fld0120c = new CobolString(256); // fallback
    private CobolString xpc_fld0121c = new CobolString(256); // fallback
    private CobolString xpc_fld0122c = new CobolString(256); // fallback
    private CobolString xpc_fld0123c = new CobolString(256); // fallback
    private CobolString xpc_fld0124c = new CobolString(256); // fallback
    private CobolString xpc_fld0125c = new CobolString(256); // fallback
    private CobolString xpc_fld0126c = new CobolString(256); // fallback
    private CobolString xpc_fld0127c = new CobolString(256); // fallback
    private CobolString xpc_fld0128c = new CobolString(256); // fallback
    private CobolString xpc_fld0129c = new CobolString(256); // fallback
    private CobolString xpc_fld0130c = new CobolString(256); // fallback
    private CobolString xpc_fld0131c = new CobolString(256); // fallback
    private CobolString xpc_fld0132c = new CobolString(256); // fallback
    private CobolString xpc_fld0133c = new CobolString(256); // fallback
    private CobolString xpc_fld0134c = new CobolString(256); // fallback
    private CobolString xpc_fld0135c = new CobolString(256); // fallback
    private CobolString xpc_fld0136c = new CobolString(256); // fallback
    private CobolString xpc_fld0137c = new CobolString(256); // fallback
    private CobolString xpc_fld0138c = new CobolString(256); // fallback
    private CobolString xpc_fld0139c = new CobolString(256); // fallback
    private CobolString xpc_fld0140c = new CobolString(256); // fallback
    private CobolString xpc_fld0141c = new CobolString(256); // fallback
    private CobolString xpc_fld0142c = new CobolString(256); // fallback
    private CobolString xpc_fld0143c = new CobolString(256); // fallback
    private CobolString xpc_fld0144c = new CobolString(256); // fallback
    private CobolString xpc_fld0145c = new CobolString(256); // fallback
    private CobolString xpc_fld0146c = new CobolString(256); // fallback
    private CobolString xpc_fld0147c = new CobolString(256); // fallback
    private CobolString xpc_fld0148c = new CobolString(256); // fallback
    private CobolString xpc_fld0149c = new CobolString(256); // fallback
    private CobolString xpc_fld0150c = new CobolString(256); // fallback
    private CobolString xpc_fld0151c = new CobolString(256); // fallback
    private CobolString xpc_fld0152c = new CobolString(256); // fallback
    private CobolString xpc_fld0153c = new CobolString(256); // fallback
    private CobolString xpc_fld0154c = new CobolString(256); // fallback
    private CobolString xpc_fld0155c = new CobolString(256); // fallback
    private CobolString xpc_fld0156c = new CobolString(256); // fallback
    private CobolString xpc_fld0157c = new CobolString(256); // fallback
    private CobolString xpc_fld0158c = new CobolString(256); // fallback
    private CobolString xpc_fld0159c = new CobolString(256); // fallback
    private CobolString xpc_fld0160c = new CobolString(256); // fallback
    private CobolString xpc_fld0161c = new CobolString(256); // fallback
    private CobolString xpc_fld0162c = new CobolString(256); // fallback
    private CobolString xpc_fld0163c = new CobolString(256); // fallback
    private CobolString xpc_fld0164c = new CobolString(256); // fallback
    private CobolString xpc_fld0165c = new CobolString(256); // fallback
    private CobolString xpc_fld0166c = new CobolString(256); // fallback
    private CobolString xpc_fld0167c = new CobolString(256); // fallback
    private CobolString xpc_fld0168c = new CobolString(256); // fallback
    private CobolString xpc_fld0169c = new CobolString(256); // fallback
    private CobolString xpc_fld0170c = new CobolString(256); // fallback
    private CobolString xpc_fld0171c = new CobolString(256); // fallback
    private CobolString xpc_fld0172c = new CobolString(256); // fallback
    private CobolString xpc_fld0173c = new CobolString(256); // fallback
    private CobolString xpc_fld0174c = new CobolString(256); // fallback
    private CobolString xpc_fld0175c = new CobolString(256); // fallback
    private CobolString xpc_fld0176c = new CobolString(256); // fallback
    private CobolString xpc_fld0177c = new CobolString(256); // fallback
    private CobolString xpc_fld0178c = new CobolString(256); // fallback
    private CobolString xpc_fld0179c = new CobolString(256); // fallback
    private CobolString xpc_fld0180c = new CobolString(256); // fallback
    private CobolString xpc_fld0181c = new CobolString(256); // fallback
    private CobolString xpc_fld0182c = new CobolString(256); // fallback
    private CobolString xpc_fld0183c = new CobolString(256); // fallback
    private CobolString xpc_fld0184c = new CobolString(256); // fallback
    private CobolString xpc_fld0185c = new CobolString(256); // fallback
    private CobolString xpc_fld0186c = new CobolString(256); // fallback
    private CobolString xpc_fld0187c = new CobolString(256); // fallback
    private CobolString xpc_fld0188c = new CobolString(256); // fallback
    private CobolString xpc_fld0189c = new CobolString(256); // fallback
    private CobolString xpc_fld0190c = new CobolString(256); // fallback
    private CobolString xpc_fld0191c = new CobolString(256); // fallback
    private CobolString xpc_fld0192c = new CobolString(256); // fallback
    private CobolString xpc_fld0193c = new CobolString(256); // fallback
    private CobolString xpc_fld0194c = new CobolString(256); // fallback
    private CobolString xpc_fld0195c = new CobolString(256); // fallback
    private CobolString xpc_fld0196c = new CobolString(256); // fallback
    private CobolString xpc_fld0197c = new CobolString(256); // fallback
    private CobolString xpc_fld0198c = new CobolString(256); // fallback
    private CobolString xpc_fld0199c = new CobolString(256); // fallback
    private CobolString xpc_fld0200c = new CobolString(256); // fallback
    private CobolString xpc_fld0201c = new CobolString(256); // fallback
    private CobolString xpc_fld0202c = new CobolString(256); // fallback
    private CobolString xpc_fld0203c = new CobolString(256); // fallback
    private CobolString xpc_fld0204c = new CobolString(256); // fallback
    private CobolString xpc_fld0205c = new CobolString(256); // fallback
    private CobolString xpc_fld0206c = new CobolString(256); // fallback
    private CobolString xpc_fld0207c = new CobolString(256); // fallback
    private CobolString xpc_fld0208c = new CobolString(256); // fallback
    private CobolString xpc_fld0209c = new CobolString(256); // fallback
    private CobolString xpc_fld0210c = new CobolString(256); // fallback
    private CobolString xpc_fld0211c = new CobolString(256); // fallback
    private CobolString xpc_fld0212c = new CobolString(256); // fallback
    private CobolString xpc_fld0213c = new CobolString(256); // fallback
    private CobolString xpc_fld0214c = new CobolString(256); // fallback
    private CobolString xpc_fld0215c = new CobolString(256); // fallback
    private CobolString xpc_fld0216c = new CobolString(256); // fallback
    private CobolString xpc_fld0217c = new CobolString(256); // fallback
    private CobolString xpc_fld0218c = new CobolString(256); // fallback
    private CobolString xpc_fld0219c = new CobolString(256); // fallback
    private CobolString xpc_fld0220c = new CobolString(256); // fallback
    private CobolString xpc_fld0221c = new CobolString(256); // fallback
    private CobolString xpc_fld0222c = new CobolString(256); // fallback
    private CobolString xpc_fld0223c = new CobolString(256); // fallback
    private CobolString xpc_fld0224c = new CobolString(256); // fallback
    private CobolString xpc_fld0225c = new CobolString(256); // fallback
    private CobolString xpc_fld0226c = new CobolString(256); // fallback
    private CobolString xpc_fld0227c = new CobolString(256); // fallback
    private CobolString xpc_fld0228c = new CobolString(256); // fallback
    private CobolString xpc_fld0229c = new CobolString(256); // fallback
    private CobolString xpc_fld0230c = new CobolString(256); // fallback
    private CobolString xpc_fld0231c = new CobolString(256); // fallback
    private CobolString xpc_fld0232c = new CobolString(256); // fallback
    private CobolString xpc_fld0233c = new CobolString(256); // fallback
    private CobolString xpc_fld0234c = new CobolString(256); // fallback
    private CobolString xpc_fld0235c = new CobolString(256); // fallback
    private CobolString xpc_fld0236c = new CobolString(256); // fallback
    private CobolString xpc_fld0237c = new CobolString(256); // fallback
    private CobolString xpc_fld0238c = new CobolString(256); // fallback
    private CobolString xpc_fld0239c = new CobolString(256); // fallback
    private CobolString xpc_fld0240c = new CobolString(256); // fallback
    private CobolString xpc_fld0241c = new CobolString(256); // fallback
    private CobolString xpc_fld0242c = new CobolString(256); // fallback
    private CobolString xpc_fld0243c = new CobolString(256); // fallback
    private CobolString xpc_fld0244c = new CobolString(256); // fallback
    private CobolString xpc_fld0245c = new CobolString(256); // fallback
    private CobolString xpc_fld0246c = new CobolString(256); // fallback
    private CobolString xpc_fld0247c = new CobolString(256); // fallback
    private CobolString xpc_fld0248c = new CobolString(256); // fallback
    private CobolString xpc_fld0249c = new CobolString(256); // fallback
    private CobolString xpc_fld0250c = new CobolString(256); // fallback
    private CobolString xpc_fld0251c = new CobolString(256); // fallback
    private CobolString xpc_fld0252c = new CobolString(256); // fallback
    private CobolString xpc_fld0253c = new CobolString(256); // fallback
    private CobolString xpc_fld0254c = new CobolString(256); // fallback
    private CobolString xpc_fld0255c = new CobolString(256); // fallback
    private CobolString xpc_fld0256c = new CobolString(256); // fallback
    private CobolString xpc_fld0257c = new CobolString(256); // fallback
    private CobolString xpc_fld0258c = new CobolString(256); // fallback
    private CobolString xpc_fld0259c = new CobolString(256); // fallback
    private CobolString xpc_fld0260c = new CobolString(256); // fallback
    private CobolString xpc_fld0261c = new CobolString(256); // fallback
    private CobolString xpc_fld0262c = new CobolString(256); // fallback
    private CobolString xpc_fld0263c = new CobolString(256); // fallback
    private CobolString xpc_fld0264c = new CobolString(256); // fallback
    private CobolString xpc_fld0265c = new CobolString(256); // fallback
    private CobolString xpc_fld0266c = new CobolString(256); // fallback
    private CobolString xpc_fld0267c = new CobolString(256); // fallback
    private CobolString xpc_fld0268c = new CobolString(256); // fallback
    private CobolString xpc_fld0269c = new CobolString(256); // fallback
    private CobolString xpc_fld0270c = new CobolString(256); // fallback
    private CobolString xpc_fld0271c = new CobolString(256); // fallback
    private CobolString xpc_fld0272c = new CobolString(256); // fallback
    private CobolString xpc_fld0273c = new CobolString(256); // fallback
    private CobolString xpc_fld0274c = new CobolString(256); // fallback
    private CobolString xpc_fld0275c = new CobolString(256); // fallback
    private CobolString xpc_fld0276c = new CobolString(256); // fallback
    private CobolString xpc_fld0277c = new CobolString(256); // fallback
    private CobolString xpc_fld0278c = new CobolString(256); // fallback
    private CobolString xpc_fld0279c = new CobolString(256); // fallback
    private CobolString xpc_fld0280c = new CobolString(256); // fallback
    private CobolString xpc_fld0281c = new CobolString(256); // fallback
    private CobolString xpc_fld0282c = new CobolString(256); // fallback
    private CobolString xpc_fld0283c = new CobolString(256); // fallback
    private CobolString xpc_fld0284c = new CobolString(256); // fallback
    private CobolString xpc_fld0285c = new CobolString(256); // fallback
    private CobolString xpc_fld0286c = new CobolString(256); // fallback
    private CobolString xpc_fld0287c = new CobolString(256); // fallback
    private CobolString xpc_fld0288c = new CobolString(256); // fallback
    private CobolString xpc_fld0289c = new CobolString(256); // fallback
    private CobolString xpc_fld0290c = new CobolString(256); // fallback
    private CobolString xpc_fld0291c = new CobolString(256); // fallback
    private CobolString xpc_fld0292c = new CobolString(256); // fallback
    private CobolString xpc_fld0293c = new CobolString(256); // fallback
    private CobolString xpc_fld0294c = new CobolString(256); // fallback
    private CobolString xpc_fld0295c = new CobolString(256); // fallback
    private CobolString xpc_fld0296c = new CobolString(256); // fallback
    private CobolString xpc_fld0297c = new CobolString(256); // fallback
    private CobolString xpc_fld0298c = new CobolString(256); // fallback
    private CobolString xpc_fld0299c = new CobolString(256); // fallback
    private CobolString xpc_fld0300c = new CobolString(256); // fallback
    private CobolString xpc_fld0301c = new CobolString(256); // fallback
    private CobolString xpc_fld0302c = new CobolString(256); // fallback
    private CobolString xpc_fld0303c = new CobolString(256); // fallback
    private CobolString xpc_fld0304c = new CobolString(256); // fallback
    private CobolString xpc_fld0305c = new CobolString(256); // fallback
    private CobolString xpc_fld0306c = new CobolString(256); // fallback
    private CobolString xpc_fld0307c = new CobolString(256); // fallback
    private CobolString xpc_fld0308c = new CobolString(256); // fallback
    private CobolString xpc_fld0309c = new CobolString(256); // fallback
    private CobolString xpc_fld0310c = new CobolString(256); // fallback
    private CobolString xpc_fld0311c = new CobolString(256); // fallback
    private CobolString xpc_fld0312c = new CobolString(256); // fallback
    private CobolString xpc_fld0313c = new CobolString(256); // fallback
    private CobolString xpc_fld0314c = new CobolString(256); // fallback
    private CobolString xpc_fld0315c = new CobolString(256); // fallback
    private CobolString xpc_fld0316c = new CobolString(256); // fallback
    private CobolString xpc_fld0317c = new CobolString(256); // fallback
    private CobolString xpc_fld0318c = new CobolString(256); // fallback
    private CobolString xpc_fld0319c = new CobolString(256); // fallback
    private CobolString xpc_fld0320c = new CobolString(256); // fallback
    private CobolString xpc_fld0321c = new CobolString(256); // fallback
    private CobolString xpc_fld0322c = new CobolString(256); // fallback
    private CobolString xpc_fld0323c = new CobolString(256); // fallback
    private CobolString xpc_fld0324c = new CobolString(256); // fallback
    private CobolString xpc_fld0325c = new CobolString(256); // fallback
    private CobolString xpc_fld0326c = new CobolString(256); // fallback
    private CobolString xpc_fld0327c = new CobolString(256); // fallback
    private CobolString xpc_fld0328c = new CobolString(256); // fallback
    private CobolString xpc_fld0329c = new CobolString(256); // fallback
    private CobolString xpc_fld0330c = new CobolString(256); // fallback
    private CobolString xpc_fld0331c = new CobolString(256); // fallback
    private CobolString xpc_fld0332c = new CobolString(256); // fallback
    private CobolString xpc_fld0333c = new CobolString(256); // fallback
    private CobolString xpc_fld0334c = new CobolString(256); // fallback
    private CobolString xpc_fld0335c = new CobolString(256); // fallback
    private CobolString xpc_fld0336c = new CobolString(256); // fallback
    private CobolString xpc_fld0337c = new CobolString(256); // fallback
    private CobolString xpc_fld0338c = new CobolString(256); // fallback
    private CobolString xpc_fld0339c = new CobolString(256); // fallback
    private CobolString xpc_fld0340c = new CobolString(256); // fallback
    private CobolString xpc_fld0341c = new CobolString(256); // fallback
    private CobolString xpc_fld0342c = new CobolString(256); // fallback
    private CobolString xpc_fld0343c = new CobolString(256); // fallback
    private CobolString xpc_fld0344c = new CobolString(256); // fallback
    private CobolString xpc_fld0345c = new CobolString(256); // fallback
    private CobolString xpc_fld0346c = new CobolString(256); // fallback
    private CobolString xpc_fld0347c = new CobolString(256); // fallback
    private CobolString xpc_fld0348c = new CobolString(256); // fallback
    private CobolString xpc_fld0349c = new CobolString(256); // fallback
    private CobolString xpc_fld0350c = new CobolString(256); // fallback
    private CobolString xpc_fld0351c = new CobolString(256); // fallback
    private CobolString xpc_fld0352c = new CobolString(256); // fallback
    private CobolString xpc_fld0353c = new CobolString(256); // fallback
    private CobolString xpc_fld0354c = new CobolString(256); // fallback
    private CobolString xpc_fld0355c = new CobolString(256); // fallback
    private CobolString xpc_fld0356c = new CobolString(256); // fallback
    private CobolString xpc_fld0357c = new CobolString(256); // fallback
    private CobolString xpc_fld0358c = new CobolString(256); // fallback
    private CobolString xpc_fld0359c = new CobolString(256); // fallback
    private CobolString xpc_fld0360c = new CobolString(256); // fallback
    private CobolString xpc_fld0361c = new CobolString(256); // fallback
    private CobolString xpc_fld0362c = new CobolString(256); // fallback
    private CobolString xpc_fld0363c = new CobolString(256); // fallback
    private CobolString xpc_fld0364c = new CobolString(256); // fallback
    private CobolString xpc_fld0365c = new CobolString(256); // fallback
    private CobolString xpc_fld0366c = new CobolString(256); // fallback
    private CobolString xpc_fld0367c = new CobolString(256); // fallback
    private CobolString xpc_fld0368c = new CobolString(256); // fallback
    private CobolString xpc_fld0369c = new CobolString(256); // fallback
    private CobolString xpc_fld0370c = new CobolString(256); // fallback
    private CobolString xpc_fld0371c = new CobolString(256); // fallback
    private CobolString xpc_fld0372c = new CobolString(256); // fallback
    private CobolString xpc_fld0373c = new CobolString(256); // fallback
    private CobolString xpc_fld0374c = new CobolString(256); // fallback
    private CobolString xpc_fld0375c = new CobolString(256); // fallback
    private CobolString xpc_fld0376c = new CobolString(256); // fallback
    private CobolString xpc_fld0377c = new CobolString(256); // fallback
    private CobolString xpc_fld0378c = new CobolString(256); // fallback
    private CobolString xpc_fld0379c = new CobolString(256); // fallback
    private CobolString xpc_fld0380c = new CobolString(256); // fallback
    private CobolString xpc_fld0381c = new CobolString(256); // fallback
    private CobolString xpc_fld0382c = new CobolString(256); // fallback
    private CobolString xpc_fld0383c = new CobolString(256); // fallback
    private CobolString xpc_fld0384c = new CobolString(256); // fallback
    private CobolString xpc_fld0385c = new CobolString(256); // fallback
    private CobolString xpc_fld0386c = new CobolString(256); // fallback
    private CobolString xpc_fld0387c = new CobolString(256); // fallback
    private CobolString xpc_fld0388c = new CobolString(256); // fallback
    private CobolString xpc_fld0389c = new CobolString(256); // fallback
    private CobolString xpc_fld0390c = new CobolString(256); // fallback
    private CobolString xpc_fld0391c = new CobolString(256); // fallback
    private CobolString xpc_fld0392c = new CobolString(256); // fallback
    private CobolString xpc_fld0393c = new CobolString(256); // fallback
    private CobolString xpc_fld0394c = new CobolString(256); // fallback
    private CobolString xpc_fld0395c = new CobolString(256); // fallback
    private CobolString xpc_fld0396c = new CobolString(256); // fallback
    private CobolString xpc_fld0397c = new CobolString(256); // fallback
    private CobolString xpc_fld0398c = new CobolString(256); // fallback
    private CobolString xpc_fld0399c = new CobolString(256); // fallback
    private CobolString xpc_fld0400c = new CobolString(256); // fallback
    private CobolString xpc_fld0401c = new CobolString(256); // fallback
    private CobolString xpc_fld0402c = new CobolString(256); // fallback
    private CobolString xpc_fld0403c = new CobolString(256); // fallback
    private CobolString xpc_fld0404c = new CobolString(256); // fallback
    private CobolString xpc_fld0405c = new CobolString(256); // fallback
    private CobolString xpc_fld0406c = new CobolString(256); // fallback
    private CobolString xpc_fld0407c = new CobolString(256); // fallback
    private CobolString xpc_fld0408c = new CobolString(256); // fallback
    private CobolString xpc_fld0409c = new CobolString(256); // fallback
    private CobolString xpc_fld0410c = new CobolString(256); // fallback
    private CobolString xpc_fld0411c = new CobolString(256); // fallback
    private CobolString xpc_fld0412c = new CobolString(256); // fallback
    private CobolString xpc_fld0413c = new CobolString(256); // fallback
    private CobolString xpc_fld0414c = new CobolString(256); // fallback
    private CobolString xpc_fld0415c = new CobolString(256); // fallback
    private CobolString xpc_fld0416c = new CobolString(256); // fallback
    private CobolString xpc_fld0417c = new CobolString(256); // fallback
    private CobolString xpc_fld0418c = new CobolString(256); // fallback
    private CobolString xpc_fld0419c = new CobolString(256); // fallback
    private CobolString xpc_fld0420c = new CobolString(256); // fallback
    private CobolString xpc_fld0421c = new CobolString(256); // fallback
    private CobolString xpc_fld0422c = new CobolString(256); // fallback
    private CobolString xpc_fld0423c = new CobolString(256); // fallback
    private CobolString xpc_fld0424c = new CobolString(256); // fallback
    private CobolString xpc_fld0425c = new CobolString(256); // fallback
    private CobolString xpc_fld0426c = new CobolString(256); // fallback
    private CobolString xpc_fld0427c = new CobolString(256); // fallback
    private CobolString xpc_fld0428c = new CobolString(256); // fallback
    private CobolString xpc_fld0429c = new CobolString(256); // fallback
    private CobolString xpc_fld0430c = new CobolString(256); // fallback
    private CobolString xpc_fld0431c = new CobolString(256); // fallback
    private CobolString xpc_fld0432c = new CobolString(256); // fallback
    private CobolString xpc_fld0433c = new CobolString(256); // fallback
    private CobolString xpc_fld0434c = new CobolString(256); // fallback
    private CobolString xpc_fld0435c = new CobolString(256); // fallback
    private CobolString xpc_fld0436c = new CobolString(256); // fallback
    private CobolString xpc_fld0437c = new CobolString(256); // fallback
    private CobolString xpc_fld0438c = new CobolString(256); // fallback
    private CobolString xpc_fld0439c = new CobolString(256); // fallback
    private CobolString xpc_fld0440c = new CobolString(256); // fallback
    private CobolString xpc_fld0441c = new CobolString(256); // fallback
    private CobolString xpc_fld0442c = new CobolString(256); // fallback
    private CobolString xpc_fld0443c = new CobolString(256); // fallback
    private CobolString xpc_fld0444c = new CobolString(256); // fallback
    private CobolString xpc_fld0445c = new CobolString(256); // fallback
    private CobolString xpc_fld0446c = new CobolString(256); // fallback
    private CobolString xpc_fld0447c = new CobolString(256); // fallback
    private CobolString xpc_fld0448c = new CobolString(256); // fallback
    private CobolString xpc_fld0449c = new CobolString(256); // fallback
    private CobolString xpc_fld0450c = new CobolString(256); // fallback
    private CobolString xpc_fld0451c = new CobolString(256); // fallback
    private CobolString xpc_fld0452c = new CobolString(256); // fallback
    private CobolString xpc_fld0453c = new CobolString(256); // fallback
    private CobolString xpc_fld0454c = new CobolString(256); // fallback
    private CobolString xpc_fld0455c = new CobolString(256); // fallback
    private CobolString xpc_fld0456c = new CobolString(256); // fallback
    private CobolString xpc_fld0457c = new CobolString(256); // fallback
    private CobolString xpc_fld0458c = new CobolString(256); // fallback
    private CobolString xpc_fld0459c = new CobolString(256); // fallback
    private CobolString xpc_fld0460c = new CobolString(256); // fallback
    private CobolString xpc_fld0461c = new CobolString(256); // fallback
    private CobolString xpc_fld0462c = new CobolString(256); // fallback
    private CobolString xpc_fld0463c = new CobolString(256); // fallback
    private CobolString xpc_fld0464c = new CobolString(256); // fallback
    private CobolString xpc_fld0465c = new CobolString(256); // fallback
    private CobolString xpc_fld0466c = new CobolString(256); // fallback
    private CobolString xpc_fld0467c = new CobolString(256); // fallback
    private CobolString xpc_fld0468c = new CobolString(256); // fallback
    private CobolString xpc_fld0469c = new CobolString(256); // fallback
    private CobolString xpc_fld0470c = new CobolString(256); // fallback
    private CobolString xpc_fld0471c = new CobolString(256); // fallback
    private CobolString xpc_fld0472c = new CobolString(256); // fallback
    private CobolString xpc_fld0473c = new CobolString(256); // fallback
    private CobolString xpc_fld0474c = new CobolString(256); // fallback
    private CobolString xpc_fld0475c = new CobolString(256); // fallback
    private CobolString xpc_fld0476c = new CobolString(256); // fallback
    private CobolString xpc_fld0477c = new CobolString(256); // fallback
    private CobolString xpc_fld0478c = new CobolString(256); // fallback
    private CobolString xpc_fld0479c = new CobolString(256); // fallback
    private CobolString xpc_fld0480c = new CobolString(256); // fallback
    private CobolString xpc_fld0481c = new CobolString(256); // fallback
    private CobolString xpc_fld0482c = new CobolString(256); // fallback
    private CobolString xpc_fld0483c = new CobolString(256); // fallback
    private CobolString xpc_fld0484c = new CobolString(256); // fallback
    private CobolString xpc_fld0485c = new CobolString(256); // fallback
    private CobolString xpc_fld0486c = new CobolString(256); // fallback
    private CobolString xpc_fld0487c = new CobolString(256); // fallback
    private CobolString xpc_fld0488c = new CobolString(256); // fallback
    private CobolString xpc_fld0489c = new CobolString(256); // fallback
    private CobolString xpc_fld0490c = new CobolString(256); // fallback
    private CobolString xpc_fld0491c = new CobolString(256); // fallback
    private CobolString xpc_fld0492c = new CobolString(256); // fallback
    private CobolString xpc_fld0493c = new CobolString(256); // fallback
    private CobolString xpc_fld0494c = new CobolString(256); // fallback
    private CobolString xpc_fld0495c = new CobolString(256); // fallback
    private CobolString xpc_fld0496c = new CobolString(256); // fallback
    private CobolString xpc_fld0497c = new CobolString(256); // fallback
    private CobolString xpc_fld0498c = new CobolString(256); // fallback
    private CobolString xpc_fld0499c = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the way */
        for (int _i0 = 0; _i0 < 10000; _i0++) {
        }
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
    }
    private void do_check_part0() {
        fld0001c.set(String.valueOf(fld0001a));
        fld0002c.set(String.valueOf(fld0002a));
        fld0003c.set(String.valueOf(fld0003a));
        fld0004c.set(String.valueOf(fld0004a));
        fld0005c.set(String.valueOf(fld0005a));
        fld0006c.set(String.valueOf(fld0006a));
        fld0007c.set(String.valueOf(fld0007a));
        fld0008c.set(String.valueOf(fld0008a));
        fld0009c.set(String.valueOf(fld0009a));
        fld0010c.set(String.valueOf(fld0010a));
        fld0011c.set(String.valueOf(fld0011a));
        fld0012c.set(String.valueOf(fld0012a));
        fld0013c.set(String.valueOf(fld0013a));
        fld0014c.set(String.valueOf(fld0014a));
        fld0015c.set(String.valueOf(fld0015a));
        fld0016c.set(String.valueOf(fld0016a));
        fld0017c.set(String.valueOf(fld0017a));
        fld0018c.set(String.valueOf(fld0018a));
        fld0019c.set(String.valueOf(fld0019a));
        fld0020c.set(String.valueOf(fld0020a));
        fld0021c.set(String.valueOf(fld0021a));
        fld0022c.set(String.valueOf(fld0022a));
        fld0023c.set(String.valueOf(fld0023a));
        fld0024c.set(String.valueOf(fld0024a));
        fld0025c.set(String.valueOf(fld0025a));
        fld0026c.set(String.valueOf(fld0026a));
        fld0027c.set(String.valueOf(fld0027a));
        fld0028c.set(String.valueOf(fld0028a));
        fld0029c.set(String.valueOf(fld0029a));
        fld0030c.set(String.valueOf(fld0030a));
        fld0031c.set(String.valueOf(fld0031a));
        fld0032c.set(String.valueOf(fld0032a));
        fld0033c.set(String.valueOf(fld0033a));
        fld0034c.set(String.valueOf(fld0034a));
        fld0035c.set(String.valueOf(fld0035a));
        fld0036c.set(String.valueOf(fld0036a));
        fld0037c.set(String.valueOf(fld0037a));
        fld0038c.set(String.valueOf(fld0038a));
        fld0039c.set(String.valueOf(fld0039a));
        fld0040c.set(String.valueOf(fld0040a));
        fld0041c.set(String.valueOf(fld0041a));
        fld0042c.set(String.valueOf(fld0042a));
        fld0043c.set(String.valueOf(fld0043a));
        fld0044c.set(String.valueOf(fld0044a));
        fld0045c.set(String.valueOf(fld0045a));
        fld0046c.set(String.valueOf(fld0046a));
        fld0047c.set(String.valueOf(fld0047a));
        fld0048c.set(String.valueOf(fld0048a));
        fld0049c.set(String.valueOf(fld0049a));
        fld0050c.set(String.valueOf(fld0050a));
        fld0051c.set(String.valueOf(fld0051a));
        fld0052c.set(String.valueOf(fld0052a));
        fld0053c.set(String.valueOf(fld0053a));
        fld0054c.set(String.valueOf(fld0054a));
        fld0055c.set(String.valueOf(fld0055a));
        fld0056c.set(String.valueOf(fld0056a));
        fld0057c.set(String.valueOf(fld0057a));
        fld0058c.set(String.valueOf(fld0058a));
        fld0059c.set(String.valueOf(fld0059a));
        fld0060c.set(String.valueOf(fld0060a));
        fld0061c.set(String.valueOf(fld0061a));
        fld0062c.set(String.valueOf(fld0062a));
        fld0063c.set(String.valueOf(fld0063a));
        fld0064c.set(String.valueOf(fld0064a));
        fld0065c.set(String.valueOf(fld0065a));
        fld0066c.set(String.valueOf(fld0066a));
        fld0067c.set(String.valueOf(fld0067a));
        fld0068c.set(String.valueOf(fld0068a));
        fld0069c.set(String.valueOf(fld0069a));
        fld0070c.set(String.valueOf(fld0070a));
        fld0071c.set(String.valueOf(fld0071a));
        fld0072c.set(String.valueOf(fld0072a));
        fld0073c.set(String.valueOf(fld0073a));
        fld0074c.set(String.valueOf(fld0074a));
        fld0075c.set(String.valueOf(fld0075a));
        fld0076c.set(String.valueOf(fld0076a));
        fld0077c.set(String.valueOf(fld0077a));
        fld0078c.set(String.valueOf(fld0078a));
        fld0079c.set(String.valueOf(fld0079a));
        fld0080c.set(String.valueOf(fld0080a));
        fld0081c.set(String.valueOf(fld0081a));
        fld0082c.set(String.valueOf(fld0082a));
        fld0083c.set(String.valueOf(fld0083a));
        fld0084c.set(String.valueOf(fld0084a));
        fld0085c.set(String.valueOf(fld0085a));
        fld0086c.set(String.valueOf(fld0086a));
        fld0087c.set(String.valueOf(fld0087a));
        fld0088c.set(String.valueOf(fld0088a));
        fld0089c.set(String.valueOf(fld0089a));
        fld0090c.set(String.valueOf(fld0090a));
        fld0091c.set(String.valueOf(fld0091a));
        fld0092c.set(String.valueOf(fld0092a));
        fld0093c.set(String.valueOf(fld0093a));
        fld0094c.set(String.valueOf(fld0094a));
        fld0095c.set(String.valueOf(fld0095a));
        fld0096c.set(String.valueOf(fld0096a));
        fld0097c.set(String.valueOf(fld0097a));
        fld0098c.set(String.valueOf(fld0098a));
        fld0099c.set(String.valueOf(fld0099a));
        fld0100c.set(String.valueOf(fld0100a));
        fld0101c.set(String.valueOf(fld0101a));
        fld0102c.set(String.valueOf(fld0102a));
        fld0103c.set(String.valueOf(fld0103a));
        fld0104c.set(String.valueOf(fld0104a));
        fld0105c.set(String.valueOf(fld0105a));
        fld0106c.set(String.valueOf(fld0106a));
        fld0107c.set(String.valueOf(fld0107a));
        fld0108c.set(String.valueOf(fld0108a));
        fld0109c.set(String.valueOf(fld0109a));
        fld0110c.set(String.valueOf(fld0110a));
        fld0111c.set(String.valueOf(fld0111a));
        fld0112c.set(String.valueOf(fld0112a));
        fld0113c.set(String.valueOf(fld0113a));
        fld0114c.set(String.valueOf(fld0114a));
        fld0115c.set(String.valueOf(fld0115a));
        fld0116c.set(String.valueOf(fld0116a));
        fld0117c.set(String.valueOf(fld0117a));
        fld0118c.set(String.valueOf(fld0118a));
        fld0119c.set(String.valueOf(fld0119a));
        fld0120c.set(String.valueOf(fld0120a));
        fld0121c.set(String.valueOf(fld0121a));
        fld0122c.set(String.valueOf(fld0122a));
        fld0123c.set(String.valueOf(fld0123a));
        fld0124c.set(String.valueOf(fld0124a));
        fld0125c.set(String.valueOf(fld0125a));
        fld0126c.set(String.valueOf(fld0126a));
        fld0127c.set(String.valueOf(fld0127a));
        fld0128c.set(String.valueOf(fld0128a));
        fld0129c.set(String.valueOf(fld0129a));
        fld0130c.set(String.valueOf(fld0130a));
        fld0131c.set(String.valueOf(fld0131a));
        fld0132c.set(String.valueOf(fld0132a));
        fld0133c.set(String.valueOf(fld0133a));
        fld0134c.set(String.valueOf(fld0134a));
        fld0135c.set(String.valueOf(fld0135a));
        fld0136c.set(String.valueOf(fld0136a));
        fld0137c.set(String.valueOf(fld0137a));
        fld0138c.set(String.valueOf(fld0138a));
        fld0139c.set(String.valueOf(fld0139a));
        fld0140c.set(String.valueOf(fld0140a));
        fld0141c.set(String.valueOf(fld0141a));
        fld0142c.set(String.valueOf(fld0142a));
        fld0143c.set(String.valueOf(fld0143a));
        fld0144c.set(String.valueOf(fld0144a));
        fld0145c.set(String.valueOf(fld0145a));
        fld0146c.set(String.valueOf(fld0146a));
        fld0147c.set(String.valueOf(fld0147a));
        fld0148c.set(String.valueOf(fld0148a));
        fld0149c.set(String.valueOf(fld0149a));
        fld0150c.set(String.valueOf(fld0150a));
        fld0151c.set(String.valueOf(fld0151a));
        fld0152c.set(String.valueOf(fld0152a));
        fld0153c.set(String.valueOf(fld0153a));
        fld0154c.set(String.valueOf(fld0154a));
        fld0155c.set(String.valueOf(fld0155a));
        fld0156c.set(String.valueOf(fld0156a));
        fld0157c.set(String.valueOf(fld0157a));
        fld0158c.set(String.valueOf(fld0158a));
        fld0159c.set(String.valueOf(fld0159a));
        fld0160c.set(String.valueOf(fld0160a));
        fld0161c.set(String.valueOf(fld0161a));
        fld0162c.set(String.valueOf(fld0162a));
        fld0163c.set(String.valueOf(fld0163a));
        fld0164c.set(String.valueOf(fld0164a));
        fld0165c.set(String.valueOf(fld0165a));
        fld0166c.set(String.valueOf(fld0166a));
        fld0167c.set(String.valueOf(fld0167a));
        fld0168c.set(String.valueOf(fld0168a));
        fld0169c.set(String.valueOf(fld0169a));
        fld0170c.set(String.valueOf(fld0170a));
        fld0171c.set(String.valueOf(fld0171a));
        fld0172c.set(String.valueOf(fld0172a));
        fld0173c.set(String.valueOf(fld0173a));
        fld0174c.set(String.valueOf(fld0174a));
        fld0175c.set(String.valueOf(fld0175a));
        fld0176c.set(String.valueOf(fld0176a));
        fld0177c.set(String.valueOf(fld0177a));
        fld0178c.set(String.valueOf(fld0178a));
        fld0179c.set(String.valueOf(fld0179a));
        fld0180c.set(String.valueOf(fld0180a));
        fld0181c.set(String.valueOf(fld0181a));
        fld0182c.set(String.valueOf(fld0182a));
        fld0183c.set(String.valueOf(fld0183a));
        fld0184c.set(String.valueOf(fld0184a));
        fld0185c.set(String.valueOf(fld0185a));
        fld0186c.set(String.valueOf(fld0186a));
        fld0187c.set(String.valueOf(fld0187a));
        fld0188c.set(String.valueOf(fld0188a));
        fld0189c.set(String.valueOf(fld0189a));
        fld0190c.set(String.valueOf(fld0190a));
        fld0191c.set(String.valueOf(fld0191a));
        fld0192c.set(String.valueOf(fld0192a));
        fld0193c.set(String.valueOf(fld0193a));
        fld0194c.set(String.valueOf(fld0194a));
        fld0195c.set(String.valueOf(fld0195a));
        fld0196c.set(String.valueOf(fld0196a));
        fld0197c.set(String.valueOf(fld0197a));
        fld0198c.set(String.valueOf(fld0198a));
        fld0199c.set(String.valueOf(fld0199a));
        fld0200c.set(String.valueOf(fld0200a));
        fld0201c.set(String.valueOf(fld0201a));
        fld0202c.set(String.valueOf(fld0202a));
        fld0203c.set(String.valueOf(fld0203a));
        fld0204c.set(String.valueOf(fld0204a));
        fld0205c.set(String.valueOf(fld0205a));
        fld0206c.set(String.valueOf(fld0206a));
        fld0207c.set(String.valueOf(fld0207a));
        fld0208c.set(String.valueOf(fld0208a));
        fld0209c.set(String.valueOf(fld0209a));
        fld0210c.set(String.valueOf(fld0210a));
        fld0211c.set(String.valueOf(fld0211a));
        fld0212c.set(String.valueOf(fld0212a));
        fld0213c.set(String.valueOf(fld0213a));
        fld0214c.set(String.valueOf(fld0214a));
        fld0215c.set(String.valueOf(fld0215a));
        fld0216c.set(String.valueOf(fld0216a));
        fld0217c.set(String.valueOf(fld0217a));
        fld0218c.set(String.valueOf(fld0218a));
        fld0219c.set(String.valueOf(fld0219a));
        fld0220c.set(String.valueOf(fld0220a));
        fld0221c.set(String.valueOf(fld0221a));
        fld0222c.set(String.valueOf(fld0222a));
        fld0223c.set(String.valueOf(fld0223a));
        fld0224c.set(String.valueOf(fld0224a));
        fld0225c.set(String.valueOf(fld0225a));
        fld0226c.set(String.valueOf(fld0226a));
        fld0227c.set(String.valueOf(fld0227a));
        fld0228c.set(String.valueOf(fld0228a));
        fld0229c.set(String.valueOf(fld0229a));
        fld0230c.set(String.valueOf(fld0230a));
        fld0231c.set(String.valueOf(fld0231a));
        fld0232c.set(String.valueOf(fld0232a));
        fld0233c.set(String.valueOf(fld0233a));
        fld0234c.set(String.valueOf(fld0234a));
        fld0235c.set(String.valueOf(fld0235a));
        fld0236c.set(String.valueOf(fld0236a));
        fld0237c.set(String.valueOf(fld0237a));
        fld0238c.set(String.valueOf(fld0238a));
        fld0239c.set(String.valueOf(fld0239a));
        fld0240c.set(String.valueOf(fld0240a));
        fld0241c.set(String.valueOf(fld0241a));
        fld0242c.set(String.valueOf(fld0242a));
        fld0243c.set(String.valueOf(fld0243a));
        fld0244c.set(String.valueOf(fld0244a));
        fld0245c.set(String.valueOf(fld0245a));
        fld0246c.set(String.valueOf(fld0246a));
        fld0247c.set(String.valueOf(fld0247a));
        fld0248c.set(String.valueOf(fld0248a));
        fld0249c.set(String.valueOf(fld0249a));
        fld0250c.set(String.valueOf(fld0250a));
        fld0251c.set(String.valueOf(fld0251a));
        fld0252c.set(String.valueOf(fld0252a));
        fld0253c.set(String.valueOf(fld0253a));
        fld0254c.set(String.valueOf(fld0254a));
        fld0255c.set(String.valueOf(fld0255a));
        fld0256c.set(String.valueOf(fld0256a));
        fld0257c.set(String.valueOf(fld0257a));
        fld0258c.set(String.valueOf(fld0258a));
        fld0259c.set(String.valueOf(fld0259a));
        fld0260c.set(String.valueOf(fld0260a));
        fld0261c.set(String.valueOf(fld0261a));
        fld0262c.set(String.valueOf(fld0262a));
        fld0263c.set(String.valueOf(fld0263a));
        fld0264c.set(String.valueOf(fld0264a));
        fld0265c.set(String.valueOf(fld0265a));
        fld0266c.set(String.valueOf(fld0266a));
        fld0267c.set(String.valueOf(fld0267a));
        fld0268c.set(String.valueOf(fld0268a));
        fld0269c.set(String.valueOf(fld0269a));
        fld0270c.set(String.valueOf(fld0270a));
        fld0271c.set(String.valueOf(fld0271a));
        fld0272c.set(String.valueOf(fld0272a));
        fld0273c.set(String.valueOf(fld0273a));
        fld0274c.set(String.valueOf(fld0274a));
        fld0275c.set(String.valueOf(fld0275a));
        fld0276c.set(String.valueOf(fld0276a));
        fld0277c.set(String.valueOf(fld0277a));
        fld0278c.set(String.valueOf(fld0278a));
        fld0279c.set(String.valueOf(fld0279a));
        fld0280c.set(String.valueOf(fld0280a));
        fld0281c.set(String.valueOf(fld0281a));
        fld0282c.set(String.valueOf(fld0282a));
        fld0283c.set(String.valueOf(fld0283a));
        fld0284c.set(String.valueOf(fld0284a));
        fld0285c.set(String.valueOf(fld0285a));
        fld0286c.set(String.valueOf(fld0286a));
        fld0287c.set(String.valueOf(fld0287a));
        fld0288c.set(String.valueOf(fld0288a));
        fld0289c.set(String.valueOf(fld0289a));
        fld0290c.set(String.valueOf(fld0290a));
        fld0291c.set(String.valueOf(fld0291a));
        fld0292c.set(String.valueOf(fld0292a));
        fld0293c.set(String.valueOf(fld0293a));
        fld0294c.set(String.valueOf(fld0294a));
        fld0295c.set(String.valueOf(fld0295a));
        fld0296c.set(String.valueOf(fld0296a));
        fld0297c.set(String.valueOf(fld0297a));
        fld0298c.set(String.valueOf(fld0298a));
        fld0299c.set(String.valueOf(fld0299a));
        fld0300c.set(String.valueOf(fld0300a));
        fld0301c.set(String.valueOf(fld0301a));
        fld0302c.set(String.valueOf(fld0302a));
        fld0303c.set(String.valueOf(fld0303a));
        fld0304c.set(String.valueOf(fld0304a));
        fld0305c.set(String.valueOf(fld0305a));
        fld0306c.set(String.valueOf(fld0306a));
        fld0307c.set(String.valueOf(fld0307a));
        fld0308c.set(String.valueOf(fld0308a));
        fld0309c.set(String.valueOf(fld0309a));
        fld0310c.set(String.valueOf(fld0310a));
        fld0311c.set(String.valueOf(fld0311a));
        fld0312c.set(String.valueOf(fld0312a));
        fld0313c.set(String.valueOf(fld0313a));
        fld0314c.set(String.valueOf(fld0314a));
        fld0315c.set(String.valueOf(fld0315a));
        fld0316c.set(String.valueOf(fld0316a));
        fld0317c.set(String.valueOf(fld0317a));
        fld0318c.set(String.valueOf(fld0318a));
        fld0319c.set(String.valueOf(fld0319a));
        fld0320c.set(String.valueOf(fld0320a));
        fld0321c.set(String.valueOf(fld0321a));
        fld0322c.set(String.valueOf(fld0322a));
        fld0323c.set(String.valueOf(fld0323a));
        fld0324c.set(String.valueOf(fld0324a));
        fld0325c.set(String.valueOf(fld0325a));
        fld0326c.set(String.valueOf(fld0326a));
        fld0327c.set(String.valueOf(fld0327a));
        fld0328c.set(String.valueOf(fld0328a));
        fld0329c.set(String.valueOf(fld0329a));
        fld0330c.set(String.valueOf(fld0330a));
        fld0331c.set(String.valueOf(fld0331a));
        fld0332c.set(String.valueOf(fld0332a));
        fld0333c.set(String.valueOf(fld0333a));
        fld0334c.set(String.valueOf(fld0334a));
        fld0335c.set(String.valueOf(fld0335a));
        fld0336c.set(String.valueOf(fld0336a));
        fld0337c.set(String.valueOf(fld0337a));
        fld0338c.set(String.valueOf(fld0338a));
        fld0339c.set(String.valueOf(fld0339a));
        fld0340c.set(String.valueOf(fld0340a));
        fld0341c.set(String.valueOf(fld0341a));
        fld0342c.set(String.valueOf(fld0342a));
        fld0343c.set(String.valueOf(fld0343a));
        fld0344c.set(String.valueOf(fld0344a));
        fld0345c.set(String.valueOf(fld0345a));
        fld0346c.set(String.valueOf(fld0346a));
        fld0347c.set(String.valueOf(fld0347a));
        fld0348c.set(String.valueOf(fld0348a));
        fld0349c.set(String.valueOf(fld0349a));
        fld0350c.set(String.valueOf(fld0350a));
        fld0351c.set(String.valueOf(fld0351a));
        fld0352c.set(String.valueOf(fld0352a));
        fld0353c.set(String.valueOf(fld0353a));
        fld0354c.set(String.valueOf(fld0354a));
        fld0355c.set(String.valueOf(fld0355a));
        fld0356c.set(String.valueOf(fld0356a));
        fld0357c.set(String.valueOf(fld0357a));
        fld0358c.set(String.valueOf(fld0358a));
        fld0359c.set(String.valueOf(fld0359a));
        fld0360c.set(String.valueOf(fld0360a));
        fld0361c.set(String.valueOf(fld0361a));
        fld0362c.set(String.valueOf(fld0362a));
        fld0363c.set(String.valueOf(fld0363a));
        fld0364c.set(String.valueOf(fld0364a));
        fld0365c.set(String.valueOf(fld0365a));
        fld0366c.set(String.valueOf(fld0366a));
        fld0367c.set(String.valueOf(fld0367a));
        fld0368c.set(String.valueOf(fld0368a));
        fld0369c.set(String.valueOf(fld0369a));
        fld0370c.set(String.valueOf(fld0370a));
        fld0371c.set(String.valueOf(fld0371a));
        fld0372c.set(String.valueOf(fld0372a));
        fld0373c.set(String.valueOf(fld0373a));
        fld0374c.set(String.valueOf(fld0374a));
        fld0375c.set(String.valueOf(fld0375a));
        fld0376c.set(String.valueOf(fld0376a));
        fld0377c.set(String.valueOf(fld0377a));
        fld0378c.set(String.valueOf(fld0378a));
        fld0379c.set(String.valueOf(fld0379a));
        fld0380c.set(String.valueOf(fld0380a));
        fld0381c.set(String.valueOf(fld0381a));
        fld0382c.set(String.valueOf(fld0382a));
        fld0383c.set(String.valueOf(fld0383a));
        fld0384c.set(String.valueOf(fld0384a));
        fld0385c.set(String.valueOf(fld0385a));
        fld0386c.set(String.valueOf(fld0386a));
        fld0387c.set(String.valueOf(fld0387a));
        fld0388c.set(String.valueOf(fld0388a));
        fld0389c.set(String.valueOf(fld0389a));
        fld0390c.set(String.valueOf(fld0390a));
        fld0391c.set(String.valueOf(fld0391a));
        fld0392c.set(String.valueOf(fld0392a));
        fld0393c.set(String.valueOf(fld0393a));
        fld0394c.set(String.valueOf(fld0394a));
        fld0395c.set(String.valueOf(fld0395a));
        fld0396c.set(String.valueOf(fld0396a));
        fld0397c.set(String.valueOf(fld0397a));
        fld0398c.set(String.valueOf(fld0398a));
        fld0399c.set(String.valueOf(fld0399a));
        fld0400c.set(String.valueOf(fld0400a));
    }
    private void do_check_part1() {
        fld0401c.set(String.valueOf(fld0401a));
        fld0402c.set(String.valueOf(fld0402a));
        fld0403c.set(String.valueOf(fld0403a));
        fld0404c.set(String.valueOf(fld0404a));
        fld0405c.set(String.valueOf(fld0405a));
        fld0406c.set(String.valueOf(fld0406a));
        fld0407c.set(String.valueOf(fld0407a));
        fld0408c.set(String.valueOf(fld0408a));
        fld0409c.set(String.valueOf(fld0409a));
        fld0410c.set(String.valueOf(fld0410a));
        fld0411c.set(String.valueOf(fld0411a));
        fld0412c.set(String.valueOf(fld0412a));
        fld0413c.set(String.valueOf(fld0413a));
        fld0414c.set(String.valueOf(fld0414a));
        fld0415c.set(String.valueOf(fld0415a));
        fld0416c.set(String.valueOf(fld0416a));
        fld0417c.set(String.valueOf(fld0417a));
        fld0418c.set(String.valueOf(fld0418a));
        fld0419c.set(String.valueOf(fld0419a));
        fld0420c.set(String.valueOf(fld0420a));
        fld0421c.set(String.valueOf(fld0421a));
        fld0422c.set(String.valueOf(fld0422a));
        fld0423c.set(String.valueOf(fld0423a));
        fld0424c.set(String.valueOf(fld0424a));
        fld0425c.set(String.valueOf(fld0425a));
        fld0426c.set(String.valueOf(fld0426a));
        fld0427c.set(String.valueOf(fld0427a));
        fld0428c.set(String.valueOf(fld0428a));
        fld0429c.set(String.valueOf(fld0429a));
        fld0430c.set(String.valueOf(fld0430a));
        fld0431c.set(String.valueOf(fld0431a));
        fld0432c.set(String.valueOf(fld0432a));
        fld0433c.set(String.valueOf(fld0433a));
        fld0434c.set(String.valueOf(fld0434a));
        fld0435c.set(String.valueOf(fld0435a));
        fld0436c.set(String.valueOf(fld0436a));
        fld0437c.set(String.valueOf(fld0437a));
        fld0438c.set(String.valueOf(fld0438a));
        fld0439c.set(String.valueOf(fld0439a));
        fld0440c.set(String.valueOf(fld0440a));
        fld0441c.set(String.valueOf(fld0441a));
        fld0442c.set(String.valueOf(fld0442a));
        fld0443c.set(String.valueOf(fld0443a));
        fld0444c.set(String.valueOf(fld0444a));
        fld0445c.set(String.valueOf(fld0445a));
        fld0446c.set(String.valueOf(fld0446a));
        fld0447c.set(String.valueOf(fld0447a));
        fld0448c.set(String.valueOf(fld0448a));
        fld0449c.set(String.valueOf(fld0449a));
        fld0450c.set(String.valueOf(fld0450a));
        fld0451c.set(String.valueOf(fld0451a));
        fld0452c.set(String.valueOf(fld0452a));
        fld0453c.set(String.valueOf(fld0453a));
        fld0454c.set(String.valueOf(fld0454a));
        fld0455c.set(String.valueOf(fld0455a));
        fld0456c.set(String.valueOf(fld0456a));
        fld0457c.set(String.valueOf(fld0457a));
        fld0458c.set(String.valueOf(fld0458a));
        fld0459c.set(String.valueOf(fld0459a));
        fld0460c.set(String.valueOf(fld0460a));
        fld0461c.set(String.valueOf(fld0461a));
        fld0462c.set(String.valueOf(fld0462a));
        fld0463c.set(String.valueOf(fld0463a));
        fld0464c.set(String.valueOf(fld0464a));
        fld0465c.set(String.valueOf(fld0465a));
        fld0466c.set(String.valueOf(fld0466a));
        fld0467c.set(String.valueOf(fld0467a));
        fld0468c.set(String.valueOf(fld0468a));
        fld0469c.set(String.valueOf(fld0469a));
        fld0470c.set(String.valueOf(fld0470a));
        fld0471c.set(String.valueOf(fld0471a));
        fld0472c.set(String.valueOf(fld0472a));
        fld0473c.set(String.valueOf(fld0473a));
        fld0474c.set(String.valueOf(fld0474a));
        fld0475c.set(String.valueOf(fld0475a));
        fld0476c.set(String.valueOf(fld0476a));
        fld0477c.set(String.valueOf(fld0477a));
        fld0478c.set(String.valueOf(fld0478a));
        fld0479c.set(String.valueOf(fld0479a));
        fld0480c.set(String.valueOf(fld0480a));
        fld0481c.set(String.valueOf(fld0481a));
        fld0482c.set(String.valueOf(fld0482a));
        fld0483c.set(String.valueOf(fld0483a));
        fld0484c.set(String.valueOf(fld0484a));
        fld0485c.set(String.valueOf(fld0485a));
        fld0486c.set(String.valueOf(fld0486a));
        fld0487c.set(String.valueOf(fld0487a));
        fld0488c.set(String.valueOf(fld0488a));
        fld0489c.set(String.valueOf(fld0489a));
        fld0490c.set(String.valueOf(fld0490a));
        fld0491c.set(String.valueOf(fld0491a));
        fld0492c.set(String.valueOf(fld0492a));
        fld0493c.set(String.valueOf(fld0493a));
        fld0494c.set(String.valueOf(fld0494a));
        fld0495c.set(String.valueOf(fld0495a));
        fld0496c.set(String.valueOf(fld0496a));
        fld0497c.set(String.valueOf(fld0497a));
        fld0498c.set(String.valueOf(fld0498a));
        fld0499c.set(String.valueOf(fld0499a));
    }

    private void _4000_compare() {
        _4000_compare_part0();
        _4000_compare_part1();
        _4000_compare_part2();
        _4000_compare_part3();
    }
    private void _4000_compare_part0() {
        if (!String.valueOf(CobolString.refMod(fld0001c, 1)).equals(String.valueOf(xpc_fld0001c))) {
            CobolDisplay.display("FLD0001C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0001c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0001c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0002c, 1)).equals(String.valueOf(xpc_fld0002c))) {
            CobolDisplay.display("FLD0002C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0002c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0002c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0003c, 1)).equals(String.valueOf(xpc_fld0003c))) {
            CobolDisplay.display("FLD0003C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0003c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0003c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0004c, 1)).equals(String.valueOf(xpc_fld0004c))) {
            CobolDisplay.display("FLD0004C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0004c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0004c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0005c, 1)).equals(String.valueOf(xpc_fld0005c))) {
            CobolDisplay.display("FLD0005C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0005c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0005c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0006c, 1)).equals(String.valueOf(xpc_fld0006c))) {
            CobolDisplay.display("FLD0006C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0006c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0006c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0007c, 1)).equals(String.valueOf(xpc_fld0007c))) {
            CobolDisplay.display("FLD0007C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0007c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0007c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0008c, 1)).equals(String.valueOf(xpc_fld0008c))) {
            CobolDisplay.display("FLD0008C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0008c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0008c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0009c, 1)).equals(String.valueOf(xpc_fld0009c))) {
            CobolDisplay.display("FLD0009C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0009c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0009c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0010c, 1)).equals(String.valueOf(xpc_fld0010c))) {
            CobolDisplay.display("FLD0010C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0010c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0010c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0011c, 1)).equals(String.valueOf(xpc_fld0011c))) {
            CobolDisplay.display("FLD0011C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0011c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0011c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0012c, 1)).equals(String.valueOf(xpc_fld0012c))) {
            CobolDisplay.display("FLD0012C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0012c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0012c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0013c, 1)).equals(String.valueOf(xpc_fld0013c))) {
            CobolDisplay.display("FLD0013C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0013c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0013c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0014c, 1)).equals(String.valueOf(xpc_fld0014c))) {
            CobolDisplay.display("FLD0014C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0014c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0014c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0015c, 1)).equals(String.valueOf(xpc_fld0015c))) {
            CobolDisplay.display("FLD0015C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0015c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0015c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0016c, 1)).equals(String.valueOf(xpc_fld0016c))) {
            CobolDisplay.display("FLD0016C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0016c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0016c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0017c, 1)).equals(String.valueOf(xpc_fld0017c))) {
            CobolDisplay.display("FLD0017C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0017c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0017c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0018c, 1)).equals(String.valueOf(xpc_fld0018c))) {
            CobolDisplay.display("FLD0018C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0018c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0018c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0019c, 1)).equals(String.valueOf(xpc_fld0019c))) {
            CobolDisplay.display("FLD0019C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0019c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0019c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0020c, 1)).equals(String.valueOf(xpc_fld0020c))) {
            CobolDisplay.display("FLD0020C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0020c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0020c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0021c, 1)).equals(String.valueOf(xpc_fld0021c))) {
            CobolDisplay.display("FLD0021C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0021c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0021c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0022c, 1)).equals(String.valueOf(xpc_fld0022c))) {
            CobolDisplay.display("FLD0022C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0022c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0022c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0023c, 1)).equals(String.valueOf(xpc_fld0023c))) {
            CobolDisplay.display("FLD0023C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0023c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0023c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0024c, 1)).equals(String.valueOf(xpc_fld0024c))) {
            CobolDisplay.display("FLD0024C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0024c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0024c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0025c, 1)).equals(String.valueOf(xpc_fld0025c))) {
            CobolDisplay.display("FLD0025C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0025c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0025c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0026c, 1)).equals(String.valueOf(xpc_fld0026c))) {
            CobolDisplay.display("FLD0026C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0026c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0026c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0027c, 1)).equals(String.valueOf(xpc_fld0027c))) {
            CobolDisplay.display("FLD0027C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0027c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0027c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0028c, 1)).equals(String.valueOf(xpc_fld0028c))) {
            CobolDisplay.display("FLD0028C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0028c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0028c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0029c, 1)).equals(String.valueOf(xpc_fld0029c))) {
            CobolDisplay.display("FLD0029C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0029c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0029c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0030c, 1)).equals(String.valueOf(xpc_fld0030c))) {
            CobolDisplay.display("FLD0030C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0030c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0030c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0031c, 1)).equals(String.valueOf(xpc_fld0031c))) {
            CobolDisplay.display("FLD0031C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0031c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0031c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0032c, 1)).equals(String.valueOf(xpc_fld0032c))) {
            CobolDisplay.display("FLD0032C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0032c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0032c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0033c, 1)).equals(String.valueOf(xpc_fld0033c))) {
            CobolDisplay.display("FLD0033C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0033c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0033c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0034c, 1)).equals(String.valueOf(xpc_fld0034c))) {
            CobolDisplay.display("FLD0034C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0034c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0034c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0035c, 1)).equals(String.valueOf(xpc_fld0035c))) {
            CobolDisplay.display("FLD0035C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0035c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0035c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0036c, 1)).equals(String.valueOf(xpc_fld0036c))) {
            CobolDisplay.display("FLD0036C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0036c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0036c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0037c, 1)).equals(String.valueOf(xpc_fld0037c))) {
            CobolDisplay.display("FLD0037C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0037c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0037c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0038c, 1)).equals(String.valueOf(xpc_fld0038c))) {
            CobolDisplay.display("FLD0038C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0038c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0038c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0039c, 1)).equals(String.valueOf(xpc_fld0039c))) {
            CobolDisplay.display("FLD0039C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0039c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0039c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0040c, 1)).equals(String.valueOf(xpc_fld0040c))) {
            CobolDisplay.display("FLD0040C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0040c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0040c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0041c, 1)).equals(String.valueOf(xpc_fld0041c))) {
            CobolDisplay.display("FLD0041C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0041c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0041c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0042c, 1)).equals(String.valueOf(xpc_fld0042c))) {
            CobolDisplay.display("FLD0042C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0042c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0042c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0043c, 1)).equals(String.valueOf(xpc_fld0043c))) {
            CobolDisplay.display("FLD0043C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0043c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0043c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0044c, 1)).equals(String.valueOf(xpc_fld0044c))) {
            CobolDisplay.display("FLD0044C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0044c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0044c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0045c, 1)).equals(String.valueOf(xpc_fld0045c))) {
            CobolDisplay.display("FLD0045C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0045c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0045c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0046c, 1)).equals(String.valueOf(xpc_fld0046c))) {
            CobolDisplay.display("FLD0046C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0046c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0046c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0047c, 1)).equals(String.valueOf(xpc_fld0047c))) {
            CobolDisplay.display("FLD0047C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0047c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0047c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0048c, 1)).equals(String.valueOf(xpc_fld0048c))) {
            CobolDisplay.display("FLD0048C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0048c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0048c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0049c, 1)).equals(String.valueOf(xpc_fld0049c))) {
            CobolDisplay.display("FLD0049C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0049c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0049c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0050c, 1)).equals(String.valueOf(xpc_fld0050c))) {
            CobolDisplay.display("FLD0050C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0050c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0050c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0051c, 1)).equals(String.valueOf(xpc_fld0051c))) {
            CobolDisplay.display("FLD0051C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0051c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0051c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0052c, 1)).equals(String.valueOf(xpc_fld0052c))) {
            CobolDisplay.display("FLD0052C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0052c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0052c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0053c, 1)).equals(String.valueOf(xpc_fld0053c))) {
            CobolDisplay.display("FLD0053C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0053c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0053c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0054c, 1)).equals(String.valueOf(xpc_fld0054c))) {
            CobolDisplay.display("FLD0054C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0054c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0054c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0055c, 1)).equals(String.valueOf(xpc_fld0055c))) {
            CobolDisplay.display("FLD0055C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0055c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0055c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0056c, 1)).equals(String.valueOf(xpc_fld0056c))) {
            CobolDisplay.display("FLD0056C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0056c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0056c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0057c, 1)).equals(String.valueOf(xpc_fld0057c))) {
            CobolDisplay.display("FLD0057C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0057c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0057c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0058c, 1)).equals(String.valueOf(xpc_fld0058c))) {
            CobolDisplay.display("FLD0058C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0058c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0058c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0059c, 1)).equals(String.valueOf(xpc_fld0059c))) {
            CobolDisplay.display("FLD0059C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0059c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0059c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0060c, 1)).equals(String.valueOf(xpc_fld0060c))) {
            CobolDisplay.display("FLD0060C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0060c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0060c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0061c, 1)).equals(String.valueOf(xpc_fld0061c))) {
            CobolDisplay.display("FLD0061C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0061c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0061c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0062c, 1)).equals(String.valueOf(xpc_fld0062c))) {
            CobolDisplay.display("FLD0062C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0062c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0062c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0063c, 1)).equals(String.valueOf(xpc_fld0063c))) {
            CobolDisplay.display("FLD0063C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0063c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0063c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0064c, 1)).equals(String.valueOf(xpc_fld0064c))) {
            CobolDisplay.display("FLD0064C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0064c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0064c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0065c, 1)).equals(String.valueOf(xpc_fld0065c))) {
            CobolDisplay.display("FLD0065C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0065c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0065c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0066c, 1)).equals(String.valueOf(xpc_fld0066c))) {
            CobolDisplay.display("FLD0066C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0066c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0066c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0067c, 1)).equals(String.valueOf(xpc_fld0067c))) {
            CobolDisplay.display("FLD0067C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0067c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0067c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0068c, 1)).equals(String.valueOf(xpc_fld0068c))) {
            CobolDisplay.display("FLD0068C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0068c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0068c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0069c, 1)).equals(String.valueOf(xpc_fld0069c))) {
            CobolDisplay.display("FLD0069C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0069c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0069c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0070c, 1)).equals(String.valueOf(xpc_fld0070c))) {
            CobolDisplay.display("FLD0070C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0070c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0070c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0071c, 1)).equals(String.valueOf(xpc_fld0071c))) {
            CobolDisplay.display("FLD0071C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0071c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0071c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0072c, 1)).equals(String.valueOf(xpc_fld0072c))) {
            CobolDisplay.display("FLD0072C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0072c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0072c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0073c, 1)).equals(String.valueOf(xpc_fld0073c))) {
            CobolDisplay.display("FLD0073C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0073c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0073c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0074c, 1)).equals(String.valueOf(xpc_fld0074c))) {
            CobolDisplay.display("FLD0074C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0074c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0074c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0075c, 1)).equals(String.valueOf(xpc_fld0075c))) {
            CobolDisplay.display("FLD0075C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0075c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0075c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0076c, 1)).equals(String.valueOf(xpc_fld0076c))) {
            CobolDisplay.display("FLD0076C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0076c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0076c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0077c, 1)).equals(String.valueOf(xpc_fld0077c))) {
            CobolDisplay.display("FLD0077C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0077c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0077c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0078c, 1)).equals(String.valueOf(xpc_fld0078c))) {
            CobolDisplay.display("FLD0078C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0078c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0078c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0079c, 1)).equals(String.valueOf(xpc_fld0079c))) {
            CobolDisplay.display("FLD0079C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0079c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0079c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0080c, 1)).equals(String.valueOf(xpc_fld0080c))) {
            CobolDisplay.display("FLD0080C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0080c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0080c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0081c, 1)).equals(String.valueOf(xpc_fld0081c))) {
            CobolDisplay.display("FLD0081C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0081c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0081c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0082c, 1)).equals(String.valueOf(xpc_fld0082c))) {
            CobolDisplay.display("FLD0082C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0082c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0082c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0083c, 1)).equals(String.valueOf(xpc_fld0083c))) {
            CobolDisplay.display("FLD0083C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0083c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0083c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0084c, 1)).equals(String.valueOf(xpc_fld0084c))) {
            CobolDisplay.display("FLD0084C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0084c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0084c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0085c, 1)).equals(String.valueOf(xpc_fld0085c))) {
            CobolDisplay.display("FLD0085C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0085c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0085c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0086c, 1)).equals(String.valueOf(xpc_fld0086c))) {
            CobolDisplay.display("FLD0086C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0086c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0086c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0087c, 1)).equals(String.valueOf(xpc_fld0087c))) {
            CobolDisplay.display("FLD0087C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0087c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0087c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0088c, 1)).equals(String.valueOf(xpc_fld0088c))) {
            CobolDisplay.display("FLD0088C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0088c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0088c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0089c, 1)).equals(String.valueOf(xpc_fld0089c))) {
            CobolDisplay.display("FLD0089C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0089c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0089c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0090c, 1)).equals(String.valueOf(xpc_fld0090c))) {
            CobolDisplay.display("FLD0090C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0090c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0090c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0091c, 1)).equals(String.valueOf(xpc_fld0091c))) {
            CobolDisplay.display("FLD0091C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0091c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0091c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0092c, 1)).equals(String.valueOf(xpc_fld0092c))) {
            CobolDisplay.display("FLD0092C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0092c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0092c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0093c, 1)).equals(String.valueOf(xpc_fld0093c))) {
            CobolDisplay.display("FLD0093C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0093c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0093c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0094c, 1)).equals(String.valueOf(xpc_fld0094c))) {
            CobolDisplay.display("FLD0094C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0094c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0094c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0095c, 1)).equals(String.valueOf(xpc_fld0095c))) {
            CobolDisplay.display("FLD0095C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0095c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0095c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0096c, 1)).equals(String.valueOf(xpc_fld0096c))) {
            CobolDisplay.display("FLD0096C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0096c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0096c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0097c, 1)).equals(String.valueOf(xpc_fld0097c))) {
            CobolDisplay.display("FLD0097C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0097c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0097c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0098c, 1)).equals(String.valueOf(xpc_fld0098c))) {
            CobolDisplay.display("FLD0098C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0098c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0098c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0099c, 1)).equals(String.valueOf(xpc_fld0099c))) {
            CobolDisplay.display("FLD0099C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0099c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0099c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0100c, 1)).equals(String.valueOf(xpc_fld0100c))) {
            CobolDisplay.display("FLD0100C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0100c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0100c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0101c, 1)).equals(String.valueOf(xpc_fld0101c))) {
            CobolDisplay.display("FLD0101C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0101c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0101c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0102c, 1)).equals(String.valueOf(xpc_fld0102c))) {
            CobolDisplay.display("FLD0102C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0102c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0102c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0103c, 1)).equals(String.valueOf(xpc_fld0103c))) {
            CobolDisplay.display("FLD0103C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0103c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0103c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0104c, 1)).equals(String.valueOf(xpc_fld0104c))) {
            CobolDisplay.display("FLD0104C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0104c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0104c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0105c, 1)).equals(String.valueOf(xpc_fld0105c))) {
            CobolDisplay.display("FLD0105C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0105c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0105c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0106c, 1)).equals(String.valueOf(xpc_fld0106c))) {
            CobolDisplay.display("FLD0106C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0106c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0106c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0107c, 1)).equals(String.valueOf(xpc_fld0107c))) {
            CobolDisplay.display("FLD0107C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0107c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0107c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0108c, 1)).equals(String.valueOf(xpc_fld0108c))) {
            CobolDisplay.display("FLD0108C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0108c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0108c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0109c, 1)).equals(String.valueOf(xpc_fld0109c))) {
            CobolDisplay.display("FLD0109C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0109c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0109c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0110c, 1)).equals(String.valueOf(xpc_fld0110c))) {
            CobolDisplay.display("FLD0110C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0110c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0110c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0111c, 1)).equals(String.valueOf(xpc_fld0111c))) {
            CobolDisplay.display("FLD0111C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0111c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0111c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0112c, 1)).equals(String.valueOf(xpc_fld0112c))) {
            CobolDisplay.display("FLD0112C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0112c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0112c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0113c, 1)).equals(String.valueOf(xpc_fld0113c))) {
            CobolDisplay.display("FLD0113C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0113c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0113c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0114c, 1)).equals(String.valueOf(xpc_fld0114c))) {
            CobolDisplay.display("FLD0114C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0114c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0114c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0115c, 1)).equals(String.valueOf(xpc_fld0115c))) {
            CobolDisplay.display("FLD0115C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0115c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0115c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0116c, 1)).equals(String.valueOf(xpc_fld0116c))) {
            CobolDisplay.display("FLD0116C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0116c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0116c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0117c, 1)).equals(String.valueOf(xpc_fld0117c))) {
            CobolDisplay.display("FLD0117C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0117c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0117c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0118c, 1)).equals(String.valueOf(xpc_fld0118c))) {
            CobolDisplay.display("FLD0118C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0118c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0118c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0119c, 1)).equals(String.valueOf(xpc_fld0119c))) {
            CobolDisplay.display("FLD0119C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0119c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0119c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0120c, 1)).equals(String.valueOf(xpc_fld0120c))) {
            CobolDisplay.display("FLD0120C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0120c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0120c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0121c, 1)).equals(String.valueOf(xpc_fld0121c))) {
            CobolDisplay.display("FLD0121C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0121c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0121c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0122c, 1)).equals(String.valueOf(xpc_fld0122c))) {
            CobolDisplay.display("FLD0122C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0122c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0122c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0123c, 1)).equals(String.valueOf(xpc_fld0123c))) {
            CobolDisplay.display("FLD0123C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0123c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0123c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0124c, 1)).equals(String.valueOf(xpc_fld0124c))) {
            CobolDisplay.display("FLD0124C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0124c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0124c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0125c, 1)).equals(String.valueOf(xpc_fld0125c))) {
            CobolDisplay.display("FLD0125C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0125c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0125c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0126c, 1)).equals(String.valueOf(xpc_fld0126c))) {
            CobolDisplay.display("FLD0126C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0126c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0126c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0127c, 1)).equals(String.valueOf(xpc_fld0127c))) {
            CobolDisplay.display("FLD0127C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0127c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0127c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0128c, 1)).equals(String.valueOf(xpc_fld0128c))) {
            CobolDisplay.display("FLD0128C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0128c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0128c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0129c, 1)).equals(String.valueOf(xpc_fld0129c))) {
            CobolDisplay.display("FLD0129C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0129c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0129c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0130c, 1)).equals(String.valueOf(xpc_fld0130c))) {
            CobolDisplay.display("FLD0130C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0130c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0130c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0131c, 1)).equals(String.valueOf(xpc_fld0131c))) {
            CobolDisplay.display("FLD0131C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0131c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0131c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0132c, 1)).equals(String.valueOf(xpc_fld0132c))) {
            CobolDisplay.display("FLD0132C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0132c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0132c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0133c, 1)).equals(String.valueOf(xpc_fld0133c))) {
            CobolDisplay.display("FLD0133C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0133c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0133c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0134c, 1)).equals(String.valueOf(xpc_fld0134c))) {
            CobolDisplay.display("FLD0134C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0134c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0134c).trim()) - 1]));
        }
    }
    private void _4000_compare_part1() {
        if (!String.valueOf(CobolString.refMod(fld0135c, 1)).equals(String.valueOf(xpc_fld0135c))) {
            CobolDisplay.display("FLD0135C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0135c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0135c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0136c, 1)).equals(String.valueOf(xpc_fld0136c))) {
            CobolDisplay.display("FLD0136C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0136c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0136c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0137c, 1)).equals(String.valueOf(xpc_fld0137c))) {
            CobolDisplay.display("FLD0137C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0137c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0137c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0138c, 1)).equals(String.valueOf(xpc_fld0138c))) {
            CobolDisplay.display("FLD0138C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0138c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0138c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0139c, 1)).equals(String.valueOf(xpc_fld0139c))) {
            CobolDisplay.display("FLD0139C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0139c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0139c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0140c, 1)).equals(String.valueOf(xpc_fld0140c))) {
            CobolDisplay.display("FLD0140C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0140c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0140c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0141c, 1)).equals(String.valueOf(xpc_fld0141c))) {
            CobolDisplay.display("FLD0141C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0141c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0141c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0142c, 1)).equals(String.valueOf(xpc_fld0142c))) {
            CobolDisplay.display("FLD0142C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0142c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0142c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0143c, 1)).equals(String.valueOf(xpc_fld0143c))) {
            CobolDisplay.display("FLD0143C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0143c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0143c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0144c, 1)).equals(String.valueOf(xpc_fld0144c))) {
            CobolDisplay.display("FLD0144C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0144c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0144c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0145c, 1)).equals(String.valueOf(xpc_fld0145c))) {
            CobolDisplay.display("FLD0145C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0145c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0145c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0146c, 1)).equals(String.valueOf(xpc_fld0146c))) {
            CobolDisplay.display("FLD0146C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0146c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0146c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0147c, 1)).equals(String.valueOf(xpc_fld0147c))) {
            CobolDisplay.display("FLD0147C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0147c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0147c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0148c, 1)).equals(String.valueOf(xpc_fld0148c))) {
            CobolDisplay.display("FLD0148C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0148c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0148c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0149c, 1)).equals(String.valueOf(xpc_fld0149c))) {
            CobolDisplay.display("FLD0149C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0149c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0149c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0150c, 1)).equals(String.valueOf(xpc_fld0150c))) {
            CobolDisplay.display("FLD0150C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0150c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0150c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0151c, 1)).equals(String.valueOf(xpc_fld0151c))) {
            CobolDisplay.display("FLD0151C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0151c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0151c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0152c, 1)).equals(String.valueOf(xpc_fld0152c))) {
            CobolDisplay.display("FLD0152C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0152c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0152c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0153c, 1)).equals(String.valueOf(xpc_fld0153c))) {
            CobolDisplay.display("FLD0153C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0153c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0153c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0154c, 1)).equals(String.valueOf(xpc_fld0154c))) {
            CobolDisplay.display("FLD0154C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0154c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0154c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0155c, 1)).equals(String.valueOf(xpc_fld0155c))) {
            CobolDisplay.display("FLD0155C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0155c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0155c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0156c, 1)).equals(String.valueOf(xpc_fld0156c))) {
            CobolDisplay.display("FLD0156C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0156c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0156c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0157c, 1)).equals(String.valueOf(xpc_fld0157c))) {
            CobolDisplay.display("FLD0157C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0157c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0157c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0158c, 1)).equals(String.valueOf(xpc_fld0158c))) {
            CobolDisplay.display("FLD0158C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0158c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0158c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0159c, 1)).equals(String.valueOf(xpc_fld0159c))) {
            CobolDisplay.display("FLD0159C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0159c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0159c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0160c, 1)).equals(String.valueOf(xpc_fld0160c))) {
            CobolDisplay.display("FLD0160C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0160c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0160c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0161c, 1)).equals(String.valueOf(xpc_fld0161c))) {
            CobolDisplay.display("FLD0161C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0161c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0161c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0162c, 1)).equals(String.valueOf(xpc_fld0162c))) {
            CobolDisplay.display("FLD0162C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0162c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0162c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0163c, 1)).equals(String.valueOf(xpc_fld0163c))) {
            CobolDisplay.display("FLD0163C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0163c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0163c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0164c, 1)).equals(String.valueOf(xpc_fld0164c))) {
            CobolDisplay.display("FLD0164C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0164c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0164c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0165c, 1)).equals(String.valueOf(xpc_fld0165c))) {
            CobolDisplay.display("FLD0165C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0165c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0165c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0166c, 1)).equals(String.valueOf(xpc_fld0166c))) {
            CobolDisplay.display("FLD0166C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0166c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0166c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0167c, 1)).equals(String.valueOf(xpc_fld0167c))) {
            CobolDisplay.display("FLD0167C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0167c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0167c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0168c, 1)).equals(String.valueOf(xpc_fld0168c))) {
            CobolDisplay.display("FLD0168C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0168c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0168c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0169c, 1)).equals(String.valueOf(xpc_fld0169c))) {
            CobolDisplay.display("FLD0169C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0169c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0169c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0170c, 1)).equals(String.valueOf(xpc_fld0170c))) {
            CobolDisplay.display("FLD0170C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0170c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0170c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0171c, 1)).equals(String.valueOf(xpc_fld0171c))) {
            CobolDisplay.display("FLD0171C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0171c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0171c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0172c, 1)).equals(String.valueOf(xpc_fld0172c))) {
            CobolDisplay.display("FLD0172C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0172c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0172c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0173c, 1)).equals(String.valueOf(xpc_fld0173c))) {
            CobolDisplay.display("FLD0173C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0173c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0173c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0174c, 1)).equals(String.valueOf(xpc_fld0174c))) {
            CobolDisplay.display("FLD0174C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0174c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0174c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0175c, 1)).equals(String.valueOf(xpc_fld0175c))) {
            CobolDisplay.display("FLD0175C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0175c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0175c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0176c, 1)).equals(String.valueOf(xpc_fld0176c))) {
            CobolDisplay.display("FLD0176C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0176c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0176c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0177c, 1)).equals(String.valueOf(xpc_fld0177c))) {
            CobolDisplay.display("FLD0177C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0177c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0177c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0178c, 1)).equals(String.valueOf(xpc_fld0178c))) {
            CobolDisplay.display("FLD0178C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0178c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0178c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0179c, 1)).equals(String.valueOf(xpc_fld0179c))) {
            CobolDisplay.display("FLD0179C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0179c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0179c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0180c, 1)).equals(String.valueOf(xpc_fld0180c))) {
            CobolDisplay.display("FLD0180C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0180c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0180c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0181c, 1)).equals(String.valueOf(xpc_fld0181c))) {
            CobolDisplay.display("FLD0181C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0181c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0181c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0182c, 1)).equals(String.valueOf(xpc_fld0182c))) {
            CobolDisplay.display("FLD0182C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0182c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0182c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0183c, 1)).equals(String.valueOf(xpc_fld0183c))) {
            CobolDisplay.display("FLD0183C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0183c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0183c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0184c, 1)).equals(String.valueOf(xpc_fld0184c))) {
            CobolDisplay.display("FLD0184C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0184c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0184c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0185c, 1)).equals(String.valueOf(xpc_fld0185c))) {
            CobolDisplay.display("FLD0185C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0185c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0185c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0186c, 1)).equals(String.valueOf(xpc_fld0186c))) {
            CobolDisplay.display("FLD0186C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0186c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0186c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0187c, 1)).equals(String.valueOf(xpc_fld0187c))) {
            CobolDisplay.display("FLD0187C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0187c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0187c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0188c, 1)).equals(String.valueOf(xpc_fld0188c))) {
            CobolDisplay.display("FLD0188C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0188c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0188c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0189c, 1)).equals(String.valueOf(xpc_fld0189c))) {
            CobolDisplay.display("FLD0189C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0189c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0189c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0190c, 1)).equals(String.valueOf(xpc_fld0190c))) {
            CobolDisplay.display("FLD0190C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0190c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0190c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0191c, 1)).equals(String.valueOf(xpc_fld0191c))) {
            CobolDisplay.display("FLD0191C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0191c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0191c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0192c, 1)).equals(String.valueOf(xpc_fld0192c))) {
            CobolDisplay.display("FLD0192C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0192c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0192c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0193c, 1)).equals(String.valueOf(xpc_fld0193c))) {
            CobolDisplay.display("FLD0193C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0193c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0193c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0194c, 1)).equals(String.valueOf(xpc_fld0194c))) {
            CobolDisplay.display("FLD0194C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0194c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0194c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0195c, 1)).equals(String.valueOf(xpc_fld0195c))) {
            CobolDisplay.display("FLD0195C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0195c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0195c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0196c, 1)).equals(String.valueOf(xpc_fld0196c))) {
            CobolDisplay.display("FLD0196C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0196c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0196c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0197c, 1)).equals(String.valueOf(xpc_fld0197c))) {
            CobolDisplay.display("FLD0197C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0197c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0197c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0198c, 1)).equals(String.valueOf(xpc_fld0198c))) {
            CobolDisplay.display("FLD0198C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0198c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0198c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0199c, 1)).equals(String.valueOf(xpc_fld0199c))) {
            CobolDisplay.display("FLD0199C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0199c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0199c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0200c, 1)).equals(String.valueOf(xpc_fld0200c))) {
            CobolDisplay.display("FLD0200C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0200c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0200c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0201c, 1)).equals(String.valueOf(xpc_fld0201c))) {
            CobolDisplay.display("FLD0201C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0201c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0201c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0202c, 1)).equals(String.valueOf(xpc_fld0202c))) {
            CobolDisplay.display("FLD0202C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0202c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0202c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0203c, 1)).equals(String.valueOf(xpc_fld0203c))) {
            CobolDisplay.display("FLD0203C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0203c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0203c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0204c, 1)).equals(String.valueOf(xpc_fld0204c))) {
            CobolDisplay.display("FLD0204C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0204c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0204c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0205c, 1)).equals(String.valueOf(xpc_fld0205c))) {
            CobolDisplay.display("FLD0205C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0205c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0205c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0206c, 1)).equals(String.valueOf(xpc_fld0206c))) {
            CobolDisplay.display("FLD0206C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0206c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0206c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0207c, 1)).equals(String.valueOf(xpc_fld0207c))) {
            CobolDisplay.display("FLD0207C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0207c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0207c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0208c, 1)).equals(String.valueOf(xpc_fld0208c))) {
            CobolDisplay.display("FLD0208C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0208c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0208c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0209c, 1)).equals(String.valueOf(xpc_fld0209c))) {
            CobolDisplay.display("FLD0209C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0209c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0209c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0210c, 1)).equals(String.valueOf(xpc_fld0210c))) {
            CobolDisplay.display("FLD0210C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0210c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0210c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0211c, 1)).equals(String.valueOf(xpc_fld0211c))) {
            CobolDisplay.display("FLD0211C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0211c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0211c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0212c, 1)).equals(String.valueOf(xpc_fld0212c))) {
            CobolDisplay.display("FLD0212C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0212c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0212c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0213c, 1)).equals(String.valueOf(xpc_fld0213c))) {
            CobolDisplay.display("FLD0213C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0213c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0213c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0214c, 1)).equals(String.valueOf(xpc_fld0214c))) {
            CobolDisplay.display("FLD0214C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0214c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0214c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0215c, 1)).equals(String.valueOf(xpc_fld0215c))) {
            CobolDisplay.display("FLD0215C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0215c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0215c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0216c, 1)).equals(String.valueOf(xpc_fld0216c))) {
            CobolDisplay.display("FLD0216C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0216c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0216c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0217c, 1)).equals(String.valueOf(xpc_fld0217c))) {
            CobolDisplay.display("FLD0217C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0217c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0217c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0218c, 1)).equals(String.valueOf(xpc_fld0218c))) {
            CobolDisplay.display("FLD0218C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0218c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0218c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0219c, 1)).equals(String.valueOf(xpc_fld0219c))) {
            CobolDisplay.display("FLD0219C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0219c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0219c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0220c, 1)).equals(String.valueOf(xpc_fld0220c))) {
            CobolDisplay.display("FLD0220C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0220c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0220c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0221c, 1)).equals(String.valueOf(xpc_fld0221c))) {
            CobolDisplay.display("FLD0221C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0221c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0221c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0222c, 1)).equals(String.valueOf(xpc_fld0222c))) {
            CobolDisplay.display("FLD0222C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0222c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0222c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0223c, 1)).equals(String.valueOf(xpc_fld0223c))) {
            CobolDisplay.display("FLD0223C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0223c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0223c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0224c, 1)).equals(String.valueOf(xpc_fld0224c))) {
            CobolDisplay.display("FLD0224C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0224c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0224c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0225c, 1)).equals(String.valueOf(xpc_fld0225c))) {
            CobolDisplay.display("FLD0225C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0225c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0225c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0226c, 1)).equals(String.valueOf(xpc_fld0226c))) {
            CobolDisplay.display("FLD0226C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0226c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0226c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0227c, 1)).equals(String.valueOf(xpc_fld0227c))) {
            CobolDisplay.display("FLD0227C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0227c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0227c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0228c, 1)).equals(String.valueOf(xpc_fld0228c))) {
            CobolDisplay.display("FLD0228C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0228c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0228c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0229c, 1)).equals(String.valueOf(xpc_fld0229c))) {
            CobolDisplay.display("FLD0229C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0229c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0229c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0230c, 1)).equals(String.valueOf(xpc_fld0230c))) {
            CobolDisplay.display("FLD0230C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0230c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0230c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0231c, 1)).equals(String.valueOf(xpc_fld0231c))) {
            CobolDisplay.display("FLD0231C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0231c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0231c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0232c, 1)).equals(String.valueOf(xpc_fld0232c))) {
            CobolDisplay.display("FLD0232C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0232c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0232c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0233c, 1)).equals(String.valueOf(xpc_fld0233c))) {
            CobolDisplay.display("FLD0233C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0233c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0233c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0234c, 1)).equals(String.valueOf(xpc_fld0234c))) {
            CobolDisplay.display("FLD0234C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0234c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0234c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0235c, 1)).equals(String.valueOf(xpc_fld0235c))) {
            CobolDisplay.display("FLD0235C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0235c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0235c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0236c, 1)).equals(String.valueOf(xpc_fld0236c))) {
            CobolDisplay.display("FLD0236C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0236c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0236c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0237c, 1)).equals(String.valueOf(xpc_fld0237c))) {
            CobolDisplay.display("FLD0237C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0237c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0237c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0238c, 1)).equals(String.valueOf(xpc_fld0238c))) {
            CobolDisplay.display("FLD0238C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0238c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0238c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0239c, 1)).equals(String.valueOf(xpc_fld0239c))) {
            CobolDisplay.display("FLD0239C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0239c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0239c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0240c, 1)).equals(String.valueOf(xpc_fld0240c))) {
            CobolDisplay.display("FLD0240C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0240c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0240c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0241c, 1)).equals(String.valueOf(xpc_fld0241c))) {
            CobolDisplay.display("FLD0241C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0241c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0241c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0242c, 1)).equals(String.valueOf(xpc_fld0242c))) {
            CobolDisplay.display("FLD0242C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0242c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0242c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0243c, 1)).equals(String.valueOf(xpc_fld0243c))) {
            CobolDisplay.display("FLD0243C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0243c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0243c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0244c, 1)).equals(String.valueOf(xpc_fld0244c))) {
            CobolDisplay.display("FLD0244C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0244c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0244c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0245c, 1)).equals(String.valueOf(xpc_fld0245c))) {
            CobolDisplay.display("FLD0245C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0245c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0245c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0246c, 1)).equals(String.valueOf(xpc_fld0246c))) {
            CobolDisplay.display("FLD0246C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0246c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0246c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0247c, 1)).equals(String.valueOf(xpc_fld0247c))) {
            CobolDisplay.display("FLD0247C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0247c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0247c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0248c, 1)).equals(String.valueOf(xpc_fld0248c))) {
            CobolDisplay.display("FLD0248C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0248c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0248c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0249c, 1)).equals(String.valueOf(xpc_fld0249c))) {
            CobolDisplay.display("FLD0249C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0249c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0249c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0250c, 1)).equals(String.valueOf(xpc_fld0250c))) {
            CobolDisplay.display("FLD0250C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0250c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0250c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0251c, 1)).equals(String.valueOf(xpc_fld0251c))) {
            CobolDisplay.display("FLD0251C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0251c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0251c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0252c, 1)).equals(String.valueOf(xpc_fld0252c))) {
            CobolDisplay.display("FLD0252C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0252c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0252c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0253c, 1)).equals(String.valueOf(xpc_fld0253c))) {
            CobolDisplay.display("FLD0253C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0253c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0253c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0254c, 1)).equals(String.valueOf(xpc_fld0254c))) {
            CobolDisplay.display("FLD0254C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0254c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0254c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0255c, 1)).equals(String.valueOf(xpc_fld0255c))) {
            CobolDisplay.display("FLD0255C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0255c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0255c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0256c, 1)).equals(String.valueOf(xpc_fld0256c))) {
            CobolDisplay.display("FLD0256C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0256c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0256c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0257c, 1)).equals(String.valueOf(xpc_fld0257c))) {
            CobolDisplay.display("FLD0257C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0257c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0257c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0258c, 1)).equals(String.valueOf(xpc_fld0258c))) {
            CobolDisplay.display("FLD0258C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0258c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0258c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0259c, 1)).equals(String.valueOf(xpc_fld0259c))) {
            CobolDisplay.display("FLD0259C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0259c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0259c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0260c, 1)).equals(String.valueOf(xpc_fld0260c))) {
            CobolDisplay.display("FLD0260C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0260c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0260c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0261c, 1)).equals(String.valueOf(xpc_fld0261c))) {
            CobolDisplay.display("FLD0261C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0261c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0261c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0262c, 1)).equals(String.valueOf(xpc_fld0262c))) {
            CobolDisplay.display("FLD0262C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0262c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0262c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0263c, 1)).equals(String.valueOf(xpc_fld0263c))) {
            CobolDisplay.display("FLD0263C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0263c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0263c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0264c, 1)).equals(String.valueOf(xpc_fld0264c))) {
            CobolDisplay.display("FLD0264C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0264c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0264c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0265c, 1)).equals(String.valueOf(xpc_fld0265c))) {
            CobolDisplay.display("FLD0265C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0265c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0265c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0266c, 1)).equals(String.valueOf(xpc_fld0266c))) {
            CobolDisplay.display("FLD0266C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0266c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0266c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0267c, 1)).equals(String.valueOf(xpc_fld0267c))) {
            CobolDisplay.display("FLD0267C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0267c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0267c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0268c, 1)).equals(String.valueOf(xpc_fld0268c))) {
            CobolDisplay.display("FLD0268C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0268c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0268c).trim()) - 1]));
        }
    }
    private void _4000_compare_part2() {
        if (!String.valueOf(CobolString.refMod(fld0269c, 1)).equals(String.valueOf(xpc_fld0269c))) {
            CobolDisplay.display("FLD0269C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0269c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0269c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0270c, 1)).equals(String.valueOf(xpc_fld0270c))) {
            CobolDisplay.display("FLD0270C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0270c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0270c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0271c, 1)).equals(String.valueOf(xpc_fld0271c))) {
            CobolDisplay.display("FLD0271C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0271c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0271c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0272c, 1)).equals(String.valueOf(xpc_fld0272c))) {
            CobolDisplay.display("FLD0272C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0272c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0272c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0273c, 1)).equals(String.valueOf(xpc_fld0273c))) {
            CobolDisplay.display("FLD0273C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0273c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0273c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0274c, 1)).equals(String.valueOf(xpc_fld0274c))) {
            CobolDisplay.display("FLD0274C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0274c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0274c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0275c, 1)).equals(String.valueOf(xpc_fld0275c))) {
            CobolDisplay.display("FLD0275C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0275c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0275c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0276c, 1)).equals(String.valueOf(xpc_fld0276c))) {
            CobolDisplay.display("FLD0276C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0276c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0276c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0277c, 1)).equals(String.valueOf(xpc_fld0277c))) {
            CobolDisplay.display("FLD0277C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0277c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0277c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0278c, 1)).equals(String.valueOf(xpc_fld0278c))) {
            CobolDisplay.display("FLD0278C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0278c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0278c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0279c, 1)).equals(String.valueOf(xpc_fld0279c))) {
            CobolDisplay.display("FLD0279C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0279c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0279c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0280c, 1)).equals(String.valueOf(xpc_fld0280c))) {
            CobolDisplay.display("FLD0280C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0280c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0280c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0281c, 1)).equals(String.valueOf(xpc_fld0281c))) {
            CobolDisplay.display("FLD0281C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0281c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0281c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0282c, 1)).equals(String.valueOf(xpc_fld0282c))) {
            CobolDisplay.display("FLD0282C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0282c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0282c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0283c, 1)).equals(String.valueOf(xpc_fld0283c))) {
            CobolDisplay.display("FLD0283C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0283c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0283c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0284c, 1)).equals(String.valueOf(xpc_fld0284c))) {
            CobolDisplay.display("FLD0284C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0284c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0284c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0285c, 1)).equals(String.valueOf(xpc_fld0285c))) {
            CobolDisplay.display("FLD0285C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0285c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0285c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0286c, 1)).equals(String.valueOf(xpc_fld0286c))) {
            CobolDisplay.display("FLD0286C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0286c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0286c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0287c, 1)).equals(String.valueOf(xpc_fld0287c))) {
            CobolDisplay.display("FLD0287C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0287c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0287c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0288c, 1)).equals(String.valueOf(xpc_fld0288c))) {
            CobolDisplay.display("FLD0288C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0288c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0288c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0289c, 1)).equals(String.valueOf(xpc_fld0289c))) {
            CobolDisplay.display("FLD0289C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0289c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0289c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0290c, 1)).equals(String.valueOf(xpc_fld0290c))) {
            CobolDisplay.display("FLD0290C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0290c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0290c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0291c, 1)).equals(String.valueOf(xpc_fld0291c))) {
            CobolDisplay.display("FLD0291C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0291c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0291c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0292c, 1)).equals(String.valueOf(xpc_fld0292c))) {
            CobolDisplay.display("FLD0292C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0292c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0292c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0293c, 1)).equals(String.valueOf(xpc_fld0293c))) {
            CobolDisplay.display("FLD0293C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0293c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0293c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0294c, 1)).equals(String.valueOf(xpc_fld0294c))) {
            CobolDisplay.display("FLD0294C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0294c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0294c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0295c, 1)).equals(String.valueOf(xpc_fld0295c))) {
            CobolDisplay.display("FLD0295C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0295c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0295c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0296c, 1)).equals(String.valueOf(xpc_fld0296c))) {
            CobolDisplay.display("FLD0296C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0296c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0296c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0297c, 1)).equals(String.valueOf(xpc_fld0297c))) {
            CobolDisplay.display("FLD0297C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0297c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0297c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0298c, 1)).equals(String.valueOf(xpc_fld0298c))) {
            CobolDisplay.display("FLD0298C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0298c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0298c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0299c, 1)).equals(String.valueOf(xpc_fld0299c))) {
            CobolDisplay.display("FLD0299C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0299c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0299c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0300c, 1)).equals(String.valueOf(xpc_fld0300c))) {
            CobolDisplay.display("FLD0300C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0300c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0300c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0301c, 1)).equals(String.valueOf(xpc_fld0301c))) {
            CobolDisplay.display("FLD0301C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0301c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0301c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0302c, 1)).equals(String.valueOf(xpc_fld0302c))) {
            CobolDisplay.display("FLD0302C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0302c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0302c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0303c, 1)).equals(String.valueOf(xpc_fld0303c))) {
            CobolDisplay.display("FLD0303C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0303c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0303c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0304c, 1)).equals(String.valueOf(xpc_fld0304c))) {
            CobolDisplay.display("FLD0304C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0304c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0304c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0305c, 1)).equals(String.valueOf(xpc_fld0305c))) {
            CobolDisplay.display("FLD0305C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0305c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0305c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0306c, 1)).equals(String.valueOf(xpc_fld0306c))) {
            CobolDisplay.display("FLD0306C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0306c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0306c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0307c, 1)).equals(String.valueOf(xpc_fld0307c))) {
            CobolDisplay.display("FLD0307C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0307c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0307c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0308c, 1)).equals(String.valueOf(xpc_fld0308c))) {
            CobolDisplay.display("FLD0308C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0308c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0308c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0309c, 1)).equals(String.valueOf(xpc_fld0309c))) {
            CobolDisplay.display("FLD0309C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0309c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0309c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0310c, 1)).equals(String.valueOf(xpc_fld0310c))) {
            CobolDisplay.display("FLD0310C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0310c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0310c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0311c, 1)).equals(String.valueOf(xpc_fld0311c))) {
            CobolDisplay.display("FLD0311C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0311c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0311c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0312c, 1)).equals(String.valueOf(xpc_fld0312c))) {
            CobolDisplay.display("FLD0312C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0312c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0312c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0313c, 1)).equals(String.valueOf(xpc_fld0313c))) {
            CobolDisplay.display("FLD0313C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0313c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0313c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0314c, 1)).equals(String.valueOf(xpc_fld0314c))) {
            CobolDisplay.display("FLD0314C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0314c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0314c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0315c, 1)).equals(String.valueOf(xpc_fld0315c))) {
            CobolDisplay.display("FLD0315C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0315c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0315c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0316c, 1)).equals(String.valueOf(xpc_fld0316c))) {
            CobolDisplay.display("FLD0316C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0316c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0316c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0317c, 1)).equals(String.valueOf(xpc_fld0317c))) {
            CobolDisplay.display("FLD0317C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0317c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0317c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0318c, 1)).equals(String.valueOf(xpc_fld0318c))) {
            CobolDisplay.display("FLD0318C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0318c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0318c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0319c, 1)).equals(String.valueOf(xpc_fld0319c))) {
            CobolDisplay.display("FLD0319C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0319c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0319c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0320c, 1)).equals(String.valueOf(xpc_fld0320c))) {
            CobolDisplay.display("FLD0320C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0320c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0320c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0321c, 1)).equals(String.valueOf(xpc_fld0321c))) {
            CobolDisplay.display("FLD0321C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0321c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0321c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0322c, 1)).equals(String.valueOf(xpc_fld0322c))) {
            CobolDisplay.display("FLD0322C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0322c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0322c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0323c, 1)).equals(String.valueOf(xpc_fld0323c))) {
            CobolDisplay.display("FLD0323C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0323c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0323c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0324c, 1)).equals(String.valueOf(xpc_fld0324c))) {
            CobolDisplay.display("FLD0324C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0324c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0324c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0325c, 1)).equals(String.valueOf(xpc_fld0325c))) {
            CobolDisplay.display("FLD0325C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0325c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0325c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0326c, 1)).equals(String.valueOf(xpc_fld0326c))) {
            CobolDisplay.display("FLD0326C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0326c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0326c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0327c, 1)).equals(String.valueOf(xpc_fld0327c))) {
            CobolDisplay.display("FLD0327C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0327c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0327c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0328c, 1)).equals(String.valueOf(xpc_fld0328c))) {
            CobolDisplay.display("FLD0328C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0328c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0328c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0329c, 1)).equals(String.valueOf(xpc_fld0329c))) {
            CobolDisplay.display("FLD0329C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0329c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0329c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0330c, 1)).equals(String.valueOf(xpc_fld0330c))) {
            CobolDisplay.display("FLD0330C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0330c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0330c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0331c, 1)).equals(String.valueOf(xpc_fld0331c))) {
            CobolDisplay.display("FLD0331C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0331c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0331c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0332c, 1)).equals(String.valueOf(xpc_fld0332c))) {
            CobolDisplay.display("FLD0332C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0332c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0332c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0333c, 1)).equals(String.valueOf(xpc_fld0333c))) {
            CobolDisplay.display("FLD0333C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0333c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0333c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0334c, 1)).equals(String.valueOf(xpc_fld0334c))) {
            CobolDisplay.display("FLD0334C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0334c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0334c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0335c, 1)).equals(String.valueOf(xpc_fld0335c))) {
            CobolDisplay.display("FLD0335C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0335c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0335c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0336c, 1)).equals(String.valueOf(xpc_fld0336c))) {
            CobolDisplay.display("FLD0336C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0336c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0336c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0337c, 1)).equals(String.valueOf(xpc_fld0337c))) {
            CobolDisplay.display("FLD0337C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0337c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0337c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0338c, 1)).equals(String.valueOf(xpc_fld0338c))) {
            CobolDisplay.display("FLD0338C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0338c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0338c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0339c, 1)).equals(String.valueOf(xpc_fld0339c))) {
            CobolDisplay.display("FLD0339C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0339c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0339c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0340c, 1)).equals(String.valueOf(xpc_fld0340c))) {
            CobolDisplay.display("FLD0340C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0340c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0340c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0341c, 1)).equals(String.valueOf(xpc_fld0341c))) {
            CobolDisplay.display("FLD0341C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0341c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0341c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0342c, 1)).equals(String.valueOf(xpc_fld0342c))) {
            CobolDisplay.display("FLD0342C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0342c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0342c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0343c, 1)).equals(String.valueOf(xpc_fld0343c))) {
            CobolDisplay.display("FLD0343C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0343c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0343c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0344c, 1)).equals(String.valueOf(xpc_fld0344c))) {
            CobolDisplay.display("FLD0344C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0344c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0344c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0345c, 1)).equals(String.valueOf(xpc_fld0345c))) {
            CobolDisplay.display("FLD0345C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0345c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0345c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0346c, 1)).equals(String.valueOf(xpc_fld0346c))) {
            CobolDisplay.display("FLD0346C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0346c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0346c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0347c, 1)).equals(String.valueOf(xpc_fld0347c))) {
            CobolDisplay.display("FLD0347C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0347c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0347c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0348c, 1)).equals(String.valueOf(xpc_fld0348c))) {
            CobolDisplay.display("FLD0348C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0348c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0348c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0349c, 1)).equals(String.valueOf(xpc_fld0349c))) {
            CobolDisplay.display("FLD0349C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0349c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0349c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0350c, 1)).equals(String.valueOf(xpc_fld0350c))) {
            CobolDisplay.display("FLD0350C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0350c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0350c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0351c, 1)).equals(String.valueOf(xpc_fld0351c))) {
            CobolDisplay.display("FLD0351C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0351c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0351c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0352c, 1)).equals(String.valueOf(xpc_fld0352c))) {
            CobolDisplay.display("FLD0352C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0352c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0352c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0353c, 1)).equals(String.valueOf(xpc_fld0353c))) {
            CobolDisplay.display("FLD0353C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0353c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0353c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0354c, 1)).equals(String.valueOf(xpc_fld0354c))) {
            CobolDisplay.display("FLD0354C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0354c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0354c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0355c, 1)).equals(String.valueOf(xpc_fld0355c))) {
            CobolDisplay.display("FLD0355C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0355c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0355c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0356c, 1)).equals(String.valueOf(xpc_fld0356c))) {
            CobolDisplay.display("FLD0356C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0356c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0356c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0357c, 1)).equals(String.valueOf(xpc_fld0357c))) {
            CobolDisplay.display("FLD0357C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0357c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0357c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0358c, 1)).equals(String.valueOf(xpc_fld0358c))) {
            CobolDisplay.display("FLD0358C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0358c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0358c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0359c, 1)).equals(String.valueOf(xpc_fld0359c))) {
            CobolDisplay.display("FLD0359C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0359c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0359c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0360c, 1)).equals(String.valueOf(xpc_fld0360c))) {
            CobolDisplay.display("FLD0360C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0360c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0360c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0361c, 1)).equals(String.valueOf(xpc_fld0361c))) {
            CobolDisplay.display("FLD0361C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0361c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0361c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0362c, 1)).equals(String.valueOf(xpc_fld0362c))) {
            CobolDisplay.display("FLD0362C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0362c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0362c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0363c, 1)).equals(String.valueOf(xpc_fld0363c))) {
            CobolDisplay.display("FLD0363C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0363c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0363c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0364c, 1)).equals(String.valueOf(xpc_fld0364c))) {
            CobolDisplay.display("FLD0364C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0364c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0364c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0365c, 1)).equals(String.valueOf(xpc_fld0365c))) {
            CobolDisplay.display("FLD0365C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0365c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0365c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0366c, 1)).equals(String.valueOf(xpc_fld0366c))) {
            CobolDisplay.display("FLD0366C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0366c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0366c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0367c, 1)).equals(String.valueOf(xpc_fld0367c))) {
            CobolDisplay.display("FLD0367C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0367c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0367c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0368c, 1)).equals(String.valueOf(xpc_fld0368c))) {
            CobolDisplay.display("FLD0368C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0368c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0368c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0369c, 1)).equals(String.valueOf(xpc_fld0369c))) {
            CobolDisplay.display("FLD0369C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0369c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0369c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0370c, 1)).equals(String.valueOf(xpc_fld0370c))) {
            CobolDisplay.display("FLD0370C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0370c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0370c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0371c, 1)).equals(String.valueOf(xpc_fld0371c))) {
            CobolDisplay.display("FLD0371C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0371c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0371c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0372c, 1)).equals(String.valueOf(xpc_fld0372c))) {
            CobolDisplay.display("FLD0372C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0372c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0372c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0373c, 1)).equals(String.valueOf(xpc_fld0373c))) {
            CobolDisplay.display("FLD0373C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0373c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0373c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0374c, 1)).equals(String.valueOf(xpc_fld0374c))) {
            CobolDisplay.display("FLD0374C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0374c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0374c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0375c, 1)).equals(String.valueOf(xpc_fld0375c))) {
            CobolDisplay.display("FLD0375C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0375c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0375c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0376c, 1)).equals(String.valueOf(xpc_fld0376c))) {
            CobolDisplay.display("FLD0376C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0376c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0376c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0377c, 1)).equals(String.valueOf(xpc_fld0377c))) {
            CobolDisplay.display("FLD0377C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0377c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0377c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0378c, 1)).equals(String.valueOf(xpc_fld0378c))) {
            CobolDisplay.display("FLD0378C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0378c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0378c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0379c, 1)).equals(String.valueOf(xpc_fld0379c))) {
            CobolDisplay.display("FLD0379C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0379c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0379c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0380c, 1)).equals(String.valueOf(xpc_fld0380c))) {
            CobolDisplay.display("FLD0380C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0380c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0380c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0381c, 1)).equals(String.valueOf(xpc_fld0381c))) {
            CobolDisplay.display("FLD0381C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0381c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0381c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0382c, 1)).equals(String.valueOf(xpc_fld0382c))) {
            CobolDisplay.display("FLD0382C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0382c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0382c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0383c, 1)).equals(String.valueOf(xpc_fld0383c))) {
            CobolDisplay.display("FLD0383C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0383c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0383c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0384c, 1)).equals(String.valueOf(xpc_fld0384c))) {
            CobolDisplay.display("FLD0384C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0384c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0384c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0385c, 1)).equals(String.valueOf(xpc_fld0385c))) {
            CobolDisplay.display("FLD0385C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0385c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0385c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0386c, 1)).equals(String.valueOf(xpc_fld0386c))) {
            CobolDisplay.display("FLD0386C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0386c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0386c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0387c, 1)).equals(String.valueOf(xpc_fld0387c))) {
            CobolDisplay.display("FLD0387C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0387c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0387c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0388c, 1)).equals(String.valueOf(xpc_fld0388c))) {
            CobolDisplay.display("FLD0388C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0388c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0388c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0389c, 1)).equals(String.valueOf(xpc_fld0389c))) {
            CobolDisplay.display("FLD0389C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0389c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0389c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0390c, 1)).equals(String.valueOf(xpc_fld0390c))) {
            CobolDisplay.display("FLD0390C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0390c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0390c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0391c, 1)).equals(String.valueOf(xpc_fld0391c))) {
            CobolDisplay.display("FLD0391C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0391c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0391c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0392c, 1)).equals(String.valueOf(xpc_fld0392c))) {
            CobolDisplay.display("FLD0392C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0392c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0392c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0393c, 1)).equals(String.valueOf(xpc_fld0393c))) {
            CobolDisplay.display("FLD0393C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0393c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0393c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0394c, 1)).equals(String.valueOf(xpc_fld0394c))) {
            CobolDisplay.display("FLD0394C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0394c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0394c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0395c, 1)).equals(String.valueOf(xpc_fld0395c))) {
            CobolDisplay.display("FLD0395C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0395c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0395c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0396c, 1)).equals(String.valueOf(xpc_fld0396c))) {
            CobolDisplay.display("FLD0396C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0396c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0396c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0397c, 1)).equals(String.valueOf(xpc_fld0397c))) {
            CobolDisplay.display("FLD0397C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0397c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0397c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0398c, 1)).equals(String.valueOf(xpc_fld0398c))) {
            CobolDisplay.display("FLD0398C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0398c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0398c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0399c, 1)).equals(String.valueOf(xpc_fld0399c))) {
            CobolDisplay.display("FLD0399C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0399c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0399c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0400c, 1)).equals(String.valueOf(xpc_fld0400c))) {
            CobolDisplay.display("FLD0400C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0400c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0400c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0401c, 1)).equals(String.valueOf(xpc_fld0401c))) {
            CobolDisplay.display("FLD0401C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0401c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0401c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0402c, 1)).equals(String.valueOf(xpc_fld0402c))) {
            CobolDisplay.display("FLD0402C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0402c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0402c).trim()) - 1]));
        }
    }
    private void _4000_compare_part3() {
        if (!String.valueOf(CobolString.refMod(fld0403c, 1)).equals(String.valueOf(xpc_fld0403c))) {
            CobolDisplay.display("FLD0403C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0403c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0403c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0404c, 1)).equals(String.valueOf(xpc_fld0404c))) {
            CobolDisplay.display("FLD0404C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0404c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0404c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0405c, 1)).equals(String.valueOf(xpc_fld0405c))) {
            CobolDisplay.display("FLD0405C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0405c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0405c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0406c, 1)).equals(String.valueOf(xpc_fld0406c))) {
            CobolDisplay.display("FLD0406C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0406c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0406c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0407c, 1)).equals(String.valueOf(xpc_fld0407c))) {
            CobolDisplay.display("FLD0407C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0407c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0407c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0408c, 1)).equals(String.valueOf(xpc_fld0408c))) {
            CobolDisplay.display("FLD0408C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0408c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0408c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0409c, 1)).equals(String.valueOf(xpc_fld0409c))) {
            CobolDisplay.display("FLD0409C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0409c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0409c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0410c, 1)).equals(String.valueOf(xpc_fld0410c))) {
            CobolDisplay.display("FLD0410C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0410c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0410c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0411c, 1)).equals(String.valueOf(xpc_fld0411c))) {
            CobolDisplay.display("FLD0411C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0411c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0411c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0412c, 1)).equals(String.valueOf(xpc_fld0412c))) {
            CobolDisplay.display("FLD0412C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0412c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0412c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0413c, 1)).equals(String.valueOf(xpc_fld0413c))) {
            CobolDisplay.display("FLD0413C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0413c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0413c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0414c, 1)).equals(String.valueOf(xpc_fld0414c))) {
            CobolDisplay.display("FLD0414C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0414c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0414c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0415c, 1)).equals(String.valueOf(xpc_fld0415c))) {
            CobolDisplay.display("FLD0415C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0415c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0415c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0416c, 1)).equals(String.valueOf(xpc_fld0416c))) {
            CobolDisplay.display("FLD0416C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0416c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0416c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0417c, 1)).equals(String.valueOf(xpc_fld0417c))) {
            CobolDisplay.display("FLD0417C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0417c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0417c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0418c, 1)).equals(String.valueOf(xpc_fld0418c))) {
            CobolDisplay.display("FLD0418C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0418c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0418c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0419c, 1)).equals(String.valueOf(xpc_fld0419c))) {
            CobolDisplay.display("FLD0419C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0419c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0419c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0420c, 1)).equals(String.valueOf(xpc_fld0420c))) {
            CobolDisplay.display("FLD0420C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0420c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0420c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0421c, 1)).equals(String.valueOf(xpc_fld0421c))) {
            CobolDisplay.display("FLD0421C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0421c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0421c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0422c, 1)).equals(String.valueOf(xpc_fld0422c))) {
            CobolDisplay.display("FLD0422C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0422c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0422c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0423c, 1)).equals(String.valueOf(xpc_fld0423c))) {
            CobolDisplay.display("FLD0423C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0423c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0423c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0424c, 1)).equals(String.valueOf(xpc_fld0424c))) {
            CobolDisplay.display("FLD0424C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0424c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0424c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0425c, 1)).equals(String.valueOf(xpc_fld0425c))) {
            CobolDisplay.display("FLD0425C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0425c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0425c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0426c, 1)).equals(String.valueOf(xpc_fld0426c))) {
            CobolDisplay.display("FLD0426C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0426c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0426c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0427c, 1)).equals(String.valueOf(xpc_fld0427c))) {
            CobolDisplay.display("FLD0427C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0427c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0427c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0428c, 1)).equals(String.valueOf(xpc_fld0428c))) {
            CobolDisplay.display("FLD0428C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0428c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0428c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0429c, 1)).equals(String.valueOf(xpc_fld0429c))) {
            CobolDisplay.display("FLD0429C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0429c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0429c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0430c, 1)).equals(String.valueOf(xpc_fld0430c))) {
            CobolDisplay.display("FLD0430C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0430c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0430c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0431c, 1)).equals(String.valueOf(xpc_fld0431c))) {
            CobolDisplay.display("FLD0431C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0431c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0431c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0432c, 1)).equals(String.valueOf(xpc_fld0432c))) {
            CobolDisplay.display("FLD0432C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0432c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0432c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0433c, 1)).equals(String.valueOf(xpc_fld0433c))) {
            CobolDisplay.display("FLD0433C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0433c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0433c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0434c, 1)).equals(String.valueOf(xpc_fld0434c))) {
            CobolDisplay.display("FLD0434C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0434c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0434c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0435c, 1)).equals(String.valueOf(xpc_fld0435c))) {
            CobolDisplay.display("FLD0435C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0435c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0435c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0436c, 1)).equals(String.valueOf(xpc_fld0436c))) {
            CobolDisplay.display("FLD0436C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0436c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0436c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0437c, 1)).equals(String.valueOf(xpc_fld0437c))) {
            CobolDisplay.display("FLD0437C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0437c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0437c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0438c, 1)).equals(String.valueOf(xpc_fld0438c))) {
            CobolDisplay.display("FLD0438C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0438c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0438c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0439c, 1)).equals(String.valueOf(xpc_fld0439c))) {
            CobolDisplay.display("FLD0439C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0439c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0439c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0440c, 1)).equals(String.valueOf(xpc_fld0440c))) {
            CobolDisplay.display("FLD0440C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0440c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0440c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0441c, 1)).equals(String.valueOf(xpc_fld0441c))) {
            CobolDisplay.display("FLD0441C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0441c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0441c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0442c, 1)).equals(String.valueOf(xpc_fld0442c))) {
            CobolDisplay.display("FLD0442C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0442c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0442c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0443c, 1)).equals(String.valueOf(xpc_fld0443c))) {
            CobolDisplay.display("FLD0443C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0443c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0443c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0444c, 1)).equals(String.valueOf(xpc_fld0444c))) {
            CobolDisplay.display("FLD0444C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0444c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0444c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0445c, 1)).equals(String.valueOf(xpc_fld0445c))) {
            CobolDisplay.display("FLD0445C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0445c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0445c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0446c, 1)).equals(String.valueOf(xpc_fld0446c))) {
            CobolDisplay.display("FLD0446C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0446c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0446c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0447c, 1)).equals(String.valueOf(xpc_fld0447c))) {
            CobolDisplay.display("FLD0447C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0447c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0447c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0448c, 1)).equals(String.valueOf(xpc_fld0448c))) {
            CobolDisplay.display("FLD0448C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0448c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0448c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0449c, 1)).equals(String.valueOf(xpc_fld0449c))) {
            CobolDisplay.display("FLD0449C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0449c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0449c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0450c, 1)).equals(String.valueOf(xpc_fld0450c))) {
            CobolDisplay.display("FLD0450C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0450c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0450c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0451c, 1)).equals(String.valueOf(xpc_fld0451c))) {
            CobolDisplay.display("FLD0451C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0451c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0451c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0452c, 1)).equals(String.valueOf(xpc_fld0452c))) {
            CobolDisplay.display("FLD0452C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0452c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0452c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0453c, 1)).equals(String.valueOf(xpc_fld0453c))) {
            CobolDisplay.display("FLD0453C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0453c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0453c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0454c, 1)).equals(String.valueOf(xpc_fld0454c))) {
            CobolDisplay.display("FLD0454C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0454c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0454c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0455c, 1)).equals(String.valueOf(xpc_fld0455c))) {
            CobolDisplay.display("FLD0455C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0455c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0455c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0456c, 1)).equals(String.valueOf(xpc_fld0456c))) {
            CobolDisplay.display("FLD0456C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0456c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0456c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0457c, 1)).equals(String.valueOf(xpc_fld0457c))) {
            CobolDisplay.display("FLD0457C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0457c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0457c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0458c, 1)).equals(String.valueOf(xpc_fld0458c))) {
            CobolDisplay.display("FLD0458C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0458c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0458c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0459c, 1)).equals(String.valueOf(xpc_fld0459c))) {
            CobolDisplay.display("FLD0459C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0459c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0459c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0460c, 1)).equals(String.valueOf(xpc_fld0460c))) {
            CobolDisplay.display("FLD0460C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0460c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0460c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0461c, 1)).equals(String.valueOf(xpc_fld0461c))) {
            CobolDisplay.display("FLD0461C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0461c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0461c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0462c, 1)).equals(String.valueOf(xpc_fld0462c))) {
            CobolDisplay.display("FLD0462C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0462c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0462c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0463c, 1)).equals(String.valueOf(xpc_fld0463c))) {
            CobolDisplay.display("FLD0463C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0463c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0463c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0464c, 1)).equals(String.valueOf(xpc_fld0464c))) {
            CobolDisplay.display("FLD0464C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0464c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0464c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0465c, 1)).equals(String.valueOf(xpc_fld0465c))) {
            CobolDisplay.display("FLD0465C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0465c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0465c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0466c, 1)).equals(String.valueOf(xpc_fld0466c))) {
            CobolDisplay.display("FLD0466C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0466c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0466c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0467c, 1)).equals(String.valueOf(xpc_fld0467c))) {
            CobolDisplay.display("FLD0467C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0467c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0467c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0468c, 1)).equals(String.valueOf(xpc_fld0468c))) {
            CobolDisplay.display("FLD0468C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0468c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0468c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0469c, 1)).equals(String.valueOf(xpc_fld0469c))) {
            CobolDisplay.display("FLD0469C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0469c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0469c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0470c, 1)).equals(String.valueOf(xpc_fld0470c))) {
            CobolDisplay.display("FLD0470C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0470c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0470c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0471c, 1)).equals(String.valueOf(xpc_fld0471c))) {
            CobolDisplay.display("FLD0471C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0471c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0471c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0472c, 1)).equals(String.valueOf(xpc_fld0472c))) {
            CobolDisplay.display("FLD0472C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0472c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0472c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0473c, 1)).equals(String.valueOf(xpc_fld0473c))) {
            CobolDisplay.display("FLD0473C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0473c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0473c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0474c, 1)).equals(String.valueOf(xpc_fld0474c))) {
            CobolDisplay.display("FLD0474C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0474c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0474c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0475c, 1)).equals(String.valueOf(xpc_fld0475c))) {
            CobolDisplay.display("FLD0475C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0475c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0475c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0476c, 1)).equals(String.valueOf(xpc_fld0476c))) {
            CobolDisplay.display("FLD0476C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0476c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0476c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0477c, 1)).equals(String.valueOf(xpc_fld0477c))) {
            CobolDisplay.display("FLD0477C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0477c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0477c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0478c, 1)).equals(String.valueOf(xpc_fld0478c))) {
            CobolDisplay.display("FLD0478C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0478c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0478c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0479c, 1)).equals(String.valueOf(xpc_fld0479c))) {
            CobolDisplay.display("FLD0479C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0479c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0479c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0480c, 1)).equals(String.valueOf(xpc_fld0480c))) {
            CobolDisplay.display("FLD0480C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0480c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0480c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0481c, 1)).equals(String.valueOf(xpc_fld0481c))) {
            CobolDisplay.display("FLD0481C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0481c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0481c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0482c, 1)).equals(String.valueOf(xpc_fld0482c))) {
            CobolDisplay.display("FLD0482C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0482c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0482c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0483c, 1)).equals(String.valueOf(xpc_fld0483c))) {
            CobolDisplay.display("FLD0483C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0483c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0483c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0484c, 1)).equals(String.valueOf(xpc_fld0484c))) {
            CobolDisplay.display("FLD0484C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0484c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0484c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0485c, 1)).equals(String.valueOf(xpc_fld0485c))) {
            CobolDisplay.display("FLD0485C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0485c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0485c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0486c, 1)).equals(String.valueOf(xpc_fld0486c))) {
            CobolDisplay.display("FLD0486C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0486c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0486c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0487c, 1)).equals(String.valueOf(xpc_fld0487c))) {
            CobolDisplay.display("FLD0487C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0487c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0487c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0488c, 1)).equals(String.valueOf(xpc_fld0488c))) {
            CobolDisplay.display("FLD0488C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0488c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0488c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0489c, 1)).equals(String.valueOf(xpc_fld0489c))) {
            CobolDisplay.display("FLD0489C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0489c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0489c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0490c, 1)).equals(String.valueOf(xpc_fld0490c))) {
            CobolDisplay.display("FLD0490C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0490c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0490c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0491c, 1)).equals(String.valueOf(xpc_fld0491c))) {
            CobolDisplay.display("FLD0491C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0491c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0491c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0492c, 1)).equals(String.valueOf(xpc_fld0492c))) {
            CobolDisplay.display("FLD0492C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0492c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0492c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0493c, 1)).equals(String.valueOf(xpc_fld0493c))) {
            CobolDisplay.display("FLD0493C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0493c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0493c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0494c, 1)).equals(String.valueOf(xpc_fld0494c))) {
            CobolDisplay.display("FLD0494C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0494c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0494c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0495c, 1)).equals(String.valueOf(xpc_fld0495c))) {
            CobolDisplay.display("FLD0495C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0495c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0495c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0496c, 1)).equals(String.valueOf(xpc_fld0496c))) {
            CobolDisplay.display("FLD0496C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0496c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0496c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0497c, 1)).equals(String.valueOf(xpc_fld0497c))) {
            CobolDisplay.display("FLD0497C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0497c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0497c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0498c, 1)).equals(String.valueOf(xpc_fld0498c))) {
            CobolDisplay.display("FLD0498C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0498c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0498c).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0499c, 1)).equals(String.valueOf(xpc_fld0499c))) {
            CobolDisplay.display("FLD0499C ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0499c).trim()) - 1]) + "0a" + "EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0499c).trim()) - 1]));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked019MoveBetweenSeveralBcdFields().run();
    }
}
