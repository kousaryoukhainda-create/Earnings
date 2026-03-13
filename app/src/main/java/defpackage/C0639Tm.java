package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
/* renamed from: Tm */
/* loaded from: classes.dex */
public final class C0639Tm {
    public final AudioTrack a;
    public final C1160d6 b;
    public C0613Sm c = new AudioRouting.OnRoutingChangedListener() { // from class: Sm
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C0639Tm.a(C0639Tm.this, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [Sm] */
    public C0639Tm(AudioTrack audioTrack, C1160d6 c1160d6) {
        this.a = audioTrack;
        this.b = c1160d6;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void a(C0639Tm c0639Tm, AudioRouting audioRouting) {
        c0639Tm.b(audioRouting);
    }

    public void b(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (this.c != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                C1160d6 c1160d6 = this.b;
                routedDevice2 = audioRouting.getRoutedDevice();
                c1160d6.b(routedDevice2);
            }
        }
    }

    public void c() {
        C0613Sm c0613Sm = this.c;
        c0613Sm.getClass();
        this.a.removeOnRoutingChangedListener(c0613Sm);
        this.c = null;
    }
}
