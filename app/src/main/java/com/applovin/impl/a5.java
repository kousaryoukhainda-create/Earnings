package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class a5 implements o2 {
    public static final a5 s = new b().a("").a();
    public static final o2.a t = new C2394p80(6);
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    /* loaded from: classes.dex */
    public static final class b {
        private CharSequence a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public b a(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b a(float f) {
            this.m = f;
            return this;
        }

        public b b(float f) {
            this.h = f;
            return this;
        }

        public b c(float f) {
            this.q = f;
            return this;
        }

        public b d(float f) {
            this.l = f;
            return this;
        }

        public b a(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b b(int i) {
            this.i = i;
            return this;
        }

        public b c(int i) {
            this.p = i;
            return this;
        }

        public b d(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b a(int i) {
            this.g = i;
            return this;
        }

        public b b(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public a5 a() {
            return new a5(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        private b(a5 a5Var) {
            this.a = a5Var.a;
            this.b = a5Var.d;
            this.c = a5Var.b;
            this.d = a5Var.c;
            this.e = a5Var.f;
            this.f = a5Var.g;
            this.g = a5Var.h;
            this.h = a5Var.i;
            this.i = a5Var.j;
            this.j = a5Var.o;
            this.k = a5Var.p;
            this.l = a5Var.k;
            this.m = a5Var.l;
            this.n = a5Var.m;
            this.o = a5Var.n;
            this.p = a5Var.q;
            this.q = a5Var.r;
        }
    }

    private a5(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            b1.a(bitmap);
        } else {
            b1.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.class != obj.getClass()) {
            return false;
        }
        a5 a5Var = (a5) obj;
        if (TextUtils.equals(this.a, a5Var.a) && this.b == a5Var.b && this.c == a5Var.c && ((bitmap = this.d) != null ? !((bitmap2 = a5Var.d) == null || !bitmap.sameAs(bitmap2)) : a5Var.d == null) && this.f == a5Var.f && this.g == a5Var.g && this.h == a5Var.h && this.i == a5Var.i && this.j == a5Var.j && this.k == a5Var.k && this.l == a5Var.l && this.m == a5Var.m && this.n == a5Var.n && this.o == a5Var.o && this.p == a5Var.p && this.q == a5Var.q && this.r == a5Var.r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r));
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a5 a(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.b(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.d(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.a(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.d(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(a(15))) {
            bVar.c(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.c(bundle.getFloat(a(16)));
        }
        return bVar.a();
    }
}
