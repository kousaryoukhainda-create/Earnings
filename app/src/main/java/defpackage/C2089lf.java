package defpackage;
/* renamed from: lf  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2089lf extends Exception {
    public final String b;

    public C2089lf(String str, int i) {
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "compile error: " + this.b;
    }

    public C2089lf(String str) {
        this.b = str;
    }

    public C2089lf(C2926vO c2926vO) {
        this("cannot find " + c2926vO.getMessage());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2089lf(defpackage.C2255nc r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.c
            if (r0 == 0) goto L5
            goto L9
        L5:
            java.lang.String r0 = r2.toString()
        L9:
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2089lf.<init>(nc):void");
    }
}
