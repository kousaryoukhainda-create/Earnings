package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.FragmentManagerState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                ?? obj = new Object();
                obj.b = parcel.readString();
                obj.c = parcel.readInt();
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.g = null;
                obj2.h = new ArrayList();
                obj2.i = new ArrayList();
                obj2.b = parcel.createStringArrayList();
                obj2.c = parcel.createStringArrayList();
                obj2.d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                obj2.f = parcel.readInt();
                obj2.g = parcel.readString();
                obj2.h = parcel.createStringArrayList();
                obj2.i = parcel.createTypedArrayList(BackStackState.CREATOR);
                obj2.j = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return obj2;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BackStackRecordState[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            default:
                return new FragmentState[i];
        }
    }
}
