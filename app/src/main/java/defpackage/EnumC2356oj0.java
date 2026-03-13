package defpackage;

import io.adjoe.sdk.PlaytimeException;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: oj0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC2356oj0 implements InterfaceC2434pf0 {
    public static final C2098lj0 b;
    public static final C2184mj0 c;
    public static final C2270nj0 d;
    public static final C1556hj0 f;
    public static final C1298ej0 g;
    public static final C1641ij0 h;
    public static final C1470gj0 i;
    public static final C1213dj0 j;
    public static final C1384fj0 k;
    public static final C1926jj0 l;
    public static final C2012kj0 m;

    static {
        C2098lj0 c2098lj0 = new C2098lj0();
        b = c2098lj0;
        C2184mj0 c2184mj0 = new C2184mj0();
        c = c2184mj0;
        C2270nj0 c2270nj0 = new C2270nj0();
        d = c2270nj0;
        C1556hj0 c1556hj0 = new C1556hj0();
        f = c1556hj0;
        C1298ej0 c1298ej0 = new C1298ej0();
        g = c1298ej0;
        C1641ij0 c1641ij0 = new C1641ij0();
        h = c1641ij0;
        C1470gj0 c1470gj0 = new C1470gj0();
        i = c1470gj0;
        C1213dj0 c1213dj0 = new C1213dj0();
        j = c1213dj0;
        C1384fj0 c1384fj0 = new C1384fj0();
        k = c1384fj0;
        C1926jj0 c1926jj0 = new C1926jj0();
        l = c1926jj0;
        C2012kj0 c2012kj0 = new C2012kj0();
        m = c2012kj0;
        AbstractC1281eb.u(new EnumC2356oj0[]{c2098lj0, c2184mj0, c2270nj0, c1556hj0, c1298ej0, c1641ij0, c1470gj0, c1213dj0, c1384fj0, c1926jj0, c2012kj0});
    }

    @Override // defpackage.InterfaceC2434pf0
    public final String computeHash(String str) {
        return AbstractC0867af0.c(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.adjoe.sdk.PlaytimeException, pj0] */
    public final C2442pj0 e() {
        return new PlaytimeException(AbstractC0867af0.b(this, String.valueOf(AbstractC3019wV.a(C2442pj0.class).b())), null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.adjoe.sdk.PlaytimeException, pj0] */
    public final C2442pj0 f(Exception cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        return new PlaytimeException(AbstractC0867af0.b(this, String.valueOf(AbstractC3019wV.a(C2442pj0.class).b())), cause);
    }

    @Override // defpackage.InterfaceC2434pf0
    public final /* bridge */ /* synthetic */ int getOrdinal() {
        return ordinal();
    }
}
