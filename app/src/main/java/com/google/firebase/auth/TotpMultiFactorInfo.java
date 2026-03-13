package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "TotpMultiFactorInfoCreator")
/* loaded from: classes.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    @NonNull
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new Ql0(3);
    public final String b;
    public final String c;
    public final long d;
    public final zzair f;

    public TotpMultiFactorInfo(String str, String str2, long j, zzair zzairVar) {
        this.b = Preconditions.checkNotEmpty(str);
        this.c = str2;
        this.d = j;
        this.f = (zzair) Preconditions.checkNotNull(zzairVar, "totpInfo cannot be null.");
    }

    public static TotpMultiFactorInfo y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzair());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String e() {
        return this.b;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String getDisplayName() {
        return this.c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.b);
            jSONObject.putOpt("displayName", this.c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.d));
            jSONObject.putOpt("totpInfo", this.f);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e);
        }
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final long w() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeLong(parcel, 3, this.d);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String x() {
        return "totp";
    }
}
