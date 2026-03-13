package defpackage;

import android.os.SystemClock;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: nd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2257nd implements InterfaceC2101ll, InterfaceC0309Gt, InterfaceC0361It, OnSuccessListener {
    public final /* synthetic */ int b;
    public long c;
    public Object d;

    public /* synthetic */ C2257nd(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    @Override // defpackage.InterfaceC2101ll
    public long B(long j) {
        return ((C0137Ad) this.d).a;
    }

    @Override // defpackage.InterfaceC2101ll
    public long C(long j, long j2) {
        return ((C0137Ad) this.d).a;
    }

    public void D(int i) {
        if (i >= 64) {
            C2257nd c2257nd = (C2257nd) this.d;
            if (c2257nd != null) {
                c2257nd.D(i - 64);
                return;
            }
            return;
        }
        this.c &= ~(1 << i);
    }

    public int E(int i) {
        C2257nd c2257nd = (C2257nd) this.d;
        if (c2257nd == null) {
            if (i >= 64) {
                return Long.bitCount(this.c);
            }
            return Long.bitCount(this.c & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.c & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.c) + c2257nd.E(i - 64);
        }
    }

    public void F() {
        if (((C2257nd) this.d) == null) {
            this.d = new C2257nd(0);
        }
    }

    public boolean G(int i) {
        if (i >= 64) {
            F();
            return ((C2257nd) this.d).G(i - 64);
        } else if ((this.c & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void H(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            F();
            ((C2257nd) this.d).H(i - 64, z);
            return;
        }
        long j = this.c;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.c = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            K(i);
        } else {
            D(i);
        }
        if (z2 || ((C2257nd) this.d) != null) {
            F();
            ((C2257nd) this.d).H(0, z2);
        }
    }

    public boolean I(int i) {
        boolean z;
        if (i >= 64) {
            F();
            return ((C2257nd) this.d).I(i - 64);
        }
        long j = 1 << i;
        long j2 = this.c;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.c = j3;
        long j4 = j - 1;
        this.c = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2257nd c2257nd = (C2257nd) this.d;
        if (c2257nd != null) {
            if (c2257nd.G(0)) {
                K(63);
            }
            ((C2257nd) this.d).I(0);
        }
        return z;
    }

    public void J() {
        this.c = 0L;
        C2257nd c2257nd = (C2257nd) this.d;
        if (c2257nd != null) {
            c2257nd.J();
        }
    }

    public void K(int i) {
        if (i >= 64) {
            F();
            ((C2257nd) this.d).K(i - 64);
            return;
        }
        this.c |= 1 << i;
    }

    public void L(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.d) == null) {
            this.d = exc;
            this.c = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.c) {
            Exception exc2 = (Exception) this.d;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.d;
            this.d = null;
            throw exc3;
        }
    }

    @Override // defpackage.InterfaceC2101ll
    public long a(long j) {
        return ((C0137Ad) this.d).e[(int) j] - this.c;
    }

    @Override // defpackage.InterfaceC0309Gt
    public boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((C2277nn) this.d).c(bArr, 0, i2, z);
    }

    @Override // defpackage.InterfaceC2101ll
    public long e(long j, long j2) {
        return ((C0137Ad) this.d).d[(int) j];
    }

    @Override // defpackage.InterfaceC0309Gt
    public void f(int i, byte[] bArr, int i2) {
        ((C2277nn) this.d).m(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC0309Gt
    public long getPosition() {
        return ((C2277nn) this.d).f - this.c;
    }

    @Override // defpackage.InterfaceC2101ll
    public long h(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.InterfaceC2101ll
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC2101ll
    public CU k(long j) {
        C0137Ad c0137Ad = (C0137Ad) this.d;
        int i = (int) j;
        return new CU(null, c0137Ad.c[i], c0137Ad.b[i]);
    }

    @Override // defpackage.InterfaceC0309Gt
    public boolean m(byte[] bArr, int i, int i2, boolean z) {
        return ((C2277nn) this.d).m(bArr, i, i2, z);
    }

    @Override // defpackage.InterfaceC0309Gt
    public long n() {
        return ((C2277nn) this.d).n() - this.c;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        Ka0.a.a("Utils: app set id success listener invoked.");
        Ka0.c = appSetIdInfo.getScope();
        ((LinkedBlockingQueue) this.d).offer(appSetIdInfo.getId());
        Ka0.b = Ka0.q(this.c);
    }

    @Override // defpackage.InterfaceC0309Gt
    public void p(int i) {
        ((C2277nn) this.d).a(i, false);
    }

    @Override // defpackage.InterfaceC2101ll
    public long q(long j, long j2) {
        return Ha0.f(((C0137Ad) this.d).e, j + this.c, true);
    }

    @Override // defpackage.InterfaceC0361It
    public void r() {
        ((InterfaceC0361It) this.d).r();
    }

    @Override // defpackage.InterfaceC3046wl
    public int read(byte[] bArr, int i, int i2) {
        return ((C2277nn) this.d).read(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC0309Gt
    public void readFully(byte[] bArr, int i, int i2) {
        ((C2277nn) this.d).c(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC0309Gt
    public long s() {
        return ((C2277nn) this.d).d - this.c;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                if (((C2257nd) this.d) == null) {
                    return Long.toBinaryString(this.c);
                }
                return ((C2257nd) this.d).toString() + "xx" + Long.toBinaryString(this.c);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC0309Gt
    public void u() {
        ((C2277nn) this.d).h = 0;
    }

    @Override // defpackage.InterfaceC0309Gt
    public void v(int i) {
        ((C2277nn) this.d).v(i);
    }

    @Override // defpackage.InterfaceC2101ll
    public boolean w() {
        return true;
    }

    @Override // defpackage.InterfaceC0361It
    public L70 x(int i, int i2) {
        return ((InterfaceC0361It) this.d).x(i, i2);
    }

    @Override // defpackage.InterfaceC2101ll
    public long y() {
        return 0L;
    }

    @Override // defpackage.InterfaceC0361It
    public void z(InterfaceC2164mZ interfaceC2164mZ) {
        ((InterfaceC0361It) this.d).z(new Z30(this, interfaceC2164mZ, interfaceC2164mZ));
    }

    public /* synthetic */ C2257nd(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    public C2257nd(C2277nn c2277nn, long j) {
        this.b = 4;
        this.d = c2277nn;
        B10.j(c2277nn.f >= j);
        this.c = j;
    }

    public C2257nd(int i) {
        this.b = i;
        switch (i) {
            case 2:
                return;
            default:
                this.c = 0L;
                return;
        }
    }
}
