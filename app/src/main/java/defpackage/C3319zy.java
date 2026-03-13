package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: zy  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3319zy extends N1 {
    public final /* synthetic */ AtomicReference a;

    public C3319zy(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.N1
    public final void a(Object obj) {
        N1 n1 = (N1) this.a.get();
        if (n1 != null) {
            n1.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
