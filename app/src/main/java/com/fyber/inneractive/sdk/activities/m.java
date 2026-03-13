package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class m implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public m(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.a("Error: video can not be played.", new Object[0]);
        this.a.finish();
        return false;
    }
}
