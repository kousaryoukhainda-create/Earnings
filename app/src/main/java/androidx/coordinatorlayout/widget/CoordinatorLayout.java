package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import com.ykapps.earnings.R;
import io.flutter.plugin.platform.PlatformPlugin;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ON, PN {
    public static final String v;
    public static final Class[] w;
    public static final ThreadLocal x;
    public static final C0272Fi y;
    public static final C3274zS z;
    public final ArrayList b;
    public final R70 c;
    public final ArrayList d;
    public final ArrayList f;
    public final int[] g;
    public final int[] h;
    public boolean i;
    public boolean j;
    public final int[] k;
    public View l;
    public View m;
    public ViewTreeObserver$OnPreDrawListenerC0246Ei n;
    public boolean o;
    public Pd0 p;
    public boolean q;
    public Drawable r;
    public ViewGroup.OnHierarchyChangeListener s;
    public Oc0 t;
    public final C1901jU u;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public SparseArray d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.d = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.d.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.d;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.d.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        String str;
        Package r1 = CoordinatorLayout.class.getPackage();
        if (r1 != null) {
            str = r1.getName();
        } else {
            str = null;
        }
        v = str;
        y = new C0272Fi(0);
        w = new Class[]{Context.class, AttributeSet.class};
        x = new ThreadLocal();
        z = new C3274zS();
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.b = new ArrayList();
        this.c = new R70(3);
        this.d = new ArrayList();
        this.f = new ArrayList();
        this.g = new int[2];
        this.h = new int[2];
        this.u = new C1901jU(5);
        int[] iArr = AbstractC2588rU.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            J0.m(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.k = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.k;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.r = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0194Ci(this));
        Field field = Sb0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) z.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, C0220Di c0220Di, int i2, int i3) {
        int width;
        int height;
        int i4 = c0220Di.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0220Di.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static C0220Di n(View view) {
        C0220Di c0220Di = (C0220Di) view.getLayoutParams();
        if (!c0220Di.b) {
            InterfaceC0168Bi interfaceC0168Bi = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0168Bi = (InterfaceC0168Bi) cls.getAnnotation(InterfaceC0168Bi.class);
                if (interfaceC0168Bi != null) {
                    break;
                }
            }
            if (interfaceC0168Bi != null) {
                try {
                    AbstractC0142Ai abstractC0142Ai = (AbstractC0142Ai) interfaceC0168Bi.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0142Ai abstractC0142Ai2 = c0220Di.a;
                    if (abstractC0142Ai2 != abstractC0142Ai) {
                        if (abstractC0142Ai2 != null) {
                            abstractC0142Ai2.e();
                        }
                        c0220Di.a = abstractC0142Ai;
                        c0220Di.b = true;
                        if (abstractC0142Ai != null) {
                            abstractC0142Ai.c(c0220Di);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0168Bi.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0220Di.b = true;
        }
        return c0220Di;
    }

    public static void u(int i, View view) {
        C0220Di c0220Di = (C0220Di) view.getLayoutParams();
        int i2 = c0220Di.i;
        if (i2 != i) {
            Sb0.f(i - i2, view);
            c0220Di.i = i;
        }
    }

    public static void v(int i, View view) {
        C0220Di c0220Di = (C0220Di) view.getLayoutParams();
        int i2 = c0220Di.j;
        if (i2 != i) {
            Sb0.g(i - i2, view);
            c0220Di.j = i;
        }
    }

    @Override // defpackage.ON
    public final void a(int i, View view) {
        C1901jU c1901jU = this.u;
        if (i == 1) {
            c1901jU.c = 0;
        } else {
            c1901jU.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
            if (c0220Di.a(i)) {
                AbstractC0142Ai abstractC0142Ai = c0220Di.a;
                if (abstractC0142Ai != null) {
                    abstractC0142Ai.p(childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c0220Di.n = false;
                    }
                } else {
                    c0220Di.m = false;
                }
            }
        }
        this.m = null;
    }

    @Override // defpackage.PN
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0142Ai abstractC0142Ai;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
                if (c0220Di.a(i5) && (abstractC0142Ai = c0220Di.a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0142Ai.k(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, iArr2[0]);
                    } else {
                        min = Math.min(i6, iArr2[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr2[1]);
                    } else {
                        min2 = Math.min(i7, iArr2[1]);
                    }
                    i7 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // defpackage.ON
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, 0, this.h);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C0220Di) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ON
    public final boolean d(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
                AbstractC0142Ai abstractC0142Ai = c0220Di.a;
                if (abstractC0142Ai != null) {
                    boolean o = abstractC0142Ai.o(childAt, i, i2);
                    z2 |= o;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c0220Di.n = o;
                        }
                    } else {
                        c0220Di.m = o;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c0220Di.n = false;
                    }
                } else {
                    c0220Di.m = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0142Ai abstractC0142Ai = ((C0220Di) view.getLayoutParams()).a;
        if (abstractC0142Ai != null) {
            abstractC0142Ai.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z2;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful()) {
            z2 = drawable.setState(drawableState);
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // defpackage.ON
    public final void e(View view, View view2, int i, int i2) {
        C1901jU c1901jU = this.u;
        if (i2 == 1) {
            c1901jU.c = i;
        } else {
            c1901jU.b = i;
        }
        this.m = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0220Di) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.ON
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0142Ai abstractC0142Ai;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
                if (c0220Di.a(i3) && (abstractC0142Ai = c0220Di.a) != null) {
                    int[] iArr2 = this.g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0142Ai.j(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0220Di();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0220Di(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.b);
    }

    public final Pd0 getLastWindowInsets() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1901jU c1901jU = this.u;
        return c1901jU.c | c1901jU.b;
    }

    public Drawable getStatusBarBackground() {
        return this.r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0220Di c0220Di, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0220Di).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0220Di).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0220Di).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0220Di).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z2) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        Z10 z10 = (Z10) this.c.d;
        int i = z10.d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) z10.k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z10.h(i2));
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = Zb0.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = Zb0.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Zb0.a(this, view, matrix);
        ThreadLocal threadLocal3 = Zb0.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.k;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i, int i2) {
        C3274zS c3274zS = z;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            c3274zS.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.o) {
            if (this.n == null) {
                this.n = new ViewTreeObserver$OnPreDrawListenerC0246Ei(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.n);
        }
        if (this.p == null) {
            Field field = Sb0.a;
            if (getFitsSystemWindows()) {
                Fb0.c(this);
            }
        }
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.o && this.n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.n);
        }
        View view = this.m;
        if (view != null) {
            a(0, view);
        }
        this.j = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.q && this.r != null) {
            Pd0 pd0 = this.p;
            if (pd0 != null) {
                i = pd0.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.r.setBounds(0, 0, getWidth(), i);
                this.r.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        AbstractC0142Ai abstractC0142Ai;
        Field field = Sb0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0142Ai = ((C0220Di) view.getLayoutParams()).a) == null || !abstractC0142Ai.g(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
        if (r0.h(r32, r20, r25, r8, r26) == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
                if (c0220Di.a(0)) {
                    AbstractC0142Ai abstractC0142Ai = c0220Di.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0142Ai abstractC0142Ai;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0220Di c0220Di = (C0220Di) childAt.getLayoutParams();
                if (c0220Di.a(0) && (abstractC0142Ai = c0220Di.a) != null) {
                    z2 |= abstractC0142Ai.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        SparseArray sparseArray = savedState.d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0142Ai abstractC0142Ai = n(childAt).a;
            if (id != -1 && abstractC0142Ai != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0142Ai.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0142Ai abstractC0142Ai = ((C0220Di) childAt.getLayoutParams()).a;
            if (id != -1 && abstractC0142Ai != null && (n = abstractC0142Ai.n(childAt)) != null) {
                sparseArray.append(id, n);
            }
        }
        absSavedState.d = sparseArray;
        return absSavedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2a
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            Di r6 = (defpackage.C0220Di) r6
            Ai r6 = r6.a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.l
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.l
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(int i, View view) {
        Rect g;
        Rect g2;
        int i2;
        C0220Di c0220Di = (C0220Di) view.getLayoutParams();
        View view2 = c0220Di.k;
        if (view2 == null && c0220Di.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C3274zS c3274zS = z;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                C0220Di c0220Di2 = (C0220Di) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, c0220Di2, measuredWidth, measuredHeight);
                h(c0220Di2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                c3274zS.c(g);
                g2.setEmpty();
                c3274zS.c(g2);
            }
        }
        int i3 = c0220Di.e;
        if (i3 >= 0) {
            C0220Di c0220Di3 = (C0220Di) view.getLayoutParams();
            int i4 = c0220Di3.c;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int m = m(i3) - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    m += measuredWidth2;
                }
            } else {
                m += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 != 80) {
                    i2 = 0;
                } else {
                    i2 = measuredHeight2;
                }
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0220Di3).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0220Di3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0220Di3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0220Di3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C0220Di c0220Di4 = (C0220Di) view.getLayoutParams();
        g = g();
        g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0220Di4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0220Di4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0220Di4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0220Di4).bottomMargin);
        if (this.p != null) {
            Field field = Sb0.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g.left = this.p.b() + g.left;
                g.top = this.p.d() + g.top;
                g.right -= this.p.c();
                g.bottom -= this.p.a();
            }
        }
        g2 = g();
        int i7 = c0220Di4.c;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
        view.layout(g2.left, g2.top, g2.right, g2.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        C0272Fi c0272Fi = y;
        if (c0272Fi != null) {
            Collections.sort(arrayList, c0272Fi);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            AbstractC0142Ai abstractC0142Ai = ((C0220Di) view.getLayoutParams()).a;
            if (z2 && actionMasked != 0) {
                if (abstractC0142Ai != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            abstractC0142Ai.q(view, motionEvent2);
                        }
                    } else {
                        abstractC0142Ai.f(this, view, motionEvent2);
                    }
                }
            } else if (!z2 && abstractC0142Ai != null) {
                if (i != 0) {
                    if (i == 1) {
                        z2 = abstractC0142Ai.q(view, motionEvent);
                    }
                } else {
                    z2 = abstractC0142Ai.f(this, view, motionEvent);
                }
                if (z2) {
                    this.l = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0142Ai abstractC0142Ai = ((C0220Di) view.getLayoutParams()).a;
        if (abstractC0142Ai != null) {
            abstractC0142Ai.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.i) {
            t(false);
            this.i = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0144, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z2;
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                Drawable drawable4 = this.r;
                Field field = Sb0.a;
                AbstractC2870uj.W(drawable4, getLayoutDirection());
                Drawable drawable5 = this.r;
                if (getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable5.setVisible(z2, false);
                this.r.setCallback(this);
            }
            Field field2 = Sb0.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AbstractC2525qi.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z2;
        super.setVisibility(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.r;
        if (drawable != null && drawable.isVisible() != z2) {
            this.r.setVisible(z2, false);
        }
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0142Ai abstractC0142Ai = ((C0220Di) childAt.getLayoutParams()).a;
            if (abstractC0142Ai != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0142Ai.f(this, childAt, obtain);
                } else {
                    abstractC0142Ai.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0220Di) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.l = null;
        this.i = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.r) {
            return false;
        }
        return true;
    }

    public final void w() {
        Field field = Sb0.a;
        if (getFitsSystemWindows()) {
            if (this.t == null) {
                this.t = new Oc0(this, 11);
            }
            Hb0.u(this, this.t);
            setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
            return;
        }
        Hb0.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0220Di) {
            return new C0220Di((C0220Di) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0220Di((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0220Di(layoutParams);
    }
}
