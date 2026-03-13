package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;
    public static final int l0;
    public static final int m0;
    public static final int n0;
    public static final int o0;
    public static final int p0;
    public static final int q0;
    public static final int r0;
    public static final int s0;
    public static final int t0;
    public static final int u0;
    public static final int v0;
    public static final int w0;
    public static final int x0;
    public static final int y0;
    public static final int z0;
    public final int a;
    public static final int b = u.a("ftyp");
    public static final int c = u.a("avc1");
    public static final int d = u.a("avc3");
    public static final int e = u.a("hvc1");
    public static final int f = u.a("hev1");
    public static final int g = u.a("s263");
    public static final int h = u.a("d263");
    public static final int i = u.a("mdat");
    public static final int j = u.a("mp4a");
    public static final int k = u.a(".mp3");
    public static final int l = u.a("wave");
    public static final int m = u.a("lpcm");
    public static final int n = u.a("sowt");
    public static final int o = u.a("ac-3");
    public static final int p = u.a("dac3");
    public static final int q = u.a("ec-3");
    public static final int r = u.a("dec3");
    public static final int s = u.a("dtsc");
    public static final int t = u.a("dtsh");
    public static final int u = u.a("dtsl");
    public static final int v = u.a("dtse");
    public static final int w = u.a("ddts");
    public static final int x = u.a("tfdt");
    public static final int y = u.a("tfhd");
    public static final int z = u.a("trex");
    public static final int A = u.a("trun");
    public static final int B = u.a("sidx");
    public static final int C = u.a("moov");
    public static final int D = u.a("mvhd");
    public static final int E = u.a("trak");
    public static final int F = u.a("mdia");
    public static final int G = u.a("minf");
    public static final int H = u.a("stbl");
    public static final int I = u.a("avcC");
    public static final int J = u.a("hvcC");
    public static final int K = u.a("esds");
    public static final int L = u.a("moof");
    public static final int M = u.a("traf");
    public static final int N = u.a("mvex");
    public static final int O = u.a("mehd");
    public static final int P = u.a("tkhd");
    public static final int Q = u.a("edts");
    public static final int R = u.a("elst");
    public static final int S = u.a("mdhd");
    public static final int T = u.a("hdlr");
    public static final int U = u.a("stsd");
    public static final int V = u.a("pssh");
    public static final int W = u.a("sinf");
    public static final int X = u.a("schm");
    public static final int Y = u.a("schi");
    public static final int Z = u.a("tenc");
    public static final int a0 = u.a("encv");
    public static final int b0 = u.a("enca");
    public static final int c0 = u.a("frma");
    public static final int d0 = u.a("saiz");
    public static final int e0 = u.a("saio");
    public static final int f0 = u.a("sbgp");
    public static final int g0 = u.a("sgpd");
    public static final int h0 = u.a("uuid");
    public static final int i0 = u.a("senc");
    public static final int j0 = u.a("pasp");
    public static final int k0 = u.a("TTML");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0092a extends a {
        public final long P0;
        public final List<b> Q0;
        public final List<C0092a> R0;

        public C0092a(int i, long j) {
            super(i);
            this.P0 = j;
            this.Q0 = new ArrayList();
            this.R0 = new ArrayList();
        }

        public C0092a c(int i) {
            int size = this.R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0092a c0092a = this.R0.get(i2);
                if (c0092a.a == i) {
                    return c0092a;
                }
            }
            return null;
        }

        public b d(int i) {
            int size = this.Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.Q0.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a
        public String toString() {
            return a.a(this.a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.R0.toArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k P0;

        public b(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
            super(i);
            this.P0 = kVar;
        }
    }

    static {
        u.a("vmhd");
        l0 = u.a("mp4v");
        m0 = u.a("stts");
        n0 = u.a("stss");
        o0 = u.a("ctts");
        p0 = u.a("stsc");
        q0 = u.a("stsz");
        r0 = u.a("stz2");
        s0 = u.a("stco");
        t0 = u.a("co64");
        u0 = u.a("tx3g");
        v0 = u.a("wvtt");
        w0 = u.a("stpp");
        x0 = u.a("c608");
        y0 = u.a("samr");
        z0 = u.a("sawb");
        A0 = u.a("udta");
        B0 = u.a("meta");
        C0 = u.a("ilst");
        D0 = u.a("mean");
        E0 = u.a("name");
        F0 = u.a("data");
        G0 = u.a("emsg");
        H0 = u.a("st3d");
        I0 = u.a("sv3d");
        J0 = u.a("proj");
        K0 = u.a("vp08");
        L0 = u.a("vp09");
        M0 = u.a("vpcC");
        N0 = u.a("camm");
        O0 = u.a("alac");
    }

    public a(int i2) {
        this.a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
