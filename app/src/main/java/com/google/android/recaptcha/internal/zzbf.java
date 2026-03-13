package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzbf {
    @NotNull
    private final SharedPreferences zza;

    public zzbf(@NotNull Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }

    @NotNull
    public final String zza() {
        String string = this.zza.getString("_GRECAPTCHA_KC", null);
        if (string == null) {
            return "";
        }
        return string;
    }

    public final void zzb(@NotNull Map map) {
        SharedPreferences.Editor edit = this.zza.edit();
        for (Map.Entry entry : map.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.commit();
    }
}
