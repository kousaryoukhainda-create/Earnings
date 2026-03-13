package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "PhoneMultiFactorInfoCreator")
/* loaded from: classes.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new Ql0(1);
    public final String b;
    public final String c;
    public final long d;
    public final String f;

    public PhoneMultiFactorInfo(long j, String str, String str2, String str3) {
        this.b = Preconditions.checkNotEmpty(str);
        this.c = str2;
        this.d = j;
        this.f = Preconditions.checkNotEmpty(str3);
    }

    public static PhoneMultiFactorInfo y(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
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
            jSONObject.putOpt("factorIdKey", Constants.SIGN_IN_METHOD_PHONE);
            jSONObject.putOpt("uid", this.b);
            jSONObject.putOpt("displayName", this.c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.d));
            jSONObject.putOpt("phoneNumber", this.f);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
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
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String x() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }
}
