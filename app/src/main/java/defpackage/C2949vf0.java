package defpackage;
/* renamed from: vf0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2949vf0 extends Zk0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ C2949vf0(Object obj, int i) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.Zk0
    public final void b() {
        switch (this.g) {
            case 0:
                A00 a00 = (A00) this.h;
                C3121xf0 c3121xf0 = (C3121xf0) a00.c;
                c3121xf0.b.b("unlinkToDeath", new Object[0]);
                c3121xf0.n.asBinder().unlinkToDeath(c3121xf0.k, 0);
                C3121xf0 c3121xf02 = (C3121xf0) a00.c;
                c3121xf02.n = null;
                c3121xf02.g = false;
                return;
            default:
                synchronized (((C3121xf0) this.h).f) {
                    try {
                        if (((C3121xf0) this.h).l.get() > 0 && ((C3121xf0) this.h).l.decrementAndGet() > 0) {
                            ((C3121xf0) this.h).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C3121xf0 c3121xf03 = (C3121xf0) this.h;
                        if (c3121xf03.n != null) {
                            c3121xf03.b.b("Unbind from service.", new Object[0]);
                            C3121xf0 c3121xf04 = (C3121xf0) this.h;
                            c3121xf04.a.unbindService(c3121xf04.m);
                            C3121xf0 c3121xf05 = (C3121xf0) this.h;
                            c3121xf05.g = false;
                            c3121xf05.n = null;
                            c3121xf05.m = null;
                        }
                        ((C3121xf0) this.h).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
