package defpackage;

import android.content.Intent;
import com.fyber.fairbid.h6;
/* renamed from: tP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2755tP extends h6 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2755tP(Class[] clsArr, int i) {
        super(clsArr);
        this.d = i;
    }

    @Override // com.fyber.fairbid.h6
    public final void a(Object obj) {
        switch (this.d) {
            case 0:
                Void r2 = (Void) obj;
                return;
            default:
                ((InterfaceC2685sc0) this.b).onError((C2771tc0) obj);
                return;
        }
    }

    @Override // com.fyber.fairbid.h6
    public final void b(Object obj) {
        switch (this.d) {
            case 0:
                ((InterfaceC2247nW) this.b).onAdAvailable((Intent) obj);
                return;
            default:
                ((InterfaceC2685sc0) this.b).onSuccess((C2857uc0) obj);
                return;
        }
    }
}
