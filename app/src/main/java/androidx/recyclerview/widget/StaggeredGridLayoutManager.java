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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends f implements InterfaceC2074lV {
    public final k B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final U30 H;
    public final boolean I;
    public int[] J;
    public final DH K;
    public final int p;
    public final C3118xe[] q;
    public final AbstractC0695Vq r;
    public final AbstractC0695Vq s;
    public final int t;
    public int u;
    public final C1603iG v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int b;
        public int c;
        public int d;
        public int[] f;
        public int g;
        public int[] h;
        public ArrayList i;
        public boolean j;
        public boolean k;
        public boolean l;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            if (this.d > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.g);
            if (this.g > 0) {
                parcel.writeIntArray(this.h);
            }
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeList(this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xe] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.recyclerview.widget.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, iG] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        ?? obj = new Object();
        this.B = obj;
        this.C = 2;
        this.G = new Rect();
        this.H = new U30(this);
        this.I = true;
        this.K = new DH(this, 24);
        C1027cV E = f.E(context, attributeSet, i, i2);
        int i3 = E.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            AbstractC0695Vq abstractC0695Vq = this.r;
            this.r = this.s;
            this.s = abstractC0695Vq;
            g0();
        }
        int i4 = E.b;
        c(null);
        if (i4 != this.p) {
            int[] iArr = obj.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            obj.b = null;
            g0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new C3118xe[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                C3118xe[] c3118xeArr = this.q;
                ?? obj2 = new Object();
                obj2.h = this;
                obj2.g = new ArrayList();
                obj2.b = Integer.MIN_VALUE;
                obj2.c = Integer.MIN_VALUE;
                obj2.d = 0;
                obj2.f = i5;
                c3118xeArr[i5] = obj2;
            }
            g0();
        }
        boolean z = E.c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.j != z) {
            savedState.j = z;
        }
        this.w = z;
        g0();
        ?? obj3 = new Object();
        obj3.a = true;
        obj3.f = 0;
        obj3.g = 0;
        this.v = obj3;
        this.r = AbstractC0695Vq.a(this, this.t);
        this.s = AbstractC0695Vq.a(this, 1 - this.t);
    }

    public static int Y0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int A0(g gVar, C1603iG c1603iG, C2160mV c2160mV) {
        int i;
        int k;
        boolean z;
        int H0;
        int i2;
        C3118xe c3118xe;
        ?? r6;
        int i3;
        int k2;
        int c;
        int k3;
        int c2;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        this.y.set(0, this.p, true);
        C1603iG c1603iG2 = this.v;
        if (c1603iG2.i) {
            if (c1603iG.e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (c1603iG.e == 1) {
            i = c1603iG.g + c1603iG.b;
        } else {
            i = c1603iG.f - c1603iG.b;
        }
        int i8 = c1603iG.e;
        for (int i9 = 0; i9 < this.p; i9++) {
            if (!((ArrayList) this.q[i9].g).isEmpty()) {
                X0(this.q[i9], i8, i);
            }
        }
        if (this.x) {
            k = this.r.g();
        } else {
            k = this.r.k();
        }
        boolean z2 = false;
        while (true) {
            int i10 = c1603iG.c;
            if (i10 >= 0 && i10 < c2160mV.b()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!c1603iG2.i && this.y.isEmpty())) {
                break;
            }
            View view = gVar.i(c1603iG.c, Long.MAX_VALUE).itemView;
            c1603iG.c += c1603iG.d;
            V30 v30 = (V30) view.getLayoutParams();
            int layoutPosition = v30.a.getLayoutPosition();
            k kVar = this.B;
            int[] iArr = kVar.a;
            if (iArr != null && layoutPosition < iArr.length) {
                i2 = iArr[layoutPosition];
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                if (O0(c1603iG.e)) {
                    i5 = this.p - i7;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.p;
                    i5 = 0;
                    i6 = 1;
                }
                C3118xe c3118xe2 = null;
                if (c1603iG.e == i7) {
                    int k4 = this.r.k();
                    int i11 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C3118xe c3118xe3 = this.q[i5];
                        int i12 = c3118xe3.i(k4);
                        if (i12 < i11) {
                            i11 = i12;
                            c3118xe2 = c3118xe3;
                        }
                        i5 += i6;
                    }
                } else {
                    int g = this.r.g();
                    int i13 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C3118xe c3118xe4 = this.q[i5];
                        int k5 = c3118xe4.k(g);
                        if (k5 > i13) {
                            c3118xe2 = c3118xe4;
                            i13 = k5;
                        }
                        i5 += i6;
                    }
                }
                c3118xe = c3118xe2;
                kVar.a(layoutPosition);
                kVar.a[layoutPosition] = c3118xe.f;
            } else {
                c3118xe = this.q[i2];
            }
            v30.e = c3118xe;
            if (c1603iG.e == 1) {
                r6 = 0;
                b(-1, view, false);
            } else {
                r6 = 0;
                b(0, view, false);
            }
            if (this.t == 1) {
                i3 = 1;
                M0(view, f.w(r6, this.u, this.l, r6, ((ViewGroup.MarginLayoutParams) v30).width), f.w(true, this.o, this.m, z() + C(), ((ViewGroup.MarginLayoutParams) v30).height));
            } else {
                i3 = 1;
                M0(view, f.w(true, this.n, this.l, B() + A(), ((ViewGroup.MarginLayoutParams) v30).width), f.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) v30).height));
            }
            if (c1603iG.e == i3) {
                c = c3118xe.i(k);
                k2 = this.r.c(view) + c;
            } else {
                k2 = c3118xe.k(k);
                c = k2 - this.r.c(view);
            }
            if (c1603iG.e == 1) {
                C3118xe c3118xe5 = v30.e;
                c3118xe5.getClass();
                V30 v302 = (V30) view.getLayoutParams();
                v302.e = c3118xe5;
                ArrayList arrayList = (ArrayList) c3118xe5.g;
                arrayList.add(view);
                c3118xe5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c3118xe5.b = Integer.MIN_VALUE;
                }
                if (v302.a.isRemoved() || v302.a.isUpdated()) {
                    c3118xe5.d = ((StaggeredGridLayoutManager) c3118xe5.h).r.c(view) + c3118xe5.d;
                }
            } else {
                C3118xe c3118xe6 = v30.e;
                c3118xe6.getClass();
                V30 v303 = (V30) view.getLayoutParams();
                v303.e = c3118xe6;
                ArrayList arrayList2 = (ArrayList) c3118xe6.g;
                arrayList2.add(0, view);
                c3118xe6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c3118xe6.c = Integer.MIN_VALUE;
                }
                if (v303.a.isRemoved() || v303.a.isUpdated()) {
                    c3118xe6.d = ((StaggeredGridLayoutManager) c3118xe6.h).r.c(view) + c3118xe6.d;
                }
            }
            if (L0() && this.t == 1) {
                c2 = this.s.g() - (((this.p - 1) - c3118xe.f) * this.u);
                k3 = c2 - this.s.c(view);
            } else {
                k3 = this.s.k() + (c3118xe.f * this.u);
                c2 = this.s.c(view) + k3;
            }
            if (this.t == 1) {
                f.J(view, k3, c, c2, k2);
            } else {
                f.J(view, c, k3, k2, c2);
            }
            X0(c3118xe, c1603iG2.e, i);
            Q0(gVar, c1603iG2);
            if (c1603iG2.h && view.hasFocusable()) {
                this.y.set(c3118xe.f, false);
            }
            i7 = 1;
            z2 = true;
        }
        if (!z2) {
            Q0(gVar, c1603iG2);
        }
        if (c1603iG2.e == -1) {
            H0 = this.r.k() - I0(this.r.k());
        } else {
            H0 = H0(this.r.g()) - this.r.g();
        }
        if (H0 > 0) {
            return Math.min(c1603iG.b, H0);
        }
        return 0;
    }

    public final View B0(boolean z) {
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = this.r.e(u);
            int b = this.r.b(u);
            if (b > k && e < g) {
                if (b > g && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final View C0(boolean z) {
        int k = this.r.k();
        int g = this.r.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = this.r.e(u);
            if (this.r.b(u) > k && e < g) {
                if (e < k && z) {
                    if (view == null) {
                        view = u;
                    }
                } else {
                    return u;
                }
            }
        }
        return view;
    }

    public final void D0(g gVar, C2160mV c2160mV, boolean z) {
        int g;
        int H0 = H0(Integer.MIN_VALUE);
        if (H0 != Integer.MIN_VALUE && (g = this.r.g() - H0) > 0) {
            int i = g - (-U0(-g, c2160mV, gVar));
            if (z && i > 0) {
                this.r.p(i);
            }
        }
    }

    public final void E0(g gVar, C2160mV c2160mV, boolean z) {
        int k;
        int I0 = I0(Integer.MAX_VALUE);
        if (I0 != Integer.MAX_VALUE && (k = I0 - this.r.k()) > 0) {
            int U0 = k - U0(k, c2160mV, gVar);
            if (z && U0 > 0) {
                this.r.p(-U0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final int F(g gVar, C2160mV c2160mV) {
        if (this.t == 0) {
            return this.p;
        }
        return super.F(gVar, c2160mV);
    }

    public final int F0() {
        if (v() == 0) {
            return 0;
        }
        return f.D(u(0));
    }

    public final int G0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return f.D(u(v - 1));
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean H() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int H0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int I0(int i) {
        int k = this.q[0].k(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int k2 = this.q[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.x
            if (r0 == 0) goto L9
            int r0 = r10.G0()
            goto Ld
        L9:
            int r0 = r10.F0()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1b
            if (r11 >= r12) goto L17
            int r2 = r12 + 1
        L15:
            r3 = r11
            goto L1e
        L17:
            int r2 = r11 + 1
            r3 = r12
            goto L1e
        L1b:
            int r2 = r11 + r12
            goto L15
        L1e:
            androidx.recyclerview.widget.k r4 = r10.B
            int[] r5 = r4.a
            r6 = -1
            if (r5 != 0) goto L27
            goto L94
        L27:
            int r5 = r5.length
            if (r3 < r5) goto L2c
            goto L94
        L2c:
            java.util.ArrayList r5 = r4.b
            if (r5 != 0) goto L32
        L30:
            r5 = -1
            goto L81
        L32:
            r7 = 0
            if (r5 != 0) goto L36
            goto L4f
        L36:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3c:
            if (r5 < 0) goto L4f
            java.util.ArrayList r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r9 = r8.b
            if (r9 != r3) goto L4c
            r7 = r8
            goto L4f
        L4c:
            int r5 = r5 + (-1)
            goto L3c
        L4f:
            if (r7 == 0) goto L56
            java.util.ArrayList r5 = r4.b
            r5.remove(r7)
        L56:
            java.util.ArrayList r5 = r4.b
            int r5 = r5.size()
            r7 = 0
        L5d:
            if (r7 >= r5) goto L6f
            java.util.ArrayList r8 = r4.b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r8 = r8.b
            if (r8 < r3) goto L6c
            goto L70
        L6c:
            int r7 = r7 + 1
            goto L5d
        L6f:
            r7 = -1
        L70:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r5
            java.util.ArrayList r8 = r4.b
            r8.remove(r7)
            int r5 = r5.b
        L81:
            if (r5 != r6) goto L8d
            int[] r5 = r4.a
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.a
            int r5 = r5.length
            goto L94
        L8d:
            int[] r7 = r4.a
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        L94:
            r5 = 1
            if (r13 == r5) goto La8
            r6 = 2
            if (r13 == r6) goto La4
            if (r13 == r1) goto L9d
            goto Lab
        L9d:
            r4.c(r11, r5)
            r4.b(r12, r5)
            goto Lab
        La4:
            r4.c(r11, r12)
            goto Lab
        La8:
            r4.b(r11, r12)
        Lab:
            if (r2 > r0) goto Lae
            return
        Lae:
            boolean r11 = r10.x
            if (r11 == 0) goto Lb7
            int r11 = r10.F0()
            goto Lbb
        Lb7:
            int r11 = r10.G0()
        Lbb:
            if (r3 > r11) goto Lc0
            r10.g0()
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.f
    public final void K(int i) {
        super.K(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C3118xe c3118xe = this.q[i2];
            int i3 = c3118xe.b;
            if (i3 != Integer.MIN_VALUE) {
                c3118xe.b = i3 + i;
            }
            int i4 = c3118xe.c;
            if (i4 != Integer.MIN_VALUE) {
                c3118xe.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View K0() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.f
    public final void L(int i) {
        super.L(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C3118xe c3118xe = this.q[i2];
            int i3 = c3118xe.b;
            if (i3 != Integer.MIN_VALUE) {
                c3118xe.b = i3 + i;
            }
            int i4 = c3118xe.c;
            if (i4 != Integer.MIN_VALUE) {
                c3118xe.c = i4 + i;
            }
        }
    }

    public final boolean L0() {
        RecyclerView recyclerView = this.b;
        Field field = Sb0.a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final void M0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.I(view));
        }
        V30 v30 = (V30) view.getLayoutParams();
        int Y0 = Y0(i, ((ViewGroup.MarginLayoutParams) v30).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) v30).rightMargin + rect.right);
        int Y02 = Y0(i2, ((ViewGroup.MarginLayoutParams) v30).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) v30).bottomMargin + rect.bottom);
        if (p0(view, Y0, Y02, v30)) {
            view.measure(Y0, Y02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
        if (r8.t == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
        if (r8.t == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
        if (L0() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006f, code lost:
        if (L0() == false) goto L113;
     */
    @Override // androidx.recyclerview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N(android.view.View r9, int r10, androidx.recyclerview.widget.g r11, defpackage.C2160mV r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(android.view.View, int, androidx.recyclerview.widget.g, mV):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x040f, code lost:
        if (w0() != false) goto L258;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(androidx.recyclerview.widget.g r17, defpackage.C2160mV r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(androidx.recyclerview.widget.g, mV, boolean):void");
    }

    @Override // androidx.recyclerview.widget.f
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View C0 = C0(false);
            View B0 = B0(false);
            if (C0 != null && B0 != null) {
                int D = f.D(C0);
                int D2 = f.D(B0);
                if (D < D2) {
                    accessibilityEvent.setFromIndex(D);
                    accessibilityEvent.setToIndex(D2);
                    return;
                }
                accessibilityEvent.setFromIndex(D2);
                accessibilityEvent.setToIndex(D);
            }
        }
    }

    public final boolean O0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.t == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.x) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != L0()) {
            return false;
        }
        return true;
    }

    public final void P0(int i, C2160mV c2160mV) {
        int F0;
        int i2;
        if (i > 0) {
            F0 = G0();
            i2 = 1;
        } else {
            F0 = F0();
            i2 = -1;
        }
        C1603iG c1603iG = this.v;
        c1603iG.a = true;
        W0(F0, c2160mV);
        V0(i2);
        c1603iG.c = F0 + c1603iG.d;
        c1603iG.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.f
    public final void Q(g gVar, C2160mV c2160mV, View view, S0 s0) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof V30)) {
            P(view, s0);
            return;
        }
        V30 v30 = (V30) layoutParams;
        if (this.t == 0) {
            C3118xe c3118xe = v30.e;
            if (c3118xe == null) {
                i2 = -1;
            } else {
                i2 = c3118xe.f;
            }
            s0.i(R0.a(false, i2, 1, -1, -1));
            return;
        }
        C3118xe c3118xe2 = v30.e;
        if (c3118xe2 == null) {
            i = -1;
        } else {
            i = c3118xe2.f;
        }
        s0.i(R0.a(false, -1, -1, i, 1));
    }

    public final void Q0(g gVar, C1603iG c1603iG) {
        int min;
        int min2;
        if (c1603iG.a && !c1603iG.i) {
            if (c1603iG.b == 0) {
                if (c1603iG.e == -1) {
                    R0(gVar, c1603iG.g);
                    return;
                } else {
                    S0(gVar, c1603iG.f);
                    return;
                }
            }
            int i = 1;
            if (c1603iG.e == -1) {
                int i2 = c1603iG.f;
                int k = this.q[0].k(i2);
                while (i < this.p) {
                    int k2 = this.q[i].k(i2);
                    if (k2 > k) {
                        k = k2;
                    }
                    i++;
                }
                int i3 = i2 - k;
                if (i3 < 0) {
                    min2 = c1603iG.g;
                } else {
                    min2 = c1603iG.g - Math.min(i3, c1603iG.b);
                }
                R0(gVar, min2);
                return;
            }
            int i4 = c1603iG.g;
            int i5 = this.q[0].i(i4);
            while (i < this.p) {
                int i6 = this.q[i].i(i4);
                if (i6 < i5) {
                    i5 = i6;
                }
                i++;
            }
            int i7 = i5 - c1603iG.g;
            if (i7 < 0) {
                min = c1603iG.f;
            } else {
                min = Math.min(i7, c1603iG.b) + c1603iG.f;
            }
            S0(gVar, min);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void R(int i, int i2) {
        J0(i, i2, 1);
    }

    public final void R0(g gVar, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            if (this.r.e(u) >= i && this.r.o(u) >= i) {
                V30 v30 = (V30) u.getLayoutParams();
                v30.getClass();
                if (((ArrayList) v30.e.g).size() == 1) {
                    return;
                }
                C3118xe c3118xe = v30.e;
                ArrayList arrayList = (ArrayList) c3118xe.g;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                V30 v302 = (V30) view.getLayoutParams();
                v302.e = null;
                if (v302.a.isRemoved() || v302.a.isUpdated()) {
                    c3118xe.d -= ((StaggeredGridLayoutManager) c3118xe.h).r.c(view);
                }
                if (size == 1) {
                    c3118xe.b = Integer.MIN_VALUE;
                }
                c3118xe.c = Integer.MIN_VALUE;
                d0(u, gVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void S() {
        k kVar = this.B;
        int[] iArr = kVar.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        kVar.b = null;
        g0();
    }

    public final void S0(g gVar, int i) {
        while (v() > 0) {
            View u = u(0);
            if (this.r.b(u) <= i && this.r.n(u) <= i) {
                V30 v30 = (V30) u.getLayoutParams();
                v30.getClass();
                if (((ArrayList) v30.e.g).size() == 1) {
                    return;
                }
                C3118xe c3118xe = v30.e;
                ArrayList arrayList = (ArrayList) c3118xe.g;
                View view = (View) arrayList.remove(0);
                V30 v302 = (V30) view.getLayoutParams();
                v302.e = null;
                if (arrayList.size() == 0) {
                    c3118xe.c = Integer.MIN_VALUE;
                }
                if (v302.a.isRemoved() || v302.a.isUpdated()) {
                    c3118xe.d -= ((StaggeredGridLayoutManager) c3118xe.h).r.c(view);
                }
                c3118xe.b = Integer.MIN_VALUE;
                d0(u, gVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void T(int i, int i2) {
        J0(i, i2, 8);
    }

    public final void T0() {
        if (this.t != 1 && L0()) {
            this.x = !this.w;
        } else {
            this.x = this.w;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void U(int i, int i2) {
        J0(i, i2, 2);
    }

    public final int U0(int i, C2160mV c2160mV, g gVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        P0(i, c2160mV);
        C1603iG c1603iG = this.v;
        int A0 = A0(gVar, c1603iG, c2160mV);
        if (c1603iG.b >= A0) {
            if (i < 0) {
                i = -A0;
            } else {
                i = A0;
            }
        }
        this.r.p(-i);
        this.D = this.x;
        c1603iG.b = 0;
        Q0(gVar, c1603iG);
        return i;
    }

    @Override // androidx.recyclerview.widget.f
    public final void V(int i, int i2) {
        J0(i, i2, 4);
    }

    public final void V0(int i) {
        boolean z;
        C1603iG c1603iG = this.v;
        c1603iG.e = i;
        boolean z2 = this.x;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c1603iG.d = i2;
    }

    @Override // androidx.recyclerview.widget.f
    public final void W(g gVar, C2160mV c2160mV) {
        N0(gVar, c2160mV, true);
    }

    public final void W0(int i, C2160mV c2160mV) {
        boolean z;
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        boolean z2;
        C1603iG c1603iG = this.v;
        boolean z3 = false;
        c1603iG.b = 0;
        c1603iG.c = i;
        TG tg = this.e;
        if (tg != null && tg.e) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = c2160mV.a) != -1) {
            boolean z4 = this.x;
            if (i4 < i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                i2 = this.r.l();
            } else {
                i3 = this.r.l();
                i2 = 0;
                recyclerView = this.b;
                if (recyclerView == null && recyclerView.i) {
                    c1603iG.f = this.r.k() - i3;
                    c1603iG.g = this.r.g() + i2;
                } else {
                    c1603iG.g = this.r.f() + i2;
                    c1603iG.f = -i3;
                }
                c1603iG.h = false;
                c1603iG.a = true;
                if (this.r.i() == 0 && this.r.f() == 0) {
                    z3 = true;
                }
                c1603iG.i = z3;
            }
        } else {
            i2 = 0;
        }
        i3 = 0;
        recyclerView = this.b;
        if (recyclerView == null) {
        }
        c1603iG.g = this.r.f() + i2;
        c1603iG.f = -i3;
        c1603iG.h = false;
        c1603iG.a = true;
        if (this.r.i() == 0) {
            z3 = true;
        }
        c1603iG.i = z3;
    }

    @Override // androidx.recyclerview.widget.f
    public final void X(C2160mV c2160mV) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void X0(C3118xe c3118xe, int i, int i2) {
        int i3 = c3118xe.d;
        int i4 = c3118xe.f;
        if (i == -1) {
            int i5 = c3118xe.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) c3118xe.g).get(0);
                c3118xe.b = ((StaggeredGridLayoutManager) c3118xe.h).r.e(view);
                ((V30) view.getLayoutParams()).getClass();
                i5 = c3118xe.b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c3118xe.c;
        if (i6 == Integer.MIN_VALUE) {
            c3118xe.c();
            i6 = c3118xe.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.F = (SavedState) parcelable;
            g0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.f
    public final Parcelable Z() {
        int F0;
        View C0;
        int k;
        int k2;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            ?? obj = new Object();
            obj.d = savedState.d;
            obj.b = savedState.b;
            obj.c = savedState.c;
            obj.f = savedState.f;
            obj.g = savedState.g;
            obj.h = savedState.h;
            obj.j = savedState.j;
            obj.k = savedState.k;
            obj.l = savedState.l;
            obj.i = savedState.i;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.j = this.w;
        obj2.k = this.D;
        obj2.l = this.E;
        k kVar = this.B;
        if (kVar != null && (iArr = kVar.a) != null) {
            obj2.h = iArr;
            obj2.g = iArr.length;
            obj2.i = kVar.b;
        } else {
            obj2.g = 0;
        }
        int i = -1;
        if (v() > 0) {
            if (this.D) {
                F0 = G0();
            } else {
                F0 = F0();
            }
            obj2.b = F0;
            if (this.x) {
                C0 = B0(true);
            } else {
                C0 = C0(true);
            }
            if (C0 != null) {
                i = f.D(C0);
            }
            obj2.c = i;
            int i2 = this.p;
            obj2.d = i2;
            obj2.f = new int[i2];
            for (int i3 = 0; i3 < this.p; i3++) {
                if (this.D) {
                    k = this.q[i3].i(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.r.g();
                        k -= k2;
                        obj2.f[i3] = k;
                    } else {
                        obj2.f[i3] = k;
                    }
                } else {
                    k = this.q[i3].k(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.r.k();
                        k -= k2;
                        obj2.f[i3] = k;
                    } else {
                        obj2.f[i3] = k;
                    }
                }
            }
        } else {
            obj2.b = -1;
            obj2.c = -1;
            obj2.d = 0;
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC2074lV
    public final PointF a(int i) {
        int v0 = v0(i);
        PointF pointF = new PointF();
        if (v0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = v0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = v0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.f
    public final void a0(int i) {
        if (i == 0) {
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.F == null && (recyclerView = this.b) != null) {
            recyclerView.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean d() {
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean e() {
        if (this.t == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean f(C1189dV c1189dV) {
        return c1189dV instanceof V30;
    }

    @Override // androidx.recyclerview.widget.f
    public final void h(int i, int i2, C2160mV c2160mV, C0164Be c0164Be) {
        C1603iG c1603iG;
        int i3;
        int i4;
        if (this.t != 0) {
            i = i2;
        }
        if (v() != 0 && i != 0) {
            P0(i, c2160mV);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.p) {
                this.J = new int[this.p];
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.p;
                c1603iG = this.v;
                if (i5 >= i7) {
                    break;
                }
                if (c1603iG.d == -1) {
                    i3 = c1603iG.f;
                    i4 = this.q[i5].k(i3);
                } else {
                    i3 = this.q[i5].i(c1603iG.g);
                    i4 = c1603iG.g;
                }
                int i8 = i3 - i4;
                if (i8 >= 0) {
                    this.J[i6] = i8;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.J, 0, i6);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = c1603iG.c;
                if (i10 >= 0 && i10 < c2160mV.b()) {
                    c0164Be.a(c1603iG.c, this.J[i9]);
                    c1603iG.c += c1603iG.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final int h0(int i, C2160mV c2160mV, g gVar) {
        return U0(i, c2160mV, gVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final void i0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.b != i) {
            savedState.f = null;
            savedState.d = 0;
            savedState.b = -1;
            savedState.c = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        g0();
    }

    @Override // androidx.recyclerview.widget.f
    public final int j(C2160mV c2160mV) {
        return x0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final int j0(int i, C2160mV c2160mV, g gVar) {
        return U0(i, c2160mV, gVar);
    }

    @Override // androidx.recyclerview.widget.f
    public final int k(C2160mV c2160mV) {
        return y0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final int l(C2160mV c2160mV) {
        return z0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final int m(C2160mV c2160mV) {
        return x0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final void m0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int i3 = this.p;
        int B = B() + A();
        int z = z() + C();
        if (this.t == 1) {
            int height = rect.height() + z;
            RecyclerView recyclerView = this.b;
            Field field = Sb0.a;
            g2 = f.g(i2, height, recyclerView.getMinimumHeight());
            g = f.g(i, (this.u * i3) + B, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + B;
            RecyclerView recyclerView2 = this.b;
            Field field2 = Sb0.a;
            g = f.g(i, width, recyclerView2.getMinimumWidth());
            g2 = f.g(i2, (this.u * i3) + z, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // androidx.recyclerview.widget.f
    public final int n(C2160mV c2160mV) {
        return y0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final int o(C2160mV c2160mV) {
        return z0(c2160mV);
    }

    @Override // androidx.recyclerview.widget.f
    public final C1189dV r() {
        if (this.t == 0) {
            return new C1189dV(-2, -1);
        }
        return new C1189dV(-1, -2);
    }

    @Override // androidx.recyclerview.widget.f
    public final C1189dV s(Context context, AttributeSet attributeSet) {
        return new C1189dV(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.f
    public final void s0(RecyclerView recyclerView, int i) {
        TG tg = new TG(recyclerView.getContext());
        tg.a = i;
        t0(tg);
    }

    @Override // androidx.recyclerview.widget.f
    public final C1189dV t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1189dV((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1189dV(layoutParams);
    }

    @Override // androidx.recyclerview.widget.f
    public final boolean u0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final int v0(int i) {
        boolean z;
        if (v() == 0) {
            if (!this.x) {
                return -1;
            }
            return 1;
        }
        if (i < F0()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.x) {
            return -1;
        }
        return 1;
    }

    public final boolean w0() {
        int F0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                F0 = G0();
                F0();
            } else {
                F0 = F0();
                G0();
            }
            k kVar = this.B;
            if (F0 == 0 && K0() != null) {
                int[] iArr = kVar.a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                kVar.b = null;
                this.f = true;
                g0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.f
    public final int x(g gVar, C2160mV c2160mV) {
        if (this.t == 1) {
            return this.p;
        }
        return super.x(gVar, c2160mV);
    }

    public final int x0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.I;
        return Wh0.r(c2160mV, abstractC0695Vq, C0(z), B0(z), this, this.I);
    }

    public final int y0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.I;
        return Wh0.s(c2160mV, abstractC0695Vq, C0(z), B0(z), this, this.I, this.x);
    }

    public final int z0(C2160mV c2160mV) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0695Vq abstractC0695Vq = this.r;
        boolean z = !this.I;
        return Wh0.t(c2160mV, abstractC0695Vq, C0(z), B0(z), this, this.I);
    }
}
