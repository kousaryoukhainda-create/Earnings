package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class c {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final k c;
    public final a.C0089a[] d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e e;
    public final r f;
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> g;
    public boolean h;
    public byte[] i;
    public IOException j;
    public a.C0089a k;
    public Uri l;
    public byte[] m;
    public String n;
    public byte[] o;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e p;

    /* loaded from: classes.dex */
    public static final class a extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c {
        public final String l;
        public byte[] m;

        public a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i, obj, bArr);
            this.l = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a a;
        public boolean b;
        public a.C0089a c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0088c extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a {
        public int g;

        public C0088c(r rVar, int[] iArr) {
            super(rVar, iArr);
            this.g = a(rVar.a(0));
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public void a(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!b(this.g, elapsedRealtime)) {
                return;
            }
            for (int i = this.b - 1; i >= 0; i--) {
                if (!b(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int d() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public int e() {
            return this.g;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
        public Object g() {
            return null;
        }
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar, a.C0089a[] c0089aArr, d dVar, k kVar, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.e = eVar;
        this.d = c0089aArr;
        this.c = kVar;
        this.g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[c0089aArr.length];
        int[] iArr = new int[c0089aArr.length];
        for (int i = 0; i < c0089aArr.length; i++) {
            iVarArr[i] = c0089aArr[i].b;
            iArr[i] = i;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b) dVar;
        this.a = bVar.a(1);
        this.b = bVar.a(3);
        r rVar = new r(iVarArr);
        this.f = rVar;
        this.p = new C0088c(rVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        String str2;
        int i;
        if (str.toLowerCase(Locale.getDefault()).startsWith("0x")) {
            str2 = str.substring(2);
        } else {
            str2 = str;
        }
        byte[] byteArray = new BigInteger(str2, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr2, (16 - byteArray.length) + i, byteArray.length - i);
        this.l = uri;
        this.m = bArr;
        this.n = str;
        this.o = bArr2;
    }
}
