package defpackage;

import android.util.SparseArray;
/* renamed from: KM  reason: default package */
/* loaded from: classes.dex */
public final class KM {
    public final SparseArray a;
    public C2310o90 b;

    public KM(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(C2310o90 c2310o90, int i, int i2) {
        KM km;
        int a = c2310o90.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            km = null;
        } else {
            km = (KM) sparseArray.get(a);
        }
        if (km == null) {
            km = new KM(1);
            sparseArray.put(c2310o90.a(i), km);
        }
        if (i2 > i) {
            km.a(c2310o90, i + 1, i2);
        } else {
            km.b = c2310o90;
        }
    }
}
