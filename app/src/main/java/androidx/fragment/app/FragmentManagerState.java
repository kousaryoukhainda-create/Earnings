package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0884b(3);
    public ArrayList b;
    public ArrayList c;
    public BackStackRecordState[] d;
    public int f;
    public String g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.j);
    }
}
