package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new Object();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza zzaVar = (zza) this;
        parcel.writeParcelable(zzaVar.b, 0);
        parcel.writeInt(zzaVar.c ? 1 : 0);
    }
}
