package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class f {
    public C3244z4 a;
    public RecyclerView b;
    public final C2935vX c;
    public final C2935vX d;
    public TG e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public f() {
        C0942bV c0942bV = new C0942bV(this, 0);
        Oc0 oc0 = new Oc0(this, 28);
        this.c = new C2935vX(c0942bV);
        this.d = new C2935vX(oc0);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int D(View view) {
        return ((C1189dV) view.getLayoutParams()).a.getLayoutPosition();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cV, java.lang.Object] */
    public static C1027cV E(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2932vU.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean I(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    public static void J(View view, int i, int i2, int i3, int i4) {
        C1189dV c1189dV = (C1189dV) view.getLayoutParams();
        Rect rect = c1189dV.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1189dV).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1189dV).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1189dV).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1189dV).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1e
            if (r8 < 0) goto L13
        L10:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L32
        L13:
            if (r8 != r1) goto L1b
            if (r6 == r2) goto L23
            if (r6 == 0) goto L1b
            if (r6 == r3) goto L23
        L1b:
            r6 = 0
            r8 = 0
            goto L32
        L1e:
            if (r8 < 0) goto L21
            goto L10
        L21:
            if (r8 != r1) goto L25
        L23:
            r8 = r5
            goto L32
        L25:
            if (r8 != r0) goto L1b
            if (r6 == r2) goto L2f
            if (r6 != r3) goto L2c
            goto L2f
        L2c:
            r8 = r5
            r6 = 0
            goto L32
        L2f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L32:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.w(boolean, int, int, int, int):int");
    }

    public static void y(View view, Rect rect) {
        int[] iArr = RecyclerView.w0;
        C1189dV c1189dV = (C1189dV) view.getLayoutParams();
        Rect rect2 = c1189dV.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1189dV).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1189dV).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1189dV).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1189dV).bottomMargin);
    }

    public final int A() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int F(g gVar, C2160mV c2160mV) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.n == null || !e()) {
            return 1;
        }
        return this.b.n.getItemCount();
    }

    public final void G(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C1189dV) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.m;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean H();

    public void K(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int F = recyclerView.g.F();
            for (int i2 = 0; i2 < F; i2++) {
                recyclerView.g.E(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void L(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int F = recyclerView.g.F();
            for (int i2 = 0; i2 < F; i2++) {
                recyclerView.g.E(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void M(RecyclerView recyclerView);

    public abstract View N(View view, int i, g gVar, C2160mV c2160mV);

    public void O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        g gVar = recyclerView.c;
        C2160mV c2160mV = recyclerView.g0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            d dVar = this.b.n;
            if (dVar != null) {
                accessibilityEvent.setItemCount(dVar.getItemCount());
            }
        }
    }

    public final void P(View view, S0 s0) {
        i H = RecyclerView.H(view);
        if (H != null && !H.isRemoved()) {
            C3244z4 c3244z4 = this.a;
            if (!((ArrayList) c3244z4.f).contains(H.itemView)) {
                RecyclerView recyclerView = this.b;
                Q(recyclerView.c, recyclerView.g0, view, s0);
            }
        }
    }

    public void Q(g gVar, C2160mV c2160mV, View view, S0 s0) {
        int i;
        int i2;
        if (e()) {
            i = D(view);
        } else {
            i = 0;
        }
        if (d()) {
            i2 = D(view);
        } else {
            i2 = 0;
        }
        s0.i(R0.a(false, i, 1, i2, 1));
    }

    public abstract void W(g gVar, C2160mV c2160mV);

    public abstract void X(C2160mV c2160mV);

    public abstract void Y(Parcelable parcelable);

    public abstract Parcelable Z();

    public void a0(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r9, android.view.View r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.b(int, android.view.View, boolean):void");
    }

    public final void b0(g gVar) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.H(u(v)).shouldIgnore()) {
                View u = u(v);
                e0(v);
                gVar.f(u);
            }
        }
    }

    public abstract void c(String str);

    public final void c0(g gVar) {
        ArrayList arrayList;
        int size = gVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = gVar.a;
            if (i < 0) {
                break;
            }
            View view = ((i) arrayList.get(i)).itemView;
            i H = RecyclerView.H(view);
            if (!H.shouldIgnore()) {
                H.setIsRecyclable(false);
                if (H.isTmpDetached()) {
                    this.b.removeDetachedView(view, false);
                }
                e eVar = this.b.L;
                if (eVar != null) {
                    eVar.d(H);
                }
                H.setIsRecyclable(true);
                i H2 = RecyclerView.H(view);
                H2.mScrapContainer = null;
                H2.mInChangeScrap = false;
                H2.clearReturnedFromScrapFlag();
                gVar.g(H2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = gVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract boolean d();

    public final void d0(View view, g gVar) {
        C3244z4 c3244z4 = this.a;
        Oc0 oc0 = (Oc0) c3244z4.c;
        int indexOfChild = ((RecyclerView) oc0.c).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C2257nd) c3244z4.d).I(indexOfChild)) {
                c3244z4.i0(view);
            }
            oc0.l0(indexOfChild);
        }
        gVar.f(view);
    }

    public abstract boolean e();

    public final void e0(int i) {
        if (u(i) != null) {
            C3244z4 c3244z4 = this.a;
            int I = c3244z4.I(i);
            Oc0 oc0 = (Oc0) c3244z4.c;
            View childAt = ((RecyclerView) oc0.c).getChildAt(I);
            if (childAt != null) {
                if (((C2257nd) c3244z4.d).I(I)) {
                    c3244z4.i0(childAt);
                }
                oc0.l0(I);
            }
        }
    }

    public boolean f(C1189dV c1189dV) {
        if (c1189dV != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.A()
            int r1 = r8.C()
            int r2 = r8.n
            int r3 = r8.B()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.z()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
            java.lang.reflect.Field r7 = defpackage.Sb0.a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.A()
            int r2 = r8.C()
            int r3 = r8.n
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.z()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.k
            y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            goto Lc1
        Lbe:
            r9.a0(r11, r10, r0)
        Lc1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.f0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void g0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract void h(int i, int i2, C2160mV c2160mV, C0164Be c0164Be);

    public abstract int h0(int i, C2160mV c2160mV, g gVar);

    public abstract void i0(int i);

    public abstract int j(C2160mV c2160mV);

    public abstract int j0(int i, C2160mV c2160mV, g gVar);

    public abstract int k(C2160mV c2160mV);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(C2160mV c2160mV);

    public final void l0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.x0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.x0) {
            this.o = 0;
        }
    }

    public abstract int m(C2160mV c2160mV);

    public void m0(Rect rect, int i, int i2) {
        int B = B() + A() + rect.width();
        int z = z() + C() + rect.height();
        RecyclerView recyclerView = this.b;
        Field field = Sb0.a;
        this.b.setMeasuredDimension(g(i, B, recyclerView.getMinimumWidth()), g(i2, z, this.b.getMinimumHeight()));
    }

    public abstract int n(C2160mV c2160mV);

    public final void n0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.m(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.k;
            y(u, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.b.k.set(i5, i6, i3, i4);
        m0(this.b.k, i, i2);
    }

    public abstract int o(C2160mV c2160mV);

    public final void o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.g;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final void p(g gVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            i H = RecyclerView.H(u);
            if (!H.shouldIgnore()) {
                if (H.isInvalid() && !H.isRemoved() && !this.b.n.hasStableIds()) {
                    e0(v);
                    gVar.g(H);
                } else {
                    u(v);
                    this.a.x(v);
                    gVar.h(u);
                    this.b.h.D(H);
                }
            }
        }
    }

    public final boolean p0(View view, int i, int i2, C1189dV c1189dV) {
        if (!view.isLayoutRequested() && this.h && I(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1189dV).width) && I(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1189dV).height)) {
            return false;
        }
        return true;
    }

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            i H = RecyclerView.H(u);
            if (H != null && H.getLayoutPosition() == i && !H.shouldIgnore() && (this.b.g0.g || !H.isRemoved())) {
                return u;
            }
        }
        return null;
    }

    public boolean q0() {
        return false;
    }

    public abstract C1189dV r();

    public final boolean r0(View view, int i, int i2, C1189dV c1189dV) {
        if (this.h && I(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1189dV).width) && I(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1189dV).height)) {
            return false;
        }
        return true;
    }

    public C1189dV s(Context context, AttributeSet attributeSet) {
        return new C1189dV(context, attributeSet);
    }

    public abstract void s0(RecyclerView recyclerView, int i);

    public C1189dV t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1189dV) {
            return new C1189dV((C1189dV) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1189dV((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1189dV(layoutParams);
    }

    public final void t0(TG tg) {
        TG tg2 = this.e;
        if (tg2 != null && tg != tg2 && tg2.e) {
            tg2.g();
        }
        this.e = tg;
        RecyclerView recyclerView = this.b;
        RunnableC2332oV runnableC2332oV = recyclerView.d0;
        runnableC2332oV.i.removeCallbacks(runnableC2332oV);
        runnableC2332oV.d.abortAnimation();
        if (tg.h) {
            Log.w("RecyclerView", "An instance of " + tg.getClass().getSimpleName() + " was started more than once. Each instance of" + tg.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        tg.b = recyclerView;
        tg.c = this;
        int i = tg.a;
        if (i != -1) {
            recyclerView.g0.a = i;
            tg.e = true;
            tg.d = true;
            tg.f = recyclerView.o.q(i);
            tg.b.d0.a();
            tg.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final View u(int i) {
        C3244z4 c3244z4 = this.a;
        if (c3244z4 != null) {
            return c3244z4.E(i);
        }
        return null;
    }

    public abstract boolean u0();

    public final int v() {
        C3244z4 c3244z4 = this.a;
        if (c3244z4 != null) {
            return c3244z4.F();
        }
        return 0;
    }

    public int x(g gVar, C2160mV c2160mV) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.n == null || !d()) {
            return 1;
        }
        return this.b.n.getItemCount();
    }

    public final int z() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public void S() {
    }

    public void R(int i, int i2) {
    }

    public void T(int i, int i2) {
    }

    public void U(int i, int i2) {
    }

    public void V(int i, int i2) {
    }

    public void i(int i, C0164Be c0164Be) {
    }
}
