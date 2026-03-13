package defpackage;
/* renamed from: I60  reason: default package */
/* loaded from: classes2.dex */
public final class I60 extends C0855aZ implements Runnable {
    public final long g;

    public I60(long j, AbstractC3040wi abstractC3040wi) {
        super(abstractC3040wi, abstractC3040wi.getContext());
        this.g = j;
    }

    @Override // defpackage.C2230nF
    public final String E() {
        return super.E() + "(timeMillis=" + this.g + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        Wh0.D(this.d);
        k(new H60(BK.n(new StringBuilder("Timed out waiting for "), this.g, " ms"), this));
    }
}
