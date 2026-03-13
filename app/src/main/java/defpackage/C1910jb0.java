package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;
/* renamed from: jb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910jb0 extends AbstractC1626ib0 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [e5, Z10] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e5, Z10] */
    /* JADX WARN: Type inference failed for: r7v0, types: [e5, Z10] */
    public C1910jb0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new Z10(), new Z10(), new Z10());
    }

    @Override // defpackage.AbstractC1626ib0
    public final C1910jb0 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new C1910jb0(parcel, dataPosition, i, AbstractC0324Hi.h(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.AbstractC1626ib0
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        if (this.k != i) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC1626ib0
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1910jb0(Parcel parcel, int i, int i2, String str, C1243e5 c1243e5, C1243e5 c1243e52, C1243e5 c1243e53) {
        super(c1243e5, c1243e52, c1243e53);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
