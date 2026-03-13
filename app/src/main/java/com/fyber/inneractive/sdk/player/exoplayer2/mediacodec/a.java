package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
@TargetApi(16)
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        this.a = (String) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
        this.d = str2;
        this.e = codecCapabilities;
        boolean z3 = false;
        if (!z && codecCapabilities != null && a(codecCapabilities)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (codecCapabilities != null && b(codecCapabilities)) {
            z3 = true;
        }
        this.c = z3;
    }

    public static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (u.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            return true;
        }
        return false;
    }

    @TargetApi(21)
    public boolean a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && a(videoCapabilities, i2, i, d)) {
                StringBuilder n = AbstractC2437ph.n("sizeAndRate.rotated, ", i, "x", i2, "x");
                n.append(d);
                StringBuilder m = AbstractC0324Hi.m("AssumedSupport [", n.toString(), "] [");
                m.append(this.a);
                m.append(", ");
                m.append(this.d);
                m.append("] [");
                m.append(u.e);
                m.append("]");
                Log.d("MediaCodecInfo", m.toString());
                return true;
            }
            StringBuilder n2 = AbstractC2437ph.n("sizeAndRate.support, ", i, "x", i2, "x");
            n2.append(d);
            a(n2.toString());
            return false;
        }
    }

    public final void a(String str) {
        StringBuilder m = AbstractC0324Hi.m("NoSupport [", str, "] [");
        m.append(this.a);
        m.append(", ");
        m.append(this.d);
        m.append("] [");
        m.append(u.e);
        m.append("]");
        Log.d("MediaCodecInfo", m.toString());
    }

    public static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return u.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d != -1.0d && d > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i, i2, d);
        }
        return videoCapabilities.isSizeSupported(i, i2);
    }
}
