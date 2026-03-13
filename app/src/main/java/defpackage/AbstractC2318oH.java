package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: oH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2318oH implements C10 {
    public static final Method A;
    public static final Method y;
    public static final Method z;
    public final Context b;
    public ListAdapter c;
    public WL d;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public C2060lH m;
    public View n;
    public RL o;
    public final Handler t;
    public Rect v;
    public boolean w;
    public final C1327f4 x;
    public int f = -2;
    public int l = 0;
    public final RunnableC1974kH p = new RunnableC1974kH(this, 1);
    public final View$OnTouchListenerC2232nH q = new View$OnTouchListenerC2232nH(this, 0);
    public final C2146mH r = new C2146mH(this);
    public final RunnableC1974kH s = new RunnableC1974kH(this, 0);
    public final Rect u = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                y = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                z = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.PopupWindow, f4] */
    public AbstractC2318oH(Context context, int i) {
        Drawable drawable;
        int resourceId;
        this.b = context;
        this.t = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3104xU.l, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC3104xU.p, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC1522hL.R(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = AbstractC1522hL.y(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.x = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        C2060lH c2060lH = this.m;
        if (c2060lH == null) {
            this.m = new C2060lH(this);
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2060lH);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.m);
        }
        WL wl = this.d;
        if (wl != null) {
            wl.setAdapter(this.c);
        }
    }

    @Override // defpackage.C10
    public final boolean d() {
        return this.x.isShowing();
    }

    @Override // defpackage.C10
    public final void dismiss() {
        C1327f4 c1327f4 = this.x;
        c1327f4.dismiss();
        c1327f4.setContentView(null);
        this.d = null;
        this.t.removeCallbacks(this.p);
    }

    @Override // defpackage.C10
    public final ListView i() {
        return this.d;
    }

    @Override // defpackage.C10
    public final void show() {
        int i;
        boolean z2;
        int a;
        int makeMeasureSpec;
        int i2;
        WL wl;
        int i3;
        WL wl2 = this.d;
        C1327f4 c1327f4 = this.x;
        Context context = this.b;
        if (wl2 == null) {
            WL wl3 = new WL(context, !this.w);
            wl3.setHoverListener((XL) this);
            this.d = wl3;
            wl3.setAdapter(this.c);
            this.d.setOnItemClickListener(this.o);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new C1518hH(this));
            this.d.setOnScrollListener(this.r);
            c1327f4.setContentView(this.d);
        } else {
            ViewGroup viewGroup = (ViewGroup) c1327f4.getContentView();
        }
        Drawable background = c1327f4.getBackground();
        Rect rect = this.u;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.i) {
                this.h = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (c1327f4.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.n;
        int i5 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = z;
            if (method != null) {
                try {
                    a = ((Integer) method.invoke(c1327f4, view, Integer.valueOf(i5), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a = c1327f4.getMaxAvailableHeight(view, i5);
        } else {
            a = AbstractC1604iH.a(c1327f4, view, i5, z2);
        }
        int i6 = this.f;
        int i7 = -1;
        if (i6 != -2) {
            if (i6 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int a2 = this.d.a(makeMeasureSpec, a);
        if (a2 > 0) {
            i2 = this.d.getPaddingBottom() + this.d.getPaddingTop() + i;
        } else {
            i2 = 0;
        }
        int i8 = a2 + i2;
        this.x.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            AS.d(c1327f4, 1002);
        } else {
            if (!AbstractC1522hL.s) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    AbstractC1522hL.r = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                AbstractC1522hL.s = true;
            }
            Method method2 = AbstractC1522hL.r;
            if (method2 != null) {
                try {
                    method2.invoke(c1327f4, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (c1327f4.isShowing()) {
            if (!this.n.isAttachedToWindow()) {
                return;
            }
            int i9 = this.f;
            if (i9 == -1) {
                i9 = -1;
            } else if (i9 == -2) {
                i9 = this.n.getWidth();
            }
            c1327f4.setOutsideTouchable(true);
            View view2 = this.n;
            int i10 = this.g;
            int i11 = this.h;
            if (i9 < 0) {
                i3 = -1;
            } else {
                i3 = i9;
            }
            if (i8 >= 0) {
                i7 = i8;
            }
            c1327f4.update(view2, i10, i11, i3, i7);
            return;
        }
        int i12 = this.f;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.n.getWidth();
        }
        c1327f4.setWidth(i12);
        c1327f4.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = y;
            if (method3 != null) {
                try {
                    method3.invoke(c1327f4, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1888jH.b(c1327f4, true);
        }
        c1327f4.setOutsideTouchable(true);
        c1327f4.setTouchInterceptor(this.q);
        if (this.k) {
            AbstractC1522hL.R(c1327f4, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method4 = A;
            if (method4 != null) {
                try {
                    method4.invoke(c1327f4, this.v);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1888jH.a(c1327f4, this.v);
        }
        c1327f4.showAsDropDown(this.n, this.g, this.h, this.l);
        this.d.setSelection(-1);
        if ((!this.w || this.d.isInTouchMode()) && (wl = this.d) != null) {
            wl.setListSelectionHidden(true);
            wl.requestLayout();
        }
        if (!this.w) {
            this.t.post(this.s);
        }
    }
}
