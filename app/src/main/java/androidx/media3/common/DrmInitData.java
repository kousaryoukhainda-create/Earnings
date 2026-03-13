package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new I1(9);
    public final SchemeData[] b;
    public int c;
    public final String d;
    public final int f;

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public final DrmInitData a(String str) {
        if (Ha0.a(this.d, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.b);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = AbstractC0395Kb.a;
        if (uuid.equals(schemeData3.c)) {
            if (uuid.equals(schemeData4.c)) {
                return 0;
            }
            return 1;
        }
        return schemeData3.c.compareTo(schemeData4.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (Ha0.a(this.d, drmInitData.d) && Arrays.equals(this.b, drmInitData.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.c == 0) {
            String str = this.d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.c = (hashCode * 31) + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeTypedArray(this.b, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.d = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.b = schemeDataArr;
        this.f = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* loaded from: classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new Object();
        public int b;
        public final UUID c;
        public final String d;
        public final String f;
        public final byte[] g;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.c = uuid;
            this.d = str;
            str2.getClass();
            this.f = UM.l(str2);
            this.g = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!Ha0.a(this.d, schemeData.d) || !Ha0.a(this.f, schemeData.f) || !Ha0.a(this.c, schemeData.c) || !Arrays.equals(this.g, schemeData.g)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.b == 0) {
                int hashCode2 = this.c.hashCode() * 31;
                String str = this.d;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.b = Arrays.hashCode(this.g) + AbstractC2437ph.b((hashCode2 + hashCode) * 31, 31, this.f);
            }
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.d);
            parcel.writeString(this.f);
            parcel.writeByteArray(this.g);
        }

        public SchemeData(Parcel parcel) {
            this.c = new UUID(parcel.readLong(), parcel.readLong());
            this.d = parcel.readString();
            String readString = parcel.readString();
            int i = Ha0.a;
            this.f = readString;
            this.g = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = Ha0.a;
        this.b = schemeDataArr;
        this.f = schemeDataArr.length;
    }
}
