package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new LQ(14);
    public final int b;
    public final int c;
    public final int d;

    static {
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
    }

    public StreamKey() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.b - streamKey2.b;
        if (i == 0) {
            int i2 = this.c - streamKey2.c;
            if (i2 == 0) {
                return this.d - streamKey2.d;
            }
            return i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.b == streamKey.b && this.c == streamKey.c && this.d == streamKey.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public StreamKey(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
