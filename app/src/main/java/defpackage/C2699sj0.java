package defpackage;
/* renamed from: sj0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2699sj0 extends Exception {
    public final /* synthetic */ int b;
    public final int c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(String str, int i, int i2) {
        super("Http Error");
        this.b = 1;
        this.c = i;
        this.d = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        switch (this.b) {
            case 0:
                return "HttpStatusException{code=" + this.c + ", errorBody='" + this.d + "'}'" + super.toString();
            default:
                StringBuilder b = Ki0.b("HttpStatusException{code=");
                b.append(this.c);
                b.append(", errorBody='");
                b.append(this.d);
                b.append('\'');
                b.append('}');
                b.append('\'');
                b.append(super.toString());
                return b.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(String str, int i, int i2, byte b) {
        super("Http Error");
        this.b = i2;
        switch (i2) {
            case 1:
                super(str);
                this.c = i;
                return;
            default:
                this.c = i;
                this.d = str;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(String str) {
        super(str);
        this.b = 0;
        this.c = 700;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(C2266nh0 c2266nh0) {
        super(c2266nh0);
        this.b = 1;
        this.c = -998;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(Exception exc) {
        super("HTTP request failed", exc);
        this.b = 0;
        this.c = 702;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699sj0(int i, String str, Exception exc) {
        super(str, exc);
        this.b = 1;
        this.c = i;
    }
}
