package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzii implements zzih {
    @NotNull
    private final Context zza;
    @NotNull
    private final Map zzb = C2148mJ.e(new JQ(2, Context.ACTIVITY_SERVICE), new JQ(3, Context.TELEPHONY_SERVICE), new JQ(4, Context.INPUT_METHOD_SERVICE), new JQ(5, Context.AUDIO_SERVICE));

    public zzii(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(@NotNull Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
            if (obj2 != null) {
                return this.zza.getSystemService((String) obj2);
            }
            throw new zzce(4, 4, null);
        }
        throw new zzce(4, 5, null);
    }
}
