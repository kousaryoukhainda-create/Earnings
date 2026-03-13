package com.applovin.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface dp {

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final String b;
        public final List c;
        public final byte[] d;

        public b(int i, String str, List list, byte[] bArr) {
            List unmodifiableList;
            this.a = i;
            this.b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = unmodifiableList;
            this.d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray a();

        dp a(int i, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        private void d() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public void a() {
            int i;
            int i2 = this.d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.b;
            } else {
                i = i2 + this.c;
            }
            this.d = i;
            this.e = this.a + this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        public int c() {
            d();
            return this.d;
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a();

    void a(ah ahVar, int i);

    void a(ho hoVar, l8 l8Var, d dVar);
}
