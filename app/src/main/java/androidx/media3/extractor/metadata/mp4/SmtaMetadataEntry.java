package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.c;
/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new LQ(10);
    public final float b;
    public final int c;

    public SmtaMetadataEntry(float f, int i) {
        this.b = f;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.b == smtaMetadataEntry.b && this.c == smtaMetadataEntry.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.b).hashCode() + 527) * 31) + this.c;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ androidx.media3.common.b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void l(c cVar) {
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }
}
