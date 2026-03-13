package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class up extends xa {
    public static final Parcelable.Creator<up> CREATOR = new a();
    public final String b;
    public final String c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public up[] newArray(int i) {
            return new up[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public up createFromParcel(Parcel parcel) {
            return new up(parcel);
        }
    }

    public up(Parcel parcel) {
        super((String) xp.a((Object) parcel.readString()));
        this.b = parcel.readString();
        this.c = (String) xp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up.class != obj.getClass()) {
            return false;
        }
        up upVar = (up) obj;
        if (this.a.equals(upVar.a) && xp.a((Object) this.b, (Object) upVar.b) && xp.a((Object) this.c, (Object) upVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int b = AbstractC2437ph.b(527, 31, this.a);
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (b + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.applovin.impl.xa
    public String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public up(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }
}
