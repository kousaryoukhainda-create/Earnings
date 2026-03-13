package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new I1(1);
    public final String c;
    public final String d;
    public final int f;
    public final byte[] g;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.c = str;
        this.d = str2;
        this.f = i;
        this.g = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f == apicFrame.f && Ha0.a(this.c, apicFrame.c) && Ha0.a(this.d, apicFrame.d) && Arrays.equals(this.g, apicFrame.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (527 + this.f) * 31;
        int i3 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.g) + ((i4 + i3) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, androidx.media3.common.Metadata.Entry
    public final void l(c cVar) {
        cVar.a(this.f, this.g);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f);
        parcel.writeByteArray(this.g);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = Ha0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.createByteArray();
    }
}
