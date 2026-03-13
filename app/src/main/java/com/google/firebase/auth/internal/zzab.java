package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable implements InterfaceC2595ra0 {
    public static final Parcelable.Creator<zzab> CREATOR = new LQ(22);
    public String b;
    public String c;
    public String d;
    public String f;
    public Uri g;
    public String h;
    public String i;
    public boolean j;
    public String k;

    public zzab(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.b = str;
        this.c = str2;
        this.h = str3;
        this.i = str4;
        this.d = str5;
        this.f = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.g = Uri.parse(str6);
        }
        this.j = z;
        this.k = str7;
    }

    public static zzab c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaag(e);
        }
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String e() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getDisplayName() {
        return this.d;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getEmail() {
        return this.h;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getPhoneNumber() {
        return this.i;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final Uri getPhotoUrl() {
        String str = this.f;
        if (!TextUtils.isEmpty(str) && this.g == null) {
            this.g = Uri.parse(str);
        }
        return this.g;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final boolean h() {
        return this.j;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String p() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.writeString(parcel, 5, this.h, false);
        SafeParcelWriter.writeString(parcel, 6, this.i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.j);
        SafeParcelWriter.writeString(parcel, 8, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.b);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.c);
            jSONObject.putOpt("displayName", this.d);
            jSONObject.putOpt("photoUrl", this.f);
            jSONObject.putOpt("email", this.h);
            jSONObject.putOpt("phoneNumber", this.i);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.j));
            jSONObject.putOpt("rawUserInfo", this.k);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaag(e);
        }
    }
}
