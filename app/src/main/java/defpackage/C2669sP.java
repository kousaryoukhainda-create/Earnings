package defpackage;

import android.os.Handler;
import android.os.Message;
import com.fyber.ads.ofw.OfferWallActivity;
/* renamed from: sP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2669sP implements Handler.Callback {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C2669sP(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.b) {
            case 0:
                int i = message.what;
                OfferWallActivity offerWallActivity = (OfferWallActivity) this.c;
                if (i != 2020) {
                    if (i != 2023) {
                        return false;
                    }
                    offerWallActivity.i.removeMessages(2020);
                }
                OfferWallActivity.a(offerWallActivity);
                return true;
            default:
                if (message.what != 0) {
                    return false;
                }
                C0811a00 c0811a00 = (C0811a00) this.c;
                T20 t20 = (T20) message.obj;
                synchronized (c0811a00.b) {
                    if (((T20) c0811a00.d) == t20 || ((T20) c0811a00.f) == t20) {
                        c0811a00.e(t20, 2);
                    }
                }
                return true;
        }
    }
}
