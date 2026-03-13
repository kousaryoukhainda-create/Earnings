package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new HlsTrackMetadataEntry.VariantInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new HlsTrackMetadataEntry.VariantInfo[i];
    }
}
