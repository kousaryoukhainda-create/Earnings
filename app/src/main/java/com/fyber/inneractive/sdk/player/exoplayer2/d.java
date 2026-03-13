package com.fyber.inneractive.sdk.player.exoplayer2;
/* loaded from: classes.dex */
public final class d extends Exception {
    public d(int i, String str, Throwable th, int i2) {
        super(null, th);
    }

    public static d a(Exception exc, int i) {
        return new d(1, null, exc, i);
    }
}
