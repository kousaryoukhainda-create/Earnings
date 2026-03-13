package com.applovin.impl;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class a9 {
    private final SparseBooleanArray a;

    private a9(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public boolean a(int i) {
        return this.a.get(i);
    }

    public int b(int i) {
        b1.a(i, 0, a());
        return this.a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        if (xp.a < 24) {
            if (a() != a9Var.a()) {
                return false;
            }
            for (int i = 0; i < a(); i++) {
                if (b(i) != a9Var.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(a9Var.a);
    }

    public int hashCode() {
        if (xp.a < 24) {
            int a2 = a();
            for (int i = 0; i < a(); i++) {
                a2 = (a2 * 31) + b(i);
            }
            return a2;
        }
        return this.a.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final SparseBooleanArray a = new SparseBooleanArray();
        private boolean b;

        public b a(int i) {
            b1.b(!this.b);
            this.a.append(i, true);
            return this;
        }

        public b a(a9 a9Var) {
            for (int i = 0; i < a9Var.a(); i++) {
                a(a9Var.b(i));
            }
            return this;
        }

        public b a(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b a(int i, boolean z) {
            return z ? a(i) : this;
        }

        public a9 a() {
            b1.b(!this.b);
            this.b = true;
            return new a9(this.a);
        }
    }

    public boolean a(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.a.size();
    }
}
