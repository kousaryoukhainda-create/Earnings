package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
/* loaded from: classes.dex */
public class l implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public l(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.a.finish();
    }
}
