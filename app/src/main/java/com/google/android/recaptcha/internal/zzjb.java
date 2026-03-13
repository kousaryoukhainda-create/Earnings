package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzjb {
    @NotNull
    public static final Map zza() {
        LinkedHashMap f = C2148mJ.f(new JQ(-4, zzba.zzo), new JQ(-12, zzba.zzp), new JQ(-6, zzba.zzk), new JQ(-11, zzba.zzm), new JQ(-13, zzba.zzq), new JQ(-14, zzba.zzr), new JQ(-2, zzba.zzl), new JQ(-7, zzba.zzs), new JQ(-5, zzba.zzt), new JQ(-9, zzba.zzu), new JQ(-8, zzba.zzE), new JQ(-15, zzba.zzn), new JQ(-1, zzba.zzv), new JQ(-3, zzba.zzx), new JQ(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            f.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            f.put(1, zzba.zzA);
            f.put(2, zzba.zzB);
            f.put(0, zzba.zzC);
            f.put(3, zzba.zzD);
        }
        if (i >= 29) {
            f.put(4, zzba.zzz);
        }
        return f;
    }
}
