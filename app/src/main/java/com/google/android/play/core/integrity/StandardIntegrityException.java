package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
/* loaded from: classes3.dex */
public class StandardIntegrityException extends ApiException {
    private final Throwable a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StandardIntegrityException(int r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = com.google.android.play.core.integrity.model.b.a(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Standard Integrity API error ("
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r5, r1)
            r4.<init>(r0)
            if (r5 == 0) goto L2e
            r4.a = r6
            return
        L2e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ErrorCode should not be 0."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityException.<init>(int, java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
