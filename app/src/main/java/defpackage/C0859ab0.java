package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* renamed from: ab0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859ab0 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C0859ab0(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0950bb0 c0950bb0 = new C0950bb0();
        c0950bb0.b = (VectorDrawable) this.a.newDrawable();
        return c0950bb0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0950bb0 c0950bb0 = new C0950bb0();
        c0950bb0.b = (VectorDrawable) this.a.newDrawable(resources);
        return c0950bb0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0950bb0 c0950bb0 = new C0950bb0();
        c0950bb0.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c0950bb0;
    }
}
