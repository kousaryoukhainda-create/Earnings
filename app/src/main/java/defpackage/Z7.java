package defpackage;
/* renamed from: Z7  reason: default package */
/* loaded from: classes.dex */
public final class Z7 {
    public long a;
    public String b;
    public C0917b8 c;
    public C2135m8 d;
    public C2221n8 e;
    public C2564r8 f;
    public byte g;

    public final C0826a8 a() {
        String str;
        C0917b8 c0917b8;
        C2135m8 c2135m8;
        if (this.g == 1 && (str = this.b) != null && (c0917b8 = this.c) != null && (c2135m8 = this.d) != null) {
            return new C0826a8(this.a, str, c0917b8, c2135m8, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
