package defpackage;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.sdk.session.UserSessionTracker;
/* renamed from: va0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2939va0 implements SettableFuture.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserSessionTracker c;
    public final /* synthetic */ Constants.AdType d;

    public /* synthetic */ C2939va0(UserSessionTracker userSessionTracker, Constants.AdType adType, int i) {
        this.b = i;
        this.c = userSessionTracker;
        this.d = adType;
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture.Listener
    public final void onComplete(Object obj, Throwable th) {
        switch (this.b) {
            case 0:
                UserSessionTracker.a(this.c, this.d, (Boolean) obj, th);
                return;
            default:
                UserSessionTracker.b(this.c, this.d, (Boolean) obj, th);
                return;
        }
    }
}
