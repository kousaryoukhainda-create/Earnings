package defpackage;

import android.util.SparseArray;
/* renamed from: hV  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532hV {
    public SparseArray a;
    public int b;

    public final C1446gV a(int i) {
        SparseArray sparseArray = this.a;
        C1446gV c1446gV = (C1446gV) sparseArray.get(i);
        if (c1446gV == null) {
            C1446gV c1446gV2 = new C1446gV();
            sparseArray.put(i, c1446gV2);
            return c1446gV2;
        }
        return c1446gV;
    }
}
