package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* loaded from: classes.dex */
public final class a implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0085a();
    public final b[] a;
    public int b;
    public final int c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0085a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(boolean z, b... bVarArr) {
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        Arrays.sort(bVarArr, this);
        for (int i = 1; i < bVarArr.length; i++) {
            if (bVarArr[i - 1].b.equals(bVarArr[i].b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + bVarArr[i].b);
            }
        }
        this.a = bVarArr;
        this.c = bVarArr.length;
    }

    @Override // java.util.Comparator
    public int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.b;
        if (uuid.equals(bVar3.b)) {
            if (uuid.equals(bVar4.b)) {
                return 0;
            }
            return 1;
        }
        return bVar3.b.compareTo(bVar4.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return Arrays.equals(this.a, ((a) obj).a);
        }
        return false;
    }

    public int hashCode() {
        if (this.b == 0) {
            this.b = Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, 0);
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0086a();
        public int a;
        public final UUID b;
        public final String c;
        public final byte[] d;
        public final boolean e;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0086a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(UUID uuid, String str, byte[] bArr, boolean z) {
            this.b = (UUID) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(uuid);
            this.c = (String) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
            this.d = (byte[]) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(bArr);
            this.e = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!this.c.equals(bVar.c) || !u.a(this.b, bVar.b) || !Arrays.equals(this.d, bVar.d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.a == 0) {
                this.a = Arrays.hashCode(this.d) + AbstractC2437ph.b(this.b.hashCode() * 31, 31, this.c);
            }
            return this.a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeByteArray(this.d);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        }

        public b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.createByteArray();
            this.e = parcel.readByte() != 0;
        }
    }

    public a(Parcel parcel) {
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        this.a = bVarArr;
        this.c = bVarArr.length;
    }
}
