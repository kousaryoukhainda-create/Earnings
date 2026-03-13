package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new I1(26);
    public final int c;
    public final int d;
    public final int f;
    public final int[] g;
    public final int[] h;

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.c = i;
        this.d = i2;
        this.f = i3;
        this.g = iArr;
        this.h = iArr2;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.c == mlltFrame.c && this.d == mlltFrame.d && this.f == mlltFrame.f && Arrays.equals(this.g, mlltFrame.g) && Arrays.equals(this.h, mlltFrame.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.g);
        return Arrays.hashCode(this.h) + ((hashCode + ((((((527 + this.c) * 31) + this.d) * 31) + this.f) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeIntArray(this.h);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = Ha0.a;
        this.g = createIntArray;
        this.h = parcel.createIntArray();
    }
}
