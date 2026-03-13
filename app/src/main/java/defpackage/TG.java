package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import com.huawei.hms.android.HwBuildEx;
/* renamed from: TG  reason: default package */
/* loaded from: classes.dex */
public class TG {
    public int a = -1;
    public RecyclerView b;
    public f c;
    public boolean d;
    public boolean e;
    public View f;
    public final C1988kV g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kV] */
    public TG(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int c(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = b(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public final PointF d(int i) {
        f fVar = this.c;
        if (fVar instanceof InterfaceC2074lV) {
            return ((InterfaceC2074lV) fVar).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC2074lV.class.getCanonicalName());
        return null;
    }

    public final void e(int i, int i2) {
        PointF d;
        RecyclerView recyclerView = this.b;
        int i3 = -1;
        if (this.a == -1 || recyclerView == null) {
            g();
        }
        if (this.d && this.f == null && this.c != null && (d = d(this.a)) != null) {
            float f = d.x;
            if (f != 0.0f || d.y != 0.0f) {
                recyclerView.Y((int) Math.signum(f), (int) Math.signum(d.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        C1988kV c1988kV = this.g;
        if (view != null) {
            this.b.getClass();
            i H = RecyclerView.H(view);
            if (H != null) {
                i3 = H.getLayoutPosition();
            }
            if (i3 == this.a) {
                View view2 = this.f;
                C2160mV c2160mV = recyclerView.g0;
                f(view2, c1988kV);
                c1988kV.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            C2160mV c2160mV2 = recyclerView.g0;
            if (this.b.o.v() == 0) {
                g();
            } else {
                int i4 = this.o;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.o = i5;
                int i6 = this.p;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF d2 = d(this.a);
                    if (d2 != null) {
                        float f2 = d2.x;
                        if (f2 != 0.0f || d2.y != 0.0f) {
                            float f3 = d2.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = d2.x / sqrt;
                            d2.x = f4;
                            float f5 = d2.y / sqrt;
                            d2.y = f5;
                            this.k = d2;
                            this.o = (int) (f4 * 10000.0f);
                            this.p = (int) (f5 * 10000.0f);
                            int c = c(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                            LinearInterpolator linearInterpolator = this.i;
                            c1988kV.a = (int) (this.o * 1.2f);
                            c1988kV.b = (int) (this.p * 1.2f);
                            c1988kV.c = (int) (c * 1.2f);
                            c1988kV.e = linearInterpolator;
                            c1988kV.f = true;
                        }
                    }
                    c1988kV.d = this.a;
                    g();
                }
            }
            if (c1988kV.d >= 0) {
                z = true;
            }
            c1988kV.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.d0.a();
            }
        }
    }

    public void f(View view, C1988kV c1988kV) {
        int i;
        int i2;
        int i3;
        int i4;
        PointF pointF = this.k;
        int i5 = -1;
        int i6 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i4 > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        f fVar = this.c;
        if (fVar != null && fVar.d()) {
            C1189dV c1189dV = (C1189dV) view.getLayoutParams();
            i2 = a((view.getLeft() - ((C1189dV) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) c1189dV).leftMargin, view.getRight() + ((C1189dV) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) c1189dV).rightMargin, fVar.A(), fVar.n - fVar.B(), i);
        } else {
            i2 = 0;
        }
        PointF pointF2 = this.k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i3 > 0) {
                i5 = 1;
            }
        } else {
            i5 = 0;
        }
        f fVar2 = this.c;
        if (fVar2 != null && fVar2.e()) {
            C1189dV c1189dV2 = (C1189dV) view.getLayoutParams();
            i6 = a((view.getTop() - ((C1189dV) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) c1189dV2).topMargin, view.getBottom() + ((C1189dV) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) c1189dV2).bottomMargin, fVar2.C(), fVar2.o - fVar2.z(), i5);
        }
        int ceil = (int) Math.ceil(c((int) Math.sqrt((i6 * i6) + (i2 * i2))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.j;
            c1988kV.a = -i2;
            c1988kV.b = -i6;
            c1988kV.c = ceil;
            c1988kV.e = decelerateInterpolator;
            c1988kV.f = true;
        }
    }

    public final void g() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.g0.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        f fVar = this.c;
        if (fVar.e == this) {
            fVar.e = null;
        }
        this.c = null;
        this.b = null;
    }
}
