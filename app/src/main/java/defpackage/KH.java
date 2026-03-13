package defpackage;
/* renamed from: KH  reason: default package */
/* loaded from: classes.dex */
public final class KH {
    public final int a;
    public final long b;

    public /* synthetic */ KH(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }

    public static KH b(C2277nn c2277nn, NQ nq) {
        c2277nn.m(nq.a, 0, 8, false);
        nq.G(0);
        return new KH(nq.l(), nq.h(), false);
    }

    public boolean a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public KH(int i, long j) {
        B10.j(j >= 0);
        this.a = i;
        this.b = j;
    }
}
