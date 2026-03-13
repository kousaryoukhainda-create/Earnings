package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
/* loaded from: classes.dex */
public final class a {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public final MediaCodec.CryptoInfo g;
    public final b h;

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = AbstractC3150y0.g();
        }
    }

    public a() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i = u.a;
        if (i >= 16) {
            cryptoInfo = a();
        } else {
            cryptoInfo = null;
        }
        this.g = cryptoInfo;
        this.h = i >= 24 ? new b(cryptoInfo) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return new MediaCodec.CryptoInfo();
    }
}
