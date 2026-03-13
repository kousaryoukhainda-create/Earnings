package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class zzbcj implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcg
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbcc zzbccVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbccVar.zzk();
            }
        }
        if (zzbccVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbccVar.zzk();
            }
            return zzbccVar.zzb(bundle);
        } else if (zzbccVar.zze() == 1 && this.zzh.has(zzbccVar.zzl())) {
            return zzbccVar.zza(this.zzh);
        } else {
            return zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbch
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return zzbcj.this.zzc(zzbccVar);
                }
            });
        }
    }

    public final Object zzb(zzbcc zzbccVar) {
        if (!this.zzd && !this.zza) {
            return zzbccVar.zzk();
        }
        return zza(zzbccVar);
    }

    public final /* synthetic */ Object zzc(zzbcc zzbccVar) {
        return zzbccVar.zzc(this.zze);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011a, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcn.zza(new com.google.android.gms.internal.ads.zzbcf(r3))).optBoolean("local_flags_enabled") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:42:0x009e, B:43:0x00a5, B:52:0x00d4, B:53:0x00db, B:69:0x0122, B:70:0x0129, B:78:0x0150, B:79:0x0157, B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:72:0x012b, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:88:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:42:0x009e, B:43:0x00a5, B:52:0x00d4, B:53:0x00db, B:69:0x0122, B:70:0x0129, B:78:0x0150, B:79:0x0157, B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:72:0x012b, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:88:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcj.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
