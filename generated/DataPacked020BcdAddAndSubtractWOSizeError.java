package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked020BcdAddAndSubtractWOSizeError extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "PDTESTNR";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private BigDecimal fld0001a = new BigDecimal("72210483.5706116943150334464");
    private BigDecimal fld0001b = new BigDecimal("0");
    private CobolString fld0001e = new CobolString(1, "N");
    private BigDecimal fld0002a = new BigDecimal("83954.98773698940597753903603006");
    private BigDecimal fld0002b = new BigDecimal("85526.912891598327881581553810974");
    private CobolString fld0002e = new CobolString(1, "N");
    private BigDecimal fld0003a = new BigDecimal("0");
    private BigDecimal fld0003b = new BigDecimal("4976916625.40136914");
    private CobolString fld0003e = new CobolString(1, "N");
    private BigDecimal fld0004a = new BigDecimal("31348416.669");
    private BigDecimal fld0004b = new BigDecimal("16799.5");
    private CobolString fld0004e = new CobolString(1, "N");
    private BigDecimal fld0005a = new BigDecimal("2337334.8");
    private BigDecimal fld0005b = new BigDecimal("324331791.973");
    private CobolString fld0005e = new CobolString(1, "N");
    private BigDecimal fld0006a = new BigDecimal("1169");
    private BigDecimal fld0006b = new BigDecimal("912.5850054312464321171205483551602");
    private CobolString fld0006e = new CobolString(1, "N");
    private BigDecimal fld0007a = new BigDecimal("1123");
    private BigDecimal fld0007b = new BigDecimal("-27032151.91");
    private CobolString fld0007e = new CobolString(1, "N");
    private BigDecimal fld0008a = new BigDecimal("0");
    private BigDecimal fld0008b = new BigDecimal("-91");
    private CobolString fld0008e = new CobolString(1, "N");
    private BigDecimal fld0009a = new BigDecimal("4695987895.4491957");
    private BigDecimal fld0009b = new BigDecimal("87164.4396861416259625343627703841");
    private CobolString fld0009e = new CobolString(1, "N");
    private BigDecimal fld0010a = new BigDecimal("932.59120224122482589734772773226723");
    private BigDecimal fld0010b = new BigDecimal("401314086.816856");
    private CobolString fld0010e = new CobolString(1, "N");
    private BigDecimal fld0011a = new BigDecimal("356168291.4830");
    private BigDecimal fld0011b = new BigDecimal("8869.25340695890795927880390081554");
    private CobolString fld0011e = new CobolString(1, "N");
    private BigDecimal fld0012a = new BigDecimal("87");
    private BigDecimal fld0012b = new BigDecimal("71485769.2486604356929547066");
    private CobolString fld0012e = new CobolString(1, "N");
    private BigDecimal fld0013a = new BigDecimal("829630.0004717120923913853403064");
    private BigDecimal fld0013b = new BigDecimal("2497013.60");
    private CobolString fld0013e = new CobolString(1, "N");
    private BigDecimal fld0014a = new BigDecimal("592943121.2490873237541");
    private BigDecimal fld0014b = new BigDecimal("186764.7");
    private CobolString fld0014e = new CobolString(1, "N");
    private BigDecimal fld0015a = new BigDecimal("7984732.71412134533164817185024");
    private BigDecimal fld0015b = new BigDecimal("4953047329.19498391");
    private CobolString fld0015e = new CobolString(1, "N");
    private BigDecimal fld0016a = new BigDecimal("87275.9557853607148558694461826235");
    private BigDecimal fld0016b = new BigDecimal("4316165362.791636");
    private CobolString fld0016e = new CobolString(1, "N");
    private BigDecimal fld0017a = new BigDecimal("0");
    private BigDecimal fld0017b = new BigDecimal("8983.341087204116393039043941826093");
    private CobolString fld0017e = new CobolString(1, "N");
    private BigDecimal fld0018a = new BigDecimal("7619026.805277494540646898713");
    private BigDecimal fld0018b = new BigDecimal("0");
    private CobolString fld0018e = new CobolString(1, "N");
    private BigDecimal fld0019a = new BigDecimal("-4930528885.68236813");
    private BigDecimal fld0019b = new BigDecimal("402620216.542097");
    private CobolString fld0019e = new CobolString(1, "N");
    private BigDecimal fld0020a = new BigDecimal("643887452.720044328735582");
    private BigDecimal fld0020b = new BigDecimal("552340679.26366126055");
    private CobolString fld0020e = new CobolString(1, "N");
    private BigDecimal fld0021a = new BigDecimal("9.880441680787707126043528660375159233");
    private BigDecimal fld0021b = new BigDecimal("0");
    private CobolString fld0021e = new CobolString(1, "N");
    private BigDecimal fld0022a = new BigDecimal("810040.192546636172998830716096");
    private BigDecimal fld0022b = new BigDecimal("7610660.641468062204140210269");
    private CobolString fld0022e = new CobolString(1, "N");
    private BigDecimal fld0023a = new BigDecimal("6");
    private BigDecimal fld0023b = new BigDecimal("95.1865432391802879230624512274516746");
    private CobolString fld0023e = new CobolString(1, "N");
    private BigDecimal fld0024a = new BigDecimal("329406009.124");
    private BigDecimal fld0024b = new BigDecimal("410668612.232476");
    private CobolString fld0024e = new CobolString(1, "N");
    private BigDecimal fld0025a = new BigDecimal("0");
    private BigDecimal fld0025b = new BigDecimal("2497488.27");
    private CobolString fld0025e = new CobolString(1, "N");
    private BigDecimal fld0026a = new BigDecimal("0");
    private BigDecimal fld0026b = new BigDecimal("-383757196.20564");
    private CobolString fld0026e = new CobolString(1, "N");
    private BigDecimal fld0027a = new BigDecimal("601026867.0937520818498");
    private BigDecimal fld0027b = new BigDecimal("815849.1045356750515082921992870");
    private CobolString fld0027e = new CobolString(1, "N");
    private BigDecimal fld0028a = new BigDecimal("8794.72782911061568000832266989164");
    private BigDecimal fld0028b = new BigDecimal("0");
    private CobolString fld0028e = new CobolString(1, "N");
    private BigDecimal fld0029a = new BigDecimal("13697");
    private BigDecimal fld0029b = new BigDecimal("684374480.18294422258378517");
    private CobolString fld0029e = new CobolString(1, "N");
    private BigDecimal fld0030a = new BigDecimal("0");
    private BigDecimal fld0030b = new BigDecimal("70264210.169553353857452293");
    private CobolString fld0030e = new CobolString(1, "N");
    private BigDecimal fld0031a = new BigDecimal("0");
    private BigDecimal fld0031b = new BigDecimal("70450280.588407820925311852");
    private CobolString fld0031e = new CobolString(1, "N");
    private BigDecimal fld0032a = new BigDecimal("5269599769.4606222516");
    private BigDecimal fld0032b = new BigDecimal("322379197.669");
    private CobolString fld0032e = new CobolString(1, "N");
    private BigDecimal fld0033a = new BigDecimal("641903038.069859710468278");
    private BigDecimal fld0033b = new BigDecimal("318353502.142");
    private CobolString fld0033e = new CobolString(1, "N");
    private BigDecimal fld0034a = new BigDecimal("-5");
    private BigDecimal fld0034b = new BigDecimal("2126766.9");
    private CobolString fld0034e = new CobolString(1, "N");
    private BigDecimal fld0035a = new BigDecimal("816285.5924199176049782522568420");
    private BigDecimal fld0035b = new BigDecimal("2276316.1");
    private CobolString fld0035e = new CobolString(1, "N");
    private BigDecimal fld0036a = new BigDecimal("9.789384107274801127829277902492322027");
    private BigDecimal fld0036b = new BigDecimal("84790.535447228665422159110676147");
    private CobolString fld0036e = new CobolString(1, "N");
    private BigDecimal fld0037a = new BigDecimal("5559560836.79804091701");
    private BigDecimal fld0037b = new BigDecimal("-15352");
    private CobolString fld0037e = new CobolString(1, "N");
    private BigDecimal fld0038a = new BigDecimal("95.5897506417712539139586169767426326");
    private BigDecimal fld0038b = new BigDecimal("819342.2486726212872198971126636");
    private CobolString fld0038e = new CobolString(1, "N");
    private BigDecimal fld0039a = new BigDecimal("8933.20399454893721014059337903745");
    private BigDecimal fld0039b = new BigDecimal("205344.3");
    private CobolString fld0039e = new CobolString(1, "N");
    private BigDecimal fld0040a = new BigDecimal("-162227");
    private BigDecimal fld0040b = new BigDecimal("101");
    private CobolString fld0040e = new CobolString(1, "N");
    private BigDecimal fld0041a = new BigDecimal("687709210.19485042879892944");
    private BigDecimal fld0041b = new BigDecimal("5032246021.307608119");
    private CobolString fld0041e = new CobolString(1, "N");
    private BigDecimal fld0042a = new BigDecimal("7680734.5400734650109342283030");
    private BigDecimal fld0042b = new BigDecimal("5398987461.4943655917");
    private CobolString fld0042e = new CobolString(1, "N");
    private BigDecimal fld0043a = new BigDecimal("-28038049.48");
    private BigDecimal fld0043b = new BigDecimal("9102.051349475740460448491830902639");
    private CobolString fld0043e = new CobolString(1, "N");
    private BigDecimal fld0044a = new BigDecimal("206224.3");
    private BigDecimal fld0044b = new BigDecimal("359534215.7883");
    private CobolString fld0044e = new CobolString(1, "N");
    private BigDecimal fld0045a = new BigDecimal("28592495.81");
    private BigDecimal fld0045b = new BigDecimal("377058873.76830");
    private CobolString fld0045e = new CobolString(1, "N");
    private BigDecimal fld0046a = new BigDecimal("0");
    private BigDecimal fld0046b = new BigDecimal("86000.025910646182847330010190489");
    private CobolString fld0046e = new CobolString(1, "N");
    private BigDecimal fld0047a = new BigDecimal("26966592.97");
    private BigDecimal fld0047b = new BigDecimal("4982239515.90845814");
    private CobolString fld0047e = new CobolString(1, "N");
    private BigDecimal fld0048a = new BigDecimal("83962.84254838164429202151950448");
    private BigDecimal fld0048b = new BigDecimal("-17309.9");
    private CobolString fld0048e = new CobolString(1, "N");
    private BigDecimal fld0049a = new BigDecimal("677621907.0336453320635428");
    private BigDecimal fld0049b = new BigDecimal("9.784571866912429305429554915463086217");
    private CobolString fld0049e = new CobolString(1, "N");
    private BigDecimal fld0050a = new BigDecimal("329667670.988");
    private BigDecimal fld0050b = new BigDecimal("408790070.710566");
    private CobolString fld0050e = new CobolString(1, "N");
    private BigDecimal fld0051a = new BigDecimal("643375703.689413991348544");
    private BigDecimal fld0051b = new BigDecimal("9064.871948640588206203005938732530");
    private CobolString fld0051e = new CobolString(1, "N");
    private BigDecimal fld0052a = new BigDecimal("367200483.8576");
    private BigDecimal fld0052b = new BigDecimal("550990476.15163754265");
    private CobolString fld0052e = new CobolString(1, "N");
    private BigDecimal fld0053a = new BigDecimal("2260324.6");
    private BigDecimal fld0053b = new BigDecimal("-361176713.4701");
    private CobolString fld0053e = new CobolString(1, "N");
    private BigDecimal fld0054a = new BigDecimal("0");
    private BigDecimal fld0054b = new BigDecimal("319288758.232");
    private CobolString fld0054e = new CobolString(1, "N");
    private BigDecimal fld0055a = new BigDecimal("622232417.66982828604426");
    private BigDecimal fld0055b = new BigDecimal("68254498.02012105715576240");
    private CobolString fld0055e = new CobolString(1, "N");
    private BigDecimal fld0056a = new BigDecimal("2161993.9");
    private BigDecimal fld0056b = new BigDecimal("27806089.73");
    private CobolString fld0056e = new CobolString(1, "N");
    private BigDecimal fld0057a = new BigDecimal("929.20878243011406638629523513372987");
    private BigDecimal fld0057b = new BigDecimal("-6");
    private CobolString fld0057e = new CobolString(1, "N");
    private BigDecimal fld0058a = new BigDecimal("96.6574119281082611010447180888149887");
    private BigDecimal fld0058b = new BigDecimal("343623662.0368");
    private CobolString fld0058e = new CobolString(1, "N");
    private BigDecimal fld0059a = new BigDecimal("2566438.61");
    private BigDecimal fld0059b = new BigDecimal("625762300.58564874525472");
    private CobolString fld0059e = new CobolString(1, "N");
    private BigDecimal fld0060a = new BigDecimal("9.888752946983269120906356874911580234");
    private BigDecimal fld0060b = new BigDecimal("159150");
    private CobolString fld0060e = new CobolString(1, "N");
    private BigDecimal fld0061a = new BigDecimal("95");
    private BigDecimal fld0061b = new BigDecimal("816564.2123096498172785118185856");
    private CobolString fld0061e = new CobolString(1, "N");
    private BigDecimal fld0062a = new BigDecimal("5579259193.81647705819");
    private BigDecimal fld0062b = new BigDecimal("602304146.8914084317631");
    private CobolString fld0062e = new CobolString(1, "N");
    private BigDecimal fld0063a = new BigDecimal("2106925.6");
    private BigDecimal fld0063b = new BigDecimal("73193550.7264897311507922950");
    private CobolString fld0063e = new CobolString(1, "N");
    private BigDecimal fld0064a = new BigDecimal("828553.1635867423583263757791428");
    private BigDecimal fld0064b = new BigDecimal("1113");
    private CobolString fld0064e = new CobolString(1, "N");
    private BigDecimal fld0065a = new BigDecimal("26934154.73");
    private BigDecimal fld0065b = new BigDecimal("1223");
    private CobolString fld0065e = new CobolString(1, "N");
    private BigDecimal fld0066a = new BigDecimal("0");
    private BigDecimal fld0066b = new BigDecimal("85085.260849998822774153950376785");
    private CobolString fld0066e = new CobolString(1, "N");
    private BigDecimal fld0067a = new BigDecimal("-91");
    private BigDecimal fld0067b = new BigDecimal("0");
    private CobolString fld0067e = new CobolString(1, "N");
    private BigDecimal fld0068a = new BigDecimal("838055.6814082209537986045688739");
    private BigDecimal fld0068b = new BigDecimal("0");
    private CobolString fld0068e = new CobolString(1, "N");
    private BigDecimal fld0069a = new BigDecimal("4880885916.76487937");
    private BigDecimal fld0069b = new BigDecimal("97");
    private CobolString fld0069e = new CobolString(1, "N");
    private BigDecimal fld0070a = new BigDecimal("69654747.914044090606466852");
    private BigDecimal fld0070b = new BigDecimal("-192591.5");
    private CobolString fld0070e = new CobolString(1, "N");
    private BigDecimal fld0071a = new BigDecimal("5");
    private BigDecimal fld0071b = new BigDecimal("1269");
    private CobolString fld0071e = new CobolString(1, "N");
    private BigDecimal fld0072a = new BigDecimal("9.925387953744267965916492357791867107");
    private BigDecimal fld0072b = new BigDecimal("655377323.717403204028641");
    private CobolString fld0072e = new CobolString(1, "N");
    private BigDecimal fld0073a = new BigDecimal("9.812328554525302504174533169134519994");
    private BigDecimal fld0073b = new BigDecimal("70717230.890474991333860543");
    private CobolString fld0073e = new CobolString(1, "N");
    private BigDecimal fld0074a = new BigDecimal("925.84903592679257400277492706663906");
    private BigDecimal fld0074b = new BigDecimal("9.839916331263631743553332853480242192");
    private CobolString fld0074e = new CobolString(1, "N");
    private BigDecimal fld0075a = new BigDecimal("5446083738.8683014381");
    private BigDecimal fld0075b = new BigDecimal("2205661.8");
    private CobolString fld0075e = new CobolString(1, "N");
    private BigDecimal fld0076a = new BigDecimal("2412584.18");
    private BigDecimal fld0076b = new BigDecimal("95.1877730461857529675739897356834262");
    private CobolString fld0076e = new CobolString(1, "N");
    private BigDecimal fld0077a = new BigDecimal("4971042025.86989840");
    private BigDecimal fld0077b = new BigDecimal("87747.7884783979700245026833727024");
    private CobolString fld0077e = new CobolString(1, "N");
    private BigDecimal fld0078a = new BigDecimal("186044.2");
    private BigDecimal fld0078b = new BigDecimal("5264094377.6727222580");
    private CobolString fld0078e = new CobolString(1, "N");
    private BigDecimal fld0079a = new BigDecimal("638119223.314542294289708");
    private BigDecimal fld0079b = new BigDecimal("101");
    private CobolString fld0079e = new CobolString(1, "N");
    private BigDecimal fld0080a = new BigDecimal("7905587.67133311302011122734256");
    private BigDecimal fld0080b = new BigDecimal("-363247849.5626");
    private CobolString fld0080e = new CobolString(1, "N");
    private BigDecimal fld0081a = new BigDecimal("9.951308658902108250643436804239172488");
    private BigDecimal fld0081b = new BigDecimal("367206952.3371");
    private CobolString fld0081e = new CobolString(1, "N");
    private BigDecimal fld0082a = new BigDecimal("-26324419.10");
    private BigDecimal fld0082b = new BigDecimal("7666475.1738066827524420432382");
    private CobolString fld0082e = new CobolString(1, "N");
    private BigDecimal fld0083a = new BigDecimal("631384121.39469823891602");
    private BigDecimal fld0083b = new BigDecimal("-2518657.33");
    private CobolString fld0083e = new CobolString(1, "N");
    private BigDecimal fld0084a = new BigDecimal("8913.08379718931953483718189090723");
    private BigDecimal fld0084b = new BigDecimal("405118244.918866");
    private CobolString fld0084e = new CobolString(1, "N");
    private BigDecimal fld0085a = new BigDecimal("15779");
    private BigDecimal fld0085b = new BigDecimal("4354227755.611629");
    private CobolString fld0085e = new CobolString(1, "N");
    private BigDecimal fld0086a = new BigDecimal("9.766547774737049936177868403319735080");
    private BigDecimal fld0086b = new BigDecimal("5711670223.78104349833");
    private CobolString fld0086e = new CobolString(1, "N");
    private BigDecimal fld0087a = new BigDecimal("617158605.01368802193411");
    private BigDecimal fld0087b = new BigDecimal("1168");
    private CobolString fld0087e = new CobolString(1, "N");
    private BigDecimal fld0088a = new BigDecimal("5809468198.000283800652");
    private BigDecimal fld0088b = new BigDecimal("327927843.481");
    private CobolString fld0088e = new CobolString(1, "N");
    private BigDecimal fld0089a = new BigDecimal("802942.222446262787727278009697");
    private BigDecimal fld0089b = new BigDecimal("913.0556640200002682661306607769802");
    private CobolString fld0089e = new CobolString(1, "N");
    private BigDecimal fld0090a = new BigDecimal("-28271627.31");
    private BigDecimal fld0090b = new BigDecimal("-29023436.992");
    private CobolString fld0090e = new CobolString(1, "N");
    private BigDecimal fld0091a = new BigDecimal("438808038.0901770");
    private BigDecimal fld0091b = new BigDecimal("69809163.794725925811235356");
    private CobolString fld0091e = new CobolString(1, "N");
    private BigDecimal fld0092a = new BigDecimal("+2146587.0");
    private BigDecimal fld0092b = new BigDecimal("828676.9901534452031910404912196");
    private CobolString fld0092e = new CobolString(1, "N");
    private BigDecimal fld0093a = new BigDecimal("831848.6927757260396276706160278");
    private BigDecimal fld0093b = new BigDecimal("7909193.25337388512409120266966");
    private CobolString fld0093e = new CobolString(1, "N");
    private BigDecimal fld0094a = new BigDecimal("2260698.5");
    private BigDecimal fld0094b = new BigDecimal("5308926344.5354850645");
    private CobolString fld0094e = new CobolString(1, "N");
    private BigDecimal fld0095a = new BigDecimal("7681159.7607563408818265315858");
    private BigDecimal fld0095b = new BigDecimal("835614.2190518044410296738533361");
    private CobolString fld0095e = new CobolString(1, "N");
    private BigDecimal fld0096a = new BigDecimal("0");
    private BigDecimal fld0096b = new BigDecimal("87505.3049076218392166026660561328");
    private CobolString fld0096e = new CobolString(1, "N");
    private BigDecimal fld0097a = new BigDecimal("85");
    private BigDecimal fld0097b = new BigDecimal("7663819.4132902548449948199049");
    private CobolString fld0097e = new CobolString(1, "N");
    private BigDecimal fld0098a = new BigDecimal("87637.1310136299430659789777564583");
    private BigDecimal fld0098b = new BigDecimal("33500668.0379");
    private CobolString fld0098e = new CobolString(1, "N");
    private BigDecimal fld0099a = new BigDecimal("-4946809917.70565292");
    private BigDecimal fld0099b = new BigDecimal("30007106.715");
    private CobolString fld0099e = new CobolString(1, "N");
    private BigDecimal fld0100a = new BigDecimal("5148281813.288457797");
    private BigDecimal fld0100b = new BigDecimal("609442213.66168171982735");
    private CobolString fld0100e = new CobolString(1, "N");
    private BigDecimal fld0101a = new BigDecimal("-2605358.58");
    private BigDecimal fld0101b = new BigDecimal("-2515761.93");
    private CobolString fld0101e = new CobolString(1, "N");
    private BigDecimal fld0102a = new BigDecimal("13880");
    private BigDecimal fld0102b = new BigDecimal("626009568.32775289662151");
    private CobolString fld0102e = new CobolString(1, "N");
    private BigDecimal fld0103a = new BigDecimal("929.51599988912647631877916865050792");
    private BigDecimal fld0103b = new BigDecimal("0");
    private CobolString fld0103e = new CobolString(1, "N");
    private BigDecimal fld0104a = new BigDecimal("2254306.3");
    private BigDecimal fld0104b = new BigDecimal("-4810300752.02174334");
    private CobolString fld0104e = new CobolString(1, "N");
    private BigDecimal fld0105a = new BigDecimal("-29081388.428");
    private BigDecimal fld0105b = new BigDecimal("27558698.77");
    private CobolString fld0105e = new CobolString(1, "N");
    private BigDecimal fld0106a = new BigDecimal("-7");
    private BigDecimal fld0106b = new BigDecimal("-26362185.29");
    private CobolString fld0106e = new CobolString(1, "N");
    private BigDecimal fld0107a = new BigDecimal("677462443.7557797973497031");
    private BigDecimal fld0107b = new BigDecimal("71705910.5997380985542122289");
    private CobolString fld0107e = new CobolString(1, "N");
    private BigDecimal fld0108a = new BigDecimal("610210882.31341436003418");
    private BigDecimal fld0108b = new BigDecimal("-28421053.19");
    private CobolString fld0108e = new CobolString(1, "N");
    private BigDecimal fld0109a = new BigDecimal("1136");
    private BigDecimal fld0109b = new BigDecimal("9020.720262660837374113498299266211");
    private CobolString fld0109e = new CobolString(1, "N");
    private BigDecimal fld0110a = new BigDecimal("7940109.55673497886841971649118");
    private BigDecimal fld0110b = new BigDecimal("69721135.284383173313926818");
    private CobolString fld0110e = new CobolString(1, "N");
    private BigDecimal fld0111a = new BigDecimal("326472185.831");
    private BigDecimal fld0111b = new BigDecimal("5255901748.964217912");
    private CobolString fld0111e = new CobolString(1, "N");
    private BigDecimal fld0112a = new BigDecimal("71238052.4624002697819946661");
    private BigDecimal fld0112b = new BigDecimal("-27133920.74");
    private CobolString fld0112e = new CobolString(1, "N");
    private BigDecimal fld0113a = new BigDecimal("9092.566324157485002643852567416615");
    private BigDecimal fld0113b = new BigDecimal("1277");
    private CobolString fld0113e = new CobolString(1, "N");
    private BigDecimal fld0114a = new BigDecimal("437805064.1539988");
    private BigDecimal fld0114b = new BigDecimal("17667.3");
    private CobolString fld0114e = new CobolString(1, "N");
    private BigDecimal fld0115a = new BigDecimal("96.2362934933669089687668929400388151");
    private BigDecimal fld0115b = new BigDecimal("30236682.408");
    private CobolString fld0115e = new CobolString(1, "N");
    private BigDecimal fld0116a = new BigDecimal("7646463.4359510952332783517704");
    private BigDecimal fld0116b = new BigDecimal("0");
    private CobolString fld0116e = new CobolString(1, "N");
    private BigDecimal fld0117a = new BigDecimal("617509561.34001855346582");
    private BigDecimal fld0117b = new BigDecimal("13612");
    private CobolString fld0117e = new CobolString(1, "N");
    private BigDecimal fld0118a = new BigDecimal("5408402726.5490597358");
    private BigDecimal fld0118b = new BigDecimal("-80");
    private CobolString fld0118e = new CobolString(1, "N");
    private BigDecimal fld0119a = new BigDecimal("30078875.458");
    private BigDecimal fld0119b = new BigDecimal("2460449.05");
    private CobolString fld0119e = new CobolString(1, "N");
    private BigDecimal fld0120a = new BigDecimal("830160.1137616416714593015058198");
    private BigDecimal fld0120b = new BigDecimal("-7");
    private CobolString fld0120e = new CobolString(1, "N");
    private BigDecimal fld0121a = new BigDecimal("2338292.2");
    private BigDecimal fld0121b = new BigDecimal("320991974.822");
    private CobolString fld0121e = new CobolString(1, "N");
    private BigDecimal fld0122a = new BigDecimal("-184951.8");
    private BigDecimal fld0122b = new BigDecimal("26752619.72");
    private CobolString fld0122e = new CobolString(1, "N");
    private BigDecimal fld0123a = new BigDecimal("-5");
    private BigDecimal fld0123b = new BigDecimal("7502027.502690824523057244732");
    private CobolString fld0123e = new CobolString(1, "N");
    private BigDecimal fld0124a = new BigDecimal("0");
    private BigDecimal fld0124b = new BigDecimal("4223876720.963152");
    private CobolString fld0124e = new CobolString(1, "N");
    private BigDecimal fld0125a = new BigDecimal("8800.31826789913984576685379579430");
    private BigDecimal fld0125b = new BigDecimal("637787216.045794358443288");
    private CobolString fld0125e = new CobolString(1, "N");
    private BigDecimal fld0126a = new BigDecimal("807990.071015203703552742808824");
    private BigDecimal fld0126b = new BigDecimal("2285688.0");
    private CobolString fld0126e = new CobolString(1, "N");
    private BigDecimal fld0127a = new BigDecimal("8981.860178820127993404298649693373");
    private BigDecimal fld0127b = new BigDecimal("87878.0390073648609572387613297905");
    private CobolString fld0127e = new CobolString(1, "N");
    private BigDecimal fld0128a = new BigDecimal("4298489587.591516");
    private BigDecimal fld0128b = new BigDecimal("26904320.50");
    private CobolString fld0128e = new CobolString(1, "N");
    private BigDecimal fld0129a = new BigDecimal("33460508.1048");
    private BigDecimal fld0129b = new BigDecimal("629564859.51748508700376");
    private CobolString fld0129e = new CobolString(1, "N");
    private BigDecimal fld0130a = new BigDecimal("0");
    private BigDecimal fld0130b = new BigDecimal("30500681.275");
    private CobolString fld0130e = new CobolString(1, "N");
    private BigDecimal fld0131a = new BigDecimal("26916210.05");
    private BigDecimal fld0131b = new BigDecimal("70626515.642831921848454612");
    private CobolString fld0131e = new CobolString(1, "N");
    private BigDecimal fld0132a = new BigDecimal("1270");
    private BigDecimal fld0132b = new BigDecimal("2163498.7");
    private CobolString fld0132e = new CobolString(1, "N");
    private BigDecimal fld0133a = new BigDecimal("9.890353542063604619372085835493635386");
    private BigDecimal fld0133b = new BigDecimal("-2528421.98");
    private CobolString fld0133e = new CobolString(1, "N");
    private BigDecimal fld0134a = new BigDecimal("70385499.741438917187252855");
    private BigDecimal fld0134b = new BigDecimal("673960062.4739148226893803");
    private CobolString fld0134e = new CobolString(1, "N");
    private BigDecimal fld0135a = new BigDecimal("4678335500.0128495");
    private BigDecimal fld0135b = new BigDecimal("2561321.97");
    private CobolString fld0135e = new CobolString(1, "N");
    private BigDecimal fld0136a = new BigDecimal("-15169");
    private BigDecimal fld0136b = new BigDecimal("72091249.9695820607747975827");
    private CobolString fld0136e = new CobolString(1, "N");
    private BigDecimal fld0137a = new BigDecimal("-27190319.39");
    private BigDecimal fld0137b = new BigDecimal("921.23024961283406231160597599227912");
    private CobolString fld0137e = new CobolString(1, "N");
    private BigDecimal fld0138a = new BigDecimal("-4824223828.94490853");
    private BigDecimal fld0138b = new BigDecimal("8976.142294415691003095503219810780");
    private CobolString fld0138e = new CobolString(1, "N");
    private BigDecimal fld0139a = new BigDecimal("319644653.394");
    private BigDecimal fld0139b = new BigDecimal("818318.3537620841718762676464393");
    private CobolString fld0139e = new CobolString(1, "N");
    private BigDecimal fld0140a = new BigDecimal("0");
    private BigDecimal fld0140b = new BigDecimal("913.4502802484925076953459210926666");
    private CobolString fld0140e = new CobolString(1, "N");
    private BigDecimal fld0141a = new BigDecimal("612266512.11346116987499");
    private BigDecimal fld0141b = new BigDecimal("198046.5");
    private CobolString fld0141e = new CobolString(1, "N");
    private BigDecimal fld0142a = new BigDecimal("356201246.7531");
    private BigDecimal fld0142b = new BigDecimal("1134");
    private CobolString fld0142e = new CobolString(1, "N");
    private BigDecimal fld0143a = new BigDecimal("-2608987.15");
    private BigDecimal fld0143b = new BigDecimal("205887.8");
    private CobolString fld0143e = new CobolString(1, "N");
    private BigDecimal fld0144a = new BigDecimal("5664625691.64754570216");
    private BigDecimal fld0144b = new BigDecimal("2170292.3");
    private CobolString fld0144e = new CobolString(1, "N");
    private BigDecimal fld0145a = new BigDecimal("592809780.4295365813587");
    private BigDecimal fld0145b = new BigDecimal("416669902.306984");
    private CobolString fld0145e = new CobolString(1, "N");
    private BigDecimal fld0146a = new BigDecimal("-91");
    private BigDecimal fld0146b = new BigDecimal("592675280.7490164309811");
    private CobolString fld0146e = new CobolString(1, "N");
    private BigDecimal fld0147a = new BigDecimal("85");
    private BigDecimal fld0147b = new BigDecimal("3974420340.21838");
    private CobolString fld0147e = new CobolString(1, "N");
    private BigDecimal fld0148a = new BigDecimal("1189");
    private BigDecimal fld0148b = new BigDecimal("33583306.9980");
    private CobolString fld0148e = new CobolString(1, "N");
    private BigDecimal fld0149a = new BigDecimal("86469.811002464236349140946913394");
    private BigDecimal fld0149b = new BigDecimal("-5");
    private CobolString fld0149e = new CobolString(1, "N");
    private BigDecimal fld0150a = new BigDecimal("-6");
    private BigDecimal fld0150b = new BigDecimal("9.779789481524289174174668914929497987");
    private CobolString fld0150e = new CobolString(1, "N");
    private BigDecimal fld0151a = new BigDecimal("602633749.4884196344102");
    private BigDecimal fld0151b = new BigDecimal("7715228.5011189425389943608024");
    private CobolString fld0151e = new CobolString(1, "N");
    private BigDecimal fld0152a = new BigDecimal("-28005400.65");
    private BigDecimal fld0152b = new BigDecimal("96.9689035330467796747200281970435753");
    private CobolString fld0152e = new CobolString(1, "N");
    private BigDecimal fld0153a = new BigDecimal("69246387.672994647033419823");
    private BigDecimal fld0153b = new BigDecimal("7700147.9845998110906890588012");
    private CobolString fld0153e = new CobolString(1, "N");
    private BigDecimal fld0154a = new BigDecimal("618531644.61004783714059");
    private BigDecimal fld0154b = new BigDecimal("4667533939.9326892");
    private CobolString fld0154e = new CobolString(1, "N");
    private BigDecimal fld0155a = new BigDecimal("5816028861.286740569980");
    private BigDecimal fld0155b = new BigDecimal("920.9824083062539967770021576143335");
    private CobolString fld0155e = new CobolString(1, "N");
    private BigDecimal fld0156a = new BigDecimal("95.3830714078202746009083057288080453");
    private BigDecimal fld0156b = new BigDecimal("9080.971133779824899789900882751680");
    private CobolString fld0156e = new CobolString(1, "N");
    private BigDecimal fld0157a = new BigDecimal("659745695.0483697735165833");
    private BigDecimal fld0157b = new BigDecimal("4359875032.276696");
    private CobolString fld0157e = new CobolString(1, "N");
    private BigDecimal fld0158a = new BigDecimal("412656981.234114");
    private BigDecimal fld0158b = new BigDecimal("611832243.66474420197192");
    private CobolString fld0158e = new CobolString(1, "N");
    private BigDecimal fld0159a = new BigDecimal("0");
    private BigDecimal fld0159b = new BigDecimal("643529357.674236912600918");
    private CobolString fld0159e = new CobolString(1, "N");
    private BigDecimal fld0160a = new BigDecimal("74656107.83998073429756914265");
    private BigDecimal fld0160b = new BigDecimal("207077.8");
    private CobolString fld0160e = new CobolString(1, "N");
    private BigDecimal fld0161a = new BigDecimal("7887170.9741627593626134284932");
    private BigDecimal fld0161b = new BigDecimal("71702582.3615881408024108623");
    private CobolString fld0161e = new CobolString(1, "N");
    private BigDecimal fld0162a = new BigDecimal("-7");
    private BigDecimal fld0162b = new BigDecimal("5668143857.58160899086");
    private CobolString fld0162e = new CobolString(1, "N");
    private BigDecimal fld0163a = new BigDecimal("618392824.19829444403802");
    private BigDecimal fld0163b = new BigDecimal("650815786.826470232817598");
    private CobolString fld0163e = new CobolString(1, "N");
    private BigDecimal fld0164a = new BigDecimal("204076.7");
    private BigDecimal fld0164b = new BigDecimal("1076");
    private CobolString fld0164e = new CobolString(1, "N");
    private BigDecimal fld0165a = new BigDecimal("610409164.63927785695631");
    private BigDecimal fld0165b = new BigDecimal("1267");
    private CobolString fld0165e = new CobolString(1, "N");
    private BigDecimal fld0166a = new BigDecimal("2460589.98");
    private BigDecimal fld0166b = new BigDecimal("17630.0");
    private CobolString fld0166e = new CobolString(1, "N");
    private BigDecimal fld0167a = new BigDecimal("323253458.962");
    private BigDecimal fld0167b = new BigDecimal("838285.1322478405142746282763255");
    private CobolString fld0167e = new CobolString(1, "N");
    private BigDecimal fld0168a = new BigDecimal("1200");
    private BigDecimal fld0168b = new BigDecimal("4326937205.661665");
    private CobolString fld0168e = new CobolString(1, "N");
    private BigDecimal fld0169a = new BigDecimal("834885.7368063762329768451309064");
    private BigDecimal fld0169b = new BigDecimal("70699865.109667991980302304");
    private CobolString fld0169e = new CobolString(1, "N");
    private BigDecimal fld0170a = new BigDecimal("72325482.4666709539293663056");
    private BigDecimal fld0170b = new BigDecimal("9.863493423765207213094186045054811984");
    private CobolString fld0170e = new CobolString(1, "N");
    private BigDecimal fld0171a = new BigDecimal("675345293.4675296948086042");
    private BigDecimal fld0171b = new BigDecimal("4258478422.558273");
    private CobolString fld0171e = new CobolString(1, "N");
    private BigDecimal fld0172a = new BigDecimal("96.0216523360032936373897882731398567");
    private BigDecimal fld0172b = new BigDecimal("8999.798406174591702821885519369971");
    private CobolString fld0172e = new CobolString(1, "N");
    private BigDecimal fld0173a = new BigDecimal("412472914.336663");
    private BigDecimal fld0173b = new BigDecimal("4786981213.45750904");
    private CobolString fld0173e = new CobolString(1, "N");
    private BigDecimal fld0174a = new BigDecimal("1244");
    private BigDecimal fld0174b = new BigDecimal("5152586737.087611057");
    private CobolString fld0174e = new CobolString(1, "N");
    private BigDecimal fld0175a = new BigDecimal("13456");
    private BigDecimal fld0175b = new BigDecimal("-5");
    private CobolString fld0175e = new CobolString(1, "N");
    private BigDecimal fld0176a = new BigDecimal("7902178.74582138546379894705751");
    private BigDecimal fld0176b = new BigDecimal("29797398.003");
    private CobolString fld0176e = new CobolString(1, "N");
    private BigDecimal fld0177a = new BigDecimal("7618839.577049143496623173632");
    private BigDecimal fld0177b = new BigDecimal("2373414.07");
    private CobolString fld0177e = new CobolString(1, "N");
    private BigDecimal fld0178a = new BigDecimal("355502105.3348");
    private BigDecimal fld0178b = new BigDecimal("31397739.222");
    private CobolString fld0178e = new CobolString(1, "N");
    private BigDecimal fld0179a = new BigDecimal("388560564.63472");
    private BigDecimal fld0179b = new BigDecimal("99");
    private CobolString fld0179e = new CobolString(1, "N");
    private BigDecimal fld0180a = new BigDecimal("85946.157652659294079455776227405");
    private BigDecimal fld0180b = new BigDecimal("5435189439.3573940700");
    private CobolString fld0180e = new CobolString(1, "N");
    private BigDecimal fld0181a = new BigDecimal("188908.8");
    private BigDecimal fld0181b = new BigDecimal("-4740924741.33910868");
    private CobolString fld0181e = new CobolString(1, "N");
    private BigDecimal fld0182a = new BigDecimal("6061401860.3468300394609");
    private BigDecimal fld0182b = new BigDecimal("643493508.008180281620980");
    private CobolString fld0182e = new CobolString(1, "N");
    private BigDecimal fld0183a = new BigDecimal("7910108.10526126539876656806882");
    private BigDecimal fld0183b = new BigDecimal("-5");
    private CobolString fld0183e = new CobolString(1, "N");
    private BigDecimal fld0184a = new BigDecimal("635945742.812533687526865");
    private BigDecimal fld0184b = new BigDecimal("2343773.6");
    private CobolString fld0184e = new CobolString(1, "N");
    private BigDecimal fld0185a = new BigDecimal("15666");
    private BigDecimal fld0185b = new BigDecimal("73935660.38753716096465495866");
    private CobolString fld0185e = new CobolString(1, "N");
    private BigDecimal fld0186a = new BigDecimal("7");
    private BigDecimal fld0186b = new BigDecimal("84084.08947119312415452441200613");
    private CobolString fld0186e = new CobolString(1, "N");
    private BigDecimal fld0187a = new BigDecimal("604672028.7423602568921");
    private BigDecimal fld0187b = new BigDecimal("5893278013.192120301511");
    private CobolString fld0187e = new CobolString(1, "N");
    private BigDecimal fld0188a = new BigDecimal("68008236.87569536035724127");
    private BigDecimal fld0188b = new BigDecimal("7537078.198448752264226868646");
    private CobolString fld0188e = new CobolString(1, "N");
    private BigDecimal fld0189a = new BigDecimal("5115071016.238050827");
    private BigDecimal fld0189b = new BigDecimal("5668524677.20726727051");
    private CobolString fld0189e = new CobolString(1, "N");
    private BigDecimal fld0190a = new BigDecimal("2382137.54");
    private BigDecimal fld0190b = new BigDecimal("627148648.94273569806415");
    private CobolString fld0190e = new CobolString(1, "N");
    private BigDecimal fld0191a = new BigDecimal("13720");
    private BigDecimal fld0191b = new BigDecimal("803717.168989411478996487403492");
    private CobolString fld0191e = new CobolString(1, "N");
    private BigDecimal fld0192a = new BigDecimal("9.894259454195439840162862310535274446");
    private BigDecimal fld0192b = new BigDecimal("358034239.3955");
    private CobolString fld0192e = new CobolString(1, "N");
    private BigDecimal fld0193a = new BigDecimal("4252943677.090519");
    private BigDecimal fld0193b = new BigDecimal("612048644.17243076690766");
    private CobolString fld0193e = new CobolString(1, "N");
    private BigDecimal fld0194a = new BigDecimal("417168379.939779");
    private BigDecimal fld0194b = new BigDecimal("634454032.998696626499679");
    private CobolString fld0194e = new CobolString(1, "N");
    private BigDecimal fld0195a = new BigDecimal("26645846.45");
    private BigDecimal fld0195b = new BigDecimal("14921");
    private CobolString fld0195e = new CobolString(1, "N");
    private BigDecimal fld0196a = new BigDecimal("0");
    private BigDecimal fld0196b = new BigDecimal("-18000.7");
    private CobolString fld0196e = new CobolString(1, "N");
    private BigDecimal fld0197a = new BigDecimal("9.847788375924405590566834689525421708");
    private BigDecimal fld0197b = new BigDecimal("5");
    private CobolString fld0197e = new CobolString(1, "N");
    private BigDecimal fld0198a = new BigDecimal("593293108.5591157671643");
    private BigDecimal fld0198b = new BigDecimal("14072");
    private CobolString fld0198e = new CobolString(1, "N");
    private BigDecimal fld0199a = new BigDecimal("2483287.24");
    private BigDecimal fld0199b = new BigDecimal("7969040.17410605347571106449322");
    private CobolString fld0199e = new CobolString(1, "N");
    private BigDecimal fld0200a = new BigDecimal("-4935972790.60619176");
    private BigDecimal fld0200b = new BigDecimal("4582475224.7206340");
    private CobolString fld0200e = new CobolString(1, "N");
    private BigDecimal fld0201a = new BigDecimal("1282");
    private BigDecimal fld0201b = new BigDecimal("7926313.90444417882612526682351");
    private CobolString fld0201e = new CobolString(1, "N");
    private BigDecimal fld0202a = new BigDecimal("-360603443.7503");
    private BigDecimal fld0202b = new BigDecimal("935.68197555010013122256395945441909");
    private CobolString fld0202e = new CobolString(1, "N");
    private BigDecimal fld0203a = new BigDecimal("628607663.38264040253847");
    private BigDecimal fld0203b = new BigDecimal("920.1886012491730104656539879215415");
    private CobolString fld0203e = new CobolString(1, "N");
    private BigDecimal fld0204a = new BigDecimal("9.73054030732718233664968465745914727");
    private BigDecimal fld0204b = new BigDecimal("2363275.3");
    private CobolString fld0204e = new CobolString(1, "N");
    private BigDecimal fld0205a = new BigDecimal("648926914.508991536933990");
    private BigDecimal fld0205b = new BigDecimal("639814213.238647178094709");
    private CobolString fld0205e = new CobolString(1, "N");
    private BigDecimal fld0206a = new BigDecimal("186967.7");
    private BigDecimal fld0206b = new BigDecimal("70826356.466434425840361654");
    private CobolString fld0206e = new CobolString(1, "N");
    private BigDecimal fld0207a = new BigDecimal("83944.39242287422553445708217623");
    private BigDecimal fld0207b = new BigDecimal("7607846.993308088334728722657");
    private CobolString fld0207e = new CobolString(1, "N");
    private BigDecimal fld0208a = new BigDecimal("96.7940040016311842308027735271025449");
    private BigDecimal fld0208b = new BigDecimal("2151595.4");
    private CobolString fld0208e = new CobolString(1, "N");
    private BigDecimal fld0209a = new BigDecimal("926.61149050802726900855077474261634");
    private BigDecimal fld0209b = new BigDecimal("7951784.48263920700789242346218");
    private CobolString fld0209e = new CobolString(1, "N");
    private BigDecimal fld0210a = new BigDecimal("72323528.1456575562764044207");
    private BigDecimal fld0210b = new BigDecimal("0");
    private CobolString fld0210e = new CobolString(1, "N");
    private BigDecimal fld0211a = new BigDecimal("0");
    private BigDecimal fld0211b = new BigDecimal("442113770.7554604");
    private CobolString fld0211e = new CobolString(1, "N");
    private BigDecimal fld0212a = new BigDecimal("4892032792.55731038");
    private BigDecimal fld0212b = new BigDecimal("-372935567.70682");
    private CobolString fld0212e = new CobolString(1, "N");
    private BigDecimal fld0213a = new BigDecimal("-82");
    private BigDecimal fld0213b = new BigDecimal("7525721.770631302875997903356");
    private CobolString fld0213e = new CobolString(1, "N");
    private BigDecimal fld0214a = new BigDecimal("0");
    private BigDecimal fld0214b = new BigDecimal("666893270.4655321508369070");
    private CobolString fld0214e = new CobolString(1, "N");
    private BigDecimal fld0215a = new BigDecimal("926.34033699271633999217101518297567");
    private BigDecimal fld0215b = new BigDecimal("-18226.5");
    private CobolString fld0215e = new CobolString(1, "N");
    private BigDecimal fld0216a = new BigDecimal("-28095374.87");
    private BigDecimal fld0216b = new BigDecimal("28541793.87");
    private CobolString fld0216e = new CobolString(1, "N");
    private BigDecimal fld0217a = new BigDecimal("74562962.48658396130792880285");
    private BigDecimal fld0217b = new BigDecimal("444563659.0422049");
    private CobolString fld0217e = new CobolString(1, "N");
    private BigDecimal fld0218a = new BigDecimal("-18094.6");
    private BigDecimal fld0218b = new BigDecimal("9.867255193327033602201936446363106369");
    private CobolString fld0218e = new CobolString(1, "N");
    private BigDecimal fld0219a = new BigDecimal("578788992.127507229135");
    private BigDecimal fld0219b = new BigDecimal("5297903516.0907261836");
    private CobolString fld0219e = new CobolString(1, "N");
    private BigDecimal fld0220a = new BigDecimal("573343525.907533679841");
    private BigDecimal fld0220b = new BigDecimal("14161");
    private CobolString fld0220e = new CobolString(1, "N");
    private BigDecimal fld0221a = new BigDecimal("0");
    private BigDecimal fld0221b = new BigDecimal("8789.10367794605407176788958167890");
    private CobolString fld0221e = new CobolString(1, "N");
    private BigDecimal fld0222a = new BigDecimal("628182805.25174396977661");
    private BigDecimal fld0222b = new BigDecimal("-15228");
    private CobolString fld0222e = new CobolString(1, "N");
    private BigDecimal fld0223a = new BigDecimal("0");
    private BigDecimal fld0223b = new BigDecimal("69950927.082806102497158917");
    private CobolString fld0223e = new CobolString(1, "N");
    private BigDecimal fld0224a = new BigDecimal("838187.2267509891116787912324070");
    private BigDecimal fld0224b = new BigDecimal("-382169497.04991");
    private CobolString fld0224e = new CobolString(1, "N");
    private BigDecimal fld0225a = new BigDecimal("13797");
    private BigDecimal fld0225b = new BigDecimal("572598612.808938978169");
    private CobolString fld0225e = new CobolString(1, "N");
    private BigDecimal fld0226a = new BigDecimal("14900");
    private BigDecimal fld0226b = new BigDecimal("2129995.4");
    private CobolString fld0226e = new CobolString(1, "N");
    private BigDecimal fld0227a = new BigDecimal("629583055.15940859997670");
    private BigDecimal fld0227b = new BigDecimal("8983.577034983017961522477889957372");
    private CobolString fld0227e = new CobolString(1, "N");
    private BigDecimal fld0228a = new BigDecimal("2225916.3");
    private BigDecimal fld0228b = new BigDecimal("9.739690596877397243957830141880549490");
    private CobolString fld0228e = new CobolString(1, "N");
    private BigDecimal fld0229a = new BigDecimal("9.870473603260505601753038718015886843");
    private BigDecimal fld0229b = new BigDecimal("73838029.76208535540081356884");
    private CobolString fld0229e = new CobolString(1, "N");
    private BigDecimal fld0230a = new BigDecimal("201492.2");
    private BigDecimal fld0230b = new BigDecimal("-6");
    private CobolString fld0230e = new CobolString(1, "N");
    private BigDecimal fld0231a = new BigDecimal("87781.6812716511907233041256404248");
    private BigDecimal fld0231b = new BigDecimal("-27182116.43");
    private CobolString fld0231e = new CobolString(1, "N");
    private BigDecimal fld0232a = new BigDecimal("356308264.5328");
    private BigDecimal fld0232b = new BigDecimal("833280.3014261945806495646138500");
    private CobolString fld0232e = new CobolString(1, "N");
    private BigDecimal fld0233a = new BigDecimal("7552156.809035388551620826547");
    private BigDecimal fld0233b = new BigDecimal("33739768.3403");
    private CobolString fld0233e = new CobolString(1, "N");
    private BigDecimal fld0234a = new BigDecimal("33831052.6754");
    private BigDecimal fld0234b = new BigDecimal("593899144.9424572133253");
    private CobolString fld0234e = new CobolString(1, "N");
    private BigDecimal fld0235a = new BigDecimal("14123");
    private BigDecimal fld0235b = new BigDecimal("-4808329310.19295639");
    private CobolString fld0235e = new CobolString(1, "N");
    private BigDecimal fld0236a = new BigDecimal("8818.23528289915170574886360554955");
    private BigDecimal fld0236b = new BigDecimal("70480160.116860446350983693");
    private CobolString fld0236e = new CobolString(1, "N");
    private BigDecimal fld0237a = new BigDecimal("28742037.59");
    private BigDecimal fld0237b = new BigDecimal("8850.90488581330880890618573175743");
    private CobolString fld0237e = new CobolString(1, "N");
    private BigDecimal fld0238a = new BigDecimal("634521096.430120334908053");
    private BigDecimal fld0238b = new BigDecimal("198396.3");
    private CobolString fld0238e = new CobolString(1, "N");
    private BigDecimal fld0239a = new BigDecimal("678585779.2924817610824561");
    private BigDecimal fld0239b = new BigDecimal("614739880.97122655993587");
    private CobolString fld0239e = new CobolString(1, "N");
    private BigDecimal fld0240a = new BigDecimal("4289853576.446766");
    private BigDecimal fld0240b = new BigDecimal("833165.4817075836438888813972880");
    private CobolString fld0240e = new CobolString(1, "N");
    private BigDecimal fld0241a = new BigDecimal("14407");
    private BigDecimal fld0241b = new BigDecimal("608742950.23205993171444");
    private CobolString fld0241e = new CobolString(1, "N");
    private BigDecimal fld0242a = new BigDecimal("5860383854.989427154791");
    private BigDecimal fld0242b = new BigDecimal("201770.8");
    private CobolString fld0242e = new CobolString(1, "N");
    private BigDecimal fld0243a = new BigDecimal("97.0409660969254295181940506154205650");
    private BigDecimal fld0243b = new BigDecimal("86928.4847432245544318618613033322");
    private CobolString fld0243e = new CobolString(1, "N");
    private BigDecimal fld0244a = new BigDecimal("0");
    private BigDecimal fld0244b = new BigDecimal("596454149.7067354924865");
    private CobolString fld0244e = new CobolString(1, "N");
    private BigDecimal fld0245a = new BigDecimal("-371716886.14542");
    private BigDecimal fld0245b = new BigDecimal("636050719.355519267317333");
    private CobolString fld0245e = new CobolString(1, "N");
    private BigDecimal fld0246a = new BigDecimal("87216.9313623637143528810611314838");
    private BigDecimal fld0246b = new BigDecimal("208199.5");
    private CobolString fld0246e = new CobolString(1, "N");
    private BigDecimal fld0247a = new BigDecimal("834494.8214770686600871840710169");
    private BigDecimal fld0247b = new BigDecimal("73372232.8570783122181353519");
    private CobolString fld0247e = new CobolString(1, "N");
    private BigDecimal fld0248a = new BigDecimal("8885.56418584546814365410227765096");
    private BigDecimal fld0248b = new BigDecimal("5683594830.11341870550");
    private CobolString fld0248e = new CobolString(1, "N");
    private BigDecimal fld0249a = new BigDecimal("678470839.5950102000071524");
    private BigDecimal fld0249b = new BigDecimal("673175418.3146980707874718");
    private CobolString fld0249e = new CobolString(1, "N");
    private BigDecimal fld0250a = new BigDecimal("643468324.926731005675151");
    private BigDecimal fld0250b = new BigDecimal("9057.675398841628089385835664870683");
    private CobolString fld0250e = new CobolString(1, "N");
    private BigDecimal fld0251a = new BigDecimal("402548910.007195");
    private BigDecimal fld0251b = new BigDecimal("830149.1080513825338016431487631");
    private CobolString fld0251e = new CobolString(1, "N");
    private BigDecimal fld0252a = new BigDecimal("-18339.3");
    private BigDecimal fld0252b = new BigDecimal("2343087.3");
    private CobolString fld0252e = new CobolString(1, "N");
    private BigDecimal fld0253a = new BigDecimal("822593.8518184680026124055984837");
    private BigDecimal fld0253b = new BigDecimal("2159897.7");
    private CobolString fld0253e = new CobolString(1, "N");
    private BigDecimal fld0254a = new BigDecimal("5401895692.3872574193");
    private BigDecimal fld0254b = new BigDecimal("2405256.16");
    private CobolString fld0254e = new CobolString(1, "N");
    private BigDecimal fld0255a = new BigDecimal("94.8299297085154591080424779647728428");
    private BigDecimal fld0255b = new BigDecimal("5408143412.7739858030");
    private CobolString fld0255e = new CobolString(1, "N");
    private BigDecimal fld0256a = new BigDecimal("-473179644.06591722");
    private BigDecimal fld0256b = new BigDecimal("9107.434804383051085707734273455571");
    private CobolString fld0256e = new CobolString(1, "N");
    private BigDecimal fld0257a = new BigDecimal("577029491.737192756772");
    private BigDecimal fld0257b = new BigDecimal("-84");
    private CobolString fld0257e = new CobolString(1, "N");
    private BigDecimal fld0258a = new BigDecimal("5908893351.960881057394");
    private BigDecimal fld0258b = new BigDecimal("84978.202175808337237583600654033");
    private CobolString fld0258e = new CobolString(1, "N");
    private BigDecimal fld0259a = new BigDecimal("937.55337057593879368511124994256533");
    private BigDecimal fld0259b = new BigDecimal("-374669242.27931");
    private CobolString fld0259e = new CobolString(1, "N");
    private BigDecimal fld0260a = new BigDecimal("86648.984966754782899300835197209");
    private BigDecimal fld0260b = new BigDecimal("601823310.0433563187436");
    private CobolString fld0260e = new CobolString(1, "N");
    private BigDecimal fld0261a = new BigDecimal("-374213925.47904");
    private BigDecimal fld0261b = new BigDecimal("379885544.06227");
    private CobolString fld0261e = new CobolString(1, "N");
    private BigDecimal fld0262a = new BigDecimal("-17015.9");
    private BigDecimal fld0262b = new BigDecimal("687559565.36759821329241049");
    private CobolString fld0262e = new CobolString(1, "N");
    private BigDecimal fld0263a = new BigDecimal("84046.29767805690265802809335582");
    private BigDecimal fld0263b = new BigDecimal("-6");
    private CobolString fld0263e = new CobolString(1, "N");
    private BigDecimal fld0264a = new BigDecimal("935.78568596491340514376133796758949");
    private BigDecimal fld0264b = new BigDecimal("17620.4");
    private CobolString fld0264e = new CobolString(1, "N");
    private BigDecimal fld0265a = new BigDecimal("-380334582.15301");
    private BigDecimal fld0265b = new BigDecimal("9.854231270822284560750858872779645025");
    private CobolString fld0265e = new CobolString(1, "N");
    private BigDecimal fld0266a = new BigDecimal("84707.693570856212872399737534578");
    private BigDecimal fld0266b = new BigDecimal("96.1883348354436562566149859776487573");
    private CobolString fld0266e = new CobolString(1, "N");
    private BigDecimal fld0267a = new BigDecimal("87");
    private BigDecimal fld0267b = new BigDecimal("2348814.4");
    private CobolString fld0267e = new CobolString(1, "N");
    private BigDecimal fld0268a = new BigDecimal("0");
    private BigDecimal fld0268b = new BigDecimal("821150.0957830146774085733341053");
    private CobolString fld0268e = new CobolString(1, "N");
    private BigDecimal fld0269a = new BigDecimal("69955495.182247551255727557");
    private BigDecimal fld0269b = new BigDecimal("0");
    private CobolString fld0269e = new CobolString(1, "N");
    private BigDecimal fld0270a = new BigDecimal("69584936.933990082508216801");
    private BigDecimal fld0270b = new BigDecimal("1200");
    private CobolString fld0270e = new CobolString(1, "N");
    private BigDecimal fld0271a = new BigDecimal("4478155927.4435323");
    private BigDecimal fld0271b = new BigDecimal("2371664.59");
    private CobolString fld0271e = new CobolString(1, "N");
    private BigDecimal fld0272a = new BigDecimal("411514667.070764");
    private BigDecimal fld0272b = new BigDecimal("-4748492295.95657285");
    private CobolString fld0272e = new CobolString(1, "N");
    private BigDecimal fld0273a = new BigDecimal("4698099460.5024867");
    private BigDecimal fld0273b = new BigDecimal("4338009792.593093");
    private CobolString fld0273e = new CobolString(1, "N");
    private BigDecimal fld0274a = new BigDecimal("2190249.4");
    private BigDecimal fld0274b = new BigDecimal("5271665070.2586675958");
    private CobolString fld0274e = new CobolString(1, "N");
    private BigDecimal fld0275a = new BigDecimal("1157");
    private BigDecimal fld0275b = new BigDecimal("2422980.94");
    private CobolString fld0275e = new CobolString(1, "N");
    private BigDecimal fld0276a = new BigDecimal("9021.044697283423507983002309629227");
    private BigDecimal fld0276b = new BigDecimal("94.591784695476577304873444518307223");
    private CobolString fld0276e = new CobolString(1, "N");
    private BigDecimal fld0277a = new BigDecimal("9.749582162084949876756923003995325416");
    private BigDecimal fld0277b = new BigDecimal("4992154586.01645512");
    private CobolString fld0277e = new CobolString(1, "N");
    private BigDecimal fld0278a = new BigDecimal("4251062706.993476");
    private BigDecimal fld0278b = new BigDecimal("914.7657257947739983805490737722720");
    private CobolString fld0278e = new CobolString(1, "N");
    private BigDecimal fld0279a = new BigDecimal("-27159201.10");
    private BigDecimal fld0279b = new BigDecimal("921.08160397424898579998853165307082");
    private CobolString fld0279e = new CobolString(1, "N");
    private BigDecimal fld0280a = new BigDecimal("2571968.92");
    private BigDecimal fld0280b = new BigDecimal("71229222.1254675839148262639");
    private CobolString fld0280e = new CobolString(1, "N");
    private BigDecimal fld0281a = new BigDecimal("342861689.3811");
    private BigDecimal fld0281b = new BigDecimal("4662459797.7205073");
    private CobolString fld0281e = new CobolString(1, "N");
    private BigDecimal fld0282a = new BigDecimal("-4600147325.4430291");
    private BigDecimal fld0282b = new BigDecimal("7889304.3658446049271049105300");
    private CobolString fld0282e = new CobolString(1, "N");
    private BigDecimal fld0283a = new BigDecimal("0");
    private BigDecimal fld0283b = new BigDecimal("-18273.9");
    private CobolString fld0283e = new CobolString(1, "N");
    private BigDecimal fld0284a = new BigDecimal("689733171.20512533939802324");
    private BigDecimal fld0284b = new BigDecimal("0");
    private CobolString fld0284e = new CobolString(1, "N");
    private BigDecimal fld0285a = new BigDecimal("928.78828230193799520009179104818031");
    private BigDecimal fld0285b = new BigDecimal("73692142.62351649891158444916");
    private CobolString fld0285e = new CobolString(1, "N");
    private BigDecimal fld0286a = new BigDecimal("70426964.322731444578806758");
    private BigDecimal fld0286b = new BigDecimal("2181620.7");
    private CobolString fld0286e = new CobolString(1, "N");
    private BigDecimal fld0287a = new BigDecimal("-2521413.84");
    private BigDecimal fld0287b = new BigDecimal("158585");
    private CobolString fld0287e = new CobolString(1, "N");
    private BigDecimal fld0288a = new BigDecimal("688074525.02240640246355951");
    private BigDecimal fld0288b = new BigDecimal("8936.92752615119712089608583482913");
    private CobolString fld0288e = new CobolString(1, "N");
    private BigDecimal fld0289a = new BigDecimal("-92");
    private BigDecimal fld0289b = new BigDecimal("5676330984.14293657540");
    private CobolString fld0289e = new CobolString(1, "N");
    private BigDecimal fld0290a = new BigDecimal("-382951207.35442");
    private BigDecimal fld0290b = new BigDecimal("-94");
    private CobolString fld0290e = new CobolString(1, "N");
    private BigDecimal fld0291a = new BigDecimal("9.859384124391753490002088256005663424");
    private BigDecimal fld0291b = new BigDecimal("830008.1335268413296191170047677");
    private CobolString fld0291e = new CobolString(1, "N");
    private BigDecimal fld0292a = new BigDecimal("31020519.916");
    private BigDecimal fld0292b = new BigDecimal("0");
    private CobolString fld0292e = new CobolString(1, "N");
    private BigDecimal fld0293a = new BigDecimal("-93");
    private BigDecimal fld0293b = new BigDecimal("30744484.924");
    private CobolString fld0293e = new CobolString(1, "N");
    private BigDecimal fld0294a = new BigDecimal("412445339.504106");
    private BigDecimal fld0294b = new BigDecimal("0");
    private CobolString fld0294e = new CobolString(1, "N");
    private BigDecimal fld0295a = new BigDecimal("-2502548.06");
    private BigDecimal fld0295b = new BigDecimal("2138373.7");
    private CobolString fld0295e = new CobolString(1, "N");
    private BigDecimal fld0296a = new BigDecimal("-160918");
    private BigDecimal fld0296b = new BigDecimal("574303107.736577889141");
    private CobolString fld0296e = new CobolString(1, "N");
    private BigDecimal fld0297a = new BigDecimal("30843552.269");
    private BigDecimal fld0297b = new BigDecimal("5180156945.333709295");
    private CobolString fld0297e = new CobolString(1, "N");
    private BigDecimal fld0298a = new BigDecimal("-4831587379.88150510");
    private BigDecimal fld0298b = new BigDecimal("9.983859909908295859892746193509083241");
    private CobolString fld0298e = new CobolString(1, "N");
    private BigDecimal fld0299a = new BigDecimal("6064872573.5835784522720");
    private BigDecimal fld0299b = new BigDecimal("669818284.8844781434038964");
    private CobolString fld0299e = new CobolString(1, "N");
    private BigDecimal fld0300a = new BigDecimal("73956142.30661028409841151187");
    private BigDecimal fld0300b = new BigDecimal("624082886.12038953502292");
    private CobolString fld0300e = new CobolString(1, "N");
    private BigDecimal fld0301a = new BigDecimal("-4524568495.0704084");
    private BigDecimal fld0301b = new BigDecimal("0");
    private CobolString fld0301e = new CobolString(1, "N");
    private BigDecimal fld0302a = new BigDecimal("94.9764690231816866017311440373305231");
    private BigDecimal fld0302b = new BigDecimal("4291773437.216153");
    private CobolString fld0302e = new CobolString(1, "N");
    private BigDecimal fld0303a = new BigDecimal("9.998247249142951931233369577967096120");
    private BigDecimal fld0303b = new BigDecimal("0");
    private CobolString fld0303e = new CobolString(1, "N");
    private BigDecimal fld0304a = new BigDecimal("-83");
    private BigDecimal fld0304b = new BigDecimal("5565734306.84127234968");
    private CobolString fld0304e = new CobolString(1, "N");
    private BigDecimal fld0305a = new BigDecimal("328435884.788");
    private BigDecimal fld0305b = new BigDecimal("0");
    private CobolString fld0305e = new CobolString(1, "N");
    private BigDecimal fld0306a = new BigDecimal("-83");
    private BigDecimal fld0306b = new BigDecimal("-4936418970.17687181");
    private CobolString fld0306e = new CobolString(1, "N");
    private BigDecimal fld0307a = new BigDecimal("5430567751.9659767416");
    private BigDecimal fld0307b = new BigDecimal("928.08547489686554765597747973515652");
    private CobolString fld0307e = new CobolString(1, "N");
    private BigDecimal fld0308a = new BigDecimal("377189267.62120");
    private BigDecimal fld0308b = new BigDecimal("96.4274365663057242414879510761238634");
    private CobolString fld0308e = new CobolString(1, "N");
    private BigDecimal fld0309a = new BigDecimal("325461096.612");
    private BigDecimal fld0309b = new BigDecimal("-93");
    private CobolString fld0309e = new CobolString(1, "N");
    private BigDecimal fld0310a = new BigDecimal("377541451.37210");
    private BigDecimal fld0310b = new BigDecimal("416709099.760976");
    private CobolString fld0310e = new CobolString(1, "N");
    private BigDecimal fld0311a = new BigDecimal("-6");
    private BigDecimal fld0311b = new BigDecimal("9.931117203050255914931199185957666486");
    private CobolString fld0311e = new CobolString(1, "N");
    private BigDecimal fld0312a = new BigDecimal("-4631183834.9707568");
    private BigDecimal fld0312b = new BigDecimal("0");
    private CobolString fld0312e = new CobolString(1, "N");
    private BigDecimal fld0313a = new BigDecimal("86493.365621715367907995641871821");
    private BigDecimal fld0313b = new BigDecimal("375066571.23058");
    private CobolString fld0313e = new CobolString(1, "N");
    private BigDecimal fld0314a = new BigDecimal("88");
    private BigDecimal fld0314b = new BigDecimal("69720866.107690404600560896");
    private CobolString fld0314e = new CobolString(1, "N");
    private BigDecimal fld0315a = new BigDecimal("7933336.74589681625555215305212");
    private BigDecimal fld0315b = new BigDecimal("688307785.43204196306959374");
    private CobolString fld0315e = new CobolString(1, "N");
    private BigDecimal fld0316a = new BigDecimal("195827.4");
    private BigDecimal fld0316b = new BigDecimal("5611864585.06384822086");
    private CobolString fld0316e = new CobolString(1, "N");
    private BigDecimal fld0317a = new BigDecimal("4983225307.65216153");
    private BigDecimal fld0317b = new BigDecimal("331361572.492");
    private CobolString fld0317e = new CobolString(1, "N");
    private BigDecimal fld0318a = new BigDecimal("26926374.69");
    private BigDecimal fld0318b = new BigDecimal("8825.34717446214034275442372745601");
    private CobolString fld0318e = new CobolString(1, "N");
    private BigDecimal fld0319a = new BigDecimal("69931441.978879860243978328");
    private BigDecimal fld0319b = new BigDecimal("650439668.121860714578019");
    private CobolString fld0319e = new CobolString(1, "N");
    private BigDecimal fld0320a = new BigDecimal("71973495.8824565840274090078");
    private BigDecimal fld0320b = new BigDecimal("5542215777.53993832615");
    private CobolString fld0320e = new CobolString(1, "N");
    private BigDecimal fld0321a = new BigDecimal("5005504874.853489161");
    private BigDecimal fld0321b = new BigDecimal("660163921.0521921263818967");
    private CobolString fld0321e = new CobolString(1, "N");
    private BigDecimal fld0322a = new BigDecimal("442005310.2249054");
    private BigDecimal fld0322b = new BigDecimal("617916374.92097983841432");
    private CobolString fld0322e = new CobolString(1, "N");
    private BigDecimal fld0323a = new BigDecimal("-15097");
    private BigDecimal fld0323b = new BigDecimal("9.73366140153258840861383305309573188");
    private CobolString fld0323e = new CobolString(1, "N");
    private BigDecimal fld0324a = new BigDecimal("5601604504.75820970162");
    private BigDecimal fld0324b = new BigDecimal("5319146871.9734047443");
    private CobolString fld0324e = new CobolString(1, "N");
    private BigDecimal fld0325a = new BigDecimal("1169");
    private BigDecimal fld0325b = new BigDecimal("72332591.2353324218528882738");
    private CobolString fld0325e = new CobolString(1, "N");
    private BigDecimal fld0326a = new BigDecimal("+31312044.720");
    private BigDecimal fld0326b = new BigDecimal("-5");
    private CobolString fld0326e = new CobolString(1, "N");
    private BigDecimal fld0327a = new BigDecimal("-90");
    private BigDecimal fld0327b = new BigDecimal("2122536.7");
    private CobolString fld0327e = new CobolString(1, "N");
    private BigDecimal fld0328a = new BigDecimal("71147504.7716873310044150002");
    private BigDecimal fld0328b = new BigDecimal("-393175029.86891");
    private CobolString fld0328e = new CobolString(1, "N");
    private BigDecimal fld0329a = new BigDecimal("0");
    private BigDecimal fld0329b = new BigDecimal("95.2096907591406971249625712516717612");
    private CobolString fld0329e = new CobolString(1, "N");
    private BigDecimal fld0330a = new BigDecimal("445280746.1581723");
    private BigDecimal fld0330b = new BigDecimal("7955244.25555017788980194382020");
    private CobolString fld0330e = new CobolString(1, "N");
    private BigDecimal fld0331a = new BigDecimal("2232816.8");
    private BigDecimal fld0331b = new BigDecimal("27670053.03");
    private CobolString fld0331e = new CobolString(1, "N");
    private BigDecimal fld0332a = new BigDecimal("86562.988696340348315771962006692");
    private BigDecimal fld0332b = new BigDecimal("355930982.9079");
    private CobolString fld0332e = new CobolString(1, "N");
    private BigDecimal fld0333a = new BigDecimal("95.6494138775326296908474432711955159");
    private BigDecimal fld0333b = new BigDecimal("2431333.31");
    private CobolString fld0333e = new CobolString(1, "N");
    private BigDecimal fld0334a = new BigDecimal("28999492.466");
    private BigDecimal fld0334b = new BigDecimal("326043905.981");
    private CobolString fld0334e = new CobolString(1, "N");
    private BigDecimal fld0335a = new BigDecimal("30334218.791");
    private BigDecimal fld0335b = new BigDecimal("5075855226.668805064");
    private CobolString fld0335e = new CobolString(1, "N");
    private BigDecimal fld0336a = new BigDecimal("85800.255545984371874368434873758");
    private BigDecimal fld0336b = new BigDecimal("-29245898.644");
    private CobolString fld0336e = new CobolString(1, "N");
    private BigDecimal fld0337a = new BigDecimal("72003996.5448931451597047725");
    private BigDecimal fld0337b = new BigDecimal("71409231.4076567258318561925");
    private CobolString fld0337e = new CobolString(1, "N");
    private BigDecimal fld0338a = new BigDecimal("0");
    private BigDecimal fld0338b = new BigDecimal("5304768900.0456310637");
    private CobolString fld0338e = new CobolString(1, "N");
    private BigDecimal fld0339a = new BigDecimal("-160552");
    private BigDecimal fld0339b = new BigDecimal("594533435.7259434154840");
    private CobolString fld0339e = new CobolString(1, "N");
    private BigDecimal fld0340a = new BigDecimal("5028381651.473269320");
    private BigDecimal fld0340b = new BigDecimal("-361499697.6055");
    private CobolString fld0340e = new CobolString(1, "N");
    private BigDecimal fld0341a = new BigDecimal("5676316159.01010966318");
    private BigDecimal fld0341b = new BigDecimal("572076310.146404809486");
    private CobolString fld0341e = new CobolString(1, "N");
    private BigDecimal fld0342a = new BigDecimal("+2347143.0");
    private BigDecimal fld0342b = new BigDecimal("-4530575977.8135124");
    private CobolString fld0342e = new CobolString(1, "N");
    private BigDecimal fld0343a = new BigDecimal("72866356.1504289902792663724");
    private BigDecimal fld0343b = new BigDecimal("195736.6");
    private CobolString fld0343e = new CobolString(1, "N");
    private BigDecimal fld0344a = new BigDecimal("439744878.9947105");
    private BigDecimal fld0344b = new BigDecimal("8815.39565612843856179381418769480");
    private CobolString fld0344e = new CobolString(1, "N");
    private BigDecimal fld0345a = new BigDecimal("0");
    private BigDecimal fld0345b = new BigDecimal("405441574.894889");
    private CobolString fld0345e = new CobolString(1, "N");
    private BigDecimal fld0346a = new BigDecimal("7807860.0333687642187641131386");
    private BigDecimal fld0346b = new BigDecimal("674345587.8778652490268541");
    private CobolString fld0346e = new CobolString(1, "N");
    private BigDecimal fld0347a = new BigDecimal("70165985.253748408556617732");
    private BigDecimal fld0347b = new BigDecimal("158396");
    private CobolString fld0347e = new CobolString(1, "N");
    private BigDecimal fld0348a = new BigDecimal("33778742.7133");
    private BigDecimal fld0348b = new BigDecimal("575387126.330844100863");
    private CobolString fld0348e = new CobolString(1, "N");
    private BigDecimal fld0349a = new BigDecimal("5122785066.779668161");
    private BigDecimal fld0349b = new BigDecimal("924.84903066843715535583214659709483");
    private CobolString fld0349e = new CobolString(1, "N");
    private BigDecimal fld0350a = new BigDecimal("7");
    private BigDecimal fld0350b = new BigDecimal("826494.1389960360762501068165875");
    private CobolString fld0350e = new CobolString(1, "N");
    private BigDecimal fld0351a = new BigDecimal("84942.576912519174303639601930626");
    private BigDecimal fld0351b = new BigDecimal("5388327188.5283523516");
    private CobolString fld0351e = new CobolString(1, "N");
    private BigDecimal fld0352a = new BigDecimal("937.88592938035042489985926295048557");
    private BigDecimal fld0352b = new BigDecimal("195629.8");
    private CobolString fld0352e = new CobolString(1, "N");
    private BigDecimal fld0353a = new BigDecimal("-2544588.73");
    private BigDecimal fld0353b = new BigDecimal("94.340663054368900652946194895775988");
    private CobolString fld0353e = new CobolString(1, "N");
    private BigDecimal fld0354a = new BigDecimal("2152460.4");
    private BigDecimal fld0354b = new BigDecimal("-29015200.342");
    private CobolString fld0354e = new CobolString(1, "N");
    private BigDecimal fld0355a = new BigDecimal("208715.4");
    private BigDecimal fld0355b = new BigDecimal("-15428");
    private CobolString fld0355e = new CobolString(1, "N");
    private BigDecimal fld0356a = new BigDecimal("-391398983.37050");
    private BigDecimal fld0356b = new BigDecimal("84690.187478976841628508509529638");
    private CobolString fld0356e = new CobolString(1, "N");
    private BigDecimal fld0357a = new BigDecimal("5323345989.0667944591");
    private BigDecimal fld0357b = new BigDecimal("79");
    private CobolString fld0357e = new CobolString(1, "N");
    private BigDecimal fld0358a = new BigDecimal("29848403.943");
    private BigDecimal fld0358b = new BigDecimal("688595894.53938552239264936");
    private CobolString fld0358e = new CobolString(1, "N");
    private BigDecimal fld0359a = new BigDecimal("7654789.5985185210321333215688");
    private BigDecimal fld0359b = new BigDecimal("9.927521413787718795873615817981772124");
    private CobolString fld0359e = new CobolString(1, "N");
    private BigDecimal fld0360a = new BigDecimal("+400277612.276280");
    private BigDecimal fld0360b = new BigDecimal("26666225.04");
    private CobolString fld0360e = new CobolString(1, "N");
    private BigDecimal fld0361a = new BigDecimal("823089.8044061112361902132761315");
    private BigDecimal fld0361b = new BigDecimal("84762.044237681810621154454565839");
    private CobolString fld0361e = new CobolString(1, "N");
    private BigDecimal fld0362a = new BigDecimal("0");
    private BigDecimal fld0362b = new BigDecimal("8970.899599407193836242413453874178");
    private CobolString fld0362e = new CobolString(1, "N");
    private BigDecimal fld0363a = new BigDecimal("358575926.2078");
    private BigDecimal fld0363b = new BigDecimal("9034.927431796696550847514117776881");
    private CobolString fld0363e = new CobolString(1, "N");
    private BigDecimal fld0364a = new BigDecimal("1234");
    private BigDecimal fld0364b = new BigDecimal("830028.0009277749559970516202156");
    private CobolString fld0364e = new CobolString(1, "N");
    private BigDecimal fld0365a = new BigDecimal("551967009.62472056151");
    private BigDecimal fld0365b = new BigDecimal("658782379.9892106313436102");
    private CobolString fld0365e = new CobolString(1, "N");
    private BigDecimal fld0366a = new BigDecimal("822414.3642778768414913770357088");
    private BigDecimal fld0366b = new BigDecimal("838180.2974044693099742175945721");
    private CobolString fld0366e = new CobolString(1, "N");
    private BigDecimal fld0367a = new BigDecimal("595975436.9256639039420");
    private BigDecimal fld0367b = new BigDecimal("-191378.3");
    private CobolString fld0367e = new CobolString(1, "N");
    private BigDecimal fld0368a = new BigDecimal("15663");
    private BigDecimal fld0368b = new BigDecimal("0");
    private CobolString fld0368e = new CobolString(1, "N");
    private BigDecimal fld0369a = new BigDecimal("0");
    private BigDecimal fld0369b = new BigDecimal("31224128.387");
    private CobolString fld0369e = new CobolString(1, "N");
    private BigDecimal fld0370a = new BigDecimal("0");
    private BigDecimal fld0370b = new BigDecimal("0");
    private CobolString fld0370e = new CobolString(1, "N");
    private BigDecimal fld0371a = new BigDecimal("0");
    private BigDecimal fld0371b = new BigDecimal("-82");
    private CobolString fld0371e = new CobolString(1, "N");
    private BigDecimal fld0372a = new BigDecimal("5067586024.551302692");
    private BigDecimal fld0372b = new BigDecimal("5017586497.117959565");
    private CobolString fld0372e = new CobolString(1, "N");
    private BigDecimal fld0373a = new BigDecimal("660730415.8912360447786227");
    private BigDecimal fld0373b = new BigDecimal("-352559577.5040");
    private CobolString fld0373e = new CobolString(1, "N");
    private BigDecimal fld0374a = new BigDecimal("0");
    private BigDecimal fld0374b = new BigDecimal("71126449.7973442155753787119");
    private CobolString fld0374e = new CobolString(1, "N");
    private BigDecimal fld0375a = new BigDecimal("7816763.9605777072819847717255");
    private BigDecimal fld0375b = new BigDecimal("0");
    private CobolString fld0375e = new CobolString(1, "N");
    private BigDecimal fld0376a = new BigDecimal("84980.958923270843996533585595898");
    private BigDecimal fld0376b = new BigDecimal("5240094598.000759607");
    private CobolString fld0376e = new CobolString(1, "N");
    private BigDecimal fld0377a = new BigDecimal("96.7759547981370871205797357106348499");
    private BigDecimal fld0377b = new BigDecimal("7813622.4062247550126159012506");
    private CobolString fld0377e = new CobolString(1, "N");
    private BigDecimal fld0378a = new BigDecimal("0");
    private BigDecimal fld0378b = new BigDecimal("-163135");
    private CobolString fld0378e = new CobolString(1, "N");
    private BigDecimal fld0379a = new BigDecimal("5351160784.1302399890");
    private BigDecimal fld0379b = new BigDecimal("0");
    private CobolString fld0379e = new CobolString(1, "N");
    private BigDecimal fld0380a = new BigDecimal("318886259.138");
    private BigDecimal fld0380b = new BigDecimal("0");
    private CobolString fld0380e = new CobolString(1, "N");
    private BigDecimal fld0381a = new BigDecimal("5188977124.912377281");
    private BigDecimal fld0381b = new BigDecimal("96");
    private CobolString fld0381e = new CobolString(1, "N");
    private BigDecimal fld0382a = new BigDecimal("5469463185.9002762475");
    private BigDecimal fld0382b = new BigDecimal("1276");
    private CobolString fld0382e = new CobolString(1, "N");
    private BigDecimal fld0383a = new BigDecimal("8846.28028341020278269013488170458");
    private BigDecimal fld0383b = new BigDecimal("801588.906111812216082057602761");
    private CobolString fld0383e = new CobolString(1, "N");
    private BigDecimal fld0384a = new BigDecimal("2410021.83");
    private BigDecimal fld0384b = new BigDecimal("0");
    private CobolString fld0384e = new CobolString(1, "N");
    private BigDecimal fld0385a = new BigDecimal("616198826.41569234671408");
    private BigDecimal fld0385b = new BigDecimal("8914.93363280043138452413131744833");
    private CobolString fld0385e = new CobolString(1, "N");
    private BigDecimal fld0386a = new BigDecimal("5671006446.22052230126");
    private BigDecimal fld0386b = new BigDecimal("7538453.430795608589676248811");
    private CobolString fld0386e = new CobolString(1, "N");
    private BigDecimal fld0387a = new BigDecimal("30516405.931");
    private BigDecimal fld0387b = new BigDecimal("660134959.6835575095354897");
    private CobolString fld0387e = new CobolString(1, "N");
    private BigDecimal fld0388a = new BigDecimal("5691303425.20841603359");
    private BigDecimal fld0388b = new BigDecimal("99");
    private CobolString fld0388e = new CobolString(1, "N");
    private BigDecimal fld0389a = new BigDecimal("4300560615.719126");
    private BigDecimal fld0389b = new BigDecimal("5882065365.633618592156");
    private CobolString fld0389e = new CobolString(1, "N");
    private BigDecimal fld0390a = new BigDecimal("-7");
    private BigDecimal fld0390b = new BigDecimal("95");
    private CobolString fld0390e = new CobolString(1, "N");
    private BigDecimal fld0391a = new BigDecimal("30066642.536");
    private BigDecimal fld0391b = new BigDecimal("-26329271.26");
    private CobolString fld0391e = new CobolString(1, "N");
    private BigDecimal fld0392a = new BigDecimal("95.7627258628673261320329856971511617");
    private BigDecimal fld0392b = new BigDecimal("4682510725.0510572");
    private CobolString fld0392e = new CobolString(1, "N");
    private BigDecimal fld0393a = new BigDecimal("5");
    private BigDecimal fld0393b = new BigDecimal("9067.420163680885991652758093550801");
    private CobolString fld0393e = new CobolString(1, "N");
    private BigDecimal fld0394a = new BigDecimal("16807.8");
    private BigDecimal fld0394b = new BigDecimal("-4746288002.63585892");
    private CobolString fld0394e = new CobolString(1, "N");
    private BigDecimal fld0395a = new BigDecimal("5206691882.901124390");
    private BigDecimal fld0395b = new BigDecimal("0");
    private CobolString fld0395e = new CobolString(1, "N");
    private BigDecimal fld0396a = new BigDecimal("419939827.280791");
    private BigDecimal fld0396b = new BigDecimal("446487444.5871826");
    private CobolString fld0396e = new CobolString(1, "N");
    private BigDecimal fld0397a = new BigDecimal("85569.982924983467587054519754019");
    private BigDecimal fld0397b = new BigDecimal("-7");
    private CobolString fld0397e = new CobolString(1, "N");
    private BigDecimal fld0398a = new BigDecimal("84110.85692078776876456913669244");
    private BigDecimal fld0398b = new BigDecimal("-28358417.67");
    private CobolString fld0398e = new CobolString(1, "N");
    private BigDecimal fld0399a = new BigDecimal("86215.377080746946614198122915695");
    private BigDecimal fld0399b = new BigDecimal("2481207.70");
    private CobolString fld0399e = new CobolString(1, "N");
    private BigDecimal fld0400a = new BigDecimal("4880703034.67910082");
    private BigDecimal fld0400b = new BigDecimal("835199.6491942943467989834971376");
    private CobolString fld0400e = new CobolString(1, "N");
    private BigDecimal fld0401a = new BigDecimal("30757829.425");
    private BigDecimal fld0401b = new BigDecimal("0");
    private CobolString fld0401e = new CobolString(1, "N");
    private BigDecimal fld0402a = new BigDecimal("8843.41306989221531686951038864208");
    private BigDecimal fld0402b = new BigDecimal("69652895.633901057426129455");
    private CobolString fld0402e = new CobolString(1, "N");
    private BigDecimal fld0403a = new BigDecimal("5351391185.2119278034");
    private BigDecimal fld0403b = new BigDecimal("939.96913575689089448417234962107613");
    private CobolString fld0403e = new CobolString(1, "N");
    private BigDecimal fld0404a = new BigDecimal("-4810592903.51378177");
    private BigDecimal fld0404b = new BigDecimal("670850774.7441430080215241");
    private CobolString fld0404e = new CobolString(1, "N");
    private BigDecimal fld0405a = new BigDecimal("-360620744.0007");
    private BigDecimal fld0405b = new BigDecimal("14133");
    private CobolString fld0405e = new CobolString(1, "N");
    private BigDecimal fld0406a = new BigDecimal("-2503018.94");
    private BigDecimal fld0406b = new BigDecimal("7996063.91391730064732712435215");
    private CobolString fld0406e = new CobolString(1, "N");
    private BigDecimal fld0407a = new BigDecimal("592634898.8738083800598");
    private BigDecimal fld0407b = new BigDecimal("9.879241102928391082826919955550692975");
    private CobolString fld0407e = new CobolString(1, "N");
    private BigDecimal fld0408a = new BigDecimal("438100099.1119252");
    private BigDecimal fld0408b = new BigDecimal("28626783.20");
    private CobolString fld0408e = new CobolString(1, "N");
    private BigDecimal fld0409a = new BigDecimal("28575188.65");
    private BigDecimal fld0409b = new BigDecimal("576691261.515216657684");
    private CobolString fld0409e = new CobolString(1, "N");
    private BigDecimal fld0410a = new BigDecimal("615937928.60877261130525");
    private BigDecimal fld0410b = new BigDecimal("9.822719722312858170454319406417198479");
    private CobolString fld0410e = new CobolString(1, "N");
    private BigDecimal fld0411a = new BigDecimal("688573322.26995748847286904");
    private BigDecimal fld0411b = new BigDecimal("7775778.4281136710369253250973");
    private CobolString fld0411e = new CobolString(1, "N");
    private BigDecimal fld0412a = new BigDecimal("572677017.522024045526");
    private BigDecimal fld0412b = new BigDecimal("0");
    private CobolString fld0412e = new CobolString(1, "N");
    private BigDecimal fld0413a = new BigDecimal("828822.6462986850728853482905833");
    private BigDecimal fld0413b = new BigDecimal("0");
    private CobolString fld0413e = new CobolString(1, "N");
    private BigDecimal fld0414a = new BigDecimal("84413.303017262042438062508153961");
    private BigDecimal fld0414b = new BigDecimal("-15377");
    private CobolString fld0414e = new CobolString(1, "N");
    private BigDecimal fld0415a = new BigDecimal("650722988.227690701812377");
    private BigDecimal fld0415b = new BigDecimal("919.0351051613949717733476063585840");
    private CobolString fld0415e = new CobolString(1, "N");
    private BigDecimal fld0416a = new BigDecimal("675584038.8269652718733482");
    private BigDecimal fld0416b = new BigDecimal("0");
    private CobolString fld0416e = new CobolString(1, "N");
    private BigDecimal fld0417a = new BigDecimal("942.59186417160190085695603556814603");
    private BigDecimal fld0417b = new BigDecimal("8943.54109346381376255408213182818");
    private CobolString fld0417e = new CobolString(1, "N");
    private BigDecimal fld0418a = new BigDecimal("0");
    private BigDecimal fld0418b = new BigDecimal("0");
    private CobolString fld0418e = new CobolString(1, "N");
    private BigDecimal fld0419a = new BigDecimal("415695619.544491");
    private BigDecimal fld0419b = new BigDecimal("5349169017.3884820502");
    private CobolString fld0419e = new CobolString(1, "N");
    private BigDecimal fld0420a = new BigDecimal("26881191.37");
    private BigDecimal fld0420b = new BigDecimal("9092.387304867948216724471421912312");
    private CobolString fld0420e = new CobolString(1, "N");
    private BigDecimal fld0421a = new BigDecimal("71124707.9077118260492795798");
    private BigDecimal fld0421b = new BigDecimal("210383.3");
    private CobolString fld0421e = new CobolString(1, "N");
    private BigDecimal fld0422a = new BigDecimal("69276472.004700051510184266");
    private BigDecimal fld0422b = new BigDecimal("96.7464238557165900900258748151827603");
    private CobolString fld0422e = new CobolString(1, "N");
    private BigDecimal fld0423a = new BigDecimal("595417774.2919815052857");
    private BigDecimal fld0423b = new BigDecimal("689527286.14626146441679566");
    private CobolString fld0423e = new CobolString(1, "N");
    private BigDecimal fld0424a = new BigDecimal("551151541.59885582085");
    private BigDecimal fld0424b = new BigDecimal("72724692.5117367437607640567");
    private CobolString fld0424e = new CobolString(1, "N");
    private BigDecimal fld0425a = new BigDecimal("-4741628720.81754727");
    private BigDecimal fld0425b = new BigDecimal("5846836543.074439562772");
    private CobolString fld0425e = new CobolString(1, "N");
    private BigDecimal fld0426a = new BigDecimal("5601456695.80725313885");
    private BigDecimal fld0426b = new BigDecimal("5581868249.31393821280");
    private CobolString fld0426e = new CobolString(1, "N");
    private BigDecimal fld0427a = new BigDecimal("365284621.5641");
    private BigDecimal fld0427b = new BigDecimal("7792109.4871910845380824639505");
    private CobolString fld0427e = new CobolString(1, "N");
    private BigDecimal fld0428a = new BigDecimal("85913.234918316627730661139139556");
    private BigDecimal fld0428b = new BigDecimal("9.753152813075189886404814387788064777");
    private CobolString fld0428e = new CobolString(1, "N");
    private BigDecimal fld0429a = new BigDecimal("7833347.6062909002113343603923");
    private BigDecimal fld0429b = new BigDecimal("415311789.274485");
    private CobolString fld0429e = new CobolString(1, "N");
    private BigDecimal fld0430a = new BigDecimal("30820998.502");
    private BigDecimal fld0430b = new BigDecimal("345613119.3468");
    private CobolString fld0430e = new CobolString(1, "N");
    private BigDecimal fld0431a = new BigDecimal("0");
    private BigDecimal fld0431b = new BigDecimal("920.3928254587173674039490833820309");
    private CobolString fld0431e = new CobolString(1, "N");
    private BigDecimal fld0432a = new BigDecimal("5612307034.00538710745");
    private BigDecimal fld0432b = new BigDecimal("-161655");
    private CobolString fld0432e = new CobolString(1, "N");
    private BigDecimal fld0433a = new BigDecimal("72012955.8244768763763943297");
    private BigDecimal fld0433b = new BigDecimal("206502.1");
    private CobolString fld0433e = new CobolString(1, "N");
    private BigDecimal fld0434a = new BigDecimal("-4547054675.3415619");
    private BigDecimal fld0434b = new BigDecimal("931.50114075800283242045907172723673");
    private CobolString fld0434e = new CobolString(1, "N");
    private BigDecimal fld0435a = new BigDecimal("87");
    private BigDecimal fld0435b = new BigDecimal("5848414344.863717140299");
    private CobolString fld0435e = new CobolString(1, "N");
    private BigDecimal fld0436a = new BigDecimal("0");
    private BigDecimal fld0436b = new BigDecimal("830719.5843004202551185244374210");
    private CobolString fld0436e = new CobolString(1, "N");
    private BigDecimal fld0437a = new BigDecimal("632897272.198471361193128");
    private BigDecimal fld0437b = new BigDecimal("644015379.475938010145341");
    private CobolString fld0437e = new CobolString(1, "N");
    private BigDecimal fld0438a = new BigDecimal("664694021.6365745390802999");
    private BigDecimal fld0438b = new BigDecimal("87427.7230957161255453513604152249");
    private CobolString fld0438e = new CobolString(1, "N");
    private BigDecimal fld0439a = new BigDecimal("4961134805.43429519");
    private BigDecimal fld0439b = new BigDecimal("5610850764.78219813012");
    private CobolString fld0439e = new CobolString(1, "N");
    private BigDecimal fld0440a = new BigDecimal("8899.07507055040514210020319296745");
    private BigDecimal fld0440b = new BigDecimal("4554701137.8932739");
    private CobolString fld0440e = new CobolString(1, "N");
    private BigDecimal fld0441a = new BigDecimal("71126905.4406556744396539215");
    private BigDecimal fld0441b = new BigDecimal("4339238601.837461");
    private CobolString fld0441e = new CobolString(1, "N");
    private BigDecimal fld0442a = new BigDecimal("16995.1");
    private BigDecimal fld0442b = new BigDecimal("915.7753741786495149668212434335146");
    private CobolString fld0442e = new CobolString(1, "N");
    private BigDecimal fld0443a = new BigDecimal("-4744984255.46487689");
    private BigDecimal fld0443b = new BigDecimal("620915031.52970173307068");
    private CobolString fld0443e = new CobolString(1, "N");
    private BigDecimal fld0444a = new BigDecimal("94.673816662087151296844922399031929");
    private BigDecimal fld0444b = new BigDecimal("5047752845.189990011");
    private CobolString fld0444e = new CobolString(1, "N");
    private BigDecimal fld0445a = new BigDecimal("5416554544.5299512206");
    private BigDecimal fld0445b = new BigDecimal("-4623541965.4562581");
    private CobolString fld0445e = new CobolString(1, "N");
    private BigDecimal fld0446a = new BigDecimal("5044897846.697211640");
    private BigDecimal fld0446b = new BigDecimal("665206327.4939082893055797");
    private CobolString fld0446e = new CobolString(1, "N");
    private BigDecimal fld0447a = new BigDecimal("6");
    private BigDecimal fld0447b = new BigDecimal("27717300.69");
    private CobolString fld0447e = new CobolString(1, "N");
    private BigDecimal fld0448a = new BigDecimal("186565.4");
    private BigDecimal fld0448b = new BigDecimal("5373290497.5367845601");
    private CobolString fld0448e = new CobolString(1, "N");
    private BigDecimal fld0449a = new BigDecimal("-384988094.18704");
    private BigDecimal fld0449b = new BigDecimal("34016016.2924");
    private CobolString fld0449e = new CobolString(1, "N");
    private BigDecimal fld0450a = new BigDecimal("625578375.50228334588808");
    private BigDecimal fld0450b = new BigDecimal("597300618.6146695428718");
    private CobolString fld0450e = new CobolString(1, "N");
    private BigDecimal fld0451a = new BigDecimal("0");
    private BigDecimal fld0451b = new BigDecimal("-2517390.40");
    private CobolString fld0451e = new CobolString(1, "N");
    private BigDecimal fld0452a = new BigDecimal("26826484.18");
    private BigDecimal fld0452b = new BigDecimal("5576443525.30127562772");
    private CobolString fld0452e = new CobolString(1, "N");
    private BigDecimal fld0453a = new BigDecimal("5383526546.5392911909");
    private BigDecimal fld0453b = new BigDecimal("96.7573296701221163829131910461001098");
    private CobolString fld0453e = new CobolString(1, "N");
    private BigDecimal fld0454a = new BigDecimal("-90");
    private BigDecimal fld0454b = new BigDecimal("0");
    private CobolString fld0454e = new CobolString(1, "N");
    private BigDecimal fld0455a = new BigDecimal("0");
    private BigDecimal fld0455b = new BigDecimal("85105.998788168291113720442808698");
    private CobolString fld0455e = new CobolString(1, "N");
    private BigDecimal fld0456a = new BigDecimal("-93");
    private BigDecimal fld0456b = new BigDecimal("15509");
    private CobolString fld0456e = new CobolString(1, "N");
    private BigDecimal fld0457a = new BigDecimal("9063.641671624598217249513254500925");
    private BigDecimal fld0457b = new BigDecimal("0");
    private CobolString fld0457e = new CobolString(1, "N");
    private BigDecimal fld0458a = new BigDecimal("6");
    private BigDecimal fld0458b = new BigDecimal("319507540.378");
    private CobolString fld0458e = new CobolString(1, "N");
    private BigDecimal fld0459a = new BigDecimal("198479.9");
    private BigDecimal fld0459b = new BigDecimal("5635468078.16151518188");
    private CobolString fld0459e = new CobolString(1, "N");
    private BigDecimal fld0460a = new BigDecimal("0");
    private BigDecimal fld0460b = new BigDecimal("7834589.5335320658858790920930");
    private CobolString fld0460e = new CobolString(1, "N");
    private BigDecimal fld0461a = new BigDecimal("0");
    private BigDecimal fld0461b = new BigDecimal("2146839.2");
    private CobolString fld0461e = new CobolString(1, "N");
    private BigDecimal fld0462a = new BigDecimal("26776595.69");
    private BigDecimal fld0462b = new BigDecimal("95.2391194548525610308331579290097579");
    private CobolString fld0462e = new CobolString(1, "N");
    private BigDecimal fld0463a = new BigDecimal("85490.666934027292889197724434779");
    private BigDecimal fld0463b = new BigDecimal("407249114.981761");
    private CobolString fld0463e = new CobolString(1, "N");
    private BigDecimal fld0464a = new BigDecimal("4587031190.3834293");
    private BigDecimal fld0464b = new BigDecimal("71857481.5704608793609509120");
    private CobolString fld0464e = new CobolString(1, "N");
    private BigDecimal fld0465a = new BigDecimal("5816563985.597106301028");
    private BigDecimal fld0465b = new BigDecimal("837937.1800695708527584315561398");
    private CobolString fld0465e = new CobolString(1, "N");
    private BigDecimal fld0466a = new BigDecimal("654381306.333900236715805");
    private BigDecimal fld0466b = new BigDecimal("14616");
    private CobolString fld0466e = new CobolString(1, "N");
    private BigDecimal fld0467a = new BigDecimal("+2343287.0");
    private BigDecimal fld0467b = new BigDecimal("8929.74677715112297171629052172647");
    private CobolString fld0467e = new CobolString(1, "N");
    private BigDecimal fld0468a = new BigDecimal("+4344132145.767680");
    private BigDecimal fld0468b = new BigDecimal("29592230.696");
    private CobolString fld0468e = new CobolString(1, "N");
    private BigDecimal fld0469a = new BigDecimal("70961503.876956555370014712");
    private BigDecimal fld0469b = new BigDecimal("5200119971.346918168");
    private CobolString fld0469e = new CobolString(1, "N");
    private BigDecimal fld0470a = new BigDecimal("913.6810028966669827710234130790922");
    private BigDecimal fld0470b = new BigDecimal("-383130523.18889");
    private CobolString fld0470e = new CobolString(1, "N");
    private BigDecimal fld0471a = new BigDecimal("-2507103.69");
    private BigDecimal fld0471b = new BigDecimal("0");
    private CobolString fld0471e = new CobolString(1, "N");
    private BigDecimal fld0472a = new BigDecimal("5103990869.050332168");
    private BigDecimal fld0472b = new BigDecimal("843393.74409143441635450244575622");
    private CobolString fld0472e = new CobolString(1, "N");
    private BigDecimal fld0473a = new BigDecimal("74367162.06805468187823748849");
    private BigDecimal fld0473b = new BigDecimal("70143773.259305752798553612");
    private CobolString fld0473e = new CobolString(1, "N");
    private BigDecimal fld0474a = new BigDecimal("72625744.5118117406224200749");
    private BigDecimal fld0474b = new BigDecimal("13295");
    private CobolString fld0474e = new CobolString(1, "N");
    private BigDecimal fld0475a = new BigDecimal("4588724634.2999971");
    private BigDecimal fld0475b = new BigDecimal("420010897.357724");
    private CobolString fld0475e = new CobolString(1, "N");
    private BigDecimal fld0476a = new BigDecimal("28869933.49");
    private BigDecimal fld0476b = new BigDecimal("197306.5");
    private CobolString fld0476e = new CobolString(1, "N");
    private BigDecimal fld0477a = new BigDecimal("74492482.99155191155307420558");
    private BigDecimal fld0477b = new BigDecimal("-380644102.28203");
    private CobolString fld0477e = new CobolString(1, "N");
    private BigDecimal fld0478a = new BigDecimal("72616162.5751895356550846827");
    private BigDecimal fld0478b = new BigDecimal("345871637.9604");
    private CobolString fld0478e = new CobolString(1, "N");
    private BigDecimal fld0479a = new BigDecimal("413502052.896697");
    private BigDecimal fld0479b = new BigDecimal("820524.8465168897276100778981344");
    private CobolString fld0479e = new CobolString(1, "N");
    private BigDecimal fld0480a = new BigDecimal("203017.8");
    private BigDecimal fld0480b = new BigDecimal("74798417.21657910502685240317");
    private CobolString fld0480e = new CobolString(1, "N");
    private BigDecimal fld0481a = new BigDecimal("15658");
    private BigDecimal fld0481b = new BigDecimal("9.907459007614364265847939350351225584");
    private CobolString fld0481e = new CobolString(1, "N");
    private BigDecimal fld0482a = new BigDecimal("70905037.950447225014727337");
    private BigDecimal fld0482b = new BigDecimal("-4922020906.16106868");
    private CobolString fld0482e = new CobolString(1, "N");
    private BigDecimal fld0483a = new BigDecimal("79");
    private BigDecimal fld0483b = new BigDecimal("323420049.144");
    private CobolString fld0483e = new CobolString(1, "N");
    private BigDecimal fld0484a = new BigDecimal("0");
    private BigDecimal fld0484b = new BigDecimal("577123861.473882282524");
    private CobolString fld0484e = new CobolString(1, "N");
    private BigDecimal fld0485a = new BigDecimal("2567572.97");
    private BigDecimal fld0485b = new BigDecimal("16688.0");
    private CobolString fld0485e = new CobolString(1, "N");
    private BigDecimal fld0486a = new BigDecimal("13937");
    private BigDecimal fld0486b = new BigDecimal("4583814690.4965959");
    private CobolString fld0486e = new CobolString(1, "N");
    private BigDecimal fld0487a = new BigDecimal("209384.2");
    private BigDecimal fld0487b = new BigDecimal("70207035.549040885946681100");
    private CobolString fld0487e = new CobolString(1, "N");
    private BigDecimal fld0488a = new BigDecimal("-4519198906.7966076");
    private BigDecimal fld0488b = new BigDecimal("669660091.3134611587906874");
    private CobolString fld0488e = new CobolString(1, "N");
    private BigDecimal fld0489a = new BigDecimal("-17360.6");
    private BigDecimal fld0489b = new BigDecimal("9.950567826331271348294649214949458837");
    private CobolString fld0489e = new CobolString(1, "N");
    private BigDecimal fld0490a = new BigDecimal("5352566580.2623056954");
    private BigDecimal fld0490b = new BigDecimal("28596817.06");
    private CobolString fld0490e = new CobolString(1, "N");
    private BigDecimal fld0491a = new BigDecimal("918.2459205467069507378141679510008");
    private BigDecimal fld0491b = new BigDecimal("661285516.5476814178759923");
    private CobolString fld0491e = new CobolString(1, "N");
    private BigDecimal fld0492a = new BigDecimal("819266.4570447540928199714471702");
    private BigDecimal fld0492b = new BigDecimal("343135449.1145");
    private CobolString fld0492e = new CobolString(1, "N");
    private BigDecimal fld0493a = new BigDecimal("-18038.5");
    private BigDecimal fld0493b = new BigDecimal("808734.959278862186593528349476");
    private CobolString fld0493e = new CobolString(1, "N");
    private BigDecimal fld0494a = new BigDecimal("87574.5417791477964719604187848744");
    private BigDecimal fld0494b = new BigDecimal("5133082903.157394349");
    private CobolString fld0494e = new CobolString(1, "N");
    private BigDecimal fld0495a = new BigDecimal("-5");
    private BigDecimal fld0495b = new BigDecimal("646882578.915106698502768");
    private CobolString fld0495e = new CobolString(1, "N");
    private BigDecimal fld0496a = new BigDecimal("816763.6415427422802437718019064");
    private BigDecimal fld0496b = new BigDecimal("1240");
    private CobolString fld0496e = new CobolString(1, "N");
    private BigDecimal fld0497a = new BigDecimal("836230.6435874340415637107071233");
    private BigDecimal fld0497b = new BigDecimal("665491997.9684780217965567");
    private CobolString fld0497e = new CobolString(1, "N");
    private BigDecimal fld0498a = new BigDecimal("4792455293.49441590");
    private BigDecimal fld0498b = new BigDecimal("189449.4");
    private CobolString fld0498e = new CobolString(1, "N");
    private BigDecimal fld0499a = new BigDecimal("5");
    private BigDecimal fld0499b = new BigDecimal("634131211.402607308791345");
    private CobolString fld0499e = new CobolString(1, "N");
    private static final String xpc_fld0001b = "\u0003";
    private static final String xpc_fld0001e = "N";
    private static final String xpc_fld0002b = "\u0001W\u0019%\u0015F\u0008\u0092\u0019\u0004\u0004%\u0017x\t\u0014";
    private static final String xpc_fld0002e = "N";
    private static final String xpc_fld0003b = "Iv\u0091f%@\u0013i\u0014";
    private static final String xpc_fld0003e = "N";
    private static final String xpc_fld0004b = "1aq";
    private static final String xpc_fld0004e = "N";
    private static final String xpc_fld0005b = "\u0003&f\u0091&w<";
    private static final String xpc_fld0005e = "N";
    private static final String xpc_fld0006b = "\u0002VAI\u0094V\u0087SVx\u0082\u0087\u0094QdH9\u008f";
    private static final String xpc_fld0006e = "N";
    private static final String xpc_fld0007b = "\u0002p1\u0002\u0089\u001d";
    private static final String xpc_fld0007e = "N";
    private static final String xpc_fld0008b = "\t\u001d";
    private static final String xpc_fld0008e = "N";
    private static final String xpc_fld0009b = "\u0087\u0016D9haAbYbSCbw\u0003\u0084\u001f";
    private static final String xpc_fld0009e = "Y";
    private static final String xpc_fld0010b = "@\u0013\u0013\u0015B%e<";
    private static final String xpc_fld0010e = "N";
    private static final String xpc_fld0011b = "\u0007\u0016\u00076@iX\u0090yY'\u0088\u0003\u0090\u0008\u0015T";
    private static final String xpc_fld0011e = "N";
    private static final String xpc_fld0012b = "qHV\u0082$\u0086`CV\u0092\u0095G\u0006o";
    private static final String xpc_fld0012e = "N";
    private static final String xpc_fld0013b = "\u00032fC`";
    private static final String xpc_fld0013e = "N";
    private static final String xpc_fld0014b = "\u0007V5e";
    private static final String xpc_fld0014e = "N";
    private static final String xpc_fld0015b = "Ia\u0003 a\u0090\u0091\u0005%";
    private static final String xpc_fld0015e = "N";
    private static final String xpc_fld0016b = "\u00041`x\u0008h5\u0085\u000c";
    private static final String xpc_fld0016e = "N";
    private static final String xpc_fld0017b = "\u0089\u00834\u0010\u0087 A\u0016909\u00049A\u0082`\u0093";
    private static final String xpc_fld0017e = "N";
    private static final String xpc_fld0018b = "\u000c";
    private static final String xpc_fld0018e = "Y";
    private static final String xpc_fld0019b = "Ry\u0008f\u0091@'\u001d";
    private static final String xpc_fld0019e = "N";
    private static final String xpc_fld0020b = "\u0000\u0091TgsEc\u0083\u0006\u0081\u008f";
    private static final String xpc_fld0020e = "N";
    private static final String xpc_fld0021b = "\u009c";
    private static final String xpc_fld0021e = "N";
    private static final String xpc_fld0022b = "\u0006\u0080\u0006 D\u0089!B`1\u0014\u0013yU/";
    private static final String xpc_fld0022e = "N";
    private static final String xpc_fld0023b = "\u0000\u0011\u0086T29\u0018\u0002\u0087\u00920bE\u0012'E\u0016to";
    private static final String xpc_fld0023e = "N";
    private static final String xpc_fld0024b = "\u0008\u0012b`1\u0008Gl";
    private static final String xpc_fld0024e = "N";
    private static final String xpc_fld0025b = "\u0002It\u0088'";
    private static final String xpc_fld0025e = "N";
    private static final String xpc_fld0026b = "\u0003\u0083uq\u0096 VM";
    private static final String xpc_fld0026e = "N";
    private static final String xpc_fld0027b = "\u0008\u0015\u0084\u0091\u0004SVu\u0005\u0015\u0008)!\u0099(p";
    private static final String xpc_fld0027e = "Y";
    private static final String xpc_fld0028b = "M";
    private static final String xpc_fld0028e = "N";
    private static final String xpc_fld0029b = "\u0006\u00848\u0081w\u0018)D\"%\u0083xQ\u007f";
    private static final String xpc_fld0029e = "N";
    private static final String xpc_fld0030b = "\u0007\u0002d!\u0001iU3S\u0085tR)?";
    private static final String xpc_fld0030e = "N";
    private static final String xpc_fld0031b = "\u0007\u0004P(\u0005\u0088@x \u0092S\u0011\u0085/";
    private static final String xpc_fld0031e = "N";
    private static final String xpc_fld0032b = "\tG\"\u0005qy\u001d";
    private static final String xpc_fld0032e = "N";
    private static final String xpc_fld0033b = "\u0096\u0002VT\u0002\u0011";
    private static final String xpc_fld0033e = "N";
    private static final String xpc_fld0034b = "\u0002\u0012gq\u009c";
    private static final String xpc_fld0034e = "N";
    private static final String xpc_fld0035b = "0\u0092`\u0016";
    private static final String xpc_fld0035e = "N";
    private static final String xpc_fld0036b = "\u0084x\u0007F\u00061!9\u0006!\u0003\u0012\u00819\u0082D";
    private static final String xpc_fld0036e = "N";
    private static final String xpc_fld0037b = "EHL";
    private static final String xpc_fld0037e = "N";
    private static final String xpc_fld0038b = "\u0008\u0019$fX\u0092\u0019yQYe\u00981T\u0004f";
    private static final String xpc_fld0038e = "N";
    private static final String xpc_fld0039b = "\u0002\u0014'u";
    private static final String xpc_fld0039e = "N";
    private static final String xpc_fld0040b = "2\u008c";
    private static final String xpc_fld0040e = "N";
    private static final String xpc_fld0041b = "W\u0019\u0095R1P$XT\u007f";
    private static final String xpc_fld0041e = "N";
    private static final String xpc_fld0042b = "S\u00910g&\u0095B\u0092\u0012f";
    private static final String xpc_fld0042e = "N";
    private static final String xpc_fld0043b = "\u0008\u0094t(e\u0005$%\u00959U\u0015\u0008\u0016\u0090\u00976\u001f";
    private static final String xpc_fld0043e = "N";
    private static final String xpc_fld0044b = "\u0003Y2y\u0091H\u0083";
    private static final String xpc_fld0044e = "N";
    private static final String xpc_fld0045b = "@VQ6\u0095x0";
    private static final String xpc_fld0045e = "N";
    private static final String xpc_fld0046b = "\u0008`\u0000\u0002Y\u0010da\u0082\u0084s0\u0001\u0001\u0090H\u009f";
    private static final String xpc_fld0046e = "N";
    private static final String xpc_fld0047b = "P\t a\u0008\u0087\u0084X\u0014";
    private static final String xpc_fld0047e = "N";
    private static final String xpc_fld0048b = "\u0001s\t\u009d";
    private static final String xpc_fld0048e = "Y";
    private static final String xpc_fld0049b = "\u0006\u0081\u0082\u0017\u0019\u0089u\u0097!\u0005B\u0095T\u0091Tc\u0008b\u0017";
    private static final String xpc_fld0049e = "N";
    private static final String xpc_fld0050b = "\u0000y\u0012#\u0099r%f";
    private static final String xpc_fld0050e = "N";
    private static final String xpc_fld0051b = "\u0090d\u0087\u0019Hd\u0005\u0088 b\u0003\u0000Y8s%0";
    private static final String xpc_fld0051e = "Y";
    private static final String xpc_fld0052b = "\u0001\u0083x\u0099\u0092)@7T&_";
    private static final String xpc_fld0052e = "N";
    private static final String xpc_fld0053b = "5\u0089\u00168\u0088p\u001d";
    private static final String xpc_fld0053e = "N";
    private static final String xpc_fld0054b = "1\u0092\u0088u\u00822";
    private static final String xpc_fld0054e = "N";
    private static final String xpc_fld0055b = "\u0090Hi\u0015h\u0099I42\u0000\u0002$\u000f";
    private static final String xpc_fld0055e = "N";
    private static final String xpc_fld0056b = "%d@\u0095\u0083";
    private static final String xpc_fld0056e = "N";
    private static final String xpc_fld0057b = "\u0000m";
    private static final String xpc_fld0057e = "Y";
    private static final String xpc_fld0058b = "46#VSy<";
    private static final String xpc_fld0058e = "N";
    private static final String xpc_fld0059b = "\u0006(2\u00879\u0019VHtRTr";
    private static final String xpc_fld0059e = "N";
    private static final String xpc_fld0060b = "\u0015\u0091@";
    private static final String xpc_fld0060e = "N";
    private static final String xpc_fld0061b = "\u0008\u0016e\u0092\u00120\u0096I\u0081rxQ\u0018\u0018XV";
    private static final String xpc_fld0061e = "N";
    private static final String xpc_fld0062b = "\tv\u0095PF\u0092Phbd&\u009f";
    private static final String xpc_fld0062e = "N";
    private static final String xpc_fld0063b = "u0\u0004v2d\u0089s\u0011Py\"\u0095\u000f";
    private static final String xpc_fld0063e = "N";
    private static final String xpc_fld0064b = "\u0007D\r";
    private static final String xpc_fld0064e = "N";
    private static final String xpc_fld0065b = "\u00057|";
    private static final String xpc_fld0065e = "N";
    private static final String xpc_fld0066b = "\u0008P\u0085&\u0008I\u0099\u0088\"wAS\u0095\u0003vx_";
    private static final String xpc_fld0066e = "N";
    private static final String xpc_fld0067b = "\u001d";
    private static final String xpc_fld0067e = "N";
    private static final String xpc_fld0068b = "\u0005";
    private static final String xpc_fld0068e = "N";
    private static final String xpc_fld0069b = "\u0000\u0097";
    private static final String xpc_fld0069e = "Y";
    private static final String xpc_fld0070b = "\u0084s9M";
    private static final String xpc_fld0070e = "N";
    private static final String xpc_fld0071b = "\u0012t";
    private static final String xpc_fld0071e = "N";
    private static final String xpc_fld0072b = "eSw17\u0092\u0001RP(Cs";
    private static final String xpc_fld0072e = "N";
    private static final String xpc_fld0073b = "pqr@p(\u0003TXY\u00160G";
    private static final String xpc_fld0073e = "N";
    private static final String xpc_fld0074b = "`\t\u0011\u0095\u0095R\u0089B%\u0092!YB\u0013\u0015\u0088\u0017\u0080\u008f";
    private static final String xpc_fld0074e = "N";
    private static final String xpc_fld0075b = "\u0002 Va\u008c";
    private static final String xpc_fld0075e = "Y";
    private static final String xpc_fld0076b = "\u0008\u0089\u0092\"iS\u0081BG\u0003$&\u0001\u0002d1es\u008f";
    private static final String xpc_fld0076e = "N";
    private static final String xpc_fld0077b = "\u0002\u0097se\u0083vyyp\u0002E\u0002h3rp$";
    private static final String xpc_fld0077e = "N";
    private static final String xpc_fld0078b = "Rc\u0090\u00833G'\"%\u0080";
    private static final String xpc_fld0078e = "N";
    private static final String xpc_fld0079b = "2L";
    private static final String xpc_fld0079e = "N";
    private static final String xpc_fld0080b = "7\u0011SCr3\u009d";
    private static final String xpc_fld0080e = "N";
    private static final String xpc_fld0081b = "\u0003g ib(\u0084";
    private static final String xpc_fld0081e = "N";
    private static final String xpc_fld0082b = "\u0003\u0099\u0008\u0094'8\u0006h'RD C#\u0082";
    private static final String xpc_fld0082e = "N";
    private static final String xpc_fld0083b = "\u0088eF@l";
    private static final String xpc_fld0083e = "N";
    private static final String xpc_fld0084b = "\u0004\u0005\u0010\u00931\u0083Ph";
    private static final String xpc_fld0084e = "N";
    private static final String xpc_fld0085b = "CT$54a\u0016)";
    private static final String xpc_fld0085e = "N";
    private static final String xpc_fld0086b = "W\u0011g\u0002\u0014\u0001D\u0095r5\u009f";
    private static final String xpc_fld0086e = "N";
    private static final String xpc_fld0087b = "\u0011h";
    private static final String xpc_fld0087e = "Y";
    private static final String xpc_fld0088b = "H\u0015@5E\u0019";
    private static final String xpc_fld0088e = "N";
    private static final String xpc_fld0089b = "\u0008U'\u0081\u0010('\u0087\u0099UD\u0014\u0003Wwi\u0080/";
    private static final String xpc_fld0089e = "N";
    private static final String xpc_fld0090b = "\u0000u\u0018\th-";
    private static final String xpc_fld0090e = "N";
    private static final String xpc_fld0091b = "\u0008ar\u0001\u0088I\u0002\u0092X\u0011#SV";
    private static final String xpc_fld0091e = "N";
    private static final String xpc_fld0092b = "\u0003\u0017\u0091\u0000\t\u0084eTyh\u0008\u0095\u0095\u0008x\u0004";
    private static final String xpc_fld0092e = "N";
    private static final String xpc_fld0093b = "\u0008t\u0010A\u0094aIa\u0011cq\u0088s(V\u008f";
    private static final String xpc_fld0093e = "N";
    private static final String xpc_fld0094b = "\u00050fed`5HPd_";
    private static final String xpc_fld0094e = "N";
    private static final String xpc_fld0095b = "\u0005\u0016w9y\u0080\u0081E2(V T9\u0013a";
    private static final String xpc_fld0095e = "N";
    private static final String xpc_fld0096b = "\u0008u\u00050I\u0007b\u00189!f\u0002f`V\u0013(";
    private static final String xpc_fld0096e = "N";
    private static final String xpc_fld0097b = "\u0007f9\u0004A2\u0090%HD\u0099H\u0019\u0090I";
    private static final String xpc_fld0097e = "N";
    private static final String xpc_fld0098b = "3A00\u0090h";
    private static final String xpc_fld0098e = "N";
    private static final String xpc_fld0099b = "0\u0000q\u0006q\\";
    private static final String xpc_fld0099e = "Y";
    private static final String xpc_fld0100b = "\u00058\u0083\u0095\u0099bgv\u0007qre";
    private static final String xpc_fld0100e = "N";
    private static final String xpc_fld0101b = "Q!\u0012\u0005\u001d";
    private static final String xpc_fld0101e = "N";
    private static final String xpc_fld0102b = "\u0006%\u0099V\u00882wR\u0089f!Q";
    private static final String xpc_fld0102e = "N";
    private static final String xpc_fld0103b = "\t";
    private static final String xpc_fld0103e = "N";
    private static final String xpc_fld0104b = "\u0004\u0081%U\u0005\u0083!t3M";
    private static final String xpc_fld0104e = "N";
    private static final String xpc_fld0105b = "\u0001R&\u0089e";
    private static final String xpc_fld0105e = "N";
    private static final String xpc_fld0106b = "\u0002cb\u0017\u0082\u009d";
    private static final String xpc_fld0106e = "N";
    private static final String xpc_fld0107b = "\u0004\u0091h5CUQx\u0095\u00909\u00152\u0089";
    private static final String xpc_fld0107e = "N";
    private static final String xpc_fld0108b = "\u0002\u0084!\u00051\u009d";
    private static final String xpc_fld0108e = "Y";
    private static final String xpc_fld0109b = "\u0000\u0015g &&`\u0083st\u00114\u0098)\u0092f!\u001f";
    private static final String xpc_fld0109e = "N";
    private static final String xpc_fld0110b = "ax\u0010%rvH\u0019DEPq\u0001";
    private static final String xpc_fld0110e = "N";
    private static final String xpc_fld0111b = "\u0005X#s\u0093G\u0095!y\u0012";
    private static final String xpc_fld0111e = "N";
    private static final String xpc_fld0112b = "\t\u0083q\u00972\r";
    private static final String xpc_fld0112e = "N";
    private static final String xpc_fld0113b = "\u0003i";
    private static final String xpc_fld0113e = "N";
    private static final String xpc_fld0114b = "\u0017fs";
    private static final String xpc_fld0114e = "Y";
    private static final String xpc_fld0115b = "0#gxdL";
    private static final String xpc_fld0115e = "N";
    private static final String xpc_fld0116b = "\u0003";
    private static final String xpc_fld0116e = "N";
    private static final String xpc_fld0117b = "\u00016\u0012";
    private static final String xpc_fld0117e = "Y";
    private static final String xpc_fld0118b = "\u0080m";
    private static final String xpc_fld0118e = "N";
    private static final String xpc_fld0119b = "\u0002S\u0093$P";
    private static final String xpc_fld0119e = "N";
    private static final String xpc_fld0120b = "\u0000}";
    private static final String xpc_fld0120e = "Y";
    private static final String xpc_fld0121b = "\u0003#3\u0002g\u0002,";
    private static final String xpc_fld0121e = "N";
    private static final String xpc_fld0122b = "&\u0093uqR";
    private static final String xpc_fld0122e = "N";
    private static final String xpc_fld0123b = "\u0007P \"P&\u0090\u0082E#\u0005rDs/";
    private static final String xpc_fld0123e = "N";
    private static final String xpc_fld0124b = "\u0004\"8vr\tc\u0015,";
    private static final String xpc_fld0124e = "N";
    private static final String xpc_fld0125b = "cw\u0096\u0001cd\u0006\"WX13";
    private static final String xpc_fld0125e = "N";
    private static final String xpc_fld0126b = "\u0014wiy";
    private static final String xpc_fld0126e = "N";
    private static final String xpc_fld0127b = "\thY\u0089\u0091\u0086\u0018I\u0088\u0095\u0006C\u0005\u0099yH8";
    private static final String xpc_fld0127e = "N";
    private static final String xpc_fld0128b = "qXRg\t";
    private static final String xpc_fld0128e = "N";
    private static final String xpc_fld0129b = "\u0006c\u0002Sgb\"\u0085\u0008p\u0003v";
    private static final String xpc_fld0129e = "N";
    private static final String xpc_fld0130b = "\u0003\u0005\u0000h\u0012u";
    private static final String xpc_fld0130e = "N";
    private static final String xpc_fld0131b = "\u0097T'%i(1\u0092\u0018HEF\u0012";
    private static final String xpc_fld0131e = "N";
    private static final String xpc_fld0132b = "!b\"\u0087";
    private static final String xpc_fld0132e = "N";
    private static final String xpc_fld0133b = "%(A \u008d";
    private static final String xpc_fld0133e = "N";
    private static final String xpc_fld0134b = "`5tV'2GY\u0005P!'O";
    private static final String xpc_fld0134e = "N";
    private static final String xpc_fld0135b = "\u0002V\u0013!\u0097";
    private static final String xpc_fld0135e = "Y";
    private static final String xpc_fld0136b = "r\u0010d\u0018\u0096\u0095\u0082\u0006\u0007tyu\u0082\u007f";
    private static final String xpc_fld0136e = "N";
    private static final String xpc_fld0137b = "9\u0081Yu\u0003\u0087\u0016Y7h\u0083\u0094\u0002@\u0007r\u0008\u008f";
    private static final String xpc_fld0137e = "N";
    private static final String xpc_fld0138b = "\u0089v\u0014\"\u0094AV\u0091\u00000\u0095P2\u0019\u0081\u0007\u0080";
    private static final String xpc_fld0138e = "Y";
    private static final String xpc_fld0139b = "\u0004b\u0097\u0017Gv \u0084\u0017\u0018v&vFC\u0093";
    private static final String xpc_fld0139e = "N";
    private static final String xpc_fld0140b = "\t\u0013E\u0002\u0080$\u0084\u0092Pv\u00954Y!\t&fo";
    private static final String xpc_fld0140e = "N";
    private static final String xpc_fld0141b = "\u0001\u0098\u0004e";
    private static final String xpc_fld0141e = "Y";
    private static final String xpc_fld0142b = "\u0000\u0011-";
    private static final String xpc_fld0142e = "N";
    private static final String xpc_fld0143b = "\u0004\u0003\t\u0093";
    private static final String xpc_fld0143e = "N";
    private static final String xpc_fld0144b = "!p)#";
    private static final String xpc_fld0144e = "Y";
    private static final String xpc_fld0145b = "\u0000\tG\u0096\u0082se ";
    private static final String xpc_fld0145e = "N";
    private static final String xpc_fld0146b = "\u0005\u0092gSqt\u0090\u0016C\t\u0081\u001f";
    private static final String xpc_fld0146e = "N";
    private static final String xpc_fld0147b = "\u0003\u0097D BR\u00188";
    private static final String xpc_fld0147e = "N";
    private static final String xpc_fld0148b = "3X!\u0017\u0099\u0080";
    private static final String xpc_fld0148e = "N";
    private static final String xpc_fld0149b = "\u0006L";
    private static final String xpc_fld0149e = "N";
    private static final String xpc_fld0150b = "\tw\u0097\u0089H\u0015$(\u0091t\u0017Fh\u0091I)Iy\u0087";
    private static final String xpc_fld0150e = "Y";
    private static final String xpc_fld0151b = "\u0003H\u0097y\u0089S\u0085v\u0094\u0091\u00946\u0008\u0002O";
    private static final String xpc_fld0151e = "N";
    private static final String xpc_fld0152b = "\u0097a\u0089\u0003S0Fw\u0096tr\u0000(\u0019pCWS";
    private static final String xpc_fld0152e = "N";
    private static final String xpc_fld0153b = "w\u0000\u0014y\u0084Y\u0098\u0011\t\u0006\u0089\u0005\u0088\u0001/";
    private static final String xpc_fld0153e = "Y";
    private static final String xpc_fld0154b = "\u0004\u0004\u0090\u0002)S\"d\u0013";
    private static final String xpc_fld0154e = "N";
    private static final String xpc_fld0155b = "\u0007\u0082&\u0091H\u0087b3\u0099gw\u0000!WaC3_";
    private static final String xpc_fld0155e = "N";
    private static final String xpc_fld0156b = "\u0089\u0085X\u0080b7 \u0004bQ\u0088\u0099%w\u0002(q";
    private static final String xpc_fld0156e = "N";
    private static final String xpc_fld0157b = "P\u0019b\u0007'2Pe";
    private static final String xpc_fld0157e = "N";
    private static final String xpc_fld0158b = "\u0019\u0091u&$0c\u0002\u0001\u0097\u0019/";
    private static final String xpc_fld0158e = "N";
    private static final String xpc_fld0159b = "\u0006CR\u0093WgB6\u0091&\u0000\u0091\u008f";
    private static final String xpc_fld0159e = "N";
    private static final String xpc_fld0160b = "\u0004I\u0003\u0000";
    private static final String xpc_fld0160e = "N";
    private static final String xpc_fld0161b = "\u0007\u0095\u0089u35u\t\u0000\u0016P$)\u0007";
    private static final String xpc_fld0161e = "N";
    private static final String xpc_fld0162b = "\u0005f\u0081C\u0086E\u0081`\u0089\u0090\u0086";
    private static final String xpc_fld0162e = "N";
    private static final String xpc_fld0163b = "\u0002i \u0086\u0011\u0002GdghUa\u008f";
    private static final String xpc_fld0163e = "N";
    private static final String xpc_fld0164b = "0\u0000";
    private static final String xpc_fld0164e = "N";
    private static final String xpc_fld0165b = "\u0012g";
    private static final String xpc_fld0165e = "Y";
    private static final String xpc_fld0166b = "B\u0095\u0099";
    private static final String xpc_fld0166e = "N";
    private static final String xpc_fld0167b = "\u0000\u0091t@\u0094$x@QBtb\u0082v2U";
    private static final String xpc_fld0167e = "N";
    private static final String xpc_fld0168b = "\u00042i6\u0000Vaf\\";
    private static final String xpc_fld0168e = "N";
    private static final String xpc_fld0169b = "qSGP\u0084dt6\u0082\u0013'\u0091I";
    private static final String xpc_fld0169e = "N";
    private static final String xpc_fld0170b = "\u0002`1wS\u0001d\u0015\u0090\u0092PX\u0013\u0095IE\u0018\u0080\u0016";
    private static final String xpc_fld0170e = "N";
    private static final String xpc_fld0171b = "I3\u00827\u0016\u0002X\u0002";
    private static final String xpc_fld0171e = "N";
    private static final String xpc_fld0172b = "\u0089\u0003wgS\u0083\u0085\u0088@\u0091\u0084IW1\th1";
    private static final String xpc_fld0172e = "N";
    private static final String xpc_fld0173b = "Q\u0099EA'yAr\u0004";
    private static final String xpc_fld0173e = "N";
    private static final String xpc_fld0174b = "\u0005\u0015%\u0085I0\u0087a\u0010W";
    private static final String xpc_fld0174e = "N";
    private static final String xpc_fld0175b = "\u0005\u001c";
    private static final String xpc_fld0175e = "N";
    private static final String xpc_fld0176b = "\u0002\u0018\u0095!\u0092W";
    private static final String xpc_fld0176e = "N";
    private static final String xpc_fld0177b = "\t\u0099\"Sd";
    private static final String xpc_fld0177e = "N";
    private static final String xpc_fld0178b = "$\u0010Cf\u0011-";
    private static final String xpc_fld0178e = "N";
    private static final String xpc_fld0179b = "\u0006c";
    private static final String xpc_fld0179e = "N";
    private static final String xpc_fld0180b = "\u0005CQ\u0003I1\u0099t\u0014\u0010\u007f";
    private static final String xpc_fld0180e = "N";
    private static final String xpc_fld0181b = "\u0004t\u00075\u0083%9\u0010\u0086\u008d";
    private static final String xpc_fld0181e = "N";
    private static final String xpc_fld0182b = "\u0004\u0017\u0090\u0083R3\u0086Iux9\u0092\u000f";
    private static final String xpc_fld0182e = "N";
    private static final String xpc_fld0183b = "\u0000]";
    private static final String xpc_fld0183e = "Y";
    private static final String xpc_fld0184b = "\u0003`\u0019i-";
    private static final String xpc_fld0184e = "N";
    private static final String xpc_fld0185b = "s\u0095\u0013&8u7\u0016\tdeIXf";
    private static final String xpc_fld0185e = "N";
    private static final String xpc_fld0186b = "\u0084\u0007p\u0089G\u0011\u0093\u0012ATRD\u0012\u0000a?";
    private static final String xpc_fld0186e = "N";
    private static final String xpc_fld0187b = "d\u0097\u0095\u0000A\u0093D\u0080U\u0084\u0003";
    private static final String xpc_fld0187e = "N";
    private static final String xpc_fld0188b = "\u0000G\u0011XgrF`\u0080\u0093\u0001D\u00015O";
    private static final String xpc_fld0188e = "N";
    private static final String xpc_fld0189b = "\u0005f\u0085$gr\u0007&rpQ";
    private static final String xpc_fld0189e = "Y";
    private static final String xpc_fld0190b = "\u0006$ve\u0011@'5i\u0080d\u0015";
    private static final String xpc_fld0190e = "N";
    private static final String xpc_fld0191b = "\u0008\u0017Cqh\u0098\u0094\u0011G\u0089\u0096Ht\u0003I/";
    private static final String xpc_fld0191e = "N";
    private static final String xpc_fld0192b = "\u0003X\u0003B)P\u0012";
    private static final String xpc_fld0192e = "N";
    private static final String xpc_fld0193b = "\u0086I\u00922\u0012b\u0094\u0097f\u0090vo";
    private static final String xpc_fld0193e = "N";
    private static final String xpc_fld0194b = "\u0002\u0017(VS\u0005\u0089\u0017bd\u0099g\u009f";
    private static final String xpc_fld0194e = "N";
    private static final String xpc_fld0195b = "\u0001I!";
    private static final String xpc_fld0195e = "Y";
    private static final String xpc_fld0196b = "\u0001\u0080\u0000}";
    private static final String xpc_fld0196e = "N";
    private static final String xpc_fld0197b = "\u0014";
    private static final String xpc_fld0197e = "N";
    private static final String xpc_fld0198b = "\u0014\u0007,";
    private static final String xpc_fld0198e = "Y";
    private static final String xpc_fld0199b = "\u0004R2t\u0014\u0010`SGW\u0011\u0006D\u0093\"";
    private static final String xpc_fld0199e = "N";
    private static final String xpc_fld0200b = "\tQ\u0084H\u0001S&\u0082W";
    private static final String xpc_fld0200e = "N";
    private static final String xpc_fld0201b = "\u0007\u0092u\u0095\u0090DD\u0017\u0088&\u0012Rf\u00825\u001f";
    private static final String xpc_fld0201e = "N";
    private static final String xpc_fld0202b = "\u0003yC\"uU\u0001\u0000\u0013\u0012\"V9YED\u0019\t";
    private static final String xpc_fld0202e = "N";
    private static final String xpc_fld0203b = "\u0005\u0083W\u0012Ae\u0017\u0011H\u0004ee9\u0087\u0092\u0015A_";
    private static final String xpc_fld0203e = "N";
    private static final String xpc_fld0204b = "#c&U";
    private static final String xpc_fld0204e = "N";
    private static final String xpc_fld0205b = "(\u0087A\u0012wGc\u0087\u0015\u0002\u0086\u0099";
    private static final String xpc_fld0205e = "N";
    private static final String xpc_fld0206b = "pc\u0093\u0088vd4BX@6\u0016T";
    private static final String xpc_fld0206e = "N";
    private static final String xpc_fld0207b = "\u0007i\u0017\u00918W0\u0096%`&1ys\u009f";
    private static final String xpc_fld0207e = "N";
    private static final String xpc_fld0208b = "!QI\u0086";
    private static final String xpc_fld0208e = "N";
    private static final String xpc_fld0209b = "yRq\u0010\u0094\u0012\u0097\u0015\u0003QaC \u0012\u0095";
    private static final String xpc_fld0209e = "N";
    private static final String xpc_fld0210b = "\u0000";
    private static final String xpc_fld0210e = "Y";
    private static final String xpc_fld0211b = "\u0004B\u00117puT`L";
    private static final String xpc_fld0211e = "N";
    private static final String xpc_fld0212b = "\u0002d\u0096\u0083`&A=";
    private static final String xpc_fld0212e = "N";
    private static final String xpc_fld0213b = "\u0007RV9w\u000610(u\u0099y\u00035o";
    private static final String xpc_fld0213e = "N";
    private static final String xpc_fld0214b = "\u0006f\u00892pFU2\u0015\u00086\u0090p";
    private static final String xpc_fld0214e = "N";
    private static final String xpc_fld0215b = "\u0001s\u0000\u001d";
    private static final String xpc_fld0215e = "N";
    private static final String xpc_fld0216b = "Vcqht";
    private static final String xpc_fld0216e = "N";
    private static final String xpc_fld0217b = "\u0005\u0019\u0012f!R\u0087\u0088\u008c";
    private static final String xpc_fld0217e = "N";
    private static final String xpc_fld0218b = "\u0004FrU\u00193'\u00036\u0002 \u00196Dcc\u0010ci";
    private static final String xpc_fld0218e = "N";
    private static final String xpc_fld0219b = "Xvi%\u0008!\u00823A'";
    private static final String xpc_fld0219e = "N";
    private static final String xpc_fld0220b = ")6M";
    private static final String xpc_fld0220e = "N";
    private static final String xpc_fld0221b = "\u0008x\u0091\u0003gyF\u0005@qvx\u0089X\u0016x\u0090";
    private static final String xpc_fld0221e = "N";
    private static final String xpc_fld0222b = "\u0015\"\u008d";
    private static final String xpc_fld0222e = "Y";
    private static final String xpc_fld0223b = "i\u0095\t'\u0008(\u0006\u0010$\u0097\u0015\u0089\u0017";
    private static final String xpc_fld0223e = "N";
    private static final String xpc_fld0224b = "\u0003\u0083\u0000v\u0084'fm";
    private static final String xpc_fld0224e = "N";
    private static final String xpc_fld0225b = "W&\u0012@\u0098\u0008\u0093\u0089x\u0016\u009f";
    private static final String xpc_fld0225e = "N";
    private static final String xpc_fld0226b = "\u0002\u0011P\u0095L";
    private static final String xpc_fld0226e = "N";
    private static final String xpc_fld0227b = " 8sdCX)\u0094f\u0015\"Gx\u0089\u0095sr";
    private static final String xpc_fld0227e = "N";
    private static final String xpc_fld0228b = "\u00979i\u0005\u0096\u0087s\u0097$9W\u0083\u0001A\u0088\u0005II\u000f";
    private static final String xpc_fld0228e = "Y";
    private static final String xpc_fld0229b = "s\u0083\u00809c%X\u0095\u0086a1\u0091pY";
    private static final String xpc_fld0229e = "N";
    private static final String xpc_fld0230b = "\t\u008d";
    private static final String xpc_fld0230e = "N";
    private static final String xpc_fld0231b = "\u0002p\u00943GM";
    private static final String xpc_fld0231e = "N";
    private static final String xpc_fld0232b = "GI\u0084#\u0013s\u0080T\u00195\u000458aP\u000f";
    private static final String xpc_fld0232e = "N";
    private static final String xpc_fld0233b = "A)\u0019%\u0014\u0093";
    private static final String xpc_fld0233e = "N";
    private static final String xpc_fld0234b = "\u0005`\u0006\u0080\u0092&pW!3%?";
    private static final String xpc_fld0234e = "N";
    private static final String xpc_fld0235b = "\u0004\u0080\u0083\u0015\u0018q\u0092\u0095c\u009d";
    private static final String xpc_fld0235e = "N";
    private static final String xpc_fld0236b = "\u0007\u0004q4\u0018\u0081WuG\u0019\u0092w\u0094O";
    private static final String xpc_fld0236e = "N";
    private static final String xpc_fld0237b = "\u0008\u0085\t\u0004\u0088X\u00130\u0088\u0008\u0090a\u0085s\u0017WC";
    private static final String xpc_fld0237e = "Y";
    private static final String xpc_fld0238b = "\u0003\"p\u0001";
    private static final String xpc_fld0238e = "N";
    private static final String xpc_fld0239b = ")3%f\u0002cp\u0083!\u0001\u0083/";
    private static final String xpc_fld0239e = "N";
    private static final String xpc_fld0240b = "\u00831eH\u0017\u0007X6C\u0088\u0088\u00819r\u0088\u000f";
    private static final String xpc_fld0240e = "Y";
    private static final String xpc_fld0241b = "\u0006\u0008usW# Y\u0093\u0017\u0014D";
    private static final String xpc_fld0241e = "N";
    private static final String xpc_fld0242b = "\u0018 \u0084\u001d";
    private static final String xpc_fld0242e = "N";
    private static final String xpc_fld0243b = "\u0008p%RW\t2\u0014y\u0086\u0013\u0080\u0005SS\u0094v";
    private static final String xpc_fld0243e = "N";
    private static final String xpc_fld0244b = "YdT\u0014\u0097\u0006sT\u0092He";
    private static final String xpc_fld0244e = "N";
    private static final String xpc_fld0245b = "&C3\u00832\u0010\t\u0092g1s3";
    private static final String xpc_fld0245e = "N";
    private static final String xpc_fld0246b = "\u0001 \u0098%";
    private static final String xpc_fld0246e = "N";
    private static final String xpc_fld0247b = "t g'g\u0085U8\u0008x\"%5\u009f";
    private static final String xpc_fld0247e = "N";
    private static final String xpc_fld0248b = "\u0005h5\u0085\u0094EI#(`\u0003";
    private static final String xpc_fld0248e = "N";
    private static final String xpc_fld0249b = "g1uA\u0083\u0014i\u0080pxtq\u008f";
    private static final String xpc_fld0249e = "Y";
    private static final String xpc_fld0250b = "\u0092g%\u00132\u0016@G\u0006\u0016\u0014\u0016C5\u0012\u0093\u0017";
    private static final String xpc_fld0250e = "N";
    private static final String xpc_fld0251b = "7\u0090Y\u0011RF8%3\u0080\u0016C\u0014\u0087c\u001f";
    private static final String xpc_fld0251e = "N";
    private static final String xpc_fld0252b = "\u00026\u0014&l";
    private static final String xpc_fld0252e = "N";
    private static final String xpc_fld0253b = ")\u0082I\u0015";
    private static final String xpc_fld0253e = "N";
    private static final String xpc_fld0254b = "\u0094\u0090Cb-";
    private static final String xpc_fld0254e = "N";
    private static final String xpc_fld0255b = "\u0005@\u0081CPv\u0003\u0091U\u0011_";
    private static final String xpc_fld0255e = "N";
    private static final String xpc_fld0256b = "\u0008u\u0015\u0000r\u0016\u0003\u0005\u0010\u0085pw4'4UW\u001f";
    private static final String xpc_fld0256e = "N";
    private static final String xpc_fld0257b = "@|";
    private static final String xpc_fld0257e = "N";
    private static final String xpc_fld0258b = "\u0084\u0097\u0082\u0002\u0017X\u00083r7X6\u0000e@3";
    private static final String xpc_fld0258e = "Y";
    private static final String xpc_fld0259b = "\u0003tf\u0083\u0004rY=";
    private static final String xpc_fld0259e = "N";
    private static final String xpc_fld0260b = "\u0006\u0001sfa\u0005\u0083\u0089V9`\u007f";
    private static final String xpc_fld0260e = "N";
    private static final String xpc_fld0261b = "\u0000Vqa\u0085\u0083#";
    private static final String xpc_fld0261e = "N";
    private static final String xpc_fld0262b = "huvX\u0012gY\u0082\u0013)$\u0010I";
    private static final String xpc_fld0262e = "N";
    private static final String xpc_fld0263b = "\u0004\u000c";
    private static final String xpc_fld0263e = "N";
    private static final String xpc_fld0264b = "\u0016hF";
    private static final String xpc_fld0264e = "N";
    private static final String xpc_fld0265b = "\u0002)\u0087xr\u0091wqT9$\u0091A\u0012r 5Iu";
    private static final String xpc_fld0265e = "N";
    private static final String xpc_fld0266b = "\u0001\u0015\u0005#` v\u0092\u0016\u00141\"T\u0086\u00005\u0012B\u007f";
    private static final String xpc_fld0266e = "N";
    private static final String xpc_fld0267b = "\u00024\u0089\u0001L";
    private static final String xpc_fld0267e = "N";
    private static final String xpc_fld0268b = "\u0082\u0011P\tW\u0083\u0001Fw@\u0085s3A\u0005?";
    private static final String xpc_fld0268e = "N";
    private static final String xpc_fld0269b = "\u0005";
    private static final String xpc_fld0269e = "N";
    private static final String xpc_fld0270b = "\u0001 \u000c";
    private static final String xpc_fld0270e = "Y";
    private static final String xpc_fld0271b = "\u0000Ru\u0092\u0003";
    private static final String xpc_fld0271e = "N";
    private static final String xpc_fld0272b = "\u0005\u0016\u0000\u0006\u00960'3h]";
    private static final String xpc_fld0272e = "N";
    private static final String xpc_fld0273b = "\t\u0003a\t%0\u0095W\u009c";
    private static final String xpc_fld0273e = "N";
    private static final String xpc_fld0274b = "RiGH \u0085\u0086gYX";
    private static final String xpc_fld0274e = "N";
    private static final String xpc_fld0275b = "$$\u0013yL";
    private static final String xpc_fld0275e = "N";
    private static final String xpc_fld0276b = "\tE\u0091xF\u0095Gew0HsDE\u00180r#";
    private static final String xpc_fld0276e = "Y";
    private static final String xpc_fld0277b = "I\u0092\u0015E\u0095v`7(";
    private static final String xpc_fld0277e = "N";
    private static final String xpc_fld0278b = "\u0007\u0092\"wP R&\u0000\u0016\u0019E\t&\"w(\u000f";
    private static final String xpc_fld0278e = "N";
    private static final String xpc_fld0279b = "\u0092\u0010\u0081`9t$\u0089\u0085y\u0099\u0088S\u0016S\u0007\u0008/";
    private static final String xpc_fld0279e = "Y";
    private static final String xpc_fld0280b = "herS TgX9\u0014\u0082bc\u009f";
    private static final String xpc_fld0280e = "N";
    private static final String xpc_fld0281b = "\u0005\u0000S!Hq\u0001`s";
    private static final String xpc_fld0281e = "N";
    private static final String xpc_fld0282b = "\u0007\u0088\u0093\u00046XD`I'\u0010I\u0010S\u0000";
    private static final String xpc_fld0282e = "Y";
    private static final String xpc_fld0283b = "\u0001\u0082s\u009d";
    private static final String xpc_fld0283e = "N";
    private static final String xpc_fld0284b = "\u0001";
    private static final String xpc_fld0284e = "N";
    private static final String xpc_fld0285b = "si0qA\u0017\u0098\u0080\u0008IW\u0096I%";
    private static final String xpc_fld0285e = "N";
    private static final String xpc_fld0286b = "\u0082E46";
    private static final String xpc_fld0286e = "N";
    private static final String xpc_fld0287b = "6((";
    private static final String xpc_fld0287e = "N";
    private static final String xpc_fld0288b = "\u00896\u0092u&\u0015\u0011\u0097\u0012\u0008\u0096\u0008X4\u0082\u0091?";
    private static final String xpc_fld0288e = "Y";
    private static final String xpc_fld0289b = "\u0005gc0\u0089!B\u0093eu@";
    private static final String xpc_fld0289e = "N";
    private static final String xpc_fld0290b = "\u0011<";
    private static final String xpc_fld0290e = "N";
    private static final String xpc_fld0291b = "\u0083\u0000\u0017\u0099)\u0010\u0096W!7&\u0007\u0000hU\u009f";
    private static final String xpc_fld0291e = "N";
    private static final String xpc_fld0292b = "\t";
    private static final String xpc_fld0292e = "N";
    private static final String xpc_fld0293b = "\u0003\u0007D9\u0019$";
    private static final String xpc_fld0293e = "N";
    private static final String xpc_fld0294b = "\u0000";
    private static final String xpc_fld0294e = "Y";
    private static final String xpc_fld0295b = "\u00006At=";
    private static final String xpc_fld0295e = "N";
    private static final String xpc_fld0296b = "WDd\u0002W6Wx\u0089\u0014\u001f";
    private static final String xpc_fld0296e = "N";
    private static final String xpc_fld0297b = "\u0005!\u0010\u0000Iv\u0002p\u0092\u0095";
    private static final String xpc_fld0297e = "N";
    private static final String xpc_fld0298b = "\t\u0086Se\u0000\u0099\u0008)XY\u0089'F\u00195\t\u00082A";
    private static final String xpc_fld0298e = "N";
    private static final String xpc_fld0299b = "\u00074i\u0008XF\u0080VYVu\u0089d";
    private static final String xpc_fld0299e = "N";
    private static final String xpc_fld0300b = "U\u0001&t8\u0013w\u0092P\u0092E\u000f";
    private static final String xpc_fld0300e = "N";
    private static final String xpc_fld0301b = "]";
    private static final String xpc_fld0301e = "N";
    private static final String xpc_fld0302b = "B\u0091w3B#\u0096\u0083";
    private static final String xpc_fld0302e = "N";
    private static final String xpc_fld0303b = "\t";
    private static final String xpc_fld0303e = "N";
    private static final String xpc_fld0304b = "\u0005VW48\u0098A'#Ih";
    private static final String xpc_fld0304e = "N";
    private static final String xpc_fld0305b = "L";
    private static final String xpc_fld0305e = "N";
    private static final String xpc_fld0306b = "\u0004\u0093d\u0018\u0088qv\u0087\u0018\u001d";
    private static final String xpc_fld0306e = "N";
    private static final String xpc_fld0307b = "\u0006\u0080\u0005\u0014Qc\u0084eTvU\u0097tysQVR";
    private static final String xpc_fld0307e = "N";
    private static final String xpc_fld0308b = "\u0007\u0011\u0093v43iBuu\u0085\u0012\u0004\u0089#\u0087a6o";
    private static final String xpc_fld0308e = "N";
    private static final String xpc_fld0309b = "\t=";
    private static final String xpc_fld0309e = "Y";
    private static final String xpc_fld0310b = "\u00009\u0016vH8\u0088v";
    private static final String xpc_fld0310e = "N";
    private static final String xpc_fld0311b = "91\u0011r\u0003\u0005\u0002U\u0091I1\u0019\u0091\u0085\u0095vfHo";
    private static final String xpc_fld0311e = "N";
    private static final String xpc_fld0312b = "\u0000";
    private static final String xpc_fld0312e = "Y";
    private static final String xpc_fld0313b = "7QS\u0006E\u0096 ";
    private static final String xpc_fld0313e = "N";
    private static final String xpc_fld0314b = "ir\u0007x\u0010v\u0090@F\u0000V\u0008\u0096";
    private static final String xpc_fld0314e = "N";
    private static final String xpc_fld0315b = "ibA\u0012!w\u0093\u0087y2QE\u0089";
    private static final String xpc_fld0315e = "N";
    private static final String xpc_fld0316b = "V\u0011f\u0087Wf8H\"\u0008o";
    private static final String xpc_fld0316e = "N";
    private static final String xpc_fld0317b = "\u0003\u0014Xh\u0080\u0014L";
    private static final String xpc_fld0317e = "N";
    private static final String xpc_fld0318b = "\u0088%4qtF!@4'TB7'E`\u001f";
    private static final String xpc_fld0318e = "Y";
    private static final String xpc_fld0319b = "\u0007 7\u0011\u0010\u0010\u0007@WH!\u0099\u007f";
    private static final String xpc_fld0319e = "N";
    private static final String xpc_fld0320b = "Tp$\"\u0081et\u0081t!/";
    private static final String xpc_fld0320e = "N";
    private static final String xpc_fld0321b = "f\u0001c\u0092\u0010R\u0019!&8\u0018\u0096\u007f";
    private static final String xpc_fld0321e = "Y";
    private static final String xpc_fld0322b = "\u0001u\u0091\u0010di`tC\u0084\u00142";
    private static final String xpc_fld0322e = "N";
    private static final String xpc_fld0323b = "\u0007&c8Y\u0084gA\u0015\u00918af\u0094i\u0004&\u0081/";
    private static final String xpc_fld0323e = "N";
    private static final String xpc_fld0324b = "\u0000($Wc'\u0084\u0080IW?";
    private static final String xpc_fld0324e = "N";
    private static final String xpc_fld0325b = "r37`#S2B\u0018R\u0088\u0082s\u008f";
    private static final String xpc_fld0325e = "N";
    private static final String xpc_fld0326b = "\u0004\u009d";
    private static final String xpc_fld0326e = "N";
    private static final String xpc_fld0327b = "\u0002\u0012$F|";
    private static final String xpc_fld0327e = "N";
    private static final String xpc_fld0328b = "\u0004d2%4d\u0005\u009d";
    private static final String xpc_fld0328e = "N";
    private static final String xpc_fld0329b = "\tR\ti\u0007Y\u0014\u0006\u0097\u0012IbW\u0012Qg\u0017a/";
    private static final String xpc_fld0329e = "N";
    private static final String xpc_fld0330b = "yU$BUU\u0001w\u0088\u0098\u0001\u00948  ";
    private static final String xpc_fld0330e = "Y";
    private static final String xpc_fld0331b = ")\u0090(i\u0083";
    private static final String xpc_fld0331e = "N";
    private static final String xpc_fld0332b = "\u0003U\u0084D\u0019\u0091\u0092";
    private static final String xpc_fld0332e = "N";
    private static final String xpc_fld0333b = "$1B\u0089\\";
    private static final String xpc_fld0333e = "N";
    private static final String xpc_fld0334b = ")pDA5\u0015";
    private static final String xpc_fld0334e = "N";
    private static final String xpc_fld0335b = "\u0005\u0010a\u0089DTY\u0080Pd";
    private static final String xpc_fld0335e = "N";
    private static final String xpc_fld0336b = ")3\u0016\u0098\u0089\u009d";
    private static final String xpc_fld0336e = "N";
    private static final String xpc_fld0337b = "CA2'\u0095%I\u0087\t\u0091V\te\u000f";
    private static final String xpc_fld0337e = "N";
    private static final String xpc_fld0338b = "\u00050Gh\u0090\u0000Ec\u0010c\u007f";
    private static final String xpc_fld0338e = "N";
    private static final String xpc_fld0339b = "\u0005\u00947(\u0083rYCAT\u0084\u000f";
    private static final String xpc_fld0339e = "N";
    private static final String xpc_fld0340b = "8\u0098\u00814\u0090x}";
    private static final String xpc_fld0340e = "N";
    private static final String xpc_fld0341b = "$\u0083\u0092F\u0091VQDrfo";
    private static final String xpc_fld0341e = "N";
    private static final String xpc_fld0342b = "E2\u00921 \u00815\u0012M";
    private static final String xpc_fld0342e = "N";
    private static final String xpc_fld0343b = "\u0000b\t'";
    private static final String xpc_fld0343e = "N";
    private static final String xpc_fld0344b = "`cY\u0090T7\u0015aC\u0082\u0006\u0018X\u00120R\u000f";
    private static final String xpc_fld0344e = "N";
    private static final String xpc_fld0345b = "\u0004\u0005D\u0015t\u0089H\u0089";
    private static final String xpc_fld0345e = "N";
    private static final String xpc_fld0346b = "fe7rxDId\u0084\u0080\u0080\u0089\u009f";
    private static final String xpc_fld0346e = "N";
    private static final String xpc_fld0347b = "2C\u0081";
    private static final String xpc_fld0347e = "N";
    private static final String xpc_fld0348b = "\u0005A`\u0083\u0083auD\u0010\u0008c";
    private static final String xpc_fld0348e = "N";
    private static final String xpc_fld0349b = "\u0099\u0016(i\u0088)CqU5X2\u0014e\u0097\tH?";
    private static final String xpc_fld0349e = "N";
    private static final String xpc_fld0350b = "\u0008&Hq8\u0099`6\u0007bP\u0010h\u0016Xu";
    private static final String xpc_fld0350e = "N";
    private static final String xpc_fld0351b = "S\u0088A!1\u0010Rd\u0087\u0007";
    private static final String xpc_fld0351e = "N";
    private static final String xpc_fld0352b = "\u0001\u0094i\u0019";
    private static final String xpc_fld0352e = "N";
    private static final String xpc_fld0353b = "\u00948\u00936\u0094V1\t\u0093G\u00058\u0005\u0010B$\u0001/";
    private static final String xpc_fld0353e = "N";
    private static final String xpc_fld0354b = "1\u0016v`t-";
    private static final String xpc_fld0354e = "N";
    private static final String xpc_fld0355b = "\u0093(|";
    private static final String xpc_fld0355e = "N";
    private static final String xpc_fld0356b = "\u0083g5W\u0097\u0089v\u0084\u0016(P\u0085\tR\u00968";
    private static final String xpc_fld0356e = "N";
    private static final String xpc_fld0357b = "\u0000y";
    private static final String xpc_fld0357e = "Y";
    private static final String xpc_fld0358b = "e\u0087GI\u0005\u00968U\"9&I6";
    private static final String xpc_fld0358e = "N";
    private static final String xpc_fld0359b = "\u0095&\u0003\u00994\u0081\u0098R\u0011tBAX\u0017\u0098\u0017r\u0012O";
    private static final String xpc_fld0359e = "N";
    private static final String xpc_fld0360b = "&fb%\u0004";
    private static final String xpc_fld0360e = "Y";
    private static final String xpc_fld0361b = "\u0007\u0085\u0018Hd7\u0093\u0004h\u00116w0is9";
    private static final String xpc_fld0361e = "N";
    private static final String xpc_fld0362b = "\u0089p\u0089\u0095\u0099@q\u0093\u0083bBA4S\u0087Ax";
    private static final String xpc_fld0362e = "N";
    private static final String xpc_fld0363b = "\t\u0003I'C\u0017\u0096ieP\u0084u\u0014\u0011wv\u0088\u001f";
    private static final String xpc_fld0363e = "Y";
    private static final String xpc_fld0364b = "\u0082\u0087\u0094\u0000\t'wIU\u0099pQb\u0002\u0015o";
    private static final String xpc_fld0364e = "N";
    private static final String xpc_fld0365b = "\u0002\u0010t\u0093\u0089a91\u0019(Sa\u0002";
    private static final String xpc_fld0365e = "N";
    private static final String xpc_fld0366b = "\u0000\u0015vY3\u0012e\u0092F\u0084\u0082\u0084\u0005X\u00863";
    private static final String xpc_fld0366e = "N";
    private static final String xpc_fld0367b = "x@Xl";
    private static final String xpc_fld0367e = "N";
    private static final String xpc_fld0368b = "\u0003";
    private static final String xpc_fld0368e = "N";
    private static final String xpc_fld0369b = "1\"A(8|";
    private static final String xpc_fld0369e = "N";
    private static final String xpc_fld0370b = "\u000c";
    private static final String xpc_fld0370e = "N";
    private static final String xpc_fld0371b = "\u0008-";
    private static final String xpc_fld0371e = "N";
    private static final String xpc_fld0372b = "\u0000I\u0099\u0095'C3C\u0012\u007f";
    private static final String xpc_fld0372e = "N";
    private static final String xpc_fld0373b = "0\u0081p\u0083\u0083\u0087,";
    private static final String xpc_fld0373e = "N";
    private static final String xpc_fld0374b = "q\u0012dIysD!Uu7\u0087\u0011\u009f";
    private static final String xpc_fld0374e = "N";
    private static final String xpc_fld0375b = "\u0000";
    private static final String xpc_fld0375e = "Y";
    private static final String xpc_fld0376b = "R@\u0000\u0096\u0017\u0004\u001863o";
    private static final String xpc_fld0376e = "N";
    private static final String xpc_fld0377b = "x\u0013q\u0091\u0082\u0017\u0095S\u0014\u0097\u0003\u0002\u00180?";
    private static final String xpc_fld0377e = "N";
    private static final String xpc_fld0378b = "\u0001c\u0013]";
    private static final String xpc_fld0378e = "N";
    private static final String xpc_fld0379b = "\u0004";
    private static final String xpc_fld0379e = "N";
    private static final String xpc_fld0380b = "\u009d";
    private static final String xpc_fld0380e = "N";
    private static final String xpc_fld0381b = "\u0000\u0096";
    private static final String xpc_fld0381e = "Y";
    private static final String xpc_fld0382b = "\u0019\t";
    private static final String xpc_fld0382e = "N";
    private static final String xpc_fld0383b = "\u0008\u0010CQ\u00869R\"A\u0088dtw7d/";
    private static final String xpc_fld0383e = "N";
    private static final String xpc_fld0384b = "\u0000";
    private static final String xpc_fld0384e = "Y";
    private static final String xpc_fld0385b = "wA4\u0093%\u0014qEFE$\u0013\u0013\u0017D\u0083?";
    private static final String xpc_fld0385e = "N";
    private static final String xpc_fld0386b = "\u0003Fy\u0092x\u0097&i&p27Q\u0018\u009f";
    private static final String xpc_fld0386e = "N";
    private static final String xpc_fld0387b = "i\u0006Q6V\u0014Uu\tST\u0089\u007f";
    private static final String xpc_fld0387e = "N";
    private static final String xpc_fld0388b = "\u0003&";
    private static final String xpc_fld0388e = "N";
    private static final String xpc_fld0389b = "\u0001\u0082bY\u00815'DY!V";
    private static final String xpc_fld0389e = "N";
    private static final String xpc_fld0390b = "\u0001\u0002";
    private static final String xpc_fld0390e = "N";
    private static final String xpc_fld0391b = "\u0000777\u0012|";
    private static final String xpc_fld0391e = "N";
    private static final String xpc_fld0392b = "\u0004h%\u0010b\u0092\u00883\u0013";
    private static final String xpc_fld0392e = "N";
    private static final String xpc_fld0393b = "\u0090rB\u0001ch\u0008\u0085\u0099\u0016Ru\u0080\u0093U\u0008\u0001";
    private static final String xpc_fld0393e = "N";
    private static final String xpc_fld0394b = "\u0004tc\u0004\u0081\u00045\u0085\u0089-";
    private static final String xpc_fld0394e = "N";
    private static final String xpc_fld0395b = ",";
    private static final String xpc_fld0395e = "N";
    private static final String xpc_fld0396b = "\u0002eGas\u00069\u0016";
    private static final String xpc_fld0396e = "N";
    private static final String xpc_fld0397b = "\u0006,";
    private static final String xpc_fld0397e = "N";
    private static final String xpc_fld0398b = "\u0002\u0084BR\u0085-";
    private static final String xpc_fld0398e = "N";
    private static final String xpc_fld0399b = "\u0002Vt#\u0007";
    private static final String xpc_fld0399e = "N";
    private static final String xpc_fld0400b = "\u0008g\u0083P)\u0090e%e2\u0001\u0001e\u0002\u0086$";
    private static final String xpc_fld0400e = "N";
    private static final String xpc_fld0401b = "\t";
    private static final String xpc_fld0401e = "N";
    private static final String xpc_fld0402b = "id@R\"\u00081\u0016R\u0010\u0081%\u0085";
    private static final String xpc_fld0402e = "N";
    private static final String xpc_fld0403b = "\u0001%\u0018\u0010cV\u0002\u0090\u0089D\u0084\u0017#Ib\u0010v\u0013";
    private static final String xpc_fld0403e = "N";
    private static final String xpc_fld0404b = "H\u0014Cg\u0082W\u0092Gx\u0002\u0015$\u001f";
    private static final String xpc_fld0404e = "N";
    private static final String xpc_fld0405b = "\u0014\u0013<";
    private static final String xpc_fld0405e = "Y";
    private static final String xpc_fld0406b = "\u0004\u0099\u0008(S\u0091s\u0000ds'\u0012CR\u0015";
    private static final String xpc_fld0406e = "N";
    private static final String xpc_fld0407b = "\u0008u0IH)\u0088\u0019\u0010\u0082\u0082i\u0019\u0095UPi)u";
    private static final String xpc_fld0407e = "N";
    private static final String xpc_fld0408b = "(bg\u0083 ";
    private static final String xpc_fld0408e = "Y";
    private static final String xpc_fld0409b = "\u0006\u0005&dP\u0016R\u0016ev\u0084";
    private static final String xpc_fld0409e = "N";
    private static final String xpc_fld0410b = "\u0087\u0086\u0005(\u0088\u0099#\u0091\u0082\u0095Eh\u0005\u0093X(\u0001R\u001f";
    private static final String xpc_fld0410e = "N";
    private static final String xpc_fld0411b = "\u0007wWxB\u0081\u0013g\u00106\u0092S%\ts";
    private static final String xpc_fld0411e = "Y";
    private static final String xpc_fld0412b = "}";
    private static final String xpc_fld0412e = "N";
    private static final String xpc_fld0413b = ",";
    private static final String xpc_fld0413e = "N";
    private static final String xpc_fld0414b = "\u0099y\r";
    private static final String xpc_fld0414e = "N";
    private static final String xpc_fld0415b = "\u0090rbyXc sHw3G`cXX@";
    private static final String xpc_fld0415e = "N";
    private static final String xpc_fld0416b = "\u008d";
    private static final String xpc_fld0416e = "N";
    private static final String xpc_fld0417b = "\u0098\u0086\u0013)WcT\u0015f4\u0011\u0003\u0081g9c/";
    private static final String xpc_fld0417e = "N";
    private static final String xpc_fld0418b = "\u0000";
    private static final String xpc_fld0418e = "N";
    private static final String xpc_fld0419b = "\u0005vHdci2\u00970P/";
    private static final String xpc_fld0419e = "N";
    private static final String xpc_fld0420b = "\u0090\u00928s\u0004\u0086yH!g$G\u0014!\u0091#\u0012";
    private static final String xpc_fld0420e = "Y";
    private static final String xpc_fld0421b = "3P\u0091,";
    private static final String xpc_fld0421e = "N";
    private static final String xpc_fld0422b = "u%\u0082v\u0019W\u0093YAu\u0097A%\u0018H\u0017#\u0097";
    private static final String xpc_fld0422e = "N";
    private static final String xpc_fld0423b = "h\u0095'(aF&\u0014dAg\u0095f";
    private static final String xpc_fld0423e = "Y";
    private static final String xpc_fld0424b = "\u0007\u0084&\u0084\u0090\u0087\u0011\u0090w\u0008\u00925\u00943";
    private static final String xpc_fld0424e = "N";
    private static final String xpc_fld0425b = "\u0001\u0010R\u0007\u0082\"V\u0089\"\u0092w/";
    private static final String xpc_fld0425e = "N";
    private static final String xpc_fld0426b = "\u0000\u0001\u0095\u0088Dd\u00931I&\u0005";
    private static final String xpc_fld0426e = "N";
    private static final String xpc_fld0427b = "\u0003\u0007g1\u0005\u0012\u0091\u0008E8\u0008$c\u0095\u0005";
    private static final String xpc_fld0427e = "N";
    private static final String xpc_fld0428b = "\u0003H\u0017eP5RT\u0007tsC%\u0016\u0082\u0011\u0093R#";
    private static final String xpc_fld0428e = "N";
    private static final String xpc_fld0429b = "\u0004#\u0014Q6\u0088\u0007u";
    private static final String xpc_fld0429e = "N";
    private static final String xpc_fld0430b = "\u0003\u0014y! \u0084H";
    private static final String xpc_fld0430e = "N";
    private static final String xpc_fld0431b = "\t 9(%E\u0087\u00176t\u0003\u0094\u0090\u00838 0\u009f";
    private static final String xpc_fld0431e = "N";
    private static final String xpc_fld0432b = "\u0001ae]";
    private static final String xpc_fld0432e = "Y";
    private static final String xpc_fld0433b = "\u0002\u0019Ey";
    private static final String xpc_fld0433e = "N";
    private static final String xpc_fld0434b = "`hBp&X\u0000(2B\u0004Y\u0007\u0017'#g?";
    private static final String xpc_fld0434e = "N";
    private static final String xpc_fld0435b = "\u0005\u0084\u0084\u0014C\u0018cqq@)\u009f";
    private static final String xpc_fld0435e = "N";
    private static final String xpc_fld0436b = "\u0083\u0007\u0019XC\u0000B\u0002U\u0011\u0085$Ct!\u000f";
    private static final String xpc_fld0436e = "N";
    private static final String xpc_fld0437b = "\u0002v\u0091&QgD\t7\u00138F\u009f";
    private static final String xpc_fld0437e = "N";
    private static final String xpc_fld0438b = "\u0087Bw#\tW\u0016\u0012UE5\u0013`AR$\u009f";
    private static final String xpc_fld0438e = "Y";
    private static final String xpc_fld0439b = "\u0005q\u0098Up!d\u00932\u0001/";
    private static final String xpc_fld0439e = "N";
    private static final String xpc_fld0440b = "\u0004UF\u0092#\u0088\u0018 3";
    private static final String xpc_fld0440e = "N";
    private static final String xpc_fld0441b = "\u0004A\u0003ePrx\u0011l";
    private static final String xpc_fld0441e = "N";
    private static final String xpc_fld0442b = "\u0007\u0093$bX!5\u0004\u0085\u00031xuefHT";
    private static final String xpc_fld0442e = "N";
    private static final String xpc_fld0443b = "\u0012@i\"95\u0017QV\u0092\u0093/";
    private static final String xpc_fld0443e = "N";
    private static final String xpc_fld0444b = "PGu'PQas4\u008f";
    private static final String xpc_fld0444e = "N";
    private static final String xpc_fld0445b = "\u0007\u0093\u0001%y\u00076\u0093\u001c";
    private static final String xpc_fld0445e = "N";
    private static final String xpc_fld0446b = "\u0003yi\u0015\u0019 3\u00035\u0006\u0094B\u0003";
    private static final String xpc_fld0446e = "N";
    private static final String xpc_fld0447b = "'qs\u0006i";
    private static final String xpc_fld0447e = "N";
    private static final String xpc_fld0448b = "Ss\u001092\u0013g\u0084V\u0001";
    private static final String xpc_fld0448e = "N";
    private static final String xpc_fld0449b = "\u0005\tr\u0007x\u0094m";
    private static final String xpc_fld0449e = "N";
    private static final String xpc_fld0450b = "\u0002\u0082wuh\u0087a8\u0003\u0001b";
    private static final String xpc_fld0450e = "N";
    private static final String xpc_fld0451b = "%\u00179\u0004\r";
    private static final String xpc_fld0451e = "N";
    private static final String xpc_fld0452b = "\u0005T\u0096\u0017\u0004\u0011!'V'r";
    private static final String xpc_fld0452e = "N";
    private static final String xpc_fld0453b = "\u0096us)g\u0001\"\u0011c\u0082\u00911\u0091\u0004a\u0000\u0010\u0098";
    private static final String xpc_fld0453e = "Y";
    private static final String xpc_fld0454b = "\u000c";
    private static final String xpc_fld0454e = "N";
    private static final String xpc_fld0455b = "\u0008Q\u0005\u0099\u0087\u0088\u0016\u0082\u0091\u00117 D(\u0008i\u008f";
    private static final String xpc_fld0455e = "N";
    private static final String xpc_fld0456b = "\u0001V\u0002";
    private static final String xpc_fld0456e = "N";
    private static final String xpc_fld0457b = "\u0003";
    private static final String xpc_fld0457e = "N";
    private static final String xpc_fld0458b = "1\u0095\u0007SCx";
    private static final String xpc_fld0458e = "N";
    private static final String xpc_fld0459b = "V5feX\u0006\u0015\u0015\u0018\u0018\u008f";
    private static final String xpc_fld0459e = "N";
    private static final String xpc_fld0460b = "x4X\u00953S e\u0088Xy\t \u0093\u000f";
    private static final String xpc_fld0460e = "N";
    private static final String xpc_fld0461b = "\u0002\u0014h9,";
    private static final String xpc_fld0461e = "N";
    private static final String xpc_fld0462b = "\tR9\u0011\u0094T\u0085%a\u0003\u00083\u0015y)\u0000\u0097W\u009f";
    private static final String xpc_fld0462e = "Y";
    private static final String xpc_fld0463b = "\u0004\u00073F\u0005d\u0086\u0095";
    private static final String xpc_fld0463e = "N";
    private static final String xpc_fld0464b = "\u0001Qsp\u0088\u0012\u0096\u0084 c\u0090I\u0008\u0080";
    private static final String xpc_fld0464e = "N";
    private static final String xpc_fld0465b = "\u00087\u0093q\u0080\u0006\u0095p\u0085'XC\u0015V\u0013\u0098";
    private static final String xpc_fld0465e = "Y";
    private static final String xpc_fld0466b = "\u0006f\u0090";
    private static final String xpc_fld0466e = "N";
    private static final String xpc_fld0467b = "\"\u0016tgw\u0015\u0011\"\u0097\u0017\u0016)\u0005!rd\u007f";
    private static final String xpc_fld0467e = "N";
    private static final String xpc_fld0468b = "\u0002\u0095\u0092#\u0006\u0096";
    private static final String xpc_fld0468e = "Y";
    private static final String xpc_fld0469b = "Rq\u0008\u0014u\"8tr?";
    private static final String xpc_fld0469e = "N";
    private static final String xpc_fld0470b = "\u0003\u0083\u0013\u00146\u0086\u0098\u009d";
    private static final String xpc_fld0470e = "N";
    private static final String xpc_fld0471b = "\u0000";
    private static final String xpc_fld0471e = "Y";
    private static final String xpc_fld0472b = "\u0001GGS\u0006$\u00073X6EIuT$7\u008f";
    private static final String xpc_fld0472e = "N";
    private static final String xpc_fld0473b = "\u0004E\u0010\u0093S'6\u00044gg\u0091\u0010\u000f";
    private static final String xpc_fld0473e = "N";
    private static final String xpc_fld0474b = "\u0013)\\";
    private static final String xpc_fld0474e = "Y";
    private static final String xpc_fld0475b = "\u0000\u00875S\u0016Wr\u001c";
    private static final String xpc_fld0475e = "N";
    private static final String xpc_fld0476b = "\u0006rbi";
    private static final String xpc_fld0476e = "N";
    private static final String xpc_fld0477b = "\u0003\u0006\u0015\u0016\u0019)\u0004}";
    private static final String xpc_fld0477e = "N";
    private static final String xpc_fld0478b = "\u0002s%Tu8R";
    private static final String xpc_fld0478e = "N";
    private static final String xpc_fld0479b = "2%wt2\u0013\u0088\u0097'a\u0000w\u0089\u00814O";
    private static final String xpc_fld0479e = "N";
    private static final String xpc_fld0480b = "tYS\u0099Aey\u0010P&\u0085$\u0003\u0017";
    private static final String xpc_fld0480e = "N";
    private static final String xpc_fld0481b = "y\u0007E\u0090\u0007aCd&XG\u0093\u0093P5\u0012%XO";
    private static final String xpc_fld0481e = "N";
    private static final String xpc_fld0482b = "\u0004\u0099)%\u0094A\u0011QY\r";
    private static final String xpc_fld0482e = "N";
    private static final String xpc_fld0483b = "\u0003#B\u0001(\u0014L";
    private static final String xpc_fld0483e = "N";
    private static final String xpc_fld0484b = "\u0005w\u00128aG8\u0082(%$";
    private static final String xpc_fld0484e = "N";
    private static final String xpc_fld0485b = "\u0084&\t";
    private static final String xpc_fld0485e = "N";
    private static final String xpc_fld0486b = "\u0004X8\u0000u4\u0096YY";
    private static final String xpc_fld0486e = "N";
    private static final String xpc_fld0487b = "\u0007\u0004\u0016A\u0097I\u0004\u0008\u0085\u0094f\u0081\u0010\u000f";
    private static final String xpc_fld0487e = "N";
    private static final String xpc_fld0488b = "\u0001\u0088\u0085\u0089\u0098\u0011\u0000hu\u0087\u0090ht";
    private static final String xpc_fld0488e = "N";
    private static final String xpc_fld0489b = "\t\u0095\u0005g\u0082c1'\u0013H)FI!IIE\u00887";
    private static final String xpc_fld0489e = "Y";
    private static final String xpc_fld0490b = "#\u0096\u0097c ";
    private static final String xpc_fld0490e = "N";
    private static final String xpc_fld0491b = "f\u0012\u0086CG\u0093`\u0019dX)C\u000f";
    private static final String xpc_fld0491e = "N";
    private static final String xpc_fld0492b = "4#\u0016\u0018&WL";
    private static final String xpc_fld0492e = "N";
    private static final String xpc_fld0493b = "y\u0006\u0096E\u0092x\u0086!\u0086Y5(4\u0094v";
    private static final String xpc_fld0493e = "N";
    private static final String xpc_fld0494b = "Q2\u0099S(aV\u0015 \u001f";
    private static final String xpc_fld0494e = "N";
    private static final String xpc_fld0495b = "dh\u0082W9\u0015\u0010f\u0098P'h";
    private static final String xpc_fld0495e = "N";
    private static final String xpc_fld0496b = "\u0005R=";
    private static final String xpc_fld0496e = "N";
    private static final String xpc_fld0497b = "\u0006f2\u0082(a eEX8\u0012\u0004";
    private static final String xpc_fld0497e = "N";
    private static final String xpc_fld0498b = "\u0001\u0089D\u0094";
    private static final String xpc_fld0498e = "Y";
    private static final String xpc_fld0499b = "\u00064\u0013\u0012\u0016@&\u00070\u0087\u00914_";
    private static final String xpc_fld0499e = "N";
    private int filler_1 = 0;

    
    // VMG: program has 1498 fields, deferring VMG emission to Phase 1.5h (compact layout blob)

    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
        do_check_part2();
        do_check_part3();
        do_check_part4();
        do_check_part5();
        do_check_part6();
        do_check_part7();
        do_check_part8();
        do_check_part9();
        do_check_part10();
        do_check_part11();
        do_check_part12();
        do_check_part13();
        do_check_part14();
        do_check_part15();
        do_check_part16();
        do_check_part17();
        do_check_part18();
        do_check_part19();
        do_check_part20();
        do_check_part21();
        do_check_part22();
    }
    private void do_check_part0() {
        fld0001b = CobolIntrinsics.truncateToField(fld0001b.add(CobolIntrinsics.toBigDecimal(fld0001a)), 1, 0, false);
        fld0002b = CobolIntrinsics.truncateToField(fld0002b.subtract(CobolIntrinsics.toBigDecimal(fld0002a)), 32, 27, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0003b.add(CobolIntrinsics.toBigDecimal(fld0003a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0003b = CobolIntrinsics.truncateToField(_ar, 18, 8, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0003e.set(String.valueOf("Y"));
        }
        fld0004b = CobolIntrinsics.truncateToField(fld0004b.subtract(CobolIntrinsics.toBigDecimal(fld0004a)), 6, 1, false);
        fld0005b = CobolIntrinsics.truncateToField(fld0005b.add(CobolIntrinsics.toBigDecimal(fld0005a)), 12, 3, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0006b.subtract(CobolIntrinsics.toBigDecimal(fld0006a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0006b = CobolIntrinsics.truncateToField(_sr, 34, 31, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0006e.set(String.valueOf("Y"));
        }
        fld0007b = CobolIntrinsics.truncateToField(fld0007b.add(CobolIntrinsics.toBigDecimal(fld0007a)), 10, 2, true);
        fld0008b = CobolIntrinsics.truncateToField(fld0008b.subtract(CobolIntrinsics.toBigDecimal(fld0008a)), 3, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0009b.add(CobolIntrinsics.toBigDecimal(fld0009a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0009b = CobolIntrinsics.truncateToField(_ar, 33, 28, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0009e.set(String.valueOf("Y"));
        }
        fld0010b = CobolIntrinsics.truncateToField(fld0010b.subtract(CobolIntrinsics.toBigDecimal(fld0010a)), 15, 6, true);
        fld0011b = CobolIntrinsics.truncateToField(fld0011b.add(CobolIntrinsics.toBigDecimal(fld0011a)), 33, 29, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0012b.subtract(CobolIntrinsics.toBigDecimal(fld0012a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0012b = CobolIntrinsics.truncateToField(_sr, 27, 19, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0012e.set(String.valueOf("Y"));
        }
        fld0013b = CobolIntrinsics.truncateToField(fld0013b.add(CobolIntrinsics.toBigDecimal(fld0013a)), 9, 2, false);
        fld0014b = CobolIntrinsics.truncateToField(fld0014b.subtract(CobolIntrinsics.toBigDecimal(fld0014a)), 7, 1, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0015b.add(CobolIntrinsics.toBigDecimal(fld0015a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0015b = CobolIntrinsics.truncateToField(_ar, 18, 8, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0015e.set(String.valueOf("Y"));
        }
        fld0016b = CobolIntrinsics.truncateToField(fld0016b.subtract(CobolIntrinsics.toBigDecimal(fld0016a)), 16, 6, true);
        fld0017b = CobolIntrinsics.truncateToField(fld0017b.add(CobolIntrinsics.toBigDecimal(fld0017a)), 34, 30, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0018b.subtract(CobolIntrinsics.toBigDecimal(fld0018a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0018b = CobolIntrinsics.truncateToField(_sr, 1, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0018e.set(String.valueOf("Y"));
        }
        fld0019b = CobolIntrinsics.truncateToField(fld0019b.add(CobolIntrinsics.toBigDecimal(fld0019a)), 15, 6, true);
        fld0020b = CobolIntrinsics.truncateToField(fld0020b.subtract(CobolIntrinsics.toBigDecimal(fld0020a)), 20, 11, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0021b.add(CobolIntrinsics.toBigDecimal(fld0021a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0021b = CobolIntrinsics.truncateToField(_ar, 1, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0021e.set(String.valueOf("Y"));
        }
        fld0022b = CobolIntrinsics.truncateToField(fld0022b.subtract(CobolIntrinsics.toBigDecimal(fld0022a)), 28, 21, false);
        fld0023b = CobolIntrinsics.truncateToField(fld0023b.add(CobolIntrinsics.toBigDecimal(fld0023a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0024b.subtract(CobolIntrinsics.toBigDecimal(fld0024a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0024b = CobolIntrinsics.truncateToField(_sr, 15, 6, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0024e.set(String.valueOf("Y"));
        }
        fld0025b = CobolIntrinsics.truncateToField(fld0025b.add(CobolIntrinsics.toBigDecimal(fld0025a)), 9, 2, false);
        fld0026b = CobolIntrinsics.truncateToField(fld0026b.subtract(CobolIntrinsics.toBigDecimal(fld0026a)), 14, 5, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0027b.add(CobolIntrinsics.toBigDecimal(fld0027a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0027b = CobolIntrinsics.truncateToField(_ar, 31, 25, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0027e.set(String.valueOf("Y"));
        }
        fld0028b = CobolIntrinsics.truncateToField(fld0028b.subtract(CobolIntrinsics.toBigDecimal(fld0028a)), 1, 0, true);
        fld0029b = CobolIntrinsics.truncateToField(fld0029b.add(CobolIntrinsics.toBigDecimal(fld0029a)), 26, 17, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0030b.subtract(CobolIntrinsics.toBigDecimal(fld0030a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0030b = CobolIntrinsics.truncateToField(_sr, 26, 18, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0030e.set(String.valueOf("Y"));
        }
        fld0031b = CobolIntrinsics.truncateToField(fld0031b.add(CobolIntrinsics.toBigDecimal(fld0031a)), 26, 18, false);
        fld0032b = CobolIntrinsics.truncateToField(fld0032b.subtract(CobolIntrinsics.toBigDecimal(fld0032a)), 12, 3, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0033b.add(CobolIntrinsics.toBigDecimal(fld0033a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0033b = CobolIntrinsics.truncateToField(_ar, 12, 3, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0033e.set(String.valueOf("Y"));
        }
        fld0034b = CobolIntrinsics.truncateToField(fld0034b.subtract(CobolIntrinsics.toBigDecimal(fld0034a)), 8, 1, true);
        fld0035b = CobolIntrinsics.truncateToField(fld0035b.add(CobolIntrinsics.toBigDecimal(fld0035a)), 8, 1, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0036b.subtract(CobolIntrinsics.toBigDecimal(fld0036a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0036b = CobolIntrinsics.truncateToField(_sr, 32, 27, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0036e.set(String.valueOf("Y"));
        }
        fld0037b = CobolIntrinsics.truncateToField(fld0037b.add(CobolIntrinsics.toBigDecimal(fld0037a)), 5, 0, true);
        fld0038b = CobolIntrinsics.truncateToField(fld0038b.subtract(CobolIntrinsics.toBigDecimal(fld0038a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0039b.add(CobolIntrinsics.toBigDecimal(fld0039a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0039b = CobolIntrinsics.truncateToField(_ar, 7, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0039e.set(String.valueOf("Y"));
        }
        fld0040b = CobolIntrinsics.truncateToField(fld0040b.subtract(CobolIntrinsics.toBigDecimal(fld0040a)), 3, 0, true);
        fld0041b = CobolIntrinsics.truncateToField(fld0041b.add(CobolIntrinsics.toBigDecimal(fld0041a)), 19, 9, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0042b.subtract(CobolIntrinsics.toBigDecimal(fld0042a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0042b = CobolIntrinsics.truncateToField(_sr, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0042e.set(String.valueOf("Y"));
        }
        fld0043b = CobolIntrinsics.truncateToField(fld0043b.add(CobolIntrinsics.toBigDecimal(fld0043a)), 34, 30, false);
        fld0044b = CobolIntrinsics.truncateToField(fld0044b.subtract(CobolIntrinsics.toBigDecimal(fld0044a)), 13, 4, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0045b.add(CobolIntrinsics.toBigDecimal(fld0045a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0045b = CobolIntrinsics.truncateToField(_ar, 14, 5, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0045e.set(String.valueOf("Y"));
        }
        fld0046b = CobolIntrinsics.truncateToField(fld0046b.subtract(CobolIntrinsics.toBigDecimal(fld0046a)), 32, 27, false);
        fld0047b = CobolIntrinsics.truncateToField(fld0047b.add(CobolIntrinsics.toBigDecimal(fld0047a)), 18, 8, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0048b.subtract(CobolIntrinsics.toBigDecimal(fld0048a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0048b = CobolIntrinsics.truncateToField(_sr, 6, 1, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0048e.set(String.valueOf("Y"));
        }
        fld0049b = CobolIntrinsics.truncateToField(fld0049b.add(CobolIntrinsics.toBigDecimal(fld0049a)), 37, 36, false);
        fld0050b = CobolIntrinsics.truncateToField(fld0050b.subtract(CobolIntrinsics.toBigDecimal(fld0050a)), 15, 6, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0051b.add(CobolIntrinsics.toBigDecimal(fld0051a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0051b = CobolIntrinsics.truncateToField(_ar, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0051e.set(String.valueOf("Y"));
        }
        fld0052b = CobolIntrinsics.truncateToField(fld0052b.subtract(CobolIntrinsics.toBigDecimal(fld0052a)), 20, 11, false);
        fld0053b = CobolIntrinsics.truncateToField(fld0053b.add(CobolIntrinsics.toBigDecimal(fld0053a)), 13, 4, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0054b.subtract(CobolIntrinsics.toBigDecimal(fld0054a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0054b = CobolIntrinsics.truncateToField(_sr, 12, 3, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0054e.set(String.valueOf("Y"));
        }
        fld0055b = CobolIntrinsics.truncateToField(fld0055b.add(CobolIntrinsics.toBigDecimal(fld0055a)), 25, 17, false);
        fld0056b = CobolIntrinsics.truncateToField(fld0056b.subtract(CobolIntrinsics.toBigDecimal(fld0056a)), 10, 2, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0057b.add(CobolIntrinsics.toBigDecimal(fld0057a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0057b = CobolIntrinsics.truncateToField(_ar, 2, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0057e.set(String.valueOf("Y"));
        }
        fld0058b = CobolIntrinsics.truncateToField(fld0058b.subtract(CobolIntrinsics.toBigDecimal(fld0058a)), 13, 4, true);
        fld0059b = CobolIntrinsics.truncateToField(fld0059b.add(CobolIntrinsics.toBigDecimal(fld0059a)), 23, 14, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0060b.subtract(CobolIntrinsics.toBigDecimal(fld0060a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0060b = CobolIntrinsics.truncateToField(_sr, 6, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0060e.set(String.valueOf("Y"));
        }
        fld0061b = CobolIntrinsics.truncateToField(fld0061b.add(CobolIntrinsics.toBigDecimal(fld0061a)), 31, 25, false);
        fld0062b = CobolIntrinsics.truncateToField(fld0062b.subtract(CobolIntrinsics.toBigDecimal(fld0062a)), 22, 13, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0063b.add(CobolIntrinsics.toBigDecimal(fld0063a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0063b = CobolIntrinsics.truncateToField(_ar, 27, 19, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0063e.set(String.valueOf("Y"));
        }
        fld0064b = CobolIntrinsics.truncateToField(fld0064b.subtract(CobolIntrinsics.toBigDecimal(fld0064a)), 4, 0, true);
        fld0065b = CobolIntrinsics.truncateToField(fld0065b.add(CobolIntrinsics.toBigDecimal(fld0065a)), 4, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0066b.subtract(CobolIntrinsics.toBigDecimal(fld0066a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0066b = CobolIntrinsics.truncateToField(_sr, 32, 27, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0066e.set(String.valueOf("Y"));
        }
        fld0067b = CobolIntrinsics.truncateToField(fld0067b.add(CobolIntrinsics.toBigDecimal(fld0067a)), 1, 0, true);
        fld0068b = CobolIntrinsics.truncateToField(fld0068b.subtract(CobolIntrinsics.toBigDecimal(fld0068a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0069b.add(CobolIntrinsics.toBigDecimal(fld0069a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0069b = CobolIntrinsics.truncateToField(_ar, 3, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0069e.set(String.valueOf("Y"));
        }
        fld0070b = CobolIntrinsics.truncateToField(fld0070b.subtract(CobolIntrinsics.toBigDecimal(fld0070a)), 7, 1, true);
        fld0071b = CobolIntrinsics.truncateToField(fld0071b.add(CobolIntrinsics.toBigDecimal(fld0071a)), 4, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0072b.subtract(CobolIntrinsics.toBigDecimal(fld0072a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0072b = CobolIntrinsics.truncateToField(_sr, 24, 15, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0072e.set(String.valueOf("Y"));
        }
        fld0073b = CobolIntrinsics.truncateToField(fld0073b.add(CobolIntrinsics.toBigDecimal(fld0073a)), 26, 18, false);
        fld0074b = CobolIntrinsics.truncateToField(fld0074b.subtract(CobolIntrinsics.toBigDecimal(fld0074a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0075b.add(CobolIntrinsics.toBigDecimal(fld0075a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0075b = CobolIntrinsics.truncateToField(_ar, 8, 1, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0075e.set(String.valueOf("Y"));
        }
        fld0076b = CobolIntrinsics.truncateToField(fld0076b.subtract(CobolIntrinsics.toBigDecimal(fld0076a)), 36, 34, false);
        fld0077b = CobolIntrinsics.truncateToField(fld0077b.add(CobolIntrinsics.toBigDecimal(fld0077a)), 33, 28, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0078b.subtract(CobolIntrinsics.toBigDecimal(fld0078a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0078b = CobolIntrinsics.truncateToField(_sr, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0078e.set(String.valueOf("Y"));
        }
        fld0079b = CobolIntrinsics.truncateToField(fld0079b.add(CobolIntrinsics.toBigDecimal(fld0079a)), 3, 0, true);
        fld0080b = CobolIntrinsics.truncateToField(fld0080b.subtract(CobolIntrinsics.toBigDecimal(fld0080a)), 13, 4, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0081b.add(CobolIntrinsics.toBigDecimal(fld0081a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0081b = CobolIntrinsics.truncateToField(_ar, 13, 4, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0081e.set(String.valueOf("Y"));
        }
        fld0082b = CobolIntrinsics.truncateToField(fld0082b.subtract(CobolIntrinsics.toBigDecimal(fld0082a)), 29, 22, false);
        fld0083b = CobolIntrinsics.truncateToField(fld0083b.add(CobolIntrinsics.toBigDecimal(fld0083a)), 9, 2, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0084b.subtract(CobolIntrinsics.toBigDecimal(fld0084a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0084b = CobolIntrinsics.truncateToField(_sr, 15, 6, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0084e.set(String.valueOf("Y"));
        }
        fld0085b = CobolIntrinsics.truncateToField(fld0085b.add(CobolIntrinsics.toBigDecimal(fld0085a)), 16, 6, false);
        fld0086b = CobolIntrinsics.truncateToField(fld0086b.subtract(CobolIntrinsics.toBigDecimal(fld0086a)), 21, 11, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0087b.add(CobolIntrinsics.toBigDecimal(fld0087a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0087b = CobolIntrinsics.truncateToField(_ar, 4, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0087e.set(String.valueOf("Y"));
        }
        fld0088b = CobolIntrinsics.truncateToField(fld0088b.subtract(CobolIntrinsics.toBigDecimal(fld0088a)), 12, 3, false);
        fld0089b = CobolIntrinsics.truncateToField(fld0089b.add(CobolIntrinsics.toBigDecimal(fld0089a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0090b.subtract(CobolIntrinsics.toBigDecimal(fld0090a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0090b = CobolIntrinsics.truncateToField(_sr, 11, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0090e.set(String.valueOf("Y"));
        }
        fld0091b = CobolIntrinsics.truncateToField(fld0091b.add(CobolIntrinsics.toBigDecimal(fld0091a)), 26, 18, false);
        fld0092b = CobolIntrinsics.truncateToField(fld0092b.subtract(CobolIntrinsics.toBigDecimal(fld0092a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0093b.add(CobolIntrinsics.toBigDecimal(fld0093a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0093b = CobolIntrinsics.truncateToField(_ar, 30, 23, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0093e.set(String.valueOf("Y"));
        }
        fld0094b = CobolIntrinsics.truncateToField(fld0094b.subtract(CobolIntrinsics.toBigDecimal(fld0094a)), 20, 10, false);
        fld0095b = CobolIntrinsics.truncateToField(fld0095b.add(CobolIntrinsics.toBigDecimal(fld0095a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0096b.subtract(CobolIntrinsics.toBigDecimal(fld0096a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0096b = CobolIntrinsics.truncateToField(_sr, 33, 28, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0096e.set(String.valueOf("Y"));
        }
        fld0097b = CobolIntrinsics.truncateToField(fld0097b.add(CobolIntrinsics.toBigDecimal(fld0097a)), 29, 22, false);
        fld0098b = CobolIntrinsics.truncateToField(fld0098b.subtract(CobolIntrinsics.toBigDecimal(fld0098a)), 12, 4, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0099b.add(CobolIntrinsics.toBigDecimal(fld0099a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0099b = CobolIntrinsics.truncateToField(_ar, 11, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0099e.set(String.valueOf("Y"));
        }
        fld0100b = CobolIntrinsics.truncateToField(fld0100b.subtract(CobolIntrinsics.toBigDecimal(fld0100a)), 23, 14, false);
        fld0101b = CobolIntrinsics.truncateToField(fld0101b.add(CobolIntrinsics.toBigDecimal(fld0101a)), 9, 2, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0102b.subtract(CobolIntrinsics.toBigDecimal(fld0102a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0102b = CobolIntrinsics.truncateToField(_sr, 23, 14, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0102e.set(String.valueOf("Y"));
        }
        fld0103b = CobolIntrinsics.truncateToField(fld0103b.add(CobolIntrinsics.toBigDecimal(fld0103a)), 1, 0, false);
        fld0104b = CobolIntrinsics.truncateToField(fld0104b.subtract(CobolIntrinsics.toBigDecimal(fld0104a)), 18, 8, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0105b.add(CobolIntrinsics.toBigDecimal(fld0105a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0105b = CobolIntrinsics.truncateToField(_ar, 10, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0105e.set(String.valueOf("Y"));
        }
        fld0106b = CobolIntrinsics.truncateToField(fld0106b.subtract(CobolIntrinsics.toBigDecimal(fld0106a)), 10, 2, true);
        fld0107b = CobolIntrinsics.truncateToField(fld0107b.add(CobolIntrinsics.toBigDecimal(fld0107a)), 27, 19, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0108b.subtract(CobolIntrinsics.toBigDecimal(fld0108a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0108b = CobolIntrinsics.truncateToField(_sr, 10, 2, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0108e.set(String.valueOf("Y"));
        }
        fld0109b = CobolIntrinsics.truncateToField(fld0109b.add(CobolIntrinsics.toBigDecimal(fld0109a)), 34, 30, false);
        fld0110b = CobolIntrinsics.truncateToField(fld0110b.subtract(CobolIntrinsics.toBigDecimal(fld0110a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0111b.add(CobolIntrinsics.toBigDecimal(fld0111a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0111b = CobolIntrinsics.truncateToField(_ar, 19, 9, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0111e.set(String.valueOf("Y"));
        }
        fld0112b = CobolIntrinsics.truncateToField(fld0112b.subtract(CobolIntrinsics.toBigDecimal(fld0112a)), 10, 2, true);
        fld0113b = CobolIntrinsics.truncateToField(fld0113b.add(CobolIntrinsics.toBigDecimal(fld0113a)), 4, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0114b.subtract(CobolIntrinsics.toBigDecimal(fld0114a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0114b = CobolIntrinsics.truncateToField(_sr, 6, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0114e.set(String.valueOf("Y"));
        }
        fld0115b = CobolIntrinsics.truncateToField(fld0115b.add(CobolIntrinsics.toBigDecimal(fld0115a)), 11, 3, true);
        fld0116b = CobolIntrinsics.truncateToField(fld0116b.subtract(CobolIntrinsics.toBigDecimal(fld0116a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0117b.add(CobolIntrinsics.toBigDecimal(fld0117a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0117b = CobolIntrinsics.truncateToField(_ar, 5, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0117e.set(String.valueOf("Y"));
        }
        fld0118b = CobolIntrinsics.truncateToField(fld0118b.subtract(CobolIntrinsics.toBigDecimal(fld0118a)), 3, 0, true);
        fld0119b = CobolIntrinsics.truncateToField(fld0119b.add(CobolIntrinsics.toBigDecimal(fld0119a)), 9, 2, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0120b.subtract(CobolIntrinsics.toBigDecimal(fld0120a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0120b = CobolIntrinsics.truncateToField(_sr, 2, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0120e.set(String.valueOf("Y"));
        }
        fld0121b = CobolIntrinsics.truncateToField(fld0121b.add(CobolIntrinsics.toBigDecimal(fld0121a)), 12, 3, true);
        fld0122b = CobolIntrinsics.truncateToField(fld0122b.subtract(CobolIntrinsics.toBigDecimal(fld0122a)), 10, 2, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0123b.add(CobolIntrinsics.toBigDecimal(fld0123a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0123b = CobolIntrinsics.truncateToField(_ar, 28, 21, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0123e.set(String.valueOf("Y"));
        }
        fld0124b = CobolIntrinsics.truncateToField(fld0124b.subtract(CobolIntrinsics.toBigDecimal(fld0124a)), 16, 6, true);
        fld0125b = CobolIntrinsics.truncateToField(fld0125b.add(CobolIntrinsics.toBigDecimal(fld0125a)), 24, 15, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0126b.subtract(CobolIntrinsics.toBigDecimal(fld0126a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0126b = CobolIntrinsics.truncateToField(_sr, 8, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0126e.set(String.valueOf("Y"));
        }
        fld0127b = CobolIntrinsics.truncateToField(fld0127b.add(CobolIntrinsics.toBigDecimal(fld0127a)), 33, 28, false);
        fld0128b = CobolIntrinsics.truncateToField(fld0128b.subtract(CobolIntrinsics.toBigDecimal(fld0128a)), 10, 2, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0129b.add(CobolIntrinsics.toBigDecimal(fld0129a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0129b = CobolIntrinsics.truncateToField(_ar, 23, 14, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0129e.set(String.valueOf("Y"));
        }
        fld0130b = CobolIntrinsics.truncateToField(fld0130b.subtract(CobolIntrinsics.toBigDecimal(fld0130a)), 11, 3, false);
        fld0131b = CobolIntrinsics.truncateToField(fld0131b.add(CobolIntrinsics.toBigDecimal(fld0131a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0132b.subtract(CobolIntrinsics.toBigDecimal(fld0132a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0132b = CobolIntrinsics.truncateToField(_sr, 8, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0132e.set(String.valueOf("Y"));
        }
        fld0133b = CobolIntrinsics.truncateToField(fld0133b.add(CobolIntrinsics.toBigDecimal(fld0133a)), 9, 2, true);
        fld0134b = CobolIntrinsics.truncateToField(fld0134b.subtract(CobolIntrinsics.toBigDecimal(fld0134a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0135b.add(CobolIntrinsics.toBigDecimal(fld0135a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0135b = CobolIntrinsics.truncateToField(_ar, 9, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0135e.set(String.valueOf("Y"));
        }
        fld0136b = CobolIntrinsics.truncateToField(fld0136b.subtract(CobolIntrinsics.toBigDecimal(fld0136a)), 27, 19, false);
        fld0137b = CobolIntrinsics.truncateToField(fld0137b.add(CobolIntrinsics.toBigDecimal(fld0137a)), 35, 32, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0138b.subtract(CobolIntrinsics.toBigDecimal(fld0138a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0138b = CobolIntrinsics.truncateToField(_sr, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0138e.set(String.valueOf("Y"));
        }
        fld0139b = CobolIntrinsics.truncateToField(fld0139b.add(CobolIntrinsics.toBigDecimal(fld0139a)), 31, 25, false);
        fld0140b = CobolIntrinsics.truncateToField(fld0140b.subtract(CobolIntrinsics.toBigDecimal(fld0140a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0141b.add(CobolIntrinsics.toBigDecimal(fld0141a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0141b = CobolIntrinsics.truncateToField(_ar, 7, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0141e.set(String.valueOf("Y"));
        }
        fld0142b = CobolIntrinsics.truncateToField(fld0142b.subtract(CobolIntrinsics.toBigDecimal(fld0142a)), 4, 0, true);
        fld0143b = CobolIntrinsics.truncateToField(fld0143b.add(CobolIntrinsics.toBigDecimal(fld0143a)), 7, 1, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0144b.subtract(CobolIntrinsics.toBigDecimal(fld0144a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0144b = CobolIntrinsics.truncateToField(_sr, 8, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0144e.set(String.valueOf("Y"));
        }
        fld0145b = CobolIntrinsics.truncateToField(fld0145b.add(CobolIntrinsics.toBigDecimal(fld0145a)), 15, 6, false);
        fld0146b = CobolIntrinsics.truncateToField(fld0146b.subtract(CobolIntrinsics.toBigDecimal(fld0146a)), 22, 13, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0147b.add(CobolIntrinsics.toBigDecimal(fld0147a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0147b = CobolIntrinsics.truncateToField(_ar, 15, 5, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0147e.set(String.valueOf("Y"));
        }
        fld0148b = CobolIntrinsics.truncateToField(fld0148b.subtract(CobolIntrinsics.toBigDecimal(fld0148a)), 12, 4, false);
        fld0149b = CobolIntrinsics.truncateToField(fld0149b.add(CobolIntrinsics.toBigDecimal(fld0149a)), 2, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0150b.subtract(CobolIntrinsics.toBigDecimal(fld0150a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0150b = CobolIntrinsics.truncateToField(_sr, 37, 36, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0150e.set(String.valueOf("Y"));
        }
        fld0151b = CobolIntrinsics.truncateToField(fld0151b.add(CobolIntrinsics.toBigDecimal(fld0151a)), 29, 22, false);
        fld0152b = CobolIntrinsics.truncateToField(fld0152b.subtract(CobolIntrinsics.toBigDecimal(fld0152a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0153b.add(CobolIntrinsics.toBigDecimal(fld0153a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0153b = CobolIntrinsics.truncateToField(_ar, 29, 22, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0153e.set(String.valueOf("Y"));
        }
        fld0154b = CobolIntrinsics.truncateToField(fld0154b.subtract(CobolIntrinsics.toBigDecimal(fld0154a)), 17, 7, false);
        fld0155b = CobolIntrinsics.truncateToField(fld0155b.add(CobolIntrinsics.toBigDecimal(fld0155a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0156b.subtract(CobolIntrinsics.toBigDecimal(fld0156a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0156b = CobolIntrinsics.truncateToField(_sr, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0156e.set(String.valueOf("Y"));
        }
        fld0157b = CobolIntrinsics.truncateToField(fld0157b.add(CobolIntrinsics.toBigDecimal(fld0157a)), 16, 6, false);
        fld0158b = CobolIntrinsics.truncateToField(fld0158b.subtract(CobolIntrinsics.toBigDecimal(fld0158a)), 23, 14, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0159b.add(CobolIntrinsics.toBigDecimal(fld0159a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0159b = CobolIntrinsics.truncateToField(_ar, 24, 15, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0159e.set(String.valueOf("Y"));
        }
        fld0160b = CobolIntrinsics.truncateToField(fld0160b.subtract(CobolIntrinsics.toBigDecimal(fld0160a)), 7, 1, false);
        fld0161b = CobolIntrinsics.truncateToField(fld0161b.add(CobolIntrinsics.toBigDecimal(fld0161a)), 27, 19, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0162b.subtract(CobolIntrinsics.toBigDecimal(fld0162a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0162b = CobolIntrinsics.truncateToField(_sr, 21, 11, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0162e.set(String.valueOf("Y"));
        }
        fld0163b = CobolIntrinsics.truncateToField(fld0163b.add(CobolIntrinsics.toBigDecimal(fld0163a)), 24, 15, false);
        fld0164b = CobolIntrinsics.truncateToField(fld0164b.subtract(CobolIntrinsics.toBigDecimal(fld0164a)), 4, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0165b.add(CobolIntrinsics.toBigDecimal(fld0165a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0165b = CobolIntrinsics.truncateToField(_ar, 4, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0165e.set(String.valueOf("Y"));
        }
        fld0166b = CobolIntrinsics.truncateToField(fld0166b.subtract(CobolIntrinsics.toBigDecimal(fld0166a)), 6, 1, false);
        fld0167b = CobolIntrinsics.truncateToField(fld0167b.add(CobolIntrinsics.toBigDecimal(fld0167a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0168b.subtract(CobolIntrinsics.toBigDecimal(fld0168a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0168b = CobolIntrinsics.truncateToField(_sr, 16, 6, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0168e.set(String.valueOf("Y"));
        }
        fld0169b = CobolIntrinsics.truncateToField(fld0169b.add(CobolIntrinsics.toBigDecimal(fld0169a)), 26, 18, false);
        fld0170b = CobolIntrinsics.truncateToField(fld0170b.subtract(CobolIntrinsics.toBigDecimal(fld0170a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0171b.add(CobolIntrinsics.toBigDecimal(fld0171a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0171b = CobolIntrinsics.truncateToField(_ar, 16, 6, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0171e.set(String.valueOf("Y"));
        }
        fld0172b = CobolIntrinsics.truncateToField(fld0172b.subtract(CobolIntrinsics.toBigDecimal(fld0172a)), 34, 30, false);
    }
    private void do_check_part1() {
        fld0173b = CobolIntrinsics.truncateToField(fld0173b.add(CobolIntrinsics.toBigDecimal(fld0173a)), 18, 8, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0174b.subtract(CobolIntrinsics.toBigDecimal(fld0174a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0174b = CobolIntrinsics.truncateToField(_sr, 19, 9, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0174e.set(String.valueOf("Y"));
        }
        fld0175b = CobolIntrinsics.truncateToField(fld0175b.add(CobolIntrinsics.toBigDecimal(fld0175a)), 2, 0, true);
        fld0176b = CobolIntrinsics.truncateToField(fld0176b.subtract(CobolIntrinsics.toBigDecimal(fld0176a)), 11, 3, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0177b.add(CobolIntrinsics.toBigDecimal(fld0177a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0177b = CobolIntrinsics.truncateToField(_ar, 9, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0177e.set(String.valueOf("Y"));
        }
        fld0178b = CobolIntrinsics.truncateToField(fld0178b.subtract(CobolIntrinsics.toBigDecimal(fld0178a)), 11, 3, true);
        fld0179b = CobolIntrinsics.truncateToField(fld0179b.add(CobolIntrinsics.toBigDecimal(fld0179a)), 3, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0180b.subtract(CobolIntrinsics.toBigDecimal(fld0180a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0180b = CobolIntrinsics.truncateToField(_sr, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0180e.set(String.valueOf("Y"));
        }
        fld0181b = CobolIntrinsics.truncateToField(fld0181b.add(CobolIntrinsics.toBigDecimal(fld0181a)), 18, 8, true);
        fld0182b = CobolIntrinsics.truncateToField(fld0182b.subtract(CobolIntrinsics.toBigDecimal(fld0182a)), 24, 15, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0183b.add(CobolIntrinsics.toBigDecimal(fld0183a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0183b = CobolIntrinsics.truncateToField(_ar, 2, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0183e.set(String.valueOf("Y"));
        }
        fld0184b = CobolIntrinsics.truncateToField(fld0184b.subtract(CobolIntrinsics.toBigDecimal(fld0184a)), 8, 1, true);
        fld0185b = CobolIntrinsics.truncateToField(fld0185b.add(CobolIntrinsics.toBigDecimal(fld0185a)), 28, 20, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0186b.subtract(CobolIntrinsics.toBigDecimal(fld0186a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0186b = CobolIntrinsics.truncateToField(_sr, 31, 26, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0186e.set(String.valueOf("Y"));
        }
        fld0187b = CobolIntrinsics.truncateToField(fld0187b.add(CobolIntrinsics.toBigDecimal(fld0187a)), 22, 12, false);
        fld0188b = CobolIntrinsics.truncateToField(fld0188b.subtract(CobolIntrinsics.toBigDecimal(fld0188a)), 28, 21, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0189b.add(CobolIntrinsics.toBigDecimal(fld0189a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0189b = CobolIntrinsics.truncateToField(_ar, 21, 11, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0189e.set(String.valueOf("Y"));
        }
        fld0190b = CobolIntrinsics.truncateToField(fld0190b.subtract(CobolIntrinsics.toBigDecimal(fld0190a)), 23, 14, false);
        fld0191b = CobolIntrinsics.truncateToField(fld0191b.add(CobolIntrinsics.toBigDecimal(fld0191a)), 30, 24, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0192b.subtract(CobolIntrinsics.toBigDecimal(fld0192a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0192b = CobolIntrinsics.truncateToField(_sr, 13, 4, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0192e.set(String.valueOf("Y"));
        }
        fld0193b = CobolIntrinsics.truncateToField(fld0193b.add(CobolIntrinsics.toBigDecimal(fld0193a)), 23, 14, false);
        fld0194b = CobolIntrinsics.truncateToField(fld0194b.subtract(CobolIntrinsics.toBigDecimal(fld0194a)), 24, 15, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0195b.add(CobolIntrinsics.toBigDecimal(fld0195a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0195b = CobolIntrinsics.truncateToField(_ar, 5, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0195e.set(String.valueOf("Y"));
        }
        fld0196b = CobolIntrinsics.truncateToField(fld0196b.subtract(CobolIntrinsics.toBigDecimal(fld0196a)), 6, 1, true);
        fld0197b = CobolIntrinsics.truncateToField(fld0197b.add(CobolIntrinsics.toBigDecimal(fld0197a)), 2, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0198b.subtract(CobolIntrinsics.toBigDecimal(fld0198a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0198b = CobolIntrinsics.truncateToField(_sr, 5, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0198e.set(String.valueOf("Y"));
        }
        fld0199b = CobolIntrinsics.truncateToField(fld0199b.add(CobolIntrinsics.toBigDecimal(fld0199a)), 30, 23, false);
        fld0200b = CobolIntrinsics.truncateToField(fld0200b.subtract(CobolIntrinsics.toBigDecimal(fld0200a)), 17, 7, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0201b.add(CobolIntrinsics.toBigDecimal(fld0201a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0201b = CobolIntrinsics.truncateToField(_ar, 30, 23, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0201e.set(String.valueOf("Y"));
        }
        fld0202b = CobolIntrinsics.truncateToField(fld0202b.subtract(CobolIntrinsics.toBigDecimal(fld0202a)), 35, 32, false);
        fld0203b = CobolIntrinsics.truncateToField(fld0203b.add(CobolIntrinsics.toBigDecimal(fld0203a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0204b.subtract(CobolIntrinsics.toBigDecimal(fld0204a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0204b = CobolIntrinsics.truncateToField(_sr, 8, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0204e.set(String.valueOf("Y"));
        }
        fld0205b = CobolIntrinsics.truncateToField(fld0205b.add(CobolIntrinsics.toBigDecimal(fld0205a)), 24, 15, false);
        fld0206b = CobolIntrinsics.truncateToField(fld0206b.subtract(CobolIntrinsics.toBigDecimal(fld0206a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0207b.add(CobolIntrinsics.toBigDecimal(fld0207a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0207b = CobolIntrinsics.truncateToField(_ar, 28, 21, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0207e.set(String.valueOf("Y"));
        }
        fld0208b = CobolIntrinsics.truncateToField(fld0208b.subtract(CobolIntrinsics.toBigDecimal(fld0208a)), 8, 1, false);
        fld0209b = CobolIntrinsics.truncateToField(fld0209b.add(CobolIntrinsics.toBigDecimal(fld0209a)), 30, 23, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0210b.subtract(CobolIntrinsics.toBigDecimal(fld0210a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0210b = CobolIntrinsics.truncateToField(_sr, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0210e.set(String.valueOf("Y"));
        }
        fld0211b = CobolIntrinsics.truncateToField(fld0211b.add(CobolIntrinsics.toBigDecimal(fld0211a)), 16, 7, true);
        fld0212b = CobolIntrinsics.truncateToField(fld0212b.subtract(CobolIntrinsics.toBigDecimal(fld0212a)), 14, 5, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0213b.add(CobolIntrinsics.toBigDecimal(fld0213a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0213b = CobolIntrinsics.truncateToField(_ar, 28, 21, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0213e.set(String.valueOf("Y"));
        }
        fld0214b = CobolIntrinsics.truncateToField(fld0214b.subtract(CobolIntrinsics.toBigDecimal(fld0214a)), 25, 16, false);
        fld0215b = CobolIntrinsics.truncateToField(fld0215b.add(CobolIntrinsics.toBigDecimal(fld0215a)), 6, 1, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0216b.subtract(CobolIntrinsics.toBigDecimal(fld0216a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0216b = CobolIntrinsics.truncateToField(_sr, 10, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0216e.set(String.valueOf("Y"));
        }
        fld0217b = CobolIntrinsics.truncateToField(fld0217b.add(CobolIntrinsics.toBigDecimal(fld0217a)), 16, 7, true);
        fld0218b = CobolIntrinsics.truncateToField(fld0218b.subtract(CobolIntrinsics.toBigDecimal(fld0218a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0219b.add(CobolIntrinsics.toBigDecimal(fld0219a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0219b = CobolIntrinsics.truncateToField(_ar, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0219e.set(String.valueOf("Y"));
        }
        fld0220b = CobolIntrinsics.truncateToField(fld0220b.subtract(CobolIntrinsics.toBigDecimal(fld0220a)), 5, 0, true);
        fld0221b = CobolIntrinsics.truncateToField(fld0221b.add(CobolIntrinsics.toBigDecimal(fld0221a)), 33, 29, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0222b.subtract(CobolIntrinsics.toBigDecimal(fld0222a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0222b = CobolIntrinsics.truncateToField(_sr, 5, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0222e.set(String.valueOf("Y"));
        }
        fld0223b = CobolIntrinsics.truncateToField(fld0223b.add(CobolIntrinsics.toBigDecimal(fld0223a)), 26, 18, false);
        fld0224b = CobolIntrinsics.truncateToField(fld0224b.subtract(CobolIntrinsics.toBigDecimal(fld0224a)), 14, 5, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0225b.add(CobolIntrinsics.toBigDecimal(fld0225a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0225b = CobolIntrinsics.truncateToField(_ar, 21, 12, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0225e.set(String.valueOf("Y"));
        }
        fld0226b = CobolIntrinsics.truncateToField(fld0226b.subtract(CobolIntrinsics.toBigDecimal(fld0226a)), 8, 1, true);
        fld0227b = CobolIntrinsics.truncateToField(fld0227b.add(CobolIntrinsics.toBigDecimal(fld0227a)), 34, 30, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0228b.subtract(CobolIntrinsics.toBigDecimal(fld0228a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0228b = CobolIntrinsics.truncateToField(_sr, 37, 36, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0228e.set(String.valueOf("Y"));
        }
        fld0229b = CobolIntrinsics.truncateToField(fld0229b.add(CobolIntrinsics.toBigDecimal(fld0229a)), 28, 20, false);
        fld0230b = CobolIntrinsics.truncateToField(fld0230b.subtract(CobolIntrinsics.toBigDecimal(fld0230a)), 2, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0231b.add(CobolIntrinsics.toBigDecimal(fld0231a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0231b = CobolIntrinsics.truncateToField(_ar, 10, 2, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0231e.set(String.valueOf("Y"));
        }
        fld0232b = CobolIntrinsics.truncateToField(fld0232b.subtract(CobolIntrinsics.toBigDecimal(fld0232a)), 31, 25, false);
        fld0233b = CobolIntrinsics.truncateToField(fld0233b.add(CobolIntrinsics.toBigDecimal(fld0233a)), 12, 4, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0234b.subtract(CobolIntrinsics.toBigDecimal(fld0234a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0234b = CobolIntrinsics.truncateToField(_sr, 22, 13, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0234e.set(String.valueOf("Y"));
        }
        fld0235b = CobolIntrinsics.truncateToField(fld0235b.add(CobolIntrinsics.toBigDecimal(fld0235a)), 18, 8, true);
        fld0236b = CobolIntrinsics.truncateToField(fld0236b.subtract(CobolIntrinsics.toBigDecimal(fld0236a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0237b.add(CobolIntrinsics.toBigDecimal(fld0237a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0237b = CobolIntrinsics.truncateToField(_ar, 33, 29, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0237e.set(String.valueOf("Y"));
        }
        fld0238b = CobolIntrinsics.truncateToField(fld0238b.subtract(CobolIntrinsics.toBigDecimal(fld0238a)), 7, 1, false);
        fld0239b = CobolIntrinsics.truncateToField(fld0239b.add(CobolIntrinsics.toBigDecimal(fld0239a)), 23, 14, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0240b.subtract(CobolIntrinsics.toBigDecimal(fld0240a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0240b = CobolIntrinsics.truncateToField(_sr, 31, 25, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0240e.set(String.valueOf("Y"));
        }
        fld0241b = CobolIntrinsics.truncateToField(fld0241b.add(CobolIntrinsics.toBigDecimal(fld0241a)), 23, 14, false);
        fld0242b = CobolIntrinsics.truncateToField(fld0242b.subtract(CobolIntrinsics.toBigDecimal(fld0242a)), 7, 1, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0243b.add(CobolIntrinsics.toBigDecimal(fld0243a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0243b = CobolIntrinsics.truncateToField(_ar, 33, 28, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0243e.set(String.valueOf("Y"));
        }
        fld0244b = CobolIntrinsics.truncateToField(fld0244b.subtract(CobolIntrinsics.toBigDecimal(fld0244a)), 22, 13, false);
        fld0245b = CobolIntrinsics.truncateToField(fld0245b.add(CobolIntrinsics.toBigDecimal(fld0245a)), 24, 15, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0246b.subtract(CobolIntrinsics.toBigDecimal(fld0246a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0246b = CobolIntrinsics.truncateToField(_sr, 7, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0246e.set(String.valueOf("Y"));
        }
        fld0247b = CobolIntrinsics.truncateToField(fld0247b.add(CobolIntrinsics.toBigDecimal(fld0247a)), 27, 19, false);
        fld0248b = CobolIntrinsics.truncateToField(fld0248b.subtract(CobolIntrinsics.toBigDecimal(fld0248a)), 21, 11, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0249b.add(CobolIntrinsics.toBigDecimal(fld0249a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0249b = CobolIntrinsics.truncateToField(_ar, 25, 16, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0249e.set(String.valueOf("Y"));
        }
        fld0250b = CobolIntrinsics.truncateToField(fld0250b.subtract(CobolIntrinsics.toBigDecimal(fld0250a)), 34, 30, false);
        fld0251b = CobolIntrinsics.truncateToField(fld0251b.add(CobolIntrinsics.toBigDecimal(fld0251a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0252b.subtract(CobolIntrinsics.toBigDecimal(fld0252a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0252b = CobolIntrinsics.truncateToField(_sr, 8, 1, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0252e.set(String.valueOf("Y"));
        }
        fld0253b = CobolIntrinsics.truncateToField(fld0253b.add(CobolIntrinsics.toBigDecimal(fld0253a)), 8, 1, false);
        fld0254b = CobolIntrinsics.truncateToField(fld0254b.subtract(CobolIntrinsics.toBigDecimal(fld0254a)), 9, 2, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0255b.add(CobolIntrinsics.toBigDecimal(fld0255a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0255b = CobolIntrinsics.truncateToField(_ar, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0255e.set(String.valueOf("Y"));
        }
        fld0256b = CobolIntrinsics.truncateToField(fld0256b.subtract(CobolIntrinsics.toBigDecimal(fld0256a)), 34, 30, false);
        fld0257b = CobolIntrinsics.truncateToField(fld0257b.add(CobolIntrinsics.toBigDecimal(fld0257a)), 3, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0258b.subtract(CobolIntrinsics.toBigDecimal(fld0258a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0258b = CobolIntrinsics.truncateToField(_sr, 32, 27, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0258e.set(String.valueOf("Y"));
        }
        fld0259b = CobolIntrinsics.truncateToField(fld0259b.add(CobolIntrinsics.toBigDecimal(fld0259a)), 14, 5, true);
        fld0260b = CobolIntrinsics.truncateToField(fld0260b.subtract(CobolIntrinsics.toBigDecimal(fld0260a)), 22, 13, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0261b.add(CobolIntrinsics.toBigDecimal(fld0261a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0261b = CobolIntrinsics.truncateToField(_ar, 14, 5, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0261e.set(String.valueOf("Y"));
        }
        fld0262b = CobolIntrinsics.truncateToField(fld0262b.subtract(CobolIntrinsics.toBigDecimal(fld0262a)), 26, 17, false);
        fld0263b = CobolIntrinsics.truncateToField(fld0263b.add(CobolIntrinsics.toBigDecimal(fld0263a)), 2, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0264b.subtract(CobolIntrinsics.toBigDecimal(fld0264a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0264b = CobolIntrinsics.truncateToField(_sr, 6, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0264e.set(String.valueOf("Y"));
        }
        fld0265b = CobolIntrinsics.truncateToField(fld0265b.add(CobolIntrinsics.toBigDecimal(fld0265a)), 37, 36, false);
        fld0266b = CobolIntrinsics.truncateToField(fld0266b.subtract(CobolIntrinsics.toBigDecimal(fld0266a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0267b.add(CobolIntrinsics.toBigDecimal(fld0267a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0267b = CobolIntrinsics.truncateToField(_ar, 8, 1, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0267e.set(String.valueOf("Y"));
        }
        fld0268b = CobolIntrinsics.truncateToField(fld0268b.subtract(CobolIntrinsics.toBigDecimal(fld0268a)), 31, 25, false);
        fld0269b = CobolIntrinsics.truncateToField(fld0269b.add(CobolIntrinsics.toBigDecimal(fld0269a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0270b.subtract(CobolIntrinsics.toBigDecimal(fld0270a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0270b = CobolIntrinsics.truncateToField(_sr, 4, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0270e.set(String.valueOf("Y"));
        }
        fld0271b = CobolIntrinsics.truncateToField(fld0271b.add(CobolIntrinsics.toBigDecimal(fld0271a)), 9, 2, false);
        fld0272b = CobolIntrinsics.truncateToField(fld0272b.subtract(CobolIntrinsics.toBigDecimal(fld0272a)), 18, 8, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0273b.add(CobolIntrinsics.toBigDecimal(fld0273a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0273b = CobolIntrinsics.truncateToField(_ar, 16, 6, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0273e.set(String.valueOf("Y"));
        }
        fld0274b = CobolIntrinsics.truncateToField(fld0274b.subtract(CobolIntrinsics.toBigDecimal(fld0274a)), 20, 10, false);
        fld0275b = CobolIntrinsics.truncateToField(fld0275b.add(CobolIntrinsics.toBigDecimal(fld0275a)), 9, 2, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0276b.subtract(CobolIntrinsics.toBigDecimal(fld0276a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0276b = CobolIntrinsics.truncateToField(_sr, 35, 33, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0276e.set(String.valueOf("Y"));
        }
        fld0277b = CobolIntrinsics.truncateToField(fld0277b.add(CobolIntrinsics.toBigDecimal(fld0277a)), 18, 8, false);
        fld0278b = CobolIntrinsics.truncateToField(fld0278b.subtract(CobolIntrinsics.toBigDecimal(fld0278a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0279b.add(CobolIntrinsics.toBigDecimal(fld0279a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0279b = CobolIntrinsics.truncateToField(_ar, 35, 32, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0279e.set(String.valueOf("Y"));
        }
        fld0280b = CobolIntrinsics.truncateToField(fld0280b.subtract(CobolIntrinsics.toBigDecimal(fld0280a)), 27, 19, false);
        fld0281b = CobolIntrinsics.truncateToField(fld0281b.add(CobolIntrinsics.toBigDecimal(fld0281a)), 17, 7, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0282b.subtract(CobolIntrinsics.toBigDecimal(fld0282a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0282b = CobolIntrinsics.truncateToField(_sr, 29, 22, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0282e.set(String.valueOf("Y"));
        }
        fld0283b = CobolIntrinsics.truncateToField(fld0283b.add(CobolIntrinsics.toBigDecimal(fld0283a)), 6, 1, true);
        fld0284b = CobolIntrinsics.truncateToField(fld0284b.subtract(CobolIntrinsics.toBigDecimal(fld0284a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0285b.add(CobolIntrinsics.toBigDecimal(fld0285a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0285b = CobolIntrinsics.truncateToField(_ar, 28, 20, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0285e.set(String.valueOf("Y"));
        }
        fld0286b = CobolIntrinsics.truncateToField(fld0286b.subtract(CobolIntrinsics.toBigDecimal(fld0286a)), 8, 1, false);
        fld0287b = CobolIntrinsics.truncateToField(fld0287b.add(CobolIntrinsics.toBigDecimal(fld0287a)), 6, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0288b.subtract(CobolIntrinsics.toBigDecimal(fld0288a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0288b = CobolIntrinsics.truncateToField(_sr, 33, 29, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0288e.set(String.valueOf("Y"));
        }
        fld0289b = CobolIntrinsics.truncateToField(fld0289b.add(CobolIntrinsics.toBigDecimal(fld0289a)), 21, 11, false);
        fld0290b = CobolIntrinsics.truncateToField(fld0290b.subtract(CobolIntrinsics.toBigDecimal(fld0290a)), 3, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0291b.add(CobolIntrinsics.toBigDecimal(fld0291a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0291b = CobolIntrinsics.truncateToField(_ar, 31, 25, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0291e.set(String.valueOf("Y"));
        }
        fld0292b = CobolIntrinsics.truncateToField(fld0292b.subtract(CobolIntrinsics.toBigDecimal(fld0292a)), 1, 0, false);
        fld0293b = CobolIntrinsics.truncateToField(fld0293b.add(CobolIntrinsics.toBigDecimal(fld0293a)), 11, 3, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0294b.subtract(CobolIntrinsics.toBigDecimal(fld0294a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0294b = CobolIntrinsics.truncateToField(_sr, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0294e.set(String.valueOf("Y"));
        }
        fld0295b = CobolIntrinsics.truncateToField(fld0295b.add(CobolIntrinsics.toBigDecimal(fld0295a)), 8, 1, true);
        fld0296b = CobolIntrinsics.truncateToField(fld0296b.subtract(CobolIntrinsics.toBigDecimal(fld0296a)), 21, 12, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0297b.add(CobolIntrinsics.toBigDecimal(fld0297a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0297b = CobolIntrinsics.truncateToField(_ar, 19, 9, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0297e.set(String.valueOf("Y"));
        }
        fld0298b = CobolIntrinsics.truncateToField(fld0298b.subtract(CobolIntrinsics.toBigDecimal(fld0298a)), 37, 36, false);
        fld0299b = CobolIntrinsics.truncateToField(fld0299b.add(CobolIntrinsics.toBigDecimal(fld0299a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0300b.subtract(CobolIntrinsics.toBigDecimal(fld0300a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0300b = CobolIntrinsics.truncateToField(_sr, 23, 14, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0300e.set(String.valueOf("Y"));
        }
        fld0301b = CobolIntrinsics.truncateToField(fld0301b.add(CobolIntrinsics.toBigDecimal(fld0301a)), 1, 0, true);
        fld0302b = CobolIntrinsics.truncateToField(fld0302b.subtract(CobolIntrinsics.toBigDecimal(fld0302a)), 16, 6, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0303b.add(CobolIntrinsics.toBigDecimal(fld0303a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0303b = CobolIntrinsics.truncateToField(_ar, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0303e.set(String.valueOf("Y"));
        }
        fld0304b = CobolIntrinsics.truncateToField(fld0304b.subtract(CobolIntrinsics.toBigDecimal(fld0304a)), 21, 11, false);
        fld0305b = CobolIntrinsics.truncateToField(fld0305b.add(CobolIntrinsics.toBigDecimal(fld0305a)), 1, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0306b.subtract(CobolIntrinsics.toBigDecimal(fld0306a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0306b = CobolIntrinsics.truncateToField(_sr, 18, 8, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0306e.set(String.valueOf("Y"));
        }
        fld0307b = CobolIntrinsics.truncateToField(fld0307b.add(CobolIntrinsics.toBigDecimal(fld0307a)), 35, 32, false);
        fld0308b = CobolIntrinsics.truncateToField(fld0308b.subtract(CobolIntrinsics.toBigDecimal(fld0308a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0309b.add(CobolIntrinsics.toBigDecimal(fld0309a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0309b = CobolIntrinsics.truncateToField(_ar, 3, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0309e.set(String.valueOf("Y"));
        }
        fld0310b = CobolIntrinsics.truncateToField(fld0310b.subtract(CobolIntrinsics.toBigDecimal(fld0310a)), 15, 6, false);
        fld0311b = CobolIntrinsics.truncateToField(fld0311b.add(CobolIntrinsics.toBigDecimal(fld0311a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0312b.subtract(CobolIntrinsics.toBigDecimal(fld0312a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0312b = CobolIntrinsics.truncateToField(_sr, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0312e.set(String.valueOf("Y"));
        }
        fld0313b = CobolIntrinsics.truncateToField(fld0313b.add(CobolIntrinsics.toBigDecimal(fld0313a)), 14, 5, false);
        fld0314b = CobolIntrinsics.truncateToField(fld0314b.subtract(CobolIntrinsics.toBigDecimal(fld0314a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0315b.add(CobolIntrinsics.toBigDecimal(fld0315a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0315b = CobolIntrinsics.truncateToField(_ar, 26, 17, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0315e.set(String.valueOf("Y"));
        }
        fld0316b = CobolIntrinsics.truncateToField(fld0316b.subtract(CobolIntrinsics.toBigDecimal(fld0316a)), 21, 11, false);
        fld0317b = CobolIntrinsics.truncateToField(fld0317b.add(CobolIntrinsics.toBigDecimal(fld0317a)), 12, 3, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0318b.subtract(CobolIntrinsics.toBigDecimal(fld0318a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0318b = CobolIntrinsics.truncateToField(_sr, 33, 29, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0318e.set(String.valueOf("Y"));
        }
        fld0319b = CobolIntrinsics.truncateToField(fld0319b.add(CobolIntrinsics.toBigDecimal(fld0319a)), 24, 15, false);
        fld0320b = CobolIntrinsics.truncateToField(fld0320b.subtract(CobolIntrinsics.toBigDecimal(fld0320a)), 21, 11, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0321b.add(CobolIntrinsics.toBigDecimal(fld0321a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0321b = CobolIntrinsics.truncateToField(_ar, 25, 16, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0321e.set(String.valueOf("Y"));
        }
        fld0322b = CobolIntrinsics.truncateToField(fld0322b.subtract(CobolIntrinsics.toBigDecimal(fld0322a)), 23, 14, false);
        fld0323b = CobolIntrinsics.truncateToField(fld0323b.add(CobolIntrinsics.toBigDecimal(fld0323a)), 36, 35, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0324b.subtract(CobolIntrinsics.toBigDecimal(fld0324a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0324b = CobolIntrinsics.truncateToField(_sr, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0324e.set(String.valueOf("Y"));
        }
        fld0325b = CobolIntrinsics.truncateToField(fld0325b.add(CobolIntrinsics.toBigDecimal(fld0325a)), 27, 19, false);
        fld0326b = CobolIntrinsics.truncateToField(fld0326b.subtract(CobolIntrinsics.toBigDecimal(fld0326a)), 2, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0327b.add(CobolIntrinsics.toBigDecimal(fld0327a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0327b = CobolIntrinsics.truncateToField(_ar, 8, 1, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0327e.set(String.valueOf("Y"));
        }
        fld0328b = CobolIntrinsics.truncateToField(fld0328b.subtract(CobolIntrinsics.toBigDecimal(fld0328a)), 14, 5, true);
        fld0329b = CobolIntrinsics.truncateToField(fld0329b.add(CobolIntrinsics.toBigDecimal(fld0329a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0330b.subtract(CobolIntrinsics.toBigDecimal(fld0330a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0330b = CobolIntrinsics.truncateToField(_sr, 30, 23, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0330e.set(String.valueOf("Y"));
        }
        fld0331b = CobolIntrinsics.truncateToField(fld0331b.add(CobolIntrinsics.toBigDecimal(fld0331a)), 10, 2, false);
        fld0332b = CobolIntrinsics.truncateToField(fld0332b.subtract(CobolIntrinsics.toBigDecimal(fld0332a)), 13, 4, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0333b.add(CobolIntrinsics.toBigDecimal(fld0333a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0333b = CobolIntrinsics.truncateToField(_ar, 9, 2, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0333e.set(String.valueOf("Y"));
        }
        fld0334b = CobolIntrinsics.truncateToField(fld0334b.subtract(CobolIntrinsics.toBigDecimal(fld0334a)), 12, 3, false);
        fld0335b = CobolIntrinsics.truncateToField(fld0335b.add(CobolIntrinsics.toBigDecimal(fld0335a)), 19, 9, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0336b.subtract(CobolIntrinsics.toBigDecimal(fld0336a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0336b = CobolIntrinsics.truncateToField(_sr, 11, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0336e.set(String.valueOf("Y"));
        }
        fld0337b = CobolIntrinsics.truncateToField(fld0337b.add(CobolIntrinsics.toBigDecimal(fld0337a)), 27, 19, false);
        fld0338b = CobolIntrinsics.truncateToField(fld0338b.subtract(CobolIntrinsics.toBigDecimal(fld0338a)), 20, 10, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0339b.add(CobolIntrinsics.toBigDecimal(fld0339a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0339b = CobolIntrinsics.truncateToField(_ar, 22, 13, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0339e.set(String.valueOf("Y"));
        }
        fld0340b = CobolIntrinsics.truncateToField(fld0340b.subtract(CobolIntrinsics.toBigDecimal(fld0340a)), 13, 4, true);
        fld0341b = CobolIntrinsics.truncateToField(fld0341b.add(CobolIntrinsics.toBigDecimal(fld0341a)), 21, 12, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0342b.subtract(CobolIntrinsics.toBigDecimal(fld0342a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0342b = CobolIntrinsics.truncateToField(_sr, 17, 7, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0342e.set(String.valueOf("Y"));
        }
        fld0343b = CobolIntrinsics.truncateToField(fld0343b.add(CobolIntrinsics.toBigDecimal(fld0343a)), 7, 1, false);
        fld0344b = CobolIntrinsics.truncateToField(fld0344b.subtract(CobolIntrinsics.toBigDecimal(fld0344a)), 33, 29, false);
    }
    private void do_check_part2() {
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0345b.add(CobolIntrinsics.toBigDecimal(fld0345a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0345b = CobolIntrinsics.truncateToField(_ar, 15, 6, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0345e.set(String.valueOf("Y"));
        }
        fld0346b = CobolIntrinsics.truncateToField(fld0346b.subtract(CobolIntrinsics.toBigDecimal(fld0346a)), 25, 16, false);
        fld0347b = CobolIntrinsics.truncateToField(fld0347b.add(CobolIntrinsics.toBigDecimal(fld0347a)), 6, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0348b.subtract(CobolIntrinsics.toBigDecimal(fld0348a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0348b = CobolIntrinsics.truncateToField(_sr, 21, 12, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0348e.set(String.valueOf("Y"));
        }
        fld0349b = CobolIntrinsics.truncateToField(fld0349b.add(CobolIntrinsics.toBigDecimal(fld0349a)), 35, 32, false);
        fld0350b = CobolIntrinsics.truncateToField(fld0350b.subtract(CobolIntrinsics.toBigDecimal(fld0350a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0351b.add(CobolIntrinsics.toBigDecimal(fld0351a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0351b = CobolIntrinsics.truncateToField(_ar, 20, 10, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0351e.set(String.valueOf("Y"));
        }
        fld0352b = CobolIntrinsics.truncateToField(fld0352b.subtract(CobolIntrinsics.toBigDecimal(fld0352a)), 7, 1, false);
        fld0353b = CobolIntrinsics.truncateToField(fld0353b.add(CobolIntrinsics.toBigDecimal(fld0353a)), 35, 33, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0354b.subtract(CobolIntrinsics.toBigDecimal(fld0354a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0354b = CobolIntrinsics.truncateToField(_sr, 11, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0354e.set(String.valueOf("Y"));
        }
        fld0355b = CobolIntrinsics.truncateToField(fld0355b.add(CobolIntrinsics.toBigDecimal(fld0355a)), 5, 0, true);
        fld0356b = CobolIntrinsics.truncateToField(fld0356b.subtract(CobolIntrinsics.toBigDecimal(fld0356a)), 32, 27, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0357b.add(CobolIntrinsics.toBigDecimal(fld0357a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0357b = CobolIntrinsics.truncateToField(_ar, 3, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0357e.set(String.valueOf("Y"));
        }
        fld0358b = CobolIntrinsics.truncateToField(fld0358b.subtract(CobolIntrinsics.toBigDecimal(fld0358a)), 26, 17, false);
        fld0359b = CobolIntrinsics.truncateToField(fld0359b.add(CobolIntrinsics.toBigDecimal(fld0359a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0360b.subtract(CobolIntrinsics.toBigDecimal(fld0360a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0360b = CobolIntrinsics.truncateToField(_sr, 10, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0360e.set(String.valueOf("Y"));
        }
        fld0361b = CobolIntrinsics.truncateToField(fld0361b.add(CobolIntrinsics.toBigDecimal(fld0361a)), 32, 27, false);
        fld0362b = CobolIntrinsics.truncateToField(fld0362b.subtract(CobolIntrinsics.toBigDecimal(fld0362a)), 34, 30, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0363b.add(CobolIntrinsics.toBigDecimal(fld0363a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0363b = CobolIntrinsics.truncateToField(_ar, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0363e.set(String.valueOf("Y"));
        }
        fld0364b = CobolIntrinsics.truncateToField(fld0364b.subtract(CobolIntrinsics.toBigDecimal(fld0364a)), 31, 25, false);
        fld0365b = CobolIntrinsics.truncateToField(fld0365b.add(CobolIntrinsics.toBigDecimal(fld0365a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0366b.subtract(CobolIntrinsics.toBigDecimal(fld0366a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0366b = CobolIntrinsics.truncateToField(_sr, 31, 25, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0366e.set(String.valueOf("Y"));
        }
        fld0367b = CobolIntrinsics.truncateToField(fld0367b.add(CobolIntrinsics.toBigDecimal(fld0367a)), 7, 1, true);
        fld0368b = CobolIntrinsics.truncateToField(fld0368b.subtract(CobolIntrinsics.toBigDecimal(fld0368a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0369b.add(CobolIntrinsics.toBigDecimal(fld0369a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0369b = CobolIntrinsics.truncateToField(_ar, 11, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0369e.set(String.valueOf("Y"));
        }
        fld0370b = CobolIntrinsics.truncateToField(fld0370b.subtract(CobolIntrinsics.toBigDecimal(fld0370a)), 1, 0, true);
        fld0371b = CobolIntrinsics.truncateToField(fld0371b.add(CobolIntrinsics.toBigDecimal(fld0371a)), 3, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0372b.subtract(CobolIntrinsics.toBigDecimal(fld0372a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0372b = CobolIntrinsics.truncateToField(_sr, 19, 9, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0372e.set(String.valueOf("Y"));
        }
        fld0373b = CobolIntrinsics.truncateToField(fld0373b.add(CobolIntrinsics.toBigDecimal(fld0373a)), 13, 4, true);
        fld0374b = CobolIntrinsics.truncateToField(fld0374b.subtract(CobolIntrinsics.toBigDecimal(fld0374a)), 27, 19, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0375b.add(CobolIntrinsics.toBigDecimal(fld0375a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0375b = CobolIntrinsics.truncateToField(_ar, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0375e.set(String.valueOf("Y"));
        }
        fld0376b = CobolIntrinsics.truncateToField(fld0376b.subtract(CobolIntrinsics.toBigDecimal(fld0376a)), 19, 9, false);
        fld0377b = CobolIntrinsics.truncateToField(fld0377b.add(CobolIntrinsics.toBigDecimal(fld0377a)), 29, 22, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0378b.subtract(CobolIntrinsics.toBigDecimal(fld0378a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0378b = CobolIntrinsics.truncateToField(_sr, 6, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0378e.set(String.valueOf("Y"));
        }
        fld0379b = CobolIntrinsics.truncateToField(fld0379b.add(CobolIntrinsics.toBigDecimal(fld0379a)), 1, 0, false);
        fld0380b = CobolIntrinsics.truncateToField(fld0380b.subtract(CobolIntrinsics.toBigDecimal(fld0380a)), 1, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0381b.add(CobolIntrinsics.toBigDecimal(fld0381a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0381b = CobolIntrinsics.truncateToField(_ar, 3, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0381e.set(String.valueOf("Y"));
        }
        fld0382b = CobolIntrinsics.truncateToField(fld0382b.subtract(CobolIntrinsics.toBigDecimal(fld0382a)), 4, 0, false);
        fld0383b = CobolIntrinsics.truncateToField(fld0383b.add(CobolIntrinsics.toBigDecimal(fld0383a)), 30, 24, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0384b.subtract(CobolIntrinsics.toBigDecimal(fld0384a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0384b = CobolIntrinsics.truncateToField(_sr, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0384e.set(String.valueOf("Y"));
        }
        fld0385b = CobolIntrinsics.truncateToField(fld0385b.add(CobolIntrinsics.toBigDecimal(fld0385a)), 33, 29, false);
        fld0386b = CobolIntrinsics.truncateToField(fld0386b.subtract(CobolIntrinsics.toBigDecimal(fld0386a)), 28, 21, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0387b.add(CobolIntrinsics.toBigDecimal(fld0387a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0387b = CobolIntrinsics.truncateToField(_ar, 25, 16, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0387e.set(String.valueOf("Y"));
        }
        fld0388b = CobolIntrinsics.truncateToField(fld0388b.subtract(CobolIntrinsics.toBigDecimal(fld0388a)), 3, 0, false);
        fld0389b = CobolIntrinsics.truncateToField(fld0389b.add(CobolIntrinsics.toBigDecimal(fld0389a)), 22, 12, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0390b.subtract(CobolIntrinsics.toBigDecimal(fld0390a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0390b = CobolIntrinsics.truncateToField(_sr, 3, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0390e.set(String.valueOf("Y"));
        }
        fld0391b = CobolIntrinsics.truncateToField(fld0391b.add(CobolIntrinsics.toBigDecimal(fld0391a)), 10, 2, true);
        fld0392b = CobolIntrinsics.truncateToField(fld0392b.subtract(CobolIntrinsics.toBigDecimal(fld0392a)), 17, 7, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0393b.add(CobolIntrinsics.toBigDecimal(fld0393a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0393b = CobolIntrinsics.truncateToField(_ar, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0393e.set(String.valueOf("Y"));
        }
        fld0394b = CobolIntrinsics.truncateToField(fld0394b.subtract(CobolIntrinsics.toBigDecimal(fld0394a)), 18, 8, true);
        fld0395b = CobolIntrinsics.truncateToField(fld0395b.add(CobolIntrinsics.toBigDecimal(fld0395a)), 1, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0396b.subtract(CobolIntrinsics.toBigDecimal(fld0396a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0396b = CobolIntrinsics.truncateToField(_sr, 16, 7, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0396e.set(String.valueOf("Y"));
        }
        fld0397b = CobolIntrinsics.truncateToField(fld0397b.add(CobolIntrinsics.toBigDecimal(fld0397a)), 2, 0, true);
        fld0398b = CobolIntrinsics.truncateToField(fld0398b.subtract(CobolIntrinsics.toBigDecimal(fld0398a)), 10, 2, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0399b.add(CobolIntrinsics.toBigDecimal(fld0399a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0399b = CobolIntrinsics.truncateToField(_ar, 9, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0399e.set(String.valueOf("Y"));
        }
        fld0400b = CobolIntrinsics.truncateToField(fld0400b.subtract(CobolIntrinsics.toBigDecimal(fld0400a)), 31, 25, false);
        fld0401b = CobolIntrinsics.truncateToField(fld0401b.add(CobolIntrinsics.toBigDecimal(fld0401a)), 1, 0, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0402b.subtract(CobolIntrinsics.toBigDecimal(fld0402a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0402b = CobolIntrinsics.truncateToField(_sr, 26, 18, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0402e.set(String.valueOf("Y"));
        }
        fld0403b = CobolIntrinsics.truncateToField(fld0403b.add(CobolIntrinsics.toBigDecimal(fld0403a)), 35, 32, false);
        fld0404b = CobolIntrinsics.truncateToField(fld0404b.subtract(CobolIntrinsics.toBigDecimal(fld0404a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0405b.add(CobolIntrinsics.toBigDecimal(fld0405a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0405b = CobolIntrinsics.truncateToField(_ar, 5, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0405e.set(String.valueOf("Y"));
        }
        fld0406b = CobolIntrinsics.truncateToField(fld0406b.subtract(CobolIntrinsics.toBigDecimal(fld0406a)), 30, 23, false);
        fld0407b = CobolIntrinsics.truncateToField(fld0407b.add(CobolIntrinsics.toBigDecimal(fld0407a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0408b.subtract(CobolIntrinsics.toBigDecimal(fld0408a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0408b = CobolIntrinsics.truncateToField(_sr, 10, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0408e.set(String.valueOf("Y"));
        }
        fld0409b = CobolIntrinsics.truncateToField(fld0409b.add(CobolIntrinsics.toBigDecimal(fld0409a)), 21, 12, false);
        fld0410b = CobolIntrinsics.truncateToField(fld0410b.subtract(CobolIntrinsics.toBigDecimal(fld0410a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0411b.add(CobolIntrinsics.toBigDecimal(fld0411a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0411b = CobolIntrinsics.truncateToField(_ar, 29, 22, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0411e.set(String.valueOf("Y"));
        }
        fld0412b = CobolIntrinsics.truncateToField(fld0412b.subtract(CobolIntrinsics.toBigDecimal(fld0412a)), 1, 0, true);
        fld0413b = CobolIntrinsics.truncateToField(fld0413b.add(CobolIntrinsics.toBigDecimal(fld0413a)), 1, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0414b.subtract(CobolIntrinsics.toBigDecimal(fld0414a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0414b = CobolIntrinsics.truncateToField(_sr, 5, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0414e.set(String.valueOf("Y"));
        }
        fld0415b = CobolIntrinsics.truncateToField(fld0415b.add(CobolIntrinsics.toBigDecimal(fld0415a)), 34, 31, false);
        fld0416b = CobolIntrinsics.truncateToField(fld0416b.subtract(CobolIntrinsics.toBigDecimal(fld0416a)), 1, 0, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0417b.add(CobolIntrinsics.toBigDecimal(fld0417a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0417b = CobolIntrinsics.truncateToField(_ar, 33, 29, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0417e.set(String.valueOf("Y"));
        }
        fld0418b = CobolIntrinsics.truncateToField(fld0418b.subtract(CobolIntrinsics.toBigDecimal(fld0418a)), 1, 0, false);
        fld0419b = CobolIntrinsics.truncateToField(fld0419b.add(CobolIntrinsics.toBigDecimal(fld0419a)), 20, 10, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0420b.subtract(CobolIntrinsics.toBigDecimal(fld0420a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0420b = CobolIntrinsics.truncateToField(_sr, 34, 30, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0420e.set(String.valueOf("Y"));
        }
        fld0421b = CobolIntrinsics.truncateToField(fld0421b.add(CobolIntrinsics.toBigDecimal(fld0421a)), 7, 1, true);
        fld0422b = CobolIntrinsics.truncateToField(fld0422b.subtract(CobolIntrinsics.toBigDecimal(fld0422a)), 36, 34, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0423b.add(CobolIntrinsics.toBigDecimal(fld0423a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0423b = CobolIntrinsics.truncateToField(_ar, 26, 17, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0423e.set(String.valueOf("Y"));
        }
        fld0424b = CobolIntrinsics.truncateToField(fld0424b.subtract(CobolIntrinsics.toBigDecimal(fld0424a)), 27, 19, false);
        fld0425b = CobolIntrinsics.truncateToField(fld0425b.add(CobolIntrinsics.toBigDecimal(fld0425a)), 22, 12, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0426b.subtract(CobolIntrinsics.toBigDecimal(fld0426a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0426b = CobolIntrinsics.truncateToField(_sr, 21, 11, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0426e.set(String.valueOf("Y"));
        }
        fld0427b = CobolIntrinsics.truncateToField(fld0427b.add(CobolIntrinsics.toBigDecimal(fld0427a)), 29, 22, false);
        fld0428b = CobolIntrinsics.truncateToField(fld0428b.subtract(CobolIntrinsics.toBigDecimal(fld0428a)), 37, 36, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0429b.add(CobolIntrinsics.toBigDecimal(fld0429a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0429b = CobolIntrinsics.truncateToField(_ar, 15, 6, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0429e.set(String.valueOf("Y"));
        }
        fld0430b = CobolIntrinsics.truncateToField(fld0430b.subtract(CobolIntrinsics.toBigDecimal(fld0430a)), 13, 4, false);
        fld0431b = CobolIntrinsics.truncateToField(fld0431b.add(CobolIntrinsics.toBigDecimal(fld0431a)), 34, 31, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0432b.subtract(CobolIntrinsics.toBigDecimal(fld0432a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0432b = CobolIntrinsics.truncateToField(_sr, 6, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0432e.set(String.valueOf("Y"));
        }
        fld0433b = CobolIntrinsics.truncateToField(fld0433b.add(CobolIntrinsics.toBigDecimal(fld0433a)), 7, 1, false);
        fld0434b = CobolIntrinsics.truncateToField(fld0434b.subtract(CobolIntrinsics.toBigDecimal(fld0434a)), 35, 32, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0435b.add(CobolIntrinsics.toBigDecimal(fld0435a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0435b = CobolIntrinsics.truncateToField(_ar, 22, 12, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0435e.set(String.valueOf("Y"));
        }
        fld0436b = CobolIntrinsics.truncateToField(fld0436b.subtract(CobolIntrinsics.toBigDecimal(fld0436a)), 31, 25, false);
        fld0437b = CobolIntrinsics.truncateToField(fld0437b.add(CobolIntrinsics.toBigDecimal(fld0437a)), 24, 15, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0438b.subtract(CobolIntrinsics.toBigDecimal(fld0438a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0438b = CobolIntrinsics.truncateToField(_sr, 33, 28, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0438e.set(String.valueOf("Y"));
        }
        fld0439b = CobolIntrinsics.truncateToField(fld0439b.add(CobolIntrinsics.toBigDecimal(fld0439a)), 21, 11, false);
        fld0440b = CobolIntrinsics.truncateToField(fld0440b.subtract(CobolIntrinsics.toBigDecimal(fld0440a)), 17, 7, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0441b.add(CobolIntrinsics.toBigDecimal(fld0441a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0441b = CobolIntrinsics.truncateToField(_ar, 16, 6, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0441e.set(String.valueOf("Y"));
        }
        fld0442b = CobolIntrinsics.truncateToField(fld0442b.subtract(CobolIntrinsics.toBigDecimal(fld0442a)), 34, 31, false);
        fld0443b = CobolIntrinsics.truncateToField(fld0443b.add(CobolIntrinsics.toBigDecimal(fld0443a)), 23, 14, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0444b.subtract(CobolIntrinsics.toBigDecimal(fld0444a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0444b = CobolIntrinsics.truncateToField(_sr, 19, 9, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0444e.set(String.valueOf("Y"));
        }
        fld0445b = CobolIntrinsics.truncateToField(fld0445b.add(CobolIntrinsics.toBigDecimal(fld0445a)), 17, 7, true);
        fld0446b = CobolIntrinsics.truncateToField(fld0446b.subtract(CobolIntrinsics.toBigDecimal(fld0446a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0447b.add(CobolIntrinsics.toBigDecimal(fld0447a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0447b = CobolIntrinsics.truncateToField(_ar, 10, 2, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0447e.set(String.valueOf("Y"));
        }
        fld0448b = CobolIntrinsics.truncateToField(fld0448b.subtract(CobolIntrinsics.toBigDecimal(fld0448a)), 20, 10, false);
        fld0449b = CobolIntrinsics.truncateToField(fld0449b.add(CobolIntrinsics.toBigDecimal(fld0449a)), 12, 4, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0450b.subtract(CobolIntrinsics.toBigDecimal(fld0450a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0450b = CobolIntrinsics.truncateToField(_sr, 22, 13, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0450e.set(String.valueOf("Y"));
        }
        fld0451b = CobolIntrinsics.truncateToField(fld0451b.add(CobolIntrinsics.toBigDecimal(fld0451a)), 9, 2, true);
        fld0452b = CobolIntrinsics.truncateToField(fld0452b.subtract(CobolIntrinsics.toBigDecimal(fld0452a)), 21, 11, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0453b.add(CobolIntrinsics.toBigDecimal(fld0453a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0453b = CobolIntrinsics.truncateToField(_ar, 36, 34, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0453e.set(String.valueOf("Y"));
        }
        fld0454b = CobolIntrinsics.truncateToField(fld0454b.subtract(CobolIntrinsics.toBigDecimal(fld0454a)), 1, 0, true);
        fld0455b = CobolIntrinsics.truncateToField(fld0455b.add(CobolIntrinsics.toBigDecimal(fld0455a)), 32, 27, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0456b.subtract(CobolIntrinsics.toBigDecimal(fld0456a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0456b = CobolIntrinsics.truncateToField(_sr, 5, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0456e.set(String.valueOf("Y"));
        }
        fld0457b = CobolIntrinsics.truncateToField(fld0457b.add(CobolIntrinsics.toBigDecimal(fld0457a)), 1, 0, false);
        fld0458b = CobolIntrinsics.truncateToField(fld0458b.subtract(CobolIntrinsics.toBigDecimal(fld0458a)), 12, 3, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0459b.add(CobolIntrinsics.toBigDecimal(fld0459a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0459b = CobolIntrinsics.truncateToField(_ar, 21, 11, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0459e.set(String.valueOf("Y"));
        }
        fld0460b = CobolIntrinsics.truncateToField(fld0460b.subtract(CobolIntrinsics.toBigDecimal(fld0460a)), 29, 22, false);
        fld0461b = CobolIntrinsics.truncateToField(fld0461b.add(CobolIntrinsics.toBigDecimal(fld0461a)), 8, 1, true);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0462b.subtract(CobolIntrinsics.toBigDecimal(fld0462a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0462b = CobolIntrinsics.truncateToField(_sr, 36, 34, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0462e.set(String.valueOf("Y"));
        }
        fld0463b = CobolIntrinsics.truncateToField(fld0463b.add(CobolIntrinsics.toBigDecimal(fld0463a)), 15, 6, false);
        fld0464b = CobolIntrinsics.truncateToField(fld0464b.subtract(CobolIntrinsics.toBigDecimal(fld0464a)), 27, 19, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0465b.add(CobolIntrinsics.toBigDecimal(fld0465a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0465b = CobolIntrinsics.truncateToField(_ar, 31, 25, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0465e.set(String.valueOf("Y"));
        }
        fld0466b = CobolIntrinsics.truncateToField(fld0466b.subtract(CobolIntrinsics.toBigDecimal(fld0466a)), 5, 0, false);
        fld0467b = CobolIntrinsics.truncateToField(fld0467b.add(CobolIntrinsics.toBigDecimal(fld0467a)), 33, 29, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0468b.subtract(CobolIntrinsics.toBigDecimal(fld0468a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0468b = CobolIntrinsics.truncateToField(_sr, 11, 3, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0468e.set(String.valueOf("Y"));
        }
        fld0469b = CobolIntrinsics.truncateToField(fld0469b.add(CobolIntrinsics.toBigDecimal(fld0469a)), 19, 9, false);
        fld0470b = CobolIntrinsics.truncateToField(fld0470b.subtract(CobolIntrinsics.toBigDecimal(fld0470a)), 14, 5, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0471b.add(CobolIntrinsics.toBigDecimal(fld0471a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0471b = CobolIntrinsics.truncateToField(_ar, 1, 0, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0471e.set(String.valueOf("Y"));
        }
        fld0472b = CobolIntrinsics.truncateToField(fld0472b.subtract(CobolIntrinsics.toBigDecimal(fld0472a)), 32, 26, false);
        fld0473b = CobolIntrinsics.truncateToField(fld0473b.add(CobolIntrinsics.toBigDecimal(fld0473a)), 26, 18, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0474b.subtract(CobolIntrinsics.toBigDecimal(fld0474a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0474b = CobolIntrinsics.truncateToField(_sr, 5, 0, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0474e.set(String.valueOf("Y"));
        }
        fld0475b = CobolIntrinsics.truncateToField(fld0475b.add(CobolIntrinsics.toBigDecimal(fld0475a)), 15, 6, true);
        fld0476b = CobolIntrinsics.truncateToField(fld0476b.subtract(CobolIntrinsics.toBigDecimal(fld0476a)), 7, 1, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0477b.add(CobolIntrinsics.toBigDecimal(fld0477a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0477b = CobolIntrinsics.truncateToField(_ar, 14, 5, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0477e.set(String.valueOf("Y"));
        }
        fld0478b = CobolIntrinsics.truncateToField(fld0478b.subtract(CobolIntrinsics.toBigDecimal(fld0478a)), 13, 4, false);
        fld0479b = CobolIntrinsics.truncateToField(fld0479b.add(CobolIntrinsics.toBigDecimal(fld0479a)), 31, 25, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0480b.subtract(CobolIntrinsics.toBigDecimal(fld0480a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("100000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0480b = CobolIntrinsics.truncateToField(_sr, 28, 20, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0480e.set(String.valueOf("Y"));
        }
        fld0481b = CobolIntrinsics.truncateToField(fld0481b.add(CobolIntrinsics.toBigDecimal(fld0481a)), 37, 36, false);
        fld0482b = CobolIntrinsics.truncateToField(fld0482b.subtract(CobolIntrinsics.toBigDecimal(fld0482a)), 18, 8, true);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0483b.add(CobolIntrinsics.toBigDecimal(fld0483a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0483b = CobolIntrinsics.truncateToField(_ar, 12, 3, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0483e.set(String.valueOf("Y"));
        }
        fld0484b = CobolIntrinsics.truncateToField(fld0484b.subtract(CobolIntrinsics.toBigDecimal(fld0484a)), 21, 12, false);
        fld0485b = CobolIntrinsics.truncateToField(fld0485b.add(CobolIntrinsics.toBigDecimal(fld0485a)), 6, 1, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0486b.subtract(CobolIntrinsics.toBigDecimal(fld0486a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0486b = CobolIntrinsics.truncateToField(_sr, 17, 7, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0486e.set(String.valueOf("Y"));
        }
        fld0487b = CobolIntrinsics.truncateToField(fld0487b.add(CobolIntrinsics.toBigDecimal(fld0487a)), 26, 18, false);
        fld0488b = CobolIntrinsics.truncateToField(fld0488b.subtract(CobolIntrinsics.toBigDecimal(fld0488a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0489b.add(CobolIntrinsics.toBigDecimal(fld0489a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0489b = CobolIntrinsics.truncateToField(_ar, 37, 36, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0489e.set(String.valueOf("Y"));
        }
        fld0490b = CobolIntrinsics.truncateToField(fld0490b.subtract(CobolIntrinsics.toBigDecimal(fld0490a)), 10, 2, false);
        fld0491b = CobolIntrinsics.truncateToField(fld0491b.add(CobolIntrinsics.toBigDecimal(fld0491a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0492b.subtract(CobolIntrinsics.toBigDecimal(fld0492a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0492b = CobolIntrinsics.truncateToField(_sr, 13, 4, true); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0492e.set(String.valueOf("Y"));
        }
        fld0493b = CobolIntrinsics.truncateToField(fld0493b.add(CobolIntrinsics.toBigDecimal(fld0493a)), 30, 24, false);
        fld0494b = CobolIntrinsics.truncateToField(fld0494b.subtract(CobolIntrinsics.toBigDecimal(fld0494a)), 19, 9, false);
        CobolIntrinsics.clearException();
        { BigDecimal _ar = fld0495b.add(CobolIntrinsics.toBigDecimal(fld0495a)); if (_ar.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0495b = CobolIntrinsics.truncateToField(_ar, 24, 15, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0495e.set(String.valueOf("Y"));
        }
        fld0496b = CobolIntrinsics.truncateToField(fld0496b.subtract(CobolIntrinsics.toBigDecimal(fld0496a)), 4, 0, true);
        fld0497b = CobolIntrinsics.truncateToField(fld0497b.add(CobolIntrinsics.toBigDecimal(fld0497a)), 25, 16, false);
        CobolIntrinsics.clearException();
        { BigDecimal _sr = fld0498b.subtract(CobolIntrinsics.toBigDecimal(fld0498a)); if (_sr.abs().setScale(0, RoundingMode.DOWN).compareTo(new BigDecimal("1000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) { fld0498b = CobolIntrinsics.truncateToField(_sr, 7, 1, false); } }
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            fld0498e.set(String.valueOf("Y"));
        }
        fld0499b = CobolIntrinsics.truncateToField(fld0499b.add(CobolIntrinsics.toBigDecimal(fld0499a)), 24, 15, false);
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0001b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0001b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0001B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0001b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0001b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0001e), String.valueOf(xpc_fld0001e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0001E  ==> " + String.valueOf(fld0001e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0001e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0002b, 32, 27, true, false, 1)), String.valueOf(xpc_fld0002b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0002B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0002b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0002b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0002e), String.valueOf(xpc_fld0002e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0002E  ==> " + String.valueOf(fld0002e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0002e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0003b, 18, 8, true, false, 1)), String.valueOf(xpc_fld0003b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0003B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0003b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0003b)));
                }
            }
        }
    }
    private void do_check_part3() {
        if (!CobolString.cobolEquals(String.valueOf(fld0003e), String.valueOf(xpc_fld0003e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0003E  ==> " + String.valueOf(fld0003e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0003e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0004b, 6, 1, true, false, 1)), String.valueOf(xpc_fld0004b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0004B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0004b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0004b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0004e), String.valueOf(xpc_fld0004e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0004E  ==> " + String.valueOf(fld0004e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0004e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0005b, 12, 3, false, true, 1)), String.valueOf(xpc_fld0005b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0005B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0005b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0005b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0005e), String.valueOf(xpc_fld0005e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0005E  ==> " + String.valueOf(fld0005e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0005e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0006b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0006b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0006B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0006b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0006b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0006e), String.valueOf(xpc_fld0006e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0006E  ==> " + String.valueOf(fld0006e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0006e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0007b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0007b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0007B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0007b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0007b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0007e), String.valueOf(xpc_fld0007e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0007E  ==> " + String.valueOf(fld0007e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0007e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0008b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0008b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0008B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0008b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0008b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0008e), String.valueOf(xpc_fld0008e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0008E  ==> " + String.valueOf(fld0008e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0008e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0009b, 33, 28, false, false, 1)), String.valueOf(xpc_fld0009b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0009B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0009b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0009b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0009e), String.valueOf(xpc_fld0009e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0009E  ==> " + String.valueOf(fld0009e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0009e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0010b, 15, 6, false, true, 1)), String.valueOf(xpc_fld0010b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0010B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0010b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0010b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0010e), String.valueOf(xpc_fld0010e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0010E  ==> " + String.valueOf(fld0010e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0010e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0011b, 33, 29, true, false, 1)), String.valueOf(xpc_fld0011b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0011B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0011b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0011b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0011e), String.valueOf(xpc_fld0011e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0011E  ==> " + String.valueOf(fld0011e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0011e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0012b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0012b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0012B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0012b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0012b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0012e), String.valueOf(xpc_fld0012e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0012E  ==> " + String.valueOf(fld0012e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0012e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0013b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0013b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0013B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0013b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0013b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0013e), String.valueOf(xpc_fld0013e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0013E  ==> " + String.valueOf(fld0013e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0013e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0014b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0014b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0014B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0014b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0014b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0014e), String.valueOf(xpc_fld0014e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0014E  ==> " + String.valueOf(fld0014e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0014e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0015b, 18, 8, true, false, 1)), String.valueOf(xpc_fld0015b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0015B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0015b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0015b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0015e), String.valueOf(xpc_fld0015e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0015E  ==> " + String.valueOf(fld0015e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0015e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0016b, 16, 6, false, true, 1)), String.valueOf(xpc_fld0016b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0016B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0016b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0016b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0016e), String.valueOf(xpc_fld0016e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0016E  ==> " + String.valueOf(fld0016e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0016e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0017b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0017b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0017B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0017b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0017b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0017e), String.valueOf(xpc_fld0017e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0017E  ==> " + String.valueOf(fld0017e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0017e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0018b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0018b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0018B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0018b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0018b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0018e), String.valueOf(xpc_fld0018e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0018E  ==> " + String.valueOf(fld0018e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0018e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0019b, 15, 6, false, true, 1)), String.valueOf(xpc_fld0019b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0019B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0019b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0019b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0019e), String.valueOf(xpc_fld0019e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0019E  ==> " + String.valueOf(fld0019e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0019e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0020b, 20, 11, false, false, 1)), String.valueOf(xpc_fld0020b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0020B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0020b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0020b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0020e), String.valueOf(xpc_fld0020e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0020E  ==> " + String.valueOf(fld0020e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0020e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0021b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0021b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0021B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0021b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0021b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0021e), String.valueOf(xpc_fld0021e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0021E  ==> " + String.valueOf(fld0021e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0021e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0022b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0022b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0022B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0022b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0022b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0022e), String.valueOf(xpc_fld0022e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0022E  ==> " + String.valueOf(fld0022e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0022e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0023b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0023b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0023B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0023b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0023b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0023e), String.valueOf(xpc_fld0023e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0023E  ==> " + String.valueOf(fld0023e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0023e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0024b, 15, 6, false, true, 1)), String.valueOf(xpc_fld0024b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0024B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0024b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0024b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0024e), String.valueOf(xpc_fld0024e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0024E  ==> " + String.valueOf(fld0024e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0024e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0025b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0025b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0025B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0025b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0025b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0025e), String.valueOf(xpc_fld0025e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0025E  ==> " + String.valueOf(fld0025e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0025e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0026b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0026b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0026B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0026b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0026b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0026e), String.valueOf(xpc_fld0026e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0026E  ==> " + String.valueOf(fld0026e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0026e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0027b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0027b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0027B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0027b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0027b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0027e), String.valueOf(xpc_fld0027e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0027E  ==> " + String.valueOf(fld0027e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0027e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0028b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0028b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0028B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0028b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0028b)));
                }
            }
        }
    }
    private void do_check_part4() {
        if (!CobolString.cobolEquals(String.valueOf(fld0028e), String.valueOf(xpc_fld0028e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0028E  ==> " + String.valueOf(fld0028e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0028e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0029b, 26, 17, false, false, 1)), String.valueOf(xpc_fld0029b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0029B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0029b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0029b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0029e), String.valueOf(xpc_fld0029e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0029E  ==> " + String.valueOf(fld0029e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0029e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0030b, 26, 18, false, false, 1)), String.valueOf(xpc_fld0030b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0030B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0030b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0030b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0030e), String.valueOf(xpc_fld0030e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0030E  ==> " + String.valueOf(fld0030e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0030e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0031b, 26, 18, false, false, 1)), String.valueOf(xpc_fld0031b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0031B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0031b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0031b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0031e), String.valueOf(xpc_fld0031e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0031E  ==> " + String.valueOf(fld0031e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0031e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0032b, 12, 3, false, true, 1)), String.valueOf(xpc_fld0032b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0032B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0032b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0032b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0032e), String.valueOf(xpc_fld0032e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0032E  ==> " + String.valueOf(fld0032e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0032e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0033b, 12, 3, true, false, 1)), String.valueOf(xpc_fld0033b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0033B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0033b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0033b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0033e), String.valueOf(xpc_fld0033e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0033E  ==> " + String.valueOf(fld0033e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0033e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0034b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0034b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0034B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0034b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0034b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0034e), String.valueOf(xpc_fld0034e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0034E  ==> " + String.valueOf(fld0034e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0034e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0035b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0035b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0035B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0035b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0035b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0035e), String.valueOf(xpc_fld0035e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0035E  ==> " + String.valueOf(fld0035e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0035e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0036b, 32, 27, true, false, 1)), String.valueOf(xpc_fld0036b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0036B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0036b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0036b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0036e), String.valueOf(xpc_fld0036e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0036E  ==> " + String.valueOf(fld0036e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0036e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0037b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0037b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0037B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0037b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0037b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0037e), String.valueOf(xpc_fld0037e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0037E  ==> " + String.valueOf(fld0037e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0037e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0038b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0038b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0038B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0038b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0038b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0038e), String.valueOf(xpc_fld0038e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0038E  ==> " + String.valueOf(fld0038e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0038e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0039b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0039b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0039B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0039b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0039b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0039e), String.valueOf(xpc_fld0039e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0039E  ==> " + String.valueOf(fld0039e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0039e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0040b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0040b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0040B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0040b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0040b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0040e), String.valueOf(xpc_fld0040e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0040E  ==> " + String.valueOf(fld0040e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0040e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0041b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0041b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0041B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0041b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0041b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0041e), String.valueOf(xpc_fld0041e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0041E  ==> " + String.valueOf(fld0041e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0041e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0042b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0042b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0042B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0042b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0042b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0042e), String.valueOf(xpc_fld0042e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0042E  ==> " + String.valueOf(fld0042e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0042e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0043b, 34, 30, false, false, 1)), String.valueOf(xpc_fld0043b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0043B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0043b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0043b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0043e), String.valueOf(xpc_fld0043e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0043E  ==> " + String.valueOf(fld0043e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0043e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0044b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0044b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0044B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0044b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0044b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0044e), String.valueOf(xpc_fld0044e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0044E  ==> " + String.valueOf(fld0044e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0044e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0045b, 14, 5, true, false, 1)), String.valueOf(xpc_fld0045b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0045B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0045b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0045b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0045e), String.valueOf(xpc_fld0045e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0045E  ==> " + String.valueOf(fld0045e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0045e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0046b, 32, 27, false, false, 1)), String.valueOf(xpc_fld0046b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0046B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0046b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0046b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0046e), String.valueOf(xpc_fld0046e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0046E  ==> " + String.valueOf(fld0046e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0046e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0047b, 18, 8, true, false, 1)), String.valueOf(xpc_fld0047b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0047B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0047b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0047b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0047e), String.valueOf(xpc_fld0047e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0047E  ==> " + String.valueOf(fld0047e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0047e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0048b, 6, 1, false, true, 1)), String.valueOf(xpc_fld0048b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0048B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0048b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0048b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0048e), String.valueOf(xpc_fld0048e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0048E  ==> " + String.valueOf(fld0048e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0048e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0049b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0049b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0049B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0049b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0049b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0049e), String.valueOf(xpc_fld0049e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0049E  ==> " + String.valueOf(fld0049e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0049e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0050b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0050b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0050B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0050b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0050b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0050e), String.valueOf(xpc_fld0050e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0050E  ==> " + String.valueOf(fld0050e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0050e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0051b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0051b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0051B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0051b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0051b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0051e), String.valueOf(xpc_fld0051e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0051E  ==> " + String.valueOf(fld0051e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0051e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0052b, 20, 11, false, false, 1)), String.valueOf(xpc_fld0052b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0052B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0052b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0052b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0052e), String.valueOf(xpc_fld0052e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0052E  ==> " + String.valueOf(fld0052e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0052e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0053b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0053b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0053B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0053b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0053b)));
                }
            }
        }
    }
    private void do_check_part5() {
        if (!CobolString.cobolEquals(String.valueOf(fld0053e), String.valueOf(xpc_fld0053e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0053E  ==> " + String.valueOf(fld0053e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0053e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0054b, 12, 3, true, false, 1)), String.valueOf(xpc_fld0054b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0054B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0054b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0054b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0054e), String.valueOf(xpc_fld0054e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0054E  ==> " + String.valueOf(fld0054e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0054e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0055b, 25, 17, false, false, 1)), String.valueOf(xpc_fld0055b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0055B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0055b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0055b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0055e), String.valueOf(xpc_fld0055e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0055E  ==> " + String.valueOf(fld0055e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0055e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0056b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0056b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0056B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0056b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0056b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0056e), String.valueOf(xpc_fld0056e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0056E  ==> " + String.valueOf(fld0056e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0056e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0057b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0057b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0057B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0057b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0057b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0057e), String.valueOf(xpc_fld0057e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0057E  ==> " + String.valueOf(fld0057e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0057e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0058b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0058b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0058B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0058b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0058b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0058e), String.valueOf(xpc_fld0058e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0058E  ==> " + String.valueOf(fld0058e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0058e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0059b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0059b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0059B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0059b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0059b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0059e), String.valueOf(xpc_fld0059e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0059E  ==> " + String.valueOf(fld0059e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0059e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0060b, 6, 0, true, false, 1)), String.valueOf(xpc_fld0060b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0060B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0060b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0060b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0060e), String.valueOf(xpc_fld0060e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0060E  ==> " + String.valueOf(fld0060e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0060e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0061b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0061b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0061B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0061b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0061b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0061e), String.valueOf(xpc_fld0061e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0061E  ==> " + String.valueOf(fld0061e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0061e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0062b, 22, 13, false, false, 1)), String.valueOf(xpc_fld0062b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0062B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0062b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0062b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0062e), String.valueOf(xpc_fld0062e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0062E  ==> " + String.valueOf(fld0062e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0062e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0063b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0063b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0063B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0063b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0063b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0063e), String.valueOf(xpc_fld0063e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0063E  ==> " + String.valueOf(fld0063e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0063e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0064b, 4, 0, false, true, 1)), String.valueOf(xpc_fld0064b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0064B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0064b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0064b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0064e), String.valueOf(xpc_fld0064e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0064E  ==> " + String.valueOf(fld0064e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0064e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0065b, 4, 0, false, true, 1)), String.valueOf(xpc_fld0065b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0065B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0065b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0065b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0065e), String.valueOf(xpc_fld0065e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0065E  ==> " + String.valueOf(fld0065e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0065e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0066b, 32, 27, false, false, 1)), String.valueOf(xpc_fld0066b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0066B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0066b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0066b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0066e), String.valueOf(xpc_fld0066e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0066E  ==> " + String.valueOf(fld0066e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0066e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0067b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0067b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0067B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0067b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0067b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0067e), String.valueOf(xpc_fld0067e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0067E  ==> " + String.valueOf(fld0067e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0067e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0068b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0068b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0068B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0068b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0068b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0068e), String.valueOf(xpc_fld0068e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0068E  ==> " + String.valueOf(fld0068e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0068e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0069b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0069b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0069B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0069b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0069b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0069e), String.valueOf(xpc_fld0069e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0069E  ==> " + String.valueOf(fld0069e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0069e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0070b, 7, 1, false, true, 1)), String.valueOf(xpc_fld0070b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0070B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0070b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0070b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0070e), String.valueOf(xpc_fld0070e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0070E  ==> " + String.valueOf(fld0070e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0070e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0071b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0071b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0071B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0071b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0071b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0071e), String.valueOf(xpc_fld0071e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0071E  ==> " + String.valueOf(fld0071e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0071e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0072b, 24, 15, true, false, 1)), String.valueOf(xpc_fld0072b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0072B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0072b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0072b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0072e), String.valueOf(xpc_fld0072e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0072E  ==> " + String.valueOf(fld0072e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0072e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0073b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0073b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0073B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0073b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0073b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0073e), String.valueOf(xpc_fld0073e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0073E  ==> " + String.valueOf(fld0073e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0073e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0074b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0074b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0074B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0074b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0074b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0074e), String.valueOf(xpc_fld0074e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0074E  ==> " + String.valueOf(fld0074e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0074e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0075b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0075b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0075B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0075b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0075b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0075e), String.valueOf(xpc_fld0075e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0075E  ==> " + String.valueOf(fld0075e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0075e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0076b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0076b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0076B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0076b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0076b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0076e), String.valueOf(xpc_fld0076e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0076E  ==> " + String.valueOf(fld0076e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0076e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0077b, 33, 28, true, false, 1)), String.valueOf(xpc_fld0077b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0077B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0077b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0077b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0077e), String.valueOf(xpc_fld0077e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0077E  ==> " + String.valueOf(fld0077e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0077e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0078b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0078b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0078B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0078b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0078b)));
                }
            }
        }
    }
    private void do_check_part6() {
        if (!CobolString.cobolEquals(String.valueOf(fld0078e), String.valueOf(xpc_fld0078e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0078E  ==> " + String.valueOf(fld0078e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0078e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0079b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0079b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0079B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0079b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0079b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0079e), String.valueOf(xpc_fld0079e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0079E  ==> " + String.valueOf(fld0079e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0079e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0080b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0080b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0080B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0080b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0080b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0080e), String.valueOf(xpc_fld0080e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0080E  ==> " + String.valueOf(fld0080e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0080e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0081b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0081b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0081B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0081b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0081b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0081e), String.valueOf(xpc_fld0081e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0081E  ==> " + String.valueOf(fld0081e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0081e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0082b, 29, 22, true, false, 1)), String.valueOf(xpc_fld0082b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0082B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0082b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0082b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0082e), String.valueOf(xpc_fld0082e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0082E  ==> " + String.valueOf(fld0082e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0082e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0083b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0083b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0083B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0083b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0083b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0083e), String.valueOf(xpc_fld0083e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0083E  ==> " + String.valueOf(fld0083e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0083e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0084b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0084b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0084B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0084b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0084b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0084e), String.valueOf(xpc_fld0084e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0084E  ==> " + String.valueOf(fld0084e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0084e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0085b, 16, 6, true, false, 1)), String.valueOf(xpc_fld0085b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0085B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0085b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0085b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0085e), String.valueOf(xpc_fld0085e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0085E  ==> " + String.valueOf(fld0085e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0085e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0086b, 21, 11, false, false, 1)), String.valueOf(xpc_fld0086b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0086B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0086b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0086b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0086e), String.valueOf(xpc_fld0086e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0086E  ==> " + String.valueOf(fld0086e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0086e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0087b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0087b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0087B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0087b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0087b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0087e), String.valueOf(xpc_fld0087e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0087E  ==> " + String.valueOf(fld0087e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0087e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0088b, 12, 3, true, false, 1)), String.valueOf(xpc_fld0088b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0088B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0088b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0088b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0088e), String.valueOf(xpc_fld0088e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0088E  ==> " + String.valueOf(fld0088e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0088e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0089b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0089b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0089B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0089b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0089b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0089e), String.valueOf(xpc_fld0089e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0089E  ==> " + String.valueOf(fld0089e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0089e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0090b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0090b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0090B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0090b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0090b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0090e), String.valueOf(xpc_fld0090e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0090E  ==> " + String.valueOf(fld0090e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0090e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0091b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0091b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0091B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0091b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0091b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0091e), String.valueOf(xpc_fld0091e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0091E  ==> " + String.valueOf(fld0091e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0091e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0092b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0092b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0092B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0092b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0092b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0092e), String.valueOf(xpc_fld0092e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0092E  ==> " + String.valueOf(fld0092e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0092e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0093b, 30, 23, false, false, 1)), String.valueOf(xpc_fld0093b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0093B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0093b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0093b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0093e), String.valueOf(xpc_fld0093e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0093E  ==> " + String.valueOf(fld0093e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0093e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0094b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0094b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0094B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0094b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0094b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0094e), String.valueOf(xpc_fld0094e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0094E  ==> " + String.valueOf(fld0094e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0094e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0095b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0095b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0095B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0095b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0095b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0095e), String.valueOf(xpc_fld0095e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0095E  ==> " + String.valueOf(fld0095e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0095e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0096b, 33, 28, true, false, 1)), String.valueOf(xpc_fld0096b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0096B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0096b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0096b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0096e), String.valueOf(xpc_fld0096e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0096E  ==> " + String.valueOf(fld0096e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0096e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0097b, 29, 22, true, false, 1)), String.valueOf(xpc_fld0097b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0097B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0097b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0097b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0097e), String.valueOf(xpc_fld0097e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0097E  ==> " + String.valueOf(fld0097e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0097e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0098b, 12, 4, true, false, 1)), String.valueOf(xpc_fld0098b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0098B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0098b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0098b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0098e), String.valueOf(xpc_fld0098e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0098E  ==> " + String.valueOf(fld0098e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0098e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0099b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0099b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0099B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0099b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0099b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0099e), String.valueOf(xpc_fld0099e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0099E  ==> " + String.valueOf(fld0099e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0099e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0100b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0100b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0100B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0100b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0100b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0100e), String.valueOf(xpc_fld0100e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0100E  ==> " + String.valueOf(fld0100e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0100e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0101b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0101b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0101B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0101b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0101b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0101e), String.valueOf(xpc_fld0101e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0101E  ==> " + String.valueOf(fld0101e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0101e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0102b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0102b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0102B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0102b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0102b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0102e), String.valueOf(xpc_fld0102e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0102E  ==> " + String.valueOf(fld0102e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0102e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0103b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0103b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0103B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0103b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0103b)));
                }
            }
        }
    }
    private void do_check_part7() {
        if (!CobolString.cobolEquals(String.valueOf(fld0103e), String.valueOf(xpc_fld0103e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0103E  ==> " + String.valueOf(fld0103e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0103e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0104b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0104b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0104B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0104b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0104b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0104e), String.valueOf(xpc_fld0104e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0104E  ==> " + String.valueOf(fld0104e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0104e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0105b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0105b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0105B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0105b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0105b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0105e), String.valueOf(xpc_fld0105e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0105E  ==> " + String.valueOf(fld0105e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0105e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0106b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0106b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0106B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0106b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0106b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0106e), String.valueOf(xpc_fld0106e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0106E  ==> " + String.valueOf(fld0106e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0106e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0107b, 27, 19, true, false, 1)), String.valueOf(xpc_fld0107b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0107B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0107b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0107b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0107e), String.valueOf(xpc_fld0107e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0107E  ==> " + String.valueOf(fld0107e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0107e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0108b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0108b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0108B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0108b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0108b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0108e), String.valueOf(xpc_fld0108e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0108E  ==> " + String.valueOf(fld0108e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0108e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0109b, 34, 30, false, false, 1)), String.valueOf(xpc_fld0109b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0109B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0109b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0109b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0109e), String.valueOf(xpc_fld0109e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0109E  ==> " + String.valueOf(fld0109e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0109e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0110b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0110b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0110B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0110b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0110b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0110e), String.valueOf(xpc_fld0110e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0110E  ==> " + String.valueOf(fld0110e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0110e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0111b, 19, 9, true, false, 1)), String.valueOf(xpc_fld0111b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0111B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0111b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0111b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0111e), String.valueOf(xpc_fld0111e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0111E  ==> " + String.valueOf(fld0111e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0111e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0112b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0112b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0112B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0112b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0112b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0112e), String.valueOf(xpc_fld0112e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0112E  ==> " + String.valueOf(fld0112e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0112e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0113b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0113b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0113B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0113b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0113b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0113e), String.valueOf(xpc_fld0113e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0113E  ==> " + String.valueOf(fld0113e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0113e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0114b, 6, 1, true, false, 1)), String.valueOf(xpc_fld0114b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0114B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0114b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0114b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0114e), String.valueOf(xpc_fld0114e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0114E  ==> " + String.valueOf(fld0114e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0114e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0115b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0115b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0115B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0115b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0115b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0115e), String.valueOf(xpc_fld0115e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0115E  ==> " + String.valueOf(fld0115e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0115e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0116b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0116b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0116B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0116b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0116b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0116e), String.valueOf(xpc_fld0116e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0116E  ==> " + String.valueOf(fld0116e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0116e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0117b, 5, 0, true, false, 1)), String.valueOf(xpc_fld0117b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0117B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0117b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0117b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0117e), String.valueOf(xpc_fld0117e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0117E  ==> " + String.valueOf(fld0117e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0117e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0118b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0118b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0118B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0118b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0118b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0118e), String.valueOf(xpc_fld0118e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0118E  ==> " + String.valueOf(fld0118e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0118e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0119b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0119b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0119B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0119b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0119b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0119e), String.valueOf(xpc_fld0119e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0119E  ==> " + String.valueOf(fld0119e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0119e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0120b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0120b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0120B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0120b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0120b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0120e), String.valueOf(xpc_fld0120e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0120E  ==> " + String.valueOf(fld0120e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0120e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0121b, 12, 3, false, true, 1)), String.valueOf(xpc_fld0121b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0121B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0121b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0121b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0121e), String.valueOf(xpc_fld0121e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0121E  ==> " + String.valueOf(fld0121e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0121e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0122b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0122b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0122B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0122b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0122b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0122e), String.valueOf(xpc_fld0122e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0122E  ==> " + String.valueOf(fld0122e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0122e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0123b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0123b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0123B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0123b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0123b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0123e), String.valueOf(xpc_fld0123e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0123E  ==> " + String.valueOf(fld0123e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0123e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0124b, 16, 6, false, true, 1)), String.valueOf(xpc_fld0124b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0124B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0124b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0124b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0124e), String.valueOf(xpc_fld0124e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0124E  ==> " + String.valueOf(fld0124e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0124e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0125b, 24, 15, true, false, 1)), String.valueOf(xpc_fld0125b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0125B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0125b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0125b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0125e), String.valueOf(xpc_fld0125e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0125E  ==> " + String.valueOf(fld0125e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0125e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0126b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0126b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0126B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0126b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0126b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0126e), String.valueOf(xpc_fld0126e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0126E  ==> " + String.valueOf(fld0126e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0126e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0127b, 33, 28, true, false, 1)), String.valueOf(xpc_fld0127b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0127B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0127b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0127b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0127e), String.valueOf(xpc_fld0127e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0127E  ==> " + String.valueOf(fld0127e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0127e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0128b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0128b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0128B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0128b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0128b)));
                }
            }
        }
    }
    private void do_check_part8() {
        if (!CobolString.cobolEquals(String.valueOf(fld0128e), String.valueOf(xpc_fld0128e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0128E  ==> " + String.valueOf(fld0128e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0128e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0129b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0129b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0129B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0129b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0129b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0129e), String.valueOf(xpc_fld0129e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0129E  ==> " + String.valueOf(fld0129e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0129e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0130b, 11, 3, true, false, 1)), String.valueOf(xpc_fld0130b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0130B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0130b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0130b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0130e), String.valueOf(xpc_fld0130e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0130E  ==> " + String.valueOf(fld0130e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0130e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0131b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0131b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0131B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0131b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0131b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0131e), String.valueOf(xpc_fld0131e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0131E  ==> " + String.valueOf(fld0131e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0131e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0132b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0132b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0132B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0132b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0132b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0132e), String.valueOf(xpc_fld0132e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0132E  ==> " + String.valueOf(fld0132e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0132e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0133b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0133b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0133B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0133b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0133b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0133e), String.valueOf(xpc_fld0133e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0133E  ==> " + String.valueOf(fld0133e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0133e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0134b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0134b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0134B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0134b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0134b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0134e), String.valueOf(xpc_fld0134e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0134E  ==> " + String.valueOf(fld0134e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0134e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0135b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0135b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0135B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0135b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0135b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0135e), String.valueOf(xpc_fld0135e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0135E  ==> " + String.valueOf(fld0135e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0135e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0136b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0136b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0136B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0136b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0136b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0136e), String.valueOf(xpc_fld0136e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0136E  ==> " + String.valueOf(fld0136e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0136e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0137b, 35, 32, false, false, 1)), String.valueOf(xpc_fld0137b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0137B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0137b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0137b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0137e), String.valueOf(xpc_fld0137e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0137E  ==> " + String.valueOf(fld0137e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0137e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0138b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0138b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0138B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0138b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0138b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0138e), String.valueOf(xpc_fld0138e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0138E  ==> " + String.valueOf(fld0138e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0138e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0139b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0139b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0139B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0139b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0139b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0139e), String.valueOf(xpc_fld0139e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0139E  ==> " + String.valueOf(fld0139e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0139e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0140b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0140b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0140B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0140b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0140b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0140e), String.valueOf(xpc_fld0140e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0140E  ==> " + String.valueOf(fld0140e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0140e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0141b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0141b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0141B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0141b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0141b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0141e), String.valueOf(xpc_fld0141e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0141E  ==> " + String.valueOf(fld0141e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0141e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0142b, 4, 0, false, true, 1)), String.valueOf(xpc_fld0142b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0142B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0142b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0142b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0142e), String.valueOf(xpc_fld0142e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0142E  ==> " + String.valueOf(fld0142e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0142e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0143b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0143b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0143B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0143b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0143b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0143e), String.valueOf(xpc_fld0143e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0143E  ==> " + String.valueOf(fld0143e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0143e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0144b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0144b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0144B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0144b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0144b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0144e), String.valueOf(xpc_fld0144e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0144E  ==> " + String.valueOf(fld0144e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0144e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0145b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0145b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0145B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0145b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0145b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0145e), String.valueOf(xpc_fld0145e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0145E  ==> " + String.valueOf(fld0145e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0145e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0146b, 22, 13, false, false, 1)), String.valueOf(xpc_fld0146b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0146B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0146b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0146b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0146e), String.valueOf(xpc_fld0146e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0146E  ==> " + String.valueOf(fld0146e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0146e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0147b, 15, 5, true, false, 1)), String.valueOf(xpc_fld0147b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0147B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0147b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0147b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0147e), String.valueOf(xpc_fld0147e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0147E  ==> " + String.valueOf(fld0147e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0147e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0148b, 12, 4, true, false, 1)), String.valueOf(xpc_fld0148b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0148B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0148b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0148b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0148e), String.valueOf(xpc_fld0148e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0148E  ==> " + String.valueOf(fld0148e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0148e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0149b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0149b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0149B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0149b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0149b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0149e), String.valueOf(xpc_fld0149e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0149E  ==> " + String.valueOf(fld0149e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0149e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0150b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0150b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0150B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0150b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0150b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0150e), String.valueOf(xpc_fld0150e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0150E  ==> " + String.valueOf(fld0150e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0150e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0151b, 29, 22, false, false, 1)), String.valueOf(xpc_fld0151b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0151B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0151b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0151b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0151e), String.valueOf(xpc_fld0151e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0151E  ==> " + String.valueOf(fld0151e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0151e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0152b, 36, 34, true, false, 1)), String.valueOf(xpc_fld0152b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0152B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0152b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0152b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0152e), String.valueOf(xpc_fld0152e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0152E  ==> " + String.valueOf(fld0152e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0152e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0153b, 29, 22, false, false, 1)), String.valueOf(xpc_fld0153b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0153B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0153b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0153b)));
                }
            }
        }
    }
    private void do_check_part9() {
        if (!CobolString.cobolEquals(String.valueOf(fld0153e), String.valueOf(xpc_fld0153e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0153E  ==> " + String.valueOf(fld0153e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0153e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0154b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0154b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0154B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0154b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0154b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0154e), String.valueOf(xpc_fld0154e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0154E  ==> " + String.valueOf(fld0154e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0154e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0155b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0155b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0155B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0155b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0155b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0155e), String.valueOf(xpc_fld0155e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0155E  ==> " + String.valueOf(fld0155e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0155e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0156b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0156b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0156B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0156b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0156b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0156e), String.valueOf(xpc_fld0156e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0156E  ==> " + String.valueOf(fld0156e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0156e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0157b, 16, 6, true, false, 1)), String.valueOf(xpc_fld0157b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0157B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0157b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0157b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0157e), String.valueOf(xpc_fld0157e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0157E  ==> " + String.valueOf(fld0157e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0157e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0158b, 23, 14, false, false, 1)), String.valueOf(xpc_fld0158b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0158B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0158b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0158b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0158e), String.valueOf(xpc_fld0158e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0158E  ==> " + String.valueOf(fld0158e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0158e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0159b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0159b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0159B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0159b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0159b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0159e), String.valueOf(xpc_fld0159e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0159E  ==> " + String.valueOf(fld0159e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0159e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0160b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0160b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0160B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0160b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0160b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0160e), String.valueOf(xpc_fld0160e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0160E  ==> " + String.valueOf(fld0160e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0160e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0161b, 27, 19, true, false, 1)), String.valueOf(xpc_fld0161b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0161B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0161b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0161b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0161e), String.valueOf(xpc_fld0161e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0161E  ==> " + String.valueOf(fld0161e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0161e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0162b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0162b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0162B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0162b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0162b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0162e), String.valueOf(xpc_fld0162e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0162E  ==> " + String.valueOf(fld0162e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0162e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0163b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0163b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0163B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0163b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0163b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0163e), String.valueOf(xpc_fld0163e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0163E  ==> " + String.valueOf(fld0163e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0163e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0164b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0164b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0164B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0164b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0164b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0164e), String.valueOf(xpc_fld0164e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0164E  ==> " + String.valueOf(fld0164e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0164e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0165b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0165b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0165B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0165b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0165b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0165e), String.valueOf(xpc_fld0165e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0165E  ==> " + String.valueOf(fld0165e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0165e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0166b, 6, 1, true, false, 1)), String.valueOf(xpc_fld0166b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0166B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0166b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0166b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0166e), String.valueOf(xpc_fld0166e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0166E  ==> " + String.valueOf(fld0166e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0166e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0167b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0167b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0167B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0167b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0167b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0167e), String.valueOf(xpc_fld0167e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0167E  ==> " + String.valueOf(fld0167e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0167e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0168b, 16, 6, false, true, 1)), String.valueOf(xpc_fld0168b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0168B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0168b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0168b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0168e), String.valueOf(xpc_fld0168e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0168E  ==> " + String.valueOf(fld0168e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0168e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0169b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0169b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0169B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0169b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0169b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0169e), String.valueOf(xpc_fld0169e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0169E  ==> " + String.valueOf(fld0169e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0169e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0170b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0170b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0170B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0170b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0170b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0170e), String.valueOf(xpc_fld0170e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0170E  ==> " + String.valueOf(fld0170e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0170e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0171b, 16, 6, true, false, 1)), String.valueOf(xpc_fld0171b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0171B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0171b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0171b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0171e), String.valueOf(xpc_fld0171e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0171E  ==> " + String.valueOf(fld0171e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0171e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0172b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0172b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0172B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0172b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0172b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0172e), String.valueOf(xpc_fld0172e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0172E  ==> " + String.valueOf(fld0172e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0172e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0173b, 18, 8, true, false, 1)), String.valueOf(xpc_fld0173b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0173B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0173b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0173b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0173e), String.valueOf(xpc_fld0173e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0173E  ==> " + String.valueOf(fld0173e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0173e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0174b, 19, 9, true, false, 1)), String.valueOf(xpc_fld0174b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0174B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0174b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0174b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0174e), String.valueOf(xpc_fld0174e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0174E  ==> " + String.valueOf(fld0174e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0174e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0175b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0175b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0175B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0175b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0175b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0175e), String.valueOf(xpc_fld0175e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0175E  ==> " + String.valueOf(fld0175e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0175e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0176b, 11, 3, true, false, 1)), String.valueOf(xpc_fld0176b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0176B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0176b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0176b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0176e), String.valueOf(xpc_fld0176e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0176E  ==> " + String.valueOf(fld0176e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0176e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0177b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0177b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0177B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0177b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0177b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0177e), String.valueOf(xpc_fld0177e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0177E  ==> " + String.valueOf(fld0177e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0177e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0178b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0178b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0178B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0178b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0178b)));
                }
            }
        }
    }
    private void do_check_part10() {
        if (!CobolString.cobolEquals(String.valueOf(fld0178e), String.valueOf(xpc_fld0178e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0178E  ==> " + String.valueOf(fld0178e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0178e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0179b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0179b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0179B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0179b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0179b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0179e), String.valueOf(xpc_fld0179e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0179E  ==> " + String.valueOf(fld0179e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0179e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0180b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0180b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0180B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0180b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0180b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0180e), String.valueOf(xpc_fld0180e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0180E  ==> " + String.valueOf(fld0180e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0180e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0181b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0181b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0181B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0181b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0181b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0181e), String.valueOf(xpc_fld0181e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0181E  ==> " + String.valueOf(fld0181e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0181e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0182b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0182b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0182B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0182b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0182b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0182e), String.valueOf(xpc_fld0182e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0182E  ==> " + String.valueOf(fld0182e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0182e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0183b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0183b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0183B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0183b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0183b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0183e), String.valueOf(xpc_fld0183e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0183E  ==> " + String.valueOf(fld0183e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0183e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0184b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0184b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0184B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0184b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0184b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0184e), String.valueOf(xpc_fld0184e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0184E  ==> " + String.valueOf(fld0184e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0184e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0185b, 28, 20, true, false, 1)), String.valueOf(xpc_fld0185b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0185B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0185b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0185b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0185e), String.valueOf(xpc_fld0185e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0185E  ==> " + String.valueOf(fld0185e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0185e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0186b, 31, 26, false, false, 1)), String.valueOf(xpc_fld0186b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0186B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0186b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0186b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0186e), String.valueOf(xpc_fld0186e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0186E  ==> " + String.valueOf(fld0186e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0186e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0187b, 22, 12, true, false, 1)), String.valueOf(xpc_fld0187b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0187B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0187b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0187b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0187e), String.valueOf(xpc_fld0187e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0187E  ==> " + String.valueOf(fld0187e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0187e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0188b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0188b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0188B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0188b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0188b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0188e), String.valueOf(xpc_fld0188e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0188E  ==> " + String.valueOf(fld0188e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0188e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0189b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0189b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0189B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0189b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0189b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0189e), String.valueOf(xpc_fld0189e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0189E  ==> " + String.valueOf(fld0189e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0189e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0190b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0190b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0190B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0190b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0190b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0190e), String.valueOf(xpc_fld0190e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0190E  ==> " + String.valueOf(fld0190e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0190e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0191b, 30, 24, false, false, 1)), String.valueOf(xpc_fld0191b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0191B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0191b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0191b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0191e), String.valueOf(xpc_fld0191e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0191E  ==> " + String.valueOf(fld0191e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0191e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0192b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0192b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0192B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0192b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0192b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0192e), String.valueOf(xpc_fld0192e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0192E  ==> " + String.valueOf(fld0192e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0192e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0193b, 23, 14, false, false, 1)), String.valueOf(xpc_fld0193b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0193B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0193b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0193b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0193e), String.valueOf(xpc_fld0193e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0193E  ==> " + String.valueOf(fld0193e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0193e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0194b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0194b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0194B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0194b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0194b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0194e), String.valueOf(xpc_fld0194e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0194E  ==> " + String.valueOf(fld0194e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0194e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0195b, 5, 0, true, false, 1)), String.valueOf(xpc_fld0195b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0195B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0195b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0195b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0195e), String.valueOf(xpc_fld0195e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0195E  ==> " + String.valueOf(fld0195e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0195e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0196b, 6, 1, false, true, 1)), String.valueOf(xpc_fld0196b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0196B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0196b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0196b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0196e), String.valueOf(xpc_fld0196e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0196E  ==> " + String.valueOf(fld0196e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0196e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0197b, 2, 0, true, false, 1)), String.valueOf(xpc_fld0197b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0197B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0197b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0197b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0197e), String.valueOf(xpc_fld0197e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0197E  ==> " + String.valueOf(fld0197e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0197e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0198b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0198b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0198B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0198b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0198b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0198e), String.valueOf(xpc_fld0198e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0198E  ==> " + String.valueOf(fld0198e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0198e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0199b, 30, 23, true, false, 1)), String.valueOf(xpc_fld0199b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0199B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0199b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0199b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0199e), String.valueOf(xpc_fld0199e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0199E  ==> " + String.valueOf(fld0199e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0199e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0200b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0200b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0200B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0200b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0200b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0200e), String.valueOf(xpc_fld0200e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0200E  ==> " + String.valueOf(fld0200e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0200e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0201b, 30, 23, false, false, 1)), String.valueOf(xpc_fld0201b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0201B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0201b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0201b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0201e), String.valueOf(xpc_fld0201e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0201E  ==> " + String.valueOf(fld0201e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0201e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0202b, 35, 32, true, false, 1)), String.valueOf(xpc_fld0202b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0202B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0202b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0202b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0202e), String.valueOf(xpc_fld0202e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0202E  ==> " + String.valueOf(fld0202e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0202e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0203b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0203b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0203B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0203b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0203b)));
                }
            }
        }
    }
    private void do_check_part11() {
        if (!CobolString.cobolEquals(String.valueOf(fld0203e), String.valueOf(xpc_fld0203e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0203E  ==> " + String.valueOf(fld0203e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0203e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0204b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0204b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0204B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0204b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0204b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0204e), String.valueOf(xpc_fld0204e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0204E  ==> " + String.valueOf(fld0204e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0204e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0205b, 24, 15, true, false, 1)), String.valueOf(xpc_fld0205b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0205B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0205b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0205b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0205e), String.valueOf(xpc_fld0205e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0205E  ==> " + String.valueOf(fld0205e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0205e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0206b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0206b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0206B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0206b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0206b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0206e), String.valueOf(xpc_fld0206e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0206E  ==> " + String.valueOf(fld0206e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0206e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0207b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0207b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0207B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0207b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0207b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0207e), String.valueOf(xpc_fld0207e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0207E  ==> " + String.valueOf(fld0207e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0207e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0208b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0208b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0208B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0208b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0208b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0208e), String.valueOf(xpc_fld0208e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0208E  ==> " + String.valueOf(fld0208e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0208e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0209b, 30, 23, true, false, 1)), String.valueOf(xpc_fld0209b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0209B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0209b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0209b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0209e), String.valueOf(xpc_fld0209e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0209E  ==> " + String.valueOf(fld0209e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0209e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0210b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0210b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0210B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0210b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0210b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0210e), String.valueOf(xpc_fld0210e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0210E  ==> " + String.valueOf(fld0210e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0210e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0211b, 16, 7, false, true, 1)), String.valueOf(xpc_fld0211b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0211B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0211b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0211b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0211e), String.valueOf(xpc_fld0211e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0211E  ==> " + String.valueOf(fld0211e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0211e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0212b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0212b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0212B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0212b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0212b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0212e), String.valueOf(xpc_fld0212e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0212E  ==> " + String.valueOf(fld0212e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0212e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0213b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0213b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0213B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0213b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0213b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0213e), String.valueOf(xpc_fld0213e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0213E  ==> " + String.valueOf(fld0213e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0213e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0214b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0214b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0214B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0214b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0214b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0214e), String.valueOf(xpc_fld0214e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0214E  ==> " + String.valueOf(fld0214e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0214e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0215b, 6, 1, false, true, 1)), String.valueOf(xpc_fld0215b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0215B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0215b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0215b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0215e), String.valueOf(xpc_fld0215e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0215E  ==> " + String.valueOf(fld0215e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0215e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0216b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0216b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0216B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0216b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0216b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0216e), String.valueOf(xpc_fld0216e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0216E  ==> " + String.valueOf(fld0216e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0216e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0217b, 16, 7, false, true, 1)), String.valueOf(xpc_fld0217b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0217B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0217b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0217b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0217e), String.valueOf(xpc_fld0217e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0217E  ==> " + String.valueOf(fld0217e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0217e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0218b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0218b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0218B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0218b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0218b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0218e), String.valueOf(xpc_fld0218e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0218E  ==> " + String.valueOf(fld0218e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0218e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0219b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0219b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0219B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0219b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0219b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0219e), String.valueOf(xpc_fld0219e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0219E  ==> " + String.valueOf(fld0219e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0219e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0220b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0220b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0220B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0220b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0220b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0220e), String.valueOf(xpc_fld0220e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0220E  ==> " + String.valueOf(fld0220e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0220e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0221b, 33, 29, true, false, 1)), String.valueOf(xpc_fld0221b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0221B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0221b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0221b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0221e), String.valueOf(xpc_fld0221e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0221E  ==> " + String.valueOf(fld0221e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0221e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0222b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0222b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0222B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0222b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0222b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0222e), String.valueOf(xpc_fld0222e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0222E  ==> " + String.valueOf(fld0222e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0222e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0223b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0223b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0223B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0223b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0223b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0223e), String.valueOf(xpc_fld0223e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0223E  ==> " + String.valueOf(fld0223e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0223e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0224b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0224b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0224B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0224b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0224b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0224e), String.valueOf(xpc_fld0224e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0224E  ==> " + String.valueOf(fld0224e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0224e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0225b, 21, 12, false, false, 1)), String.valueOf(xpc_fld0225b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0225B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0225b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0225b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0225e), String.valueOf(xpc_fld0225e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0225E  ==> " + String.valueOf(fld0225e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0225e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0226b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0226b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0226B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0226b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0226b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0226e), String.valueOf(xpc_fld0226e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0226E  ==> " + String.valueOf(fld0226e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0226e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0227b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0227b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0227B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0227b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0227b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0227e), String.valueOf(xpc_fld0227e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0227E  ==> " + String.valueOf(fld0227e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0227e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0228b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0228b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0228B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0228b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0228b)));
                }
            }
        }
    }
    private void do_check_part12() {
        if (!CobolString.cobolEquals(String.valueOf(fld0228e), String.valueOf(xpc_fld0228e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0228E  ==> " + String.valueOf(fld0228e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0228e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0229b, 28, 20, true, false, 1)), String.valueOf(xpc_fld0229b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0229B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0229b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0229b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0229e), String.valueOf(xpc_fld0229e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0229E  ==> " + String.valueOf(fld0229e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0229e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0230b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0230b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0230B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0230b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0230b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0230e), String.valueOf(xpc_fld0230e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0230E  ==> " + String.valueOf(fld0230e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0230e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0231b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0231b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0231B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0231b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0231b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0231e), String.valueOf(xpc_fld0231e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0231E  ==> " + String.valueOf(fld0231e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0231e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0232b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0232b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0232B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0232b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0232b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0232e), String.valueOf(xpc_fld0232e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0232E  ==> " + String.valueOf(fld0232e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0232e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0233b, 12, 4, true, false, 1)), String.valueOf(xpc_fld0233b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0233B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0233b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0233b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0233e), String.valueOf(xpc_fld0233e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0233E  ==> " + String.valueOf(fld0233e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0233e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0234b, 22, 13, false, false, 1)), String.valueOf(xpc_fld0234b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0234B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0234b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0234b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0234e), String.valueOf(xpc_fld0234e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0234E  ==> " + String.valueOf(fld0234e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0234e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0235b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0235b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0235B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0235b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0235b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0235e), String.valueOf(xpc_fld0235e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0235E  ==> " + String.valueOf(fld0235e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0235e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0236b, 26, 18, false, false, 1)), String.valueOf(xpc_fld0236b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0236B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0236b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0236b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0236e), String.valueOf(xpc_fld0236e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0236E  ==> " + String.valueOf(fld0236e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0236e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0237b, 33, 29, true, false, 1)), String.valueOf(xpc_fld0237b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0237B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0237b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0237b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0237e), String.valueOf(xpc_fld0237e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0237E  ==> " + String.valueOf(fld0237e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0237e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0238b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0238b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0238B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0238b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0238b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0238e), String.valueOf(xpc_fld0238e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0238E  ==> " + String.valueOf(fld0238e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0238e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0239b, 23, 14, false, false, 1)), String.valueOf(xpc_fld0239b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0239B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0239b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0239b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0239e), String.valueOf(xpc_fld0239e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0239E  ==> " + String.valueOf(fld0239e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0239e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0240b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0240b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0240B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0240b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0240b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0240e), String.valueOf(xpc_fld0240e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0240E  ==> " + String.valueOf(fld0240e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0240e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0241b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0241b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0241B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0241b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0241b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0241e), String.valueOf(xpc_fld0241e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0241E  ==> " + String.valueOf(fld0241e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0241e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0242b, 7, 1, false, true, 1)), String.valueOf(xpc_fld0242b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0242B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0242b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0242b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0242e), String.valueOf(xpc_fld0242e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0242E  ==> " + String.valueOf(fld0242e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0242e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0243b, 33, 28, true, false, 1)), String.valueOf(xpc_fld0243b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0243B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0243b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0243b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0243e), String.valueOf(xpc_fld0243e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0243E  ==> " + String.valueOf(fld0243e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0243e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0244b, 22, 13, true, false, 1)), String.valueOf(xpc_fld0244b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0244B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0244b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0244b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0244e), String.valueOf(xpc_fld0244e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0244E  ==> " + String.valueOf(fld0244e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0244e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0245b, 24, 15, true, false, 1)), String.valueOf(xpc_fld0245b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0245B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0245b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0245b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0245e), String.valueOf(xpc_fld0245e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0245E  ==> " + String.valueOf(fld0245e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0245e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0246b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0246b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0246B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0246b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0246b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0246e), String.valueOf(xpc_fld0246e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0246E  ==> " + String.valueOf(fld0246e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0246e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0247b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0247b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0247B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0247b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0247b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0247e), String.valueOf(xpc_fld0247e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0247E  ==> " + String.valueOf(fld0247e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0247e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0248b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0248b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0248B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0248b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0248b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0248e), String.valueOf(xpc_fld0248e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0248E  ==> " + String.valueOf(fld0248e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0248e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0249b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0249b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0249B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0249b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0249b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0249e), String.valueOf(xpc_fld0249e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0249E  ==> " + String.valueOf(fld0249e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0249e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0250b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0250b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0250B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0250b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0250b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0250e), String.valueOf(xpc_fld0250e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0250E  ==> " + String.valueOf(fld0250e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0250e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0251b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0251b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0251B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0251b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0251b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0251e), String.valueOf(xpc_fld0251e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0251E  ==> " + String.valueOf(fld0251e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0251e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0252b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0252b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0252B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0252b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0252b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0252e), String.valueOf(xpc_fld0252e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0252E  ==> " + String.valueOf(fld0252e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0252e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0253b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0253b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0253B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0253b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0253b)));
                }
            }
        }
    }
    private void do_check_part13() {
        if (!CobolString.cobolEquals(String.valueOf(fld0253e), String.valueOf(xpc_fld0253e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0253E  ==> " + String.valueOf(fld0253e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0253e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0254b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0254b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0254B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0254b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0254b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0254e), String.valueOf(xpc_fld0254e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0254E  ==> " + String.valueOf(fld0254e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0254e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0255b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0255b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0255B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0255b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0255b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0255e), String.valueOf(xpc_fld0255e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0255E  ==> " + String.valueOf(fld0255e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0255e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0256b, 34, 30, false, false, 1)), String.valueOf(xpc_fld0256b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0256B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0256b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0256b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0256e), String.valueOf(xpc_fld0256e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0256E  ==> " + String.valueOf(fld0256e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0256e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0257b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0257b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0257B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0257b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0257b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0257e), String.valueOf(xpc_fld0257e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0257E  ==> " + String.valueOf(fld0257e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0257e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0258b, 32, 27, true, false, 1)), String.valueOf(xpc_fld0258b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0258B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0258b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0258b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0258e), String.valueOf(xpc_fld0258e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0258E  ==> " + String.valueOf(fld0258e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0258e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0259b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0259b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0259B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0259b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0259b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0259e), String.valueOf(xpc_fld0259e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0259E  ==> " + String.valueOf(fld0259e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0259e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0260b, 22, 13, false, false, 1)), String.valueOf(xpc_fld0260b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0260B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0260b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0260b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0260e), String.valueOf(xpc_fld0260e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0260E  ==> " + String.valueOf(fld0260e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0260e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0261b, 14, 5, true, false, 1)), String.valueOf(xpc_fld0261b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0261B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0261b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0261b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0261e), String.valueOf(xpc_fld0261e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0261E  ==> " + String.valueOf(fld0261e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0261e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0262b, 26, 17, true, false, 1)), String.valueOf(xpc_fld0262b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0262B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0262b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0262b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0262e), String.valueOf(xpc_fld0262e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0262E  ==> " + String.valueOf(fld0262e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0262e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0263b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0263b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0263B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0263b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0263b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0263e), String.valueOf(xpc_fld0263e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0263E  ==> " + String.valueOf(fld0263e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0263e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0264b, 6, 1, true, false, 1)), String.valueOf(xpc_fld0264b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0264B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0264b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0264b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0264e), String.valueOf(xpc_fld0264e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0264E  ==> " + String.valueOf(fld0264e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0264e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0265b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0265b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0265B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0265b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0265b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0265e), String.valueOf(xpc_fld0265e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0265E  ==> " + String.valueOf(fld0265e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0265e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0266b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0266b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0266B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0266b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0266b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0266e), String.valueOf(xpc_fld0266e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0266E  ==> " + String.valueOf(fld0266e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0266e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0267b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0267b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0267B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0267b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0267b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0267e), String.valueOf(xpc_fld0267e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0267E  ==> " + String.valueOf(fld0267e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0267e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0268b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0268b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0268B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0268b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0268b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0268e), String.valueOf(xpc_fld0268e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0268E  ==> " + String.valueOf(fld0268e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0268e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0269b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0269b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0269B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0269b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0269b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0269e), String.valueOf(xpc_fld0269e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0269E  ==> " + String.valueOf(fld0269e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0269e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0270b, 4, 0, false, true, 1)), String.valueOf(xpc_fld0270b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0270B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0270b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0270b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0270e), String.valueOf(xpc_fld0270e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0270E  ==> " + String.valueOf(fld0270e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0270e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0271b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0271b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0271B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0271b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0271b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0271e), String.valueOf(xpc_fld0271e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0271E  ==> " + String.valueOf(fld0271e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0271e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0272b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0272b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0272B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0272b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0272b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0272e), String.valueOf(xpc_fld0272e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0272E  ==> " + String.valueOf(fld0272e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0272e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0273b, 16, 6, false, true, 1)), String.valueOf(xpc_fld0273b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0273B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0273b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0273b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0273e), String.valueOf(xpc_fld0273e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0273E  ==> " + String.valueOf(fld0273e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0273e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0274b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0274b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0274B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0274b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0274b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0274e), String.valueOf(xpc_fld0274e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0274E  ==> " + String.valueOf(fld0274e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0274e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0275b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0275b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0275B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0275b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0275b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0275e), String.valueOf(xpc_fld0275e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0275E  ==> " + String.valueOf(fld0275e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0275e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0276b, 35, 33, true, false, 1)), String.valueOf(xpc_fld0276b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0276B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0276b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0276b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0276e), String.valueOf(xpc_fld0276e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0276E  ==> " + String.valueOf(fld0276e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0276e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0277b, 18, 8, true, false, 1)), String.valueOf(xpc_fld0277b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0277B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0277b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0277b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0277e), String.valueOf(xpc_fld0277e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0277E  ==> " + String.valueOf(fld0277e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0277e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0278b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0278b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0278B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0278b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0278b)));
                }
            }
        }
    }
    private void do_check_part14() {
        if (!CobolString.cobolEquals(String.valueOf(fld0278e), String.valueOf(xpc_fld0278e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0278E  ==> " + String.valueOf(fld0278e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0278e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0279b, 35, 32, false, false, 1)), String.valueOf(xpc_fld0279b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0279B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0279b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0279b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0279e), String.valueOf(xpc_fld0279e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0279E  ==> " + String.valueOf(fld0279e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0279e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0280b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0280b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0280B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0280b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0280b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0280e), String.valueOf(xpc_fld0280e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0280E  ==> " + String.valueOf(fld0280e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0280e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0281b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0281b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0281B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0281b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0281b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0281e), String.valueOf(xpc_fld0281e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0281E  ==> " + String.valueOf(fld0281e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0281e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0282b, 29, 22, true, false, 1)), String.valueOf(xpc_fld0282b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0282B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0282b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0282b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0282e), String.valueOf(xpc_fld0282e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0282E  ==> " + String.valueOf(fld0282e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0282e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0283b, 6, 1, false, true, 1)), String.valueOf(xpc_fld0283b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0283B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0283b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0283b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0283e), String.valueOf(xpc_fld0283e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0283E  ==> " + String.valueOf(fld0283e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0283e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0284b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0284b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0284B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0284b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0284b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0284e), String.valueOf(xpc_fld0284e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0284E  ==> " + String.valueOf(fld0284e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0284e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0285b, 28, 20, true, false, 1)), String.valueOf(xpc_fld0285b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0285B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0285b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0285b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0285e), String.valueOf(xpc_fld0285e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0285E  ==> " + String.valueOf(fld0285e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0285e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0286b, 8, 1, true, false, 1)), String.valueOf(xpc_fld0286b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0286B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0286b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0286b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0286e), String.valueOf(xpc_fld0286e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0286E  ==> " + String.valueOf(fld0286e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0286e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0287b, 6, 0, true, false, 1)), String.valueOf(xpc_fld0287b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0287B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0287b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0287b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0287e), String.valueOf(xpc_fld0287e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0287E  ==> " + String.valueOf(fld0287e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0287e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0288b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0288b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0288B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0288b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0288b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0288e), String.valueOf(xpc_fld0288e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0288E  ==> " + String.valueOf(fld0288e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0288e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0289b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0289b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0289B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0289b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0289b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0289e), String.valueOf(xpc_fld0289e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0289E  ==> " + String.valueOf(fld0289e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0289e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0290b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0290b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0290B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0290b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0290b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0290e), String.valueOf(xpc_fld0290e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0290E  ==> " + String.valueOf(fld0290e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0290e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0291b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0291b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0291B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0291b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0291b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0291e), String.valueOf(xpc_fld0291e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0291E  ==> " + String.valueOf(fld0291e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0291e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0292b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0292b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0292B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0292b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0292b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0292e), String.valueOf(xpc_fld0292e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0292E  ==> " + String.valueOf(fld0292e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0292e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0293b, 11, 3, true, false, 1)), String.valueOf(xpc_fld0293b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0293B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0293b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0293b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0293e), String.valueOf(xpc_fld0293e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0293E  ==> " + String.valueOf(fld0293e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0293e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0294b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0294b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0294B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0294b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0294b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0294e), String.valueOf(xpc_fld0294e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0294E  ==> " + String.valueOf(fld0294e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0294e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0295b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0295b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0295B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0295b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0295b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0295e), String.valueOf(xpc_fld0295e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0295E  ==> " + String.valueOf(fld0295e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0295e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0296b, 21, 12, false, false, 1)), String.valueOf(xpc_fld0296b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0296B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0296b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0296b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0296e), String.valueOf(xpc_fld0296e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0296E  ==> " + String.valueOf(fld0296e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0296e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0297b, 19, 9, true, false, 1)), String.valueOf(xpc_fld0297b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0297B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0297b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0297b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0297e), String.valueOf(xpc_fld0297e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0297E  ==> " + String.valueOf(fld0297e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0297e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0298b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0298b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0298B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0298b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0298b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0298e), String.valueOf(xpc_fld0298e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0298E  ==> " + String.valueOf(fld0298e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0298e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0299b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0299b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0299B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0299b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0299b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0299e), String.valueOf(xpc_fld0299e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0299E  ==> " + String.valueOf(fld0299e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0299e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0300b, 23, 14, false, false, 1)), String.valueOf(xpc_fld0300b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0300B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0300b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0300b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0300e), String.valueOf(xpc_fld0300e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0300E  ==> " + String.valueOf(fld0300e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0300e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0301b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0301b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0301B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0301b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0301b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0301e), String.valueOf(xpc_fld0301e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0301E  ==> " + String.valueOf(fld0301e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0301e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0302b, 16, 6, true, false, 1)), String.valueOf(xpc_fld0302b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0302B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0302b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0302b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0302e), String.valueOf(xpc_fld0302e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0302E  ==> " + String.valueOf(fld0302e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0302e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0303b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0303b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0303B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0303b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0303b)));
                }
            }
        }
    }
    private void do_check_part15() {
        if (!CobolString.cobolEquals(String.valueOf(fld0303e), String.valueOf(xpc_fld0303e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0303E  ==> " + String.valueOf(fld0303e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0303e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0304b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0304b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0304B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0304b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0304b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0304e), String.valueOf(xpc_fld0304e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0304E  ==> " + String.valueOf(fld0304e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0304e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0305b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0305b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0305B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0305b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0305b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0305e), String.valueOf(xpc_fld0305e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0305E  ==> " + String.valueOf(fld0305e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0305e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0306b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0306b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0306B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0306b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0306b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0306e), String.valueOf(xpc_fld0306e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0306E  ==> " + String.valueOf(fld0306e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0306e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0307b, 35, 32, true, false, 1)), String.valueOf(xpc_fld0307b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0307B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0307b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0307b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0307e), String.valueOf(xpc_fld0307e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0307E  ==> " + String.valueOf(fld0307e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0307e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0308b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0308b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0308B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0308b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0308b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0308e), String.valueOf(xpc_fld0308e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0308E  ==> " + String.valueOf(fld0308e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0308e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0309b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0309b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0309B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0309b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0309b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0309e), String.valueOf(xpc_fld0309e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0309E  ==> " + String.valueOf(fld0309e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0309e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0310b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0310b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0310B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0310b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0310b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0310e), String.valueOf(xpc_fld0310e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0310E  ==> " + String.valueOf(fld0310e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0310e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0311b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0311b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0311B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0311b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0311b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0311e), String.valueOf(xpc_fld0311e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0311E  ==> " + String.valueOf(fld0311e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0311e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0312b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0312b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0312B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0312b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0312b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0312e), String.valueOf(xpc_fld0312e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0312E  ==> " + String.valueOf(fld0312e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0312e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0313b, 14, 5, true, false, 1)), String.valueOf(xpc_fld0313b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0313B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0313b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0313b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0313e), String.valueOf(xpc_fld0313e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0313E  ==> " + String.valueOf(fld0313e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0313e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0314b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0314b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0314B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0314b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0314b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0314e), String.valueOf(xpc_fld0314e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0314E  ==> " + String.valueOf(fld0314e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0314e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0315b, 26, 17, true, false, 1)), String.valueOf(xpc_fld0315b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0315B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0315b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0315b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0315e), String.valueOf(xpc_fld0315e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0315E  ==> " + String.valueOf(fld0315e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0315e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0316b, 21, 11, false, false, 1)), String.valueOf(xpc_fld0316b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0316B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0316b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0316b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0316e), String.valueOf(xpc_fld0316e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0316E  ==> " + String.valueOf(fld0316e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0316e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0317b, 12, 3, false, true, 1)), String.valueOf(xpc_fld0317b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0317B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0317b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0317b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0317e), String.valueOf(xpc_fld0317e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0317E  ==> " + String.valueOf(fld0317e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0317e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0318b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0318b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0318B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0318b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0318b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0318e), String.valueOf(xpc_fld0318e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0318E  ==> " + String.valueOf(fld0318e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0318e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0319b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0319b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0319B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0319b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0319b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0319e), String.valueOf(xpc_fld0319e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0319E  ==> " + String.valueOf(fld0319e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0319e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0320b, 21, 11, false, false, 1)), String.valueOf(xpc_fld0320b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0320B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0320b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0320b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0320e), String.valueOf(xpc_fld0320e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0320E  ==> " + String.valueOf(fld0320e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0320e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0321b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0321b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0321B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0321b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0321b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0321e), String.valueOf(xpc_fld0321e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0321E  ==> " + String.valueOf(fld0321e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0321e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0322b, 23, 14, true, false, 1)), String.valueOf(xpc_fld0322b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0322B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0322b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0322b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0322e), String.valueOf(xpc_fld0322e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0322E  ==> " + String.valueOf(fld0322e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0322e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0323b, 36, 35, false, false, 1)), String.valueOf(xpc_fld0323b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0323B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0323b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0323b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0323e), String.valueOf(xpc_fld0323e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0323E  ==> " + String.valueOf(fld0323e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0323e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0324b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0324b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0324B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0324b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0324b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0324e), String.valueOf(xpc_fld0324e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0324E  ==> " + String.valueOf(fld0324e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0324e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0325b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0325b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0325B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0325b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0325b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0325e), String.valueOf(xpc_fld0325e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0325E  ==> " + String.valueOf(fld0325e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0325e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0326b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0326b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0326B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0326b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0326b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0326e), String.valueOf(xpc_fld0326e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0326E  ==> " + String.valueOf(fld0326e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0326e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0327b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0327b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0327B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0327b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0327b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0327e), String.valueOf(xpc_fld0327e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0327E  ==> " + String.valueOf(fld0327e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0327e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0328b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0328b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0328B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0328b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0328b)));
                }
            }
        }
    }
    private void do_check_part16() {
        if (!CobolString.cobolEquals(String.valueOf(fld0328e), String.valueOf(xpc_fld0328e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0328E  ==> " + String.valueOf(fld0328e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0328e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0329b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0329b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0329B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0329b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0329b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0329e), String.valueOf(xpc_fld0329e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0329E  ==> " + String.valueOf(fld0329e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0329e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0330b, 30, 23, true, false, 1)), String.valueOf(xpc_fld0330b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0330B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0330b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0330b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0330e), String.valueOf(xpc_fld0330e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0330E  ==> " + String.valueOf(fld0330e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0330e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0331b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0331b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0331B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0331b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0331b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0331e), String.valueOf(xpc_fld0331e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0331E  ==> " + String.valueOf(fld0331e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0331e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0332b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0332b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0332B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0332b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0332b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0332e), String.valueOf(xpc_fld0332e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0332E  ==> " + String.valueOf(fld0332e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0332e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0333b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0333b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0333B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0333b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0333b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0333e), String.valueOf(xpc_fld0333e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0333E  ==> " + String.valueOf(fld0333e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0333e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0334b, 12, 3, true, false, 1)), String.valueOf(xpc_fld0334b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0334B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0334b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0334b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0334e), String.valueOf(xpc_fld0334e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0334E  ==> " + String.valueOf(fld0334e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0334e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0335b, 19, 9, true, false, 1)), String.valueOf(xpc_fld0335b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0335B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0335b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0335b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0335e), String.valueOf(xpc_fld0335e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0335E  ==> " + String.valueOf(fld0335e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0335e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0336b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0336b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0336B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0336b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0336b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0336e), String.valueOf(xpc_fld0336e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0336E  ==> " + String.valueOf(fld0336e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0336e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0337b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0337b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0337B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0337b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0337b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0337e), String.valueOf(xpc_fld0337e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0337E  ==> " + String.valueOf(fld0337e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0337e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0338b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0338b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0338B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0338b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0338b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0338e), String.valueOf(xpc_fld0338e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0338E  ==> " + String.valueOf(fld0338e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0338e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0339b, 22, 13, false, false, 1)), String.valueOf(xpc_fld0339b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0339B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0339b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0339b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0339e), String.valueOf(xpc_fld0339e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0339E  ==> " + String.valueOf(fld0339e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0339e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0340b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0340b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0340B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0340b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0340b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0340e), String.valueOf(xpc_fld0340e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0340E  ==> " + String.valueOf(fld0340e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0340e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0341b, 21, 12, false, false, 1)), String.valueOf(xpc_fld0341b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0341B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0341b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0341b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0341e), String.valueOf(xpc_fld0341e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0341E  ==> " + String.valueOf(fld0341e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0341e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0342b, 17, 7, false, true, 1)), String.valueOf(xpc_fld0342b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0342B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0342b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0342b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0342e), String.valueOf(xpc_fld0342e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0342E  ==> " + String.valueOf(fld0342e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0342e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0343b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0343b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0343B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0343b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0343b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0343e), String.valueOf(xpc_fld0343e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0343E  ==> " + String.valueOf(fld0343e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0343e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0344b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0344b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0344B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0344b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0344b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0344e), String.valueOf(xpc_fld0344e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0344E  ==> " + String.valueOf(fld0344e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0344e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0345b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0345b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0345B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0345b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0345b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0345e), String.valueOf(xpc_fld0345e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0345E  ==> " + String.valueOf(fld0345e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0345e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0346b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0346b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0346B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0346b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0346b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0346e), String.valueOf(xpc_fld0346e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0346E  ==> " + String.valueOf(fld0346e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0346e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0347b, 6, 0, true, false, 1)), String.valueOf(xpc_fld0347b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0347B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0347b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0347b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0347e), String.valueOf(xpc_fld0347e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0347E  ==> " + String.valueOf(fld0347e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0347e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0348b, 21, 12, true, false, 1)), String.valueOf(xpc_fld0348b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0348B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0348b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0348b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0348e), String.valueOf(xpc_fld0348e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0348E  ==> " + String.valueOf(fld0348e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0348e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0349b, 35, 32, false, false, 1)), String.valueOf(xpc_fld0349b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0349B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0349b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0349b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0349e), String.valueOf(xpc_fld0349e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0349E  ==> " + String.valueOf(fld0349e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0349e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0350b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0350b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0350B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0350b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0350b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0350e), String.valueOf(xpc_fld0350e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0350E  ==> " + String.valueOf(fld0350e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0350e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0351b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0351b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0351B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0351b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0351b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0351e), String.valueOf(xpc_fld0351e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0351E  ==> " + String.valueOf(fld0351e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0351e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0352b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0352b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0352B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0352b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0352b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0352e), String.valueOf(xpc_fld0352e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0352E  ==> " + String.valueOf(fld0352e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0352e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0353b, 35, 33, false, false, 1)), String.valueOf(xpc_fld0353b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0353B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0353b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0353b)));
                }
            }
        }
    }
    private void do_check_part17() {
        if (!CobolString.cobolEquals(String.valueOf(fld0353e), String.valueOf(xpc_fld0353e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0353E  ==> " + String.valueOf(fld0353e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0353e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0354b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0354b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0354B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0354b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0354b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0354e), String.valueOf(xpc_fld0354e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0354E  ==> " + String.valueOf(fld0354e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0354e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0355b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0355b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0355B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0355b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0355b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0355e), String.valueOf(xpc_fld0355e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0355E  ==> " + String.valueOf(fld0355e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0355e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0356b, 32, 27, true, false, 1)), String.valueOf(xpc_fld0356b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0356B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0356b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0356b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0356e), String.valueOf(xpc_fld0356e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0356E  ==> " + String.valueOf(fld0356e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0356e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0357b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0357b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0357B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0357b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0357b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0357e), String.valueOf(xpc_fld0357e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0357E  ==> " + String.valueOf(fld0357e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0357e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0358b, 26, 17, true, false, 1)), String.valueOf(xpc_fld0358b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0358B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0358b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0358b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0358e), String.valueOf(xpc_fld0358e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0358E  ==> " + String.valueOf(fld0358e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0358e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0359b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0359b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0359B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0359b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0359b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0359e), String.valueOf(xpc_fld0359e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0359E  ==> " + String.valueOf(fld0359e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0359e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0360b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0360b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0360B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0360b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0360b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0360e), String.valueOf(xpc_fld0360e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0360E  ==> " + String.valueOf(fld0360e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0360e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0361b, 32, 27, true, false, 1)), String.valueOf(xpc_fld0361b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0361B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0361b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0361b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0361e), String.valueOf(xpc_fld0361e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0361E  ==> " + String.valueOf(fld0361e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0361e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0362b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0362b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0362B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0362b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0362b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0362e), String.valueOf(xpc_fld0362e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0362E  ==> " + String.valueOf(fld0362e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0362e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0363b, 34, 30, false, false, 1)), String.valueOf(xpc_fld0363b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0363B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0363b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0363b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0363e), String.valueOf(xpc_fld0363e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0363E  ==> " + String.valueOf(fld0363e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0363e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0364b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0364b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0364B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0364b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0364b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0364e), String.valueOf(xpc_fld0364e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0364E  ==> " + String.valueOf(fld0364e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0364e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0365b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0365b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0365B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0365b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0365b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0365e), String.valueOf(xpc_fld0365e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0365E  ==> " + String.valueOf(fld0365e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0365e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0366b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0366b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0366B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0366b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0366b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0366e), String.valueOf(xpc_fld0366e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0366E  ==> " + String.valueOf(fld0366e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0366e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0367b, 7, 1, false, true, 1)), String.valueOf(xpc_fld0367b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0367B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0367b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0367b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0367e), String.valueOf(xpc_fld0367e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0367E  ==> " + String.valueOf(fld0367e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0367e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0368b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0368b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0368B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0368b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0368b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0368e), String.valueOf(xpc_fld0368e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0368E  ==> " + String.valueOf(fld0368e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0368e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0369b, 11, 3, false, true, 1)), String.valueOf(xpc_fld0369b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0369B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0369b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0369b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0369e), String.valueOf(xpc_fld0369e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0369E  ==> " + String.valueOf(fld0369e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0369e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0370b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0370b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0370B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0370b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0370b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0370e), String.valueOf(xpc_fld0370e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0370E  ==> " + String.valueOf(fld0370e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0370e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0371b, 3, 0, false, true, 1)), String.valueOf(xpc_fld0371b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0371B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0371b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0371b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0371e), String.valueOf(xpc_fld0371e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0371E  ==> " + String.valueOf(fld0371e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0371e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0372b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0372b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0372B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0372b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0372b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0372e), String.valueOf(xpc_fld0372e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0372E  ==> " + String.valueOf(fld0372e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0372e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0373b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0373b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0373B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0373b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0373b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0373e), String.valueOf(xpc_fld0373e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0373E  ==> " + String.valueOf(fld0373e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0373e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0374b, 27, 19, false, false, 1)), String.valueOf(xpc_fld0374b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0374B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0374b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0374b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0374e), String.valueOf(xpc_fld0374e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0374E  ==> " + String.valueOf(fld0374e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0374e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0375b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0375b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0375B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0375b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0375b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0375e), String.valueOf(xpc_fld0375e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0375E  ==> " + String.valueOf(fld0375e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0375e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0376b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0376b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0376B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0376b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0376b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0376e), String.valueOf(xpc_fld0376e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0376E  ==> " + String.valueOf(fld0376e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0376e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0377b, 29, 22, false, false, 1)), String.valueOf(xpc_fld0377b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0377B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0377b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0377b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0377e), String.valueOf(xpc_fld0377e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0377E  ==> " + String.valueOf(fld0377e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0377e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0378b, 6, 0, false, true, 1)), String.valueOf(xpc_fld0378b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0378B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0378b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0378b)));
                }
            }
        }
    }
    private void do_check_part18() {
        if (!CobolString.cobolEquals(String.valueOf(fld0378e), String.valueOf(xpc_fld0378e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0378E  ==> " + String.valueOf(fld0378e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0378e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0379b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0379b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0379B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0379b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0379b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0379e), String.valueOf(xpc_fld0379e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0379E  ==> " + String.valueOf(fld0379e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0379e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0380b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0380b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0380B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0380b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0380b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0380e), String.valueOf(xpc_fld0380e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0380E  ==> " + String.valueOf(fld0380e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0380e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0381b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0381b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0381B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0381b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0381b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0381e), String.valueOf(xpc_fld0381e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0381E  ==> " + String.valueOf(fld0381e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0381e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0382b, 4, 0, true, false, 1)), String.valueOf(xpc_fld0382b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0382B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0382b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0382b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0382e), String.valueOf(xpc_fld0382e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0382E  ==> " + String.valueOf(fld0382e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0382e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0383b, 30, 24, false, false, 1)), String.valueOf(xpc_fld0383b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0383B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0383b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0383b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0383e), String.valueOf(xpc_fld0383e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0383E  ==> " + String.valueOf(fld0383e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0383e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0384b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0384b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0384B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0384b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0384b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0384e), String.valueOf(xpc_fld0384e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0384E  ==> " + String.valueOf(fld0384e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0384e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0385b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0385b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0385B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0385b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0385b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0385e), String.valueOf(xpc_fld0385e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0385E  ==> " + String.valueOf(fld0385e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0385e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0386b, 28, 21, false, false, 1)), String.valueOf(xpc_fld0386b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0386B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0386b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0386b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0386e), String.valueOf(xpc_fld0386e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0386E  ==> " + String.valueOf(fld0386e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0386e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0387b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0387b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0387B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0387b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0387b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0387e), String.valueOf(xpc_fld0387e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0387E  ==> " + String.valueOf(fld0387e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0387e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0388b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0388b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0388B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0388b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0388b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0388e), String.valueOf(xpc_fld0388e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0388E  ==> " + String.valueOf(fld0388e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0388e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0389b, 22, 12, true, false, 1)), String.valueOf(xpc_fld0389b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0389B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0389b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0389b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0389e), String.valueOf(xpc_fld0389e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0389E  ==> " + String.valueOf(fld0389e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0389e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0390b, 3, 0, true, false, 1)), String.valueOf(xpc_fld0390b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0390B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0390b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0390b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0390e), String.valueOf(xpc_fld0390e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0390E  ==> " + String.valueOf(fld0390e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0390e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0391b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0391b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0391B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0391b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0391b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0391e), String.valueOf(xpc_fld0391e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0391E  ==> " + String.valueOf(fld0391e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0391e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0392b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0392b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0392B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0392b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0392b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0392e), String.valueOf(xpc_fld0392e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0392E  ==> " + String.valueOf(fld0392e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0392e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0393b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0393b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0393B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0393b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0393b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0393e), String.valueOf(xpc_fld0393e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0393E  ==> " + String.valueOf(fld0393e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0393e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0394b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0394b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0394B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0394b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0394b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0394e), String.valueOf(xpc_fld0394e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0394E  ==> " + String.valueOf(fld0394e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0394e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0395b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0395b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0395B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0395b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0395b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0395e), String.valueOf(xpc_fld0395e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0395E  ==> " + String.valueOf(fld0395e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0395e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0396b, 16, 7, true, false, 1)), String.valueOf(xpc_fld0396b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0396B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0396b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0396b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0396e), String.valueOf(xpc_fld0396e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0396E  ==> " + String.valueOf(fld0396e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0396e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0397b, 2, 0, false, true, 1)), String.valueOf(xpc_fld0397b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0397B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0397b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0397b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0397e), String.valueOf(xpc_fld0397e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0397E  ==> " + String.valueOf(fld0397e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0397e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0398b, 10, 2, false, true, 1)), String.valueOf(xpc_fld0398b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0398B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0398b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0398b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0398e), String.valueOf(xpc_fld0398e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0398E  ==> " + String.valueOf(fld0398e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0398e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0399b, 9, 2, true, false, 1)), String.valueOf(xpc_fld0399b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0399B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0399b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0399b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0399e), String.valueOf(xpc_fld0399e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0399E  ==> " + String.valueOf(fld0399e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0399e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0400b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0400b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0400B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0400b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0400b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0400e), String.valueOf(xpc_fld0400e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0400E  ==> " + String.valueOf(fld0400e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0400e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0401b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0401b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0401B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0401b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0401b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0401e), String.valueOf(xpc_fld0401e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0401E  ==> " + String.valueOf(fld0401e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0401e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0402b, 26, 18, true, false, 1)), String.valueOf(xpc_fld0402b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0402B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0402b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0402b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0402e), String.valueOf(xpc_fld0402e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0402E  ==> " + String.valueOf(fld0402e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0402e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0403b, 35, 32, true, false, 1)), String.valueOf(xpc_fld0403b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0403B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0403b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0403b)));
                }
            }
        }
    }
    private void do_check_part19() {
        if (!CobolString.cobolEquals(String.valueOf(fld0403e), String.valueOf(xpc_fld0403e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0403E  ==> " + String.valueOf(fld0403e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0403e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0404b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0404b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0404B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0404b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0404b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0404e), String.valueOf(xpc_fld0404e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0404E  ==> " + String.valueOf(fld0404e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0404e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0405b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0405b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0405B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0405b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0405b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0405e), String.valueOf(xpc_fld0405e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0405E  ==> " + String.valueOf(fld0405e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0405e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0406b, 30, 23, true, false, 1)), String.valueOf(xpc_fld0406b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0406B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0406b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0406b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0406e), String.valueOf(xpc_fld0406e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0406E  ==> " + String.valueOf(fld0406e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0406e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0407b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0407b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0407B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0407b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0407b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0407e), String.valueOf(xpc_fld0407e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0407E  ==> " + String.valueOf(fld0407e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0407e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0408b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0408b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0408B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0408b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0408b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0408e), String.valueOf(xpc_fld0408e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0408E  ==> " + String.valueOf(fld0408e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0408e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0409b, 21, 12, true, false, 1)), String.valueOf(xpc_fld0409b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0409B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0409b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0409b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0409e), String.valueOf(xpc_fld0409e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0409E  ==> " + String.valueOf(fld0409e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0409e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0410b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0410b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0410B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0410b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0410b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0410e), String.valueOf(xpc_fld0410e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0410E  ==> " + String.valueOf(fld0410e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0410e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0411b, 29, 22, true, false, 1)), String.valueOf(xpc_fld0411b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0411B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0411b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0411b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0411e), String.valueOf(xpc_fld0411e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0411E  ==> " + String.valueOf(fld0411e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0411e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0412b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0412b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0412B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0412b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0412b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0412e), String.valueOf(xpc_fld0412e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0412E  ==> " + String.valueOf(fld0412e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0412e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0413b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0413b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0413B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0413b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0413b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0413e), String.valueOf(xpc_fld0413e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0413E  ==> " + String.valueOf(fld0413e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0413e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0414b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0414b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0414B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0414b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0414b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0414e), String.valueOf(xpc_fld0414e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0414E  ==> " + String.valueOf(fld0414e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0414e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0415b, 34, 31, true, false, 1)), String.valueOf(xpc_fld0415b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0415B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0415b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0415b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0415e), String.valueOf(xpc_fld0415e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0415E  ==> " + String.valueOf(fld0415e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0415e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0416b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0416b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0416B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0416b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0416b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0416e), String.valueOf(xpc_fld0416e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0416E  ==> " + String.valueOf(fld0416e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0416e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0417b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0417b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0417B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0417b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0417b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0417e), String.valueOf(xpc_fld0417e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0417E  ==> " + String.valueOf(fld0417e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0417e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0418b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0418b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0418B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0418b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0418b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0418e), String.valueOf(xpc_fld0418e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0418E  ==> " + String.valueOf(fld0418e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0418e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0419b, 20, 10, false, false, 1)), String.valueOf(xpc_fld0419b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0419B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0419b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0419b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0419e), String.valueOf(xpc_fld0419e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0419E  ==> " + String.valueOf(fld0419e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0419e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0420b, 34, 30, true, false, 1)), String.valueOf(xpc_fld0420b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0420B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0420b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0420b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0420e), String.valueOf(xpc_fld0420e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0420E  ==> " + String.valueOf(fld0420e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0420e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0421b, 7, 1, false, true, 1)), String.valueOf(xpc_fld0421b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0421B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0421b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0421b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0421e), String.valueOf(xpc_fld0421e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0421E  ==> " + String.valueOf(fld0421e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0421e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0422b, 36, 34, true, false, 1)), String.valueOf(xpc_fld0422b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0422B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0422b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0422b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0422e), String.valueOf(xpc_fld0422e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0422E  ==> " + String.valueOf(fld0422e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0422e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0423b, 26, 17, true, false, 1)), String.valueOf(xpc_fld0423b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0423B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0423b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0423b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0423e), String.valueOf(xpc_fld0423e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0423E  ==> " + String.valueOf(fld0423e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0423e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0424b, 27, 19, true, false, 1)), String.valueOf(xpc_fld0424b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0424B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0424b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0424b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0424e), String.valueOf(xpc_fld0424e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0424E  ==> " + String.valueOf(fld0424e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0424e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0425b, 22, 12, false, false, 1)), String.valueOf(xpc_fld0425b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0425B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0425b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0425b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0425e), String.valueOf(xpc_fld0425e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0425E  ==> " + String.valueOf(fld0425e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0425e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0426b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0426b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0426B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0426b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0426b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0426e), String.valueOf(xpc_fld0426e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0426E  ==> " + String.valueOf(fld0426e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0426e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0427b, 29, 22, true, false, 1)), String.valueOf(xpc_fld0427b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0427B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0427b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0427b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0427e), String.valueOf(xpc_fld0427e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0427E  ==> " + String.valueOf(fld0427e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0427e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0428b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0428b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0428B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0428b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0428b)));
                }
            }
        }
    }
    private void do_check_part20() {
        if (!CobolString.cobolEquals(String.valueOf(fld0428e), String.valueOf(xpc_fld0428e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0428E  ==> " + String.valueOf(fld0428e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0428e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0429b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0429b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0429B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0429b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0429b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0429e), String.valueOf(xpc_fld0429e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0429E  ==> " + String.valueOf(fld0429e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0429e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0430b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0430b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0430B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0430b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0430b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0430e), String.valueOf(xpc_fld0430e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0430E  ==> " + String.valueOf(fld0430e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0430e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0431b, 34, 31, false, false, 1)), String.valueOf(xpc_fld0431b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0431B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0431b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0431b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0431e), String.valueOf(xpc_fld0431e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0431E  ==> " + String.valueOf(fld0431e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0431e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0432b, 6, 0, false, true, 1)), String.valueOf(xpc_fld0432b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0432B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0432b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0432b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0432e), String.valueOf(xpc_fld0432e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0432E  ==> " + String.valueOf(fld0432e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0432e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0433b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0433b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0433B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0433b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0433b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0433e), String.valueOf(xpc_fld0433e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0433E  ==> " + String.valueOf(fld0433e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0433e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0434b, 35, 32, false, false, 1)), String.valueOf(xpc_fld0434b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0434B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0434b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0434b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0434e), String.valueOf(xpc_fld0434e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0434E  ==> " + String.valueOf(fld0434e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0434e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0435b, 22, 12, false, false, 1)), String.valueOf(xpc_fld0435b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0435B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0435b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0435b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0435e), String.valueOf(xpc_fld0435e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0435E  ==> " + String.valueOf(fld0435e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0435e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0436b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0436b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0436B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0436b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0436b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0436e), String.valueOf(xpc_fld0436e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0436E  ==> " + String.valueOf(fld0436e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0436e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0437b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0437b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0437B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0437b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0437b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0437e), String.valueOf(xpc_fld0437e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0437E  ==> " + String.valueOf(fld0437e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0437e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0438b, 33, 28, false, false, 1)), String.valueOf(xpc_fld0438b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0438B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0438b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0438b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0438e), String.valueOf(xpc_fld0438e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0438E  ==> " + String.valueOf(fld0438e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0438e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0439b, 21, 11, false, false, 1)), String.valueOf(xpc_fld0439b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0439B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0439b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0439b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0439e), String.valueOf(xpc_fld0439e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0439E  ==> " + String.valueOf(fld0439e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0439e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0440b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0440b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0440B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0440b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0440b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0440e), String.valueOf(xpc_fld0440e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0440E  ==> " + String.valueOf(fld0440e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0440e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0441b, 16, 6, false, true, 1)), String.valueOf(xpc_fld0441b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0441B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0441b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0441b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0441e), String.valueOf(xpc_fld0441e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0441E  ==> " + String.valueOf(fld0441e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0441e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0442b, 34, 31, true, false, 1)), String.valueOf(xpc_fld0442b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0442B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0442b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0442b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0442e), String.valueOf(xpc_fld0442e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0442E  ==> " + String.valueOf(fld0442e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0442e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0443b, 23, 14, false, false, 1)), String.valueOf(xpc_fld0443b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0443B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0443b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0443b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0443e), String.valueOf(xpc_fld0443e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0443E  ==> " + String.valueOf(fld0443e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0443e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0444b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0444b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0444B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0444b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0444b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0444e), String.valueOf(xpc_fld0444e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0444E  ==> " + String.valueOf(fld0444e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0444e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0445b, 17, 7, false, true, 1)), String.valueOf(xpc_fld0445b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0445B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0445b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0445b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0445e), String.valueOf(xpc_fld0445e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0445E  ==> " + String.valueOf(fld0445e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0445e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0446b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0446b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0446B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0446b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0446b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0446e), String.valueOf(xpc_fld0446e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0446E  ==> " + String.valueOf(fld0446e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0446e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0447b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0447b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0447B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0447b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0447b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0447e), String.valueOf(xpc_fld0447e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0447E  ==> " + String.valueOf(fld0447e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0447e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0448b, 20, 10, true, false, 1)), String.valueOf(xpc_fld0448b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0448B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0448b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0448b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0448e), String.valueOf(xpc_fld0448e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0448E  ==> " + String.valueOf(fld0448e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0448e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0449b, 12, 4, false, true, 1)), String.valueOf(xpc_fld0449b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0449B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0449b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0449b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0449e), String.valueOf(xpc_fld0449e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0449E  ==> " + String.valueOf(fld0449e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0449e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0450b, 22, 13, true, false, 1)), String.valueOf(xpc_fld0450b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0450B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0450b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0450b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0450e), String.valueOf(xpc_fld0450e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0450E  ==> " + String.valueOf(fld0450e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0450e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0451b, 9, 2, false, true, 1)), String.valueOf(xpc_fld0451b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0451B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0451b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0451b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0451e), String.valueOf(xpc_fld0451e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0451E  ==> " + String.valueOf(fld0451e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0451e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0452b, 21, 11, true, false, 1)), String.valueOf(xpc_fld0452b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0452B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0452b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0452b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0452e), String.valueOf(xpc_fld0452e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0452E  ==> " + String.valueOf(fld0452e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0452e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0453b, 36, 34, true, false, 1)), String.valueOf(xpc_fld0453b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0453B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0453b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0453b)));
                }
            }
        }
    }
    private void do_check_part21() {
        if (!CobolString.cobolEquals(String.valueOf(fld0453e), String.valueOf(xpc_fld0453e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0453E  ==> " + String.valueOf(fld0453e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0453e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0454b, 1, 0, false, true, 1)), String.valueOf(xpc_fld0454b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0454B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0454b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0454b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0454e), String.valueOf(xpc_fld0454e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0454E  ==> " + String.valueOf(fld0454e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0454e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0455b, 32, 27, false, false, 1)), String.valueOf(xpc_fld0455b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0455B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0455b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0455b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0455e), String.valueOf(xpc_fld0455e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0455E  ==> " + String.valueOf(fld0455e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0455e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0456b, 5, 0, true, false, 1)), String.valueOf(xpc_fld0456b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0456B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0456b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0456b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0456e), String.valueOf(xpc_fld0456e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0456E  ==> " + String.valueOf(fld0456e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0456e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0457b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0457b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0457B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0457b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0457b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0457e), String.valueOf(xpc_fld0457e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0457E  ==> " + String.valueOf(fld0457e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0457e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0458b, 12, 3, true, false, 1)), String.valueOf(xpc_fld0458b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0458B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0458b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0458b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0458e), String.valueOf(xpc_fld0458e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0458E  ==> " + String.valueOf(fld0458e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0458e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0459b, 21, 11, false, false, 1)), String.valueOf(xpc_fld0459b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0459B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0459b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0459b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0459e), String.valueOf(xpc_fld0459e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0459E  ==> " + String.valueOf(fld0459e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0459e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0460b, 29, 22, false, false, 1)), String.valueOf(xpc_fld0460b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0460B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0460b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0460b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0460e), String.valueOf(xpc_fld0460e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0460E  ==> " + String.valueOf(fld0460e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0460e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0461b, 8, 1, false, true, 1)), String.valueOf(xpc_fld0461b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0461B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0461b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0461b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0461e), String.valueOf(xpc_fld0461e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0461E  ==> " + String.valueOf(fld0461e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0461e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0462b, 36, 34, false, false, 1)), String.valueOf(xpc_fld0462b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0462B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0462b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0462b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0462e), String.valueOf(xpc_fld0462e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0462E  ==> " + String.valueOf(fld0462e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0462e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0463b, 15, 6, true, false, 1)), String.valueOf(xpc_fld0463b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0463B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0463b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0463b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0463e), String.valueOf(xpc_fld0463e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0463E  ==> " + String.valueOf(fld0463e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0463e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0464b, 27, 19, true, false, 1)), String.valueOf(xpc_fld0464b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0464B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0464b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0464b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0464e), String.valueOf(xpc_fld0464e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0464E  ==> " + String.valueOf(fld0464e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0464e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0465b, 31, 25, true, false, 1)), String.valueOf(xpc_fld0465b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0465B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0465b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0465b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0465e), String.valueOf(xpc_fld0465e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0465E  ==> " + String.valueOf(fld0465e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0465e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0466b, 5, 0, true, false, 1)), String.valueOf(xpc_fld0466b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0466B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0466b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0466b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0466e), String.valueOf(xpc_fld0466e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0466E  ==> " + String.valueOf(fld0466e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0466e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0467b, 33, 29, false, false, 1)), String.valueOf(xpc_fld0467b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0467B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0467b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0467b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0467e), String.valueOf(xpc_fld0467e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0467E  ==> " + String.valueOf(fld0467e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0467e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0468b, 11, 3, true, false, 1)), String.valueOf(xpc_fld0468b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0468B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0468b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0468b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0468e), String.valueOf(xpc_fld0468e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0468E  ==> " + String.valueOf(fld0468e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0468e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0469b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0469b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0469B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0469b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0469b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0469e), String.valueOf(xpc_fld0469e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0469E  ==> " + String.valueOf(fld0469e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0469e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0470b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0470b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0470B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0470b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0470b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0470e), String.valueOf(xpc_fld0470e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0470E  ==> " + String.valueOf(fld0470e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0470e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0471b, 1, 0, true, false, 1)), String.valueOf(xpc_fld0471b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0471B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0471b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0471b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0471e), String.valueOf(xpc_fld0471e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0471E  ==> " + String.valueOf(fld0471e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0471e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0472b, 32, 26, false, false, 1)), String.valueOf(xpc_fld0472b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0472B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0472b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0472b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0472e), String.valueOf(xpc_fld0472e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0472E  ==> " + String.valueOf(fld0472e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0472e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0473b, 26, 18, false, false, 1)), String.valueOf(xpc_fld0473b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0473B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0473b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0473b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0473e), String.valueOf(xpc_fld0473e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0473E  ==> " + String.valueOf(fld0473e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0473e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0474b, 5, 0, false, true, 1)), String.valueOf(xpc_fld0474b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0474B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0474b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0474b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0474e), String.valueOf(xpc_fld0474e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0474E  ==> " + String.valueOf(fld0474e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0474e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0475b, 15, 6, false, true, 1)), String.valueOf(xpc_fld0475b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0475B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0475b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0475b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0475e), String.valueOf(xpc_fld0475e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0475E  ==> " + String.valueOf(fld0475e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0475e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0476b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0476b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0476B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0476b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0476b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0476e), String.valueOf(xpc_fld0476e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0476E  ==> " + String.valueOf(fld0476e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0476e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0477b, 14, 5, false, true, 1)), String.valueOf(xpc_fld0477b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0477B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0477b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0477b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0477e), String.valueOf(xpc_fld0477e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0477E  ==> " + String.valueOf(fld0477e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0477e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0478b, 13, 4, true, false, 1)), String.valueOf(xpc_fld0478b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0478B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0478b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0478b)));
                }
            }
        }
    }
    private void do_check_part22() {
        if (!CobolString.cobolEquals(String.valueOf(fld0478e), String.valueOf(xpc_fld0478e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0478E  ==> " + String.valueOf(fld0478e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0478e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0479b, 31, 25, false, false, 1)), String.valueOf(xpc_fld0479b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0479B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0479b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0479b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0479e), String.valueOf(xpc_fld0479e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0479E  ==> " + String.valueOf(fld0479e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0479e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0480b, 28, 20, true, false, 1)), String.valueOf(xpc_fld0480b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0480B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0480b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0480b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0480e), String.valueOf(xpc_fld0480e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0480E  ==> " + String.valueOf(fld0480e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0480e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0481b, 37, 36, false, false, 1)), String.valueOf(xpc_fld0481b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0481B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0481b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0481b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0481e), String.valueOf(xpc_fld0481e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0481E  ==> " + String.valueOf(fld0481e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0481e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0482b, 18, 8, false, true, 1)), String.valueOf(xpc_fld0482b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0482B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0482b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0482b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0482e), String.valueOf(xpc_fld0482e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0482E  ==> " + String.valueOf(fld0482e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0482e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0483b, 12, 3, false, true, 1)), String.valueOf(xpc_fld0483b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0483B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0483b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0483b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0483e), String.valueOf(xpc_fld0483e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0483E  ==> " + String.valueOf(fld0483e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0483e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0484b, 21, 12, true, false, 1)), String.valueOf(xpc_fld0484b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0484B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0484b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0484b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0484e), String.valueOf(xpc_fld0484e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0484E  ==> " + String.valueOf(fld0484e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0484e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0485b, 6, 1, true, false, 1)), String.valueOf(xpc_fld0485b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0485B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0485b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0485b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0485e), String.valueOf(xpc_fld0485e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0485E  ==> " + String.valueOf(fld0485e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0485e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0486b, 17, 7, true, false, 1)), String.valueOf(xpc_fld0486b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0486B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0486b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0486b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0486e), String.valueOf(xpc_fld0486e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0486E  ==> " + String.valueOf(fld0486e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0486e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0487b, 26, 18, false, false, 1)), String.valueOf(xpc_fld0487b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0487B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0487b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0487b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0487e), String.valueOf(xpc_fld0487e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0487E  ==> " + String.valueOf(fld0487e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0487e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0488b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0488b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0488B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0488b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0488b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0488e), String.valueOf(xpc_fld0488e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0488E  ==> " + String.valueOf(fld0488e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0488e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0489b, 37, 36, true, false, 1)), String.valueOf(xpc_fld0489b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0489B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0489b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0489b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0489e), String.valueOf(xpc_fld0489e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0489E  ==> " + String.valueOf(fld0489e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0489e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0490b, 10, 2, true, false, 1)), String.valueOf(xpc_fld0490b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0490B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0490b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0490b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0490e), String.valueOf(xpc_fld0490e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0490E  ==> " + String.valueOf(fld0490e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0490e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0491b, 25, 16, false, false, 1)), String.valueOf(xpc_fld0491b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0491B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0491b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0491b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0491e), String.valueOf(xpc_fld0491e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0491E  ==> " + String.valueOf(fld0491e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0491e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0492b, 13, 4, false, true, 1)), String.valueOf(xpc_fld0492b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0492B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0492b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0492b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0492e), String.valueOf(xpc_fld0492e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0492E  ==> " + String.valueOf(fld0492e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0492e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0493b, 30, 24, true, false, 1)), String.valueOf(xpc_fld0493b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0493B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0493b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0493b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0493e), String.valueOf(xpc_fld0493e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0493E  ==> " + String.valueOf(fld0493e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0493e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0494b, 19, 9, false, false, 1)), String.valueOf(xpc_fld0494b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0494B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0494b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0494b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0494e), String.valueOf(xpc_fld0494e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0494E  ==> " + String.valueOf(fld0494e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0494e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0495b, 24, 15, true, false, 1)), String.valueOf(xpc_fld0495b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0495B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0495b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0495b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0495e), String.valueOf(xpc_fld0495e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0495E  ==> " + String.valueOf(fld0495e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0495e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0496b, 4, 0, false, true, 1)), String.valueOf(xpc_fld0496b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0496B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0496b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0496b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0496e), String.valueOf(xpc_fld0496e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0496E  ==> " + String.valueOf(fld0496e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0496e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0497b, 25, 16, true, false, 1)), String.valueOf(xpc_fld0497b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0497B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0497b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0497b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0497e), String.valueOf(xpc_fld0497e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0497E  ==> " + String.valueOf(fld0497e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0497e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0498b, 7, 1, true, false, 1)), String.valueOf(xpc_fld0498b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0498B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0498b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0498b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0498e), String.valueOf(xpc_fld0498e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0498E  ==> " + String.valueOf(fld0498e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0498e));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refModPacked(fld0499b, 24, 15, false, false, 1)), String.valueOf(xpc_fld0499b))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0499B ==> " + String.valueOf(CobolIntrinsics.hex_of(fld0499b)));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED ==> " + String.valueOf(CobolIntrinsics.hex_of(xpc_fld0499b)));
                }
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(fld0499e), String.valueOf(xpc_fld0499e))) {
            if (filler_1 == 0) {
                CobolDisplay.display("FLD0499E  ==> " + String.valueOf(fld0499e));
                if (filler_1 == 0) {
                    CobolDisplay.display("EXPECTED  ==> " + String.valueOf(xpc_fld0499e));
                }
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("PDTESTNR", "", "PDTESTNR.cob");
        CobolProgram.pushActive("PDTESTNR");
        try {
            CobolProgram.registerCallAlias("PDTESTNR", "DataPacked020BcdAddAndSubtractWOSizeError");
            CobolProgram.registerCallAlias("pdtestnr", "DataPacked020BcdAddAndSubtractWOSizeError");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new DataPacked020BcdAddAndSubtractWOSizeError().run();
    }
}
