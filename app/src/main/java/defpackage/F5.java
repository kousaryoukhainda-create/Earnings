package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: F5  reason: default package */
/* loaded from: classes.dex */
public final class F5 extends H5 {
    public final long d;
    public final ArrayList f;
    public final ArrayList g;

    public F5(int i, long j) {
        super(i);
        this.d = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final F5 g(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            F5 f5 = (F5) arrayList.get(i2);
            if (f5.c == i) {
                return f5;
            }
        }
        return null;
    }

    public final G5 h(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            G5 g5 = (G5) arrayList.get(i2);
            if (g5.c == i) {
                return g5;
            }
        }
        return null;
    }

    @Override // defpackage.H5
    public final String toString() {
        return H5.c(this.c) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }
}
