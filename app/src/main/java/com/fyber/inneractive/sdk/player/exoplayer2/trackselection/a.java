package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class a implements e {
    public final r a;
    public final int b;
    public final int[] c;
    public final i[] d;
    public final long[] e;
    public int f;

    /* loaded from: classes.dex */
    public static final class b implements Comparator<i> {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            return iVar2.b - iVar.b;
        }
    }

    public a(r rVar, int... iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z);
        this.a = (r) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(rVar);
        int length = iArr.length;
        this.b = length;
        this.d = new i[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = rVar.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = rVar.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final i a(int i) {
        return this.d[i];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final r b() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && Arrays.equals(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int f() {
        return this.c.length;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    public final int a(i iVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == iVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int b(int i) {
        return this.c[i];
    }

    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final i c() {
        return this.d[e()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int a() {
        return this.c[e()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b2 = b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !b2) {
            b2 = (i2 == i || b(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (b2) {
            long[] jArr = this.e;
            jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
            return true;
        }
        return false;
    }
}
