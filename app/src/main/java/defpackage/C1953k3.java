package defpackage;

import android.graphics.drawable.Drawable;
/* renamed from: k3  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1953k3 implements Drawable.Callback {
    public final /* synthetic */ int b = 1;
    public Object c;

    public /* synthetic */ C1953k3() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.b) {
            case 0:
                ((C2211n3) this.c).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.b) {
            case 0:
                ((C2211n3) this.c).scheduleSelf(runnable, j);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.c;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.b) {
            case 0:
                ((C2211n3) this.c).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.c;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public C1953k3(C2211n3 c2211n3) {
        this.c = c2211n3;
    }

    private final void a(Drawable drawable) {
    }
}
