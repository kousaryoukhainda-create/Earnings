package com.fyber.inneractive.sdk.player.exoplayer2;
/* loaded from: classes.dex */
public abstract class p {
    public static final p a = new a();

    /* loaded from: classes.dex */
    public class a extends p {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int a() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int b() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int a(Object obj) {
            return -1;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public c a(int i, c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public b a(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
    }

    /* loaded from: classes.dex */
    public static final class c {
        public Object a;
        public boolean b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i, b bVar, boolean z);

    public final c a(int i, c cVar) {
        return a(i, cVar, false, 0L);
    }

    public abstract c a(int i, c cVar, boolean z, long j);

    public abstract int b();

    public final boolean c() {
        if (b() == 0) {
            return true;
        }
        return false;
    }
}
