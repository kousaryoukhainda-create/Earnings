package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import io.flutter.embedding.android.KeyboardMap;
/* renamed from: JK  reason: default package */
/* loaded from: classes.dex */
public final class JK implements Handler.Callback {
    public final Handler b;
    public final /* synthetic */ KK c;

    public JK(KK kk, InterfaceC2235nK interfaceC2235nK) {
        this.c = kk;
        Handler n = Ha0.n(this);
        this.b = n;
        interfaceC2235nK.k(this, n);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        KK kk = this.c;
        if (this == kk.k1 && kk.M != null) {
            if (j == Long.MAX_VALUE) {
                kk.z0 = true;
                return;
            }
            try {
                kk.t0(j);
                kk.z0(kk.f1);
                kk.B0.e++;
                C2426pb0 c2426pb0 = kk.L0;
                if (c2426pb0.d != 3) {
                    z = true;
                } else {
                    z = false;
                }
                c2426pb0.d = 3;
                c2426pb0.k.getClass();
                c2426pb0.f = Ha0.M(SystemClock.elapsedRealtime());
                if (z && (surface = kk.T0) != null) {
                    C2475q6 c2475q6 = kk.I0;
                    Handler handler = c2475q6.b;
                    if (handler != null) {
                        handler.post(new RunnableC2630rx(c2475q6, surface, SystemClock.elapsedRealtime(), 1));
                    }
                    kk.W0 = true;
                }
                kk.b0(j);
            } catch (C0282Fs e) {
                kk.A0 = e;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = Ha0.a;
        a(((i & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & i2));
        return true;
    }
}
