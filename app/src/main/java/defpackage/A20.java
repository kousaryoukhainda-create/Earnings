package defpackage;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
/* renamed from: A20  reason: default package */
/* loaded from: classes2.dex */
public final class A20 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ B20 d;

    public /* synthetic */ A20(B20 b20, String str, int i) {
        this.b = i;
        this.d = b20;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("data", this.c);
                hashMap.put("error", null);
                MethodChannel methodChannel = this.d.a.b;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("shortLinkCallbackName", hashMap);
                    return;
                }
                return;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("data", null);
                hashMap2.put("error", this.c);
                MethodChannel methodChannel2 = this.d.a.b;
                if (methodChannel2 != null) {
                    methodChannel2.invokeMethod("shortLinkCallbackName", hashMap2);
                    return;
                }
                return;
        }
    }
}
