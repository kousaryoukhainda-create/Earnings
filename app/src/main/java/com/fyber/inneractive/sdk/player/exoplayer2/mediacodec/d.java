package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class d {
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final Map<String, Integer> f;
    public static final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a("OMX.google.raw.decoder", null, null, false);
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<a, List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a>> c = new HashMap<>();
    public static int g = -1;

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            if (this.b) {
                i = 1231;
            } else {
                i = 1237;
            }
            return i2 + i;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        public b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095d implements c {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* loaded from: classes.dex */
    public static final class e implements c {
        public final int a;
        public MediaCodecInfo[] b;

        public e(boolean z) {
            this.a = z ? 1 : 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public boolean b() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public int a() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b.length;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.c
        public MediaCodecInfo a(int i) {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b[i];
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, UserVerificationMethods.USER_VERIFY_PATTERN);
        sparseIntArray2.put(30, UserVerificationMethods.USER_VERIFY_HANDPRINT);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, UserVerificationMethods.USER_VERIFY_ALL);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f = hashMap;
        AbstractC0324Hi.t(1, hashMap, "L30", 4, "L60");
        AbstractC0324Hi.t(16, hashMap, "L63", 64, "L90");
        AbstractC0324Hi.t(UserVerificationMethods.USER_VERIFY_HANDPRINT, hashMap, "L93", UserVerificationMethods.USER_VERIFY_ALL, "L120");
        AbstractC0324Hi.t(4096, hashMap, "L123", 16384, "L150");
        AbstractC0324Hi.t(65536, hashMap, "L153", 262144, "L156");
        AbstractC0324Hi.t(1048576, hashMap, "L180", 4194304, "L183");
        AbstractC0324Hi.t(16777216, hashMap, "L186", 2, "H30");
        AbstractC0324Hi.t(8, hashMap, "H60", 32, "H63");
        AbstractC0324Hi.t(UserVerificationMethods.USER_VERIFY_PATTERN, hashMap, "H90", 512, "H93");
        AbstractC0324Hi.t(2048, hashMap, "H120", 8192, "H123");
        AbstractC0324Hi.t(32768, hashMap, "H150", 131072, "H153");
        AbstractC0324Hi.t(524288, hashMap, "H156", 2097152, "H180");
        AbstractC0324Hi.t(8388608, hashMap, "H183", 33554432, "H186");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(String str, boolean z) throws b {
        List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> list;
        c c0095d;
        synchronized (d.class) {
            try {
                a aVar = new a(str, z);
                list = c.get(aVar);
                if (list == null) {
                    int i = u.a;
                    if (i >= 21) {
                        c0095d = new e(z);
                    } else {
                        c0095d = new C0095d();
                    }
                    List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> a2 = a(aVar, c0095d);
                    if (z && ((ArrayList) a2).isEmpty() && 21 <= i && i <= 23) {
                        a2 = a(aVar, new C0095d());
                        ArrayList arrayList = (ArrayList) a2;
                        if (!arrayList.isEmpty()) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a) arrayList.get(0)).a);
                        }
                    }
                    if (i < 26) {
                        int i2 = 1;
                        if (a2.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(a2.get(0).a)) {
                            while (true) {
                                if (i2 >= a2.size()) {
                                    break;
                                }
                                com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar2 = a2.get(i2);
                                if ("OMX.google.raw.decoder".equals(aVar2.a)) {
                                    a2.remove(i2);
                                    a2.add(0, aVar2);
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    list = Collections.unmodifiableList(a2);
                    c.put(aVar, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int a() throws b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (g == -1) {
            int i2 = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a2 = a("video/avc", false);
            if (a2 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = a2.e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, u.a >= 21 ? 345600 : 172800);
            }
            g = i2;
        }
        return g;
    }

    public static List<com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a> a(a aVar, c cVar) throws b {
        boolean z;
        c cVar2 = cVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = aVar.a;
            int a2 = cVar.a();
            boolean b2 = cVar.b();
            int i = 0;
            while (i < a2) {
                MediaCodecInfo a3 = cVar2.a(i);
                String name = a3.getName();
                if (a(a3, name, b2)) {
                    String[] supportedTypes = a3.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = a3.getCapabilitiesForType(str2);
                                boolean a4 = cVar2.a(str, capabilitiesForType);
                                if (u.a <= 22) {
                                    String str3 = u.d;
                                    if (!str3.equals("ODROID-XU3")) {
                                        if (str3.equals("Nexus 10")) {
                                        }
                                    }
                                    if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                        z = true;
                                        if ((!b2 && aVar.b == a4) || (!b2 && !aVar.b)) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name, str, capabilitiesForType, z));
                                        } else if (!b2 && a4) {
                                            arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z));
                                            return arrayList;
                                        }
                                    }
                                }
                                z = false;
                                if (!b2) {
                                }
                                if (!b2) {
                                    arrayList.add(new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a(name + ".secure", str, capabilitiesForType, z));
                                    return arrayList;
                                }
                                continue;
                            } catch (Exception e2) {
                                if (u.a <= 23 && !arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e2;
                                }
                            }
                        }
                        i2++;
                        cVar2 = cVar;
                    }
                    continue;
                }
                i++;
                cVar2 = cVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new b(e3);
        }
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = u.a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i >= 18 || !"OMX.SEC.MP3.Decoder".equals(str)) {
                if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(u.b)) {
                    return false;
                }
                if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str2 = u.b;
                    if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str3 = u.b;
                    if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                        return false;
                    }
                }
                if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(u.c)) {
                    String str4 = u.b;
                    if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                        return false;
                    }
                }
                return (i <= 19 && u.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }
}
