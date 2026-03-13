package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class x6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<x6> CREATOR = new a();
    private final b[] a;
    private int b;
    public final String c;
    public final int d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public x6[] newArray(int i) {
            return new x6[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public x6 createFromParcel(Parcel parcel) {
            return new x6(parcel);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private int a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        public b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = (String) xp.a((Object) parcel.readString());
            this.f = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return t2.a.equals(this.b) || uuid.equals(this.b);
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
            if (!xp.a((Object) this.c, (Object) bVar.c) || !xp.a((Object) this.d, (Object) bVar.d) || !xp.a(this.b, bVar.b) || !Arrays.equals(this.f, bVar.f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.a == 0) {
                int hashCode2 = this.b.hashCode() * 31;
                String str = this.c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.a = Arrays.hashCode(this.f) + AbstractC2437ph.b((hashCode2 + hashCode) * 31, 31, this.d);
            }
            return this.a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.f);
        }

        public b a(byte[] bArr) {
            return new b(this.b, this.c, this.d, bArr);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.b = (UUID) b1.a(uuid);
            this.c = str;
            this.d = (String) b1.a((Object) str2);
            this.f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public x6(Parcel parcel) {
        this.c = parcel.readString();
        b[] bVarArr = (b[]) xp.a((Object) ((b[]) parcel.createTypedArray(b.CREATOR)));
        this.a = bVarArr;
        this.d = bVarArr.length;
    }

    public x6 a(String str) {
        return xp.a((Object) this.c, (Object) str) ? this : new x6(str, false, this.a);
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
        if (obj == null || x6.class != obj.getClass()) {
            return false;
        }
        x6 x6Var = (x6) obj;
        if (xp.a((Object) this.c, (Object) x6Var.c) && Arrays.equals(this.a, x6Var.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.b == 0) {
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.b = (hashCode * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public b a(int i) {
        return this.a[i];
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = t2.a;
        if (uuid.equals(bVar.b)) {
            return uuid.equals(bVar2.b) ? 0 : 1;
        }
        return bVar.b.compareTo(bVar2.b);
    }

    private x6(String str, boolean z, b... bVarArr) {
        this.c = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public x6(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public x6(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public x6(b... bVarArr) {
        this(null, bVarArr);
    }
}
