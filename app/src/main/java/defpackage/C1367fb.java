package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: fb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367fb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C1367fb(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            throw new IllegalArgumentException(AbstractC0324Hi.d(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        throw new IllegalArgumentException(AbstractC0324Hi.d(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
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
        if (!C1367fb.class.equals(cls)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C1367fb c1367fb = (C1367fb) obj;
        if (this.a == c1367fb.a && this.b == c1367fb.b && this.c == c1367fb.c && this.d == c1367fb.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1367fb.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return AbstractC2437ph.k(sb, this.d, "] }");
    }
}
