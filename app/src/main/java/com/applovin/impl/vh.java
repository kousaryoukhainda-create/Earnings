package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class vh extends xa {
    public static final Parcelable.Creator<vh> CREATOR = new a();
    public final String b;
    public final byte[] c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vh[] newArray(int i) {
            return new vh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel);
        }
    }

    public vh(Parcel parcel) {
        super("PRIV");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vh.class != obj.getClass()) {
            return false;
        }
        vh vhVar = (vh) obj;
        if (xp.a((Object) this.b, (Object) vhVar.b) && Arrays.equals(this.c, vhVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.c) + ((i + 527) * 31);
    }

    @Override // com.applovin.impl.xa
    public String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public vh(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }
}
