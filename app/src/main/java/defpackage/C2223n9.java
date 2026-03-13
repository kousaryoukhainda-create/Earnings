package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: n9  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2223n9 extends AbstractC1173dF {
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C2223n9.class, Object.class, "_disposer");
    private volatile Object _disposer;
    public final C1911jc g;
    public InterfaceC0435Lp h;
    public final /* synthetic */ C2395p9 i;

    public C2223n9(C2395p9 c2395p9, C1911jc c1911jc) {
        this.i = c2395p9;
        this.g = c1911jc;
    }

    @Override // defpackage.AbstractC1173dF
    public final void i(Throwable th) {
        C1911jc c1911jc = this.g;
        if (th != null) {
            c1911jc.getClass();
            C0754Xx D = c1911jc.D(null, new C2519qf(false, th));
            if (D != null) {
                c1911jc.f(D);
                C2309o9 c2309o9 = (C2309o9) j.get(this);
                if (c2309o9 != null) {
                    c2309o9.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2395p9.b;
        C2395p9 c2395p9 = this.i;
        if (atomicIntegerFieldUpdater.decrementAndGet(c2395p9) == 0) {
            InterfaceC0356Io[] interfaceC0356IoArr = c2395p9.a;
            ArrayList arrayList = new ArrayList(interfaceC0356IoArr.length);
            for (InterfaceC0356Io interfaceC0356Io : interfaceC0356IoArr) {
                arrayList.add(interfaceC0356Io.getCompleted());
            }
            c1911jc.resumeWith(arrayList);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return B90.a;
    }
}
