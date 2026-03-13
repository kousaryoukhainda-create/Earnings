package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: F40  reason: default package */
/* loaded from: classes.dex */
public final class F40 extends IL implements SubMenu {
    public final IL w;
    public final QL x;

    public F40(Context context, IL il, QL ql) {
        super(context);
        this.w = il;
        this.x = ql;
    }

    @Override // defpackage.IL
    public final boolean d(QL ql) {
        return this.w.d(ql);
    }

    @Override // defpackage.IL
    public final boolean e(IL il, MenuItem menuItem) {
        if (!super.e(il, menuItem) && !this.w.e(il, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.IL
    public final boolean f(QL ql) {
        return this.w.f(ql);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.x;
    }

    @Override // defpackage.IL
    public final IL j() {
        return this.w.j();
    }

    @Override // defpackage.IL
    public final boolean l() {
        return this.w.l();
    }

    @Override // defpackage.IL
    public final boolean m() {
        return this.w.m();
    }

    @Override // defpackage.IL
    public final boolean n() {
        return this.w.n();
    }

    @Override // defpackage.IL, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.w.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.x.setIcon(drawable);
        return this;
    }

    @Override // defpackage.IL, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.w.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.x.setIcon(i);
        return this;
    }
}
