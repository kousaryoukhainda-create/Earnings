package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* renamed from: KZ  reason: default package */
/* loaded from: classes2.dex */
public final class KZ extends AbstractC2851uZ {
    public final AtomicReferenceArray g;

    public KZ(long j, KZ kz, int i) {
        super(j, kz, i);
        this.g = new AtomicReferenceArray(JZ.f);
    }

    @Override // defpackage.AbstractC2851uZ
    public final int f() {
        return JZ.f;
    }

    @Override // defpackage.AbstractC2851uZ
    public final void g(int i, InterfaceC0428Li interfaceC0428Li) {
        this.g.set(i, JZ.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
