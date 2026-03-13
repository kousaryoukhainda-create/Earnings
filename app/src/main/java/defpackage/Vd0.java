package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Vd0  reason: default package */
/* loaded from: classes.dex */
public final class Vd0 {
    public final C1367fb a;
    public final Pd0 b;

    public Vd0(C1367fb _bounds, Pd0 _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.a = _bounds;
        this.b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Vd0.class.equals(cls)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        Vd0 vd0 = (Vd0) obj;
        if (Intrinsics.a(this.a, vd0.a) && Intrinsics.a(this.b, vd0.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vd0(Rect bounds, Pd0 insets) {
        this(new C1367fb(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
