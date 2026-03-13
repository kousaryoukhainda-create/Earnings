package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e3 extends xa {
    public static final Parcelable.Creator<e3> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public final long f;
    public final long g;
    private final xa[] h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e3[] newArray(int i) {
            return new e3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e3 createFromParcel(Parcel parcel) {
            return new e3(parcel);
        }
    }

    public e3(Parcel parcel) {
        super("CHAP");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new xa[readInt];
        for (int i = 0; i < readInt; i++) {
            this.h[i] = (xa) parcel.readParcelable(xa.class.getClassLoader());
        }
    }

    @Override // com.applovin.impl.xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3.class != obj.getClass()) {
            return false;
        }
        e3 e3Var = (e3) obj;
        if (this.c == e3Var.c && this.d == e3Var.d && this.f == e3Var.f && this.g == e3Var.g && xp.a((Object) this.b, (Object) e3Var.b) && Arrays.equals(this.h, e3Var.h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((this.c + 527) * 31) + this.d) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
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
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (xa xaVar : this.h) {
            parcel.writeParcelable(xaVar, 0);
        }
    }

    public e3(String str, int i, int i2, long j, long j2, xa[] xaVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.f = j;
        this.g = j2;
        this.h = xaVarArr;
    }
}
