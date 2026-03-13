package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;
@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
/* loaded from: classes.dex */
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new LQ(28);
    public final List b;
    public final zzam c;
    public final String d;
    public final zzc f;
    public final zzaf g;
    public final List h;

    public zzal(ArrayList arrayList, zzam zzamVar, String str, zzc zzcVar, zzaf zzafVar, ArrayList arrayList2) {
        this.b = (List) Preconditions.checkNotNull(arrayList);
        this.c = (zzam) Preconditions.checkNotNull(zzamVar);
        this.d = Preconditions.checkNotEmpty(str);
        this.f = zzcVar;
        this.g = zzafVar;
        this.h = (List) Preconditions.checkNotNull(arrayList2);
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo phoneMultiFactorInfo : this.b) {
            arrayList.add(phoneMultiFactorInfo);
        }
        for (TotpMultiFactorInfo totpMultiFactorInfo : this.h) {
            arrayList.add(totpMultiFactorInfo);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.c, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.g, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
