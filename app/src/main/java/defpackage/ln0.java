package defpackage;
/* renamed from: ln0  reason: default package */
/* loaded from: classes3.dex */
public final class ln0 extends Ym0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ln0(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.Ym0
    public final void a() {
        switch (this.c) {
            case 0:
                tn0 tn0Var = (tn0) this.d;
                if (tn0Var.m != null) {
                    tn0Var.b.i("Unbind from service.", new Object[0]);
                    tn0Var.a.unbindService(tn0Var.l);
                    tn0Var.g = false;
                    tn0Var.m = null;
                    tn0Var.l = null;
                }
                tn0Var.b();
                return;
            default:
                A00 a00 = (A00) this.d;
                tn0 tn0Var2 = (tn0) a00.c;
                tn0Var2.b.i("unlinkToDeath", new Object[0]);
                tn0Var2.m.asBinder().unlinkToDeath(tn0Var2.j, 0);
                tn0 tn0Var3 = (tn0) a00.c;
                tn0Var3.m = null;
                tn0Var3.g = false;
                return;
        }
    }
}
