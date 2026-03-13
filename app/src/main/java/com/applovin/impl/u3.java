package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class u3 extends xa {
    public static final Parcelable.Creator<u3> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public u3[] newArray(int i) {
            return new u3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public u3 createFromParcel(Parcel parcel) {
            return new u3(parcel);
        }
    }

    public u3(Parcel parcel) {
        super("COMM");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = (String) xp.a((Object) parcel.readString());
        this.d = (String) xp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3.class != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (xp.a((Object) this.c, (Object) u3Var.c) && xp.a((Object) this.b, (Object) u3Var.b) && xp.a((Object) this.d, (Object) u3Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 527) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // com.applovin.impl.xa
    public String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public u3(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
