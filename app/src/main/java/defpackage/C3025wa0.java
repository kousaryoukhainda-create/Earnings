package defpackage;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.sdk.session.UserSessionTracker;
/* renamed from: wa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3025wa0 implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserSessionTracker c;

    public /* synthetic */ C3025wa0(UserSessionTracker userSessionTracker, int i) {
        this.b = i;
        this.c = userSessionTracker;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                UserSessionTracker.a(this.c, (Boolean) obj, th);
                return;
            default:
                UserSessionTracker.b(this.c, (Boolean) obj, th);
                return;
        }
    }
}
