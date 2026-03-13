package defpackage;
/* renamed from: h8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507h8 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final C1593i8 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new C1593i8(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
