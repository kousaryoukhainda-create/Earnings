package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.ykapps.earnings.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0142Ai {
    public final float A;
    public int B;
    public final float C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public Xb0 H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference O;
    public WeakReference P;
    public final ArrayList Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public HashMap V;
    public int W;
    public final C0949bb X;
    public final int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public OJ i;
    public final int j;
    public final int k;
    public int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public int r;
    public int s;
    public C1236e10 t;
    public boolean u;
    public RunnableC1034cb v;
    public final ValueAnimator w;
    public final int x;
    public int y;
    public int z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new C0949bb(this);
    }

    public static View v(View view) {
        Field field = Sb0.a;
        if (Hb0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View v = v(viewGroup.getChildAt(i));
                if (v != null) {
                    return v;
                }
            }
            return null;
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public final void A(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.D;
        }
        WeakReference weakReference = this.O;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            G(true);
        } else if (i == 6 || i == 5 || i == 4) {
            G(false);
        }
        F(i);
        ArrayList arrayList = this.Q;
        if (arrayList.size() <= 0) {
            E();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void B(int i, View view) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.B;
        } else if (i == 6) {
            i2 = this.z;
            if (this.b && i2 <= (i3 = this.y)) {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = x();
        } else if (this.D && i == 5) {
            i2 = this.N;
        } else {
            Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        }
        D(view, i, i2, false);
    }

    public final boolean C(View view, float f) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.B) / s() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r5 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        A(2);
        F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2.v != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r2.v = new defpackage.RunnableC1034cb(r2, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r5 = r2.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r5.c != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.d = r4;
        r4 = defpackage.Sb0.a;
        r3.postOnAnimation(r5);
        r2.v.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        r5.d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0.o(r3.getLeft(), r5) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.view.View r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            Xb0 r0 = r2.H
            if (r0 == 0) goto L56
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.o(r6, r5)
            if (r5 == 0) goto L56
            goto L2e
        L11:
            int r6 = r3.getLeft()
            r0.r = r3
            r1 = -1
            r0.c = r1
            r1 = 0
            boolean r5 = r0.h(r6, r5, r1, r1)
            if (r5 != 0) goto L2c
            int r6 = r0.a
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.r
            if (r6 == 0) goto L2c
            r6 = 0
            r0.r = r6
        L2c:
            if (r5 == 0) goto L56
        L2e:
            r5 = 2
            r2.A(r5)
            r2.F(r4)
            cb r5 = r2.v
            if (r5 != 0) goto L40
            cb r5 = new cb
            r5.<init>(r2, r3, r4)
            r2.v = r5
        L40:
            cb r5 = r2.v
            boolean r6 = r5.c
            if (r6 != 0) goto L53
            r5.d = r4
            java.lang.reflect.Field r4 = defpackage.Sb0.a
            r3.postOnAnimation(r5)
            cb r3 = r2.v
            r4 = 1
            r3.c = r4
            goto L59
        L53:
            r5.d = r4
            goto L59
        L56:
            r2.A(r4)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(android.view.View, int, int, boolean):void");
    }

    public final void E() {
        View view;
        int i;
        boolean z;
        F0 f0;
        WeakReference weakReference = this.O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Sb0.i(524288, view);
        Sb0.e(0, view);
        Sb0.i(262144, view);
        Sb0.e(0, view);
        Sb0.i(1048576, view);
        Sb0.e(0, view);
        int i2 = this.W;
        if (i2 != -1) {
            Sb0.i(i2, view);
            Sb0.e(0, view);
        }
        int i3 = 6;
        if (!this.b && this.G != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0731Xa c0731Xa = new C0731Xa(this, 6);
            ArrayList b = Sb0.b(view);
            int i4 = 0;
            while (true) {
                if (i4 < b.size()) {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L0) b.get(i4)).a).getLabel())) {
                        i = ((L0) b.get(i4)).a();
                        break;
                    }
                    i4++;
                } else {
                    int i5 = -1;
                    for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                        int i7 = Sb0.d[i6];
                        boolean z2 = true;
                        for (int i8 = 0; i8 < b.size(); i8++) {
                            if (((L0) b.get(i8)).a() != i7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 &= z;
                        }
                        if (z2) {
                            i5 = i7;
                        }
                    }
                    i = i5;
                }
            }
            if (i != -1) {
                L0 l0 = new L0(null, i, string, c0731Xa, null);
                View.AccessibilityDelegate a = Sb0.a(view);
                if (a == null) {
                    f0 = null;
                } else if (a instanceof E0) {
                    f0 = ((E0) a).a;
                } else {
                    f0 = new F0(a);
                }
                if (f0 == null) {
                    f0 = new F0();
                }
                Sb0.l(view, f0);
                Sb0.i(l0.a(), view);
                Sb0.b(view).add(l0);
                Sb0.e(0, view);
            }
            this.W = i;
        }
        if (this.D && this.G != 5) {
            Sb0.j(view, L0.j, new C0731Xa(this, 5));
        }
        int i9 = this.G;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 == 6) {
                    Sb0.j(view, L0.i, new C0731Xa(this, 4));
                    Sb0.j(view, L0.h, new C0731Xa(this, 3));
                    return;
                }
                return;
            }
            if (this.b) {
                i3 = 3;
            }
            Sb0.j(view, L0.h, new C0731Xa(this, i3));
            return;
        }
        if (this.b) {
            i3 = 4;
        }
        Sb0.j(view, L0.i, new C0731Xa(this, i3));
    }

    public final void F(int i) {
        boolean z;
        float f;
        ValueAnimator valueAnimator = this.w;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.u != z) {
            this.u = z;
            if (this.i != null && valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                valueAnimator.setFloatValues(1.0f - f, f);
                valueAnimator.start();
            }
        }
    }

    public final void G(boolean z) {
        WeakReference weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.V == null) {
                this.V = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.O.get() && z) {
                this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.V = null;
        }
    }

    public final void H() {
        View view;
        if (this.O != null) {
            r();
            if (this.G == 4 && (view = (View) this.O.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.AbstractC0142Ai
    public final void c(C0220Di c0220Di) {
        this.O = null;
        this.H = null;
    }

    @Override // defpackage.AbstractC0142Ai
    public final void e() {
        this.O = null;
        this.H = null;
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        Xb0 xb0;
        if (view.isShown() && this.F) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.S = -1;
                VelocityTracker velocityTracker = this.R;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.R = null;
                }
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.U = false;
                    this.S = -1;
                    if (this.I) {
                        this.I = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.T = (int) motionEvent.getY();
                if (this.G != 2) {
                    WeakReference weakReference = this.P;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x, this.T)) {
                        this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.U = true;
                    }
                }
                if (this.S == -1 && !coordinatorLayout.o(view, x, this.T)) {
                    z = true;
                } else {
                    z = false;
                }
                this.I = z;
            }
            if (!this.I && (xb0 = this.H) != null && xb0.p(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.P;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.I || this.G == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(this.T - motionEvent.getY()) <= this.H.b) {
                return false;
            }
            return true;
        }
        this.I = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [w0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ab, java.lang.Object] */
    @Override // defpackage.AbstractC0142Ai
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        boolean z2;
        float f;
        OJ oj;
        Field field = Sb0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.m && !this.e) {
                z = true;
            } else {
                z = false;
            }
            if (this.n || this.o || this.p || z) {
                ?? obj = new Object();
                obj.c = this;
                obj.b = z;
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj2 = new Object();
                obj2.a = paddingStart;
                obj2.b = paddingEnd;
                obj2.c = paddingBottom;
                Hb0.u(view, new C2935vX(13, (Object) obj, (Object) obj2));
                if (view.isAttachedToWindow()) {
                    Fb0.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            this.O = new WeakReference(view);
            if (this.h && (oj = this.i) != null) {
                view.setBackground(oj);
            }
            OJ oj2 = this.i;
            if (oj2 != null) {
                float f2 = this.C;
                if (f2 == -1.0f) {
                    f2 = Hb0.i(view);
                }
                oj2.i(f2);
                if (this.G == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.u = z2;
                OJ oj3 = this.i;
                if (z2) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                NJ nj = oj3.b;
                if (nj.i != f) {
                    nj.i = f;
                    oj3.g = true;
                    oj3.invalidateSelf();
                }
            }
            E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.H == null) {
            this.H = new Xb0(coordinatorLayout.getContext(), coordinatorLayout, this.X);
        }
        int top = view.getTop();
        coordinatorLayout.q(i, view);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.L = height;
        int i2 = this.N;
        int i3 = i2 - height;
        int i4 = this.s;
        if (i3 < i4) {
            if (this.q) {
                this.L = i2;
            } else {
                this.L = i2 - i4;
            }
        }
        this.y = Math.max(0, i2 - this.L);
        this.z = (int) ((1.0f - this.A) * this.N);
        r();
        int i5 = this.G;
        if (i5 == 3) {
            Sb0.g(x(), view);
        } else if (i5 == 6) {
            Sb0.g(this.z, view);
        } else if (this.D && i5 == 5) {
            Sb0.g(this.N, view);
        } else if (i5 == 4) {
            Sb0.g(this.B, view);
        } else if (i5 == 1 || i5 == 2) {
            Sb0.g(top - view.getTop(), view);
        }
        this.P = new WeakReference(v(view));
        return true;
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.j, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.k, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean i(View view) {
        WeakReference weakReference = this.P;
        if (weakReference == null || view != weakReference.get() || this.G == 3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC0142Ai
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.P;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x = top - x();
                iArr[1] = x;
                Sb0.g(-x, view);
                A(3);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i2;
                Sb0.g(-i2, view);
                A(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.B;
            if (i4 > i5 && !this.D) {
                int i6 = top - i5;
                iArr[1] = i6;
                Sb0.g(-i6, view);
                A(4);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i2;
                Sb0.g(-i2, view);
                A(1);
            }
        }
        u(view.getTop());
        this.J = i2;
        this.K = true;
    }

    @Override // defpackage.AbstractC0142Ai
    public final void m(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = savedState.f;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.g;
            }
            if (i == -1 || (i & 4) == 4) {
                this.D = savedState.h;
            }
            if (i == -1 || (i & 8) == 8) {
                this.E = savedState.i;
            }
        }
        int i2 = savedState.d;
        if (i2 != 1 && i2 != 2) {
            this.G = i2;
        } else {
            this.G = 4;
        }
    }

    @Override // defpackage.AbstractC0142Ai
    public final Parcelable n(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean o(View view, int i, int i2) {
        this.J = 0;
        this.K = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC0142Ai
    public final void p(View view, View view2, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == x()) {
            A(3);
            return;
        }
        WeakReference weakReference = this.P;
        if (weakReference != null && view2 == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.b) {
                    i2 = this.y;
                } else {
                    int top = view.getTop();
                    int i4 = this.z;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    } else {
                        i2 = x();
                    }
                }
            } else {
                if (this.D) {
                    VelocityTracker velocityTracker = this.R;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.c);
                        yVelocity = this.R.getYVelocity(this.S);
                    }
                    if (C(view, yVelocity)) {
                        i2 = this.N;
                        i3 = 5;
                    }
                }
                if (this.J == 0) {
                    int top2 = view.getTop();
                    if (this.b) {
                        if (Math.abs(top2 - this.y) < Math.abs(top2 - this.B)) {
                            i2 = this.y;
                        } else {
                            i2 = this.B;
                            i3 = 4;
                        }
                    } else {
                        int i5 = this.z;
                        if (top2 < i5) {
                            if (top2 < Math.abs(top2 - this.B)) {
                                i2 = x();
                            } else {
                                i2 = this.z;
                            }
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.B)) {
                            i2 = this.z;
                        } else {
                            i2 = this.B;
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (this.b) {
                        i2 = this.B;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - this.z) < Math.abs(top3 - this.B)) {
                            i2 = this.z;
                            i3 = 6;
                        } else {
                            i2 = this.B;
                        }
                    }
                    i3 = 4;
                }
            }
            D(view, i3, i2, false);
            this.K = false;
        }
    }

    @Override // defpackage.AbstractC0142Ai
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.G;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        Xb0 xb0 = this.H;
        if (xb0 != null && (this.F || i == 1)) {
            xb0.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.H != null && ((this.F || this.G == 1) && actionMasked == 2 && !this.I)) {
            float abs = Math.abs(this.T - motionEvent.getY());
            Xb0 xb02 = this.H;
            if (abs > xb02.b) {
                xb02.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.I;
    }

    public final void r() {
        int s = s();
        if (this.b) {
            this.B = Math.max(this.N - s, this.y);
        } else {
            this.B = this.N - s;
        }
    }

    public final int s() {
        int i;
        if (this.e) {
            return Math.min(Math.max(this.f, this.N - ((this.M * 9) / 16)), this.L) + this.r;
        }
        if (!this.m && !this.n && (i = this.l) > 0) {
            return Math.max(this.d, i + this.g);
        }
        return this.d + this.r;
    }

    public final void t(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.t = C1236e10.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952462).a();
            OJ oj = new OJ(this.t);
            this.i = oj;
            oj.h(context);
            if (z && colorStateList != null) {
                this.i.j(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public final void u(int i) {
        if (((View) this.O.get()) != null) {
            ArrayList arrayList = this.Q;
            if (!arrayList.isEmpty()) {
                int i2 = this.B;
                if (i <= i2 && i2 != x()) {
                    x();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final int x() {
        int i;
        if (this.b) {
            return this.y;
        }
        int i2 = this.x;
        if (this.q) {
            i = 0;
        } else {
            i = this.s;
        }
        return Math.max(i2, i);
    }

    public final void y(int i) {
        if (i == -1) {
            if (!this.e) {
                this.e = true;
            } else {
                return;
            }
        } else if (this.e || this.d != i) {
            this.e = false;
            this.d = Math.max(0, i);
        } else {
            return;
        }
        H();
    }

    public final void z(int i) {
        if (i == this.G) {
            return;
        }
        if (this.O == null) {
            if (i == 4 || i == 3 || i == 6 || (this.D && i == 5)) {
                this.G = i;
                return;
            }
            return;
        }
        View view = (View) this.O.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                Field field = Sb0.a;
                if (view.isAttachedToWindow()) {
                    view.post(new A1(this, view, i));
                    return;
                }
            }
            B(i, view);
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public final int d;
        public final int f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.d = bottomSheetBehavior.G;
            this.f = bottomSheetBehavior.d;
            this.g = bottomSheetBehavior.b;
            this.h = bottomSheetBehavior.D;
            this.i = bottomSheetBehavior.E;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new C0949bb(this);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.a);
        this.h = obtainStyledAttributes.hasValue(17);
        int i2 = 3;
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            t(context, attributeSet, hasValue, AbstractC1522hL.x(context, obtainStyledAttributes, 3));
        } else {
            t(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.setDuration(500L);
        this.w.addUpdateListener(new C0783Za(this, 0));
        this.C = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            y(i);
        } else {
            y(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.D != z) {
            this.D = z;
            if (!z && this.G == 5) {
                z(4);
            }
            E();
        }
        this.m = obtainStyledAttributes.getBoolean(12, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.O != null) {
                r();
            }
            A((this.b && this.G == 6) ? i2 : this.G);
            E();
        }
        this.E = obtainStyledAttributes.getBoolean(11, false);
        this.F = obtainStyledAttributes.getBoolean(4, true);
        this.a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.A = f;
            if (this.O != null) {
                this.z = (int) ((1.0f - f) * this.N);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.x = i3;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.x = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.n = obtainStyledAttributes.getBoolean(13, false);
            this.o = obtainStyledAttributes.getBoolean(14, false);
            this.p = obtainStyledAttributes.getBoolean(15, false);
            this.q = obtainStyledAttributes.getBoolean(16, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // defpackage.AbstractC0142Ai
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
