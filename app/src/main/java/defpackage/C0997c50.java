package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
/* renamed from: c50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997c50 {
    public CharSequence A;
    public final /* synthetic */ C1159d50 D;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public CharSequence z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public C0997c50(C1159d50 c1159d50, Menu menu) {
        this.D = c1159d50;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, b50] */
    public final void b(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z2 = false;
        if (this.r >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        C1159d50 c1159d50 = this.D;
        if (str != null) {
            if (!c1159d50.c.isRestricted()) {
                if (c1159d50.d == null) {
                    c1159d50.d = C1159d50.a(c1159d50.c);
                }
                Object obj = c1159d50.d;
                String str2 = this.y;
                ?? obj2 = new Object();
                obj2.a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.b = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC0912b50.c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder m = AbstractC0324Hi.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    m.append(cls.getName());
                    InflateException inflateException = new InflateException(m.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2 && (menuItem instanceof QL)) {
            QL ql = (QL) menuItem;
            ql.x = (ql.x & (-5)) | 4;
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1159d50.e, c1159d50.a));
            z2 = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z2) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.z;
        boolean z3 = menuItem instanceof QL;
        if (z3) {
            ((QL) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            OL.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z3) {
            ((QL) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            OL.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z3) {
            ((QL) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            OL.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z3) {
            ((QL) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            OL.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z3) {
                ((QL) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OL.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z3) {
                ((QL) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                OL.i(menuItem, colorStateList);
            }
        }
    }
}
