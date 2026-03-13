package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.util.UUID;
/* loaded from: classes3.dex */
public final class zzfi {
    final /* synthetic */ zzfj zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzfi(zzfj zzfjVar, String str, long j, zzfh zzfhVar) {
        boolean z;
        this.zza = zzfjVar;
        Preconditions.checkNotEmpty("monitoring");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zzb = "monitoring";
        this.zzc = j;
    }

    private final long zzd() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zza;
        return sharedPreferences.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        SharedPreferences sharedPreferences;
        long currentTimeMillis = this.zza.zzC().currentTimeMillis();
        sharedPreferences = this.zza.zza;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), currentTimeMillis);
        edit.commit();
    }

    public final Pair zza() {
        long abs;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        long zzd = zzd();
        if (zzd == 0) {
            abs = 0;
        } else {
            abs = Math.abs(zzd - this.zza.zzC().currentTimeMillis());
        }
        long j = this.zzc;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            zzg();
            return null;
        }
        sharedPreferences = this.zza.zza;
        String string = sharedPreferences.getString(zzb(), null);
        sharedPreferences2 = this.zza.zza;
        long j2 = sharedPreferences2.getLong(zze(), 0L);
        zzg();
        if (string == null || j2 <= 0) {
            return null;
        }
        return new Pair(string, Long.valueOf(j2));
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            try {
                sharedPreferences = this.zza.zza;
                long j = sharedPreferences.getLong(zze(), 0L);
                if (j <= 0) {
                    sharedPreferences3 = this.zza.zza;
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    edit.putString(zzb(), str);
                    edit.putLong(zze(), 1L);
                    edit.apply();
                    return;
                }
                long j2 = j + 1;
                sharedPreferences2 = this.zza.zza;
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                    edit2.putString(zzb(), str);
                }
                edit2.putLong(zze(), j2);
                edit2.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
