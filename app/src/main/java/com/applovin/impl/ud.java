package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class ud implements o2 {
    public static final ud H = new b().a();
    public static final o2.a I = new Fk0(7);
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final Uri i;
    public final ki j;
    public final ki k;
    public final byte[] l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    /* loaded from: classes.dex */
    public static final class b {
        private Integer A;
        private Integer B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;
        private CharSequence a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private Uri h;
        private ki i;
        private ki j;
        private byte[] k;
        private Integer l;
        private Uri m;
        private Integer n;
        private Integer o;
        private Integer p;
        private Boolean q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private Integer w;
        private CharSequence x;
        private CharSequence y;
        private CharSequence z;

        public b() {
        }

        private b(ud udVar) {
            this.a = udVar.a;
            this.b = udVar.b;
            this.c = udVar.c;
            this.d = udVar.d;
            this.e = udVar.f;
            this.f = udVar.g;
            this.g = udVar.h;
            this.h = udVar.i;
            this.i = udVar.j;
            this.j = udVar.k;
            this.k = udVar.l;
            this.l = udVar.m;
            this.m = udVar.n;
            this.n = udVar.o;
            this.o = udVar.p;
            this.p = udVar.q;
            this.q = udVar.r;
            this.r = udVar.t;
            this.s = udVar.u;
            this.t = udVar.v;
            this.u = udVar.w;
            this.v = udVar.x;
            this.w = udVar.y;
            this.x = udVar.z;
            this.y = udVar.A;
            this.z = udVar.B;
            this.A = udVar.C;
            this.B = udVar.D;
            this.C = udVar.E;
            this.D = udVar.F;
            this.E = udVar.G;
        }

        public b a(byte[] bArr, int i) {
            if (this.k == null || xp.a((Object) Integer.valueOf(i), (Object) 3) || !xp.a((Object) this.l, (Object) 3)) {
                this.k = (byte[]) bArr.clone();
                this.l = Integer.valueOf(i);
            }
            return this;
        }

        public b b(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b d(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.z = charSequence;
            return this;
        }

        public b g(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public b k(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b l(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public b b(Integer num) {
            this.p = num;
            return this;
        }

        public b c(Integer num) {
            this.t = num;
            return this;
        }

        public b d(Integer num) {
            this.s = num;
            return this;
        }

        public b e(Integer num) {
            this.r = num;
            return this;
        }

        public b f(Integer num) {
            this.w = num;
            return this;
        }

        public b g(Integer num) {
            this.v = num;
            return this;
        }

        public b h(Integer num) {
            this.u = num;
            return this;
        }

        public b i(Integer num) {
            this.B = num;
            return this;
        }

        public b j(Integer num) {
            this.o = num;
            return this;
        }

        public b k(Integer num) {
            this.n = num;
            return this;
        }

        public b b(Uri uri) {
            this.h = uri;
            return this;
        }

        public b b(ki kiVar) {
            this.i = kiVar;
            return this;
        }

        public b a(af afVar) {
            for (int i = 0; i < afVar.c(); i++) {
                afVar.a(i).a(this);
            }
            return this;
        }

        public b a(List list) {
            for (int i = 0; i < list.size(); i++) {
                af afVar = (af) list.get(i);
                for (int i2 = 0; i2 < afVar.c(); i2++) {
                    afVar.a(i2).a(this);
                }
            }
            return this;
        }

        public b a(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b a(byte[] bArr, Integer num) {
            this.k = bArr == null ? null : (byte[]) bArr.clone();
            this.l = num;
            return this;
        }

        public b a(Uri uri) {
            this.m = uri;
            return this;
        }

        public b a(Integer num) {
            this.A = num;
            return this;
        }

        public b a(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b a(Boolean bool) {
            this.q = bool;
            return this;
        }

        public b a(ki kiVar) {
            this.j = kiVar;
            return this;
        }

        public ud a() {
            return new ud(this);
        }
    }

    private ud(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m;
        this.o = bVar.n;
        this.p = bVar.o;
        this.q = bVar.p;
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.r;
        this.u = bVar.s;
        this.v = bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A;
        this.D = bVar.B;
        this.E = bVar.C;
        this.F = bVar.D;
        this.G = bVar.E;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static /* synthetic */ ud b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ud.class != obj.getClass()) {
            return false;
        }
        ud udVar = (ud) obj;
        if (xp.a(this.a, udVar.a) && xp.a(this.b, udVar.b) && xp.a(this.c, udVar.c) && xp.a(this.d, udVar.d) && xp.a(this.f, udVar.f) && xp.a(this.g, udVar.g) && xp.a(this.h, udVar.h) && xp.a(this.i, udVar.i) && xp.a(this.j, udVar.j) && xp.a(this.k, udVar.k) && Arrays.equals(this.l, udVar.l) && xp.a(this.m, udVar.m) && xp.a(this.n, udVar.n) && xp.a(this.o, udVar.o) && xp.a(this.p, udVar.p) && xp.a(this.q, udVar.q) && xp.a(this.r, udVar.r) && xp.a(this.t, udVar.t) && xp.a(this.u, udVar.u) && xp.a(this.v, udVar.v) && xp.a(this.w, udVar.w) && xp.a(this.x, udVar.x) && xp.a(this.y, udVar.y) && xp.a(this.z, udVar.z) && xp.a(this.A, udVar.A) && xp.a(this.B, udVar.B) && xp.a(this.C, udVar.C) && xp.a(this.D, udVar.D) && xp.a(this.E, udVar.E) && xp.a(this.F, udVar.F)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    public b a() {
        return new b();
    }

    public static ud a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.k(bundle.getCharSequence(a(0))).c(bundle.getCharSequence(a(1))).b(bundle.getCharSequence(a(2))).a(bundle.getCharSequence(a(3))).h(bundle.getCharSequence(a(4))).j(bundle.getCharSequence(a(5))).g(bundle.getCharSequence(a(6))).b((Uri) bundle.getParcelable(a(7))).a(bundle.getByteArray(a(10)), bundle.containsKey(a(29)) ? Integer.valueOf(bundle.getInt(a(29))) : null).a((Uri) bundle.getParcelable(a(11))).l(bundle.getCharSequence(a(22))).e(bundle.getCharSequence(a(23))).f(bundle.getCharSequence(a(24))).i(bundle.getCharSequence(a(27))).d(bundle.getCharSequence(a(28))).a(bundle.getBundle(a(1000)));
        if (bundle.containsKey(a(8)) && (bundle3 = bundle.getBundle(a(8))) != null) {
            bVar.b((ki) ki.a.a(bundle3));
        }
        if (bundle.containsKey(a(9)) && (bundle2 = bundle.getBundle(a(9))) != null) {
            bVar.a((ki) ki.a.a(bundle2));
        }
        if (bundle.containsKey(a(12))) {
            bVar.k(Integer.valueOf(bundle.getInt(a(12))));
        }
        if (bundle.containsKey(a(13))) {
            bVar.j(Integer.valueOf(bundle.getInt(a(13))));
        }
        if (bundle.containsKey(a(14))) {
            bVar.b(Integer.valueOf(bundle.getInt(a(14))));
        }
        if (bundle.containsKey(a(15))) {
            bVar.a(Boolean.valueOf(bundle.getBoolean(a(15))));
        }
        if (bundle.containsKey(a(16))) {
            bVar.e(Integer.valueOf(bundle.getInt(a(16))));
        }
        if (bundle.containsKey(a(17))) {
            bVar.d(Integer.valueOf(bundle.getInt(a(17))));
        }
        if (bundle.containsKey(a(18))) {
            bVar.c(Integer.valueOf(bundle.getInt(a(18))));
        }
        if (bundle.containsKey(a(19))) {
            bVar.h(Integer.valueOf(bundle.getInt(a(19))));
        }
        if (bundle.containsKey(a(20))) {
            bVar.g(Integer.valueOf(bundle.getInt(a(20))));
        }
        if (bundle.containsKey(a(21))) {
            bVar.f(Integer.valueOf(bundle.getInt(a(21))));
        }
        if (bundle.containsKey(a(25))) {
            bVar.a(Integer.valueOf(bundle.getInt(a(25))));
        }
        if (bundle.containsKey(a(26))) {
            bVar.i(Integer.valueOf(bundle.getInt(a(26))));
        }
        return bVar.a();
    }
}
