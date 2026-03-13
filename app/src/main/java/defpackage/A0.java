package defpackage;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
/* renamed from: A0  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class A0 {
    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* bridge */ /* synthetic */ int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder h(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder i(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder k(AudioFocusRequest.Builder builder, boolean z) {
        return builder.setWillPauseWhenDucked(z);
    }

    public static /* synthetic */ AudioFocusRequest.Builder l(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest m(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ void v(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }
}
