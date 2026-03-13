package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: tK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2750tK {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public C2750tK(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = UM.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Ha0.g(i, widthAlignment) * widthAlignment, Ha0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ("Nexus 10".equals(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C2750tK h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            tK r13 = new tK
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = defpackage.Ha0.a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = defpackage.Ha0.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = 1
            goto L3a
        L39:
            r6 = 0
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = defpackage.Ha0.a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = defpackage.Ha0.a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = 0
            goto L5c
        L5b:
            r7 = 1
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2750tK.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):tK");
    }

    public final C3306zm b(b bVar, b bVar2) {
        int i;
        int i2;
        if (!Ha0.a(bVar.m, bVar2.m)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.h) {
            if (bVar.v != bVar2.v) {
                i |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.e && (bVar.s != bVar2.s || bVar.t != bVar2.t)) {
                i |= 512;
            }
            C0605Se c0605Se = bVar.z;
            boolean e = C0605Se.e(c0605Se);
            C0605Se c0605Se2 = bVar2.z;
            if ((!e || !C0605Se.e(c0605Se2)) && !Ha0.a(c0605Se, c0605Se2)) {
                i |= 2048;
            }
            if (Ha0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !bVar.c(bVar2)) {
                i |= 2;
            }
            if (i == 0) {
                if (bVar.c(bVar2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new C3306zm(this.a, bVar, bVar2, i2, 0);
            }
        } else {
            if (bVar.A != bVar2.A) {
                i |= 4096;
            }
            if (bVar.B != bVar2.B) {
                i |= 8192;
            }
            if (bVar.C != bVar2.C) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d = GK.d(bVar);
                Pair d2 = GK.d(bVar2);
                if (d != null && d2 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C3306zm(this.a, bVar, bVar2, 3, 0);
                    }
                }
            }
            if (!bVar.c(bVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C3306zm(this.a, bVar, bVar2, 1, 0);
            }
        }
        return new C3306zm(this.a, bVar, bVar2, 0, i);
    }

    public final boolean c(b bVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = GK.d(bVar);
        if (d == null) {
            return true;
        }
        int intValue = ((Integer) d.first).intValue();
        int intValue2 = ((Integer) d.second).intValue();
        boolean equals = "video/dolby-vision".equals(bVar.m);
        int i2 = 8;
        String str = this.b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (Ha0.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i = 0;
            }
            if (i >= 180000000) {
                i2 = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i >= 120000000) {
                i2 = 512;
            } else if (i >= 60000000) {
                i2 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else if (i >= 30000000) {
                i2 = UserVerificationMethods.USER_VERIFY_PATTERN;
            } else if (i >= 18000000) {
                i2 = 64;
            } else if (i >= 12000000) {
                i2 = 32;
            } else if (i >= 7200000) {
                i2 = 16;
            } else if (i < 3600000) {
                if (i >= 1800000) {
                    i2 = 4;
                } else if (i >= 800000) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i2;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = Ha0.b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + bVar.j + ", " + this.c);
        return false;
    }

    public final boolean d(b bVar) {
        boolean z;
        int i;
        int i2;
        String str = bVar.m;
        String str2 = this.b;
        boolean z2 = true;
        if (!str2.equals(str) && !str2.equals(GK.b(bVar))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !c(bVar, true)) {
            return false;
        }
        if (this.h) {
            int i3 = bVar.s;
            if (i3 > 0 && (i2 = bVar.t) > 0) {
                if (Ha0.a >= 21) {
                    return f(i3, i2, bVar.u);
                }
                if (i3 * i2 > GK.j()) {
                    z2 = false;
                }
                if (!z2) {
                    g("legacyFrameSize, " + i3 + "x" + i2);
                }
            }
            return z2;
        }
        int i4 = Ha0.a;
        if (i4 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i5 = bVar.B;
        if (i5 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i5)) {
                    g("sampleRate.support, " + i5);
                }
            }
            return false;
        }
        int i6 = bVar.A;
        if (i6 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i = 16;
                    } else {
                        i = 30;
                    }
                    Wh0.o0("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount >= i6) {
                    return true;
                }
                g("channelCount.support, " + i6);
            }
        }
        return false;
    }

    public final boolean e(b bVar) {
        if (this.h) {
            return this.e;
        }
        Pair d = GK.d(bVar);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i, int i2, double d) {
        int i3;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i4 = Ha0.a;
        if (i4 >= 29) {
            if (i4 >= 29 && ((bool = AbstractC1424g90.o) == null || !bool.booleanValue())) {
                i3 = AbstractC2836uK.a(videoCapabilities, i, i2, d);
            } else {
                i3 = 0;
            }
            if (i3 == 2) {
                return true;
            }
            if (i3 == 1) {
                StringBuilder n = AbstractC2437ph.n("sizeAndRate.cover, ", i, "x", i2, "@");
                n.append(d);
                g(n.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Ha0.b)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder n2 = AbstractC2437ph.n("sizeAndRate.rotated, ", i, "x", i2, "@");
                    n2.append(d);
                    StringBuilder q = BK.q("AssumedSupport [", n2.toString(), "] [", str, ", ");
                    q.append(this.b);
                    q.append("] [");
                    q.append(Ha0.e);
                    q.append("]");
                    Wh0.v("MediaCodecInfo", q.toString());
                }
            }
            StringBuilder n3 = AbstractC2437ph.n("sizeAndRate.support, ", i, "x", i2, "@");
            n3.append(d);
            g(n3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder m = AbstractC0324Hi.m("NoSupport [", str, "] [");
        m.append(this.a);
        m.append(", ");
        m.append(this.b);
        m.append("] [");
        m.append(Ha0.e);
        m.append("]");
        Wh0.v("MediaCodecInfo", m.toString());
    }

    public final String toString() {
        return this.a;
    }
}
