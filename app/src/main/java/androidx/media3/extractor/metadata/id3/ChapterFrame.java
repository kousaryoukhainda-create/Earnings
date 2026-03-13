package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new I1(4);
    public final String c;
    public final int d;
    public final int f;
    public final long g;
    public final long h;
    public final Id3Frame[] i;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.c = str;
        this.d = i;
        this.f = i2;
        this.g = j;
        this.h = j2;
        this.i = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.d == chapterFrame.d && this.f == chapterFrame.f && this.g == chapterFrame.g && this.h == chapterFrame.h && Ha0.a(this.c, chapterFrame.c) && Arrays.equals(this.i, chapterFrame.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((527 + this.d) * 31) + this.f) * 31) + ((int) this.g)) * 31) + ((int) this.h)) * 31;
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
        parcel.writeInt(this.d);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        Id3Frame[] id3FrameArr = this.i;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = Ha0.a;
        this.c = readString;
        this.d = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        this.i = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.i[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
