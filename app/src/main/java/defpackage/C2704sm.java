package defpackage;
/* renamed from: sm  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2704sm extends C1946k implements Z60 {
    public final int d;
    public int f;
    public int g;
    public String h;

    public C2704sm(int i, int i2) {
        super(null);
        this.d = i;
        this.f = i2;
        this.g = -1;
        this.h = null;
    }

    public static void g(StringBuilder sb, C1946k c1946k, char c) {
        while (true) {
            AbstractC2032l abstractC2032l = c1946k.b;
            if (abstractC2032l instanceof C1872j50) {
                sb.append(((C1872j50) abstractC2032l).b);
            } else if (abstractC2032l instanceof C1946k) {
                g(sb, (C1946k) abstractC2032l, c);
            }
            c1946k = c1946k.c;
            if (c1946k == null) {
                return;
            }
            sb.append(c);
        }
    }

    @Override // defpackage.C1946k, defpackage.AbstractC2032l
    public final void a(AbstractC0867af0 abstractC0867af0) {
        abstractC0867af0.m(this);
    }

    @Override // defpackage.AbstractC2032l
    public final String b() {
        return "decl";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2704sm(C1946k c1946k, int i) {
        super(null);
        String str = null;
        this.d = 307;
        this.f = i;
        this.g = -1;
        if (c1946k != null) {
            StringBuilder sb = new StringBuilder();
            g(sb, c1946k, '/');
            str = sb.toString();
        }
        this.h = str;
    }

    public C2704sm(int i, String str, int i2, int i3, C1872j50 c1872j50) {
        super(null);
        this.d = i;
        this.f = i2;
        this.g = i3;
        this.h = str;
        this.b = c1872j50;
        C1946k.c(this, null);
    }
}
