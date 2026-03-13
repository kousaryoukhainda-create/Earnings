package com.applovin.impl;

import com.applovin.impl.e9;
import com.applovin.impl.fr;
import com.applovin.impl.gl;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class er extends gl {
    private a n;
    private int o;
    private boolean p;
    private fr.d q;
    private fr.b r;

    /* loaded from: classes.dex */
    public static final class a {
        public final fr.d a;
        public final fr.b b;
        public final byte[] c;
        public final fr.c[] d;
        public final int e;

        public a(fr.d dVar, fr.b bVar, byte[] bArr, fr.c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    public static int a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public a b(ah ahVar) {
        fr.d dVar = this.q;
        if (dVar == null) {
            this.q = fr.b(ahVar);
            return null;
        }
        fr.b bVar = this.r;
        if (bVar == null) {
            this.r = fr.a(ahVar);
            return null;
        }
        byte[] bArr = new byte[ahVar.e()];
        System.arraycopy(ahVar.c(), 0, bArr, 0, ahVar.e());
        fr.c[] a2 = fr.a(ahVar, dVar.b);
        return new a(dVar, bVar, bArr, a2, fr.a(a2.length - 1));
    }

    @Override // com.applovin.impl.gl
    public void c(long j) {
        super.c(j);
        this.p = j != 0;
        fr.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    public static void a(ah ahVar, long j) {
        if (ahVar.b() < ahVar.e() + 4) {
            ahVar.a(Arrays.copyOf(ahVar.c(), ahVar.e() + 4));
        } else {
            ahVar.e(ahVar.e() + 4);
        }
        byte[] c = ahVar.c();
        c[ahVar.e() - 4] = (byte) (j & 255);
        c[ahVar.e() - 3] = (byte) ((j >>> 8) & 255);
        c[ahVar.e() - 2] = (byte) ((j >>> 16) & 255);
        c[ahVar.e() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static boolean c(ah ahVar) {
        try {
            return fr.a(1, ahVar, true);
        } catch (ch unused) {
            return false;
        }
    }

    private static int a(byte b, a aVar) {
        if (!aVar.d[a(b, aVar.e, 1)].a) {
            return aVar.a.g;
        }
        return aVar.a.h;
    }

    @Override // com.applovin.impl.gl
    public long a(ah ahVar) {
        if ((ahVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int a2 = a(ahVar.c()[0], (a) b1.b(this.n));
        long j = this.p ? (this.o + a2) / 4 : 0;
        a(ahVar, j);
        this.p = true;
        this.o = a2;
        return j;
    }

    @Override // com.applovin.impl.gl
    public boolean a(ah ahVar, long j, gl.b bVar) {
        if (this.n != null) {
            b1.a(bVar.a);
            return false;
        }
        a b = b(ahVar);
        this.n = b;
        if (b == null) {
            return true;
        }
        fr.d dVar = b.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(b.c);
        bVar.a = new e9.b().f("audio/vorbis").b(dVar.e).k(dVar.d).c(dVar.b).n(dVar.c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.gl
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
