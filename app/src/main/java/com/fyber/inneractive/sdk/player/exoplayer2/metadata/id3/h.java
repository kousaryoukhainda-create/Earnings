package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.a;
/* loaded from: classes.dex */
public abstract class h implements a.b {
    public final String a;

    public h(String str) {
        this.a = (String) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
