package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
/* renamed from: Pd0  reason: default package */
/* loaded from: classes.dex */
public final class Pd0 {
    public static final Pd0 b;
    public final Nd0 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = Md0.q;
        } else {
            b = Nd0.b;
        }
    }

    public Pd0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new Md0(this, windowInsets);
        } else if (i >= 29) {
            this.a = new Kd0(this, windowInsets);
        } else if (i >= 28) {
            this.a = new Jd0(this, windowInsets);
        } else {
            this.a = new Id0(this, windowInsets);
        }
    }

    public static SD e(SD sd, int i, int i2, int i3, int i4) {
        int max = Math.max(0, sd.a - i);
        int max2 = Math.max(0, sd.b - i2);
        int max3 = Math.max(0, sd.c - i3);
        int max4 = Math.max(0, sd.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return sd;
        }
        return SD.a(max, max2, max3, max4);
    }

    public static Pd0 g(WindowInsets windowInsets, View view) {
        Pd0 j;
        windowInsets.getClass();
        Pd0 pd0 = new Pd0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = Sb0.a;
            if (Build.VERSION.SDK_INT >= 23) {
                j = Ib0.a(view);
            } else {
                j = Hb0.j(view);
            }
            Nd0 nd0 = pd0.a;
            nd0.p(j);
            nd0.d(view.getRootView());
        }
        return pd0;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pd0)) {
            return false;
        }
        return Objects.equals(this.a, ((Pd0) obj).a);
    }

    public final WindowInsets f() {
        Nd0 nd0 = this.a;
        if (nd0 instanceof Hd0) {
            return ((Hd0) nd0).c;
        }
        return null;
    }

    public final int hashCode() {
        Nd0 nd0 = this.a;
        if (nd0 == null) {
            return 0;
        }
        return nd0.hashCode();
    }

    public Pd0() {
        this.a = new Nd0(this);
    }
}
