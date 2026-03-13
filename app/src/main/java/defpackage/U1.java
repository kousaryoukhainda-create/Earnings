package defpackage;

import com.fyber.fairbid.af;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.mediation.NetworkResult;
/* renamed from: U1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class U1 implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ SettableFuture c;

    public /* synthetic */ U1(SettableFuture settableFuture, int i) {
        this.b = i;
        this.c = settableFuture;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                String str = (String) obj;
                this.c.set(Boolean.valueOf(r2 == null));
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                this.c.set(Boolean.valueOf(Boolean.TRUE == r2 && r3 == null));
                return;
            default:
                af.a(this.c, (NetworkResult) obj, th);
                return;
        }
    }
}
