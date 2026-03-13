package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new I1(25);
    public final Entry[] b;
    public final long c;

    /* loaded from: classes.dex */
    public interface Entry extends Parcelable {
        b j();

        void l(c cVar);

        byte[] u();
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i = Ha0.a;
        Entry[] entryArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.c, (Entry[]) copyOf);
    }

    public final Metadata b(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        return a(metadata.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (Arrays.equals(this.b, metadata.b) && this.c == metadata.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0957bf.L(this.c) + (Arrays.hashCode(this.b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.b));
        long j = this.c;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Entry[] entryArr = this.b;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.c);
    }

    public Metadata(long j, Entry... entryArr) {
        this.c = j;
        this.b = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.b = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.b;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.c = parcel.readLong();
                return;
            }
        }
    }
}
