package defpackage;

import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.qh;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: wL  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3009wL implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ InterfaceC0263Ez c;

    public /* synthetic */ RunnableC3009wL(InterfaceC0263Ez interfaceC0263Ez, int i) {
        this.b = i;
        this.c = interfaceC0263Ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                MediationManager.b(this.c);
                return;
            case 1:
                qh.b(this.c);
                return;
            case 2:
                InterfaceC0263Ez tmp0 = this.c;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                return;
            default:
                InterfaceC0263Ez tmp02 = this.c;
                Intrinsics.checkNotNullParameter(tmp02, "$tmp0");
                tmp02.invoke();
                return;
        }
    }
}
