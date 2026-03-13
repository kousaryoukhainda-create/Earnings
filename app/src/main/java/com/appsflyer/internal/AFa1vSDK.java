package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public class AFa1vSDK {
    public static int AppsFlyer2dXConversionCallback = 0;
    public static byte[] getLevel = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    private static int onAttributionFailureNative = 1;
    public static final byte[] onConversionDataSuccess = null;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    private static Object onInstallConversionFailureNative;
    public static final int onResponseErrorNative = 0;

    private static String $$c(byte b, int i, short s) {
        int i2 = onAttributionFailureNative;
        onDeepLinkingNative = (((i2 | 125) << 1) - (i2 ^ 125)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i3 = -i;
        int i4 = (i3 ^ 119) + ((i3 & 119) << 1);
        int i5 = 36 - b;
        int i6 = s + 28;
        int i7 = (i6 & (-24)) + (i6 | (-24));
        byte[] bArr = onConversionDataSuccess;
        byte[] bArr2 = new byte[i5];
        int i8 = (-2) - (~i5);
        int i9 = -1;
        if (bArr == null) {
            onDeepLinkingNative = ((i2 & 125) + (i2 | 125)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i4 = ((i8 & i4) + (i8 | i4)) - 3;
            i7++;
            int i10 = onDeepLinkingNative;
            onAttributionFailureNative = (((i10 | 15) << 1) - (i10 ^ 15)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i9 = -1;
        }
        while (true) {
            int i11 = (((i9 | (-67)) << 1) - (i9 ^ (-67))) + 68;
            bArr2[i11] = (byte) i4;
            if (i11 == i8) {
                String str = new String(bArr2, 0);
                int i12 = onAttributionFailureNative;
                onDeepLinkingNative = (((i12 | 103) << 1) - (i12 ^ 103)) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return str;
            }
            byte b2 = bArr[i7];
            onDeepLinkingNative = (onAttributionFailureNative + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i4 = ((i4 & b2) + (i4 | b2)) - 3;
            i7++;
            int i13 = onDeepLinkingNative;
            onAttributionFailureNative = (((i13 | 15) << 1) - (i13 ^ 15)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i9 = i11;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:608:0x13e9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static Object AFInAppEventParameterName(char c, int i, int i2) {
        byte[] bArr;
        int i3 = onDeepLinkingNative;
        int i4 = ((i3 | 117) << 1) - (i3 ^ 117);
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        onAttributionFailureNative = i5;
        if (i4 % 2 != 0) {
            Object obj = onInstallConversionFailureNative;
            onDeepLinkingNative = ((i5 ^ 61) + ((i5 & 61) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            try {
                Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
                byte b = onConversionDataSuccess[452];
                Class<?> cls = Class.forName($$c(bArr[14], b, (short) ((b ^ 835) | (b & 835))), true, (ClassLoader) init);
                String $$c = $$c(bArr[452], bArr[12], (short) 333);
                Class<?> cls2 = Integer.TYPE;
                return cls.getMethod($$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    public static int AFInAppEventType(Object obj) {
        int i = (onDeepLinkingNative + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        onAttributionFailureNative = i;
        Object obj2 = onInstallConversionFailureNative;
        onDeepLinkingNative = ((i ^ 33) + ((i & 33) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        onDeepLinkingNative = (i + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onConversionDataSuccess;
            byte b = bArr[452];
            Class<?> cls = Class.forName($$c(bArr[14], b, (short) ((b ^ 835) | (b & 835))), true, (ClassLoader) init);
            byte b2 = bArr[26];
            int intValue = ((Integer) cls.getMethod($$c((byte) (-bArr[348]), b2, (short) ((b2 ^ 742) | (b2 & 742))), Object.class).invoke(obj2, objArr)).intValue();
            int i2 = onDeepLinkingNative + 115;
            onAttributionFailureNative = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 != 0) {
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
        int i2 = onAttributionFailureNative;
        int i3 = (i2 ^ 67) + ((i2 & 67) << 1);
        onDeepLinkingNative = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 != 0) {
            byte[] bArr = new byte[1018];
            System.arraycopy("_Ô\u0099áú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜMú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\r\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓKÝô\nÜ\u0003ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓKÝô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1018);
            onConversionDataSuccess = bArr;
            i = 11898;
        } else {
            byte[] bArr2 = new byte[1018];
            System.arraycopy("_Ô\u0099áú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜMú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\r\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓKÝô\nÜ\u0003ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓKÝô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1018);
            onConversionDataSuccess = bArr2;
            i = 187;
        }
        onResponseErrorNative = i;
    }

    public static int valueOf(int i) {
        Object obj;
        byte[] bArr;
        int i2 = onDeepLinkingNative + 91;
        int i3 = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        onAttributionFailureNative = i3;
        if (i2 % 2 == 0) {
            obj = onInstallConversionFailureNative;
            int i4 = 1 / 0;
        } else {
            obj = onInstallConversionFailureNative;
        }
        onDeepLinkingNative = ((i3 ^ 117) + ((i3 & 117) << 1)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte b = onConversionDataSuccess[452];
            int intValue = ((Integer) Class.forName($$c(bArr[14], b, (short) ((b ^ 835) | (b & 835))), true, (ClassLoader) init).getMethod($$c(bArr[452], bArr[12], (short) 333), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i5 = onAttributionFailureNative;
            int i6 = (i5 ^ 15) + ((i5 & 15) << 1);
            onDeepLinkingNative = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i6 % 2 == 0) {
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
