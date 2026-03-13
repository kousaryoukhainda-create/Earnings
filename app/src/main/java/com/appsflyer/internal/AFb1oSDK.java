package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes.dex */
public class AFb1oSDK {
    public static byte[] AppsFlyerLib = null;
    public static byte[] onPause = null;
    public static final byte[] setAndroidIdData = null;
    private static int setCustomerUserId = 1;
    public static int setDebugLog;
    private static Object setImeiData;
    private static Object setOaidData;
    public static final int setPhoneNumber = 0;
    public static int updateServerUninstallToken;
    private static int waitForCustomerUserId;

    private static String $$c(short s, int i, short s2) {
        int i2 = waitForCustomerUserId;
        int i3 = (((i2 | 19) << 1) - (i2 ^ 19)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        setCustomerUserId = i3;
        int i4 = -s;
        int i5 = ((i4 | 36) << 1) - (i4 ^ 36);
        int i6 = -i;
        int i7 = (i6 ^ 119) + ((i6 & 119) << 1);
        int i8 = s2 + 4;
        byte[] bArr = setAndroidIdData;
        byte[] bArr2 = new byte[i5];
        int i9 = -1;
        int i10 = i5 - 1;
        if (bArr == null) {
            int i11 = i3 + 107;
            waitForCustomerUserId = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 41 / 0;
            }
            int i13 = i8 + (-i10);
            waitForCustomerUserId = (setCustomerUserId + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i8 = i8;
            i7 = i13;
        }
        while (true) {
            int i14 = ((i9 | 125) << 1) - (i9 ^ 125);
            i9 = ((i14 | (-124)) << 1) - (i14 ^ (-124));
            bArr2[i9] = (byte) i7;
            if (i9 == i10) {
                break;
            }
            int i15 = (i8 ^ (-56)) + ((i8 & (-56)) << 1);
            int i16 = (i15 ^ 57) + ((i15 & 57) << 1);
            int i17 = i7 + (-bArr[i16]);
            waitForCustomerUserId = (setCustomerUserId + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i8 = i16;
            i7 = i17;
        }
        String str = new String(bArr2, 0);
        int i18 = setCustomerUserId;
        int i19 = (i18 & 21) + (i18 | 21);
        waitForCustomerUserId = i19 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 % 2 != 0) {
            int i20 = 38 / 0;
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:(35:730|731|(0)|13|(0)|15|16|(0)|22|(0)|(0)|33|34|35|36|37|(0)(0)|40|41|(0)(0)|44|(0)(0)|47|48|(0)(0)|51|52|53|(0)(0)|56|57|58|(0)|711|712)|11|(0)|13|(0)|15|16|(0)|22|(0)|(0)|33|34|35|36|37|(0)(0)|40|41|(0)(0)|44|(0)(0)|47|48|(0)(0)|51|52|53|(0)(0)|56|57|58|(0)|711|712) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x080e A[Catch: all -> 0x0503, TryCatch #100 {all -> 0x0503, blocks: (B:157:0x04fc, B:167:0x051a, B:172:0x0545, B:173:0x0549, B:165:0x050e, B:174:0x054f, B:223:0x0754, B:225:0x075b, B:226:0x075c, B:253:0x0808, B:255:0x080e, B:256:0x080f, B:198:0x061c, B:177:0x0567, B:207:0x0672, B:188:0x05c5, B:211:0x070f), top: B:876:0x04fc, inners: #98 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x080f A[Catch: all -> 0x0503, TRY_LEAVE, TryCatch #100 {all -> 0x0503, blocks: (B:157:0x04fc, B:167:0x051a, B:172:0x0545, B:173:0x0549, B:165:0x050e, B:174:0x054f, B:223:0x0754, B:225:0x075b, B:226:0x075c, B:253:0x0808, B:255:0x080e, B:256:0x080f, B:198:0x061c, B:177:0x0567, B:207:0x0672, B:188:0x05c5, B:211:0x070f), top: B:876:0x04fc, inners: #98 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0e3e A[Catch: all -> 0x0c2f, Exception -> 0x0e4a, LOOP:5: B:378:0x0e3c->B:379:0x0e3e, LOOP_END, TryCatch #103 {Exception -> 0x0e4a, blocks: (B:377:0x0db2, B:379:0x0e3e, B:382:0x0e4d), top: B:881:0x0db2, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161 A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #113 {Exception -> 0x0041, blocks: (B:3:0x0019, B:5:0x0031, B:38:0x0117, B:43:0x0161, B:49:0x01d3, B:60:0x025b, B:62:0x02bc, B:69:0x02f4, B:73:0x02fd, B:78:0x0306, B:83:0x0311, B:89:0x0328, B:101:0x0347, B:785:0x181b, B:779:0x1801, B:784:0x1817, B:786:0x183c, B:787:0x1849, B:789:0x185d, B:790:0x188f, B:59:0x022e, B:46:0x01ab, B:44:0x0170, B:39:0x0138, B:51:0x01e6), top: B:893:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x12f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x1801 A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #113 {Exception -> 0x0041, blocks: (B:3:0x0019, B:5:0x0031, B:38:0x0117, B:43:0x0161, B:49:0x01d3, B:60:0x025b, B:62:0x02bc, B:69:0x02f4, B:73:0x02fd, B:78:0x0306, B:83:0x0311, B:89:0x0328, B:101:0x0347, B:785:0x181b, B:779:0x1801, B:784:0x1817, B:786:0x183c, B:787:0x1849, B:789:0x185d, B:790:0x188f, B:59:0x022e, B:46:0x01ab, B:44:0x0170, B:39:0x0138, B:51:0x01e6), top: B:893:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x13ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:918:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:938:0x12a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:968:0x1849 A[EDGE_INSN: B:968:0x1849->B:787:0x1849 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:972:0x150a A[EDGE_INSN: B:972:0x150a->B:605:0x150a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v86, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v153 */
    /* JADX WARN: Type inference failed for: r9v176 */
    /* JADX WARN: Type inference failed for: r9v178 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v196 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86, types: [java.lang.Class, java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 6365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1oSDK.<clinit>():void");
    }

    private AFb1oSDK() {
    }

    public static int AFKeystoreWrapper(int i) {
        int i2 = waitForCustomerUserId;
        int i3 = (((i2 | 25) << 1) - (i2 ^ 25)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        setCustomerUserId = i3;
        Object obj = setImeiData;
        waitForCustomerUserId = (i3 + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = setAndroidIdData;
            int intValue = ((Integer) Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData).getMethod($$c(bArr[608], bArr[40], (short) 796), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i4 = waitForCustomerUserId + 75;
            setCustomerUserId = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i;
        int i2 = waitForCustomerUserId + 19;
        setCustomerUserId = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            byte[] bArr = new byte[1008];
            System.arraycopy("_\u00ad\u009d\u009cÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë7\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ0ß\u0004ý!Û\u0007ï\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ýô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Â\u001c\u000fù'\u00ad\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýù\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷úô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Á\u001d\u000fù'\u0000\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûúô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûä1Á\u001d\u000fù'\u0000\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ì6\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 1008);
            setAndroidIdData = bArr;
            i = LocationRequest.PRIORITY_NO_POWER;
        } else {
            byte[] bArr2 = new byte[1008];
            System.arraycopy("_\u00ad\u009d\u009cÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë7\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ0ß\u0004ý!Û\u0007ï\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ýô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Â\u001c\u000fù'\u00ad\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýù\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷úô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Á\u001d\u000fù'\u0000\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûúô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûä1Á\u001d\u000fù'\u0000\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ì6\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr2, 0, 1008);
            setAndroidIdData = bArr2;
            i = LocationRequest.PRIORITY_LOW_POWER;
        }
        setPhoneNumber = i;
    }

    public static Object values(int i, int i2, char c) {
        int i3 = setCustomerUserId;
        Object obj = setImeiData;
        int i4 = (((i3 | 89) << 1) - (i3 ^ 89)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        waitForCustomerUserId = i4;
        setCustomerUserId = ((i4 ^ 31) + ((i4 & 31) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = setAndroidIdData;
            Class<?> cls = Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData);
            String $$c = $$c(bArr[60], bArr[111], (short) 388);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i5 = setCustomerUserId;
            waitForCustomerUserId = (((i5 | LocationRequest.PRIORITY_NO_POWER) << 1) - (i5 ^ LocationRequest.PRIORITY_NO_POWER)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(Object obj) {
        int i = setCustomerUserId;
        int i2 = ((i ^ 43) + ((i & 43) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        waitForCustomerUserId = i2;
        Object obj2 = setImeiData;
        setCustomerUserId = (i2 + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {obj};
            byte[] bArr = setAndroidIdData;
            int intValue = ((Integer) Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData).getMethod($$c(bArr[15], bArr[111], (short) 336), Object.class).invoke(obj2, objArr)).intValue();
            int i3 = waitForCustomerUserId;
            int i4 = (i3 & 75) + (i3 | 75);
            setCustomerUserId = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
