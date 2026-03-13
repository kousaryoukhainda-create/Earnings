package com.applovin.impl;

import android.util.SparseArray;
/* loaded from: classes.dex */
final class qk {
    private final q4 c;
    private final SparseArray b = new SparseArray();
    private int a = -1;

    public qk(q4 q4Var) {
        this.c = q4Var;
    }

    public void a(int i, Object obj) {
        if (this.a == -1) {
            b1.b(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            b1.a(i >= keyAt);
            if (keyAt == i) {
                q4 q4Var = this.c;
                SparseArray sparseArray2 = this.b;
                q4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public void b(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public Object c(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public Object b() {
        SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean c() {
        return this.b.size() == 0;
    }

    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void a(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.a = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
    }
}
