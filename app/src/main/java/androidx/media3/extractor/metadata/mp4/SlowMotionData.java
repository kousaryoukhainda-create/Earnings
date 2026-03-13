package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Object();
    public final ArrayList b;

    /* loaded from: classes.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new Object();
        public final long b;
        public final long c;
        public final int d;

        public Segment(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            B10.j(z);
            this.b = j;
            this.c = j2;
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.b == segment.b && this.c == segment.c && this.d == segment.d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d)});
        }

        public final String toString() {
            int i = Ha0.a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.b + ", endTimeMs=" + this.c + ", speedDivisor=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.b = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).c;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((Segment) arrayList.get(i)).b < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).c;
                    i++;
                }
            }
        }
        B10.j(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.b.equals(((SlowMotionData) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ androidx.media3.common.b j() {
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void l(c cVar) {
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.b;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] u() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
    }
}
