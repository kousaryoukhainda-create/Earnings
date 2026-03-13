package defpackage;

import android.media.AudioTrack;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;
/* renamed from: Nm  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0483Nm {
    public static /* synthetic */ AudioTrack.Builder e() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ PlaybackParams k() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean z(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
