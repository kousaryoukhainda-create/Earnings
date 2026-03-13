package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new LQ(13);
    public final List b;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C2126m30(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C2126m30 c2126m30 = (C2126m30) list.get(i2);
            parcel.writeLong(c2126m30.a);
            parcel.writeByte(c2126m30.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2126m30.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c2126m30.d ? (byte) 1 : (byte) 0);
            List list2 = c2126m30.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C2040l30 c2040l30 = (C2040l30) list2.get(i3);
                parcel.writeInt(c2040l30.a);
                parcel.writeLong(c2040l30.b);
            }
            parcel.writeLong(c2126m30.e);
            parcel.writeByte(c2126m30.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c2126m30.h);
            parcel.writeInt(c2126m30.i);
            parcel.writeInt(c2126m30.j);
            parcel.writeInt(c2126m30.k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }
}
