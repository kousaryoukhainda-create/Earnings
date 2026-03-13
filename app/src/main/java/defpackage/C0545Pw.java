package defpackage;

import android.util.SparseBooleanArray;
/* renamed from: Pw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545Pw {
    public final SparseBooleanArray a;

    public C0545Pw(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        B10.m(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0545Pw)) {
            return false;
        }
        C0545Pw c0545Pw = (C0545Pw) obj;
        int i = Ha0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i < 24) {
            if (sparseBooleanArray.size() != c0545Pw.a.size()) {
                return false;
            }
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                if (a(i2) != c0545Pw.a(i2)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(c0545Pw.a);
    }

    public final int hashCode() {
        int i = Ha0.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + a(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
