package com.applovin.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rd {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, r3 r3Var) {
        if (r3Var != null) {
            a(mediaFormat, "color-transfer", r3Var.c);
            a(mediaFormat, "color-standard", r3Var.a);
            a(mediaFormat, "color-range", r3Var.b);
            a(mediaFormat, "hdr-static-info", r3Var.d);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void a(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0324Hi.e(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
