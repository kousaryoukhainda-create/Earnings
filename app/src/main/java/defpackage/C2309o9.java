package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: o9  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2309o9 extends AbstractC1036cc {
    public final C2223n9[] b;

    public C2309o9(C2223n9[] c2223n9Arr) {
        this.b = c2223n9Arr;
    }

    @Override // defpackage.AbstractC1036cc
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C2223n9 c2223n9 : this.b) {
            InterfaceC0435Lp interfaceC0435Lp = c2223n9.h;
            if (interfaceC0435Lp != null) {
                interfaceC0435Lp.dispose();
            } else {
                Intrinsics.f("handle");
                throw null;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        b();
        return B90.a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.b + ']';
    }
}
