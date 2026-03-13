package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.af;
import com.applovin.impl.ud;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class va implements af.b {
    public static final Parcelable.Creator<va> CREATOR = new a();
    public final byte[] a;
    public final String b;
    public final String c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public va[] newArray(int i) {
            return new va[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public va createFromParcel(Parcel parcel) {
            return new va(parcel);
        }
    }

    public va(Parcel parcel) {
        this.a = (byte[]) b1.a(parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ e9 b() {
        return AbstractC3207yf0.c(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va.class == obj.getClass()) {
            return Arrays.equals(this.a, ((va) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        return AbstractC2437ph.k(BK.q("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.a.length, "\"");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    @Override // com.applovin.impl.af.b
    public void a(ud.b bVar) {
        String str = this.b;
        if (str != null) {
            bVar.k(str);
        }
    }

    public va(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }
}
