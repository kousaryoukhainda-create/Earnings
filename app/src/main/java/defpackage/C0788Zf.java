package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* renamed from: Zf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788Zf {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public b d;
    public long e;
    public boolean f;
    public long g;
    public InterfaceC3113xb0 h;
    public Executor i;
    public final /* synthetic */ C0868ag j;

    public C0788Zf(C0868ag c0868ag, Context context) {
        int i;
        this.j = c0868ag;
        this.a = context;
        if (Ha0.J(context)) {
            i = 1;
        } else {
            i = 5;
        }
        this.b = i;
        this.c = new ArrayList();
        this.e = -9223372036854775807L;
        this.h = InterfaceC3113xb0.d8;
        this.i = C0868ag.m;
    }

    public final void a(boolean z) {
        this.f = false;
        this.e = -9223372036854775807L;
        C0868ag c0868ag = this.j;
        if (c0868ag.l == 1) {
            c0868ag.k++;
            c0868ag.c.a();
            C3161y50 c3161y50 = c0868ag.i;
            B10.w(c3161y50);
            c3161y50.c(new RunnableC1495h2(c0868ag, 11));
        }
        if (z) {
            C2426pb0 c2426pb0 = c0868ag.b;
            C2769tb0 c2769tb0 = c2426pb0.b;
            c2769tb0.m = 0L;
            c2769tb0.p = -1L;
            c2769tb0.n = -1L;
            c2426pb0.g = -9223372036854775807L;
            c2426pb0.e = -9223372036854775807L;
            c2426pb0.c(1);
            c2426pb0.h = -9223372036854775807L;
        }
    }

    public final void b(b bVar) {
        boolean z;
        C0868ag c0868ag = this.j;
        if (c0868ag.l == 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        C0605Se c0605Se = bVar.z;
        if (c0605Se == null || !c0605Se.d()) {
            c0605Se = C0605Se.h;
        }
        if (c0605Se.c != 7 || Ha0.a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        B10.w(myLooper);
        c0868ag.i = c0868ag.e.a(myLooper, null);
        try {
            C0736Xf c0736Xf = c0868ag.d;
            C2400pD c2400pD = AbstractC2571rD.c;
            FV fv = FV.g;
            c0736Xf.a();
            Pair pair = c0868ag.j;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                int i = ((F20) pair.second).a;
            }
            throw null;
        } catch (C2254nb0 e) {
            throw new C3199yb0(e, bVar);
        }
    }

    public final void c() {
        boolean z;
        if (this.d == null) {
            return;
        }
        new ArrayList().addAll(this.c);
        b bVar = this.d;
        bVar.getClass();
        B10.w(null);
        C0605Se c0605Se = bVar.z;
        if (c0605Se == null || !c0605Se.d()) {
            C0605Se c0605Se2 = C0605Se.h;
        }
        int i = bVar.s;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        B10.i("width must be positive, but is: " + i, z);
        int i2 = bVar.t;
        if (i2 > 0) {
            z2 = true;
        }
        B10.i("height must be positive, but is: " + i2, z2);
        throw null;
    }

    public final void d(long j, long j2) {
        try {
            this.j.a(j, j2);
        } catch (C0282Fs e) {
            b bVar = this.d;
            if (bVar == null) {
                bVar = new b(new C2717sy());
            }
            throw new C3199yb0(e, bVar);
        }
    }

    public final void e(Surface surface, F20 f20) {
        C0868ag c0868ag = this.j;
        Pair pair = c0868ag.j;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((F20) c0868ag.j.second).equals(f20)) {
            c0868ag.j = Pair.create(surface, f20);
            int i = f20.a;
        }
    }
}
