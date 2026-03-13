package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
/* renamed from: D20  reason: default package */
/* loaded from: classes2.dex */
public final class D20 extends HandlerThread {
    public Handler b;

    public final Handler a() {
        synchronized (this) {
            if (this.b == null) {
                this.b = new Handler(getLooper());
            }
        }
        return this.b;
    }
}
