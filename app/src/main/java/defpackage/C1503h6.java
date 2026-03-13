package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
/* renamed from: h6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503h6 {
    public final AudioManager a;
    public final C1417g6 b;
    public SurfaceHolder$CallbackC0619Ss c;
    public S5 d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public C1503h6(Context context, Handler handler, SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = surfaceHolder$CallbackC0619Ss;
        this.b = new C1417g6(this, handler);
        this.e = 0;
    }

    public final void a() {
        int i = this.e;
        if (i != 1 && i != 0) {
            int i2 = Ha0.a;
            AudioManager audioManager = this.a;
            if (i2 >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this.b);
        }
    }

    public final void b(S5 s5) {
        int i;
        if (!Ha0.a(this.d, s5)) {
            this.d = s5;
            boolean z = false;
            if (s5 == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f = i;
            B10.i("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", (i == 1 || i == 0) ? true : true);
        }
    }

    public final void c(int i) {
        float f;
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (i == 4) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.g == f) {
            return;
        }
        this.g = f;
        SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss = this.c;
        if (surfaceHolder$CallbackC0619Ss != null) {
            C0697Vs c0697Vs = surfaceHolder$CallbackC0619Ss.b;
            c0697Vs.w(1, 2, Float.valueOf(c0697Vs.V * c0697Vs.y.g));
        }
    }

    public final int d(int i, boolean z) {
        int requestAudioFocus;
        AudioFocusRequest.Builder l;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        boolean z2 = false;
        if (i != 1 && this.f == 1) {
            if (z) {
                if (this.e == 2) {
                    return 1;
                }
                int i2 = Ha0.a;
                AudioManager audioManager = this.a;
                C1417g6 c1417g6 = this.b;
                if (i2 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            A0.s();
                            l = A0.h(this.f);
                        } else {
                            A0.s();
                            l = A0.l(this.h);
                        }
                        S5 s5 = this.d;
                        if (s5 != null && s5.a == 1) {
                            z2 = true;
                        }
                        s5.getClass();
                        audioAttributes = l.setAudioAttributes((AudioAttributes) s5.a().c);
                        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z2);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c1417g6);
                        build = onAudioFocusChangeListener.build();
                        this.h = build;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.h);
                } else {
                    this.d.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(c1417g6, 3, this.f);
                }
                if (requestAudioFocus == 1) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
            int i3 = this.e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 != 3) {
                return 1;
            }
            return 0;
        }
        a();
        c(0);
        return 1;
    }
}
