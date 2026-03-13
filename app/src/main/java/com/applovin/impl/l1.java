package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class l1 implements o2 {
    public static final l1 g = new b().a();
    public static final o2.a h = new Jh0(11);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes f;

    /* loaded from: classes.dex */
    public static final class b {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public b a(int i) {
            this.d = i;
            return this;
        }

        public b b(int i) {
            this.a = i;
            return this;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(int i) {
            this.c = i;
            return this;
        }

        public l1 a() {
            return new l1(this.a, this.b, this.c, this.d);
        }
    }

    private l1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static /* synthetic */ l1 b(Bundle bundle) {
        return a(bundle);
    }

    public AudioAttributes a() {
        if (this.f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            if (xp.a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.f = usage.build();
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (this.a == l1Var.a && this.b == l1Var.b && this.c == l1Var.c && this.d == l1Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static /* synthetic */ l1 a(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(a(0))) {
            bVar.b(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.c(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.d(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.a(bundle.getInt(a(3)));
        }
        return bVar.a();
    }
}
