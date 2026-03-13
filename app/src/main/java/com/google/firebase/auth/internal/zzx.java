package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
/* loaded from: classes.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = new Ql0(12);
    public final String b;
    public final String c;
    public final C1243e5 d;
    public final boolean f;

    public zzx(boolean z) {
        this.f = z;
        this.c = null;
        this.b = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzx(String str, String str2, boolean z) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.b = str;
        this.c = str2;
        this.d = AbstractC1647im0.d(str2);
        this.f = z;
    }
}
