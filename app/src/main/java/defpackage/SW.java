package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: SW  reason: default package */
/* loaded from: classes3.dex */
public final class SW extends Drawable implements InterfaceC2294o10, K60 {
    public RW b;

    public SW(RW rw) {
        this.b = rw;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RW rw = this.b;
        if (rw.b) {
            rw.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.b.a.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.b = new RW(this.b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.b.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = TW.b(iArr);
        RW rw = this.b;
        if (rw.b != b) {
            rw.b = b;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.InterfaceC2294o10
    public final void setShapeAppearanceModel(C1236e10 c1236e10) {
        this.b.a.setShapeAppearanceModel(c1236e10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.b.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.b.a.setTintMode(mode);
    }
}
