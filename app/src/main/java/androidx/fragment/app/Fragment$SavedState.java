package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
@SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
/* loaded from: classes.dex */
public class Fragment$SavedState implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<Fragment$SavedState> CREATOR = new C2290o(1);
    public final Bundle b;

    public Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.b = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
