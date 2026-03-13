package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        ?? obj = new Object();
        obj.b = parcel.readInt();
        obj.c = parcel.readInt();
        int readInt = parcel.readInt();
        obj.d = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            obj.f = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        obj.g = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            obj.h = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        obj.j = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        obj.k = z2;
        if (parcel.readInt() == 1) {
            z3 = true;
        }
        obj.l = z3;
        obj.i = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
