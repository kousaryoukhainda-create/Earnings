package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ykapps.earnings.R;
import java.util.ArrayList;
/* renamed from: v1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2894v1 implements ZL {
    public final Context b;
    public Context c;
    public IL d;
    public final LayoutInflater f;
    public YL g;
    public ActionMenuView i;
    public C2808u1 j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public C2636s1 t;
    public C2636s1 u;
    public RunnableC1881jA v;
    public C2722t1 w;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray s = new SparseBooleanArray();
    public final VA x = new VA(this, 3);

    public C2894v1(Context context) {
        this.b = context;
        this.f = LayoutInflater.from(context);
    }

    @Override // defpackage.ZL
    public final void a(IL il, boolean z) {
        i();
        C2636s1 c2636s1 = this.u;
        if (c2636s1 != null && c2636s1.b()) {
            c2636s1.i.dismiss();
        }
        YL yl = this.g;
        if (yl != null) {
            yl.a(il, z);
        }
    }

    @Override // defpackage.ZL
    public final boolean b(F40 f40) {
        boolean z;
        if (!f40.hasVisibleItems()) {
            return false;
        }
        F40 f402 = f40;
        while (true) {
            IL il = f402.w;
            if (il == this.d) {
                break;
            }
            f402 = (F40) il;
        }
        ActionMenuView actionMenuView = this.i;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i);
                if ((childAt instanceof InterfaceC0933bM) && ((InterfaceC0933bM) childAt).getItemData() == f402.x) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        f40.x.getClass();
        int size = f40.f.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                MenuItem item = f40.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        C2636s1 c2636s1 = new C2636s1(this, this.c, f40, view);
        this.u = c2636s1;
        c2636s1.g = z;
        RL rl = c2636s1.i;
        if (rl != null) {
            rl.n(z);
        }
        C2636s1 c2636s12 = this.u;
        if (!c2636s12.b()) {
            if (c2636s12.e != null) {
                c2636s12.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        YL yl = this.g;
        if (yl != null) {
            yl.g(f40);
        }
        return true;
    }

    @Override // defpackage.ZL
    public final boolean c() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        IL il = this.d;
        if (il != null) {
            arrayList = il.k();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.q;
        int i4 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.i;
        int i5 = 0;
        boolean z5 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            QL ql = (QL) arrayList.get(i5);
            int i8 = ql.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z5 = true;
            }
            if (this.r && ql.B) {
                i3 = 0;
            }
            i5++;
        }
        if (this.m && (z5 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            QL ql2 = (QL) arrayList.get(i10);
            int i12 = ql2.y;
            if ((i12 & 2) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i13 = ql2.b;
            if (z2) {
                View d = d(ql2, null, actionMenuView);
                d.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                ql2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z6) && i4 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    View d2 = d(ql2, null, actionMenuView);
                    d2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 &= z4;
                }
                if (z3 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        QL ql3 = (QL) arrayList.get(i14);
                        if (ql3.b == i13) {
                            if (ql3.d()) {
                                i9++;
                            }
                            ql3.f(false);
                        }
                    }
                }
                if (z3) {
                    i9--;
                }
                ql2.f(z3);
            } else {
                ql2.f(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    public final View d(QL ql, View view, ActionMenuView actionMenuView) {
        InterfaceC0933bM interfaceC0933bM;
        View view2 = ql.z;
        if (view2 == null) {
            view2 = null;
        }
        int i = 0;
        if (view2 == null || ql.c()) {
            if (view instanceof InterfaceC0933bM) {
                interfaceC0933bM = (InterfaceC0933bM) view;
            } else {
                interfaceC0933bM = (InterfaceC0933bM) this.f.inflate(this.h, (ViewGroup) actionMenuView, false);
            }
            interfaceC0933bM.b(ql);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0933bM;
            actionMenuItemView.setItemInvoker(this.i);
            if (this.w == null) {
                this.w = new C2722t1(this);
            }
            actionMenuItemView.setPopupCallback(this.w);
            view2 = (View) interfaceC0933bM;
        }
        if (ql.B) {
            i = 8;
        }
        view2.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C3066x1)) {
            view2.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view2;
    }

    @Override // defpackage.ZL
    public final boolean e(QL ql) {
        return false;
    }

    @Override // defpackage.ZL
    public final void f(YL yl) {
        throw null;
    }

    @Override // defpackage.ZL
    public final boolean g(QL ql) {
        return false;
    }

    @Override // defpackage.ZL
    public final void h() {
        int i;
        QL ql;
        ActionMenuView actionMenuView = this.i;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            IL il = this.d;
            if (il != null) {
                il.i();
                ArrayList k = this.d.k();
                int size = k.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    QL ql2 = (QL) k.get(i2);
                    if (ql2.d()) {
                        View childAt = actionMenuView.getChildAt(i);
                        if (childAt instanceof InterfaceC0933bM) {
                            ql = ((InterfaceC0933bM) childAt).getItemData();
                        } else {
                            ql = null;
                        }
                        View d = d(ql2, childAt, actionMenuView);
                        if (ql2 != ql) {
                            d.setPressed(false);
                            d.jumpDrawablesToCurrentState();
                        }
                        if (d != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d);
                            }
                            this.i.addView(d, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.j) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.i.requestLayout();
        IL il2 = this.d;
        if (il2 != null) {
            il2.i();
            ArrayList arrayList2 = il2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((QL) arrayList2.get(i3)).getClass();
            }
        }
        IL il3 = this.d;
        if (il3 != null) {
            il3.i();
            arrayList = il3.j;
        }
        if (this.m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((QL) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.j == null) {
                this.j = new C2808u1(this, this.b);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.j.getParent();
            if (viewGroup2 != this.i) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.j);
                }
                ActionMenuView actionMenuView2 = this.i;
                C2808u1 c2808u1 = this.j;
                actionMenuView2.getClass();
                C3066x1 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView2.addView(c2808u1, i4);
            }
        } else {
            C2808u1 c2808u12 = this.j;
            if (c2808u12 != null) {
                ViewParent parent = c2808u12.getParent();
                ActionMenuView actionMenuView3 = this.i;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.j);
                }
            }
        }
        this.i.setOverflowReserved(this.m);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        RunnableC1881jA runnableC1881jA = this.v;
        if (runnableC1881jA != null && (actionMenuView = this.i) != null) {
            actionMenuView.removeCallbacks(runnableC1881jA);
            this.v = null;
            return true;
        }
        C2636s1 c2636s1 = this.t;
        if (c2636s1 != null) {
            if (c2636s1.b()) {
                c2636s1.i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ZL
    public final void j(Context context, IL il) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = il;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        int i = 2;
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.q = i;
        int i4 = this.o;
        if (this.m) {
            if (this.j == null) {
                C2808u1 c2808u1 = new C2808u1(this, this.b);
                this.j = c2808u1;
                if (this.l) {
                    c2808u1.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean k() {
        IL il;
        if (this.m) {
            C2636s1 c2636s1 = this.t;
            if ((c2636s1 == null || !c2636s1.b()) && (il = this.d) != null && this.i != null && this.v == null) {
                il.i();
                if (!il.j.isEmpty()) {
                    RunnableC1881jA runnableC1881jA = new RunnableC1881jA(this, false, new C2636s1(this, this.c, this.d, this.j), 1);
                    this.v = runnableC1881jA;
                    this.i.post(runnableC1881jA);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
