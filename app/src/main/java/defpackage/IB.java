package defpackage;
/* renamed from: IB  reason: default package */
/* loaded from: classes.dex */
public final class IB {
    public final QB a;
    public final long b;
    public final int c;
    public final boolean d;

    public IB(QB qb, long j, int i) {
        boolean z;
        this.a = qb;
        this.b = j;
        this.c = i;
        if ((qb instanceof NB) && ((NB) qb).o) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
