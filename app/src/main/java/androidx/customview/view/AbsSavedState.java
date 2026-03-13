package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable b;
    public static final AbsSavedState c = new AbsSavedState();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C2290o(0);

    /* renamed from: androidx.customview.view.AbsSavedState$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.b = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.b = readParcelable == null ? c : readParcelable;
    }
}
