package defpackage;

import android.graphics.drawable.Drawable;
/* renamed from: RW  reason: default package */
/* loaded from: classes3.dex */
public final class RW extends Drawable.ConstantState {
    public OJ a;
    public boolean b;

    public RW(RW rw) {
        this.a = (OJ) rw.a.b.newDrawable();
        this.b = rw.b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new SW(new RW(this));
    }
}
