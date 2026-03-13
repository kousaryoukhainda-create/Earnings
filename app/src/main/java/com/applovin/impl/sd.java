package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class sd implements o2 {
    public static final sd g = new c().a();
    public static final o2.a h = new Fk0(1);
    public final String a;
    public final g b;
    public final f c;
    public final ud d;
    public final d f;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class d implements o2 {
        public static final o2.a g = new Fk0(2);
        public final long a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final boolean f;

        private d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = j;
            this.b = j2;
            this.c = z;
            this.d = z2;
            this.f = z3;
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.f == dVar.f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.a;
            long j2 = this.b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
        }

        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final UUID a;
        public final Uri b;
        public final fb c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final db g;
        private final byte[] h;

        /* loaded from: classes.dex */
        public static final class a {
            private UUID a;
            private Uri b;
            private fb c;
            private boolean d;
            private boolean e;
            private boolean f;
            private db g;
            private byte[] h;

            private a() {
                this.c = fb.h();
                this.g = db.h();
            }

            public e a() {
                return new e(this);
            }

            private a(e eVar) {
                this.a = eVar.a;
                this.b = eVar.b;
                this.c = eVar.c;
                this.d = eVar.d;
                this.e = eVar.e;
                this.f = eVar.f;
                this.g = eVar.g;
                this.h = eVar.h;
            }
        }

        private e(a aVar) {
            b1.b((aVar.f && aVar.b == null) ? false : true);
            this.a = (UUID) b1.a(aVar.a);
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.f = aVar.f;
            this.e = aVar.e;
            this.g = aVar.g;
            this.h = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a.equals(eVar.a) && xp.a(this.b, eVar.b) && xp.a(this.c, eVar.c) && this.d == eVar.d && this.f == eVar.f && this.e == eVar.e && this.g.equals(eVar.g) && Arrays.equals(this.h, eVar.h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            Uri uri = this.b;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.g.hashCode();
            return Arrays.hashCode(this.h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
        }

        public a a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements o2 {
        public static final f g = new a().a();
        public static final o2.a h = new Fk0(3);
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float f;

        /* loaded from: classes.dex */
        public static final class a {
            private long a;
            private long b;
            private long c;
            private float d;
            private float e;

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            public f a() {
                return new f(this);
            }

            private a(f fVar) {
                this.a = fVar.a;
                this.b = fVar.b;
                this.c = fVar.c;
                this.d = fVar.d;
                this.e = fVar.f;
            }
        }

        public f(long j, long j2, long j3, float f, float f2) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = f;
            this.f = f2;
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public static /* synthetic */ f b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.f == fVar.f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.d;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }

        public a a() {
            return new a();
        }

        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final Uri a;
        public final String b;
        public final e c;
        public final List d;
        public final String e;
        public final List f;
        public final Object g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.a = uri;
            this.b = str;
            this.c = eVar;
            this.d = list;
            this.e = str2;
            this.f = list2;
            this.g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.a.equals(gVar.a) && xp.a((Object) this.b, (Object) gVar.b) && xp.a(this.c, gVar.c) && xp.a((Object) null, (Object) null) && this.d.equals(gVar.d) && xp.a((Object) this.e, (Object) gVar.e) && this.f.equals(gVar.f) && xp.a(this.g, gVar.g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.a.hashCode() * 31;
            String str = this.b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            e eVar = this.c;
            if (eVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eVar.hashCode();
            }
            int hashCode5 = (this.d.hashCode() + ((i2 + hashCode2) * 961)) * 31;
            String str2 = this.e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.g;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode6 + i;
        }
    }

    private sd(String str, d dVar, g gVar, f fVar, ud udVar) {
        this.a = str;
        this.b = gVar;
        this.c = fVar;
        this.d = udVar;
        this.f = dVar;
    }

    public static sd a(Bundle bundle) {
        f fVar;
        ud udVar;
        d dVar;
        String str = (String) b1.a((Object) bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = f.g;
        } else {
            fVar = (f) f.h.a(bundle2);
        }
        f fVar2 = fVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            udVar = ud.H;
        } else {
            udVar = (ud) ud.I.a(bundle3);
        }
        ud udVar2 = udVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.g.a(bundle4);
        }
        return new sd(str, dVar, null, fVar2, udVar2);
    }

    public static /* synthetic */ sd b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        if (xp.a((Object) this.a, (Object) sdVar.a) && this.f.equals(sdVar.f) && xp.a(this.b, sdVar.b) && xp.a(this.c, sdVar.c) && xp.a(this.d, sdVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        if (gVar != null) {
            i = gVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.f.hashCode();
        return this.d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private String a;
        private Uri b;
        private String c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private e.a i;
        private List j;
        private String k;
        private List l;
        private Object m;
        private ud n;
        private f.a o;

        public c() {
            this.e = Long.MIN_VALUE;
            this.i = new e.a();
            this.j = Collections.emptyList();
            this.l = Collections.emptyList();
            this.o = new f.a();
        }

        public sd a() {
            g gVar;
            b1.b(this.i.b == null || this.i.a != null);
            Uri uri = this.b;
            if (uri != null) {
                gVar = new g(uri, this.c, this.i.a != null ? this.i.a() : null, null, this.j, this.k, this.l, this.m);
            } else {
                gVar = null;
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            d dVar = new d(this.d, this.e, this.f, this.g, this.h);
            f a = this.o.a();
            ud udVar = this.n;
            if (udVar == null) {
                udVar = ud.H;
            }
            return new sd(str2, dVar, gVar, a, udVar);
        }

        public c b(String str) {
            this.a = (String) b1.a((Object) str);
            return this;
        }

        private c(sd sdVar) {
            this();
            e.a aVar;
            d dVar = sdVar.f;
            this.e = dVar.b;
            this.f = dVar.c;
            this.g = dVar.d;
            this.d = dVar.a;
            this.h = dVar.f;
            this.a = sdVar.a;
            this.n = sdVar.d;
            this.o = sdVar.c.a();
            g gVar = sdVar.b;
            if (gVar != null) {
                this.k = gVar.e;
                this.c = gVar.b;
                this.b = gVar.a;
                this.j = gVar.d;
                this.l = gVar.f;
                this.m = gVar.g;
                e eVar = gVar.c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.i = aVar;
            }
        }

        public c a(String str) {
            this.k = str;
            return this;
        }

        public c a(Object obj) {
            this.m = obj;
            return this;
        }

        public c a(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static sd a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}
