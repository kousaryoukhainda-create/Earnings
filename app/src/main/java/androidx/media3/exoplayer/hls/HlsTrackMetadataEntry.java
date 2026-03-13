package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new I1(13);
    public final String b;
    public final String c;
    public final List d;

    public HlsTrackMetadataEntry(String str, String str2, List list) {
        this.b = str;
        this.c = str2;
        this.d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        if (TextUtils.equals(this.b, hlsTrackMetadataEntry.b) && TextUtils.equals(this.c, hlsTrackMetadataEntry.c) && this.d.equals(hlsTrackMetadataEntry.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.d.hashCode() + ((i3 + i2) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void l(c cVar) {
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.b;
        if (str2 != null) {
            str = AbstractC0324Hi.h(AbstractC0324Hi.m(" [", str2, ", "), this.c, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        List list = this.d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new Object();
        public final int b;
        public final int c;
        public final String d;
        public final String f;
        public final String g;
        public final String h;

        public VariantInfo(int i, int i2, String str, String str2, String str3, String str4) {
            this.b = i;
            this.c = i2;
            this.d = str;
            this.f = str2;
            this.g = str3;
            this.h = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            if (this.b == variantInfo.b && this.c == variantInfo.c && TextUtils.equals(this.d, variantInfo.d) && TextUtils.equals(this.f, variantInfo.f) && TextUtils.equals(this.g, variantInfo.g) && TextUtils.equals(this.h, variantInfo.h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.b * 31) + this.c) * 31;
            int i5 = 0;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.f;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.g;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.h;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
        }

        public VariantInfo(Parcel parcel) {
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
        }
    }
}
