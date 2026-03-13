package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class jd {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final boolean k;

    public jd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = (String) b1.a((Object) str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = hf.i(str2);
    }

    private static int a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((xp.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder j = AbstractC0324Hi.j(i, "AssumedMaxChannelAdjustment: ", str, ", [", " to ");
        j.append(i2);
        j.append("]");
        oc.d("MediaCodecInfo", j.toString());
        return i2;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.a >= 21 && e(codecCapabilities);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            b(AbstractC0324Hi.e(i, "sampleRate.support, "));
            return false;
        }
    }

    public String toString() {
        return this.a;
    }

    private static boolean d(String str) {
        return xp.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        if (xp.a <= 22) {
            String str2 = xp.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(xp.b)) ? false : true;
    }

    public boolean c(e9 e9Var) {
        if (this.k) {
            return this.e;
        }
        Pair a = md.a(e9Var);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    private static boolean c(String str) {
        return "audio/opus".equals(str);
    }

    public boolean b(e9 e9Var) {
        int i;
        if (a(e9Var)) {
            if (this.k) {
                int i2 = e9Var.r;
                if (i2 <= 0 || (i = e9Var.s) <= 0) {
                    return true;
                }
                if (xp.a >= 21) {
                    return a(i2, i, e9Var.t);
                }
                boolean z = i2 * i <= md.b();
                if (!z) {
                    b("legacyFrameSize, " + e9Var.r + "x" + e9Var.s);
                }
                return z;
            }
            if (xp.a >= 21) {
                int i3 = e9Var.A;
                if (i3 != -1 && !b(i3)) {
                    return false;
                }
                int i4 = e9Var.z;
                if (i4 != -1 && !a(i4)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i, i2);
    }

    public boolean b() {
        if (xp.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(xp.a(i, widthAlignment) * widthAlignment, xp.a(i2, heightAlignment) * heightAlignment);
    }

    private void b(String str) {
        StringBuilder m = AbstractC0324Hi.m("NoSupport [", str, "] [");
        m.append(this.a);
        m.append(", ");
        m.append(this.b);
        m.append("] [");
        m.append(xp.e);
        m.append("]");
        oc.a("MediaCodecInfo", m.toString());
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return xp.a >= 19 && c(codecCapabilities);
    }

    public p5 a(e9 e9Var, e9 e9Var2) {
        int i = !xp.a((Object) e9Var.m, (Object) e9Var2.m) ? 8 : 0;
        if (this.k) {
            if (e9Var.u != e9Var2.u) {
                i |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.e && (e9Var.r != e9Var2.r || e9Var.s != e9Var2.s)) {
                i |= 512;
            }
            if (!xp.a(e9Var.y, e9Var2.y)) {
                i |= 2048;
            }
            if (d(this.a) && !e9Var.a(e9Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new p5(this.a, e9Var, e9Var2, e9Var.a(e9Var2) ? 3 : 2, 0);
            }
        } else {
            if (e9Var.z != e9Var2.z) {
                i |= 4096;
            }
            if (e9Var.A != e9Var2.A) {
                i |= 8192;
            }
            if (e9Var.B != e9Var2.B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair a = md.a(e9Var);
                Pair a2 = md.a(e9Var2);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new p5(this.a, e9Var, e9Var2, 3, 0);
                    }
                }
            }
            if (!e9Var.a(e9Var2)) {
                i |= 32;
            }
            if (c(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new p5(this.a, e9Var, e9Var2, 1, 0);
            }
        }
        return new p5(this.a, e9Var, e9Var2, 0, i);
    }

    private static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i = intValue >= 180000000 ? UserVerificationMethods.USER_VERIFY_ALL : intValue >= 120000000 ? 512 : intValue >= 60000000 ? UserVerificationMethods.USER_VERIFY_HANDPRINT : intValue >= 30000000 ? UserVerificationMethods.USER_VERIFY_PATTERN : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        } else if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) < i) {
            b(AbstractC0324Hi.e(i, "channelCount.support, "));
            return false;
        } else {
            return true;
        }
    }

    public boolean a(e9 e9Var) {
        String b;
        String str = e9Var.j;
        if (str == null || this.b == null || (b = hf.b(str)) == null) {
            return true;
        }
        if (!this.b.equals(b)) {
            b(BK.o(new StringBuilder("codec.mime "), e9Var.j, ", ", b));
            return false;
        }
        Pair a = md.a(e9Var);
        if (a == null) {
            return true;
        }
        int intValue = ((Integer) a.first).intValue();
        int intValue2 = ((Integer) a.second).intValue();
        if (this.k || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] a2 = a();
            if (xp.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && a2.length == 0) {
                a2 = a(this.d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a2) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            b(BK.o(new StringBuilder("codec.profileLevel, "), e9Var.j, ", ", b));
            return false;
        }
        return true;
    }

    public boolean a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        } else if (a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && f(this.a) && a(videoCapabilities, i2, i, d)) {
                StringBuilder n = AbstractC2437ph.n("sizeAndRate.rotated, ", i, "x", i2, "x");
                n.append(d);
                a(n.toString());
                return true;
            }
            StringBuilder n2 = AbstractC2437ph.n("sizeAndRate.support, ", i, "x", i2, "x");
            n2.append(d);
            b(n2.toString());
            return false;
        }
    }

    public static jd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new jd(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !b(codecCapabilities) || e(str)) ? false : true, codecCapabilities != null && f(codecCapabilities), z5 || (codecCapabilities != null && d(codecCapabilities)));
    }

    private void a(String str) {
        StringBuilder m = AbstractC0324Hi.m("AssumedSupport [", str, "] [");
        m.append(this.a);
        m.append(", ");
        m.append(this.b);
        m.append("] [");
        m.append(xp.e);
        m.append("]");
        oc.a("MediaCodecInfo", m.toString());
    }
}
