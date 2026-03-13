package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.sb;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor;
/* renamed from: Ex  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0261Ex implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC0261Ex(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.b = i;
        this.d = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((FlutterFirebaseMessagingBackgroundExecutor) this.d).lambda$startBackgroundIsolate$1((FlutterLoader) this.f, (Handler) this.g, (FlutterShellArgs) this.h, this.c);
                return;
            default:
                ((sb) this.d).a((Context) this.f, (ViewGroup) this.g, (AppLovinFullscreenAdViewObserver) this.h, this.c);
                return;
        }
    }
}
