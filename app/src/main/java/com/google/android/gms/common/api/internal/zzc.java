package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzc {
    private final Map zza = DesugarCollections.synchronizedMap(new Z10());
    private int zzb = 0;
    private Bundle zzc;

    public final LifecycleCallback zzc(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.zza.get(str));
    }

    public final void zzd(String str, LifecycleCallback lifecycleCallback) {
        if (!this.zza.containsKey(str)) {
            this.zza.put(str, lifecycleCallback);
            if (this.zzb > 0) {
                new zzh(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC2437ph.h("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final void zze(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void zzf(int i, int i2, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.onActivityResult(i, i2, intent);
        }
    }

    public final void zzg(Bundle bundle) {
        Bundle bundle2;
        this.zzb = 1;
        this.zzc = bundle;
        for (Map.Entry entry : this.zza.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void zzh() {
        this.zzb = 5;
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    public final void zzi() {
        this.zzb = 3;
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.onResume();
        }
    }

    public final void zzj(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.zza.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void zzk() {
        this.zzb = 2;
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.onStart();
        }
    }

    public final void zzl() {
        this.zzb = 4;
        for (LifecycleCallback lifecycleCallback : this.zza.values()) {
            lifecycleCallback.onStop();
        }
    }

    public final boolean zzm() {
        return this.zzb > 0;
    }

    public final boolean zzn() {
        return this.zzb >= 2;
    }
}
