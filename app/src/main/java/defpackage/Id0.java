package defpackage;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
/* renamed from: Id0  reason: default package */
/* loaded from: classes.dex */
public class Id0 extends Hd0 {
    public SD m;

    public Id0(@NonNull Pd0 pd0, @NonNull WindowInsets windowInsets) {
        super(pd0, windowInsets);
        this.m = null;
    }

    @Override // defpackage.Nd0
    @NonNull
    public Pd0 b() {
        return Pd0.g(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.Nd0
    @NonNull
    public Pd0 c() {
        return Pd0.g(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.Nd0
    @NonNull
    public final SD h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = SD.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.Nd0
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.Nd0
    public void q(SD sd) {
        this.m = sd;
    }
}
