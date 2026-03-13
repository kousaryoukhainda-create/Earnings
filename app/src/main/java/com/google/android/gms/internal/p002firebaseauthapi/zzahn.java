package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;
@SafeParcelable.Class(creator = "GetTokenResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahn  reason: invalid package */
/* loaded from: classes3.dex */
public class zzahn extends AbstractSafeParcelable implements zzaer<zzahn> {
    public static final Parcelable.Creator<zzahn> CREATOR = new zzahm();
    private static final String zza = "zzahn";
    @SafeParcelable.Field(getter = "getRefreshToken", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getAccessToken", id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private Long zzd;
    @SafeParcelable.Field(getter = "getTokenType", id = 5)
    private String zze;
    @SafeParcelable.Field(getter = "getIssuedAt", id = 6)
    private Long zzf;

    public zzahn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzd */
    public final zzahn zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("refresh_token"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = Strings.emptyToNull(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajc.zza(e, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLongObject(parcel, 4, Long.valueOf(zza()), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        Long l = this.zzf;
        l.longValue();
        SafeParcelWriter.writeLongObject(parcel, 6, l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        Long l = this.zzd;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaag(e);
        }
    }

    public final boolean zzg() {
        if (DefaultClock.getInstance().currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue()) {
            return true;
        }
        return false;
    }

    public static zzahn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahn zzahnVar = new zzahn();
            zzahnVar.zzb = jSONObject.optString("refresh_token", null);
            zzahnVar.zzc = jSONObject.optString("access_token", null);
            zzahnVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahnVar.zze = jSONObject.optString("token_type", null);
            zzahnVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahnVar;
        } catch (JSONException e) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaag(e);
        }
    }

    public final void zzc(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    public zzahn(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    @SafeParcelable.Constructor
    public zzahn(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) Long l2) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l;
        this.zze = str3;
        this.zzf = l2;
    }

    public final String zzd() {
        return this.zzb;
    }
}
