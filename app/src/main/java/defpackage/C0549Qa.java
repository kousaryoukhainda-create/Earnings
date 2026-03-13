package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
/* renamed from: Qa  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549Qa implements J40, InterfaceC2790tm {
    public final C0815a20 a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final C3134xm[] e;
    public final AbstractC3220ym[] f;
    public int g;
    public int h;
    public C3134xm i;
    public AbstractC2962vm j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0549Qa(R40 r40) {
        this(new O40[2], new C0266Fc[2]);
        this.n = 1;
        int i = this.g;
        C3134xm[] c3134xmArr = this.e;
        B10.u(i == c3134xmArr.length);
        for (C3134xm c3134xm : c3134xmArr) {
            c3134xm.j(UserVerificationMethods.USER_VERIFY_ALL);
        }
        this.o = r40;
    }

    @Override // defpackage.InterfaceC2790tm
    public final void a(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    B10.u(z);
                    this.m = j;
                }
                z = true;
                B10.u(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2790tm
    public final Object d() {
        boolean z;
        C3134xm c3134xm;
        synchronized (this.b) {
            try {
                AbstractC2962vm abstractC2962vm = this.j;
                if (abstractC2962vm == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    B10.u(z);
                    int i = this.g;
                    if (i == 0) {
                        c3134xm = null;
                    } else {
                        C3134xm[] c3134xmArr = this.e;
                        int i2 = i - 1;
                        this.g = i2;
                        c3134xm = c3134xmArr[i2];
                    }
                    this.i = c3134xm;
                } else {
                    throw abstractC2962vm;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3134xm;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [vm, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v2, types: [vm, java.lang.Exception] */
    public final AbstractC2962vm f(Throwable th) {
        switch (this.n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    @Override // defpackage.InterfaceC2790tm
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                C3134xm c3134xm = this.i;
                if (c3134xm != null) {
                    c3134xm.g();
                    int i = this.g;
                    this.g = i + 1;
                    this.e[i] = c3134xm;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    C3134xm c3134xm2 = (C3134xm) this.c.removeFirst();
                    c3134xm2.g();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c3134xm2;
                }
                while (!this.d.isEmpty()) {
                    ((AbstractC3220ym) this.d.removeFirst()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2962vm g(C3134xm c3134xm, AbstractC3220ym abstractC3220ym, boolean z) {
        boolean z2;
        switch (this.n) {
            case 0:
                C0523Pa c0523Pa = (C0523Pa) abstractC3220ym;
                try {
                    ByteBuffer byteBuffer = c3134xm.g;
                    byteBuffer.getClass();
                    B10.u(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    B10.j(z2);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((C1566hq) this.o).getClass();
                    c0523Pa.g = C1566hq.b(remaining, array);
                    c0523Pa.d = c3134xm.i;
                    return null;
                } catch (C0924bD e) {
                    return e;
                }
            default:
                O40 o40 = (O40) c3134xm;
                C0266Fc c0266Fc = (C0266Fc) abstractC3220ym;
                try {
                    ByteBuffer byteBuffer2 = o40.g;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    R40 r40 = (R40) this.o;
                    if (z) {
                        r40.reset();
                    }
                    I40 f = r40.f(0, array2, limit);
                    long j = o40.i;
                    long j2 = o40.l;
                    c0266Fc.d = j;
                    c0266Fc.g = f;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    c0266Fc.h = j;
                    c0266Fc.f = false;
                    return null;
                } catch (K40 e2) {
                    return e2;
                }
        }
    }

    public final boolean h() {
        AbstractC2962vm f;
        boolean z;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            C3134xm c3134xm = (C3134xm) this.c.removeFirst();
            AbstractC3220ym[] abstractC3220ymArr = this.f;
            int i = this.h - 1;
            this.h = i;
            AbstractC3220ym abstractC3220ym = abstractC3220ymArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (c3134xm.d(4)) {
                abstractC3220ym.b(4);
            } else {
                abstractC3220ym.d = c3134xm.i;
                if (c3134xm.d(134217728)) {
                    abstractC3220ym.b(134217728);
                }
                if (!j(c3134xm.i)) {
                    abstractC3220ym.f = true;
                }
                try {
                    f = g(c3134xm, abstractC3220ym, z2);
                } catch (OutOfMemoryError e) {
                    f = f(e);
                } catch (RuntimeException e2) {
                    f = f(e2);
                }
                if (f != null) {
                    synchronized (this.b) {
                        this.j = f;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        abstractC3220ym.h();
                    } else if (abstractC3220ym.f) {
                        abstractC3220ym.h();
                    } else {
                        this.d.addLast(abstractC3220ym);
                    }
                    c3134xm.g();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = c3134xm;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.InterfaceC2790tm
    /* renamed from: i */
    public final AbstractC3220ym c() {
        synchronized (this.b) {
            try {
                AbstractC2962vm abstractC2962vm = this.j;
                if (abstractC2962vm == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (AbstractC3220ym) this.d.removeFirst();
                }
                throw abstractC2962vm;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.m;
            if (j2 != -9223372036854775807L && j < j2) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.InterfaceC2790tm
    /* renamed from: k */
    public final void e(C3134xm c3134xm) {
        boolean z;
        synchronized (this.b) {
            try {
                AbstractC2962vm abstractC2962vm = this.j;
                if (abstractC2962vm == null) {
                    if (c3134xm == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    B10.j(z);
                    this.c.addLast(c3134xm);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw abstractC2962vm;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(AbstractC3220ym abstractC3220ym) {
        synchronized (this.b) {
            abstractC3220ym.g();
            int i = this.h;
            this.h = i + 1;
            this.f[i] = abstractC3220ym;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.InterfaceC2790tm
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C0549Qa(C3134xm[] c3134xmArr, AbstractC3220ym[] abstractC3220ymArr) {
        AbstractC3220ym c0523Pa;
        C3134xm c3134xm;
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = c3134xmArr;
        this.g = c3134xmArr.length;
        for (int i = 0; i < this.g; i++) {
            C3134xm[] c3134xmArr2 = this.e;
            switch (this.n) {
                case 0:
                    c3134xm = new C3134xm(1);
                    break;
                default:
                    c3134xm = new C3134xm(1);
                    break;
            }
            c3134xmArr2[i] = c3134xm;
        }
        this.f = abstractC3220ymArr;
        this.h = abstractC3220ymArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            AbstractC3220ym[] abstractC3220ymArr2 = this.f;
            switch (this.n) {
                case 0:
                    c0523Pa = new C0523Pa(this);
                    break;
                default:
                    c0523Pa = new C0266Fc(this);
                    break;
            }
            abstractC3220ymArr2[i2] = c0523Pa;
        }
        C0815a20 c0815a20 = new C0815a20(this);
        this.a = c0815a20;
        c0815a20.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0549Qa(C1566hq c1566hq) {
        this(new C3134xm[1], new C0523Pa[1]);
        this.n = 0;
        this.o = c1566hq;
    }

    @Override // defpackage.J40
    public void b(long j) {
    }
}
