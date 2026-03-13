package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new I1(12);
    public final String c;
    public final String d;
    public final String f;
    public final byte[] g;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (Ha0.a(this.c, geobFrame.c) && Ha0.a(this.d, geobFrame.d) && Ha0.a(this.f, geobFrame.f) && Arrays.equals(this.g, geobFrame.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.g) + ((i5 + i3) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", filename=" + this.d + ", description=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = Ha0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
    }
}
