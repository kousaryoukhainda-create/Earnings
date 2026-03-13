package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final h[] f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.c == dVar.c && this.d == dVar.d && u.a(this.b, dVar.b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f)) {
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
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f.length);
        int i2 = 0;
        while (true) {
            h[] hVarArr = this.f;
            if (i2 < hVarArr.length) {
                parcel.writeParcelable(hVarArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
