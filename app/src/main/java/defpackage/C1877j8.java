package defpackage;
/* renamed from: j8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877j8 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final C1963k8 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new C1963k8(this.d, str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC2437ph.l(sb, "Missing required properties:"));
    }
}
