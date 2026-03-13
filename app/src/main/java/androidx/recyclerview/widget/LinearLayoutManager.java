package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.fyber.fairbid.internal.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends f implements InterfaceC2074lV {
    public final C0775Ys A;
    public final RG B;
    public final int C;
    public final int[] D;
    public int p;
    public SG q;
    public AbstractC0695Vq r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public SavedState z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int b;
        public int c;
        public boolean d;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [RG, java.lang.Object] */
    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C0775Ys();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        U0(i);
        c(null);
        if (this.t) {
            this.t = false;
            g0();
        }
    }

    public final int A0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.p == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.p == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.p == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.p != 1 && N0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.p == 1 || !N0()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [SG, java.lang.Object] */
    public final void B0() {
        if (this.q == null) {
            ?? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.q = obj;
        }
    }

    public final int C0(g gVar, SG sg, C2160mV c2160mV, boolean z) {
        int i;
        int i2 = sg.c;
        int i3 = sg.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                sg.g = i3 + i2;
            }
            Q0(gVar, sg);
        }
        int i4 = sg.c + sg.h;
        while (true) {
            if ((!sg.l && i4 <= 0) || (i = sg.d) < 0 || i >= c2160mV.b()) {
                break;
            }
            RG rg = this.B;
            rg.a = 0;
            rg.b = false;
            rg.c = false;
            rg.d = false;
            O0(gVar, c2160mV, sg, rg);
            if (!rg.b) {
                int i5 = sg.b;
                int i6 = rg.a;
                sg.b = (sg.f * i6) + i5;
                if (!rg.c || sg.k != null || !c2160mV.g) {
                    sg.c -= i6;
                    i4 -= i6;
                }
                int i7 = sg.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    sg.g = i8;
                    int i9 = sg.c;
                    if (i9 < 0) {
                        sg.g = i8 + i9;
                    }
                    Q0(gVar, sg);
                }
                if (z && rg.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - sg.c;
    }

    public final View D0(boolean z) {
        if (this.u) {
            return H0(0, v(), z);
        }
        return H0(v() - 1, -1, z);
    }

    public final View E0(boolean z) {
        if (this.u) {
            return H0(v() - 1, -1, z);
        }
        return H0(0, v(), z);
    }

    public final int F0() {
        View H0 = H0(v() - 1, -1, false);
        if (H0 == null) {
            return -1;
        }
        return f.D(H0);
    }

    public final View G0(int i, int i2) {
        int i3;
        int i4;
        B0();
        if (i2 > i || i2 < i) {
            if (this.r.e(u(i)) < this.r.k()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.p == 0) {
                return this.c.n(i, i2, i3, i4);
            }
            return this.d.n(i, i2, i3, i4);
        }
        return u(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean H() {
        return true;
    }

    public final View H0(int i, int i2, boolean z) {
        int i3;
        B0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = Constants.BANNER_FALLBACK_AD_WIDTH;
        }
        if (this.p == 0) {
            return this.c.n(i, i2, i3, Constants.BANNER_FALLBACK_AD_WIDTH);
        }
        return this.d.n(i, i2, i3, Constants.BANNER_FALLBACK_AD_WIDTH);
    }

    public View I0(g gVar, C2160mV c2160mV, int i, int i2, int i3) {
        int i4;
        B0();
        int k = this.r.k();
        int g = this.r.g();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u = u(i);
            int D = f.D(u);
            if (D >= 0 && D < i3) {
                if (((C1189dV) u.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else if (this.r.e(u) < g && this.r.b(u) >= k) {
                    return u;
                } else {
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final int J0(int i, g gVar, C2160mV c2160mV, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 > 0) {
            int i2 = -T0(-g2, c2160mV, gVar);
            int i3 = i + i2;
            if (z && (g = this.r.g() - i3) > 0) {
                this.r.p(g);
                return g + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int K0(int i, g gVar, C2160mV c2160mV, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 > 0) {
            int i2 = -T0(k2, c2160mV, gVar);
            int i3 = i + i2;
            if (z && (k = i3 - this.r.k()) > 0) {
                this.r.p(-k);
                return i2 - k;
            }
            return i2;
        }
        return 0;
    }

    public final View L0() {
        int v;
        if (this.u) {
            v = 0;
        } else {
            v = v() - 1;
        }
        return u(v);
    }

    public final View M0() {
        int i;
        if (this.u) {
            i = v() - 1;
        } else {
            i = 0;
        }
        return u(i);
    }

    @Override // androidx.recyclerview.widget.f
    public View N(View view, int i, g gVar, C2160mV c2160mV) {
        int A0;
        View G0;
        View L0;
        S0();
        if (v() == 0 || (A0 = A0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        B0();
        W0(A0, (int) (this.r.l() * 0.33333334f), false, c2160mV);
        SG sg = this.q;
        sg.g = Integer.MIN_VALUE;
        sg.a = false;
        C0(gVar, sg, c2160mV, true);
        if (A0 == -1) {
            if (this.u) {
                G0 = G0(v() - 1, -1);
            } else {
                G0 = G0(0, v());
            }
        } else if (this.u) {
            G0 = G0(0, v());
        } else {
            G0 = G0(v() - 1, -1);
        }
        if (A0 == -1) {
            L0 = M0();
        } else {
            L0 = L0();
        }
        if (L0.hasFocusable()) {
            if (G0 == null) {
                return null;
            }
            return L0;
        }
        return G0;
    }

    public final boolean N0() {
        RecyclerView recyclerView = this.b;
        Field field = Sb0.a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final void O(AccessibilityEvent accessibilityEvent) {
        int D;
        super.O(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(0, v(), false);
            if (H0 == null) {
                D = -1;
            } else {
                D = f.D(H0);
            }
            accessibilityEvent.setFromIndex(D);
            accessibilityEvent.setToIndex(F0());
        }
    }

    public void O0(g gVar, C2160mV c2160mV, SG sg, RG rg) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b = sg.b(gVar);
        if (b == null) {
            rg.b = true;
            return;
        }
        C1189dV c1189dV = (C1189dV) b.getLayoutParams();
        if (sg.k == null) {
            boolean z3 = this.u;
            if (sg.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                b(-1, b, false);
            } else {
                b(0, b, false);
            }
        } else {
            boolean z4 = this.u;
            if (sg.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                b(-1, b, true);
            } else {
                b(0, b, true);
            }
        }
        C1189dV c1189dV2 = (C1189dV) b.getLayoutParams();
        Rect I = this.b.I(b);
        int i5 = I.left + I.right;
        int i6 = I.top + I.bottom;
        int w = f.w(d(), this.n, this.l, B() + A() + ((ViewGroup.MarginLayoutParams) c1189dV2).leftMargin + ((ViewGroup.MarginLayoutParams) c1189dV2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c1189dV2).width);
        int w2 = f.w(e(), this.o, this.m, z() + C() + ((ViewGroup.MarginLayoutParams) c1189dV2).topMargin + ((ViewGroup.MarginLayoutParams) c1189dV2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c1189dV2).height);
        if (p0(b, w, w2, c1189dV2)) {
            b.measure(w, w2);
        }
        rg.a = this.r.c(b);
        if (this.p == 1) {
            if (N0()) {
                i4 = this.n - B();
                i = i4 - this.r.d(b);
            } else {
                i = A();
                i4 = this.r.d(b) + i;
            }
            if (sg.f == -1) {
                i2 = sg.b;
                i3 = i2 - rg.a;
            } else {
                i3 = sg.b;
                i2 = rg.a + i3;
            }
        } else {
            int C = C();
            int d = this.r.d(b) + C;
            if (sg.f == -1) {
                int i7 = sg.b;
                int i8 = i7 - rg.a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = C;
            } else {
                int i9 = sg.b;
                int i10 = rg.a + i9;
                i = i9;
                i2 = d;
                i3 = C;
                i4 = i10;
            }
        }
        f.J(b, i, i3, i4, i2);
        if (c1189dV.a.isRemoved() || c1189dV.a.isUpdated()) {
            rg.c = true;
        }
        rg.d = b.hasFocusable();
    }

    public final void Q0(g gVar, SG sg) {
        if (sg.a && !sg.l) {
            int i = sg.g;
            int i2 = sg.i;
            if (sg.f == -1) {
                int v = v();
                if (i >= 0) {
                    int f = (this.r.f() - i) + i2;
                    if (this.u) {
                        for (int i3 = 0; i3 < v; i3++) {
                            View u = u(i3);
                            if (this.r.e(u) < f || this.r.o(u) < f) {
                                R0(gVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = v - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View u2 = u(i5);
                        if (this.r.e(u2) < f || this.r.o(u2) < f) {
                            R0(gVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int v2 = v();
                if (this.u) {
                    int i7 = v2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View u3 = u(i8);
                        if (this.r.b(u3) > i6 || this.r.n(u3) > i6) {
                            R0(gVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < v2; i9++) {
                    View u4 = u(i9);
                    if (this.r.b(u4) > i6 || this.r.n(u4) > i6) {
                        R0(gVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void R0(g gVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                View u = u(i3);
                e0(i3);
                gVar.f(u);
            }
            return;
        }
        while (i > i2) {
            View u2 = u(i);
            e0(i);
            gVar.f(u2);
            i--;
        }
    }

    public final void S0() {
        if (this.p != 1 && N0()) {
            this.u = !this.t;
        } else {
            this.u = this.t;
        }
    }

    public final int T0(int i, C2160mV c2160mV, g gVar) {
        int i2;
        if (v() == 0 || i == 0) {
            return 0;
        }
        B0();
        this.q.a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        W0(i2, abs, true, c2160mV);
        SG sg = this.q;
        int C0 = C0(gVar, sg, c2160mV, false) + sg.g;
        if (C0 < 0) {
            return 0;
        }
        if (abs > C0) {
            i = i2 * C0;
        }
        this.r.p(-i);
        this.q.j = i;
        return i;
    }

    public final void U0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0324Hi.e(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            AbstractC0695Vq a = AbstractC0695Vq.a(this, i);
            this.r = a;
            this.A.f = a;
            this.p = i;
            g0();
        }
    }

    public void V0(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        g0();
    }

    @Override // androidx.recyclerview.widget.f
    public void W(g gVar, C2160mV c2160mV) {
        View focusedChild;
        int i;
        View focusedChild2;
        View I0;
        int k;
        int i2;
        boolean z;
        boolean z2;
        int e;
        int i3;
        boolean z3;
        int i4;
        int i5;
        List list;
        boolean z4;
        int i6;
        int i7;
        int J0;
        int i8;
        View q;
        int e2;
        int i9;
        int i10;
        int i11 = -1;
        if ((this.z != null || this.x != -1) && c2160mV.b() == 0) {
            b0(gVar);
            return;
        }
        SavedState savedState = this.z;
        if (savedState != null && (i10 = savedState.b) >= 0) {
            this.x = i10;
        }
        B0();
        this.q.a = false;
        S0();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.f).contains(focusedChild)) {
            focusedChild = null;
        }
        C0775Ys c0775Ys = this.A;
        if (c0775Ys.e && this.x == -1 && this.z == null) {
            if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
                c0775Ys.d(f.D(focusedChild), focusedChild);
            }
        } else {
            c0775Ys.g();
            c0775Ys.d = this.u ^ this.v;
            if (!c2160mV.g && (i2 = this.x) != -1) {
                if (i2 >= 0 && i2 < c2160mV.b()) {
                    int i12 = this.x;
                    c0775Ys.b = i12;
                    SavedState savedState2 = this.z;
                    if (savedState2 != null && savedState2.b >= 0) {
                        boolean z5 = savedState2.d;
                        c0775Ys.d = z5;
                        if (z5) {
                            c0775Ys.c = this.r.g() - this.z.c;
                        } else {
                            c0775Ys.c = this.r.k() + this.z.c;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i12);
                        if (q2 != null) {
                            if (this.r.c(q2) > this.r.l()) {
                                c0775Ys.b();
                            } else if (this.r.e(q2) - this.r.k() < 0) {
                                c0775Ys.c = this.r.k();
                                c0775Ys.d = false;
                            } else if (this.r.g() - this.r.b(q2) < 0) {
                                c0775Ys.c = this.r.g();
                                c0775Ys.d = true;
                            } else {
                                if (c0775Ys.d) {
                                    e = this.r.m() + this.r.b(q2);
                                } else {
                                    e = this.r.e(q2);
                                }
                                c0775Ys.c = e;
                            }
                        } else {
                            if (v() > 0) {
                                if (this.x < f.D(u(0))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z == this.u) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c0775Ys.d = z2;
                            }
                            c0775Ys.b();
                        }
                    } else {
                        boolean z6 = this.u;
                        c0775Ys.d = z6;
                        if (z6) {
                            c0775Ys.c = this.r.g() - this.y;
                        } else {
                            c0775Ys.c = this.r.k() + this.y;
                        }
                    }
                    c0775Ys.e = true;
                } else {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.f).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C1189dV c1189dV = (C1189dV) focusedChild2.getLayoutParams();
                    if (!c1189dV.a.isRemoved() && c1189dV.a.getLayoutPosition() >= 0 && c1189dV.a.getLayoutPosition() < c2160mV.b()) {
                        c0775Ys.d(f.D(focusedChild2), focusedChild2);
                        c0775Ys.e = true;
                    }
                }
                if (this.s == this.v) {
                    if (c0775Ys.d) {
                        if (this.u) {
                            I0 = I0(gVar, c2160mV, 0, v(), c2160mV.b());
                        } else {
                            I0 = I0(gVar, c2160mV, v() - 1, -1, c2160mV.b());
                        }
                    } else if (this.u) {
                        I0 = I0(gVar, c2160mV, v() - 1, -1, c2160mV.b());
                    } else {
                        I0 = I0(gVar, c2160mV, 0, v(), c2160mV.b());
                    }
                    if (I0 != null) {
                        c0775Ys.c(f.D(I0), I0);
                        if (!c2160mV.g && u0() && (this.r.e(I0) >= this.r.g() || this.r.b(I0) < this.r.k())) {
                            if (c0775Ys.d) {
                                k = this.r.g();
                            } else {
                                k = this.r.k();
                            }
                            c0775Ys.c = k;
                        }
                        c0775Ys.e = true;
                    }
                }
            }
            c0775Ys.b();
            if (this.v) {
                i = c2160mV.b() - 1;
            } else {
                i = 0;
            }
            c0775Ys.b = i;
            c0775Ys.e = true;
        }
        SG sg = this.q;
        if (sg.j >= 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        sg.f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        v0(c2160mV, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (c2160mV.g && (i8 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i8)) != null) {
            if (this.u) {
                i9 = this.r.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = this.r.e(q) - this.r.k();
                i9 = this.y;
            }
            int i13 = i9 - e2;
            if (i13 > 0) {
                k2 += i13;
            } else {
                h -= i13;
            }
        }
        if (!c0775Ys.d ? !this.u : this.u) {
            i11 = 1;
        }
        P0(gVar, c2160mV, c0775Ys, i11);
        p(gVar);
        SG sg2 = this.q;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sg2.l = z3;
        this.q.getClass();
        this.q.i = 0;
        if (c0775Ys.d) {
            Y0(c0775Ys.b, c0775Ys.c);
            SG sg3 = this.q;
            sg3.h = k2;
            C0(gVar, sg3, c2160mV, false);
            SG sg4 = this.q;
            i5 = sg4.b;
            int i14 = sg4.d;
            int i15 = sg4.c;
            if (i15 > 0) {
                h += i15;
            }
            X0(c0775Ys.b, c0775Ys.c);
            SG sg5 = this.q;
            sg5.h = h;
            sg5.d += sg5.e;
            C0(gVar, sg5, c2160mV, false);
            SG sg6 = this.q;
            i4 = sg6.b;
            int i16 = sg6.c;
            if (i16 > 0) {
                Y0(i14, i5);
                SG sg7 = this.q;
                sg7.h = i16;
                C0(gVar, sg7, c2160mV, false);
                i5 = this.q.b;
            }
        } else {
            X0(c0775Ys.b, c0775Ys.c);
            SG sg8 = this.q;
            sg8.h = h;
            C0(gVar, sg8, c2160mV, false);
            SG sg9 = this.q;
            i4 = sg9.b;
            int i17 = sg9.d;
            int i18 = sg9.c;
            if (i18 > 0) {
                k2 += i18;
            }
            Y0(c0775Ys.b, c0775Ys.c);
            SG sg10 = this.q;
            sg10.h = k2;
            sg10.d += sg10.e;
            C0(gVar, sg10, c2160mV, false);
            SG sg11 = this.q;
            i5 = sg11.b;
            int i19 = sg11.c;
            if (i19 > 0) {
                X0(i17, i4);
                SG sg12 = this.q;
                sg12.h = i19;
                C0(gVar, sg12, c2160mV, false);
                i4 = this.q.b;
            }
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int J02 = J0(i4, gVar, c2160mV, true);
                i6 = i5 + J02;
                i7 = i4 + J02;
                J0 = K0(i6, gVar, c2160mV, false);
            } else {
                int K0 = K0(i5, gVar, c2160mV, true);
                i6 = i5 + K0;
                i7 = i4 + K0;
                J0 = J0(i7, gVar, c2160mV, false);
            }
            i5 = i6 + J0;
            i4 = i7 + J0;
        }
        if (c2160mV.k && v() != 0 && !c2160mV.g && u0()) {
            List list2 = gVar.d;
            int size = list2.size();
            int D = f.D(u(0));
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < size; i22++) {
                i iVar = (i) list2.get(i22);
                if (!iVar.isRemoved()) {
                    if (iVar.getLayoutPosition() < D) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 != this.u) {
                        i20 += this.r.c(iVar.itemView);
                    } else {
                        i21 += this.r.c(iVar.itemView);
                    }
                }
            }
            this.q.k = list2;
            if (i20 > 0) {
                Y0(f.D(M0()), i5);
                SG sg13 = this.q;
                sg13.h = i20;
                sg13.c = 0;
                sg13.a(null);
                C0(gVar, this.q, c2160mV, false);
            }
            if (i21 > 0) {
                X0(f.D(L0()), i4);
                SG sg14 = this.q;
                sg14.h = i21;
                sg14.c = 0;
                list = null;
                sg14.a(null);
                C0(gVar, this.q, c2160mV, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (!c2160mV.g) {
            AbstractC0695Vq abstractC0695Vq = this.r;
            abstractC0695Vq.a = abstractC0695Vq.l();
        } else {
            c0775Ys.g();
        }
        this.s = this.v;
    }

    public final void W0(int i, int i2, boolean z, C2160mV c2160mV) {
        boolean z2;
        int i3;
        int k;
        SG sg = this.q;
        boolean z3 = false;
        int i4 = 1;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sg.l = z2;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        v0(c2160mV, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        SG sg2 = this.q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        sg2.h = i3;
        if (!z3) {
            max = max2;
        }
        sg2.i = max;
        if (z3) {
            sg2.h = this.r.h() + i3;
            View L0 = L0();
            SG sg3 = this.q;
            if (this.u) {
                i4 = -1;
            }
            sg3.e = i4;
            int D = f.D(L0);
            SG sg4 = this.q;
            sg3.d = D + sg4.e;
            sg4.b = this.r.b(L0);
            k = this.r.b(L0) - this.r.g();
        } else {
            View M0 = M0();
            SG sg5 = this.q;
            sg5.h = this.r.k() + sg5.h;
            SG sg6 = this.q;
            if (!this.u) {
                i4 = -1;
            }
            sg6.e = i4;
            int D2 = f.D(M0);
            SG sg7 = this.q;
            sg6.d = D2 + sg7.e;
            sg7.b = this.r.e(M0);
            k = (-this.r.e(M0)) + this.r.k();
        }
        SG sg8 = this.q;
        sg8.c = i2;
        if (z) {
            sg8.c = i2 - k;
        }
        sg8.g = k;
    }

    @Override // androidx.recyclerview.widget.f
    public void X(C2160mV c2160mV) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.g();
    }

    public final void X0(int i, int i2) {
        int i3;
        this.q.c = this.r.g() - i2;
        SG sg = this.q;
        if (this.u) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        sg.e = i3;
        sg.d = i;
        sg.f = 1;
        sg.b = i2;
        sg.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.f
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.z = (SavedState) parcelable;
            g0();
        }
    }

    public final void Y0(int i, int i2) {
        int i3;
        this.q.c = i2 - this.r.k();
        SG sg = this.q;
        sg.d = i;
        if (this.u) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        sg.e = i3;
        sg.f = -1;
        sg.b = i2;
        sg.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    @Override // androidx.recyclerview.widget.f
    public final Parcelable Z() {
        SavedState savedState = this.z;
        if (savedState != null) {
            ?? obj = new Object();
            obj.b = savedState.b;
            obj.c = savedState.c;
            obj.d = savedState.d;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            B0();
            boolean z = this.s ^ this.u;
            obj2.d = z;
            if (z) {
                View L0 = L0();
                obj2.c = this.r.g() - this.r.b(L0);
                obj2.b = f.D(L0);
            } else {
                View M0 = M0();
                obj2.b = f.D(M0);
                obj2.c = this.r.e(M0) - this.r.k();
            }
        } else {
            obj2.b = -1;
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC2074lV
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < f.D(u(0))) {
            z = true;
        }
        if (z != this.u) {
            i2 = -1;
        }
        if (this.p == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.f
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.z == null && (recyclerView = this.b) != null) {
            recyclerView.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean d() {
        if (this.p == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean e() {
        if (this.p == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final void h(int i, int i2, C2160mV c2160mV, C0164Be c0164Be) {
        int i3;
        if (this.p != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            B0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            W0(i3, Math.abs(i), true, c2160mV);
            w0(c2160mV, this.q, c0164Be);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public int h0(int i, C2160mV c2160mV, g gVar) {
        if (this.p == 1) {
            return 0;
        }
        return T0(i, c2160mV, gVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void i(int i, C0164Be c0164Be) {
        boolean z;
        int i2;
        SavedState savedState = this.z;
        int i3 = -1;
        if (savedState != null && (i2 = savedState.b) >= 0) {
            z = savedState.d;
        } else {
            S0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            c0164Be.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void i0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.b = -1;
        }
        g0();
    }

    @Override // androidx.recyclerview.widget.f
    public final int j(C2160mV c2160mV) {
        return x0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public int j0(int i, C2160mV c2160mV, g gVar) {
        if (this.p == 0) {
            return 0;
        }
        return T0(i, c2160mV, gVar);
    }

    @Override // androidx.recyclerview.widget.f
    public int k(C2160mV c2160mV) {
        return y0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public int l(C2160mV c2160mV) {
        return z0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final int m(C2160mV c2160mV) {
        return x0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public int n(C2160mV c2160mV) {
        return y0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public int o(C2160mV c2160mV) {
        return z0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int D = i - f.D(u(0));
        if (D >= 0 && D < v) {
            View u = u(D);
            if (f.D(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean q0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int v = v();
        for (int i = 0; i < v; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public C1189dV r() {
        return new C1189dV(-2, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public void s0(RecyclerView recyclerView, int i) {
        TG tg = new TG(recyclerView.getContext());
        tg.a = i;
        t0(tg);
    }

    @Override // androidx.recyclerview.widget.f
    public boolean u0() {
        if (this.z == null && this.s == this.v) {
            return true;
        }
        return false;
    }

    public void v0(C2160mV c2160mV, int[] iArr) {
        int i;
        int i2;
        if (c2160mV.a != -1) {
            i = this.r.l();
        } else {
            i = 0;
        }
        if (this.q.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void w0(C2160mV c2160mV, SG sg, C0164Be c0164Be) {
        int i = sg.d;
        if (i >= 0 && i < c2160mV.b()) {
            c0164Be.a(i, Math.max(0, sg.g));
        }
    }

    public final int x0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        B0();
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.w;
        return Wh0.r(c2160mV, abstractC0695Vq, E0(z), D0(z), this, this.w);
    }

    public final int y0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        B0();
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.w;
        return Wh0.s(c2160mV, abstractC0695Vq, E0(z), D0(z), this, this.w, this.u);
    }

    public final int z0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        B0();
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.w;
        return Wh0.t(c2160mV, abstractC0695Vq, E0(z), D0(z), this, this.w);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [RG, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new C0775Ys();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        C1027cV E = f.E(context, attributeSet, i, i2);
        U0(E.a);
        boolean z = E.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            g0();
        }
        V0(E.d);
    }

    @Override // androidx.recyclerview.widget.f
    public final void M(RecyclerView recyclerView) {
    }

    public void P0(g gVar, C2160mV c2160mV, C0775Ys c0775Ys, int i) {
    }
}
