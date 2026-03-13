package defpackage;
/* renamed from: s8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2650s8 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final C2736t8 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new C2736t8(str, this.a, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
