package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
/* renamed from: d6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160d6 {
    public final Context a;
    public final V1 b;
    public final Handler c;
    public final C0913b6 d;
    public final C2381p2 e;
    public final C0998c6 f;
    public Z5 g;
    public C1245e6 h;
    public S5 i;
    public boolean j;

    public C1160d6(Context context, V1 v1, S5 s5, C1245e6 c1245e6) {
        C0913b6 c0913b6;
        C2381p2 c2381p2;
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = v1;
        this.i = s5;
        this.h = c1245e6;
        int i = Ha0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.c = handler;
        int i2 = Ha0.a;
        if (i2 >= 23) {
            c0913b6 = new C0913b6(this);
        } else {
            c0913b6 = null;
        }
        this.d = c0913b6;
        if (i2 >= 21) {
            c2381p2 = new C2381p2(this, 1);
        } else {
            c2381p2 = null;
        }
        this.e = c2381p2;
        Z5 z5 = Z5.c;
        String str = Ha0.c;
        if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f = uriFor != null ? new C0998c6(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(Z5 z5) {
        C0278Fo c0278Fo;
        String name;
        String name2;
        if (this.j && !z5.equals(this.g)) {
            this.g = z5;
            C0743Xm c0743Xm = (C0743Xm) this.b.c;
            c0743Xm.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = c0743Xm.i0;
            if (looper != myLooper) {
                if (looper == null) {
                    name = "null";
                } else {
                    name = looper.getThread().getName();
                }
                if (myLooper == null) {
                    name2 = "null";
                } else {
                    name2 = myLooper.getThread().getName();
                }
                throw new IllegalStateException(AbstractC2437ph.j("Current looper (", name2, ") is not the playback looper (", name, ")"));
            } else if (!z5.equals(c0743Xm.x)) {
                c0743Xm.x = z5;
                C2407pK c2407pK = c0743Xm.s;
                if (c2407pK != null) {
                    C2493qK c2493qK = (C2493qK) c2407pK.c;
                    synchronized (c2493qK.b) {
                        c0278Fo = c2493qK.s;
                    }
                    if (c0278Fo != null) {
                        c0278Fo.g();
                    }
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        C1245e6 c1245e6 = this.h;
        C1245e6 c1245e62 = null;
        if (c1245e6 == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = c1245e6.a;
        }
        if (Ha0.a(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            c1245e62 = new C1245e6(audioDeviceInfo);
        }
        this.h = c1245e62;
        a(Z5.b(this.a, this.i, c1245e62));
    }
}
