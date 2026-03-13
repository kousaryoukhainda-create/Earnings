package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class tg {
    public static List a(byte[] bArr) {
        long b = b(c(bArr));
        long b2 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b));
        arrayList.add(a(b2));
        return arrayList;
    }

    public static int b(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long b(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
