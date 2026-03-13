package defpackage;
/* renamed from: Xr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0748Xr extends AbstractRunnableC0774Yr {
    public final I60 d;

    public C0748Xr(long j, I60 i60) {
        super(j);
        this.d = i60;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.run();
    }

    @Override // defpackage.AbstractRunnableC0774Yr
    public final String toString() {
        return super.toString() + this.d;
    }
}
