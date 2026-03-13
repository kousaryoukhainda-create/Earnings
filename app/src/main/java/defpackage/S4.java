package defpackage;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;
/* renamed from: S4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class S4 implements Executor {
    public final /* synthetic */ int b;

    public /* synthetic */ S4(int i) {
        this.b = i;
    }

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                T4.a0().k.l.execute(runnable);
                return;
            case 1:
                return;
            case 2:
                runnable.run();
                return;
            default:
                AppLovinSdkUtils.runOnUiThread(runnable);
                return;
        }
    }
}
