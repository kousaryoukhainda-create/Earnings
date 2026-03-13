package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class z9 extends xa {
    public static final Parcelable.Creator<z9> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final byte[] f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public z9[] newArray(int i) {
            return new z9[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public z9 createFromParcel(Parcel parcel) {
            return new z9(parcel);
        }
    }

    public z9(Parcel parcel) {
        super("GEOB");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = (String) xp.a((Object) parcel.readString());
        this.d = (String) xp.a((Object) parcel.readString());
        this.f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z9.class != obj.getClass()) {
            return false;
        }
        z9 z9Var = (z9) obj;
        if (xp.a((Object) this.b, (Object) z9Var.b) && xp.a((Object) this.c, (Object) z9Var.c) && xp.a((Object) this.d, (Object) z9Var.d) && Arrays.equals(this.f, z9Var.f)) {
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
        return Arrays.hashCode(this.f) + ((i5 + i3) * 31);
    }

    @Override // com.applovin.impl.xa
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f);
    }

    public z9(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = bArr;
    }
}
