package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new I1(5);
    public final String c;
    public final boolean d;
    public final boolean f;
    public final String[] g;
    public final Id3Frame[] h;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.c = str;
        this.d = z;
        this.f = z2;
        this.g = strArr;
        this.h = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.d == chapterTocFrame.d && this.f == chapterTocFrame.f && Ha0.a(this.c, chapterTocFrame.c) && Arrays.equals(this.g, chapterTocFrame.g) && Arrays.equals(this.h, chapterTocFrame.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((527 + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.g);
        Id3Frame[] id3FrameArr = this.h;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = Ha0.a;
        this.c = readString;
        this.d = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.h = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
