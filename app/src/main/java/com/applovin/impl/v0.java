package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.ud;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class v0 extends xa {
    public static final Parcelable.Creator<v0> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;
    public final byte[] f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v0[] newArray(int i) {
            return new v0[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v0 createFromParcel(Parcel parcel) {
            return new v0(parcel);
        }
    }

    public v0(Parcel parcel) {
        super("APIC");
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.xa, com.applovin.impl.af.b
    public void a(ud.b bVar) {
        bVar.a(this.f, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.d == v0Var.d && xp.a((Object) this.b, (Object) v0Var.b) && xp.a((Object) this.c, (Object) v0Var.c) && Arrays.equals(this.f, v0Var.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (this.d + 527) * 31;
        String str = this.b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f) + ((i4 + i3) * 31);
    }

    @Override // com.applovin.impl.xa
    public String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f);
    }

    public v0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.f = bArr;
    }
}
