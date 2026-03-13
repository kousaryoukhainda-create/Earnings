package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new I1(17);
    public final String c;
    public final String d;
    public final String f;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (Ha0.a(this.d, internalFrame.d) && Ha0.a(this.c, internalFrame.c) && Ha0.a(this.f, internalFrame.f)) {
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
        return i5 + i3;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.b + ": domain=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = Ha0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.f = parcel.readString();
    }
}
