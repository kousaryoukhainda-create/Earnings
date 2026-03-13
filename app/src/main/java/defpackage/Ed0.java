package defpackage;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
/* renamed from: Ed0  reason: default package */
/* loaded from: classes.dex */
public class Ed0 extends Gd0 {
    public final WindowInsets.Builder a;

    public Ed0() {
        this.a = AbstractC3067x10.f();
    }

    @Override // defpackage.Gd0
    @NonNull
    public Pd0 b() {
        WindowInsets build;
        a();
        build = this.a.build();
        Pd0 g = Pd0.g(build, null);
        g.a.o(null);
        return g;
    }

    @Override // defpackage.Gd0
    public void c(@NonNull SD sd) {
        this.a.setStableInsets(sd.c());
    }

    @Override // defpackage.Gd0
    public void d(@NonNull SD sd) {
        this.a.setSystemWindowInsets(sd.c());
    }

    public Ed0(@NonNull Pd0 pd0) {
        super(pd0);
        WindowInsets.Builder f;
        WindowInsets f2 = pd0.f();
        if (f2 != null) {
            f = AbstractC3067x10.g(f2);
        } else {
            f = AbstractC3067x10.f();
        }
        this.a = f;
    }
}
