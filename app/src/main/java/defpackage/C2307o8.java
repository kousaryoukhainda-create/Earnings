package defpackage;
/* renamed from: o8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2307o8 {
    public C2479q8 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final C2393p8 a() {
        C2479q8 c2479q8;
        String str;
        String str2;
        if (this.e == 1 && (c2479q8 = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new C2393p8(c2479q8, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
