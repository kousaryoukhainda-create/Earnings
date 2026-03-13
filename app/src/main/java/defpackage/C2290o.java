package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment$SavedState;
/* renamed from: o  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290o implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.c;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new Fragment$SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbsSavedState[i];
            default:
                return new Fragment$SavedState[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.c;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new Fragment$SavedState(parcel, classLoader);
        }
    }
}
