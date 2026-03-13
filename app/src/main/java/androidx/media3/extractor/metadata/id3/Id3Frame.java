package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
/* loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String b;

    public Id3Frame(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void l(c cVar) {
    }

    public String toString() {
        return this.b;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }
}
