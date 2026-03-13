package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: KG  reason: default package */
/* loaded from: classes.dex */
public abstract class KG extends Service implements HG {
    public final YZ b;

    /* JADX WARN: Type inference failed for: r0v0, types: [YZ, java.lang.Object] */
    public KG() {
        Intrinsics.checkNotNullParameter(this, "provider");
        ?? obj = new Object();
        obj.b = new JG(this);
        obj.c = new Handler();
        this.b = obj;
    }

    @Override // defpackage.HG
    public final CG getLifecycle() {
        return (JG) this.b.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.b.G(AG.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.b.G(AG.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AG ag = AG.ON_STOP;
        YZ yz = this.b;
        yz.G(ag);
        yz.G(AG.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.b.G(AG.ON_START);
        super.onStart(intent, i);
    }
}
