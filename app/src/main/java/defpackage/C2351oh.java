package defpackage;
/* renamed from: oh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351oh extends C2265nh implements InterfaceC2508qZ {
    public final int h;
    public final long i;

    public C2351oh(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = i;
        this.i = j == -1 ? -1L : j;
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long a(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.InterfaceC2508qZ
    public final long d() {
        return this.i;
    }

    @Override // defpackage.InterfaceC2508qZ
    public final int j() {
        return this.h;
    }
}
