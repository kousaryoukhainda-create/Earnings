package defpackage;

import io.adjoe.sdk.PlaytimeException;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: mh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC2180mh0 implements InterfaceC2434pf0 {
    public static final Vg0 A;
    public static final Xg0 B;
    public static final Og0 b;
    public static final C2008kh0 c;
    public static final Ng0 d;
    public static final C1552hh0 f;
    public static final C1466gh0 g;
    public static final C1922jh0 h;
    public static final C1637ih0 i;
    public static final Mg0 j;
    public static final C2094lh0 k;
    public static final Tg0 l;
    public static final C0871ah0 m;
    public static final C1047ch0 n;
    public static final C1209dh0 o;
    public static final Zg0 p;
    public static final Yg0 q;
    public static final Rg0 r;
    public static final Qg0 s;
    public static final C1294eh0 t;
    public static final Ug0 u;
    public static final Wg0 v;
    public static final C1380fh0 w;
    public static final Sg0 x;
    public static final C0962bh0 y;
    public static final Pg0 z;

    static {
        Og0 og0 = new Og0();
        b = og0;
        C2008kh0 c2008kh0 = new C2008kh0();
        c = c2008kh0;
        Ng0 ng0 = new Ng0();
        d = ng0;
        C1552hh0 c1552hh0 = new C1552hh0();
        f = c1552hh0;
        C1466gh0 c1466gh0 = new C1466gh0();
        g = c1466gh0;
        C1922jh0 c1922jh0 = new C1922jh0();
        h = c1922jh0;
        C1637ih0 c1637ih0 = new C1637ih0();
        i = c1637ih0;
        Mg0 mg0 = new Mg0();
        j = mg0;
        C2094lh0 c2094lh0 = new C2094lh0();
        k = c2094lh0;
        Tg0 tg0 = new Tg0();
        l = tg0;
        C0871ah0 c0871ah0 = new C0871ah0();
        m = c0871ah0;
        C1047ch0 c1047ch0 = new C1047ch0();
        n = c1047ch0;
        C1209dh0 c1209dh0 = new C1209dh0();
        o = c1209dh0;
        Zg0 zg0 = new Zg0();
        p = zg0;
        Yg0 yg0 = new Yg0();
        q = yg0;
        Rg0 rg0 = new Rg0();
        r = rg0;
        Qg0 qg0 = new Qg0();
        s = qg0;
        C1294eh0 c1294eh0 = new C1294eh0();
        t = c1294eh0;
        Ug0 ug0 = new Ug0();
        u = ug0;
        Wg0 wg0 = new Wg0();
        v = wg0;
        C1380fh0 c1380fh0 = new C1380fh0();
        w = c1380fh0;
        Sg0 sg0 = new Sg0();
        x = sg0;
        C0962bh0 c0962bh0 = new C0962bh0();
        y = c0962bh0;
        Pg0 pg0 = new Pg0();
        z = pg0;
        Vg0 vg0 = new Vg0();
        A = vg0;
        Xg0 xg0 = new Xg0();
        B = xg0;
        AbstractC1281eb.u(new EnumC2180mh0[]{og0, c2008kh0, ng0, c1552hh0, c1466gh0, c1922jh0, c1637ih0, mg0, c2094lh0, tg0, c0871ah0, c1047ch0, c1209dh0, zg0, yg0, rg0, qg0, c1294eh0, ug0, wg0, c1380fh0, sg0, c0962bh0, pg0, vg0, xg0});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.adjoe.sdk.PlaytimeException, nh0] */
    public final C2266nh0 a(Exception cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new PlaytimeException(AbstractC0867af0.b(this, String.valueOf(AbstractC3019wV.a(C2266nh0.class).b())), cause);
    }

    @Override // defpackage.InterfaceC2434pf0
    public final String computeHash(String str) {
        return AbstractC0867af0.c(str);
    }

    @Override // defpackage.InterfaceC2434pf0
    public final /* bridge */ /* synthetic */ int getOrdinal() {
        return ordinal();
    }
}
