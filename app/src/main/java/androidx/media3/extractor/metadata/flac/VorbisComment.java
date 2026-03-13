package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
import com.huawei.hms.framework.common.ContainerUtils;
@Deprecated
/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new LQ(21);
    public final String b;
    public final String c;

    public VorbisComment(String str, String str2) {
        this.b = AbstractC1906jZ.R(str);
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (this.b.equals(vorbisComment.b) && this.c.equals(vorbisComment.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC2437ph.b(527, 31, this.b);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void l(c cVar) {
        String str = this.b;
        str.getClass();
        String str2 = this.c;
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                cVar.c = str2;
                return;
            case 1:
                cVar.a = str2;
                return;
            case 2:
                cVar.e = str2;
                return;
            case 3:
                cVar.d = str2;
                return;
            case 4:
                cVar.b = str2;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        return "VC: " + this.b + ContainerUtils.KEY_VALUE_DELIMITER + this.c;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = Ha0.a;
        this.b = readString;
        this.c = parcel.readString();
    }
}
