package com.fyber.fairbid;

import com.fyber.fairbid.mediation.display.NetworkModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class r7 {
    @NotNull
    public static List a(@NotNull o7 fallbackModeOnShow) {
        Intrinsics.checkNotNullParameter(fallbackModeOnShow, "fallbackModeOnShow");
        int ordinal = fallbackModeOnShow.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                C2968vr c2968vr = C2968vr.b;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return c2968vr;
                        }
                        throw new RuntimeException();
                    }
                    return C0320He.a(o7.d);
                }
                return c2968vr;
            }
            return C0346Ie.c(o7.b, o7.a);
        }
        return C0346Ie.c(o7.a, o7.b);
    }

    @NotNull
    public static List a(x6 x6Var, NetworkModel networkModel) {
        Double e;
        if (x6Var != null && (e = x6Var.e()) != null) {
            List c = e.doubleValue() - (networkModel != null ? networkModel.j : 0.0d) >= 0.0d ? C0346Ie.c(o7.b, o7.a) : C0346Ie.c(o7.a, o7.b);
            if (c != null) {
                return c;
            }
        }
        return C0320He.a(o7.a);
    }
}
