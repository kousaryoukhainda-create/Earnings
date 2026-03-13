package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzgwt extends IOException {
    public zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzgwt(long r3, long r5, int r7, java.lang.Throwable r8) {
        /*
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = "Pos: "
            java.lang.String r1 = ", limit: "
            java.lang.StringBuilder r3 = defpackage.AbstractC0324Hi.k(r3, r0, r1)
            r3.append(r5)
            java.lang.String r4 = ", len: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwt.<init>(long, long, int, java.lang.Throwable):void");
    }

    public zzgwt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
