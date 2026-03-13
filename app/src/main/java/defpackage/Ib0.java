package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
/* renamed from: Ib0  reason: default package */
/* loaded from: classes.dex */
public abstract class Ib0 {
    public static Pd0 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Pd0 g = Pd0.g(rootWindowInsets, null);
        Nd0 nd0 = g.a;
        nd0.p(g);
        nd0.d(view.getRootView());
        return g;
    }

    public static int b(@NonNull View view) {
        return view.getScrollIndicators();
    }

    public static void c(@NonNull View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(@NonNull View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
