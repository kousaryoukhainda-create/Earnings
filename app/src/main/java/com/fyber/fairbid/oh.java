package com.fyber.fairbid;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fyber.fairbid.common.lifecycle.FetchFailure;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.sdk.testsuite.bus.EventBus;
import com.fyber.fairbid.sm;
import java.util.Observable;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public class oh extends Observable {
    public static final e9 e = e9.a();
    public final eb a;
    public final af b;
    public boolean c;
    public boolean d;

    public oh(eb ebVar, af afVar) {
        this.a = ebVar;
        this.b = afVar;
        a();
    }

    public final void a() {
        boolean z = this.d;
        af afVar = this.b;
        eb placementData = this.a;
        afVar.getClass();
        Intrinsics.checkNotNullParameter(placementData, "placementData");
        Constants.AdType adType = placementData.c;
        boolean isReady = adType == Constants.AdType.BANNER ? true : afVar.a.isReady(adType, placementData.b);
        this.d = isReady;
        if (isReady != z) {
            setChanged();
            super.notifyObservers();
        }
    }

    @Override // java.util.Observable
    public final void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }

    public static void a(@NonNull sm.b bVar, eb ebVar) {
        if (EventBus.hasReceivers(16)) {
            sm.d dVar = new sm.d(bVar, ebVar.c, ebVar.a, ebVar.b);
            Handler handler = EventBus.eventBusMainThread;
            Message obtainMessage = handler.obtainMessage(16);
            obtainMessage.obj = dVar;
            handler.sendMessage(obtainMessage);
        }
    }

    public final void a(@NonNull FetchFailure fetchFailure) {
        Handler handler = EventBus.eventBusMainThread;
        Message obtainMessage = handler.obtainMessage(9);
        obtainMessage.obj = new JQ(this.a.b, fetchFailure);
        handler.sendMessage(obtainMessage);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Unknown error";
        }
        Handler handler = EventBus.eventBusMainThread;
        Message obtainMessage = handler.obtainMessage(11);
        obtainMessage.obj = new JQ(this.a.b, str);
        handler.sendMessage(obtainMessage);
    }
}
