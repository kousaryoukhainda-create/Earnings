package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: com.applovin.impl.if  reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends xa {
    public static final Parcelable.Creator<Cif> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int[] f;
    public final int[] g;

    /* renamed from: com.applovin.impl.if$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cif[] newArray(int i) {
            return new Cif[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cif createFromParcel(Parcel parcel) {
            return new Cif(parcel);
        }
    }

    public Cif(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    @Override // com.applovin.impl.xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cif.class != obj.getClass()) {
            return false;
        }
        Cif cif = (Cif) obj;
        if (this.b == cif.b && this.c == cif.c && this.d == cif.d && Arrays.equals(this.f, cif.f) && Arrays.equals(this.g, cif.g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f);
        return Arrays.hashCode(this.g) + ((hashCode + ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    public Cif(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = (int[]) xp.a(parcel.createIntArray());
        this.g = (int[]) xp.a(parcel.createIntArray());
    }
}
