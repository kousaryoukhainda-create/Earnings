package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public j(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    public boolean a(int i) {
        if ((this.g & i) == i) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.a);
        sb.append(", ");
        sb.append(Arrays.toString(this.b));
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        return AbstractC2437ph.k(sb, this.g, "]");
    }

    public j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, null, i);
    }

    public j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j >= 0);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j2 >= 0);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a((j3 > 0 || j3 == -1) ? true : true);
        this.a = uri;
        this.b = null;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }
}
