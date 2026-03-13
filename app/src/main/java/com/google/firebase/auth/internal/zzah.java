package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
/* loaded from: classes.dex */
public final class zzah implements SafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new LQ(24);
    public final long b;
    public final long c;

    public zzah(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static zzah a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzah(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.b);
        SafeParcelWriter.writeLong(parcel, 2, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
