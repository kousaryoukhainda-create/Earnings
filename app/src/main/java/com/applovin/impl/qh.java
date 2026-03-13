package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.a9;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public interface qh {

    /* loaded from: classes.dex */
    public static final class b implements o2 {
        public static final b b = new a().a();
        public static final o2.a c = new Jh0(27);
        private final a9 a;

        /* loaded from: classes.dex */
        public static final class a {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
            private final a9.b a = new a9.b();

            public a a(int i) {
                this.a.a(i);
                return this;
            }

            public a a(b bVar) {
                this.a.a(bVar.a);
                return this;
            }

            public a a(int... iArr) {
                this.a.a(iArr);
                return this;
            }

            public a a(int i, boolean z) {
                this.a.a(i, z);
                return this;
            }

            public b a() {
                return new b(this.a.a());
            }
        }

        private b(a9 a9Var) {
            this.a = a9Var;
        }

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private static String b(int i) {
            return Integer.toString(i, 36);
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public static b a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return aVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);

        void a(fo foVar, int i);

        void a(nh nhVar);

        void a(ph phVar);

        void a(po poVar, to toVar);

        void a(b bVar);

        void a(f fVar, f fVar2, int i);

        void a(qh qhVar, d dVar);

        void a(sd sdVar, int i);

        void a(ud udVar);

        void a(boolean z, int i);

        void b();

        void b(int i);

        void b(nh nhVar);

        void b(boolean z);

        void b(boolean z, int i);

        void c(int i);

        void c(boolean z);

        void d(boolean z);

        void e(int i);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final a9 a;

        public d(a9 a9Var) {
            this.a = a9Var;
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return this.a.equals(((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public boolean a(int... iArr) {
            return this.a.a(iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface e extends c {
        void a();

        void a(float f);

        @Override // com.applovin.impl.qh.c
        void a(int i);

        void a(int i, int i2);

        void a(af afVar);

        @Override // com.applovin.impl.qh.c
        void a(fo foVar, int i);

        @Override // com.applovin.impl.qh.c
        void a(nh nhVar);

        @Override // com.applovin.impl.qh.c
        void a(ph phVar);

        @Override // com.applovin.impl.qh.c
        void a(po poVar, to toVar);

        void a(q6 q6Var);

        @Override // com.applovin.impl.qh.c
        void a(b bVar);

        @Override // com.applovin.impl.qh.c
        void a(f fVar, f fVar2, int i);

        @Override // com.applovin.impl.qh.c
        void a(qh qhVar, d dVar);

        @Override // com.applovin.impl.qh.c
        void a(sd sdVar, int i);

        @Override // com.applovin.impl.qh.c
        void a(ud udVar);

        void a(xq xqVar);

        void a(List list);

        void a(boolean z);

        @Override // com.applovin.impl.qh.c
        void a(boolean z, int i);

        @Override // com.applovin.impl.qh.c
        void b(int i);

        void b(int i, boolean z);

        @Override // com.applovin.impl.qh.c
        void b(nh nhVar);

        @Override // com.applovin.impl.qh.c
        void b(boolean z);

        @Override // com.applovin.impl.qh.c
        void c(int i);

        @Override // com.applovin.impl.qh.c
        void c(boolean z);

        @Override // com.applovin.impl.qh.c
        void d(boolean z);
    }

    to A();

    void B();

    ud C();

    void D();

    int E();

    long F();

    ph a();

    void a(int i);

    void a(int i, long j);

    void a(long j);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(e eVar);

    void a(boolean z);

    void b();

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(e eVar);

    void b(boolean z);

    boolean b(int i);

    nh c();

    boolean d();

    long e();

    int f();

    long g();

    long getCurrentPosition();

    long getDuration();

    long h();

    b i();

    boolean isPlaying();

    int j();

    po k();

    boolean l();

    int m();

    fo n();

    int o();

    Looper p();

    long q();

    boolean r();

    long s();

    int t();

    void u();

    int v();

    void w();

    List x();

    boolean y();

    xq z();

    /* loaded from: classes.dex */
    public static final class f implements o2 {
        public static final o2.a k = new Jh0(28);
        public final Object a;
        public final int b;
        public final sd c;
        public final Object d;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public f(Object obj, int i, sd sdVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.a = obj;
            this.b = i;
            this.c = sdVar;
            this.d = obj2;
            this.f = i2;
            this.g = j;
            this.h = j2;
            this.i = i3;
            this.j = i4;
        }

        public static f a(Bundle bundle) {
            return new f(null, bundle.getInt(a(0), -1), (sd) p2.a(sd.h, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        public static /* synthetic */ f b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.b == fVar.b && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i && this.j == fVar.j && Objects.equal(this.a, fVar.a) && Objects.equal(this.d, fVar.d) && Objects.equal(this.c, fVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.f), Integer.valueOf(this.b), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }
    }
}
