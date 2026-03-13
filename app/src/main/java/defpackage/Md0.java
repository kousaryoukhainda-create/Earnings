package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
/* renamed from: Md0  reason: default package */
/* loaded from: classes.dex */
public final class Md0 extends Kd0 {
    public static final Pd0 q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        q = Pd0.g(windowInsets, null);
    }

    public Md0(@NonNull Pd0 pd0, @NonNull WindowInsets windowInsets) {
        super(pd0, windowInsets);
    }

    @Override // defpackage.Hd0, defpackage.Nd0
    @NonNull
    public SD f(int i) {
        Insets insets;
        insets = this.c.getInsets(Od0.a(i));
        return SD.b(insets);
    }

    @Override // defpackage.Hd0, defpackage.Nd0
    public final void d(@NonNull View view) {
    }
}
