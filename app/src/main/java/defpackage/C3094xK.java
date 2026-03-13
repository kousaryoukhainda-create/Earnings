package defpackage;

import androidx.media3.common.b;
/* renamed from: xK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3094xK extends Exception {
    public final String b;
    public final boolean c;
    public final C2750tK d;
    public final String f;

    public C3094xK(b bVar, DK dk, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + bVar, dk, bVar.m, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C3094xK(String str, Throwable th, String str2, boolean z, C2750tK c2750tK, String str3) {
        super(str, th);
        this.b = str2;
        this.c = z;
        this.d = c2750tK;
        this.f = str3;
    }
}
