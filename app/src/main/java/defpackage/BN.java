package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
/* renamed from: BN  reason: default package */
/* loaded from: classes2.dex */
public final class BN extends AbstractC1431gG implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ DN i;
    public final /* synthetic */ CN j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BN(DN dn, CN cn, int i) {
        super(1);
        this.h = i;
        this.i = dn;
        this.j = cn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                Throwable th = (Throwable) obj;
                this.j.getClass();
                this.i.f(null);
                return B90.a;
            default:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DN.g;
                this.j.getClass();
                DN dn = this.i;
                atomicReferenceFieldUpdater.set(dn, null);
                dn.f(null);
                return B90.a;
        }
    }
}
