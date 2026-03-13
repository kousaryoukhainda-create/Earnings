package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzma extends zzg {
    protected zzlt zza;
    private volatile zzlt zzb;
    private volatile zzlt zzc;
    private final Map zzd;
    private com.google.android.gms.internal.measurement.zzdf zze;
    private volatile boolean zzf;
    private volatile zzlt zzg;
    private zzlt zzh;
    private boolean zzi;
    private final Object zzj;

    public zzma(zzib zzibVar) {
        super(zzibVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(zzlt zzltVar, boolean z, long j) {
        boolean z2;
        zzib zzibVar = this.zzu;
        zzibVar.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
        if (zzltVar != null && zzltVar.zzd) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zzibVar.zzh().zzb.zzd(z2, z, j) && zzltVar != null) {
            zzltVar.zzd = false;
        }
    }

    private final zzlt zzB(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.zzd;
        zzlt zzltVar = (zzlt) map.get(valueOf);
        if (zzltVar == null) {
            zzlt zzltVar2 = new zzlt(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(valueOf, zzltVar2);
            zzltVar = zzltVar2;
        }
        if (this.zzg != null) {
            return this.zzg;
        }
        return zzltVar;
    }

    private final void zzy(String str, zzlt zzltVar, boolean z) {
        zzlt zzltVar2;
        zzlt zzltVar3;
        String str2;
        if (this.zzb == null) {
            zzltVar2 = this.zzc;
        } else {
            zzltVar2 = this.zzb;
        }
        zzlt zzltVar4 = zzltVar2;
        if (zzltVar.zzb == null) {
            if (str != null) {
                str2 = zzi(str, "Activity");
            } else {
                str2 = null;
            }
            zzltVar3 = new zzlt(zzltVar.zza, str2, zzltVar.zzc, zzltVar.zze, zzltVar.zzf);
        } else {
            zzltVar3 = zzltVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzltVar3;
        zzib zzibVar = this.zzu;
        zzibVar.zzaW().zzj(new zzlv(this, zzltVar3, zzltVar4, zzibVar.zzaZ().elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzz(com.google.android.gms.measurement.internal.zzlt r16, com.google.android.gms.measurement.internal.zzlt r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzma.zzz(com.google.android.gms.measurement.internal.zzlt, com.google.android.gms.measurement.internal.zzlt, long, boolean, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final zzlt zzh(boolean z) {
        zzb();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzlt zzltVar = this.zza;
        if (zzltVar != null) {
            return zzltVar;
        }
        return this.zzh;
    }

    public final String zzi(String str, String str2) {
        String str3;
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str3 = split[length - 1];
        } else {
            str3 = "";
        }
        zzib zzibVar = this.zzu;
        if (str3.length() > zzibVar.zzc().zze(null, false)) {
            return str3.substring(0, zzibVar.zzc().zze(null, false));
        }
        return str3;
    }

    public final void zzj(Bundle bundle, long j) {
        String str;
        String str2;
        zzlt zzltVar;
        String str3;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                    if (zzdfVar != null) {
                        str3 = zzi(zzdfVar.zzb, "Activity");
                    } else {
                        str3 = "Activity";
                    }
                    string2 = str3;
                }
                zzlt zzltVar2 = this.zzb;
                if (this.zzf && zzltVar2 != null) {
                    this.zzf = false;
                    boolean equals = Objects.equals(zzltVar2.zzb, string2);
                    boolean equals2 = Objects.equals(zzltVar2.zza, string);
                    if (equals && equals2) {
                        this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzib zzibVar = this.zzu;
                zzgr zzk = zzibVar.zzaV().zzk();
                if (string == null) {
                    str = "null";
                } else {
                    str = string;
                }
                if (string2 == null) {
                    str2 = "null";
                } else {
                    str2 = string2;
                }
                zzk.zzc("Logging screen view with name, class", str, str2);
                if (this.zzb == null) {
                    zzltVar = this.zzc;
                } else {
                    zzltVar = this.zzb;
                }
                zzlt zzltVar3 = new zzlt(string, string2, zzibVar.zzk().zzd(), true, j);
                this.zzb = zzltVar3;
                this.zzc = zzltVar;
                this.zzg = zzltVar3;
                zzibVar.zzaW().zzj(new zzlu(this, bundle, zzltVar3, zzltVar, zzibVar.zzaZ().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public final void zzk(@NonNull com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2) {
        String str3;
        zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzv()) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlt zzltVar = this.zzb;
        if (zzltVar == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(valueOf) == null) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        String str4 = zzltVar.zzb;
        String str5 = zzltVar.zza;
        boolean equals = Objects.equals(str4, str2);
        boolean equals2 = Objects.equals(str5, str);
        if (equals && equals2) {
            zzibVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
        } else if (str != null && (str.length() <= 0 || str.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
        } else if (str2 != null && (str2.length() <= 0 || str2.length() > zzibVar.zzc().zze(null, false))) {
            zzibVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
        } else {
            zzgr zzk = zzibVar.zzaV().zzk();
            if (str == null) {
                str3 = "null";
            } else {
                str3 = str;
            }
            zzk.zzc("Setting current screen to name, class", str3, str2);
            zzlt zzltVar2 = new zzlt(str, str2, zzibVar.zzk().zzd());
            map.put(valueOf, zzltVar2);
            zzy(zzdfVar.zzb, zzltVar2, true);
        }
    }

    public final zzlt zzl() {
        return this.zzb;
    }

    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (this.zzu.zzc().zzv() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.zzd.put(Integer.valueOf(zzdfVar.zza), new zzlt(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    zzib zzibVar = this.zzu;
                    if (zzibVar.zzc().zzv()) {
                        this.zzg = null;
                        zzibVar.zzaW().zzj(new zzlz(this));
                    }
                }
            }
        }
        zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzibVar2.zzaW().zzj(new zzlw(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        zzd zzw = this.zzu.zzw();
        zzib zzibVar3 = zzw.zzu;
        zzibVar3.zzaW().zzj(new zzc(zzw, zzibVar3.zzaZ().elapsedRealtime()));
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzib zzibVar = this.zzu;
        long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        if (!zzibVar.zzc().zzv()) {
            this.zzb = null;
            zzibVar.zzaW().zzj(new zzlx(this, elapsedRealtime));
            return;
        }
        zzlt zzB = zzB(zzdfVar);
        this.zzc = this.zzb;
        this.zzb = null;
        zzibVar.zzaW().zzj(new zzly(this, zzB, elapsedRealtime));
    }

    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        zzlt zzltVar;
        if (this.zzu.zzc().zzv() && bundle != null && (zzltVar = (zzlt) this.zzd.get(Integer.valueOf(zzdfVar.zza))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", zzltVar.zzc);
            bundle2.putString("name", zzltVar.zza);
            bundle2.putString("referrer_name", zzltVar.zzb);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzdfVar)) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.zzu.zzc().zzv()) {
            return;
        }
        this.zzd.remove(Integer.valueOf(zzdfVar.zza));
    }

    public final /* synthetic */ void zzt(Bundle bundle, zzlt zzltVar, zzlt zzltVar2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzz(zzltVar, zzltVar2, j, true, this.zzu.zzk().zzF(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void zzu(zzlt zzltVar, zzlt zzltVar2, long j, boolean z, Bundle bundle) {
        zzz(zzltVar, zzltVar2, j, z, null);
    }

    public final /* synthetic */ void zzv(zzlt zzltVar, boolean z, long j) {
        zzA(zzltVar, false, j);
    }

    public final /* synthetic */ zzlt zzw() {
        return this.zzh;
    }

    public final /* synthetic */ void zzx(zzlt zzltVar) {
        this.zzh = null;
    }
}
