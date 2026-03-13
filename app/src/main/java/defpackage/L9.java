package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* renamed from: L9  reason: default package */
/* loaded from: classes.dex */
public abstract class L9 implements InterfaceC3304zl {
    public final boolean b;
    public final ArrayList c = new ArrayList(1);
    public int d;
    public C0223Dl f;

    public L9(boolean z) {
        this.b = z;
    }

    public final void a(int i) {
        boolean z;
        C0223Dl c0223Dl = this.f;
        int i2 = Ha0.a;
        for (int i3 = 0; i3 < this.d; i3++) {
            boolean z2 = this.b;
            C0795Zm c0795Zm = (C0795Zm) ((U70) this.c.get(i3));
            synchronized (c0795Zm) {
                FV fv = C0795Zm.n;
                if (z2 && (c0223Dl.h & 8) != 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c0795Zm.h += i;
                }
            }
        }
    }

    public final void e() {
        boolean z;
        boolean z2;
        C0223Dl c0223Dl = this.f;
        int i = Ha0.a;
        for (int i2 = 0; i2 < this.d; i2++) {
            boolean z3 = this.b;
            C0795Zm c0795Zm = (C0795Zm) ((U70) this.c.get(i2));
            synchronized (c0795Zm) {
                try {
                    FV fv = C0795Zm.n;
                    if (z3 && (c0223Dl.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (c0795Zm.f > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        B10.u(z2);
                        c0795Zm.c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - c0795Zm.g);
                        c0795Zm.i += i3;
                        long j = c0795Zm.j;
                        long j2 = c0795Zm.h;
                        c0795Zm.j = j + j2;
                        if (i3 > 0) {
                            c0795Zm.e.b((((float) j2) * 8000.0f) / i3, (int) Math.sqrt(j2));
                            if (c0795Zm.i < 2000) {
                                if (c0795Zm.j >= 524288) {
                                }
                                c0795Zm.c(i3, c0795Zm.h, c0795Zm.k);
                                c0795Zm.g = elapsedRealtime;
                                c0795Zm.h = 0L;
                            }
                            c0795Zm.k = c0795Zm.e.e();
                            c0795Zm.c(i3, c0795Zm.h, c0795Zm.k);
                            c0795Zm.g = elapsedRealtime;
                            c0795Zm.h = 0L;
                        }
                        c0795Zm.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f = null;
    }

    public final void h() {
        for (int i = 0; i < this.d; i++) {
            ((U70) this.c.get(i)).getClass();
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final void i(U70 u70) {
        u70.getClass();
        ArrayList arrayList = this.c;
        if (!arrayList.contains(u70)) {
            arrayList.add(u70);
            this.d++;
        }
    }

    public final void j(C0223Dl c0223Dl) {
        boolean z;
        this.f = c0223Dl;
        for (int i = 0; i < this.d; i++) {
            boolean z2 = this.b;
            C0795Zm c0795Zm = (C0795Zm) ((U70) this.c.get(i));
            synchronized (c0795Zm) {
                try {
                    FV fv = C0795Zm.n;
                    if (z2 && (c0223Dl.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (c0795Zm.f == 0) {
                            c0795Zm.c.getClass();
                            c0795Zm.g = SystemClock.elapsedRealtime();
                        }
                        c0795Zm.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public Map t() {
        return Collections.emptyMap();
    }
}
