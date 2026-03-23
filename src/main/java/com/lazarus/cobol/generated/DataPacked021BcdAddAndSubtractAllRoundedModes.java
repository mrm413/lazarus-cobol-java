package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked021BcdAddAndSubtractAllRoundedModes extends CobolProgram {
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

    private CobolString on = new CobolString(256);
    private CobolString error = new CobolString(256);
    private CobolString no_disp = new CobolString(256);
    private CobolString cb_true = new CobolString(256);
    private CobolString some = new CobolString(256);
    private CobolString fld0001a = new CobolString(256);
    private CobolString fld0001b = new CobolString(256);
    private CobolString fld0002a = new CobolString(256);
    private CobolString fld0002b = new CobolString(256);
    private CobolString fld0003a = new CobolString(256);
    private CobolString fld0003b = new CobolString(256);
    private CobolString fld0004a = new CobolString(256);
    private CobolString fld0004b = new CobolString(256);
    private CobolString fld0005a = new CobolString(256);
    private CobolString fld0005b = new CobolString(256);
    private CobolString fld0006a = new CobolString(256);
    private CobolString fld0006b = new CobolString(256);
    private CobolString fld0007a = new CobolString(256);
    private CobolString fld0007b = new CobolString(256);
    private CobolString fld0008a = new CobolString(256);
    private CobolString fld0008b = new CobolString(256);
    private CobolString fld0009a = new CobolString(256);
    private CobolString fld0009b = new CobolString(256);
    private CobolString fld0010a = new CobolString(256);
    private CobolString fld0010b = new CobolString(256);
    private CobolString fld0011a = new CobolString(256);
    private CobolString fld0011b = new CobolString(256);
    private CobolString fld0012a = new CobolString(256);
    private CobolString fld0012b = new CobolString(256);
    private CobolString fld0013a = new CobolString(256);
    private CobolString fld0013b = new CobolString(256);
    private CobolString fld0014a = new CobolString(256);
    private CobolString fld0014b = new CobolString(256);
    private CobolString fld0015a = new CobolString(256);
    private CobolString fld0015b = new CobolString(256);
    private CobolString fld0016a = new CobolString(256);
    private CobolString fld0016b = new CobolString(256);
    private CobolString fld0017a = new CobolString(256);
    private CobolString fld0017b = new CobolString(256);
    private CobolString fld0018a = new CobolString(256);
    private CobolString fld0018b = new CobolString(256);
    private CobolString fld0019a = new CobolString(256);
    private CobolString fld0019b = new CobolString(256);
    private CobolString fld0020a = new CobolString(256);
    private CobolString fld0020b = new CobolString(256);
    private CobolString fld0021a = new CobolString(256);
    private CobolString fld0021b = new CobolString(256);
    private CobolString fld0022a = new CobolString(256);
    private CobolString fld0022b = new CobolString(256);
    private CobolString fld0023a = new CobolString(256);
    private CobolString fld0023b = new CobolString(256);
    private CobolString fld0024a = new CobolString(256);
    private CobolString fld0024b = new CobolString(256);
    private CobolString fld0025a = new CobolString(256);
    private CobolString fld0025b = new CobolString(256);
    private CobolString fld0026a = new CobolString(256);
    private CobolString fld0026b = new CobolString(256);
    private CobolString fld0027a = new CobolString(256);
    private CobolString fld0027b = new CobolString(256);
    private CobolString fld0028a = new CobolString(256);
    private CobolString fld0028b = new CobolString(256);
    private CobolString fld0029a = new CobolString(256);
    private CobolString fld0029b = new CobolString(256);
    private CobolString fld0030a = new CobolString(256);
    private CobolString fld0030b = new CobolString(256);
    private CobolString fld0031a = new CobolString(256);
    private CobolString fld0031b = new CobolString(256);
    private CobolString fld0032a = new CobolString(256);
    private CobolString fld0032b = new CobolString(256);
    private CobolString fld0033a = new CobolString(256);
    private CobolString fld0033b = new CobolString(256);
    private CobolString fld0034a = new CobolString(256);
    private CobolString fld0034b = new CobolString(256);
    private CobolString fld0035a = new CobolString(256);
    private CobolString fld0035b = new CobolString(256);
    private CobolString fld0036a = new CobolString(256);
    private CobolString fld0036b = new CobolString(256);
    private CobolString fld0037a = new CobolString(256);
    private CobolString fld0037b = new CobolString(256);
    private CobolString fld0038a = new CobolString(256);
    private CobolString fld0038b = new CobolString(256);
    private CobolString fld0039a = new CobolString(256);
    private CobolString fld0039b = new CobolString(256);
    private CobolString fld0040a = new CobolString(256);
    private CobolString fld0040b = new CobolString(256);
    private CobolString fld0041a = new CobolString(256);
    private CobolString fld0041b = new CobolString(256);
    private CobolString fld0042a = new CobolString(256);
    private CobolString fld0042b = new CobolString(256);
    private CobolString fld0043a = new CobolString(256);
    private CobolString fld0043b = new CobolString(256);
    private CobolString fld0044a = new CobolString(256);
    private CobolString fld0044b = new CobolString(256);
    private CobolString fld0045a = new CobolString(256);
    private CobolString fld0045b = new CobolString(256);
    private CobolString fld0046a = new CobolString(256);
    private CobolString fld0046b = new CobolString(256);
    private CobolString fld0047a = new CobolString(256);
    private CobolString fld0047b = new CobolString(256);
    private CobolString fld0048a = new CobolString(256);
    private CobolString fld0048b = new CobolString(256);
    private CobolString fld0049a = new CobolString(256);
    private CobolString fld0049b = new CobolString(256);
    private CobolString fld0050a = new CobolString(256);
    private CobolString fld0050b = new CobolString(256);
    private CobolString fld0051a = new CobolString(256);
    private CobolString fld0051b = new CobolString(256);
    private CobolString fld0052a = new CobolString(256);
    private CobolString fld0052b = new CobolString(256);
    private CobolString fld0053a = new CobolString(256);
    private CobolString fld0053b = new CobolString(256);
    private CobolString fld0054a = new CobolString(256);
    private CobolString fld0054b = new CobolString(256);
    private CobolString fld0055a = new CobolString(256);
    private CobolString fld0055b = new CobolString(256);
    private CobolString fld0056a = new CobolString(256);
    private CobolString fld0056b = new CobolString(256);
    private CobolString fld0057a = new CobolString(256);
    private CobolString fld0057b = new CobolString(256);
    private CobolString fld0058a = new CobolString(256);
    private CobolString fld0058b = new CobolString(256);
    private CobolString fld0059a = new CobolString(256);
    private CobolString fld0059b = new CobolString(256);
    private CobolString fld0060a = new CobolString(256);
    private CobolString fld0060b = new CobolString(256);
    private CobolString fld0061a = new CobolString(256);
    private CobolString fld0061b = new CobolString(256);
    private CobolString fld0062a = new CobolString(256);
    private CobolString fld0062b = new CobolString(256);
    private CobolString fld0063a = new CobolString(256);
    private CobolString fld0063b = new CobolString(256);
    private CobolString fld0064a = new CobolString(256);
    private CobolString fld0064b = new CobolString(256);
    private CobolString fld0065a = new CobolString(256);
    private CobolString fld0065b = new CobolString(256);
    private CobolString fld0066a = new CobolString(256);
    private CobolString fld0066b = new CobolString(256);
    private CobolString fld0067a = new CobolString(256);
    private CobolString fld0067b = new CobolString(256);
    private CobolString fld0068a = new CobolString(256);
    private CobolString fld0068b = new CobolString(256);
    private CobolString fld0069a = new CobolString(256);
    private CobolString fld0069b = new CobolString(256);
    private CobolString fld0070a = new CobolString(256);
    private CobolString fld0070b = new CobolString(256);
    private CobolString fld0071a = new CobolString(256);
    private CobolString fld0071b = new CobolString(256);
    private CobolString fld0072a = new CobolString(256);
    private CobolString fld0072b = new CobolString(256);
    private CobolString fld0073a = new CobolString(256);
    private CobolString fld0073b = new CobolString(256);
    private CobolString fld0074a = new CobolString(256);
    private CobolString fld0074b = new CobolString(256);
    private CobolString fld0075a = new CobolString(256);
    private CobolString fld0075b = new CobolString(256);
    private CobolString fld0076a = new CobolString(256);
    private CobolString fld0076b = new CobolString(256);
    private CobolString fld0077a = new CobolString(256);
    private CobolString fld0077b = new CobolString(256);
    private CobolString fld0078a = new CobolString(256);
    private CobolString fld0078b = new CobolString(256);
    private CobolString fld0079a = new CobolString(256);
    private CobolString fld0079b = new CobolString(256);
    private CobolString fld0080a = new CobolString(256);
    private CobolString fld0080b = new CobolString(256);
    private CobolString fld0081a = new CobolString(256);
    private CobolString fld0081b = new CobolString(256);
    private CobolString fld0082a = new CobolString(256);
    private CobolString fld0082b = new CobolString(256);
    private CobolString fld0083a = new CobolString(256);
    private CobolString fld0083b = new CobolString(256);
    private CobolString fld0084a = new CobolString(256);
    private CobolString fld0084b = new CobolString(256);
    private CobolString fld0085a = new CobolString(256);
    private CobolString fld0085b = new CobolString(256);
    private CobolString fld0086a = new CobolString(256);
    private CobolString fld0086b = new CobolString(256);
    private CobolString fld0087a = new CobolString(256);
    private CobolString fld0087b = new CobolString(256);
    private CobolString fld0088a = new CobolString(256);
    private CobolString fld0088b = new CobolString(256);
    private CobolString fld0089a = new CobolString(256);
    private CobolString fld0089b = new CobolString(256);
    private CobolString fld0090a = new CobolString(256);
    private CobolString fld0090b = new CobolString(256);
    private CobolString fld0091a = new CobolString(256);
    private CobolString fld0091b = new CobolString(256);
    private CobolString fld0092a = new CobolString(256);
    private CobolString fld0092b = new CobolString(256);
    private CobolString fld0093a = new CobolString(256);
    private CobolString fld0093b = new CobolString(256);
    private CobolString fld0094a = new CobolString(256);
    private CobolString fld0094b = new CobolString(256);
    private CobolString fld0095a = new CobolString(256);
    private CobolString fld0095b = new CobolString(256);
    private CobolString fld0096a = new CobolString(256);
    private CobolString fld0096b = new CobolString(256);
    private CobolString fld0097a = new CobolString(256);
    private CobolString fld0097b = new CobolString(256);
    private CobolString fld0098a = new CobolString(256);
    private CobolString fld0098b = new CobolString(256);
    private CobolString fld0099a = new CobolString(256);
    private CobolString fld0099b = new CobolString(256);
    private CobolString fld0100a = new CobolString(256);
    private CobolString fld0100b = new CobolString(256);
    private CobolString fld0101a = new CobolString(256);
    private CobolString fld0101b = new CobolString(256);
    private CobolString fld0102a = new CobolString(256);
    private CobolString fld0102b = new CobolString(256);
    private CobolString fld0103a = new CobolString(256);
    private CobolString fld0103b = new CobolString(256);
    private CobolString fld0104a = new CobolString(256);
    private CobolString fld0104b = new CobolString(256);
    private CobolString fld0105a = new CobolString(256);
    private CobolString fld0105b = new CobolString(256);
    private CobolString fld0106a = new CobolString(256);
    private CobolString fld0106b = new CobolString(256);
    private CobolString fld0107a = new CobolString(256);
    private CobolString fld0107b = new CobolString(256);
    private CobolString fld0108a = new CobolString(256);
    private CobolString fld0108b = new CobolString(256);
    private CobolString fld0109a = new CobolString(256);
    private CobolString fld0109b = new CobolString(256);
    private CobolString fld0110a = new CobolString(256);
    private CobolString fld0110b = new CobolString(256);
    private CobolString fld0111a = new CobolString(256);
    private CobolString fld0111b = new CobolString(256);
    private CobolString fld0112a = new CobolString(256);
    private CobolString fld0112b = new CobolString(256);
    private CobolString fld0113a = new CobolString(256);
    private CobolString fld0113b = new CobolString(256);
    private CobolString fld0114a = new CobolString(256);
    private CobolString fld0114b = new CobolString(256);
    private CobolString fld0115a = new CobolString(256);
    private CobolString fld0115b = new CobolString(256);
    private CobolString fld0116a = new CobolString(256);
    private CobolString fld0116b = new CobolString(256);
    private CobolString fld0117a = new CobolString(256);
    private CobolString fld0117b = new CobolString(256);
    private CobolString fld0118a = new CobolString(256);
    private CobolString fld0118b = new CobolString(256);
    private CobolString fld0119a = new CobolString(256);
    private CobolString fld0119b = new CobolString(256);
    private CobolString fld0120a = new CobolString(256);
    private CobolString fld0120b = new CobolString(256);
    private CobolString fld0121a = new CobolString(256);
    private CobolString fld0121b = new CobolString(256);
    private CobolString fld0122a = new CobolString(256);
    private CobolString fld0122b = new CobolString(256);
    private CobolString fld0123a = new CobolString(256);
    private CobolString fld0123b = new CobolString(256);
    private CobolString fld0124a = new CobolString(256);
    private CobolString fld0124b = new CobolString(256);
    private CobolString fld0125a = new CobolString(256);
    private CobolString fld0125b = new CobolString(256);
    private CobolString fld0126a = new CobolString(256);
    private CobolString fld0126b = new CobolString(256);
    private CobolString fld0127a = new CobolString(256);
    private CobolString fld0127b = new CobolString(256);
    private CobolString fld0128a = new CobolString(256);
    private CobolString fld0128b = new CobolString(256);
    private CobolString fld0129a = new CobolString(256);
    private CobolString fld0129b = new CobolString(256);
    private CobolString fld0130a = new CobolString(256);
    private CobolString fld0130b = new CobolString(256);
    private CobolString fld0131a = new CobolString(256);
    private CobolString fld0131b = new CobolString(256);
    private CobolString fld0132a = new CobolString(256);
    private CobolString fld0132b = new CobolString(256);
    private CobolString fld0133a = new CobolString(256);
    private CobolString fld0133b = new CobolString(256);
    private CobolString fld0134a = new CobolString(256);
    private CobolString fld0134b = new CobolString(256);
    private CobolString fld0135a = new CobolString(256);
    private CobolString fld0135b = new CobolString(256);
    private CobolString fld0136a = new CobolString(256);
    private CobolString fld0136b = new CobolString(256);
    private CobolString fld0137a = new CobolString(256);
    private CobolString fld0137b = new CobolString(256);
    private CobolString fld0138a = new CobolString(256);
    private CobolString fld0138b = new CobolString(256);
    private CobolString fld0139a = new CobolString(256);
    private CobolString fld0139b = new CobolString(256);
    private CobolString fld0140a = new CobolString(256);
    private CobolString fld0140b = new CobolString(256);
    private CobolString fld0141a = new CobolString(256);
    private CobolString fld0141b = new CobolString(256);
    private CobolString fld0142a = new CobolString(256);
    private CobolString fld0142b = new CobolString(256);
    private CobolString fld0143a = new CobolString(256);
    private CobolString fld0143b = new CobolString(256);
    private CobolString fld0144a = new CobolString(256);
    private CobolString fld0144b = new CobolString(256);
    private CobolString fld0145a = new CobolString(256);
    private CobolString fld0145b = new CobolString(256);
    private CobolString fld0146a = new CobolString(256);
    private CobolString fld0146b = new CobolString(256);
    private CobolString fld0147a = new CobolString(256);
    private CobolString fld0147b = new CobolString(256);
    private CobolString fld0148a = new CobolString(256);
    private CobolString fld0148b = new CobolString(256);
    private CobolString fld0149a = new CobolString(256);
    private CobolString fld0149b = new CobolString(256);
    private CobolString fld0150a = new CobolString(256);
    private CobolString fld0150b = new CobolString(256);
    private CobolString fld0151a = new CobolString(256);
    private CobolString fld0151b = new CobolString(256);
    private CobolString fld0152a = new CobolString(256);
    private CobolString fld0152b = new CobolString(256);
    private CobolString fld0153a = new CobolString(256);
    private CobolString fld0153b = new CobolString(256);
    private CobolString fld0154a = new CobolString(256);
    private CobolString fld0154b = new CobolString(256);
    private CobolString fld0155a = new CobolString(256);
    private CobolString fld0155b = new CobolString(256);
    private CobolString fld0156a = new CobolString(256);
    private CobolString fld0156b = new CobolString(256);
    private CobolString fld0157a = new CobolString(256);
    private CobolString fld0157b = new CobolString(256);
    private CobolString fld0158a = new CobolString(256);
    private CobolString fld0158b = new CobolString(256);
    private CobolString fld0159a = new CobolString(256);
    private CobolString fld0159b = new CobolString(256);
    private CobolString fld0160a = new CobolString(256);
    private CobolString fld0160b = new CobolString(256);
    private CobolString fld0161a = new CobolString(256);
    private CobolString fld0161b = new CobolString(256);
    private CobolString fld0162a = new CobolString(256);
    private CobolString fld0162b = new CobolString(256);
    private CobolString fld0163a = new CobolString(256);
    private CobolString fld0163b = new CobolString(256);
    private CobolString fld0164a = new CobolString(256);
    private CobolString fld0164b = new CobolString(256);
    private CobolString fld0165a = new CobolString(256);
    private CobolString fld0165b = new CobolString(256);
    private CobolString fld0166a = new CobolString(256);
    private CobolString fld0166b = new CobolString(256);
    private CobolString fld0167a = new CobolString(256);
    private CobolString fld0167b = new CobolString(256);
    private CobolString fld0168a = new CobolString(256);
    private CobolString fld0168b = new CobolString(256);
    private CobolString fld0169a = new CobolString(256);
    private CobolString fld0169b = new CobolString(256);
    private CobolString fld0170a = new CobolString(256);
    private CobolString fld0170b = new CobolString(256);
    private CobolString fld0171a = new CobolString(256);
    private CobolString fld0171b = new CobolString(256);
    private CobolString fld0172a = new CobolString(256);
    private CobolString fld0172b = new CobolString(256);
    private CobolString fld0173a = new CobolString(256);
    private CobolString fld0173b = new CobolString(256);
    private CobolString fld0174a = new CobolString(256);
    private CobolString fld0174b = new CobolString(256);
    private CobolString fld0175a = new CobolString(256);
    private CobolString fld0175b = new CobolString(256);
    private CobolString fld0176a = new CobolString(256);
    private CobolString fld0176b = new CobolString(256);
    private CobolString fld0177a = new CobolString(256);
    private CobolString fld0177b = new CobolString(256);
    private CobolString fld0178a = new CobolString(256);
    private CobolString fld0178b = new CobolString(256);
    private CobolString fld0179a = new CobolString(256);
    private CobolString fld0179b = new CobolString(256);
    private CobolString fld0180a = new CobolString(256);
    private CobolString fld0180b = new CobolString(256);
    private CobolString fld0181a = new CobolString(256);
    private CobolString fld0181b = new CobolString(256);
    private CobolString fld0182a = new CobolString(256);
    private CobolString fld0182b = new CobolString(256);
    private CobolString fld0183a = new CobolString(256);
    private CobolString fld0183b = new CobolString(256);
    private CobolString fld0184a = new CobolString(256);
    private CobolString fld0184b = new CobolString(256);
    private CobolString fld0185a = new CobolString(256);
    private CobolString fld0185b = new CobolString(256);
    private CobolString fld0186a = new CobolString(256);
    private CobolString fld0186b = new CobolString(256);
    private CobolString fld0187a = new CobolString(256);
    private CobolString fld0187b = new CobolString(256);
    private CobolString fld0188a = new CobolString(256);
    private CobolString fld0188b = new CobolString(256);
    private CobolString fld0189a = new CobolString(256);
    private CobolString fld0189b = new CobolString(256);
    private CobolString fld0190a = new CobolString(256);
    private CobolString fld0190b = new CobolString(256);
    private CobolString fld0191a = new CobolString(256);
    private CobolString fld0191b = new CobolString(256);
    private CobolString fld0192a = new CobolString(256);
    private CobolString fld0192b = new CobolString(256);
    private CobolString fld0193a = new CobolString(256);
    private CobolString fld0193b = new CobolString(256);
    private CobolString fld0194a = new CobolString(256);
    private CobolString fld0194b = new CobolString(256);
    private CobolString fld0195a = new CobolString(256);
    private CobolString fld0195b = new CobolString(256);
    private CobolString fld0196a = new CobolString(256);
    private CobolString fld0196b = new CobolString(256);
    private CobolString fld0197a = new CobolString(256);
    private CobolString fld0197b = new CobolString(256);
    private CobolString fld0198a = new CobolString(256);
    private CobolString fld0198b = new CobolString(256);
    private CobolString fld0199a = new CobolString(256);
    private CobolString fld0199b = new CobolString(256);
    private CobolString fld0200a = new CobolString(256);
    private CobolString fld0200b = new CobolString(256);
    private CobolString fld0201a = new CobolString(256);
    private CobolString fld0201b = new CobolString(256);
    private CobolString fld0202a = new CobolString(256);
    private CobolString fld0202b = new CobolString(256);
    private CobolString fld0203a = new CobolString(256);
    private CobolString fld0203b = new CobolString(256);
    private CobolString fld0204a = new CobolString(256);
    private CobolString fld0204b = new CobolString(256);
    private CobolString fld0205a = new CobolString(256);
    private CobolString fld0205b = new CobolString(256);
    private CobolString fld0206a = new CobolString(256);
    private CobolString fld0206b = new CobolString(256);
    private CobolString fld0207a = new CobolString(256);
    private CobolString fld0207b = new CobolString(256);
    private CobolString fld0208a = new CobolString(256);
    private CobolString fld0208b = new CobolString(256);
    private CobolString fld0209a = new CobolString(256);
    private CobolString fld0209b = new CobolString(256);
    private CobolString fld0210a = new CobolString(256);
    private CobolString fld0210b = new CobolString(256);
    private CobolString fld0211a = new CobolString(256);
    private CobolString fld0211b = new CobolString(256);
    private CobolString fld0212a = new CobolString(256);
    private CobolString fld0212b = new CobolString(256);
    private CobolString fld0213a = new CobolString(256);
    private CobolString fld0213b = new CobolString(256);
    private CobolString fld0214a = new CobolString(256);
    private CobolString fld0214b = new CobolString(256);
    private CobolString fld0215a = new CobolString(256);
    private CobolString fld0215b = new CobolString(256);
    private CobolString fld0216a = new CobolString(256);
    private CobolString fld0216b = new CobolString(256);
    private CobolString fld0217a = new CobolString(256);
    private CobolString fld0217b = new CobolString(256);
    private CobolString fld0218a = new CobolString(256);
    private CobolString fld0218b = new CobolString(256);
    private CobolString fld0219a = new CobolString(256);
    private CobolString fld0219b = new CobolString(256);
    private CobolString fld0220a = new CobolString(256);
    private CobolString fld0220b = new CobolString(256);
    private CobolString fld0221a = new CobolString(256);
    private CobolString fld0221b = new CobolString(256);
    private CobolString fld0222a = new CobolString(256);
    private CobolString fld0222b = new CobolString(256);
    private CobolString fld0223a = new CobolString(256);
    private CobolString fld0223b = new CobolString(256);
    private CobolString fld0224a = new CobolString(256);
    private CobolString fld0224b = new CobolString(256);
    private CobolString fld0225a = new CobolString(256);
    private CobolString fld0225b = new CobolString(256);
    private CobolString fld0226a = new CobolString(256);
    private CobolString fld0226b = new CobolString(256);
    private CobolString fld0227a = new CobolString(256);
    private CobolString fld0227b = new CobolString(256);
    private CobolString fld0228a = new CobolString(256);
    private CobolString fld0228b = new CobolString(256);
    private CobolString fld0229a = new CobolString(256);
    private CobolString fld0229b = new CobolString(256);
    private CobolString fld0230a = new CobolString(256);
    private CobolString fld0230b = new CobolString(256);
    private CobolString fld0231a = new CobolString(256);
    private CobolString fld0231b = new CobolString(256);
    private CobolString fld0232a = new CobolString(256);
    private CobolString fld0232b = new CobolString(256);
    private CobolString fld0233a = new CobolString(256);
    private CobolString fld0233b = new CobolString(256);
    private CobolString fld0234a = new CobolString(256);
    private CobolString fld0234b = new CobolString(256);
    private CobolString fld0235a = new CobolString(256);
    private CobolString fld0235b = new CobolString(256);
    private CobolString fld0236a = new CobolString(256);
    private CobolString fld0236b = new CobolString(256);
    private CobolString fld0237a = new CobolString(256);
    private CobolString fld0237b = new CobolString(256);
    private CobolString fld0238a = new CobolString(256);
    private CobolString fld0238b = new CobolString(256);
    private CobolString fld0239a = new CobolString(256);
    private CobolString fld0239b = new CobolString(256);
    private CobolString fld0240a = new CobolString(256);
    private CobolString fld0240b = new CobolString(256);
    private CobolString fld0241a = new CobolString(256);
    private CobolString fld0241b = new CobolString(256);
    private CobolString fld0242a = new CobolString(256);
    private CobolString fld0242b = new CobolString(256);
    private CobolString fld0243a = new CobolString(256);
    private CobolString fld0243b = new CobolString(256);
    private CobolString fld0244a = new CobolString(256);
    private CobolString fld0244b = new CobolString(256);
    private CobolString fld0245a = new CobolString(256);
    private CobolString fld0245b = new CobolString(256);
    private CobolString fld0246a = new CobolString(256);
    private CobolString fld0246b = new CobolString(256);
    private CobolString fld0247a = new CobolString(256);
    private CobolString fld0247b = new CobolString(256);
    private CobolString fld0248a = new CobolString(256);
    private CobolString fld0248b = new CobolString(256);
    private CobolString fld0249a = new CobolString(256);
    private CobolString fld0249b = new CobolString(256);
    private CobolString fld0250a = new CobolString(256);
    private CobolString fld0250b = new CobolString(256);
    private CobolString fld0251a = new CobolString(256);
    private CobolString fld0251b = new CobolString(256);
    private CobolString fld0252a = new CobolString(256);
    private CobolString fld0252b = new CobolString(256);
    private CobolString fld0253a = new CobolString(256);
    private CobolString fld0253b = new CobolString(256);
    private CobolString fld0254a = new CobolString(256);
    private CobolString fld0254b = new CobolString(256);
    private CobolString fld0255a = new CobolString(256);
    private CobolString fld0255b = new CobolString(256);
    private CobolString fld0256a = new CobolString(256);
    private CobolString fld0256b = new CobolString(256);
    private CobolString fld0257a = new CobolString(256);
    private CobolString fld0257b = new CobolString(256);
    private CobolString fld0258a = new CobolString(256);
    private CobolString fld0258b = new CobolString(256);
    private CobolString fld0259a = new CobolString(256);
    private CobolString fld0259b = new CobolString(256);
    private CobolString fld0260a = new CobolString(256);
    private CobolString fld0260b = new CobolString(256);
    private CobolString fld0261a = new CobolString(256);
    private CobolString fld0261b = new CobolString(256);
    private CobolString fld0262a = new CobolString(256);
    private CobolString fld0262b = new CobolString(256);
    private CobolString fld0263a = new CobolString(256);
    private CobolString fld0263b = new CobolString(256);
    private CobolString fld0264a = new CobolString(256);
    private CobolString fld0264b = new CobolString(256);
    private CobolString fld0265a = new CobolString(256);
    private CobolString fld0265b = new CobolString(256);
    private CobolString fld0266a = new CobolString(256);
    private CobolString fld0266b = new CobolString(256);
    private CobolString fld0267a = new CobolString(256);
    private CobolString fld0267b = new CobolString(256);
    private CobolString fld0268a = new CobolString(256);
    private CobolString fld0268b = new CobolString(256);
    private CobolString fld0269a = new CobolString(256);
    private CobolString fld0269b = new CobolString(256);
    private CobolString fld0270a = new CobolString(256);
    private CobolString fld0270b = new CobolString(256);
    private CobolString fld0271a = new CobolString(256);
    private CobolString fld0271b = new CobolString(256);
    private CobolString fld0272a = new CobolString(256);
    private CobolString fld0272b = new CobolString(256);
    private CobolString fld0273a = new CobolString(256);
    private CobolString fld0273b = new CobolString(256);
    private CobolString fld0274a = new CobolString(256);
    private CobolString fld0274b = new CobolString(256);
    private CobolString fld0275a = new CobolString(256);
    private CobolString fld0275b = new CobolString(256);
    private CobolString fld0276a = new CobolString(256);
    private CobolString fld0276b = new CobolString(256);
    private CobolString fld0277a = new CobolString(256);
    private CobolString fld0277b = new CobolString(256);
    private CobolString fld0278a = new CobolString(256);
    private CobolString fld0278b = new CobolString(256);
    private CobolString fld0279a = new CobolString(256);
    private CobolString fld0279b = new CobolString(256);
    private CobolString fld0280a = new CobolString(256);
    private CobolString fld0280b = new CobolString(256);
    private CobolString fld0281a = new CobolString(256);
    private CobolString fld0281b = new CobolString(256);
    private CobolString fld0282a = new CobolString(256);
    private CobolString fld0282b = new CobolString(256);
    private CobolString fld0283a = new CobolString(256);
    private CobolString fld0283b = new CobolString(256);
    private CobolString fld0284a = new CobolString(256);
    private CobolString fld0284b = new CobolString(256);
    private CobolString fld0285a = new CobolString(256);
    private CobolString fld0285b = new CobolString(256);
    private CobolString fld0286a = new CobolString(256);
    private CobolString fld0286b = new CobolString(256);
    private CobolString fld0287a = new CobolString(256);
    private CobolString fld0287b = new CobolString(256);
    private CobolString fld0288a = new CobolString(256);
    private CobolString fld0288b = new CobolString(256);
    private CobolString fld0289a = new CobolString(256);
    private CobolString fld0289b = new CobolString(256);
    private CobolString fld0290a = new CobolString(256);
    private CobolString fld0290b = new CobolString(256);
    private CobolString fld0291a = new CobolString(256);
    private CobolString fld0291b = new CobolString(256);
    private CobolString fld0292a = new CobolString(256);
    private CobolString fld0292b = new CobolString(256);
    private CobolString fld0293a = new CobolString(256);
    private CobolString fld0293b = new CobolString(256);
    private CobolString fld0294a = new CobolString(256);
    private CobolString fld0294b = new CobolString(256);
    private CobolString fld0295a = new CobolString(256);
    private CobolString fld0295b = new CobolString(256);
    private CobolString fld0296a = new CobolString(256);
    private CobolString fld0296b = new CobolString(256);
    private CobolString fld0297a = new CobolString(256);
    private CobolString fld0297b = new CobolString(256);
    private CobolString fld0298a = new CobolString(256);
    private CobolString fld0298b = new CobolString(256);
    private CobolString fld0299a = new CobolString(256);
    private CobolString fld0299b = new CobolString(256);
    private CobolString fld0300a = new CobolString(256);
    private CobolString fld0300b = new CobolString(256);
    private CobolString fld0301a = new CobolString(256);
    private CobolString fld0301b = new CobolString(256);
    private CobolString fld0302a = new CobolString(256);
    private CobolString fld0302b = new CobolString(256);
    private CobolString fld0303a = new CobolString(256);
    private CobolString fld0303b = new CobolString(256);
    private CobolString fld0304a = new CobolString(256);
    private CobolString fld0304b = new CobolString(256);
    private CobolString fld0305a = new CobolString(256);
    private CobolString fld0305b = new CobolString(256);
    private CobolString fld0306a = new CobolString(256);
    private CobolString fld0306b = new CobolString(256);
    private CobolString fld0307a = new CobolString(256);
    private CobolString fld0307b = new CobolString(256);
    private CobolString fld0308a = new CobolString(256);
    private CobolString fld0308b = new CobolString(256);
    private CobolString fld0309a = new CobolString(256);
    private CobolString fld0309b = new CobolString(256);
    private CobolString fld0310a = new CobolString(256);
    private CobolString fld0310b = new CobolString(256);
    private CobolString fld0311a = new CobolString(256);
    private CobolString fld0311b = new CobolString(256);
    private CobolString fld0312a = new CobolString(256);
    private CobolString fld0312b = new CobolString(256);
    private CobolString fld0313a = new CobolString(256);
    private CobolString fld0313b = new CobolString(256);
    private CobolString fld0314a = new CobolString(256);
    private CobolString fld0314b = new CobolString(256);
    private CobolString fld0315a = new CobolString(256);
    private CobolString fld0315b = new CobolString(256);
    private CobolString fld0316a = new CobolString(256);
    private CobolString fld0316b = new CobolString(256);
    private CobolString fld0317a = new CobolString(256);
    private CobolString fld0317b = new CobolString(256);
    private CobolString fld0318a = new CobolString(256);
    private CobolString fld0318b = new CobolString(256);
    private CobolString fld0319a = new CobolString(256);
    private CobolString fld0319b = new CobolString(256);
    private CobolString fld0320a = new CobolString(256);
    private CobolString fld0320b = new CobolString(256);
    private CobolString fld0321a = new CobolString(256);
    private CobolString fld0321b = new CobolString(256);
    private CobolString fld0322a = new CobolString(256);
    private CobolString fld0322b = new CobolString(256);
    private CobolString fld0323a = new CobolString(256);
    private CobolString fld0323b = new CobolString(256);
    private CobolString fld0324a = new CobolString(256);
    private CobolString fld0324b = new CobolString(256);
    private CobolString fld0325a = new CobolString(256);
    private CobolString fld0325b = new CobolString(256);
    private CobolString fld0326a = new CobolString(256);
    private CobolString fld0326b = new CobolString(256);
    private CobolString fld0327a = new CobolString(256);
    private CobolString fld0327b = new CobolString(256);
    private CobolString fld0328a = new CobolString(256);
    private CobolString fld0328b = new CobolString(256);
    private CobolString fld0329a = new CobolString(256);
    private CobolString fld0329b = new CobolString(256);
    private CobolString fld0330a = new CobolString(256);
    private CobolString fld0330b = new CobolString(256);
    private CobolString fld0331a = new CobolString(256);
    private CobolString fld0331b = new CobolString(256);
    private CobolString fld0332a = new CobolString(256);
    private CobolString fld0332b = new CobolString(256);
    private CobolString fld0333a = new CobolString(256);
    private CobolString fld0333b = new CobolString(256);
    private CobolString fld0334a = new CobolString(256);
    private CobolString fld0334b = new CobolString(256);
    private CobolString fld0335a = new CobolString(256);
    private CobolString fld0335b = new CobolString(256);
    private CobolString fld0336a = new CobolString(256);
    private CobolString fld0336b = new CobolString(256);
    private CobolString fld0337a = new CobolString(256);
    private CobolString fld0337b = new CobolString(256);
    private CobolString fld0338a = new CobolString(256);
    private CobolString fld0338b = new CobolString(256);
    private CobolString fld0339a = new CobolString(256);
    private CobolString fld0339b = new CobolString(256);
    private CobolString fld0340a = new CobolString(256);
    private CobolString fld0340b = new CobolString(256);
    private CobolString fld0341a = new CobolString(256);
    private CobolString fld0341b = new CobolString(256);
    private CobolString fld0342a = new CobolString(256);
    private CobolString fld0342b = new CobolString(256);
    private CobolString fld0343a = new CobolString(256);
    private CobolString fld0343b = new CobolString(256);
    private CobolString fld0344a = new CobolString(256);
    private CobolString fld0344b = new CobolString(256);
    private CobolString fld0345a = new CobolString(256);
    private CobolString fld0345b = new CobolString(256);
    private CobolString fld0346a = new CobolString(256);
    private CobolString fld0346b = new CobolString(256);
    private CobolString fld0347a = new CobolString(256);
    private CobolString fld0347b = new CobolString(256);
    private CobolString fld0348a = new CobolString(256);
    private CobolString fld0348b = new CobolString(256);
    private CobolString fld0349a = new CobolString(256);
    private CobolString fld0349b = new CobolString(256);
    private CobolString fld0350a = new CobolString(256);
    private CobolString fld0350b = new CobolString(256);
    private CobolString fld0351a = new CobolString(256);
    private CobolString fld0351b = new CobolString(256);
    private CobolString fld0352a = new CobolString(256);
    private CobolString fld0352b = new CobolString(256);
    private CobolString fld0353a = new CobolString(256);
    private CobolString fld0353b = new CobolString(256);
    private CobolString fld0354a = new CobolString(256);
    private CobolString fld0354b = new CobolString(256);
    private CobolString fld0355a = new CobolString(256);
    private CobolString fld0355b = new CobolString(256);
    private CobolString fld0356a = new CobolString(256);
    private CobolString fld0356b = new CobolString(256);
    private CobolString fld0357a = new CobolString(256);
    private CobolString fld0357b = new CobolString(256);
    private CobolString fld0358a = new CobolString(256);
    private CobolString fld0358b = new CobolString(256);
    private CobolString fld0359a = new CobolString(256);
    private CobolString fld0359b = new CobolString(256);
    private CobolString fld0360a = new CobolString(256);
    private CobolString fld0360b = new CobolString(256);
    private CobolString fld0361a = new CobolString(256);
    private CobolString fld0361b = new CobolString(256);
    private CobolString fld0362a = new CobolString(256);
    private CobolString fld0362b = new CobolString(256);
    private CobolString fld0363a = new CobolString(256);
    private CobolString fld0363b = new CobolString(256);
    private CobolString fld0364a = new CobolString(256);
    private CobolString fld0364b = new CobolString(256);
    private CobolString fld0365a = new CobolString(256);
    private CobolString fld0365b = new CobolString(256);
    private CobolString fld0366a = new CobolString(256);
    private CobolString fld0366b = new CobolString(256);
    private CobolString fld0367a = new CobolString(256);
    private CobolString fld0367b = new CobolString(256);
    private CobolString fld0368a = new CobolString(256);
    private CobolString fld0368b = new CobolString(256);
    private CobolString fld0369a = new CobolString(256);
    private CobolString fld0369b = new CobolString(256);
    private CobolString fld0370a = new CobolString(256);
    private CobolString fld0370b = new CobolString(256);
    private CobolString fld0371a = new CobolString(256);
    private CobolString fld0371b = new CobolString(256);
    private CobolString fld0372a = new CobolString(256);
    private CobolString fld0372b = new CobolString(256);
    private CobolString fld0373a = new CobolString(256);
    private CobolString fld0373b = new CobolString(256);
    private CobolString fld0374a = new CobolString(256);
    private CobolString fld0374b = new CobolString(256);
    private CobolString fld0375a = new CobolString(256);
    private CobolString fld0375b = new CobolString(256);
    private CobolString fld0376a = new CobolString(256);
    private CobolString fld0376b = new CobolString(256);
    private CobolString fld0377a = new CobolString(256);
    private CobolString fld0377b = new CobolString(256);
    private CobolString fld0378a = new CobolString(256);
    private CobolString fld0378b = new CobolString(256);
    private CobolString fld0379a = new CobolString(256);
    private CobolString fld0379b = new CobolString(256);
    private CobolString fld0380a = new CobolString(256);
    private CobolString fld0380b = new CobolString(256);
    private CobolString fld0381a = new CobolString(256);
    private CobolString fld0381b = new CobolString(256);
    private CobolString fld0382a = new CobolString(256);
    private CobolString fld0382b = new CobolString(256);
    private CobolString fld0383a = new CobolString(256);
    private CobolString fld0383b = new CobolString(256);
    private CobolString fld0384a = new CobolString(256);
    private CobolString fld0384b = new CobolString(256);
    private CobolString fld0385a = new CobolString(256);
    private CobolString fld0385b = new CobolString(256);
    private CobolString fld0386a = new CobolString(256);
    private CobolString fld0386b = new CobolString(256);
    private CobolString fld0387a = new CobolString(256);
    private CobolString fld0387b = new CobolString(256);
    private CobolString fld0388a = new CobolString(256);
    private CobolString fld0388b = new CobolString(256);
    private CobolString fld0389a = new CobolString(256);
    private CobolString fld0389b = new CobolString(256);
    private CobolString fld0390a = new CobolString(256);
    private CobolString fld0390b = new CobolString(256);
    private CobolString fld0391a = new CobolString(256);
    private CobolString fld0391b = new CobolString(256);
    private CobolString fld0392a = new CobolString(256);
    private CobolString fld0392b = new CobolString(256);
    private CobolString fld0393a = new CobolString(256);
    private CobolString fld0393b = new CobolString(256);
    private CobolString fld0394a = new CobolString(256);
    private CobolString fld0394b = new CobolString(256);
    private CobolString fld0395a = new CobolString(256);
    private CobolString fld0395b = new CobolString(256);
    private CobolString fld0396a = new CobolString(256);
    private CobolString fld0396b = new CobolString(256);
    private CobolString fld0397a = new CobolString(256);
    private CobolString fld0397b = new CobolString(256);
    private CobolString fld0398a = new CobolString(256);
    private CobolString fld0398b = new CobolString(256);
    private CobolString fld0399a = new CobolString(256);
    private CobolString fld0399b = new CobolString(256);
    private CobolString fld0400a = new CobolString(256);
    private CobolString fld0400b = new CobolString(256);
    private CobolString fld0401a = new CobolString(256);
    private CobolString fld0401b = new CobolString(256);
    private CobolString fld0402a = new CobolString(256);
    private CobolString fld0402b = new CobolString(256);
    private CobolString fld0403a = new CobolString(256);
    private CobolString fld0403b = new CobolString(256);
    private CobolString fld0404a = new CobolString(256);
    private CobolString fld0404b = new CobolString(256);
    private CobolString fld0405a = new CobolString(256);
    private CobolString fld0405b = new CobolString(256);
    private CobolString fld0406a = new CobolString(256);
    private CobolString fld0406b = new CobolString(256);
    private CobolString fld0407a = new CobolString(256);
    private CobolString fld0407b = new CobolString(256);
    private CobolString fld0408a = new CobolString(256);
    private CobolString fld0408b = new CobolString(256);
    private CobolString fld0409a = new CobolString(256);
    private CobolString fld0409b = new CobolString(256);
    private CobolString fld0410a = new CobolString(256);
    private CobolString fld0410b = new CobolString(256);
    private CobolString fld0411a = new CobolString(256);
    private CobolString fld0411b = new CobolString(256);
    private CobolString fld0412a = new CobolString(256);
    private CobolString fld0412b = new CobolString(256);
    private CobolString fld0413a = new CobolString(256);
    private CobolString fld0413b = new CobolString(256);
    private CobolString fld0414a = new CobolString(256);
    private CobolString fld0414b = new CobolString(256);
    private CobolString fld0415a = new CobolString(256);
    private CobolString fld0415b = new CobolString(256);
    private CobolString fld0416a = new CobolString(256);
    private CobolString fld0416b = new CobolString(256);
    private CobolString fld0417a = new CobolString(256);
    private CobolString fld0417b = new CobolString(256);
    private CobolString fld0418a = new CobolString(256);
    private CobolString fld0418b = new CobolString(256);
    private CobolString fld0419a = new CobolString(256);
    private CobolString fld0419b = new CobolString(256);
    private CobolString fld0420a = new CobolString(256);
    private CobolString fld0420b = new CobolString(256);
    private CobolString fld0421a = new CobolString(256);
    private CobolString fld0421b = new CobolString(256);
    private CobolString fld0422a = new CobolString(256);
    private CobolString fld0422b = new CobolString(256);
    private CobolString fld0423a = new CobolString(256);
    private CobolString fld0423b = new CobolString(256);
    private CobolString fld0424a = new CobolString(256);
    private CobolString fld0424b = new CobolString(256);
    private CobolString fld0425a = new CobolString(256);
    private CobolString fld0425b = new CobolString(256);
    private CobolString fld0426a = new CobolString(256);
    private CobolString fld0426b = new CobolString(256);
    private CobolString fld0427a = new CobolString(256);
    private CobolString fld0427b = new CobolString(256);
    private CobolString fld0428a = new CobolString(256);
    private CobolString fld0428b = new CobolString(256);
    private CobolString fld0429a = new CobolString(256);
    private CobolString fld0429b = new CobolString(256);
    private CobolString fld0430a = new CobolString(256);
    private CobolString fld0430b = new CobolString(256);
    private CobolString fld0431a = new CobolString(256);
    private CobolString fld0431b = new CobolString(256);
    private CobolString fld0432a = new CobolString(256);
    private CobolString fld0432b = new CobolString(256);
    private CobolString fld0433a = new CobolString(256);
    private CobolString fld0433b = new CobolString(256);
    private CobolString fld0434a = new CobolString(256);
    private CobolString fld0434b = new CobolString(256);
    private CobolString fld0435a = new CobolString(256);
    private CobolString fld0435b = new CobolString(256);
    private CobolString fld0436a = new CobolString(256);
    private CobolString fld0436b = new CobolString(256);
    private CobolString fld0437a = new CobolString(256);
    private CobolString fld0437b = new CobolString(256);
    private CobolString fld0438a = new CobolString(256);
    private CobolString fld0438b = new CobolString(256);
    private CobolString fld0439a = new CobolString(256);
    private CobolString fld0439b = new CobolString(256);
    private CobolString fld0440a = new CobolString(256);
    private CobolString fld0440b = new CobolString(256);
    private CobolString fld0441a = new CobolString(256);
    private CobolString fld0441b = new CobolString(256);
    private CobolString fld0442a = new CobolString(256);
    private CobolString fld0442b = new CobolString(256);
    private CobolString fld0443a = new CobolString(256);
    private CobolString fld0443b = new CobolString(256);
    private CobolString fld0444a = new CobolString(256);
    private CobolString fld0444b = new CobolString(256);
    private CobolString fld0445a = new CobolString(256);
    private CobolString fld0445b = new CobolString(256);
    private CobolString fld0446a = new CobolString(256);
    private CobolString fld0446b = new CobolString(256);
    private CobolString fld0447a = new CobolString(256);
    private CobolString fld0447b = new CobolString(256);
    private CobolString fld0448a = new CobolString(256);
    private CobolString fld0448b = new CobolString(256);
    private CobolString fld0449a = new CobolString(256);
    private CobolString fld0449b = new CobolString(256);
    private CobolString fld0450a = new CobolString(256);
    private CobolString fld0450b = new CobolString(256);
    private CobolString fld0451a = new CobolString(256);
    private CobolString fld0451b = new CobolString(256);
    private CobolString fld0452a = new CobolString(256);
    private CobolString fld0452b = new CobolString(256);
    private CobolString fld0453a = new CobolString(256);
    private CobolString fld0453b = new CobolString(256);
    private CobolString fld0454a = new CobolString(256);
    private CobolString fld0454b = new CobolString(256);
    private CobolString fld0455a = new CobolString(256);
    private CobolString fld0455b = new CobolString(256);
    private CobolString fld0456a = new CobolString(256);
    private CobolString fld0456b = new CobolString(256);
    private CobolString fld0457a = new CobolString(256);
    private CobolString fld0457b = new CobolString(256);
    private CobolString fld0458a = new CobolString(256);
    private CobolString fld0458b = new CobolString(256);
    private CobolString fld0459a = new CobolString(256);
    private CobolString fld0459b = new CobolString(256);
    private CobolString fld0460a = new CobolString(256);
    private CobolString fld0460b = new CobolString(256);
    private CobolString fld0461a = new CobolString(256);
    private CobolString fld0461b = new CobolString(256);
    private CobolString fld0462a = new CobolString(256);
    private CobolString fld0462b = new CobolString(256);
    private CobolString fld0463a = new CobolString(256);
    private CobolString fld0463b = new CobolString(256);
    private CobolString fld0464a = new CobolString(256);
    private CobolString fld0464b = new CobolString(256);
    private CobolString fld0465a = new CobolString(256);
    private CobolString fld0465b = new CobolString(256);
    private CobolString fld0466a = new CobolString(256);
    private CobolString fld0466b = new CobolString(256);
    private CobolString fld0467a = new CobolString(256);
    private CobolString fld0467b = new CobolString(256);
    private CobolString fld0468a = new CobolString(256);
    private CobolString fld0468b = new CobolString(256);
    private CobolString fld0469a = new CobolString(256);
    private CobolString fld0469b = new CobolString(256);
    private CobolString fld0470a = new CobolString(256);
    private CobolString fld0470b = new CobolString(256);
    private CobolString fld0471a = new CobolString(256);
    private CobolString fld0471b = new CobolString(256);
    private CobolString fld0472a = new CobolString(256);
    private CobolString fld0472b = new CobolString(256);
    private CobolString fld0473a = new CobolString(256);
    private CobolString fld0473b = new CobolString(256);
    private CobolString fld0474a = new CobolString(256);
    private CobolString fld0474b = new CobolString(256);
    private CobolString fld0475a = new CobolString(256);
    private CobolString fld0475b = new CobolString(256);
    private CobolString fld0476a = new CobolString(256);
    private CobolString fld0476b = new CobolString(256);
    private CobolString fld0477a = new CobolString(256);
    private CobolString fld0477b = new CobolString(256);
    private CobolString fld0478a = new CobolString(256);
    private CobolString fld0478b = new CobolString(256);
    private CobolString fld0479a = new CobolString(256);
    private CobolString fld0479b = new CobolString(256);
    private CobolString fld0480a = new CobolString(256);
    private CobolString fld0480b = new CobolString(256);
    private CobolString fld0481a = new CobolString(256);
    private CobolString fld0481b = new CobolString(256);
    private CobolString fld0482a = new CobolString(256);
    private CobolString fld0482b = new CobolString(256);
    private CobolString fld0483a = new CobolString(256);
    private CobolString fld0483b = new CobolString(256);
    private CobolString fld0484a = new CobolString(256);
    private CobolString fld0484b = new CobolString(256);
    private CobolString fld0485a = new CobolString(256);
    private CobolString fld0485b = new CobolString(256);
    private CobolString fld0486a = new CobolString(256);
    private CobolString fld0486b = new CobolString(256);
    private CobolString fld0487a = new CobolString(256);
    private CobolString fld0487b = new CobolString(256);
    private CobolString fld0488a = new CobolString(256);
    private CobolString fld0488b = new CobolString(256);
    private CobolString fld0489a = new CobolString(256);
    private CobolString fld0489b = new CobolString(256);
    private CobolString fld0490a = new CobolString(256);
    private CobolString fld0490b = new CobolString(256);
    private CobolString fld0491a = new CobolString(256);
    private CobolString fld0491b = new CobolString(256);
    private CobolString fld0492a = new CobolString(256);
    private CobolString fld0492b = new CobolString(256);
    private CobolString fld0493a = new CobolString(256);
    private CobolString fld0493b = new CobolString(256);
    private CobolString fld0494a = new CobolString(256);
    private CobolString fld0494b = new CobolString(256);
    private CobolString fld0495a = new CobolString(256);
    private CobolString fld0495b = new CobolString(256);
    private CobolString fld0496a = new CobolString(256);
    private CobolString fld0496b = new CobolString(256);
    private CobolString fld0497a = new CobolString(256);
    private CobolString fld0497b = new CobolString(256);
    private CobolString fld0498a = new CobolString(256);
    private CobolString fld0498b = new CobolString(256);
    private CobolString fld0499a = new CobolString(256);
    private CobolString fld0499b = new CobolString(256);
    private CobolString xpc_fld0001b = new CobolString(256);
    private CobolString[] hex_of = new CobolString[100];
    private CobolString xpc_fld0002b = new CobolString(256);
    private CobolString xpc_fld0003b = new CobolString(256);
    private CobolString xpc_fld0004b = new CobolString(256);
    private CobolString xpc_fld0005b = new CobolString(256);
    private CobolString xpc_fld0006b = new CobolString(256);
    private CobolString xpc_fld0007b = new CobolString(256);
    private CobolString xpc_fld0008b = new CobolString(256);
    private CobolString xpc_fld0009b = new CobolString(256);
    private CobolString xpc_fld0010b = new CobolString(256);
    private CobolString xpc_fld0011b = new CobolString(256);
    private CobolString xpc_fld0012b = new CobolString(256);
    private CobolString xpc_fld0013b = new CobolString(256);
    private CobolString xpc_fld0014b = new CobolString(256);
    private CobolString xpc_fld0015b = new CobolString(256);
    private CobolString xpc_fld0016b = new CobolString(256);
    private CobolString xpc_fld0017b = new CobolString(256);
    private CobolString xpc_fld0018b = new CobolString(256);
    private CobolString xpc_fld0019b = new CobolString(256);
    private CobolString xpc_fld0020b = new CobolString(256);
    private CobolString xpc_fld0021b = new CobolString(256);
    private CobolString xpc_fld0022b = new CobolString(256);
    private CobolString xpc_fld0023b = new CobolString(256);
    private CobolString xpc_fld0024b = new CobolString(256);
    private CobolString xpc_fld0025b = new CobolString(256);
    private CobolString xpc_fld0026b = new CobolString(256);
    private CobolString xpc_fld0027b = new CobolString(256);
    private CobolString xpc_fld0028b = new CobolString(256);
    private CobolString xpc_fld0029b = new CobolString(256);
    private CobolString xpc_fld0030b = new CobolString(256);
    private CobolString xpc_fld0031b = new CobolString(256);
    private CobolString xpc_fld0032b = new CobolString(256);
    private CobolString xpc_fld0033b = new CobolString(256);
    private CobolString xpc_fld0034b = new CobolString(256);
    private CobolString xpc_fld0035b = new CobolString(256);
    private CobolString xpc_fld0036b = new CobolString(256);
    private CobolString xpc_fld0037b = new CobolString(256);
    private CobolString xpc_fld0038b = new CobolString(256);
    private CobolString xpc_fld0039b = new CobolString(256);
    private CobolString xpc_fld0040b = new CobolString(256);
    private CobolString xpc_fld0041b = new CobolString(256);
    private CobolString xpc_fld0042b = new CobolString(256);
    private CobolString xpc_fld0043b = new CobolString(256);
    private CobolString xpc_fld0044b = new CobolString(256);
    private CobolString xpc_fld0045b = new CobolString(256);
    private CobolString xpc_fld0046b = new CobolString(256);
    private CobolString xpc_fld0047b = new CobolString(256);
    private CobolString xpc_fld0048b = new CobolString(256);
    private CobolString xpc_fld0049b = new CobolString(256);
    private CobolString xpc_fld0050b = new CobolString(256);
    private CobolString xpc_fld0051b = new CobolString(256);
    private CobolString xpc_fld0052b = new CobolString(256);
    private CobolString xpc_fld0053b = new CobolString(256);
    private CobolString xpc_fld0054b = new CobolString(256);
    private CobolString xpc_fld0055b = new CobolString(256);
    private CobolString xpc_fld0056b = new CobolString(256);
    private CobolString xpc_fld0057b = new CobolString(256);
    private CobolString xpc_fld0058b = new CobolString(256);
    private CobolString xpc_fld0059b = new CobolString(256);
    private CobolString xpc_fld0060b = new CobolString(256);
    private CobolString xpc_fld0061b = new CobolString(256);
    private CobolString xpc_fld0062b = new CobolString(256);
    private CobolString xpc_fld0063b = new CobolString(256);
    private CobolString xpc_fld0064b = new CobolString(256);
    private CobolString xpc_fld0065b = new CobolString(256);
    private CobolString xpc_fld0066b = new CobolString(256);
    private CobolString xpc_fld0067b = new CobolString(256);
    private CobolString xpc_fld0068b = new CobolString(256);
    private CobolString xpc_fld0069b = new CobolString(256);
    private CobolString xpc_fld0070b = new CobolString(256);
    private CobolString xpc_fld0071b = new CobolString(256);
    private CobolString xpc_fld0072b = new CobolString(256);
    private CobolString xpc_fld0073b = new CobolString(256);
    private CobolString xpc_fld0074b = new CobolString(256);
    private CobolString xpc_fld0075b = new CobolString(256);
    private CobolString xpc_fld0076b = new CobolString(256);
    private CobolString xpc_fld0077b = new CobolString(256);
    private CobolString xpc_fld0078b = new CobolString(256);
    private CobolString xpc_fld0079b = new CobolString(256);
    private CobolString xpc_fld0080b = new CobolString(256);
    private CobolString xpc_fld0081b = new CobolString(256);
    private CobolString xpc_fld0082b = new CobolString(256);
    private CobolString xpc_fld0083b = new CobolString(256);
    private CobolString xpc_fld0084b = new CobolString(256);
    private CobolString xpc_fld0085b = new CobolString(256);
    private CobolString xpc_fld0086b = new CobolString(256);
    private CobolString xpc_fld0087b = new CobolString(256);
    private CobolString xpc_fld0088b = new CobolString(256);
    private CobolString xpc_fld0089b = new CobolString(256);
    private CobolString xpc_fld0090b = new CobolString(256);
    private CobolString xpc_fld0091b = new CobolString(256);
    private CobolString xpc_fld0092b = new CobolString(256);
    private CobolString xpc_fld0093b = new CobolString(256);
    private CobolString xpc_fld0094b = new CobolString(256);
    private CobolString xpc_fld0095b = new CobolString(256);
    private CobolString xpc_fld0096b = new CobolString(256);
    private CobolString xpc_fld0097b = new CobolString(256);
    private CobolString xpc_fld0098b = new CobolString(256);
    private CobolString xpc_fld0099b = new CobolString(256);
    private CobolString xpc_fld0100b = new CobolString(256);
    private CobolString xpc_fld0101b = new CobolString(256);
    private CobolString xpc_fld0102b = new CobolString(256);
    private CobolString xpc_fld0103b = new CobolString(256);
    private CobolString xpc_fld0104b = new CobolString(256);
    private CobolString xpc_fld0105b = new CobolString(256);
    private CobolString xpc_fld0106b = new CobolString(256);
    private CobolString xpc_fld0107b = new CobolString(256);
    private CobolString xpc_fld0108b = new CobolString(256);
    private CobolString xpc_fld0109b = new CobolString(256);
    private CobolString xpc_fld0110b = new CobolString(256);
    private CobolString xpc_fld0111b = new CobolString(256);
    private CobolString xpc_fld0112b = new CobolString(256);
    private CobolString xpc_fld0113b = new CobolString(256);
    private CobolString xpc_fld0114b = new CobolString(256);
    private CobolString xpc_fld0115b = new CobolString(256);
    private CobolString xpc_fld0116b = new CobolString(256);
    private CobolString xpc_fld0117b = new CobolString(256);
    private CobolString xpc_fld0118b = new CobolString(256);
    private CobolString xpc_fld0119b = new CobolString(256);
    private CobolString xpc_fld0120b = new CobolString(256);
    private CobolString xpc_fld0121b = new CobolString(256);
    private CobolString xpc_fld0122b = new CobolString(256);
    private CobolString xpc_fld0123b = new CobolString(256);
    private CobolString xpc_fld0124b = new CobolString(256);
    private CobolString xpc_fld0125b = new CobolString(256);
    private CobolString xpc_fld0126b = new CobolString(256);
    private CobolString xpc_fld0127b = new CobolString(256);
    private CobolString xpc_fld0128b = new CobolString(256);
    private CobolString xpc_fld0129b = new CobolString(256);
    private CobolString xpc_fld0130b = new CobolString(256);
    private CobolString xpc_fld0131b = new CobolString(256);
    private CobolString xpc_fld0132b = new CobolString(256);
    private CobolString xpc_fld0133b = new CobolString(256);
    private CobolString xpc_fld0134b = new CobolString(256);
    private CobolString xpc_fld0135b = new CobolString(256);
    private CobolString xpc_fld0136b = new CobolString(256);
    private CobolString xpc_fld0137b = new CobolString(256);
    private CobolString xpc_fld0138b = new CobolString(256);
    private CobolString xpc_fld0139b = new CobolString(256);
    private CobolString xpc_fld0140b = new CobolString(256);
    private CobolString xpc_fld0141b = new CobolString(256);
    private CobolString xpc_fld0142b = new CobolString(256);
    private CobolString xpc_fld0143b = new CobolString(256);
    private CobolString xpc_fld0144b = new CobolString(256);
    private CobolString xpc_fld0145b = new CobolString(256);
    private CobolString xpc_fld0146b = new CobolString(256);
    private CobolString xpc_fld0147b = new CobolString(256);
    private CobolString xpc_fld0148b = new CobolString(256);
    private CobolString xpc_fld0149b = new CobolString(256);
    private CobolString xpc_fld0150b = new CobolString(256);
    private CobolString xpc_fld0151b = new CobolString(256);
    private CobolString xpc_fld0152b = new CobolString(256);
    private CobolString xpc_fld0153b = new CobolString(256);
    private CobolString xpc_fld0154b = new CobolString(256);
    private CobolString xpc_fld0155b = new CobolString(256);
    private CobolString xpc_fld0156b = new CobolString(256);
    private CobolString xpc_fld0157b = new CobolString(256);
    private CobolString xpc_fld0158b = new CobolString(256);
    private CobolString xpc_fld0159b = new CobolString(256);
    private CobolString xpc_fld0160b = new CobolString(256);
    private CobolString xpc_fld0161b = new CobolString(256);
    private CobolString xpc_fld0162b = new CobolString(256);
    private CobolString xpc_fld0163b = new CobolString(256);
    private CobolString xpc_fld0164b = new CobolString(256);
    private CobolString xpc_fld0165b = new CobolString(256);
    private CobolString xpc_fld0166b = new CobolString(256);
    private CobolString xpc_fld0167b = new CobolString(256);
    private CobolString xpc_fld0168b = new CobolString(256);
    private CobolString xpc_fld0169b = new CobolString(256);
    private CobolString xpc_fld0170b = new CobolString(256);
    private CobolString xpc_fld0171b = new CobolString(256);
    private CobolString xpc_fld0172b = new CobolString(256);
    private CobolString xpc_fld0173b = new CobolString(256);
    private CobolString xpc_fld0174b = new CobolString(256);
    private CobolString xpc_fld0175b = new CobolString(256);
    private CobolString xpc_fld0176b = new CobolString(256);
    private CobolString xpc_fld0177b = new CobolString(256);
    private CobolString xpc_fld0178b = new CobolString(256);
    private CobolString xpc_fld0179b = new CobolString(256);
    private CobolString xpc_fld0180b = new CobolString(256);
    private CobolString xpc_fld0181b = new CobolString(256);
    private CobolString xpc_fld0182b = new CobolString(256);
    private CobolString xpc_fld0183b = new CobolString(256);
    private CobolString xpc_fld0184b = new CobolString(256);
    private CobolString xpc_fld0185b = new CobolString(256);
    private CobolString xpc_fld0186b = new CobolString(256);
    private CobolString xpc_fld0187b = new CobolString(256);
    private CobolString xpc_fld0188b = new CobolString(256);
    private CobolString xpc_fld0189b = new CobolString(256);
    private CobolString xpc_fld0190b = new CobolString(256);
    private CobolString xpc_fld0191b = new CobolString(256);
    private CobolString xpc_fld0192b = new CobolString(256);
    private CobolString xpc_fld0193b = new CobolString(256);
    private CobolString xpc_fld0194b = new CobolString(256);
    private CobolString xpc_fld0195b = new CobolString(256);
    private CobolString xpc_fld0196b = new CobolString(256);
    private CobolString xpc_fld0197b = new CobolString(256);
    private CobolString xpc_fld0198b = new CobolString(256);
    private CobolString xpc_fld0199b = new CobolString(256);
    private CobolString xpc_fld0200b = new CobolString(256);
    private CobolString xpc_fld0201b = new CobolString(256);
    private CobolString xpc_fld0202b = new CobolString(256);
    private CobolString xpc_fld0203b = new CobolString(256);
    private CobolString xpc_fld0204b = new CobolString(256);
    private CobolString xpc_fld0205b = new CobolString(256);
    private CobolString xpc_fld0206b = new CobolString(256);
    private CobolString xpc_fld0207b = new CobolString(256);
    private CobolString xpc_fld0208b = new CobolString(256);
    private CobolString xpc_fld0209b = new CobolString(256);
    private CobolString xpc_fld0210b = new CobolString(256);
    private CobolString xpc_fld0211b = new CobolString(256);
    private CobolString xpc_fld0212b = new CobolString(256);
    private CobolString xpc_fld0213b = new CobolString(256);
    private CobolString xpc_fld0214b = new CobolString(256);
    private CobolString xpc_fld0215b = new CobolString(256);
    private CobolString xpc_fld0216b = new CobolString(256);
    private CobolString xpc_fld0217b = new CobolString(256);
    private CobolString xpc_fld0218b = new CobolString(256);
    private CobolString xpc_fld0219b = new CobolString(256);
    private CobolString xpc_fld0220b = new CobolString(256);
    private CobolString xpc_fld0221b = new CobolString(256);
    private CobolString xpc_fld0222b = new CobolString(256);
    private CobolString xpc_fld0223b = new CobolString(256);
    private CobolString xpc_fld0224b = new CobolString(256);
    private CobolString xpc_fld0225b = new CobolString(256);
    private CobolString xpc_fld0226b = new CobolString(256);
    private CobolString xpc_fld0227b = new CobolString(256);
    private CobolString xpc_fld0228b = new CobolString(256);
    private CobolString xpc_fld0229b = new CobolString(256);
    private CobolString xpc_fld0230b = new CobolString(256);
    private CobolString xpc_fld0231b = new CobolString(256);
    private CobolString xpc_fld0232b = new CobolString(256);
    private CobolString xpc_fld0233b = new CobolString(256);
    private CobolString xpc_fld0234b = new CobolString(256);
    private CobolString xpc_fld0235b = new CobolString(256);
    private CobolString xpc_fld0236b = new CobolString(256);
    private CobolString xpc_fld0237b = new CobolString(256);
    private CobolString xpc_fld0238b = new CobolString(256);
    private CobolString xpc_fld0239b = new CobolString(256);
    private CobolString xpc_fld0240b = new CobolString(256);
    private CobolString xpc_fld0241b = new CobolString(256);
    private CobolString xpc_fld0242b = new CobolString(256);
    private CobolString xpc_fld0243b = new CobolString(256);
    private CobolString xpc_fld0244b = new CobolString(256);
    private CobolString xpc_fld0245b = new CobolString(256);
    private CobolString xpc_fld0246b = new CobolString(256);
    private CobolString xpc_fld0247b = new CobolString(256);
    private CobolString xpc_fld0248b = new CobolString(256);
    private CobolString xpc_fld0249b = new CobolString(256);
    private CobolString xpc_fld0250b = new CobolString(256);
    private CobolString xpc_fld0251b = new CobolString(256);
    private CobolString xpc_fld0252b = new CobolString(256);
    private CobolString xpc_fld0253b = new CobolString(256);
    private CobolString xpc_fld0254b = new CobolString(256);
    private CobolString xpc_fld0255b = new CobolString(256);
    private CobolString xpc_fld0256b = new CobolString(256);
    private CobolString xpc_fld0257b = new CobolString(256);
    private CobolString xpc_fld0258b = new CobolString(256);
    private CobolString xpc_fld0259b = new CobolString(256);
    private CobolString xpc_fld0260b = new CobolString(256);
    private CobolString xpc_fld0261b = new CobolString(256);
    private CobolString xpc_fld0262b = new CobolString(256);
    private CobolString xpc_fld0263b = new CobolString(256);
    private CobolString xpc_fld0264b = new CobolString(256);
    private CobolString xpc_fld0265b = new CobolString(256);
    private CobolString xpc_fld0266b = new CobolString(256);
    private CobolString xpc_fld0267b = new CobolString(256);
    private CobolString xpc_fld0268b = new CobolString(256);
    private CobolString xpc_fld0269b = new CobolString(256);
    private CobolString xpc_fld0270b = new CobolString(256);
    private CobolString xpc_fld0271b = new CobolString(256);
    private CobolString xpc_fld0272b = new CobolString(256);
    private CobolString xpc_fld0273b = new CobolString(256);
    private CobolString xpc_fld0274b = new CobolString(256);
    private CobolString xpc_fld0275b = new CobolString(256);
    private CobolString xpc_fld0276b = new CobolString(256);
    private CobolString xpc_fld0277b = new CobolString(256);
    private CobolString xpc_fld0278b = new CobolString(256);
    private CobolString xpc_fld0279b = new CobolString(256);
    private CobolString xpc_fld0280b = new CobolString(256);
    private CobolString xpc_fld0281b = new CobolString(256);
    private CobolString xpc_fld0282b = new CobolString(256);
    private CobolString xpc_fld0283b = new CobolString(256);
    private CobolString xpc_fld0284b = new CobolString(256);
    private CobolString xpc_fld0285b = new CobolString(256);
    private CobolString xpc_fld0286b = new CobolString(256);
    private CobolString xpc_fld0287b = new CobolString(256);
    private CobolString xpc_fld0288b = new CobolString(256);
    private CobolString xpc_fld0289b = new CobolString(256);
    private CobolString xpc_fld0290b = new CobolString(256);
    private CobolString xpc_fld0291b = new CobolString(256);
    private CobolString xpc_fld0292b = new CobolString(256);
    private CobolString xpc_fld0293b = new CobolString(256);
    private CobolString xpc_fld0294b = new CobolString(256);
    private CobolString xpc_fld0295b = new CobolString(256);
    private CobolString xpc_fld0296b = new CobolString(256);
    private CobolString xpc_fld0297b = new CobolString(256);
    private CobolString xpc_fld0298b = new CobolString(256);
    private CobolString xpc_fld0299b = new CobolString(256);
    private CobolString xpc_fld0300b = new CobolString(256);
    private CobolString xpc_fld0301b = new CobolString(256);
    private CobolString xpc_fld0302b = new CobolString(256);
    private CobolString xpc_fld0303b = new CobolString(256);
    private CobolString xpc_fld0304b = new CobolString(256);
    private CobolString xpc_fld0305b = new CobolString(256);
    private CobolString xpc_fld0306b = new CobolString(256);
    private CobolString xpc_fld0307b = new CobolString(256);
    private CobolString xpc_fld0308b = new CobolString(256);
    private CobolString xpc_fld0309b = new CobolString(256);
    private CobolString xpc_fld0310b = new CobolString(256);
    private CobolString xpc_fld0311b = new CobolString(256);
    private CobolString xpc_fld0312b = new CobolString(256);
    private CobolString xpc_fld0313b = new CobolString(256);
    private CobolString xpc_fld0314b = new CobolString(256);
    private CobolString xpc_fld0315b = new CobolString(256);
    private CobolString xpc_fld0316b = new CobolString(256);
    private CobolString xpc_fld0317b = new CobolString(256);
    private CobolString xpc_fld0318b = new CobolString(256);
    private CobolString xpc_fld0319b = new CobolString(256);
    private CobolString xpc_fld0320b = new CobolString(256);
    private CobolString xpc_fld0321b = new CobolString(256);
    private CobolString xpc_fld0322b = new CobolString(256);
    private CobolString xpc_fld0323b = new CobolString(256);
    private CobolString xpc_fld0324b = new CobolString(256);
    private CobolString xpc_fld0325b = new CobolString(256);
    private CobolString xpc_fld0326b = new CobolString(256);
    private CobolString xpc_fld0327b = new CobolString(256);
    private CobolString xpc_fld0328b = new CobolString(256);
    private CobolString xpc_fld0329b = new CobolString(256);
    private CobolString xpc_fld0330b = new CobolString(256);
    private CobolString xpc_fld0331b = new CobolString(256);
    private CobolString xpc_fld0332b = new CobolString(256);
    private CobolString xpc_fld0333b = new CobolString(256);
    private CobolString xpc_fld0334b = new CobolString(256);
    private CobolString xpc_fld0335b = new CobolString(256);
    private CobolString xpc_fld0336b = new CobolString(256);
    private CobolString xpc_fld0337b = new CobolString(256);
    private CobolString xpc_fld0338b = new CobolString(256);
    private CobolString xpc_fld0339b = new CobolString(256);
    private CobolString xpc_fld0340b = new CobolString(256);
    private CobolString xpc_fld0341b = new CobolString(256);
    private CobolString xpc_fld0342b = new CobolString(256);
    private CobolString xpc_fld0343b = new CobolString(256);
    private CobolString xpc_fld0344b = new CobolString(256);
    private CobolString xpc_fld0345b = new CobolString(256);
    private CobolString xpc_fld0346b = new CobolString(256);
    private CobolString xpc_fld0347b = new CobolString(256);
    private CobolString xpc_fld0348b = new CobolString(256);
    private CobolString xpc_fld0349b = new CobolString(256);
    private CobolString xpc_fld0350b = new CobolString(256);
    private CobolString xpc_fld0351b = new CobolString(256);
    private CobolString xpc_fld0352b = new CobolString(256);
    private CobolString xpc_fld0353b = new CobolString(256);
    private CobolString xpc_fld0354b = new CobolString(256);
    private CobolString xpc_fld0355b = new CobolString(256);
    private CobolString xpc_fld0356b = new CobolString(256);
    private CobolString xpc_fld0357b = new CobolString(256);
    private CobolString xpc_fld0358b = new CobolString(256);
    private CobolString xpc_fld0359b = new CobolString(256);
    private CobolString xpc_fld0360b = new CobolString(256);
    private CobolString xpc_fld0361b = new CobolString(256);
    private CobolString xpc_fld0362b = new CobolString(256);
    private CobolString xpc_fld0363b = new CobolString(256);
    private CobolString xpc_fld0364b = new CobolString(256);
    private CobolString xpc_fld0365b = new CobolString(256);
    private CobolString xpc_fld0366b = new CobolString(256);
    private CobolString xpc_fld0367b = new CobolString(256);
    private CobolString xpc_fld0368b = new CobolString(256);
    private CobolString xpc_fld0369b = new CobolString(256);
    private CobolString xpc_fld0370b = new CobolString(256);
    private CobolString xpc_fld0371b = new CobolString(256);
    private CobolString xpc_fld0372b = new CobolString(256);
    private CobolString xpc_fld0373b = new CobolString(256);
    private CobolString xpc_fld0374b = new CobolString(256);
    private CobolString xpc_fld0375b = new CobolString(256);
    private CobolString xpc_fld0376b = new CobolString(256);
    private CobolString xpc_fld0377b = new CobolString(256);
    private CobolString xpc_fld0378b = new CobolString(256);
    private CobolString xpc_fld0379b = new CobolString(256);
    private CobolString xpc_fld0380b = new CobolString(256);
    private CobolString xpc_fld0381b = new CobolString(256);
    private CobolString xpc_fld0382b = new CobolString(256);
    private CobolString xpc_fld0383b = new CobolString(256);
    private CobolString xpc_fld0384b = new CobolString(256);
    private CobolString xpc_fld0385b = new CobolString(256);
    private CobolString xpc_fld0386b = new CobolString(256);
    private CobolString xpc_fld0387b = new CobolString(256);
    private CobolString xpc_fld0388b = new CobolString(256);
    private CobolString xpc_fld0389b = new CobolString(256);
    private CobolString xpc_fld0390b = new CobolString(256);
    private CobolString xpc_fld0391b = new CobolString(256);
    private CobolString xpc_fld0392b = new CobolString(256);
    private CobolString xpc_fld0393b = new CobolString(256);
    private CobolString xpc_fld0394b = new CobolString(256);
    private CobolString xpc_fld0395b = new CobolString(256);
    private CobolString xpc_fld0396b = new CobolString(256);
    private CobolString xpc_fld0397b = new CobolString(256);
    private CobolString xpc_fld0398b = new CobolString(256);
    private CobolString xpc_fld0399b = new CobolString(256);
    private CobolString xpc_fld0400b = new CobolString(256);
    private CobolString xpc_fld0401b = new CobolString(256);
    private CobolString xpc_fld0402b = new CobolString(256);
    private CobolString xpc_fld0403b = new CobolString(256);
    private CobolString xpc_fld0404b = new CobolString(256);
    private CobolString xpc_fld0405b = new CobolString(256);
    private CobolString xpc_fld0406b = new CobolString(256);
    private CobolString xpc_fld0407b = new CobolString(256);
    private CobolString xpc_fld0408b = new CobolString(256);
    private CobolString xpc_fld0409b = new CobolString(256);
    private CobolString xpc_fld0410b = new CobolString(256);
    private CobolString xpc_fld0411b = new CobolString(256);
    private CobolString xpc_fld0412b = new CobolString(256);
    private CobolString xpc_fld0413b = new CobolString(256);
    private CobolString xpc_fld0414b = new CobolString(256);
    private CobolString xpc_fld0415b = new CobolString(256);
    private CobolString xpc_fld0416b = new CobolString(256);
    private CobolString xpc_fld0417b = new CobolString(256);
    private CobolString xpc_fld0418b = new CobolString(256);
    private CobolString xpc_fld0419b = new CobolString(256);
    private CobolString xpc_fld0420b = new CobolString(256);
    private CobolString xpc_fld0421b = new CobolString(256);
    private CobolString xpc_fld0422b = new CobolString(256);
    private CobolString xpc_fld0423b = new CobolString(256);
    private CobolString xpc_fld0424b = new CobolString(256);
    private CobolString xpc_fld0425b = new CobolString(256);
    private CobolString xpc_fld0426b = new CobolString(256);
    private CobolString xpc_fld0427b = new CobolString(256);
    private CobolString xpc_fld0428b = new CobolString(256);
    private CobolString xpc_fld0429b = new CobolString(256);
    private CobolString xpc_fld0430b = new CobolString(256);
    private CobolString xpc_fld0431b = new CobolString(256);
    private CobolString xpc_fld0432b = new CobolString(256);
    private CobolString xpc_fld0433b = new CobolString(256);
    private CobolString xpc_fld0434b = new CobolString(256);
    private CobolString xpc_fld0435b = new CobolString(256);
    private CobolString xpc_fld0436b = new CobolString(256);
    private CobolString xpc_fld0437b = new CobolString(256);
    private CobolString xpc_fld0438b = new CobolString(256);
    private CobolString xpc_fld0439b = new CobolString(256);
    private CobolString xpc_fld0440b = new CobolString(256);
    private CobolString xpc_fld0441b = new CobolString(256);
    private CobolString xpc_fld0442b = new CobolString(256);
    private CobolString xpc_fld0443b = new CobolString(256);
    private CobolString xpc_fld0444b = new CobolString(256);
    private CobolString xpc_fld0445b = new CobolString(256);
    private CobolString xpc_fld0446b = new CobolString(256);
    private CobolString xpc_fld0447b = new CobolString(256);
    private CobolString xpc_fld0448b = new CobolString(256);
    private CobolString xpc_fld0449b = new CobolString(256);
    private CobolString xpc_fld0450b = new CobolString(256);
    private CobolString xpc_fld0451b = new CobolString(256);
    private CobolString xpc_fld0452b = new CobolString(256);
    private CobolString xpc_fld0453b = new CobolString(256);
    private CobolString xpc_fld0454b = new CobolString(256);
    private CobolString xpc_fld0455b = new CobolString(256);
    private CobolString xpc_fld0456b = new CobolString(256);
    private CobolString xpc_fld0457b = new CobolString(256);
    private CobolString xpc_fld0458b = new CobolString(256);
    private CobolString xpc_fld0459b = new CobolString(256);
    private CobolString xpc_fld0460b = new CobolString(256);
    private CobolString xpc_fld0461b = new CobolString(256);
    private CobolString xpc_fld0462b = new CobolString(256);
    private CobolString xpc_fld0463b = new CobolString(256);
    private CobolString xpc_fld0464b = new CobolString(256);
    private CobolString xpc_fld0465b = new CobolString(256);
    private CobolString xpc_fld0466b = new CobolString(256);
    private CobolString xpc_fld0467b = new CobolString(256);
    private CobolString xpc_fld0468b = new CobolString(256);
    private CobolString xpc_fld0469b = new CobolString(256);
    private CobolString xpc_fld0470b = new CobolString(256);
    private CobolString xpc_fld0471b = new CobolString(256);
    private CobolString xpc_fld0472b = new CobolString(256);
    private CobolString xpc_fld0473b = new CobolString(256);
    private CobolString xpc_fld0474b = new CobolString(256);
    private CobolString xpc_fld0475b = new CobolString(256);
    private CobolString xpc_fld0476b = new CobolString(256);
    private CobolString xpc_fld0477b = new CobolString(256);
    private CobolString xpc_fld0478b = new CobolString(256);
    private CobolString xpc_fld0479b = new CobolString(256);
    private CobolString xpc_fld0480b = new CobolString(256);
    private CobolString xpc_fld0481b = new CobolString(256);
    private CobolString xpc_fld0482b = new CobolString(256);
    private CobolString xpc_fld0483b = new CobolString(256);
    private CobolString xpc_fld0484b = new CobolString(256);
    private CobolString xpc_fld0485b = new CobolString(256);
    private CobolString xpc_fld0486b = new CobolString(256);
    private CobolString xpc_fld0487b = new CobolString(256);
    private CobolString xpc_fld0488b = new CobolString(256);
    private CobolString xpc_fld0489b = new CobolString(256);
    private CobolString xpc_fld0490b = new CobolString(256);
    private CobolString xpc_fld0491b = new CobolString(256);
    private CobolString xpc_fld0492b = new CobolString(256);
    private CobolString xpc_fld0493b = new CobolString(256);
    private CobolString xpc_fld0494b = new CobolString(256);
    private CobolString xpc_fld0495b = new CobolString(256);
    private CobolString xpc_fld0496b = new CobolString(256);
    private CobolString xpc_fld0497b = new CobolString(256);
    private CobolString xpc_fld0498b = new CobolString(256);
    private CobolString xpc_fld0499b = new CobolString(256);

    private void para_main() {
        /* RAW: * Test with */
        CobolDisplay.display(String.valueOf(on) + String.valueOf(error));
        do_check();
        no_disp.set(String.valueOf((Integer.parseInt(String.valueOf(cb_true).trim()) * Integer.parseInt(String.valueOf(some).trim()))));
        /* RAW: performance checks on the */
    }

    private void way() {
        for (int _i0 = 0; _i0 < 10000; _i0++) {
        }
        return;
    }

    private void do_check() {
        /* RAW: * 2000 - */
    }

    private void test() {
        test_part0();
        test_part1();
    }
    private void test_part0() {
        fld0001b.set(new BigDecimal(String.valueOf(fld0001b).trim()).add(new BigDecimal(String.valueOf(fld0001a).trim())).toPlainString());
        fld0002b.set(new BigDecimal(String.valueOf(fld0002b).trim()).subtract(new BigDecimal(String.valueOf(fld0002a).trim())).toPlainString());
        fld0003b.set(new BigDecimal(String.valueOf(fld0003b).trim()).add(new BigDecimal(String.valueOf(fld0003a).trim())).toPlainString());
        fld0004b.set(new BigDecimal(String.valueOf(fld0004b).trim()).subtract(new BigDecimal(String.valueOf(fld0004a).trim())).toPlainString());
        fld0005b.set(new BigDecimal(String.valueOf(fld0005b).trim()).add(new BigDecimal(String.valueOf(fld0005a).trim())).toPlainString());
        fld0006b.set(new BigDecimal(String.valueOf(fld0006b).trim()).subtract(new BigDecimal(String.valueOf(fld0006a).trim())).toPlainString());
        fld0007b.set(new BigDecimal(String.valueOf(fld0007b).trim()).add(new BigDecimal(String.valueOf(fld0007a).trim())).toPlainString());
        fld0008b.set(new BigDecimal(String.valueOf(fld0008b).trim()).subtract(new BigDecimal(String.valueOf(fld0008a).trim())).toPlainString());
        fld0009b.set(new BigDecimal(String.valueOf(fld0009b).trim()).add(new BigDecimal(String.valueOf(fld0009a).trim())).toPlainString());
        fld0010b.set(new BigDecimal(String.valueOf(fld0010b).trim()).subtract(new BigDecimal(String.valueOf(fld0010a).trim())).toPlainString());
        fld0011b.set(new BigDecimal(String.valueOf(fld0011b).trim()).add(new BigDecimal(String.valueOf(fld0011a).trim())).toPlainString());
        fld0012b.set(new BigDecimal(String.valueOf(fld0012b).trim()).subtract(new BigDecimal(String.valueOf(fld0012a).trim())).toPlainString());
        fld0013b.set(new BigDecimal(String.valueOf(fld0013b).trim()).add(new BigDecimal(String.valueOf(fld0013a).trim())).toPlainString());
        fld0014b.set(new BigDecimal(String.valueOf(fld0014b).trim()).subtract(new BigDecimal(String.valueOf(fld0014a).trim())).toPlainString());
        fld0015b.set(new BigDecimal(String.valueOf(fld0015b).trim()).add(new BigDecimal(String.valueOf(fld0015a).trim())).toPlainString());
        fld0016b.set(new BigDecimal(String.valueOf(fld0016b).trim()).subtract(new BigDecimal(String.valueOf(fld0016a).trim())).toPlainString());
        fld0017b.set(new BigDecimal(String.valueOf(fld0017b).trim()).add(new BigDecimal(String.valueOf(fld0017a).trim())).toPlainString());
        fld0018b.set(new BigDecimal(String.valueOf(fld0018b).trim()).subtract(new BigDecimal(String.valueOf(fld0018a).trim())).toPlainString());
        fld0019b.set(new BigDecimal(String.valueOf(fld0019b).trim()).add(new BigDecimal(String.valueOf(fld0019a).trim())).toPlainString());
        fld0020b.set(new BigDecimal(String.valueOf(fld0020b).trim()).subtract(new BigDecimal(String.valueOf(fld0020a).trim())).toPlainString());
        fld0021b.set(new BigDecimal(String.valueOf(fld0021b).trim()).add(new BigDecimal(String.valueOf(fld0021a).trim())).toPlainString());
        fld0022b.set(new BigDecimal(String.valueOf(fld0022b).trim()).subtract(new BigDecimal(String.valueOf(fld0022a).trim())).toPlainString());
        fld0023b.set(new BigDecimal(String.valueOf(fld0023b).trim()).add(new BigDecimal(String.valueOf(fld0023a).trim())).toPlainString());
        fld0024b.set(new BigDecimal(String.valueOf(fld0024b).trim()).subtract(new BigDecimal(String.valueOf(fld0024a).trim())).toPlainString());
        fld0025b.set(new BigDecimal(String.valueOf(fld0025b).trim()).add(new BigDecimal(String.valueOf(fld0025a).trim())).toPlainString());
        fld0026b.set(new BigDecimal(String.valueOf(fld0026b).trim()).subtract(new BigDecimal(String.valueOf(fld0026a).trim())).toPlainString());
        fld0027b.set(new BigDecimal(String.valueOf(fld0027b).trim()).add(new BigDecimal(String.valueOf(fld0027a).trim())).toPlainString());
        fld0028b.set(new BigDecimal(String.valueOf(fld0028b).trim()).subtract(new BigDecimal(String.valueOf(fld0028a).trim())).toPlainString());
        fld0029b.set(new BigDecimal(String.valueOf(fld0029b).trim()).add(new BigDecimal(String.valueOf(fld0029a).trim())).toPlainString());
        fld0030b.set(new BigDecimal(String.valueOf(fld0030b).trim()).subtract(new BigDecimal(String.valueOf(fld0030a).trim())).toPlainString());
        fld0031b.set(new BigDecimal(String.valueOf(fld0031b).trim()).add(new BigDecimal(String.valueOf(fld0031a).trim())).toPlainString());
        fld0032b.set(new BigDecimal(String.valueOf(fld0032b).trim()).subtract(new BigDecimal(String.valueOf(fld0032a).trim())).toPlainString());
        fld0033b.set(new BigDecimal(String.valueOf(fld0033b).trim()).add(new BigDecimal(String.valueOf(fld0033a).trim())).toPlainString());
        fld0034b.set(new BigDecimal(String.valueOf(fld0034b).trim()).subtract(new BigDecimal(String.valueOf(fld0034a).trim())).toPlainString());
        fld0035b.set(new BigDecimal(String.valueOf(fld0035b).trim()).add(new BigDecimal(String.valueOf(fld0035a).trim())).toPlainString());
        fld0036b.set(new BigDecimal(String.valueOf(fld0036b).trim()).subtract(new BigDecimal(String.valueOf(fld0036a).trim())).toPlainString());
        fld0037b.set(new BigDecimal(String.valueOf(fld0037b).trim()).add(new BigDecimal(String.valueOf(fld0037a).trim())).toPlainString());
        fld0038b.set(new BigDecimal(String.valueOf(fld0038b).trim()).subtract(new BigDecimal(String.valueOf(fld0038a).trim())).toPlainString());
        fld0039b.set(new BigDecimal(String.valueOf(fld0039b).trim()).add(new BigDecimal(String.valueOf(fld0039a).trim())).toPlainString());
        fld0040b.set(new BigDecimal(String.valueOf(fld0040b).trim()).subtract(new BigDecimal(String.valueOf(fld0040a).trim())).toPlainString());
        fld0041b.set(new BigDecimal(String.valueOf(fld0041b).trim()).add(new BigDecimal(String.valueOf(fld0041a).trim())).toPlainString());
        fld0042b.set(new BigDecimal(String.valueOf(fld0042b).trim()).subtract(new BigDecimal(String.valueOf(fld0042a).trim())).toPlainString());
        fld0043b.set(new BigDecimal(String.valueOf(fld0043b).trim()).add(new BigDecimal(String.valueOf(fld0043a).trim())).toPlainString());
        fld0044b.set(new BigDecimal(String.valueOf(fld0044b).trim()).subtract(new BigDecimal(String.valueOf(fld0044a).trim())).toPlainString());
        fld0045b.set(new BigDecimal(String.valueOf(fld0045b).trim()).add(new BigDecimal(String.valueOf(fld0045a).trim())).toPlainString());
        fld0046b.set(new BigDecimal(String.valueOf(fld0046b).trim()).subtract(new BigDecimal(String.valueOf(fld0046a).trim())).toPlainString());
        fld0047b.set(new BigDecimal(String.valueOf(fld0047b).trim()).add(new BigDecimal(String.valueOf(fld0047a).trim())).toPlainString());
        fld0048b.set(new BigDecimal(String.valueOf(fld0048b).trim()).subtract(new BigDecimal(String.valueOf(fld0048a).trim())).toPlainString());
        fld0049b.set(new BigDecimal(String.valueOf(fld0049b).trim()).add(new BigDecimal(String.valueOf(fld0049a).trim())).toPlainString());
        fld0050b.set(new BigDecimal(String.valueOf(fld0050b).trim()).subtract(new BigDecimal(String.valueOf(fld0050a).trim())).toPlainString());
        fld0051b.set(new BigDecimal(String.valueOf(fld0051b).trim()).add(new BigDecimal(String.valueOf(fld0051a).trim())).toPlainString());
        fld0052b.set(new BigDecimal(String.valueOf(fld0052b).trim()).subtract(new BigDecimal(String.valueOf(fld0052a).trim())).toPlainString());
        fld0053b.set(new BigDecimal(String.valueOf(fld0053b).trim()).add(new BigDecimal(String.valueOf(fld0053a).trim())).toPlainString());
        fld0054b.set(new BigDecimal(String.valueOf(fld0054b).trim()).subtract(new BigDecimal(String.valueOf(fld0054a).trim())).toPlainString());
        fld0055b.set(new BigDecimal(String.valueOf(fld0055b).trim()).add(new BigDecimal(String.valueOf(fld0055a).trim())).toPlainString());
        fld0056b.set(new BigDecimal(String.valueOf(fld0056b).trim()).subtract(new BigDecimal(String.valueOf(fld0056a).trim())).toPlainString());
        fld0057b.set(new BigDecimal(String.valueOf(fld0057b).trim()).add(new BigDecimal(String.valueOf(fld0057a).trim())).toPlainString());
        fld0058b.set(new BigDecimal(String.valueOf(fld0058b).trim()).subtract(new BigDecimal(String.valueOf(fld0058a).trim())).toPlainString());
        fld0059b.set(new BigDecimal(String.valueOf(fld0059b).trim()).add(new BigDecimal(String.valueOf(fld0059a).trim())).toPlainString());
        fld0060b.set(new BigDecimal(String.valueOf(fld0060b).trim()).subtract(new BigDecimal(String.valueOf(fld0060a).trim())).toPlainString());
        fld0061b.set(new BigDecimal(String.valueOf(fld0061b).trim()).add(new BigDecimal(String.valueOf(fld0061a).trim())).toPlainString());
        fld0062b.set(new BigDecimal(String.valueOf(fld0062b).trim()).subtract(new BigDecimal(String.valueOf(fld0062a).trim())).toPlainString());
        fld0063b.set(new BigDecimal(String.valueOf(fld0063b).trim()).add(new BigDecimal(String.valueOf(fld0063a).trim())).toPlainString());
        fld0064b.set(new BigDecimal(String.valueOf(fld0064b).trim()).subtract(new BigDecimal(String.valueOf(fld0064a).trim())).toPlainString());
        fld0065b.set(new BigDecimal(String.valueOf(fld0065b).trim()).add(new BigDecimal(String.valueOf(fld0065a).trim())).toPlainString());
        fld0066b.set(new BigDecimal(String.valueOf(fld0066b).trim()).subtract(new BigDecimal(String.valueOf(fld0066a).trim())).toPlainString());
        fld0067b.set(new BigDecimal(String.valueOf(fld0067b).trim()).add(new BigDecimal(String.valueOf(fld0067a).trim())).toPlainString());
        fld0068b.set(new BigDecimal(String.valueOf(fld0068b).trim()).subtract(new BigDecimal(String.valueOf(fld0068a).trim())).toPlainString());
        fld0069b.set(new BigDecimal(String.valueOf(fld0069b).trim()).add(new BigDecimal(String.valueOf(fld0069a).trim())).toPlainString());
        fld0070b.set(new BigDecimal(String.valueOf(fld0070b).trim()).subtract(new BigDecimal(String.valueOf(fld0070a).trim())).toPlainString());
        fld0071b.set(new BigDecimal(String.valueOf(fld0071b).trim()).add(new BigDecimal(String.valueOf(fld0071a).trim())).toPlainString());
        fld0072b.set(new BigDecimal(String.valueOf(fld0072b).trim()).subtract(new BigDecimal(String.valueOf(fld0072a).trim())).toPlainString());
        fld0073b.set(new BigDecimal(String.valueOf(fld0073b).trim()).add(new BigDecimal(String.valueOf(fld0073a).trim())).toPlainString());
        fld0074b.set(new BigDecimal(String.valueOf(fld0074b).trim()).subtract(new BigDecimal(String.valueOf(fld0074a).trim())).toPlainString());
        fld0075b.set(new BigDecimal(String.valueOf(fld0075b).trim()).add(new BigDecimal(String.valueOf(fld0075a).trim())).toPlainString());
        fld0076b.set(new BigDecimal(String.valueOf(fld0076b).trim()).subtract(new BigDecimal(String.valueOf(fld0076a).trim())).toPlainString());
        fld0077b.set(new BigDecimal(String.valueOf(fld0077b).trim()).add(new BigDecimal(String.valueOf(fld0077a).trim())).toPlainString());
        fld0078b.set(new BigDecimal(String.valueOf(fld0078b).trim()).subtract(new BigDecimal(String.valueOf(fld0078a).trim())).toPlainString());
        fld0079b.set(new BigDecimal(String.valueOf(fld0079b).trim()).add(new BigDecimal(String.valueOf(fld0079a).trim())).toPlainString());
        fld0080b.set(new BigDecimal(String.valueOf(fld0080b).trim()).subtract(new BigDecimal(String.valueOf(fld0080a).trim())).toPlainString());
        fld0081b.set(new BigDecimal(String.valueOf(fld0081b).trim()).add(new BigDecimal(String.valueOf(fld0081a).trim())).toPlainString());
        fld0082b.set(new BigDecimal(String.valueOf(fld0082b).trim()).subtract(new BigDecimal(String.valueOf(fld0082a).trim())).toPlainString());
        fld0083b.set(new BigDecimal(String.valueOf(fld0083b).trim()).add(new BigDecimal(String.valueOf(fld0083a).trim())).toPlainString());
        fld0084b.set(new BigDecimal(String.valueOf(fld0084b).trim()).subtract(new BigDecimal(String.valueOf(fld0084a).trim())).toPlainString());
        fld0085b.set(new BigDecimal(String.valueOf(fld0085b).trim()).add(new BigDecimal(String.valueOf(fld0085a).trim())).toPlainString());
        fld0086b.set(new BigDecimal(String.valueOf(fld0086b).trim()).subtract(new BigDecimal(String.valueOf(fld0086a).trim())).toPlainString());
        fld0087b.set(new BigDecimal(String.valueOf(fld0087b).trim()).add(new BigDecimal(String.valueOf(fld0087a).trim())).toPlainString());
        fld0088b.set(new BigDecimal(String.valueOf(fld0088b).trim()).subtract(new BigDecimal(String.valueOf(fld0088a).trim())).toPlainString());
        fld0089b.set(new BigDecimal(String.valueOf(fld0089b).trim()).add(new BigDecimal(String.valueOf(fld0089a).trim())).toPlainString());
        fld0090b.set(new BigDecimal(String.valueOf(fld0090b).trim()).subtract(new BigDecimal(String.valueOf(fld0090a).trim())).toPlainString());
        fld0091b.set(new BigDecimal(String.valueOf(fld0091b).trim()).add(new BigDecimal(String.valueOf(fld0091a).trim())).toPlainString());
        fld0092b.set(new BigDecimal(String.valueOf(fld0092b).trim()).subtract(new BigDecimal(String.valueOf(fld0092a).trim())).toPlainString());
        fld0093b.set(new BigDecimal(String.valueOf(fld0093b).trim()).add(new BigDecimal(String.valueOf(fld0093a).trim())).toPlainString());
        fld0094b.set(new BigDecimal(String.valueOf(fld0094b).trim()).subtract(new BigDecimal(String.valueOf(fld0094a).trim())).toPlainString());
        fld0095b.set(new BigDecimal(String.valueOf(fld0095b).trim()).add(new BigDecimal(String.valueOf(fld0095a).trim())).toPlainString());
        fld0096b.set(new BigDecimal(String.valueOf(fld0096b).trim()).subtract(new BigDecimal(String.valueOf(fld0096a).trim())).toPlainString());
        fld0097b.set(new BigDecimal(String.valueOf(fld0097b).trim()).add(new BigDecimal(String.valueOf(fld0097a).trim())).toPlainString());
        fld0098b.set(new BigDecimal(String.valueOf(fld0098b).trim()).subtract(new BigDecimal(String.valueOf(fld0098a).trim())).toPlainString());
        fld0099b.set(new BigDecimal(String.valueOf(fld0099b).trim()).add(new BigDecimal(String.valueOf(fld0099a).trim())).toPlainString());
        fld0100b.set(new BigDecimal(String.valueOf(fld0100b).trim()).subtract(new BigDecimal(String.valueOf(fld0100a).trim())).toPlainString());
        fld0101b.set(new BigDecimal(String.valueOf(fld0101b).trim()).add(new BigDecimal(String.valueOf(fld0101a).trim())).toPlainString());
        fld0102b.set(new BigDecimal(String.valueOf(fld0102b).trim()).subtract(new BigDecimal(String.valueOf(fld0102a).trim())).toPlainString());
        fld0103b.set(new BigDecimal(String.valueOf(fld0103b).trim()).add(new BigDecimal(String.valueOf(fld0103a).trim())).toPlainString());
        fld0104b.set(new BigDecimal(String.valueOf(fld0104b).trim()).subtract(new BigDecimal(String.valueOf(fld0104a).trim())).toPlainString());
        fld0105b.set(new BigDecimal(String.valueOf(fld0105b).trim()).add(new BigDecimal(String.valueOf(fld0105a).trim())).toPlainString());
        fld0106b.set(new BigDecimal(String.valueOf(fld0106b).trim()).subtract(new BigDecimal(String.valueOf(fld0106a).trim())).toPlainString());
        fld0107b.set(new BigDecimal(String.valueOf(fld0107b).trim()).add(new BigDecimal(String.valueOf(fld0107a).trim())).toPlainString());
        fld0108b.set(new BigDecimal(String.valueOf(fld0108b).trim()).subtract(new BigDecimal(String.valueOf(fld0108a).trim())).toPlainString());
        fld0109b.set(new BigDecimal(String.valueOf(fld0109b).trim()).add(new BigDecimal(String.valueOf(fld0109a).trim())).toPlainString());
        fld0110b.set(new BigDecimal(String.valueOf(fld0110b).trim()).subtract(new BigDecimal(String.valueOf(fld0110a).trim())).toPlainString());
        fld0111b.set(new BigDecimal(String.valueOf(fld0111b).trim()).add(new BigDecimal(String.valueOf(fld0111a).trim())).toPlainString());
        fld0112b.set(new BigDecimal(String.valueOf(fld0112b).trim()).subtract(new BigDecimal(String.valueOf(fld0112a).trim())).toPlainString());
        fld0113b.set(new BigDecimal(String.valueOf(fld0113b).trim()).add(new BigDecimal(String.valueOf(fld0113a).trim())).toPlainString());
        fld0114b.set(new BigDecimal(String.valueOf(fld0114b).trim()).subtract(new BigDecimal(String.valueOf(fld0114a).trim())).toPlainString());
        fld0115b.set(new BigDecimal(String.valueOf(fld0115b).trim()).add(new BigDecimal(String.valueOf(fld0115a).trim())).toPlainString());
        fld0116b.set(new BigDecimal(String.valueOf(fld0116b).trim()).subtract(new BigDecimal(String.valueOf(fld0116a).trim())).toPlainString());
        fld0117b.set(new BigDecimal(String.valueOf(fld0117b).trim()).add(new BigDecimal(String.valueOf(fld0117a).trim())).toPlainString());
        fld0118b.set(new BigDecimal(String.valueOf(fld0118b).trim()).subtract(new BigDecimal(String.valueOf(fld0118a).trim())).toPlainString());
        fld0119b.set(new BigDecimal(String.valueOf(fld0119b).trim()).add(new BigDecimal(String.valueOf(fld0119a).trim())).toPlainString());
        fld0120b.set(new BigDecimal(String.valueOf(fld0120b).trim()).subtract(new BigDecimal(String.valueOf(fld0120a).trim())).toPlainString());
        fld0121b.set(new BigDecimal(String.valueOf(fld0121b).trim()).add(new BigDecimal(String.valueOf(fld0121a).trim())).toPlainString());
        fld0122b.set(new BigDecimal(String.valueOf(fld0122b).trim()).subtract(new BigDecimal(String.valueOf(fld0122a).trim())).toPlainString());
        fld0123b.set(new BigDecimal(String.valueOf(fld0123b).trim()).add(new BigDecimal(String.valueOf(fld0123a).trim())).toPlainString());
        fld0124b.set(new BigDecimal(String.valueOf(fld0124b).trim()).subtract(new BigDecimal(String.valueOf(fld0124a).trim())).toPlainString());
        fld0125b.set(new BigDecimal(String.valueOf(fld0125b).trim()).add(new BigDecimal(String.valueOf(fld0125a).trim())).toPlainString());
        fld0126b.set(new BigDecimal(String.valueOf(fld0126b).trim()).subtract(new BigDecimal(String.valueOf(fld0126a).trim())).toPlainString());
        fld0127b.set(new BigDecimal(String.valueOf(fld0127b).trim()).add(new BigDecimal(String.valueOf(fld0127a).trim())).toPlainString());
        fld0128b.set(new BigDecimal(String.valueOf(fld0128b).trim()).subtract(new BigDecimal(String.valueOf(fld0128a).trim())).toPlainString());
        fld0129b.set(new BigDecimal(String.valueOf(fld0129b).trim()).add(new BigDecimal(String.valueOf(fld0129a).trim())).toPlainString());
        fld0130b.set(new BigDecimal(String.valueOf(fld0130b).trim()).subtract(new BigDecimal(String.valueOf(fld0130a).trim())).toPlainString());
        fld0131b.set(new BigDecimal(String.valueOf(fld0131b).trim()).add(new BigDecimal(String.valueOf(fld0131a).trim())).toPlainString());
        fld0132b.set(new BigDecimal(String.valueOf(fld0132b).trim()).subtract(new BigDecimal(String.valueOf(fld0132a).trim())).toPlainString());
        fld0133b.set(new BigDecimal(String.valueOf(fld0133b).trim()).add(new BigDecimal(String.valueOf(fld0133a).trim())).toPlainString());
        fld0134b.set(new BigDecimal(String.valueOf(fld0134b).trim()).subtract(new BigDecimal(String.valueOf(fld0134a).trim())).toPlainString());
        fld0135b.set(new BigDecimal(String.valueOf(fld0135b).trim()).add(new BigDecimal(String.valueOf(fld0135a).trim())).toPlainString());
        fld0136b.set(new BigDecimal(String.valueOf(fld0136b).trim()).subtract(new BigDecimal(String.valueOf(fld0136a).trim())).toPlainString());
        fld0137b.set(new BigDecimal(String.valueOf(fld0137b).trim()).add(new BigDecimal(String.valueOf(fld0137a).trim())).toPlainString());
        fld0138b.set(new BigDecimal(String.valueOf(fld0138b).trim()).subtract(new BigDecimal(String.valueOf(fld0138a).trim())).toPlainString());
        fld0139b.set(new BigDecimal(String.valueOf(fld0139b).trim()).add(new BigDecimal(String.valueOf(fld0139a).trim())).toPlainString());
        fld0140b.set(new BigDecimal(String.valueOf(fld0140b).trim()).subtract(new BigDecimal(String.valueOf(fld0140a).trim())).toPlainString());
        fld0141b.set(new BigDecimal(String.valueOf(fld0141b).trim()).add(new BigDecimal(String.valueOf(fld0141a).trim())).toPlainString());
        fld0142b.set(new BigDecimal(String.valueOf(fld0142b).trim()).subtract(new BigDecimal(String.valueOf(fld0142a).trim())).toPlainString());
        fld0143b.set(new BigDecimal(String.valueOf(fld0143b).trim()).add(new BigDecimal(String.valueOf(fld0143a).trim())).toPlainString());
        fld0144b.set(new BigDecimal(String.valueOf(fld0144b).trim()).subtract(new BigDecimal(String.valueOf(fld0144a).trim())).toPlainString());
        fld0145b.set(new BigDecimal(String.valueOf(fld0145b).trim()).add(new BigDecimal(String.valueOf(fld0145a).trim())).toPlainString());
        fld0146b.set(new BigDecimal(String.valueOf(fld0146b).trim()).subtract(new BigDecimal(String.valueOf(fld0146a).trim())).toPlainString());
        fld0147b.set(new BigDecimal(String.valueOf(fld0147b).trim()).add(new BigDecimal(String.valueOf(fld0147a).trim())).toPlainString());
        fld0148b.set(new BigDecimal(String.valueOf(fld0148b).trim()).subtract(new BigDecimal(String.valueOf(fld0148a).trim())).toPlainString());
        fld0149b.set(new BigDecimal(String.valueOf(fld0149b).trim()).add(new BigDecimal(String.valueOf(fld0149a).trim())).toPlainString());
        fld0150b.set(new BigDecimal(String.valueOf(fld0150b).trim()).subtract(new BigDecimal(String.valueOf(fld0150a).trim())).toPlainString());
        fld0151b.set(new BigDecimal(String.valueOf(fld0151b).trim()).add(new BigDecimal(String.valueOf(fld0151a).trim())).toPlainString());
        fld0152b.set(new BigDecimal(String.valueOf(fld0152b).trim()).subtract(new BigDecimal(String.valueOf(fld0152a).trim())).toPlainString());
        fld0153b.set(new BigDecimal(String.valueOf(fld0153b).trim()).add(new BigDecimal(String.valueOf(fld0153a).trim())).toPlainString());
        fld0154b.set(new BigDecimal(String.valueOf(fld0154b).trim()).subtract(new BigDecimal(String.valueOf(fld0154a).trim())).toPlainString());
        fld0155b.set(new BigDecimal(String.valueOf(fld0155b).trim()).add(new BigDecimal(String.valueOf(fld0155a).trim())).toPlainString());
        fld0156b.set(new BigDecimal(String.valueOf(fld0156b).trim()).subtract(new BigDecimal(String.valueOf(fld0156a).trim())).toPlainString());
        fld0157b.set(new BigDecimal(String.valueOf(fld0157b).trim()).add(new BigDecimal(String.valueOf(fld0157a).trim())).toPlainString());
        fld0158b.set(new BigDecimal(String.valueOf(fld0158b).trim()).subtract(new BigDecimal(String.valueOf(fld0158a).trim())).toPlainString());
        fld0159b.set(new BigDecimal(String.valueOf(fld0159b).trim()).add(new BigDecimal(String.valueOf(fld0159a).trim())).toPlainString());
        fld0160b.set(new BigDecimal(String.valueOf(fld0160b).trim()).subtract(new BigDecimal(String.valueOf(fld0160a).trim())).toPlainString());
        fld0161b.set(new BigDecimal(String.valueOf(fld0161b).trim()).add(new BigDecimal(String.valueOf(fld0161a).trim())).toPlainString());
        fld0162b.set(new BigDecimal(String.valueOf(fld0162b).trim()).subtract(new BigDecimal(String.valueOf(fld0162a).trim())).toPlainString());
        fld0163b.set(new BigDecimal(String.valueOf(fld0163b).trim()).add(new BigDecimal(String.valueOf(fld0163a).trim())).toPlainString());
        fld0164b.set(new BigDecimal(String.valueOf(fld0164b).trim()).subtract(new BigDecimal(String.valueOf(fld0164a).trim())).toPlainString());
        fld0165b.set(new BigDecimal(String.valueOf(fld0165b).trim()).add(new BigDecimal(String.valueOf(fld0165a).trim())).toPlainString());
        fld0166b.set(new BigDecimal(String.valueOf(fld0166b).trim()).subtract(new BigDecimal(String.valueOf(fld0166a).trim())).toPlainString());
        fld0167b.set(new BigDecimal(String.valueOf(fld0167b).trim()).add(new BigDecimal(String.valueOf(fld0167a).trim())).toPlainString());
        fld0168b.set(new BigDecimal(String.valueOf(fld0168b).trim()).subtract(new BigDecimal(String.valueOf(fld0168a).trim())).toPlainString());
        fld0169b.set(new BigDecimal(String.valueOf(fld0169b).trim()).add(new BigDecimal(String.valueOf(fld0169a).trim())).toPlainString());
        fld0170b.set(new BigDecimal(String.valueOf(fld0170b).trim()).subtract(new BigDecimal(String.valueOf(fld0170a).trim())).toPlainString());
        fld0171b.set(new BigDecimal(String.valueOf(fld0171b).trim()).add(new BigDecimal(String.valueOf(fld0171a).trim())).toPlainString());
        fld0172b.set(new BigDecimal(String.valueOf(fld0172b).trim()).subtract(new BigDecimal(String.valueOf(fld0172a).trim())).toPlainString());
        fld0173b.set(new BigDecimal(String.valueOf(fld0173b).trim()).add(new BigDecimal(String.valueOf(fld0173a).trim())).toPlainString());
        fld0174b.set(new BigDecimal(String.valueOf(fld0174b).trim()).subtract(new BigDecimal(String.valueOf(fld0174a).trim())).toPlainString());
        fld0175b.set(new BigDecimal(String.valueOf(fld0175b).trim()).add(new BigDecimal(String.valueOf(fld0175a).trim())).toPlainString());
        fld0176b.set(new BigDecimal(String.valueOf(fld0176b).trim()).subtract(new BigDecimal(String.valueOf(fld0176a).trim())).toPlainString());
        fld0177b.set(new BigDecimal(String.valueOf(fld0177b).trim()).add(new BigDecimal(String.valueOf(fld0177a).trim())).toPlainString());
        fld0178b.set(new BigDecimal(String.valueOf(fld0178b).trim()).subtract(new BigDecimal(String.valueOf(fld0178a).trim())).toPlainString());
        fld0179b.set(new BigDecimal(String.valueOf(fld0179b).trim()).add(new BigDecimal(String.valueOf(fld0179a).trim())).toPlainString());
        fld0180b.set(new BigDecimal(String.valueOf(fld0180b).trim()).subtract(new BigDecimal(String.valueOf(fld0180a).trim())).toPlainString());
        fld0181b.set(new BigDecimal(String.valueOf(fld0181b).trim()).add(new BigDecimal(String.valueOf(fld0181a).trim())).toPlainString());
        fld0182b.set(new BigDecimal(String.valueOf(fld0182b).trim()).subtract(new BigDecimal(String.valueOf(fld0182a).trim())).toPlainString());
        fld0183b.set(new BigDecimal(String.valueOf(fld0183b).trim()).add(new BigDecimal(String.valueOf(fld0183a).trim())).toPlainString());
        fld0184b.set(new BigDecimal(String.valueOf(fld0184b).trim()).subtract(new BigDecimal(String.valueOf(fld0184a).trim())).toPlainString());
        fld0185b.set(new BigDecimal(String.valueOf(fld0185b).trim()).add(new BigDecimal(String.valueOf(fld0185a).trim())).toPlainString());
        fld0186b.set(new BigDecimal(String.valueOf(fld0186b).trim()).subtract(new BigDecimal(String.valueOf(fld0186a).trim())).toPlainString());
        fld0187b.set(new BigDecimal(String.valueOf(fld0187b).trim()).add(new BigDecimal(String.valueOf(fld0187a).trim())).toPlainString());
        fld0188b.set(new BigDecimal(String.valueOf(fld0188b).trim()).subtract(new BigDecimal(String.valueOf(fld0188a).trim())).toPlainString());
        fld0189b.set(new BigDecimal(String.valueOf(fld0189b).trim()).add(new BigDecimal(String.valueOf(fld0189a).trim())).toPlainString());
        fld0190b.set(new BigDecimal(String.valueOf(fld0190b).trim()).subtract(new BigDecimal(String.valueOf(fld0190a).trim())).toPlainString());
        fld0191b.set(new BigDecimal(String.valueOf(fld0191b).trim()).add(new BigDecimal(String.valueOf(fld0191a).trim())).toPlainString());
        fld0192b.set(new BigDecimal(String.valueOf(fld0192b).trim()).subtract(new BigDecimal(String.valueOf(fld0192a).trim())).toPlainString());
        fld0193b.set(new BigDecimal(String.valueOf(fld0193b).trim()).add(new BigDecimal(String.valueOf(fld0193a).trim())).toPlainString());
        fld0194b.set(new BigDecimal(String.valueOf(fld0194b).trim()).subtract(new BigDecimal(String.valueOf(fld0194a).trim())).toPlainString());
        fld0195b.set(new BigDecimal(String.valueOf(fld0195b).trim()).add(new BigDecimal(String.valueOf(fld0195a).trim())).toPlainString());
        fld0196b.set(new BigDecimal(String.valueOf(fld0196b).trim()).subtract(new BigDecimal(String.valueOf(fld0196a).trim())).toPlainString());
        fld0197b.set(new BigDecimal(String.valueOf(fld0197b).trim()).add(new BigDecimal(String.valueOf(fld0197a).trim())).toPlainString());
        fld0198b.set(new BigDecimal(String.valueOf(fld0198b).trim()).subtract(new BigDecimal(String.valueOf(fld0198a).trim())).toPlainString());
        fld0199b.set(new BigDecimal(String.valueOf(fld0199b).trim()).add(new BigDecimal(String.valueOf(fld0199a).trim())).toPlainString());
        fld0200b.set(new BigDecimal(String.valueOf(fld0200b).trim()).subtract(new BigDecimal(String.valueOf(fld0200a).trim())).toPlainString());
        fld0201b.set(new BigDecimal(String.valueOf(fld0201b).trim()).add(new BigDecimal(String.valueOf(fld0201a).trim())).toPlainString());
        fld0202b.set(new BigDecimal(String.valueOf(fld0202b).trim()).subtract(new BigDecimal(String.valueOf(fld0202a).trim())).toPlainString());
        fld0203b.set(new BigDecimal(String.valueOf(fld0203b).trim()).add(new BigDecimal(String.valueOf(fld0203a).trim())).toPlainString());
        fld0204b.set(new BigDecimal(String.valueOf(fld0204b).trim()).subtract(new BigDecimal(String.valueOf(fld0204a).trim())).toPlainString());
        fld0205b.set(new BigDecimal(String.valueOf(fld0205b).trim()).add(new BigDecimal(String.valueOf(fld0205a).trim())).toPlainString());
        fld0206b.set(new BigDecimal(String.valueOf(fld0206b).trim()).subtract(new BigDecimal(String.valueOf(fld0206a).trim())).toPlainString());
        fld0207b.set(new BigDecimal(String.valueOf(fld0207b).trim()).add(new BigDecimal(String.valueOf(fld0207a).trim())).toPlainString());
        fld0208b.set(new BigDecimal(String.valueOf(fld0208b).trim()).subtract(new BigDecimal(String.valueOf(fld0208a).trim())).toPlainString());
        fld0209b.set(new BigDecimal(String.valueOf(fld0209b).trim()).add(new BigDecimal(String.valueOf(fld0209a).trim())).toPlainString());
        fld0210b.set(new BigDecimal(String.valueOf(fld0210b).trim()).subtract(new BigDecimal(String.valueOf(fld0210a).trim())).toPlainString());
        fld0211b.set(new BigDecimal(String.valueOf(fld0211b).trim()).add(new BigDecimal(String.valueOf(fld0211a).trim())).toPlainString());
        fld0212b.set(new BigDecimal(String.valueOf(fld0212b).trim()).subtract(new BigDecimal(String.valueOf(fld0212a).trim())).toPlainString());
        fld0213b.set(new BigDecimal(String.valueOf(fld0213b).trim()).add(new BigDecimal(String.valueOf(fld0213a).trim())).toPlainString());
        fld0214b.set(new BigDecimal(String.valueOf(fld0214b).trim()).subtract(new BigDecimal(String.valueOf(fld0214a).trim())).toPlainString());
        fld0215b.set(new BigDecimal(String.valueOf(fld0215b).trim()).add(new BigDecimal(String.valueOf(fld0215a).trim())).toPlainString());
        fld0216b.set(new BigDecimal(String.valueOf(fld0216b).trim()).subtract(new BigDecimal(String.valueOf(fld0216a).trim())).toPlainString());
        fld0217b.set(new BigDecimal(String.valueOf(fld0217b).trim()).add(new BigDecimal(String.valueOf(fld0217a).trim())).toPlainString());
        fld0218b.set(new BigDecimal(String.valueOf(fld0218b).trim()).subtract(new BigDecimal(String.valueOf(fld0218a).trim())).toPlainString());
        fld0219b.set(new BigDecimal(String.valueOf(fld0219b).trim()).add(new BigDecimal(String.valueOf(fld0219a).trim())).toPlainString());
        fld0220b.set(new BigDecimal(String.valueOf(fld0220b).trim()).subtract(new BigDecimal(String.valueOf(fld0220a).trim())).toPlainString());
        fld0221b.set(new BigDecimal(String.valueOf(fld0221b).trim()).add(new BigDecimal(String.valueOf(fld0221a).trim())).toPlainString());
        fld0222b.set(new BigDecimal(String.valueOf(fld0222b).trim()).subtract(new BigDecimal(String.valueOf(fld0222a).trim())).toPlainString());
        fld0223b.set(new BigDecimal(String.valueOf(fld0223b).trim()).add(new BigDecimal(String.valueOf(fld0223a).trim())).toPlainString());
        fld0224b.set(new BigDecimal(String.valueOf(fld0224b).trim()).subtract(new BigDecimal(String.valueOf(fld0224a).trim())).toPlainString());
        fld0225b.set(new BigDecimal(String.valueOf(fld0225b).trim()).add(new BigDecimal(String.valueOf(fld0225a).trim())).toPlainString());
        fld0226b.set(new BigDecimal(String.valueOf(fld0226b).trim()).subtract(new BigDecimal(String.valueOf(fld0226a).trim())).toPlainString());
        fld0227b.set(new BigDecimal(String.valueOf(fld0227b).trim()).add(new BigDecimal(String.valueOf(fld0227a).trim())).toPlainString());
        fld0228b.set(new BigDecimal(String.valueOf(fld0228b).trim()).subtract(new BigDecimal(String.valueOf(fld0228a).trim())).toPlainString());
        fld0229b.set(new BigDecimal(String.valueOf(fld0229b).trim()).add(new BigDecimal(String.valueOf(fld0229a).trim())).toPlainString());
        fld0230b.set(new BigDecimal(String.valueOf(fld0230b).trim()).subtract(new BigDecimal(String.valueOf(fld0230a).trim())).toPlainString());
        fld0231b.set(new BigDecimal(String.valueOf(fld0231b).trim()).add(new BigDecimal(String.valueOf(fld0231a).trim())).toPlainString());
        fld0232b.set(new BigDecimal(String.valueOf(fld0232b).trim()).subtract(new BigDecimal(String.valueOf(fld0232a).trim())).toPlainString());
        fld0233b.set(new BigDecimal(String.valueOf(fld0233b).trim()).add(new BigDecimal(String.valueOf(fld0233a).trim())).toPlainString());
        fld0234b.set(new BigDecimal(String.valueOf(fld0234b).trim()).subtract(new BigDecimal(String.valueOf(fld0234a).trim())).toPlainString());
        fld0235b.set(new BigDecimal(String.valueOf(fld0235b).trim()).add(new BigDecimal(String.valueOf(fld0235a).trim())).toPlainString());
        fld0236b.set(new BigDecimal(String.valueOf(fld0236b).trim()).subtract(new BigDecimal(String.valueOf(fld0236a).trim())).toPlainString());
        fld0237b.set(new BigDecimal(String.valueOf(fld0237b).trim()).add(new BigDecimal(String.valueOf(fld0237a).trim())).toPlainString());
        fld0238b.set(new BigDecimal(String.valueOf(fld0238b).trim()).subtract(new BigDecimal(String.valueOf(fld0238a).trim())).toPlainString());
        fld0239b.set(new BigDecimal(String.valueOf(fld0239b).trim()).add(new BigDecimal(String.valueOf(fld0239a).trim())).toPlainString());
        fld0240b.set(new BigDecimal(String.valueOf(fld0240b).trim()).subtract(new BigDecimal(String.valueOf(fld0240a).trim())).toPlainString());
        fld0241b.set(new BigDecimal(String.valueOf(fld0241b).trim()).add(new BigDecimal(String.valueOf(fld0241a).trim())).toPlainString());
        fld0242b.set(new BigDecimal(String.valueOf(fld0242b).trim()).subtract(new BigDecimal(String.valueOf(fld0242a).trim())).toPlainString());
        fld0243b.set(new BigDecimal(String.valueOf(fld0243b).trim()).add(new BigDecimal(String.valueOf(fld0243a).trim())).toPlainString());
        fld0244b.set(new BigDecimal(String.valueOf(fld0244b).trim()).subtract(new BigDecimal(String.valueOf(fld0244a).trim())).toPlainString());
        fld0245b.set(new BigDecimal(String.valueOf(fld0245b).trim()).add(new BigDecimal(String.valueOf(fld0245a).trim())).toPlainString());
        fld0246b.set(new BigDecimal(String.valueOf(fld0246b).trim()).subtract(new BigDecimal(String.valueOf(fld0246a).trim())).toPlainString());
        fld0247b.set(new BigDecimal(String.valueOf(fld0247b).trim()).add(new BigDecimal(String.valueOf(fld0247a).trim())).toPlainString());
        fld0248b.set(new BigDecimal(String.valueOf(fld0248b).trim()).subtract(new BigDecimal(String.valueOf(fld0248a).trim())).toPlainString());
        fld0249b.set(new BigDecimal(String.valueOf(fld0249b).trim()).add(new BigDecimal(String.valueOf(fld0249a).trim())).toPlainString());
        fld0250b.set(new BigDecimal(String.valueOf(fld0250b).trim()).subtract(new BigDecimal(String.valueOf(fld0250a).trim())).toPlainString());
        fld0251b.set(new BigDecimal(String.valueOf(fld0251b).trim()).add(new BigDecimal(String.valueOf(fld0251a).trim())).toPlainString());
        fld0252b.set(new BigDecimal(String.valueOf(fld0252b).trim()).subtract(new BigDecimal(String.valueOf(fld0252a).trim())).toPlainString());
        fld0253b.set(new BigDecimal(String.valueOf(fld0253b).trim()).add(new BigDecimal(String.valueOf(fld0253a).trim())).toPlainString());
        fld0254b.set(new BigDecimal(String.valueOf(fld0254b).trim()).subtract(new BigDecimal(String.valueOf(fld0254a).trim())).toPlainString());
        fld0255b.set(new BigDecimal(String.valueOf(fld0255b).trim()).add(new BigDecimal(String.valueOf(fld0255a).trim())).toPlainString());
        fld0256b.set(new BigDecimal(String.valueOf(fld0256b).trim()).subtract(new BigDecimal(String.valueOf(fld0256a).trim())).toPlainString());
        fld0257b.set(new BigDecimal(String.valueOf(fld0257b).trim()).add(new BigDecimal(String.valueOf(fld0257a).trim())).toPlainString());
        fld0258b.set(new BigDecimal(String.valueOf(fld0258b).trim()).subtract(new BigDecimal(String.valueOf(fld0258a).trim())).toPlainString());
        fld0259b.set(new BigDecimal(String.valueOf(fld0259b).trim()).add(new BigDecimal(String.valueOf(fld0259a).trim())).toPlainString());
        fld0260b.set(new BigDecimal(String.valueOf(fld0260b).trim()).subtract(new BigDecimal(String.valueOf(fld0260a).trim())).toPlainString());
        fld0261b.set(new BigDecimal(String.valueOf(fld0261b).trim()).add(new BigDecimal(String.valueOf(fld0261a).trim())).toPlainString());
        fld0262b.set(new BigDecimal(String.valueOf(fld0262b).trim()).subtract(new BigDecimal(String.valueOf(fld0262a).trim())).toPlainString());
        fld0263b.set(new BigDecimal(String.valueOf(fld0263b).trim()).add(new BigDecimal(String.valueOf(fld0263a).trim())).toPlainString());
        fld0264b.set(new BigDecimal(String.valueOf(fld0264b).trim()).subtract(new BigDecimal(String.valueOf(fld0264a).trim())).toPlainString());
        fld0265b.set(new BigDecimal(String.valueOf(fld0265b).trim()).add(new BigDecimal(String.valueOf(fld0265a).trim())).toPlainString());
        fld0266b.set(new BigDecimal(String.valueOf(fld0266b).trim()).subtract(new BigDecimal(String.valueOf(fld0266a).trim())).toPlainString());
        fld0267b.set(new BigDecimal(String.valueOf(fld0267b).trim()).add(new BigDecimal(String.valueOf(fld0267a).trim())).toPlainString());
        fld0268b.set(new BigDecimal(String.valueOf(fld0268b).trim()).subtract(new BigDecimal(String.valueOf(fld0268a).trim())).toPlainString());
        fld0269b.set(new BigDecimal(String.valueOf(fld0269b).trim()).add(new BigDecimal(String.valueOf(fld0269a).trim())).toPlainString());
        fld0270b.set(new BigDecimal(String.valueOf(fld0270b).trim()).subtract(new BigDecimal(String.valueOf(fld0270a).trim())).toPlainString());
        fld0271b.set(new BigDecimal(String.valueOf(fld0271b).trim()).add(new BigDecimal(String.valueOf(fld0271a).trim())).toPlainString());
        fld0272b.set(new BigDecimal(String.valueOf(fld0272b).trim()).subtract(new BigDecimal(String.valueOf(fld0272a).trim())).toPlainString());
        fld0273b.set(new BigDecimal(String.valueOf(fld0273b).trim()).add(new BigDecimal(String.valueOf(fld0273a).trim())).toPlainString());
        fld0274b.set(new BigDecimal(String.valueOf(fld0274b).trim()).subtract(new BigDecimal(String.valueOf(fld0274a).trim())).toPlainString());
        fld0275b.set(new BigDecimal(String.valueOf(fld0275b).trim()).add(new BigDecimal(String.valueOf(fld0275a).trim())).toPlainString());
        fld0276b.set(new BigDecimal(String.valueOf(fld0276b).trim()).subtract(new BigDecimal(String.valueOf(fld0276a).trim())).toPlainString());
        fld0277b.set(new BigDecimal(String.valueOf(fld0277b).trim()).add(new BigDecimal(String.valueOf(fld0277a).trim())).toPlainString());
        fld0278b.set(new BigDecimal(String.valueOf(fld0278b).trim()).subtract(new BigDecimal(String.valueOf(fld0278a).trim())).toPlainString());
        fld0279b.set(new BigDecimal(String.valueOf(fld0279b).trim()).add(new BigDecimal(String.valueOf(fld0279a).trim())).toPlainString());
        fld0280b.set(new BigDecimal(String.valueOf(fld0280b).trim()).subtract(new BigDecimal(String.valueOf(fld0280a).trim())).toPlainString());
        fld0281b.set(new BigDecimal(String.valueOf(fld0281b).trim()).add(new BigDecimal(String.valueOf(fld0281a).trim())).toPlainString());
        fld0282b.set(new BigDecimal(String.valueOf(fld0282b).trim()).subtract(new BigDecimal(String.valueOf(fld0282a).trim())).toPlainString());
        fld0283b.set(new BigDecimal(String.valueOf(fld0283b).trim()).add(new BigDecimal(String.valueOf(fld0283a).trim())).toPlainString());
        fld0284b.set(new BigDecimal(String.valueOf(fld0284b).trim()).subtract(new BigDecimal(String.valueOf(fld0284a).trim())).toPlainString());
        fld0285b.set(new BigDecimal(String.valueOf(fld0285b).trim()).add(new BigDecimal(String.valueOf(fld0285a).trim())).toPlainString());
        fld0286b.set(new BigDecimal(String.valueOf(fld0286b).trim()).subtract(new BigDecimal(String.valueOf(fld0286a).trim())).toPlainString());
        fld0287b.set(new BigDecimal(String.valueOf(fld0287b).trim()).add(new BigDecimal(String.valueOf(fld0287a).trim())).toPlainString());
        fld0288b.set(new BigDecimal(String.valueOf(fld0288b).trim()).subtract(new BigDecimal(String.valueOf(fld0288a).trim())).toPlainString());
        fld0289b.set(new BigDecimal(String.valueOf(fld0289b).trim()).add(new BigDecimal(String.valueOf(fld0289a).trim())).toPlainString());
        fld0290b.set(new BigDecimal(String.valueOf(fld0290b).trim()).subtract(new BigDecimal(String.valueOf(fld0290a).trim())).toPlainString());
        fld0291b.set(new BigDecimal(String.valueOf(fld0291b).trim()).add(new BigDecimal(String.valueOf(fld0291a).trim())).toPlainString());
        fld0292b.set(new BigDecimal(String.valueOf(fld0292b).trim()).subtract(new BigDecimal(String.valueOf(fld0292a).trim())).toPlainString());
        fld0293b.set(new BigDecimal(String.valueOf(fld0293b).trim()).add(new BigDecimal(String.valueOf(fld0293a).trim())).toPlainString());
        fld0294b.set(new BigDecimal(String.valueOf(fld0294b).trim()).subtract(new BigDecimal(String.valueOf(fld0294a).trim())).toPlainString());
        fld0295b.set(new BigDecimal(String.valueOf(fld0295b).trim()).add(new BigDecimal(String.valueOf(fld0295a).trim())).toPlainString());
        fld0296b.set(new BigDecimal(String.valueOf(fld0296b).trim()).subtract(new BigDecimal(String.valueOf(fld0296a).trim())).toPlainString());
        fld0297b.set(new BigDecimal(String.valueOf(fld0297b).trim()).add(new BigDecimal(String.valueOf(fld0297a).trim())).toPlainString());
        fld0298b.set(new BigDecimal(String.valueOf(fld0298b).trim()).subtract(new BigDecimal(String.valueOf(fld0298a).trim())).toPlainString());
        fld0299b.set(new BigDecimal(String.valueOf(fld0299b).trim()).add(new BigDecimal(String.valueOf(fld0299a).trim())).toPlainString());
        fld0300b.set(new BigDecimal(String.valueOf(fld0300b).trim()).subtract(new BigDecimal(String.valueOf(fld0300a).trim())).toPlainString());
        fld0301b.set(new BigDecimal(String.valueOf(fld0301b).trim()).add(new BigDecimal(String.valueOf(fld0301a).trim())).toPlainString());
        fld0302b.set(new BigDecimal(String.valueOf(fld0302b).trim()).subtract(new BigDecimal(String.valueOf(fld0302a).trim())).toPlainString());
        fld0303b.set(new BigDecimal(String.valueOf(fld0303b).trim()).add(new BigDecimal(String.valueOf(fld0303a).trim())).toPlainString());
        fld0304b.set(new BigDecimal(String.valueOf(fld0304b).trim()).subtract(new BigDecimal(String.valueOf(fld0304a).trim())).toPlainString());
        fld0305b.set(new BigDecimal(String.valueOf(fld0305b).trim()).add(new BigDecimal(String.valueOf(fld0305a).trim())).toPlainString());
        fld0306b.set(new BigDecimal(String.valueOf(fld0306b).trim()).subtract(new BigDecimal(String.valueOf(fld0306a).trim())).toPlainString());
        fld0307b.set(new BigDecimal(String.valueOf(fld0307b).trim()).add(new BigDecimal(String.valueOf(fld0307a).trim())).toPlainString());
        fld0308b.set(new BigDecimal(String.valueOf(fld0308b).trim()).subtract(new BigDecimal(String.valueOf(fld0308a).trim())).toPlainString());
        fld0309b.set(new BigDecimal(String.valueOf(fld0309b).trim()).add(new BigDecimal(String.valueOf(fld0309a).trim())).toPlainString());
        fld0310b.set(new BigDecimal(String.valueOf(fld0310b).trim()).subtract(new BigDecimal(String.valueOf(fld0310a).trim())).toPlainString());
        fld0311b.set(new BigDecimal(String.valueOf(fld0311b).trim()).add(new BigDecimal(String.valueOf(fld0311a).trim())).toPlainString());
        fld0312b.set(new BigDecimal(String.valueOf(fld0312b).trim()).subtract(new BigDecimal(String.valueOf(fld0312a).trim())).toPlainString());
        fld0313b.set(new BigDecimal(String.valueOf(fld0313b).trim()).add(new BigDecimal(String.valueOf(fld0313a).trim())).toPlainString());
        fld0314b.set(new BigDecimal(String.valueOf(fld0314b).trim()).subtract(new BigDecimal(String.valueOf(fld0314a).trim())).toPlainString());
        fld0315b.set(new BigDecimal(String.valueOf(fld0315b).trim()).add(new BigDecimal(String.valueOf(fld0315a).trim())).toPlainString());
        fld0316b.set(new BigDecimal(String.valueOf(fld0316b).trim()).subtract(new BigDecimal(String.valueOf(fld0316a).trim())).toPlainString());
        fld0317b.set(new BigDecimal(String.valueOf(fld0317b).trim()).add(new BigDecimal(String.valueOf(fld0317a).trim())).toPlainString());
        fld0318b.set(new BigDecimal(String.valueOf(fld0318b).trim()).subtract(new BigDecimal(String.valueOf(fld0318a).trim())).toPlainString());
        fld0319b.set(new BigDecimal(String.valueOf(fld0319b).trim()).add(new BigDecimal(String.valueOf(fld0319a).trim())).toPlainString());
        fld0320b.set(new BigDecimal(String.valueOf(fld0320b).trim()).subtract(new BigDecimal(String.valueOf(fld0320a).trim())).toPlainString());
        fld0321b.set(new BigDecimal(String.valueOf(fld0321b).trim()).add(new BigDecimal(String.valueOf(fld0321a).trim())).toPlainString());
        fld0322b.set(new BigDecimal(String.valueOf(fld0322b).trim()).subtract(new BigDecimal(String.valueOf(fld0322a).trim())).toPlainString());
        fld0323b.set(new BigDecimal(String.valueOf(fld0323b).trim()).add(new BigDecimal(String.valueOf(fld0323a).trim())).toPlainString());
        fld0324b.set(new BigDecimal(String.valueOf(fld0324b).trim()).subtract(new BigDecimal(String.valueOf(fld0324a).trim())).toPlainString());
        fld0325b.set(new BigDecimal(String.valueOf(fld0325b).trim()).add(new BigDecimal(String.valueOf(fld0325a).trim())).toPlainString());
        fld0326b.set(new BigDecimal(String.valueOf(fld0326b).trim()).subtract(new BigDecimal(String.valueOf(fld0326a).trim())).toPlainString());
        fld0327b.set(new BigDecimal(String.valueOf(fld0327b).trim()).add(new BigDecimal(String.valueOf(fld0327a).trim())).toPlainString());
        fld0328b.set(new BigDecimal(String.valueOf(fld0328b).trim()).subtract(new BigDecimal(String.valueOf(fld0328a).trim())).toPlainString());
        fld0329b.set(new BigDecimal(String.valueOf(fld0329b).trim()).add(new BigDecimal(String.valueOf(fld0329a).trim())).toPlainString());
        fld0330b.set(new BigDecimal(String.valueOf(fld0330b).trim()).subtract(new BigDecimal(String.valueOf(fld0330a).trim())).toPlainString());
        fld0331b.set(new BigDecimal(String.valueOf(fld0331b).trim()).add(new BigDecimal(String.valueOf(fld0331a).trim())).toPlainString());
        fld0332b.set(new BigDecimal(String.valueOf(fld0332b).trim()).subtract(new BigDecimal(String.valueOf(fld0332a).trim())).toPlainString());
        fld0333b.set(new BigDecimal(String.valueOf(fld0333b).trim()).add(new BigDecimal(String.valueOf(fld0333a).trim())).toPlainString());
        fld0334b.set(new BigDecimal(String.valueOf(fld0334b).trim()).subtract(new BigDecimal(String.valueOf(fld0334a).trim())).toPlainString());
        fld0335b.set(new BigDecimal(String.valueOf(fld0335b).trim()).add(new BigDecimal(String.valueOf(fld0335a).trim())).toPlainString());
        fld0336b.set(new BigDecimal(String.valueOf(fld0336b).trim()).subtract(new BigDecimal(String.valueOf(fld0336a).trim())).toPlainString());
        fld0337b.set(new BigDecimal(String.valueOf(fld0337b).trim()).add(new BigDecimal(String.valueOf(fld0337a).trim())).toPlainString());
        fld0338b.set(new BigDecimal(String.valueOf(fld0338b).trim()).subtract(new BigDecimal(String.valueOf(fld0338a).trim())).toPlainString());
        fld0339b.set(new BigDecimal(String.valueOf(fld0339b).trim()).add(new BigDecimal(String.valueOf(fld0339a).trim())).toPlainString());
        fld0340b.set(new BigDecimal(String.valueOf(fld0340b).trim()).subtract(new BigDecimal(String.valueOf(fld0340a).trim())).toPlainString());
        fld0341b.set(new BigDecimal(String.valueOf(fld0341b).trim()).add(new BigDecimal(String.valueOf(fld0341a).trim())).toPlainString());
        fld0342b.set(new BigDecimal(String.valueOf(fld0342b).trim()).subtract(new BigDecimal(String.valueOf(fld0342a).trim())).toPlainString());
        fld0343b.set(new BigDecimal(String.valueOf(fld0343b).trim()).add(new BigDecimal(String.valueOf(fld0343a).trim())).toPlainString());
        fld0344b.set(new BigDecimal(String.valueOf(fld0344b).trim()).subtract(new BigDecimal(String.valueOf(fld0344a).trim())).toPlainString());
        fld0345b.set(new BigDecimal(String.valueOf(fld0345b).trim()).add(new BigDecimal(String.valueOf(fld0345a).trim())).toPlainString());
        fld0346b.set(new BigDecimal(String.valueOf(fld0346b).trim()).subtract(new BigDecimal(String.valueOf(fld0346a).trim())).toPlainString());
        fld0347b.set(new BigDecimal(String.valueOf(fld0347b).trim()).add(new BigDecimal(String.valueOf(fld0347a).trim())).toPlainString());
        fld0348b.set(new BigDecimal(String.valueOf(fld0348b).trim()).subtract(new BigDecimal(String.valueOf(fld0348a).trim())).toPlainString());
        fld0349b.set(new BigDecimal(String.valueOf(fld0349b).trim()).add(new BigDecimal(String.valueOf(fld0349a).trim())).toPlainString());
        fld0350b.set(new BigDecimal(String.valueOf(fld0350b).trim()).subtract(new BigDecimal(String.valueOf(fld0350a).trim())).toPlainString());
        fld0351b.set(new BigDecimal(String.valueOf(fld0351b).trim()).add(new BigDecimal(String.valueOf(fld0351a).trim())).toPlainString());
        fld0352b.set(new BigDecimal(String.valueOf(fld0352b).trim()).subtract(new BigDecimal(String.valueOf(fld0352a).trim())).toPlainString());
        fld0353b.set(new BigDecimal(String.valueOf(fld0353b).trim()).add(new BigDecimal(String.valueOf(fld0353a).trim())).toPlainString());
        fld0354b.set(new BigDecimal(String.valueOf(fld0354b).trim()).subtract(new BigDecimal(String.valueOf(fld0354a).trim())).toPlainString());
        fld0355b.set(new BigDecimal(String.valueOf(fld0355b).trim()).add(new BigDecimal(String.valueOf(fld0355a).trim())).toPlainString());
        fld0356b.set(new BigDecimal(String.valueOf(fld0356b).trim()).subtract(new BigDecimal(String.valueOf(fld0356a).trim())).toPlainString());
        fld0357b.set(new BigDecimal(String.valueOf(fld0357b).trim()).add(new BigDecimal(String.valueOf(fld0357a).trim())).toPlainString());
        fld0358b.set(new BigDecimal(String.valueOf(fld0358b).trim()).subtract(new BigDecimal(String.valueOf(fld0358a).trim())).toPlainString());
        fld0359b.set(new BigDecimal(String.valueOf(fld0359b).trim()).add(new BigDecimal(String.valueOf(fld0359a).trim())).toPlainString());
        fld0360b.set(new BigDecimal(String.valueOf(fld0360b).trim()).subtract(new BigDecimal(String.valueOf(fld0360a).trim())).toPlainString());
        fld0361b.set(new BigDecimal(String.valueOf(fld0361b).trim()).add(new BigDecimal(String.valueOf(fld0361a).trim())).toPlainString());
        fld0362b.set(new BigDecimal(String.valueOf(fld0362b).trim()).subtract(new BigDecimal(String.valueOf(fld0362a).trim())).toPlainString());
        fld0363b.set(new BigDecimal(String.valueOf(fld0363b).trim()).add(new BigDecimal(String.valueOf(fld0363a).trim())).toPlainString());
        fld0364b.set(new BigDecimal(String.valueOf(fld0364b).trim()).subtract(new BigDecimal(String.valueOf(fld0364a).trim())).toPlainString());
        fld0365b.set(new BigDecimal(String.valueOf(fld0365b).trim()).add(new BigDecimal(String.valueOf(fld0365a).trim())).toPlainString());
        fld0366b.set(new BigDecimal(String.valueOf(fld0366b).trim()).subtract(new BigDecimal(String.valueOf(fld0366a).trim())).toPlainString());
        fld0367b.set(new BigDecimal(String.valueOf(fld0367b).trim()).add(new BigDecimal(String.valueOf(fld0367a).trim())).toPlainString());
        fld0368b.set(new BigDecimal(String.valueOf(fld0368b).trim()).subtract(new BigDecimal(String.valueOf(fld0368a).trim())).toPlainString());
        fld0369b.set(new BigDecimal(String.valueOf(fld0369b).trim()).add(new BigDecimal(String.valueOf(fld0369a).trim())).toPlainString());
        fld0370b.set(new BigDecimal(String.valueOf(fld0370b).trim()).subtract(new BigDecimal(String.valueOf(fld0370a).trim())).toPlainString());
        fld0371b.set(new BigDecimal(String.valueOf(fld0371b).trim()).add(new BigDecimal(String.valueOf(fld0371a).trim())).toPlainString());
        fld0372b.set(new BigDecimal(String.valueOf(fld0372b).trim()).subtract(new BigDecimal(String.valueOf(fld0372a).trim())).toPlainString());
        fld0373b.set(new BigDecimal(String.valueOf(fld0373b).trim()).add(new BigDecimal(String.valueOf(fld0373a).trim())).toPlainString());
        fld0374b.set(new BigDecimal(String.valueOf(fld0374b).trim()).subtract(new BigDecimal(String.valueOf(fld0374a).trim())).toPlainString());
        fld0375b.set(new BigDecimal(String.valueOf(fld0375b).trim()).add(new BigDecimal(String.valueOf(fld0375a).trim())).toPlainString());
        fld0376b.set(new BigDecimal(String.valueOf(fld0376b).trim()).subtract(new BigDecimal(String.valueOf(fld0376a).trim())).toPlainString());
        fld0377b.set(new BigDecimal(String.valueOf(fld0377b).trim()).add(new BigDecimal(String.valueOf(fld0377a).trim())).toPlainString());
        fld0378b.set(new BigDecimal(String.valueOf(fld0378b).trim()).subtract(new BigDecimal(String.valueOf(fld0378a).trim())).toPlainString());
        fld0379b.set(new BigDecimal(String.valueOf(fld0379b).trim()).add(new BigDecimal(String.valueOf(fld0379a).trim())).toPlainString());
        fld0380b.set(new BigDecimal(String.valueOf(fld0380b).trim()).subtract(new BigDecimal(String.valueOf(fld0380a).trim())).toPlainString());
        fld0381b.set(new BigDecimal(String.valueOf(fld0381b).trim()).add(new BigDecimal(String.valueOf(fld0381a).trim())).toPlainString());
        fld0382b.set(new BigDecimal(String.valueOf(fld0382b).trim()).subtract(new BigDecimal(String.valueOf(fld0382a).trim())).toPlainString());
        fld0383b.set(new BigDecimal(String.valueOf(fld0383b).trim()).add(new BigDecimal(String.valueOf(fld0383a).trim())).toPlainString());
        fld0384b.set(new BigDecimal(String.valueOf(fld0384b).trim()).subtract(new BigDecimal(String.valueOf(fld0384a).trim())).toPlainString());
        fld0385b.set(new BigDecimal(String.valueOf(fld0385b).trim()).add(new BigDecimal(String.valueOf(fld0385a).trim())).toPlainString());
        fld0386b.set(new BigDecimal(String.valueOf(fld0386b).trim()).subtract(new BigDecimal(String.valueOf(fld0386a).trim())).toPlainString());
        fld0387b.set(new BigDecimal(String.valueOf(fld0387b).trim()).add(new BigDecimal(String.valueOf(fld0387a).trim())).toPlainString());
        fld0388b.set(new BigDecimal(String.valueOf(fld0388b).trim()).subtract(new BigDecimal(String.valueOf(fld0388a).trim())).toPlainString());
        fld0389b.set(new BigDecimal(String.valueOf(fld0389b).trim()).add(new BigDecimal(String.valueOf(fld0389a).trim())).toPlainString());
        fld0390b.set(new BigDecimal(String.valueOf(fld0390b).trim()).subtract(new BigDecimal(String.valueOf(fld0390a).trim())).toPlainString());
        fld0391b.set(new BigDecimal(String.valueOf(fld0391b).trim()).add(new BigDecimal(String.valueOf(fld0391a).trim())).toPlainString());
        fld0392b.set(new BigDecimal(String.valueOf(fld0392b).trim()).subtract(new BigDecimal(String.valueOf(fld0392a).trim())).toPlainString());
        fld0393b.set(new BigDecimal(String.valueOf(fld0393b).trim()).add(new BigDecimal(String.valueOf(fld0393a).trim())).toPlainString());
        fld0394b.set(new BigDecimal(String.valueOf(fld0394b).trim()).subtract(new BigDecimal(String.valueOf(fld0394a).trim())).toPlainString());
        fld0395b.set(new BigDecimal(String.valueOf(fld0395b).trim()).add(new BigDecimal(String.valueOf(fld0395a).trim())).toPlainString());
        fld0396b.set(new BigDecimal(String.valueOf(fld0396b).trim()).subtract(new BigDecimal(String.valueOf(fld0396a).trim())).toPlainString());
        fld0397b.set(new BigDecimal(String.valueOf(fld0397b).trim()).add(new BigDecimal(String.valueOf(fld0397a).trim())).toPlainString());
        fld0398b.set(new BigDecimal(String.valueOf(fld0398b).trim()).subtract(new BigDecimal(String.valueOf(fld0398a).trim())).toPlainString());
        fld0399b.set(new BigDecimal(String.valueOf(fld0399b).trim()).add(new BigDecimal(String.valueOf(fld0399a).trim())).toPlainString());
        fld0400b.set(new BigDecimal(String.valueOf(fld0400b).trim()).subtract(new BigDecimal(String.valueOf(fld0400a).trim())).toPlainString());
    }
    private void test_part1() {
        fld0401b.set(new BigDecimal(String.valueOf(fld0401b).trim()).add(new BigDecimal(String.valueOf(fld0401a).trim())).toPlainString());
        fld0402b.set(new BigDecimal(String.valueOf(fld0402b).trim()).subtract(new BigDecimal(String.valueOf(fld0402a).trim())).toPlainString());
        fld0403b.set(new BigDecimal(String.valueOf(fld0403b).trim()).add(new BigDecimal(String.valueOf(fld0403a).trim())).toPlainString());
        fld0404b.set(new BigDecimal(String.valueOf(fld0404b).trim()).subtract(new BigDecimal(String.valueOf(fld0404a).trim())).toPlainString());
        fld0405b.set(new BigDecimal(String.valueOf(fld0405b).trim()).add(new BigDecimal(String.valueOf(fld0405a).trim())).toPlainString());
        fld0406b.set(new BigDecimal(String.valueOf(fld0406b).trim()).subtract(new BigDecimal(String.valueOf(fld0406a).trim())).toPlainString());
        fld0407b.set(new BigDecimal(String.valueOf(fld0407b).trim()).add(new BigDecimal(String.valueOf(fld0407a).trim())).toPlainString());
        fld0408b.set(new BigDecimal(String.valueOf(fld0408b).trim()).subtract(new BigDecimal(String.valueOf(fld0408a).trim())).toPlainString());
        fld0409b.set(new BigDecimal(String.valueOf(fld0409b).trim()).add(new BigDecimal(String.valueOf(fld0409a).trim())).toPlainString());
        fld0410b.set(new BigDecimal(String.valueOf(fld0410b).trim()).subtract(new BigDecimal(String.valueOf(fld0410a).trim())).toPlainString());
        fld0411b.set(new BigDecimal(String.valueOf(fld0411b).trim()).add(new BigDecimal(String.valueOf(fld0411a).trim())).toPlainString());
        fld0412b.set(new BigDecimal(String.valueOf(fld0412b).trim()).subtract(new BigDecimal(String.valueOf(fld0412a).trim())).toPlainString());
        fld0413b.set(new BigDecimal(String.valueOf(fld0413b).trim()).add(new BigDecimal(String.valueOf(fld0413a).trim())).toPlainString());
        fld0414b.set(new BigDecimal(String.valueOf(fld0414b).trim()).subtract(new BigDecimal(String.valueOf(fld0414a).trim())).toPlainString());
        fld0415b.set(new BigDecimal(String.valueOf(fld0415b).trim()).add(new BigDecimal(String.valueOf(fld0415a).trim())).toPlainString());
        fld0416b.set(new BigDecimal(String.valueOf(fld0416b).trim()).subtract(new BigDecimal(String.valueOf(fld0416a).trim())).toPlainString());
        fld0417b.set(new BigDecimal(String.valueOf(fld0417b).trim()).add(new BigDecimal(String.valueOf(fld0417a).trim())).toPlainString());
        fld0418b.set(new BigDecimal(String.valueOf(fld0418b).trim()).subtract(new BigDecimal(String.valueOf(fld0418a).trim())).toPlainString());
        fld0419b.set(new BigDecimal(String.valueOf(fld0419b).trim()).add(new BigDecimal(String.valueOf(fld0419a).trim())).toPlainString());
        fld0420b.set(new BigDecimal(String.valueOf(fld0420b).trim()).subtract(new BigDecimal(String.valueOf(fld0420a).trim())).toPlainString());
        fld0421b.set(new BigDecimal(String.valueOf(fld0421b).trim()).add(new BigDecimal(String.valueOf(fld0421a).trim())).toPlainString());
        fld0422b.set(new BigDecimal(String.valueOf(fld0422b).trim()).subtract(new BigDecimal(String.valueOf(fld0422a).trim())).toPlainString());
        fld0423b.set(new BigDecimal(String.valueOf(fld0423b).trim()).add(new BigDecimal(String.valueOf(fld0423a).trim())).toPlainString());
        fld0424b.set(new BigDecimal(String.valueOf(fld0424b).trim()).subtract(new BigDecimal(String.valueOf(fld0424a).trim())).toPlainString());
        fld0425b.set(new BigDecimal(String.valueOf(fld0425b).trim()).add(new BigDecimal(String.valueOf(fld0425a).trim())).toPlainString());
        fld0426b.set(new BigDecimal(String.valueOf(fld0426b).trim()).subtract(new BigDecimal(String.valueOf(fld0426a).trim())).toPlainString());
        fld0427b.set(new BigDecimal(String.valueOf(fld0427b).trim()).add(new BigDecimal(String.valueOf(fld0427a).trim())).toPlainString());
        fld0428b.set(new BigDecimal(String.valueOf(fld0428b).trim()).subtract(new BigDecimal(String.valueOf(fld0428a).trim())).toPlainString());
        fld0429b.set(new BigDecimal(String.valueOf(fld0429b).trim()).add(new BigDecimal(String.valueOf(fld0429a).trim())).toPlainString());
        fld0430b.set(new BigDecimal(String.valueOf(fld0430b).trim()).subtract(new BigDecimal(String.valueOf(fld0430a).trim())).toPlainString());
        fld0431b.set(new BigDecimal(String.valueOf(fld0431b).trim()).add(new BigDecimal(String.valueOf(fld0431a).trim())).toPlainString());
        fld0432b.set(new BigDecimal(String.valueOf(fld0432b).trim()).subtract(new BigDecimal(String.valueOf(fld0432a).trim())).toPlainString());
        fld0433b.set(new BigDecimal(String.valueOf(fld0433b).trim()).add(new BigDecimal(String.valueOf(fld0433a).trim())).toPlainString());
        fld0434b.set(new BigDecimal(String.valueOf(fld0434b).trim()).subtract(new BigDecimal(String.valueOf(fld0434a).trim())).toPlainString());
        fld0435b.set(new BigDecimal(String.valueOf(fld0435b).trim()).add(new BigDecimal(String.valueOf(fld0435a).trim())).toPlainString());
        fld0436b.set(new BigDecimal(String.valueOf(fld0436b).trim()).subtract(new BigDecimal(String.valueOf(fld0436a).trim())).toPlainString());
        fld0437b.set(new BigDecimal(String.valueOf(fld0437b).trim()).add(new BigDecimal(String.valueOf(fld0437a).trim())).toPlainString());
        fld0438b.set(new BigDecimal(String.valueOf(fld0438b).trim()).subtract(new BigDecimal(String.valueOf(fld0438a).trim())).toPlainString());
        fld0439b.set(new BigDecimal(String.valueOf(fld0439b).trim()).add(new BigDecimal(String.valueOf(fld0439a).trim())).toPlainString());
        fld0440b.set(new BigDecimal(String.valueOf(fld0440b).trim()).subtract(new BigDecimal(String.valueOf(fld0440a).trim())).toPlainString());
        fld0441b.set(new BigDecimal(String.valueOf(fld0441b).trim()).add(new BigDecimal(String.valueOf(fld0441a).trim())).toPlainString());
        fld0442b.set(new BigDecimal(String.valueOf(fld0442b).trim()).subtract(new BigDecimal(String.valueOf(fld0442a).trim())).toPlainString());
        fld0443b.set(new BigDecimal(String.valueOf(fld0443b).trim()).add(new BigDecimal(String.valueOf(fld0443a).trim())).toPlainString());
        fld0444b.set(new BigDecimal(String.valueOf(fld0444b).trim()).subtract(new BigDecimal(String.valueOf(fld0444a).trim())).toPlainString());
        fld0445b.set(new BigDecimal(String.valueOf(fld0445b).trim()).add(new BigDecimal(String.valueOf(fld0445a).trim())).toPlainString());
        fld0446b.set(new BigDecimal(String.valueOf(fld0446b).trim()).subtract(new BigDecimal(String.valueOf(fld0446a).trim())).toPlainString());
        fld0447b.set(new BigDecimal(String.valueOf(fld0447b).trim()).add(new BigDecimal(String.valueOf(fld0447a).trim())).toPlainString());
        fld0448b.set(new BigDecimal(String.valueOf(fld0448b).trim()).subtract(new BigDecimal(String.valueOf(fld0448a).trim())).toPlainString());
        fld0449b.set(new BigDecimal(String.valueOf(fld0449b).trim()).add(new BigDecimal(String.valueOf(fld0449a).trim())).toPlainString());
        fld0450b.set(new BigDecimal(String.valueOf(fld0450b).trim()).subtract(new BigDecimal(String.valueOf(fld0450a).trim())).toPlainString());
        fld0451b.set(new BigDecimal(String.valueOf(fld0451b).trim()).add(new BigDecimal(String.valueOf(fld0451a).trim())).toPlainString());
        fld0452b.set(new BigDecimal(String.valueOf(fld0452b).trim()).subtract(new BigDecimal(String.valueOf(fld0452a).trim())).toPlainString());
        fld0453b.set(new BigDecimal(String.valueOf(fld0453b).trim()).add(new BigDecimal(String.valueOf(fld0453a).trim())).toPlainString());
        fld0454b.set(new BigDecimal(String.valueOf(fld0454b).trim()).subtract(new BigDecimal(String.valueOf(fld0454a).trim())).toPlainString());
        fld0455b.set(new BigDecimal(String.valueOf(fld0455b).trim()).add(new BigDecimal(String.valueOf(fld0455a).trim())).toPlainString());
        fld0456b.set(new BigDecimal(String.valueOf(fld0456b).trim()).subtract(new BigDecimal(String.valueOf(fld0456a).trim())).toPlainString());
        fld0457b.set(new BigDecimal(String.valueOf(fld0457b).trim()).add(new BigDecimal(String.valueOf(fld0457a).trim())).toPlainString());
        fld0458b.set(new BigDecimal(String.valueOf(fld0458b).trim()).subtract(new BigDecimal(String.valueOf(fld0458a).trim())).toPlainString());
        fld0459b.set(new BigDecimal(String.valueOf(fld0459b).trim()).add(new BigDecimal(String.valueOf(fld0459a).trim())).toPlainString());
        fld0460b.set(new BigDecimal(String.valueOf(fld0460b).trim()).subtract(new BigDecimal(String.valueOf(fld0460a).trim())).toPlainString());
        fld0461b.set(new BigDecimal(String.valueOf(fld0461b).trim()).add(new BigDecimal(String.valueOf(fld0461a).trim())).toPlainString());
        fld0462b.set(new BigDecimal(String.valueOf(fld0462b).trim()).subtract(new BigDecimal(String.valueOf(fld0462a).trim())).toPlainString());
        fld0463b.set(new BigDecimal(String.valueOf(fld0463b).trim()).add(new BigDecimal(String.valueOf(fld0463a).trim())).toPlainString());
        fld0464b.set(new BigDecimal(String.valueOf(fld0464b).trim()).subtract(new BigDecimal(String.valueOf(fld0464a).trim())).toPlainString());
        fld0465b.set(new BigDecimal(String.valueOf(fld0465b).trim()).add(new BigDecimal(String.valueOf(fld0465a).trim())).toPlainString());
        fld0466b.set(new BigDecimal(String.valueOf(fld0466b).trim()).subtract(new BigDecimal(String.valueOf(fld0466a).trim())).toPlainString());
        fld0467b.set(new BigDecimal(String.valueOf(fld0467b).trim()).add(new BigDecimal(String.valueOf(fld0467a).trim())).toPlainString());
        fld0468b.set(new BigDecimal(String.valueOf(fld0468b).trim()).subtract(new BigDecimal(String.valueOf(fld0468a).trim())).toPlainString());
        fld0469b.set(new BigDecimal(String.valueOf(fld0469b).trim()).add(new BigDecimal(String.valueOf(fld0469a).trim())).toPlainString());
        fld0470b.set(new BigDecimal(String.valueOf(fld0470b).trim()).subtract(new BigDecimal(String.valueOf(fld0470a).trim())).toPlainString());
        fld0471b.set(new BigDecimal(String.valueOf(fld0471b).trim()).add(new BigDecimal(String.valueOf(fld0471a).trim())).toPlainString());
        fld0472b.set(new BigDecimal(String.valueOf(fld0472b).trim()).subtract(new BigDecimal(String.valueOf(fld0472a).trim())).toPlainString());
        fld0473b.set(new BigDecimal(String.valueOf(fld0473b).trim()).add(new BigDecimal(String.valueOf(fld0473a).trim())).toPlainString());
        fld0474b.set(new BigDecimal(String.valueOf(fld0474b).trim()).subtract(new BigDecimal(String.valueOf(fld0474a).trim())).toPlainString());
        fld0475b.set(new BigDecimal(String.valueOf(fld0475b).trim()).add(new BigDecimal(String.valueOf(fld0475a).trim())).toPlainString());
        fld0476b.set(new BigDecimal(String.valueOf(fld0476b).trim()).subtract(new BigDecimal(String.valueOf(fld0476a).trim())).toPlainString());
        fld0477b.set(new BigDecimal(String.valueOf(fld0477b).trim()).add(new BigDecimal(String.valueOf(fld0477a).trim())).toPlainString());
        fld0478b.set(new BigDecimal(String.valueOf(fld0478b).trim()).subtract(new BigDecimal(String.valueOf(fld0478a).trim())).toPlainString());
        fld0479b.set(new BigDecimal(String.valueOf(fld0479b).trim()).add(new BigDecimal(String.valueOf(fld0479a).trim())).toPlainString());
        fld0480b.set(new BigDecimal(String.valueOf(fld0480b).trim()).subtract(new BigDecimal(String.valueOf(fld0480a).trim())).toPlainString());
        fld0481b.set(new BigDecimal(String.valueOf(fld0481b).trim()).add(new BigDecimal(String.valueOf(fld0481a).trim())).toPlainString());
        fld0482b.set(new BigDecimal(String.valueOf(fld0482b).trim()).subtract(new BigDecimal(String.valueOf(fld0482a).trim())).toPlainString());
        fld0483b.set(new BigDecimal(String.valueOf(fld0483b).trim()).add(new BigDecimal(String.valueOf(fld0483a).trim())).toPlainString());
        fld0484b.set(new BigDecimal(String.valueOf(fld0484b).trim()).subtract(new BigDecimal(String.valueOf(fld0484a).trim())).toPlainString());
        fld0485b.set(new BigDecimal(String.valueOf(fld0485b).trim()).add(new BigDecimal(String.valueOf(fld0485a).trim())).toPlainString());
        fld0486b.set(new BigDecimal(String.valueOf(fld0486b).trim()).subtract(new BigDecimal(String.valueOf(fld0486a).trim())).toPlainString());
        fld0487b.set(new BigDecimal(String.valueOf(fld0487b).trim()).add(new BigDecimal(String.valueOf(fld0487a).trim())).toPlainString());
        fld0488b.set(new BigDecimal(String.valueOf(fld0488b).trim()).subtract(new BigDecimal(String.valueOf(fld0488a).trim())).toPlainString());
        fld0489b.set(new BigDecimal(String.valueOf(fld0489b).trim()).add(new BigDecimal(String.valueOf(fld0489a).trim())).toPlainString());
        fld0490b.set(new BigDecimal(String.valueOf(fld0490b).trim()).subtract(new BigDecimal(String.valueOf(fld0490a).trim())).toPlainString());
        fld0491b.set(new BigDecimal(String.valueOf(fld0491b).trim()).add(new BigDecimal(String.valueOf(fld0491a).trim())).toPlainString());
        fld0492b.set(new BigDecimal(String.valueOf(fld0492b).trim()).subtract(new BigDecimal(String.valueOf(fld0492a).trim())).toPlainString());
        fld0493b.set(new BigDecimal(String.valueOf(fld0493b).trim()).add(new BigDecimal(String.valueOf(fld0493a).trim())).toPlainString());
        fld0494b.set(new BigDecimal(String.valueOf(fld0494b).trim()).subtract(new BigDecimal(String.valueOf(fld0494a).trim())).toPlainString());
        fld0495b.set(new BigDecimal(String.valueOf(fld0495b).trim()).add(new BigDecimal(String.valueOf(fld0495a).trim())).toPlainString());
        fld0496b.set(new BigDecimal(String.valueOf(fld0496b).trim()).subtract(new BigDecimal(String.valueOf(fld0496a).trim())).toPlainString());
        fld0497b.set(new BigDecimal(String.valueOf(fld0497b).trim()).add(new BigDecimal(String.valueOf(fld0497a).trim())).toPlainString());
        fld0498b.set(new BigDecimal(String.valueOf(fld0498b).trim()).subtract(new BigDecimal(String.valueOf(fld0498a).trim())).toPlainString());
        fld0499b.set(new BigDecimal(String.valueOf(fld0499b).trim()).add(new BigDecimal(String.valueOf(fld0499a).trim())).toPlainString());
        /* RAW: * 4000 - */
    }

    private void compare() {
        compare_part0();
        compare_part1();
        compare_part2();
        compare_part3();
        compare_part4();
    }
    private void compare_part0() {
        if (!String.valueOf(CobolString.refMod(fld0001b, 1)).equals(String.valueOf(xpc_fld0001b))) {
            CobolDisplay.display("FLD0001B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0001b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0001b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0002b, 1)).equals(String.valueOf(xpc_fld0002b))) {
            CobolDisplay.display("FLD0002B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0002b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0002b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0003b, 1)).equals(String.valueOf(xpc_fld0003b))) {
            CobolDisplay.display("FLD0003B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0003b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0003b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0004b, 1)).equals(String.valueOf(xpc_fld0004b))) {
            CobolDisplay.display("FLD0004B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0004b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0004b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0005b, 1)).equals(String.valueOf(xpc_fld0005b))) {
            CobolDisplay.display("FLD0005B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0005b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0005b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0006b, 1)).equals(String.valueOf(xpc_fld0006b))) {
            CobolDisplay.display("FLD0006B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0006b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0006b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0007b, 1)).equals(String.valueOf(xpc_fld0007b))) {
            CobolDisplay.display("FLD0007B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0007b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0007b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0008b, 1)).equals(String.valueOf(xpc_fld0008b))) {
            CobolDisplay.display("FLD0008B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0008b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0008b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0009b, 1)).equals(String.valueOf(xpc_fld0009b))) {
            CobolDisplay.display("FLD0009B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0009b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0009b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0010b, 1)).equals(String.valueOf(xpc_fld0010b))) {
            CobolDisplay.display("FLD0010B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0010b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0010b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0011b, 1)).equals(String.valueOf(xpc_fld0011b))) {
            CobolDisplay.display("FLD0011B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0011b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0011b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0012b, 1)).equals(String.valueOf(xpc_fld0012b))) {
            CobolDisplay.display("FLD0012B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0012b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0012b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0013b, 1)).equals(String.valueOf(xpc_fld0013b))) {
            CobolDisplay.display("FLD0013B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0013b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0013b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0014b, 1)).equals(String.valueOf(xpc_fld0014b))) {
            CobolDisplay.display("FLD0014B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0014b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0014b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0015b, 1)).equals(String.valueOf(xpc_fld0015b))) {
            CobolDisplay.display("FLD0015B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0015b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0015b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0016b, 1)).equals(String.valueOf(xpc_fld0016b))) {
            CobolDisplay.display("FLD0016B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0016b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0016b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0017b, 1)).equals(String.valueOf(xpc_fld0017b))) {
            CobolDisplay.display("FLD0017B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0017b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0017b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0018b, 1)).equals(String.valueOf(xpc_fld0018b))) {
            CobolDisplay.display("FLD0018B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0018b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0018b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0019b, 1)).equals(String.valueOf(xpc_fld0019b))) {
            CobolDisplay.display("FLD0019B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0019b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0019b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0020b, 1)).equals(String.valueOf(xpc_fld0020b))) {
            CobolDisplay.display("FLD0020B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0020b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0020b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0021b, 1)).equals(String.valueOf(xpc_fld0021b))) {
            CobolDisplay.display("FLD0021B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0021b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0021b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0022b, 1)).equals(String.valueOf(xpc_fld0022b))) {
            CobolDisplay.display("FLD0022B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0022b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0022b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0023b, 1)).equals(String.valueOf(xpc_fld0023b))) {
            CobolDisplay.display("FLD0023B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0023b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0023b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0024b, 1)).equals(String.valueOf(xpc_fld0024b))) {
            CobolDisplay.display("FLD0024B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0024b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0024b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0025b, 1)).equals(String.valueOf(xpc_fld0025b))) {
            CobolDisplay.display("FLD0025B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0025b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0025b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0026b, 1)).equals(String.valueOf(xpc_fld0026b))) {
            CobolDisplay.display("FLD0026B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0026b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0026b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0027b, 1)).equals(String.valueOf(xpc_fld0027b))) {
            CobolDisplay.display("FLD0027B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0027b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0027b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0028b, 1)).equals(String.valueOf(xpc_fld0028b))) {
            CobolDisplay.display("FLD0028B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0028b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0028b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0029b, 1)).equals(String.valueOf(xpc_fld0029b))) {
            CobolDisplay.display("FLD0029B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0029b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0029b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0030b, 1)).equals(String.valueOf(xpc_fld0030b))) {
            CobolDisplay.display("FLD0030B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0030b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0030b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0031b, 1)).equals(String.valueOf(xpc_fld0031b))) {
            CobolDisplay.display("FLD0031B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0031b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0031b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0032b, 1)).equals(String.valueOf(xpc_fld0032b))) {
            CobolDisplay.display("FLD0032B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0032b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0032b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0033b, 1)).equals(String.valueOf(xpc_fld0033b))) {
            CobolDisplay.display("FLD0033B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0033b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0033b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0034b, 1)).equals(String.valueOf(xpc_fld0034b))) {
            CobolDisplay.display("FLD0034B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0034b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0034b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0035b, 1)).equals(String.valueOf(xpc_fld0035b))) {
            CobolDisplay.display("FLD0035B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0035b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0035b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0036b, 1)).equals(String.valueOf(xpc_fld0036b))) {
            CobolDisplay.display("FLD0036B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0036b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0036b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0037b, 1)).equals(String.valueOf(xpc_fld0037b))) {
            CobolDisplay.display("FLD0037B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0037b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0037b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0038b, 1)).equals(String.valueOf(xpc_fld0038b))) {
            CobolDisplay.display("FLD0038B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0038b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0038b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0039b, 1)).equals(String.valueOf(xpc_fld0039b))) {
            CobolDisplay.display("FLD0039B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0039b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0039b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0040b, 1)).equals(String.valueOf(xpc_fld0040b))) {
            CobolDisplay.display("FLD0040B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0040b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0040b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0041b, 1)).equals(String.valueOf(xpc_fld0041b))) {
            CobolDisplay.display("FLD0041B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0041b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0041b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0042b, 1)).equals(String.valueOf(xpc_fld0042b))) {
            CobolDisplay.display("FLD0042B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0042b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0042b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0043b, 1)).equals(String.valueOf(xpc_fld0043b))) {
            CobolDisplay.display("FLD0043B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0043b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0043b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0044b, 1)).equals(String.valueOf(xpc_fld0044b))) {
            CobolDisplay.display("FLD0044B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0044b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0044b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0045b, 1)).equals(String.valueOf(xpc_fld0045b))) {
            CobolDisplay.display("FLD0045B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0045b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0045b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0046b, 1)).equals(String.valueOf(xpc_fld0046b))) {
            CobolDisplay.display("FLD0046B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0046b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0046b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0047b, 1)).equals(String.valueOf(xpc_fld0047b))) {
            CobolDisplay.display("FLD0047B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0047b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0047b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0048b, 1)).equals(String.valueOf(xpc_fld0048b))) {
            CobolDisplay.display("FLD0048B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0048b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0048b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0049b, 1)).equals(String.valueOf(xpc_fld0049b))) {
            CobolDisplay.display("FLD0049B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0049b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0049b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0050b, 1)).equals(String.valueOf(xpc_fld0050b))) {
            CobolDisplay.display("FLD0050B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0050b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0050b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0051b, 1)).equals(String.valueOf(xpc_fld0051b))) {
            CobolDisplay.display("FLD0051B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0051b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0051b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0052b, 1)).equals(String.valueOf(xpc_fld0052b))) {
            CobolDisplay.display("FLD0052B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0052b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0052b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0053b, 1)).equals(String.valueOf(xpc_fld0053b))) {
            CobolDisplay.display("FLD0053B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0053b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0053b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0054b, 1)).equals(String.valueOf(xpc_fld0054b))) {
            CobolDisplay.display("FLD0054B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0054b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0054b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0055b, 1)).equals(String.valueOf(xpc_fld0055b))) {
            CobolDisplay.display("FLD0055B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0055b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0055b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0056b, 1)).equals(String.valueOf(xpc_fld0056b))) {
            CobolDisplay.display("FLD0056B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0056b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0056b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0057b, 1)).equals(String.valueOf(xpc_fld0057b))) {
            CobolDisplay.display("FLD0057B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0057b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0057b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0058b, 1)).equals(String.valueOf(xpc_fld0058b))) {
            CobolDisplay.display("FLD0058B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0058b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0058b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0059b, 1)).equals(String.valueOf(xpc_fld0059b))) {
            CobolDisplay.display("FLD0059B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0059b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0059b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0060b, 1)).equals(String.valueOf(xpc_fld0060b))) {
            CobolDisplay.display("FLD0060B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0060b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0060b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0061b, 1)).equals(String.valueOf(xpc_fld0061b))) {
            CobolDisplay.display("FLD0061B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0061b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0061b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0062b, 1)).equals(String.valueOf(xpc_fld0062b))) {
            CobolDisplay.display("FLD0062B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0062b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0062b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0063b, 1)).equals(String.valueOf(xpc_fld0063b))) {
            CobolDisplay.display("FLD0063B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0063b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0063b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0064b, 1)).equals(String.valueOf(xpc_fld0064b))) {
            CobolDisplay.display("FLD0064B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0064b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0064b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0065b, 1)).equals(String.valueOf(xpc_fld0065b))) {
            CobolDisplay.display("FLD0065B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0065b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0065b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0066b, 1)).equals(String.valueOf(xpc_fld0066b))) {
            CobolDisplay.display("FLD0066B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0066b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0066b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0067b, 1)).equals(String.valueOf(xpc_fld0067b))) {
            CobolDisplay.display("FLD0067B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0067b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0067b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0068b, 1)).equals(String.valueOf(xpc_fld0068b))) {
            CobolDisplay.display("FLD0068B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0068b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0068b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0069b, 1)).equals(String.valueOf(xpc_fld0069b))) {
            CobolDisplay.display("FLD0069B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0069b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0069b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0070b, 1)).equals(String.valueOf(xpc_fld0070b))) {
            CobolDisplay.display("FLD0070B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0070b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0070b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0071b, 1)).equals(String.valueOf(xpc_fld0071b))) {
            CobolDisplay.display("FLD0071B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0071b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0071b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0072b, 1)).equals(String.valueOf(xpc_fld0072b))) {
            CobolDisplay.display("FLD0072B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0072b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0072b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0073b, 1)).equals(String.valueOf(xpc_fld0073b))) {
            CobolDisplay.display("FLD0073B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0073b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0073b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0074b, 1)).equals(String.valueOf(xpc_fld0074b))) {
            CobolDisplay.display("FLD0074B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0074b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0074b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0075b, 1)).equals(String.valueOf(xpc_fld0075b))) {
            CobolDisplay.display("FLD0075B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0075b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0075b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0076b, 1)).equals(String.valueOf(xpc_fld0076b))) {
            CobolDisplay.display("FLD0076B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0076b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0076b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0077b, 1)).equals(String.valueOf(xpc_fld0077b))) {
            CobolDisplay.display("FLD0077B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0077b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0077b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0078b, 1)).equals(String.valueOf(xpc_fld0078b))) {
            CobolDisplay.display("FLD0078B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0078b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0078b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0079b, 1)).equals(String.valueOf(xpc_fld0079b))) {
            CobolDisplay.display("FLD0079B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0079b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0079b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0080b, 1)).equals(String.valueOf(xpc_fld0080b))) {
            CobolDisplay.display("FLD0080B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0080b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0080b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0081b, 1)).equals(String.valueOf(xpc_fld0081b))) {
            CobolDisplay.display("FLD0081B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0081b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0081b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0082b, 1)).equals(String.valueOf(xpc_fld0082b))) {
            CobolDisplay.display("FLD0082B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0082b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0082b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0083b, 1)).equals(String.valueOf(xpc_fld0083b))) {
            CobolDisplay.display("FLD0083B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0083b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0083b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0084b, 1)).equals(String.valueOf(xpc_fld0084b))) {
            CobolDisplay.display("FLD0084B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0084b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0084b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0085b, 1)).equals(String.valueOf(xpc_fld0085b))) {
            CobolDisplay.display("FLD0085B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0085b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0085b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0086b, 1)).equals(String.valueOf(xpc_fld0086b))) {
            CobolDisplay.display("FLD0086B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0086b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0086b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0087b, 1)).equals(String.valueOf(xpc_fld0087b))) {
            CobolDisplay.display("FLD0087B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0087b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0087b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0088b, 1)).equals(String.valueOf(xpc_fld0088b))) {
            CobolDisplay.display("FLD0088B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0088b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0088b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0089b, 1)).equals(String.valueOf(xpc_fld0089b))) {
            CobolDisplay.display("FLD0089B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0089b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0089b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0090b, 1)).equals(String.valueOf(xpc_fld0090b))) {
            CobolDisplay.display("FLD0090B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0090b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0090b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0091b, 1)).equals(String.valueOf(xpc_fld0091b))) {
            CobolDisplay.display("FLD0091B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0091b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0091b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0092b, 1)).equals(String.valueOf(xpc_fld0092b))) {
            CobolDisplay.display("FLD0092B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0092b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0092b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0093b, 1)).equals(String.valueOf(xpc_fld0093b))) {
            CobolDisplay.display("FLD0093B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0093b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0093b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0094b, 1)).equals(String.valueOf(xpc_fld0094b))) {
            CobolDisplay.display("FLD0094B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0094b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0094b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0095b, 1)).equals(String.valueOf(xpc_fld0095b))) {
            CobolDisplay.display("FLD0095B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0095b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0095b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0096b, 1)).equals(String.valueOf(xpc_fld0096b))) {
            CobolDisplay.display("FLD0096B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0096b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0096b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0097b, 1)).equals(String.valueOf(xpc_fld0097b))) {
            CobolDisplay.display("FLD0097B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0097b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0097b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0098b, 1)).equals(String.valueOf(xpc_fld0098b))) {
            CobolDisplay.display("FLD0098B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0098b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0098b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0099b, 1)).equals(String.valueOf(xpc_fld0099b))) {
            CobolDisplay.display("FLD0099B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0099b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0099b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0100b, 1)).equals(String.valueOf(xpc_fld0100b))) {
            CobolDisplay.display("FLD0100B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0100b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0100b).trim()) - 1]));
        }
    }
    private void compare_part1() {
        if (!String.valueOf(CobolString.refMod(fld0101b, 1)).equals(String.valueOf(xpc_fld0101b))) {
            CobolDisplay.display("FLD0101B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0101b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0101b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0102b, 1)).equals(String.valueOf(xpc_fld0102b))) {
            CobolDisplay.display("FLD0102B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0102b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0102b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0103b, 1)).equals(String.valueOf(xpc_fld0103b))) {
            CobolDisplay.display("FLD0103B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0103b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0103b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0104b, 1)).equals(String.valueOf(xpc_fld0104b))) {
            CobolDisplay.display("FLD0104B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0104b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0104b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0105b, 1)).equals(String.valueOf(xpc_fld0105b))) {
            CobolDisplay.display("FLD0105B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0105b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0105b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0106b, 1)).equals(String.valueOf(xpc_fld0106b))) {
            CobolDisplay.display("FLD0106B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0106b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0106b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0107b, 1)).equals(String.valueOf(xpc_fld0107b))) {
            CobolDisplay.display("FLD0107B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0107b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0107b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0108b, 1)).equals(String.valueOf(xpc_fld0108b))) {
            CobolDisplay.display("FLD0108B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0108b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0108b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0109b, 1)).equals(String.valueOf(xpc_fld0109b))) {
            CobolDisplay.display("FLD0109B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0109b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0109b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0110b, 1)).equals(String.valueOf(xpc_fld0110b))) {
            CobolDisplay.display("FLD0110B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0110b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0110b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0111b, 1)).equals(String.valueOf(xpc_fld0111b))) {
            CobolDisplay.display("FLD0111B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0111b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0111b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0112b, 1)).equals(String.valueOf(xpc_fld0112b))) {
            CobolDisplay.display("FLD0112B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0112b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0112b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0113b, 1)).equals(String.valueOf(xpc_fld0113b))) {
            CobolDisplay.display("FLD0113B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0113b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0113b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0114b, 1)).equals(String.valueOf(xpc_fld0114b))) {
            CobolDisplay.display("FLD0114B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0114b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0114b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0115b, 1)).equals(String.valueOf(xpc_fld0115b))) {
            CobolDisplay.display("FLD0115B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0115b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0115b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0116b, 1)).equals(String.valueOf(xpc_fld0116b))) {
            CobolDisplay.display("FLD0116B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0116b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0116b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0117b, 1)).equals(String.valueOf(xpc_fld0117b))) {
            CobolDisplay.display("FLD0117B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0117b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0117b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0118b, 1)).equals(String.valueOf(xpc_fld0118b))) {
            CobolDisplay.display("FLD0118B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0118b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0118b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0119b, 1)).equals(String.valueOf(xpc_fld0119b))) {
            CobolDisplay.display("FLD0119B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0119b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0119b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0120b, 1)).equals(String.valueOf(xpc_fld0120b))) {
            CobolDisplay.display("FLD0120B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0120b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0120b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0121b, 1)).equals(String.valueOf(xpc_fld0121b))) {
            CobolDisplay.display("FLD0121B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0121b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0121b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0122b, 1)).equals(String.valueOf(xpc_fld0122b))) {
            CobolDisplay.display("FLD0122B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0122b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0122b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0123b, 1)).equals(String.valueOf(xpc_fld0123b))) {
            CobolDisplay.display("FLD0123B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0123b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0123b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0124b, 1)).equals(String.valueOf(xpc_fld0124b))) {
            CobolDisplay.display("FLD0124B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0124b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0124b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0125b, 1)).equals(String.valueOf(xpc_fld0125b))) {
            CobolDisplay.display("FLD0125B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0125b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0125b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0126b, 1)).equals(String.valueOf(xpc_fld0126b))) {
            CobolDisplay.display("FLD0126B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0126b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0126b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0127b, 1)).equals(String.valueOf(xpc_fld0127b))) {
            CobolDisplay.display("FLD0127B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0127b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0127b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0128b, 1)).equals(String.valueOf(xpc_fld0128b))) {
            CobolDisplay.display("FLD0128B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0128b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0128b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0129b, 1)).equals(String.valueOf(xpc_fld0129b))) {
            CobolDisplay.display("FLD0129B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0129b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0129b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0130b, 1)).equals(String.valueOf(xpc_fld0130b))) {
            CobolDisplay.display("FLD0130B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0130b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0130b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0131b, 1)).equals(String.valueOf(xpc_fld0131b))) {
            CobolDisplay.display("FLD0131B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0131b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0131b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0132b, 1)).equals(String.valueOf(xpc_fld0132b))) {
            CobolDisplay.display("FLD0132B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0132b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0132b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0133b, 1)).equals(String.valueOf(xpc_fld0133b))) {
            CobolDisplay.display("FLD0133B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0133b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0133b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0134b, 1)).equals(String.valueOf(xpc_fld0134b))) {
            CobolDisplay.display("FLD0134B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0134b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0134b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0135b, 1)).equals(String.valueOf(xpc_fld0135b))) {
            CobolDisplay.display("FLD0135B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0135b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0135b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0136b, 1)).equals(String.valueOf(xpc_fld0136b))) {
            CobolDisplay.display("FLD0136B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0136b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0136b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0137b, 1)).equals(String.valueOf(xpc_fld0137b))) {
            CobolDisplay.display("FLD0137B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0137b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0137b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0138b, 1)).equals(String.valueOf(xpc_fld0138b))) {
            CobolDisplay.display("FLD0138B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0138b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0138b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0139b, 1)).equals(String.valueOf(xpc_fld0139b))) {
            CobolDisplay.display("FLD0139B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0139b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0139b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0140b, 1)).equals(String.valueOf(xpc_fld0140b))) {
            CobolDisplay.display("FLD0140B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0140b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0140b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0141b, 1)).equals(String.valueOf(xpc_fld0141b))) {
            CobolDisplay.display("FLD0141B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0141b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0141b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0142b, 1)).equals(String.valueOf(xpc_fld0142b))) {
            CobolDisplay.display("FLD0142B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0142b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0142b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0143b, 1)).equals(String.valueOf(xpc_fld0143b))) {
            CobolDisplay.display("FLD0143B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0143b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0143b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0144b, 1)).equals(String.valueOf(xpc_fld0144b))) {
            CobolDisplay.display("FLD0144B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0144b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0144b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0145b, 1)).equals(String.valueOf(xpc_fld0145b))) {
            CobolDisplay.display("FLD0145B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0145b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0145b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0146b, 1)).equals(String.valueOf(xpc_fld0146b))) {
            CobolDisplay.display("FLD0146B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0146b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0146b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0147b, 1)).equals(String.valueOf(xpc_fld0147b))) {
            CobolDisplay.display("FLD0147B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0147b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0147b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0148b, 1)).equals(String.valueOf(xpc_fld0148b))) {
            CobolDisplay.display("FLD0148B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0148b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0148b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0149b, 1)).equals(String.valueOf(xpc_fld0149b))) {
            CobolDisplay.display("FLD0149B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0149b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0149b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0150b, 1)).equals(String.valueOf(xpc_fld0150b))) {
            CobolDisplay.display("FLD0150B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0150b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0150b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0151b, 1)).equals(String.valueOf(xpc_fld0151b))) {
            CobolDisplay.display("FLD0151B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0151b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0151b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0152b, 1)).equals(String.valueOf(xpc_fld0152b))) {
            CobolDisplay.display("FLD0152B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0152b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0152b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0153b, 1)).equals(String.valueOf(xpc_fld0153b))) {
            CobolDisplay.display("FLD0153B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0153b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0153b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0154b, 1)).equals(String.valueOf(xpc_fld0154b))) {
            CobolDisplay.display("FLD0154B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0154b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0154b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0155b, 1)).equals(String.valueOf(xpc_fld0155b))) {
            CobolDisplay.display("FLD0155B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0155b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0155b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0156b, 1)).equals(String.valueOf(xpc_fld0156b))) {
            CobolDisplay.display("FLD0156B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0156b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0156b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0157b, 1)).equals(String.valueOf(xpc_fld0157b))) {
            CobolDisplay.display("FLD0157B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0157b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0157b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0158b, 1)).equals(String.valueOf(xpc_fld0158b))) {
            CobolDisplay.display("FLD0158B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0158b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0158b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0159b, 1)).equals(String.valueOf(xpc_fld0159b))) {
            CobolDisplay.display("FLD0159B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0159b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0159b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0160b, 1)).equals(String.valueOf(xpc_fld0160b))) {
            CobolDisplay.display("FLD0160B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0160b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0160b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0161b, 1)).equals(String.valueOf(xpc_fld0161b))) {
            CobolDisplay.display("FLD0161B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0161b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0161b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0162b, 1)).equals(String.valueOf(xpc_fld0162b))) {
            CobolDisplay.display("FLD0162B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0162b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0162b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0163b, 1)).equals(String.valueOf(xpc_fld0163b))) {
            CobolDisplay.display("FLD0163B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0163b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0163b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0164b, 1)).equals(String.valueOf(xpc_fld0164b))) {
            CobolDisplay.display("FLD0164B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0164b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0164b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0165b, 1)).equals(String.valueOf(xpc_fld0165b))) {
            CobolDisplay.display("FLD0165B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0165b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0165b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0166b, 1)).equals(String.valueOf(xpc_fld0166b))) {
            CobolDisplay.display("FLD0166B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0166b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0166b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0167b, 1)).equals(String.valueOf(xpc_fld0167b))) {
            CobolDisplay.display("FLD0167B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0167b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0167b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0168b, 1)).equals(String.valueOf(xpc_fld0168b))) {
            CobolDisplay.display("FLD0168B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0168b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0168b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0169b, 1)).equals(String.valueOf(xpc_fld0169b))) {
            CobolDisplay.display("FLD0169B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0169b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0169b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0170b, 1)).equals(String.valueOf(xpc_fld0170b))) {
            CobolDisplay.display("FLD0170B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0170b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0170b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0171b, 1)).equals(String.valueOf(xpc_fld0171b))) {
            CobolDisplay.display("FLD0171B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0171b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0171b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0172b, 1)).equals(String.valueOf(xpc_fld0172b))) {
            CobolDisplay.display("FLD0172B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0172b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0172b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0173b, 1)).equals(String.valueOf(xpc_fld0173b))) {
            CobolDisplay.display("FLD0173B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0173b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0173b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0174b, 1)).equals(String.valueOf(xpc_fld0174b))) {
            CobolDisplay.display("FLD0174B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0174b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0174b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0175b, 1)).equals(String.valueOf(xpc_fld0175b))) {
            CobolDisplay.display("FLD0175B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0175b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0175b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0176b, 1)).equals(String.valueOf(xpc_fld0176b))) {
            CobolDisplay.display("FLD0176B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0176b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0176b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0177b, 1)).equals(String.valueOf(xpc_fld0177b))) {
            CobolDisplay.display("FLD0177B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0177b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0177b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0178b, 1)).equals(String.valueOf(xpc_fld0178b))) {
            CobolDisplay.display("FLD0178B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0178b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0178b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0179b, 1)).equals(String.valueOf(xpc_fld0179b))) {
            CobolDisplay.display("FLD0179B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0179b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0179b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0180b, 1)).equals(String.valueOf(xpc_fld0180b))) {
            CobolDisplay.display("FLD0180B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0180b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0180b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0181b, 1)).equals(String.valueOf(xpc_fld0181b))) {
            CobolDisplay.display("FLD0181B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0181b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0181b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0182b, 1)).equals(String.valueOf(xpc_fld0182b))) {
            CobolDisplay.display("FLD0182B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0182b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0182b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0183b, 1)).equals(String.valueOf(xpc_fld0183b))) {
            CobolDisplay.display("FLD0183B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0183b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0183b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0184b, 1)).equals(String.valueOf(xpc_fld0184b))) {
            CobolDisplay.display("FLD0184B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0184b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0184b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0185b, 1)).equals(String.valueOf(xpc_fld0185b))) {
            CobolDisplay.display("FLD0185B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0185b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0185b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0186b, 1)).equals(String.valueOf(xpc_fld0186b))) {
            CobolDisplay.display("FLD0186B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0186b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0186b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0187b, 1)).equals(String.valueOf(xpc_fld0187b))) {
            CobolDisplay.display("FLD0187B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0187b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0187b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0188b, 1)).equals(String.valueOf(xpc_fld0188b))) {
            CobolDisplay.display("FLD0188B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0188b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0188b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0189b, 1)).equals(String.valueOf(xpc_fld0189b))) {
            CobolDisplay.display("FLD0189B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0189b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0189b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0190b, 1)).equals(String.valueOf(xpc_fld0190b))) {
            CobolDisplay.display("FLD0190B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0190b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0190b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0191b, 1)).equals(String.valueOf(xpc_fld0191b))) {
            CobolDisplay.display("FLD0191B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0191b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0191b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0192b, 1)).equals(String.valueOf(xpc_fld0192b))) {
            CobolDisplay.display("FLD0192B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0192b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0192b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0193b, 1)).equals(String.valueOf(xpc_fld0193b))) {
            CobolDisplay.display("FLD0193B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0193b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0193b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0194b, 1)).equals(String.valueOf(xpc_fld0194b))) {
            CobolDisplay.display("FLD0194B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0194b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0194b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0195b, 1)).equals(String.valueOf(xpc_fld0195b))) {
            CobolDisplay.display("FLD0195B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0195b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0195b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0196b, 1)).equals(String.valueOf(xpc_fld0196b))) {
            CobolDisplay.display("FLD0196B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0196b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0196b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0197b, 1)).equals(String.valueOf(xpc_fld0197b))) {
            CobolDisplay.display("FLD0197B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0197b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0197b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0198b, 1)).equals(String.valueOf(xpc_fld0198b))) {
            CobolDisplay.display("FLD0198B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0198b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0198b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0199b, 1)).equals(String.valueOf(xpc_fld0199b))) {
            CobolDisplay.display("FLD0199B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0199b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0199b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0200b, 1)).equals(String.valueOf(xpc_fld0200b))) {
            CobolDisplay.display("FLD0200B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0200b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0200b).trim()) - 1]));
        }
    }
    private void compare_part2() {
        if (!String.valueOf(CobolString.refMod(fld0201b, 1)).equals(String.valueOf(xpc_fld0201b))) {
            CobolDisplay.display("FLD0201B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0201b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0201b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0202b, 1)).equals(String.valueOf(xpc_fld0202b))) {
            CobolDisplay.display("FLD0202B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0202b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0202b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0203b, 1)).equals(String.valueOf(xpc_fld0203b))) {
            CobolDisplay.display("FLD0203B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0203b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0203b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0204b, 1)).equals(String.valueOf(xpc_fld0204b))) {
            CobolDisplay.display("FLD0204B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0204b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0204b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0205b, 1)).equals(String.valueOf(xpc_fld0205b))) {
            CobolDisplay.display("FLD0205B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0205b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0205b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0206b, 1)).equals(String.valueOf(xpc_fld0206b))) {
            CobolDisplay.display("FLD0206B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0206b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0206b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0207b, 1)).equals(String.valueOf(xpc_fld0207b))) {
            CobolDisplay.display("FLD0207B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0207b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0207b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0208b, 1)).equals(String.valueOf(xpc_fld0208b))) {
            CobolDisplay.display("FLD0208B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0208b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0208b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0209b, 1)).equals(String.valueOf(xpc_fld0209b))) {
            CobolDisplay.display("FLD0209B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0209b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0209b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0210b, 1)).equals(String.valueOf(xpc_fld0210b))) {
            CobolDisplay.display("FLD0210B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0210b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0210b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0211b, 1)).equals(String.valueOf(xpc_fld0211b))) {
            CobolDisplay.display("FLD0211B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0211b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0211b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0212b, 1)).equals(String.valueOf(xpc_fld0212b))) {
            CobolDisplay.display("FLD0212B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0212b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0212b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0213b, 1)).equals(String.valueOf(xpc_fld0213b))) {
            CobolDisplay.display("FLD0213B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0213b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0213b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0214b, 1)).equals(String.valueOf(xpc_fld0214b))) {
            CobolDisplay.display("FLD0214B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0214b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0214b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0215b, 1)).equals(String.valueOf(xpc_fld0215b))) {
            CobolDisplay.display("FLD0215B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0215b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0215b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0216b, 1)).equals(String.valueOf(xpc_fld0216b))) {
            CobolDisplay.display("FLD0216B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0216b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0216b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0217b, 1)).equals(String.valueOf(xpc_fld0217b))) {
            CobolDisplay.display("FLD0217B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0217b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0217b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0218b, 1)).equals(String.valueOf(xpc_fld0218b))) {
            CobolDisplay.display("FLD0218B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0218b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0218b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0219b, 1)).equals(String.valueOf(xpc_fld0219b))) {
            CobolDisplay.display("FLD0219B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0219b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0219b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0220b, 1)).equals(String.valueOf(xpc_fld0220b))) {
            CobolDisplay.display("FLD0220B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0220b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0220b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0221b, 1)).equals(String.valueOf(xpc_fld0221b))) {
            CobolDisplay.display("FLD0221B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0221b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0221b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0222b, 1)).equals(String.valueOf(xpc_fld0222b))) {
            CobolDisplay.display("FLD0222B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0222b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0222b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0223b, 1)).equals(String.valueOf(xpc_fld0223b))) {
            CobolDisplay.display("FLD0223B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0223b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0223b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0224b, 1)).equals(String.valueOf(xpc_fld0224b))) {
            CobolDisplay.display("FLD0224B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0224b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0224b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0225b, 1)).equals(String.valueOf(xpc_fld0225b))) {
            CobolDisplay.display("FLD0225B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0225b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0225b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0226b, 1)).equals(String.valueOf(xpc_fld0226b))) {
            CobolDisplay.display("FLD0226B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0226b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0226b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0227b, 1)).equals(String.valueOf(xpc_fld0227b))) {
            CobolDisplay.display("FLD0227B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0227b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0227b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0228b, 1)).equals(String.valueOf(xpc_fld0228b))) {
            CobolDisplay.display("FLD0228B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0228b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0228b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0229b, 1)).equals(String.valueOf(xpc_fld0229b))) {
            CobolDisplay.display("FLD0229B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0229b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0229b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0230b, 1)).equals(String.valueOf(xpc_fld0230b))) {
            CobolDisplay.display("FLD0230B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0230b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0230b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0231b, 1)).equals(String.valueOf(xpc_fld0231b))) {
            CobolDisplay.display("FLD0231B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0231b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0231b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0232b, 1)).equals(String.valueOf(xpc_fld0232b))) {
            CobolDisplay.display("FLD0232B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0232b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0232b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0233b, 1)).equals(String.valueOf(xpc_fld0233b))) {
            CobolDisplay.display("FLD0233B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0233b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0233b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0234b, 1)).equals(String.valueOf(xpc_fld0234b))) {
            CobolDisplay.display("FLD0234B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0234b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0234b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0235b, 1)).equals(String.valueOf(xpc_fld0235b))) {
            CobolDisplay.display("FLD0235B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0235b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0235b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0236b, 1)).equals(String.valueOf(xpc_fld0236b))) {
            CobolDisplay.display("FLD0236B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0236b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0236b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0237b, 1)).equals(String.valueOf(xpc_fld0237b))) {
            CobolDisplay.display("FLD0237B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0237b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0237b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0238b, 1)).equals(String.valueOf(xpc_fld0238b))) {
            CobolDisplay.display("FLD0238B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0238b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0238b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0239b, 1)).equals(String.valueOf(xpc_fld0239b))) {
            CobolDisplay.display("FLD0239B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0239b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0239b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0240b, 1)).equals(String.valueOf(xpc_fld0240b))) {
            CobolDisplay.display("FLD0240B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0240b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0240b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0241b, 1)).equals(String.valueOf(xpc_fld0241b))) {
            CobolDisplay.display("FLD0241B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0241b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0241b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0242b, 1)).equals(String.valueOf(xpc_fld0242b))) {
            CobolDisplay.display("FLD0242B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0242b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0242b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0243b, 1)).equals(String.valueOf(xpc_fld0243b))) {
            CobolDisplay.display("FLD0243B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0243b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0243b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0244b, 1)).equals(String.valueOf(xpc_fld0244b))) {
            CobolDisplay.display("FLD0244B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0244b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0244b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0245b, 1)).equals(String.valueOf(xpc_fld0245b))) {
            CobolDisplay.display("FLD0245B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0245b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0245b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0246b, 1)).equals(String.valueOf(xpc_fld0246b))) {
            CobolDisplay.display("FLD0246B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0246b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0246b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0247b, 1)).equals(String.valueOf(xpc_fld0247b))) {
            CobolDisplay.display("FLD0247B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0247b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0247b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0248b, 1)).equals(String.valueOf(xpc_fld0248b))) {
            CobolDisplay.display("FLD0248B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0248b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0248b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0249b, 1)).equals(String.valueOf(xpc_fld0249b))) {
            CobolDisplay.display("FLD0249B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0249b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0249b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0250b, 1)).equals(String.valueOf(xpc_fld0250b))) {
            CobolDisplay.display("FLD0250B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0250b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0250b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0251b, 1)).equals(String.valueOf(xpc_fld0251b))) {
            CobolDisplay.display("FLD0251B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0251b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0251b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0252b, 1)).equals(String.valueOf(xpc_fld0252b))) {
            CobolDisplay.display("FLD0252B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0252b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0252b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0253b, 1)).equals(String.valueOf(xpc_fld0253b))) {
            CobolDisplay.display("FLD0253B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0253b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0253b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0254b, 1)).equals(String.valueOf(xpc_fld0254b))) {
            CobolDisplay.display("FLD0254B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0254b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0254b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0255b, 1)).equals(String.valueOf(xpc_fld0255b))) {
            CobolDisplay.display("FLD0255B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0255b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0255b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0256b, 1)).equals(String.valueOf(xpc_fld0256b))) {
            CobolDisplay.display("FLD0256B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0256b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0256b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0257b, 1)).equals(String.valueOf(xpc_fld0257b))) {
            CobolDisplay.display("FLD0257B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0257b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0257b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0258b, 1)).equals(String.valueOf(xpc_fld0258b))) {
            CobolDisplay.display("FLD0258B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0258b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0258b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0259b, 1)).equals(String.valueOf(xpc_fld0259b))) {
            CobolDisplay.display("FLD0259B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0259b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0259b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0260b, 1)).equals(String.valueOf(xpc_fld0260b))) {
            CobolDisplay.display("FLD0260B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0260b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0260b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0261b, 1)).equals(String.valueOf(xpc_fld0261b))) {
            CobolDisplay.display("FLD0261B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0261b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0261b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0262b, 1)).equals(String.valueOf(xpc_fld0262b))) {
            CobolDisplay.display("FLD0262B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0262b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0262b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0263b, 1)).equals(String.valueOf(xpc_fld0263b))) {
            CobolDisplay.display("FLD0263B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0263b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0263b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0264b, 1)).equals(String.valueOf(xpc_fld0264b))) {
            CobolDisplay.display("FLD0264B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0264b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0264b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0265b, 1)).equals(String.valueOf(xpc_fld0265b))) {
            CobolDisplay.display("FLD0265B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0265b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0265b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0266b, 1)).equals(String.valueOf(xpc_fld0266b))) {
            CobolDisplay.display("FLD0266B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0266b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0266b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0267b, 1)).equals(String.valueOf(xpc_fld0267b))) {
            CobolDisplay.display("FLD0267B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0267b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0267b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0268b, 1)).equals(String.valueOf(xpc_fld0268b))) {
            CobolDisplay.display("FLD0268B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0268b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0268b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0269b, 1)).equals(String.valueOf(xpc_fld0269b))) {
            CobolDisplay.display("FLD0269B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0269b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0269b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0270b, 1)).equals(String.valueOf(xpc_fld0270b))) {
            CobolDisplay.display("FLD0270B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0270b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0270b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0271b, 1)).equals(String.valueOf(xpc_fld0271b))) {
            CobolDisplay.display("FLD0271B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0271b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0271b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0272b, 1)).equals(String.valueOf(xpc_fld0272b))) {
            CobolDisplay.display("FLD0272B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0272b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0272b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0273b, 1)).equals(String.valueOf(xpc_fld0273b))) {
            CobolDisplay.display("FLD0273B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0273b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0273b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0274b, 1)).equals(String.valueOf(xpc_fld0274b))) {
            CobolDisplay.display("FLD0274B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0274b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0274b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0275b, 1)).equals(String.valueOf(xpc_fld0275b))) {
            CobolDisplay.display("FLD0275B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0275b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0275b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0276b, 1)).equals(String.valueOf(xpc_fld0276b))) {
            CobolDisplay.display("FLD0276B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0276b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0276b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0277b, 1)).equals(String.valueOf(xpc_fld0277b))) {
            CobolDisplay.display("FLD0277B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0277b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0277b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0278b, 1)).equals(String.valueOf(xpc_fld0278b))) {
            CobolDisplay.display("FLD0278B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0278b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0278b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0279b, 1)).equals(String.valueOf(xpc_fld0279b))) {
            CobolDisplay.display("FLD0279B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0279b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0279b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0280b, 1)).equals(String.valueOf(xpc_fld0280b))) {
            CobolDisplay.display("FLD0280B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0280b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0280b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0281b, 1)).equals(String.valueOf(xpc_fld0281b))) {
            CobolDisplay.display("FLD0281B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0281b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0281b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0282b, 1)).equals(String.valueOf(xpc_fld0282b))) {
            CobolDisplay.display("FLD0282B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0282b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0282b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0283b, 1)).equals(String.valueOf(xpc_fld0283b))) {
            CobolDisplay.display("FLD0283B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0283b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0283b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0284b, 1)).equals(String.valueOf(xpc_fld0284b))) {
            CobolDisplay.display("FLD0284B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0284b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0284b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0285b, 1)).equals(String.valueOf(xpc_fld0285b))) {
            CobolDisplay.display("FLD0285B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0285b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0285b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0286b, 1)).equals(String.valueOf(xpc_fld0286b))) {
            CobolDisplay.display("FLD0286B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0286b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0286b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0287b, 1)).equals(String.valueOf(xpc_fld0287b))) {
            CobolDisplay.display("FLD0287B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0287b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0287b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0288b, 1)).equals(String.valueOf(xpc_fld0288b))) {
            CobolDisplay.display("FLD0288B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0288b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0288b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0289b, 1)).equals(String.valueOf(xpc_fld0289b))) {
            CobolDisplay.display("FLD0289B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0289b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0289b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0290b, 1)).equals(String.valueOf(xpc_fld0290b))) {
            CobolDisplay.display("FLD0290B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0290b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0290b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0291b, 1)).equals(String.valueOf(xpc_fld0291b))) {
            CobolDisplay.display("FLD0291B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0291b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0291b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0292b, 1)).equals(String.valueOf(xpc_fld0292b))) {
            CobolDisplay.display("FLD0292B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0292b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0292b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0293b, 1)).equals(String.valueOf(xpc_fld0293b))) {
            CobolDisplay.display("FLD0293B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0293b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0293b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0294b, 1)).equals(String.valueOf(xpc_fld0294b))) {
            CobolDisplay.display("FLD0294B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0294b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0294b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0295b, 1)).equals(String.valueOf(xpc_fld0295b))) {
            CobolDisplay.display("FLD0295B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0295b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0295b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0296b, 1)).equals(String.valueOf(xpc_fld0296b))) {
            CobolDisplay.display("FLD0296B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0296b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0296b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0297b, 1)).equals(String.valueOf(xpc_fld0297b))) {
            CobolDisplay.display("FLD0297B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0297b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0297b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0298b, 1)).equals(String.valueOf(xpc_fld0298b))) {
            CobolDisplay.display("FLD0298B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0298b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0298b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0299b, 1)).equals(String.valueOf(xpc_fld0299b))) {
            CobolDisplay.display("FLD0299B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0299b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0299b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0300b, 1)).equals(String.valueOf(xpc_fld0300b))) {
            CobolDisplay.display("FLD0300B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0300b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0300b).trim()) - 1]));
        }
    }
    private void compare_part3() {
        if (!String.valueOf(CobolString.refMod(fld0301b, 1)).equals(String.valueOf(xpc_fld0301b))) {
            CobolDisplay.display("FLD0301B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0301b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0301b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0302b, 1)).equals(String.valueOf(xpc_fld0302b))) {
            CobolDisplay.display("FLD0302B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0302b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0302b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0303b, 1)).equals(String.valueOf(xpc_fld0303b))) {
            CobolDisplay.display("FLD0303B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0303b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0303b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0304b, 1)).equals(String.valueOf(xpc_fld0304b))) {
            CobolDisplay.display("FLD0304B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0304b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0304b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0305b, 1)).equals(String.valueOf(xpc_fld0305b))) {
            CobolDisplay.display("FLD0305B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0305b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0305b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0306b, 1)).equals(String.valueOf(xpc_fld0306b))) {
            CobolDisplay.display("FLD0306B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0306b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0306b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0307b, 1)).equals(String.valueOf(xpc_fld0307b))) {
            CobolDisplay.display("FLD0307B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0307b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0307b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0308b, 1)).equals(String.valueOf(xpc_fld0308b))) {
            CobolDisplay.display("FLD0308B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0308b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0308b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0309b, 1)).equals(String.valueOf(xpc_fld0309b))) {
            CobolDisplay.display("FLD0309B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0309b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0309b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0310b, 1)).equals(String.valueOf(xpc_fld0310b))) {
            CobolDisplay.display("FLD0310B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0310b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0310b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0311b, 1)).equals(String.valueOf(xpc_fld0311b))) {
            CobolDisplay.display("FLD0311B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0311b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0311b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0312b, 1)).equals(String.valueOf(xpc_fld0312b))) {
            CobolDisplay.display("FLD0312B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0312b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0312b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0313b, 1)).equals(String.valueOf(xpc_fld0313b))) {
            CobolDisplay.display("FLD0313B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0313b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0313b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0314b, 1)).equals(String.valueOf(xpc_fld0314b))) {
            CobolDisplay.display("FLD0314B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0314b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0314b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0315b, 1)).equals(String.valueOf(xpc_fld0315b))) {
            CobolDisplay.display("FLD0315B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0315b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0315b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0316b, 1)).equals(String.valueOf(xpc_fld0316b))) {
            CobolDisplay.display("FLD0316B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0316b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0316b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0317b, 1)).equals(String.valueOf(xpc_fld0317b))) {
            CobolDisplay.display("FLD0317B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0317b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0317b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0318b, 1)).equals(String.valueOf(xpc_fld0318b))) {
            CobolDisplay.display("FLD0318B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0318b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0318b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0319b, 1)).equals(String.valueOf(xpc_fld0319b))) {
            CobolDisplay.display("FLD0319B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0319b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0319b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0320b, 1)).equals(String.valueOf(xpc_fld0320b))) {
            CobolDisplay.display("FLD0320B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0320b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0320b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0321b, 1)).equals(String.valueOf(xpc_fld0321b))) {
            CobolDisplay.display("FLD0321B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0321b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0321b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0322b, 1)).equals(String.valueOf(xpc_fld0322b))) {
            CobolDisplay.display("FLD0322B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0322b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0322b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0323b, 1)).equals(String.valueOf(xpc_fld0323b))) {
            CobolDisplay.display("FLD0323B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0323b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0323b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0324b, 1)).equals(String.valueOf(xpc_fld0324b))) {
            CobolDisplay.display("FLD0324B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0324b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0324b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0325b, 1)).equals(String.valueOf(xpc_fld0325b))) {
            CobolDisplay.display("FLD0325B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0325b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0325b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0326b, 1)).equals(String.valueOf(xpc_fld0326b))) {
            CobolDisplay.display("FLD0326B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0326b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0326b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0327b, 1)).equals(String.valueOf(xpc_fld0327b))) {
            CobolDisplay.display("FLD0327B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0327b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0327b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0328b, 1)).equals(String.valueOf(xpc_fld0328b))) {
            CobolDisplay.display("FLD0328B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0328b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0328b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0329b, 1)).equals(String.valueOf(xpc_fld0329b))) {
            CobolDisplay.display("FLD0329B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0329b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0329b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0330b, 1)).equals(String.valueOf(xpc_fld0330b))) {
            CobolDisplay.display("FLD0330B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0330b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0330b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0331b, 1)).equals(String.valueOf(xpc_fld0331b))) {
            CobolDisplay.display("FLD0331B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0331b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0331b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0332b, 1)).equals(String.valueOf(xpc_fld0332b))) {
            CobolDisplay.display("FLD0332B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0332b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0332b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0333b, 1)).equals(String.valueOf(xpc_fld0333b))) {
            CobolDisplay.display("FLD0333B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0333b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0333b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0334b, 1)).equals(String.valueOf(xpc_fld0334b))) {
            CobolDisplay.display("FLD0334B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0334b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0334b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0335b, 1)).equals(String.valueOf(xpc_fld0335b))) {
            CobolDisplay.display("FLD0335B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0335b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0335b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0336b, 1)).equals(String.valueOf(xpc_fld0336b))) {
            CobolDisplay.display("FLD0336B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0336b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0336b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0337b, 1)).equals(String.valueOf(xpc_fld0337b))) {
            CobolDisplay.display("FLD0337B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0337b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0337b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0338b, 1)).equals(String.valueOf(xpc_fld0338b))) {
            CobolDisplay.display("FLD0338B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0338b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0338b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0339b, 1)).equals(String.valueOf(xpc_fld0339b))) {
            CobolDisplay.display("FLD0339B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0339b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0339b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0340b, 1)).equals(String.valueOf(xpc_fld0340b))) {
            CobolDisplay.display("FLD0340B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0340b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0340b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0341b, 1)).equals(String.valueOf(xpc_fld0341b))) {
            CobolDisplay.display("FLD0341B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0341b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0341b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0342b, 1)).equals(String.valueOf(xpc_fld0342b))) {
            CobolDisplay.display("FLD0342B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0342b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0342b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0343b, 1)).equals(String.valueOf(xpc_fld0343b))) {
            CobolDisplay.display("FLD0343B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0343b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0343b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0344b, 1)).equals(String.valueOf(xpc_fld0344b))) {
            CobolDisplay.display("FLD0344B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0344b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0344b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0345b, 1)).equals(String.valueOf(xpc_fld0345b))) {
            CobolDisplay.display("FLD0345B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0345b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0345b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0346b, 1)).equals(String.valueOf(xpc_fld0346b))) {
            CobolDisplay.display("FLD0346B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0346b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0346b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0347b, 1)).equals(String.valueOf(xpc_fld0347b))) {
            CobolDisplay.display("FLD0347B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0347b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0347b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0348b, 1)).equals(String.valueOf(xpc_fld0348b))) {
            CobolDisplay.display("FLD0348B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0348b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0348b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0349b, 1)).equals(String.valueOf(xpc_fld0349b))) {
            CobolDisplay.display("FLD0349B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0349b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0349b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0350b, 1)).equals(String.valueOf(xpc_fld0350b))) {
            CobolDisplay.display("FLD0350B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0350b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0350b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0351b, 1)).equals(String.valueOf(xpc_fld0351b))) {
            CobolDisplay.display("FLD0351B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0351b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0351b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0352b, 1)).equals(String.valueOf(xpc_fld0352b))) {
            CobolDisplay.display("FLD0352B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0352b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0352b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0353b, 1)).equals(String.valueOf(xpc_fld0353b))) {
            CobolDisplay.display("FLD0353B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0353b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0353b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0354b, 1)).equals(String.valueOf(xpc_fld0354b))) {
            CobolDisplay.display("FLD0354B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0354b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0354b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0355b, 1)).equals(String.valueOf(xpc_fld0355b))) {
            CobolDisplay.display("FLD0355B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0355b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0355b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0356b, 1)).equals(String.valueOf(xpc_fld0356b))) {
            CobolDisplay.display("FLD0356B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0356b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0356b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0357b, 1)).equals(String.valueOf(xpc_fld0357b))) {
            CobolDisplay.display("FLD0357B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0357b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0357b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0358b, 1)).equals(String.valueOf(xpc_fld0358b))) {
            CobolDisplay.display("FLD0358B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0358b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0358b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0359b, 1)).equals(String.valueOf(xpc_fld0359b))) {
            CobolDisplay.display("FLD0359B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0359b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0359b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0360b, 1)).equals(String.valueOf(xpc_fld0360b))) {
            CobolDisplay.display("FLD0360B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0360b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0360b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0361b, 1)).equals(String.valueOf(xpc_fld0361b))) {
            CobolDisplay.display("FLD0361B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0361b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0361b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0362b, 1)).equals(String.valueOf(xpc_fld0362b))) {
            CobolDisplay.display("FLD0362B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0362b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0362b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0363b, 1)).equals(String.valueOf(xpc_fld0363b))) {
            CobolDisplay.display("FLD0363B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0363b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0363b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0364b, 1)).equals(String.valueOf(xpc_fld0364b))) {
            CobolDisplay.display("FLD0364B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0364b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0364b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0365b, 1)).equals(String.valueOf(xpc_fld0365b))) {
            CobolDisplay.display("FLD0365B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0365b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0365b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0366b, 1)).equals(String.valueOf(xpc_fld0366b))) {
            CobolDisplay.display("FLD0366B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0366b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0366b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0367b, 1)).equals(String.valueOf(xpc_fld0367b))) {
            CobolDisplay.display("FLD0367B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0367b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0367b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0368b, 1)).equals(String.valueOf(xpc_fld0368b))) {
            CobolDisplay.display("FLD0368B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0368b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0368b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0369b, 1)).equals(String.valueOf(xpc_fld0369b))) {
            CobolDisplay.display("FLD0369B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0369b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0369b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0370b, 1)).equals(String.valueOf(xpc_fld0370b))) {
            CobolDisplay.display("FLD0370B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0370b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0370b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0371b, 1)).equals(String.valueOf(xpc_fld0371b))) {
            CobolDisplay.display("FLD0371B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0371b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0371b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0372b, 1)).equals(String.valueOf(xpc_fld0372b))) {
            CobolDisplay.display("FLD0372B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0372b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0372b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0373b, 1)).equals(String.valueOf(xpc_fld0373b))) {
            CobolDisplay.display("FLD0373B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0373b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0373b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0374b, 1)).equals(String.valueOf(xpc_fld0374b))) {
            CobolDisplay.display("FLD0374B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0374b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0374b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0375b, 1)).equals(String.valueOf(xpc_fld0375b))) {
            CobolDisplay.display("FLD0375B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0375b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0375b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0376b, 1)).equals(String.valueOf(xpc_fld0376b))) {
            CobolDisplay.display("FLD0376B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0376b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0376b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0377b, 1)).equals(String.valueOf(xpc_fld0377b))) {
            CobolDisplay.display("FLD0377B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0377b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0377b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0378b, 1)).equals(String.valueOf(xpc_fld0378b))) {
            CobolDisplay.display("FLD0378B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0378b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0378b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0379b, 1)).equals(String.valueOf(xpc_fld0379b))) {
            CobolDisplay.display("FLD0379B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0379b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0379b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0380b, 1)).equals(String.valueOf(xpc_fld0380b))) {
            CobolDisplay.display("FLD0380B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0380b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0380b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0381b, 1)).equals(String.valueOf(xpc_fld0381b))) {
            CobolDisplay.display("FLD0381B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0381b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0381b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0382b, 1)).equals(String.valueOf(xpc_fld0382b))) {
            CobolDisplay.display("FLD0382B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0382b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0382b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0383b, 1)).equals(String.valueOf(xpc_fld0383b))) {
            CobolDisplay.display("FLD0383B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0383b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0383b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0384b, 1)).equals(String.valueOf(xpc_fld0384b))) {
            CobolDisplay.display("FLD0384B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0384b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0384b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0385b, 1)).equals(String.valueOf(xpc_fld0385b))) {
            CobolDisplay.display("FLD0385B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0385b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0385b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0386b, 1)).equals(String.valueOf(xpc_fld0386b))) {
            CobolDisplay.display("FLD0386B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0386b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0386b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0387b, 1)).equals(String.valueOf(xpc_fld0387b))) {
            CobolDisplay.display("FLD0387B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0387b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0387b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0388b, 1)).equals(String.valueOf(xpc_fld0388b))) {
            CobolDisplay.display("FLD0388B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0388b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0388b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0389b, 1)).equals(String.valueOf(xpc_fld0389b))) {
            CobolDisplay.display("FLD0389B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0389b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0389b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0390b, 1)).equals(String.valueOf(xpc_fld0390b))) {
            CobolDisplay.display("FLD0390B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0390b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0390b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0391b, 1)).equals(String.valueOf(xpc_fld0391b))) {
            CobolDisplay.display("FLD0391B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0391b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0391b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0392b, 1)).equals(String.valueOf(xpc_fld0392b))) {
            CobolDisplay.display("FLD0392B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0392b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0392b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0393b, 1)).equals(String.valueOf(xpc_fld0393b))) {
            CobolDisplay.display("FLD0393B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0393b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0393b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0394b, 1)).equals(String.valueOf(xpc_fld0394b))) {
            CobolDisplay.display("FLD0394B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0394b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0394b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0395b, 1)).equals(String.valueOf(xpc_fld0395b))) {
            CobolDisplay.display("FLD0395B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0395b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0395b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0396b, 1)).equals(String.valueOf(xpc_fld0396b))) {
            CobolDisplay.display("FLD0396B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0396b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0396b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0397b, 1)).equals(String.valueOf(xpc_fld0397b))) {
            CobolDisplay.display("FLD0397B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0397b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0397b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0398b, 1)).equals(String.valueOf(xpc_fld0398b))) {
            CobolDisplay.display("FLD0398B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0398b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0398b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0399b, 1)).equals(String.valueOf(xpc_fld0399b))) {
            CobolDisplay.display("FLD0399B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0399b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0399b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0400b, 1)).equals(String.valueOf(xpc_fld0400b))) {
            CobolDisplay.display("FLD0400B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0400b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0400b).trim()) - 1]));
        }
    }
    private void compare_part4() {
        if (!String.valueOf(CobolString.refMod(fld0401b, 1)).equals(String.valueOf(xpc_fld0401b))) {
            CobolDisplay.display("FLD0401B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0401b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0401b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0402b, 1)).equals(String.valueOf(xpc_fld0402b))) {
            CobolDisplay.display("FLD0402B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0402b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0402b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0403b, 1)).equals(String.valueOf(xpc_fld0403b))) {
            CobolDisplay.display("FLD0403B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0403b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0403b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0404b, 1)).equals(String.valueOf(xpc_fld0404b))) {
            CobolDisplay.display("FLD0404B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0404b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0404b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0405b, 1)).equals(String.valueOf(xpc_fld0405b))) {
            CobolDisplay.display("FLD0405B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0405b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0405b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0406b, 1)).equals(String.valueOf(xpc_fld0406b))) {
            CobolDisplay.display("FLD0406B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0406b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0406b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0407b, 1)).equals(String.valueOf(xpc_fld0407b))) {
            CobolDisplay.display("FLD0407B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0407b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0407b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0408b, 1)).equals(String.valueOf(xpc_fld0408b))) {
            CobolDisplay.display("FLD0408B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0408b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0408b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0409b, 1)).equals(String.valueOf(xpc_fld0409b))) {
            CobolDisplay.display("FLD0409B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0409b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0409b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0410b, 1)).equals(String.valueOf(xpc_fld0410b))) {
            CobolDisplay.display("FLD0410B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0410b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0410b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0411b, 1)).equals(String.valueOf(xpc_fld0411b))) {
            CobolDisplay.display("FLD0411B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0411b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0411b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0412b, 1)).equals(String.valueOf(xpc_fld0412b))) {
            CobolDisplay.display("FLD0412B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0412b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0412b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0413b, 1)).equals(String.valueOf(xpc_fld0413b))) {
            CobolDisplay.display("FLD0413B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0413b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0413b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0414b, 1)).equals(String.valueOf(xpc_fld0414b))) {
            CobolDisplay.display("FLD0414B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0414b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0414b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0415b, 1)).equals(String.valueOf(xpc_fld0415b))) {
            CobolDisplay.display("FLD0415B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0415b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0415b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0416b, 1)).equals(String.valueOf(xpc_fld0416b))) {
            CobolDisplay.display("FLD0416B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0416b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0416b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0417b, 1)).equals(String.valueOf(xpc_fld0417b))) {
            CobolDisplay.display("FLD0417B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0417b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0417b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0418b, 1)).equals(String.valueOf(xpc_fld0418b))) {
            CobolDisplay.display("FLD0418B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0418b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0418b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0419b, 1)).equals(String.valueOf(xpc_fld0419b))) {
            CobolDisplay.display("FLD0419B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0419b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0419b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0420b, 1)).equals(String.valueOf(xpc_fld0420b))) {
            CobolDisplay.display("FLD0420B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0420b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0420b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0421b, 1)).equals(String.valueOf(xpc_fld0421b))) {
            CobolDisplay.display("FLD0421B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0421b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0421b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0422b, 1)).equals(String.valueOf(xpc_fld0422b))) {
            CobolDisplay.display("FLD0422B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0422b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0422b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0423b, 1)).equals(String.valueOf(xpc_fld0423b))) {
            CobolDisplay.display("FLD0423B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0423b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0423b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0424b, 1)).equals(String.valueOf(xpc_fld0424b))) {
            CobolDisplay.display("FLD0424B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0424b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0424b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0425b, 1)).equals(String.valueOf(xpc_fld0425b))) {
            CobolDisplay.display("FLD0425B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0425b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0425b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0426b, 1)).equals(String.valueOf(xpc_fld0426b))) {
            CobolDisplay.display("FLD0426B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0426b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0426b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0427b, 1)).equals(String.valueOf(xpc_fld0427b))) {
            CobolDisplay.display("FLD0427B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0427b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0427b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0428b, 1)).equals(String.valueOf(xpc_fld0428b))) {
            CobolDisplay.display("FLD0428B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0428b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0428b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0429b, 1)).equals(String.valueOf(xpc_fld0429b))) {
            CobolDisplay.display("FLD0429B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0429b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0429b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0430b, 1)).equals(String.valueOf(xpc_fld0430b))) {
            CobolDisplay.display("FLD0430B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0430b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0430b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0431b, 1)).equals(String.valueOf(xpc_fld0431b))) {
            CobolDisplay.display("FLD0431B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0431b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0431b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0432b, 1)).equals(String.valueOf(xpc_fld0432b))) {
            CobolDisplay.display("FLD0432B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0432b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0432b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0433b, 1)).equals(String.valueOf(xpc_fld0433b))) {
            CobolDisplay.display("FLD0433B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0433b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0433b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0434b, 1)).equals(String.valueOf(xpc_fld0434b))) {
            CobolDisplay.display("FLD0434B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0434b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0434b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0435b, 1)).equals(String.valueOf(xpc_fld0435b))) {
            CobolDisplay.display("FLD0435B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0435b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0435b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0436b, 1)).equals(String.valueOf(xpc_fld0436b))) {
            CobolDisplay.display("FLD0436B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0436b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0436b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0437b, 1)).equals(String.valueOf(xpc_fld0437b))) {
            CobolDisplay.display("FLD0437B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0437b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0437b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0438b, 1)).equals(String.valueOf(xpc_fld0438b))) {
            CobolDisplay.display("FLD0438B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0438b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0438b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0439b, 1)).equals(String.valueOf(xpc_fld0439b))) {
            CobolDisplay.display("FLD0439B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0439b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0439b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0440b, 1)).equals(String.valueOf(xpc_fld0440b))) {
            CobolDisplay.display("FLD0440B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0440b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0440b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0441b, 1)).equals(String.valueOf(xpc_fld0441b))) {
            CobolDisplay.display("FLD0441B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0441b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0441b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0442b, 1)).equals(String.valueOf(xpc_fld0442b))) {
            CobolDisplay.display("FLD0442B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0442b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0442b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0443b, 1)).equals(String.valueOf(xpc_fld0443b))) {
            CobolDisplay.display("FLD0443B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0443b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0443b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0444b, 1)).equals(String.valueOf(xpc_fld0444b))) {
            CobolDisplay.display("FLD0444B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0444b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0444b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0445b, 1)).equals(String.valueOf(xpc_fld0445b))) {
            CobolDisplay.display("FLD0445B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0445b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0445b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0446b, 1)).equals(String.valueOf(xpc_fld0446b))) {
            CobolDisplay.display("FLD0446B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0446b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0446b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0447b, 1)).equals(String.valueOf(xpc_fld0447b))) {
            CobolDisplay.display("FLD0447B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0447b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0447b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0448b, 1)).equals(String.valueOf(xpc_fld0448b))) {
            CobolDisplay.display("FLD0448B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0448b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0448b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0449b, 1)).equals(String.valueOf(xpc_fld0449b))) {
            CobolDisplay.display("FLD0449B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0449b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0449b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0450b, 1)).equals(String.valueOf(xpc_fld0450b))) {
            CobolDisplay.display("FLD0450B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0450b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0450b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0451b, 1)).equals(String.valueOf(xpc_fld0451b))) {
            CobolDisplay.display("FLD0451B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0451b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0451b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0452b, 1)).equals(String.valueOf(xpc_fld0452b))) {
            CobolDisplay.display("FLD0452B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0452b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0452b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0453b, 1)).equals(String.valueOf(xpc_fld0453b))) {
            CobolDisplay.display("FLD0453B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0453b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0453b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0454b, 1)).equals(String.valueOf(xpc_fld0454b))) {
            CobolDisplay.display("FLD0454B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0454b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0454b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0455b, 1)).equals(String.valueOf(xpc_fld0455b))) {
            CobolDisplay.display("FLD0455B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0455b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0455b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0456b, 1)).equals(String.valueOf(xpc_fld0456b))) {
            CobolDisplay.display("FLD0456B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0456b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0456b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0457b, 1)).equals(String.valueOf(xpc_fld0457b))) {
            CobolDisplay.display("FLD0457B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0457b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0457b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0458b, 1)).equals(String.valueOf(xpc_fld0458b))) {
            CobolDisplay.display("FLD0458B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0458b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0458b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0459b, 1)).equals(String.valueOf(xpc_fld0459b))) {
            CobolDisplay.display("FLD0459B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0459b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0459b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0460b, 1)).equals(String.valueOf(xpc_fld0460b))) {
            CobolDisplay.display("FLD0460B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0460b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0460b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0461b, 1)).equals(String.valueOf(xpc_fld0461b))) {
            CobolDisplay.display("FLD0461B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0461b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0461b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0462b, 1)).equals(String.valueOf(xpc_fld0462b))) {
            CobolDisplay.display("FLD0462B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0462b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0462b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0463b, 1)).equals(String.valueOf(xpc_fld0463b))) {
            CobolDisplay.display("FLD0463B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0463b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0463b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0464b, 1)).equals(String.valueOf(xpc_fld0464b))) {
            CobolDisplay.display("FLD0464B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0464b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0464b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0465b, 1)).equals(String.valueOf(xpc_fld0465b))) {
            CobolDisplay.display("FLD0465B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0465b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0465b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0466b, 1)).equals(String.valueOf(xpc_fld0466b))) {
            CobolDisplay.display("FLD0466B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0466b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0466b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0467b, 1)).equals(String.valueOf(xpc_fld0467b))) {
            CobolDisplay.display("FLD0467B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0467b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0467b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0468b, 1)).equals(String.valueOf(xpc_fld0468b))) {
            CobolDisplay.display("FLD0468B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0468b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0468b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0469b, 1)).equals(String.valueOf(xpc_fld0469b))) {
            CobolDisplay.display("FLD0469B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0469b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0469b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0470b, 1)).equals(String.valueOf(xpc_fld0470b))) {
            CobolDisplay.display("FLD0470B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0470b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0470b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0471b, 1)).equals(String.valueOf(xpc_fld0471b))) {
            CobolDisplay.display("FLD0471B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0471b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0471b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0472b, 1)).equals(String.valueOf(xpc_fld0472b))) {
            CobolDisplay.display("FLD0472B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0472b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0472b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0473b, 1)).equals(String.valueOf(xpc_fld0473b))) {
            CobolDisplay.display("FLD0473B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0473b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0473b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0474b, 1)).equals(String.valueOf(xpc_fld0474b))) {
            CobolDisplay.display("FLD0474B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0474b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0474b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0475b, 1)).equals(String.valueOf(xpc_fld0475b))) {
            CobolDisplay.display("FLD0475B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0475b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0475b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0476b, 1)).equals(String.valueOf(xpc_fld0476b))) {
            CobolDisplay.display("FLD0476B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0476b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0476b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0477b, 1)).equals(String.valueOf(xpc_fld0477b))) {
            CobolDisplay.display("FLD0477B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0477b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0477b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0478b, 1)).equals(String.valueOf(xpc_fld0478b))) {
            CobolDisplay.display("FLD0478B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0478b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0478b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0479b, 1)).equals(String.valueOf(xpc_fld0479b))) {
            CobolDisplay.display("FLD0479B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0479b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0479b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0480b, 1)).equals(String.valueOf(xpc_fld0480b))) {
            CobolDisplay.display("FLD0480B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0480b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0480b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0481b, 1)).equals(String.valueOf(xpc_fld0481b))) {
            CobolDisplay.display("FLD0481B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0481b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0481b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0482b, 1)).equals(String.valueOf(xpc_fld0482b))) {
            CobolDisplay.display("FLD0482B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0482b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0482b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0483b, 1)).equals(String.valueOf(xpc_fld0483b))) {
            CobolDisplay.display("FLD0483B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0483b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0483b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0484b, 1)).equals(String.valueOf(xpc_fld0484b))) {
            CobolDisplay.display("FLD0484B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0484b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0484b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0485b, 1)).equals(String.valueOf(xpc_fld0485b))) {
            CobolDisplay.display("FLD0485B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0485b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0485b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0486b, 1)).equals(String.valueOf(xpc_fld0486b))) {
            CobolDisplay.display("FLD0486B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0486b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0486b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0487b, 1)).equals(String.valueOf(xpc_fld0487b))) {
            CobolDisplay.display("FLD0487B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0487b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0487b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0488b, 1)).equals(String.valueOf(xpc_fld0488b))) {
            CobolDisplay.display("FLD0488B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0488b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0488b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0489b, 1)).equals(String.valueOf(xpc_fld0489b))) {
            CobolDisplay.display("FLD0489B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0489b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0489b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0490b, 1)).equals(String.valueOf(xpc_fld0490b))) {
            CobolDisplay.display("FLD0490B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0490b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0490b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0491b, 1)).equals(String.valueOf(xpc_fld0491b))) {
            CobolDisplay.display("FLD0491B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0491b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0491b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0492b, 1)).equals(String.valueOf(xpc_fld0492b))) {
            CobolDisplay.display("FLD0492B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0492b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0492b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0493b, 1)).equals(String.valueOf(xpc_fld0493b))) {
            CobolDisplay.display("FLD0493B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0493b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0493b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0494b, 1)).equals(String.valueOf(xpc_fld0494b))) {
            CobolDisplay.display("FLD0494B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0494b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0494b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0495b, 1)).equals(String.valueOf(xpc_fld0495b))) {
            CobolDisplay.display("FLD0495B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0495b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0495b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0496b, 1)).equals(String.valueOf(xpc_fld0496b))) {
            CobolDisplay.display("FLD0496B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0496b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0496b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0497b, 1)).equals(String.valueOf(xpc_fld0497b))) {
            CobolDisplay.display("FLD0497B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0497b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0497b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0498b, 1)).equals(String.valueOf(xpc_fld0498b))) {
            CobolDisplay.display("FLD0498B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0498b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0498b).trim()) - 1]));
        }
        if (!String.valueOf(CobolString.refMod(fld0499b, 1)).equals(String.valueOf(xpc_fld0499b))) {
            CobolDisplay.display("FLD0499B ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(fld0499b).trim()) - 1]));
            CobolDisplay.display("EXPECTED ==> " + String.valueOf(hex_of[Integer.parseInt(String.valueOf(xpc_fld0499b).trim()) - 1]));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked021BcdAddAndSubtractAllRoundedModes().run();
    }
}
