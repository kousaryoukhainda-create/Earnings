package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f3 extends xa {
    public static final Parcelable.Creator<f3> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] f;
    private final xa[] g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f3[] newArray(int i) {
            return new f3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f3 createFromParcel(Parcel parcel) {
            return new f3(parcel);
        }
    }

    public f3(Parcel parcel) {
        super("CTOC");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f = (String[]) xp.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.g = new xa[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (xa) parcel.readParcelable(xa.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f3.class != obj.getClass()) {
            return false;
        }
        f3 f3Var = (f3) obj;
        if (this.c == f3Var.c && this.d == f3Var.d && xp.a((Object) this.b, (Object) f3Var.b) && Arrays.equals(this.f, f3Var.f) && Arrays.equals(this.g, f3Var.g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = ((((this.c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (xa xaVar : this.g) {
            parcel.writeParcelable(xaVar, 0);
        }
    }

    public f3(String str, boolean z, boolean z2, String[] strArr, xa[] xaVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.f = strArr;
        this.g = xaVarArr;
    }
}
