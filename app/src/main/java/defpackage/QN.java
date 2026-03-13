package defpackage;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.concurrency.VerifiableSettableFuture;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
/* renamed from: QN  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class QN implements SettableFuture.Listener, VerifiableSettableFuture.b {
    public final /* synthetic */ NetworkAdapter b;

    @Override // com.fyber.fairbid.common.concurrency.VerifiableSettableFuture.b
    public Object a(Object obj) {
        return Boolean.valueOf(NetworkAdapter.a(this.b, ((Boolean) obj).booleanValue()));
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public void onComplete(Object obj, Throwable th) {
        NetworkAdapter.a(this.b, (Boolean) obj, th);
    }
}
