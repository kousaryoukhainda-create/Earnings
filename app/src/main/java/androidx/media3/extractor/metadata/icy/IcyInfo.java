package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new I1(15);
    public final byte[] b;
    public final String c;
    public final String d;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyInfo.class == obj.getClass()) {
            return Arrays.equals(this.b, ((IcyInfo) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void l(c cVar) {
        String str = this.c;
        if (str != null) {
            cVar.a = str;
        }
    }

    public final String toString() {
        int length = this.b.length;
        return "ICY: title=\"" + this.c + "\", url=\"" + this.d + "\", rawMetadata.length=\"" + length + "\"";
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.b = createByteArray;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
