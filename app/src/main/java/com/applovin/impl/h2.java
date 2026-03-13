package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h2 extends xa {
    public static final Parcelable.Creator<h2> CREATOR = new a();
    public final byte[] b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h2[] newArray(int i) {
            return new h2[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h2 createFromParcel(Parcel parcel) {
            return new h2(parcel);
        }
    }

    public h2(Parcel parcel) {
        super((String) xp.a((Object) parcel.readString()));
        this.b = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        if (this.a.equals(h2Var.a) && Arrays.equals(this.b, h2Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) + AbstractC2437ph.b(527, 31, this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    public h2(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }
}
