package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.NonNull;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
@Deprecated
/* loaded from: classes3.dex */
public class Error {
    @NonNull
    public static final String JSON_ERROR_CODE = "errorCode";
    @NonNull
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(@NonNull ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    @NonNull
    public ErrorCode getErrorCode() {
        return this.zza;
    }

    @NonNull
    public String getErrorMessage() {
        return this.zzb;
    }

    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        if (this.zzb == null) {
            Locale locale = Locale.ENGLISH;
            return AbstractC2437ph.c(this.zza.getCode(), "{errorCode: ", "}");
        }
        Locale locale2 = Locale.ENGLISH;
        int code = this.zza.getCode();
        String str = this.zzb;
        return "{errorCode: " + code + ", errorMessage: " + str + "}";
    }

    public Error(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.zza = errorCode;
        this.zzb = str;
    }
}
