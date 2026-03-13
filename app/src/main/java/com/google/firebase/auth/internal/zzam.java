package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorSession;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
/* loaded from: classes.dex */
public final class zzam extends MultiFactorSession {
    public static final Parcelable.Creator<zzam> CREATOR = new Ql0(0);
    public String b;
    public String c;
    public ArrayList d;
    public ArrayList f;
    public zzaf g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.d, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
