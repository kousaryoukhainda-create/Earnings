package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.List;
/* renamed from: ea  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1279ea {
    public final ViewGroup a;
    public final Context b;
    public final AbstractC1194da c;
    public final SnackbarContentLayout d;
    public int e;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final AccessibilityManager l;
    public static final int[] o = {R.attr.snackbarStyle};
    public static final String p = AbstractC1279ea.class.getSimpleName();
    public static final Handler n = new Handler(Looper.getMainLooper(), new Object());
    public final W9 f = new W9(this, 0);
    public final Z9 m = new Z9(this);

    public AbstractC1279ea(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.a = viewGroup;
                this.d = snackbarContentLayout2;
                this.b = context;
                AbstractC0957bf.k(context, AbstractC0957bf.n, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(o);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                AbstractC1194da abstractC1194da = (AbstractC1194da) from.inflate(i, viewGroup, false);
                this.c = abstractC1194da;
                float actionTextColorAlpha = abstractC1194da.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.c.setTextColor(AbstractC2618rm.C(actionTextColorAlpha, AbstractC2618rm.v(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.c.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(abstractC1194da.getMaxInlineActionWidth());
                abstractC1194da.addView(snackbarContentLayout);
                ViewGroup.LayoutParams layoutParams = abstractC1194da.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                Field field = Sb0.a;
                abstractC1194da.setAccessibilityLiveRegion(1);
                abstractC1194da.setImportantForAccessibility(1);
                abstractC1194da.setFitsSystemWindows(true);
                Hb0.u(abstractC1194da, new X9(this));
                Sb0.l(abstractC1194da, new Y9(this, 0));
                this.l = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void a(int i) {
        boolean z;
        C0811a00 h = C0811a00.h();
        Z9 z9 = this.m;
        synchronized (h.b) {
            try {
                if (h.l(z9)) {
                    h.e((T20) h.d, i);
                } else {
                    T20 t20 = (T20) h.f;
                    if (t20 != null && t20.a.get() == z9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        h.e((T20) h.f, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        C0811a00 h = C0811a00.h();
        Z9 z9 = this.m;
        synchronized (h.b) {
            try {
                if (h.l(z9)) {
                    h.d = null;
                    if (((T20) h.f) != null) {
                        h.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public final void c() {
        C0811a00 h = C0811a00.h();
        Z9 z9 = this.m;
        synchronized (h.b) {
            try {
                if (h.l(z9)) {
                    h.r((T20) h.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        AbstractC1194da abstractC1194da = this.c;
        if (z) {
            abstractC1194da.post(new W9(this, 1));
            return;
        }
        if (abstractC1194da.getParent() != null) {
            abstractC1194da.setVisibility(0);
        }
        c();
    }

    public final void e() {
        Rect rect;
        AbstractC1194da abstractC1194da = this.c;
        ViewGroup.LayoutParams layoutParams = abstractC1194da.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.g) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.h;
            marginLayoutParams.leftMargin = rect.left + this.i;
            marginLayoutParams.rightMargin = rect.right + this.j;
            abstractC1194da.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && this.k > 0) {
                ViewGroup.LayoutParams layoutParams2 = abstractC1194da.getLayoutParams();
                if ((layoutParams2 instanceof C0220Di) && (((C0220Di) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    W9 w9 = this.f;
                    abstractC1194da.removeCallbacks(w9);
                    abstractC1194da.post(w9);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(p, "Unable to update margins because layout params are not MarginLayoutParams");
    }
}
