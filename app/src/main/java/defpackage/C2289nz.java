package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: nz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2289nz implements InterfaceC2913vB, LY, InterfaceC1370fc0 {
    public final n b;
    public final C1284ec0 c;
    public final j d;
    public JG f = null;
    public KY g = null;

    public C2289nz(n nVar, C1284ec0 c1284ec0, j jVar) {
        this.b = nVar;
        this.c = c1284ec0;
        this.d = jVar;
    }

    public final void a(AG ag) {
        this.f.e(ag);
    }

    public final void b() {
        if (this.f == null) {
            this.f = new JG(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            KY ky = new KY(this);
            this.g = ky;
            ky.a();
            this.d.run();
        }
    }

    @Override // defpackage.InterfaceC2913vB
    public final AbstractC1214dk getDefaultViewModelCreationExtras() {
        Application application;
        n nVar = this.b;
        Context applicationContext = nVar.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C2925vN c2925vN = new C2925vN();
        if (application != null) {
            c2925vN.b(BI.p, application);
        }
        c2925vN.b(AbstractC1522hL.m, nVar);
        c2925vN.b(AbstractC1522hL.n, this);
        if (nVar.getArguments() != null) {
            c2925vN.b(AbstractC1522hL.o, nVar.getArguments());
        }
        return c2925vN;
    }

    @Override // defpackage.HG
    public final CG getLifecycle() {
        b();
        return this.f;
    }

    @Override // defpackage.LY
    public final JY getSavedStateRegistry() {
        b();
        return this.g.b;
    }

    @Override // defpackage.InterfaceC1370fc0
    public final C1284ec0 getViewModelStore() {
        b();
        return this.c;
    }
}
