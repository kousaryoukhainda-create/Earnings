package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes3.dex */
final class s {
    private final InterfaceC1292eg0 a;
    private final InterfaceC1292eg0 b;
    private final InterfaceC1292eg0 c;
    private final InterfaceC1292eg0 d;
    private final InterfaceC1292eg0 e;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context != null) {
            C0767Yk c0767Yk = new C0767Yk(context);
            this.a = c0767Yk;
            adVar = ac.a;
            If0 b = If0.b(adVar);
            this.b = b;
            mVar = l.a;
            au auVar = new au(c0767Yk, mVar);
            this.c = auVar;
            mVar2 = l.a;
            If0 b2 = If0.b(new al(c0767Yk, b, auVar, mVar2));
            this.d = b2;
            this.e = If0.b(new ab(b2));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
