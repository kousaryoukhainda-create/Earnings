package defpackage;
/* renamed from: WR  reason: default package */
/* loaded from: classes.dex */
public abstract class WR extends Exception {
    public final int b;
    public final long c;

    static {
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
        Ha0.H(5);
    }

    public WR(String str, Throwable th, int i, long j) {
        super(str, th);
        this.b = i;
        this.c = j;
    }
}
