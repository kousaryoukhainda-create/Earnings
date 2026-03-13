package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaex  reason: invalid package */
/* loaded from: classes3.dex */
public abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected C1571hv zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected Vl0 zzf;
    protected zzaey<ResultT> zzg;
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    private boolean zzu;
    protected final zzaez zzb = new zzaez(this);
    protected final List<AbstractC2156mR> zzh = new ArrayList();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaex$zza */
    /* loaded from: classes3.dex */
    public static class zza extends LifecycleCallback {
        private final List<AbstractC2156mR> zza;

        private zza(LifecycleFragment lifecycleFragment, List<AbstractC2156mR> list) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<AbstractC2156mR> list) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaex(int i) {
        this.zza = i;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(Vl0 vl0) {
        this.zzf = (Vl0) Preconditions.checkNotNull(vl0, "external failure callback cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(C1571hv c1571hv) {
        this.zzc = (C1571hv) Preconditions.checkNotNull(c1571hv, "firebaseApp cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        this.zzd = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(AbstractC2156mR abstractC2156mR, Activity activity, Executor executor, String str) {
        AbstractC2156mR zza2 = zzaft.zza(str, abstractC2156mR, this);
        synchronized (this.zzh) {
            this.zzh.add((AbstractC2156mR) Preconditions.checkNotNull(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public static /* synthetic */ void zza(zzaex zzaexVar) {
        zzaexVar.zzb();
        Preconditions.checkState(zzaexVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaex zzaexVar, Status status) {
        Vl0 vl0 = zzaexVar.zzf;
        if (vl0 != null) {
            vl0.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
