package defpackage;
/* renamed from: Ts  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645Ts implements InterfaceC1985kS {
    public C0645Ts b;
    public C0645Ts c;

    public final void a(long j, float[] fArr) {
        C0645Ts c0645Ts = this.c;
        if (c0645Ts != null) {
            c0645Ts.a(j, fArr);
        }
    }

    public final void b() {
        C0645Ts c0645Ts = this.c;
        if (c0645Ts != null) {
            c0645Ts.b();
        }
    }

    public final void c(long j, long j2) {
        C0645Ts c0645Ts = this.b;
        if (c0645Ts != null) {
            c0645Ts.c(j, j2);
        }
    }

    @Override // defpackage.InterfaceC1985kS
    public final void d(int i, Object obj) {
        if (i != 7) {
            if (i != 8) {
                if (i == 10000 && obj != null) {
                    throw new ClassCastException();
                }
                return;
            }
            this.c = (C0645Ts) obj;
            return;
        }
        this.b = (C0645Ts) obj;
    }
}
