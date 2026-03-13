package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: m3  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125m3 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C2125m3(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C2211n3 c2211n3 = new C2211n3(null);
        Drawable newDrawable = this.a.newDrawable();
        c2211n3.b = newDrawable;
        newDrawable.setCallback(c2211n3.f);
        return c2211n3;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2211n3 c2211n3 = new C2211n3(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        c2211n3.b = newDrawable;
        newDrawable.setCallback(c2211n3.f);
        return c2211n3;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C2211n3 c2211n3 = new C2211n3(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        c2211n3.b = newDrawable;
        newDrawable.setCallback(c2211n3.f);
        return c2211n3;
    }
}
