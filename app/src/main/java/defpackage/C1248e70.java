package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* renamed from: e70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248e70 implements ZL {
    public IL b;
    public QL c;
    public final /* synthetic */ Toolbar d;

    public C1248e70(Toolbar toolbar) {
        this.d = toolbar;
    }

    @Override // defpackage.ZL
    public final boolean b(F40 f40) {
        return false;
    }

    @Override // defpackage.ZL
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ZL
    public final boolean e(QL ql) {
        Toolbar toolbar = this.d;
        toolbar.removeView(toolbar.k);
        toolbar.removeView(toolbar.j);
        toolbar.k = null;
        ArrayList arrayList = toolbar.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.c = null;
        toolbar.requestLayout();
        ql.B = false;
        ql.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // defpackage.ZL
    public final boolean g(QL ql) {
        Toolbar toolbar = this.d;
        toolbar.c();
        ViewParent parent = toolbar.j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.j);
            }
            toolbar.addView(toolbar.j);
        }
        View view = ql.z;
        if (view == null) {
            view = null;
        }
        toolbar.k = view;
        this.c = ql;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.k);
            }
            C1334f70 g = Toolbar.g();
            g.a = (toolbar.p & 112) | 8388611;
            g.b = 2;
            toolbar.k.setLayoutParams(g);
            toolbar.addView(toolbar.k);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1334f70) childAt.getLayoutParams()).b != 2 && childAt != toolbar.b) {
                toolbar.removeViewAt(childCount);
                toolbar.G.add(childAt);
            }
        }
        toolbar.requestLayout();
        ql.B = true;
        ql.n.o(false);
        toolbar.s();
        return true;
    }

    @Override // defpackage.ZL
    public final void h() {
        if (this.c != null) {
            IL il = this.b;
            if (il != null) {
                int size = il.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.b.getItem(i) == this.c) {
                        return;
                    }
                }
            }
            e(this.c);
        }
    }

    @Override // defpackage.ZL
    public final void j(Context context, IL il) {
        QL ql;
        IL il2 = this.b;
        if (il2 != null && (ql = this.c) != null) {
            il2.d(ql);
        }
        this.b = il;
    }

    @Override // defpackage.ZL
    public final void a(IL il, boolean z) {
    }
}
