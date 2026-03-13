package defpackage;

import java.security.SecureRandom;
/* renamed from: Hr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0333Hr {
    public static boolean a = true;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.SecureRandom a() {
        /*
            java.lang.String r0 = "EncryptUtil"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r2 = 26
            if (r1 < r2) goto L12
            java.security.SecureRandom r1 = defpackage.A0.q()     // Catch: java.security.NoSuchAlgorithmException -> Ld
            goto L13
        Ld:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            defpackage.AbstractC1522hL.e(r0, r1)
        L12:
            r1 = 0
        L13:
            r2 = 0
            if (r1 != 0) goto L1f
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r3)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            goto L1f
        L1d:
            r3 = move-exception
            goto L3e
        L1f:
            org.bouncycastle.crypto.engines.AESEngine r3 = new org.bouncycastle.crypto.engines.AESEngine     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r4 = 32
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r1.nextBytes(r4)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r6 = 1
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r6 = 384(0x180, float:5.38E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = r5.setEntropyBitsRequired(r6)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            r6 = 256(0x100, float:3.59E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandom r0 = r5.buildCTR(r3, r6, r4, r2)     // Catch: java.lang.Throwable -> L1d java.security.NoSuchAlgorithmException -> L5f
            return r0
        L3e:
            boolean r4 = defpackage.AbstractC0333Hr.a
            if (r4 == 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "exception : "
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = " , you should implementation bcprov-jdk15on library"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.AbstractC1522hL.e(r0, r3)
            defpackage.AbstractC0333Hr.a = r2
            goto L64
        L5f:
            java.lang.String r2 = "NoSuchAlgorithmException"
            defpackage.AbstractC1522hL.e(r0, r2)
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0333Hr.a():java.security.SecureRandom");
    }

    public static byte[] b(int i) {
        SecureRandom a2 = a();
        if (a2 == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        a2.nextBytes(bArr);
        return bArr;
    }

    public static String c(int i) {
        return AbstractC1281eb.h(b(i));
    }
}
