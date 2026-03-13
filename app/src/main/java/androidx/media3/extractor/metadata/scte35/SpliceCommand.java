package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
/* loaded from: classes.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void l(c cVar) {
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }
}
