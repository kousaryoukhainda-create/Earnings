package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
/* loaded from: classes3.dex */
public final class zzcd implements ServiceConnection {
    final /* synthetic */ zzce zza;
    private volatile boolean zzb;
    private volatile zzfa zzc;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzcd zzcdVar;
        zzfa zzfaVar;
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zza.zzI("Service connected with null binder");
                notifyAll();
                return;
            }
            zzfa zzfaVar2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    if (queryLocalInterface instanceof zzfa) {
                        zzfaVar = (zzfa) queryLocalInterface;
                    } else {
                        zzfaVar = new zzfa(iBinder);
                    }
                    zzfaVar2 = zzfaVar;
                    this.zza.zzN("Bound to IAnalyticsService interface");
                } else {
                    this.zza.zzJ("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzI("Service connect failed to get IAnalyticsService");
            }
            if (zzfaVar2 == null) {
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzo = this.zza.zzo();
                    zzcdVar = this.zza.zza;
                    connectionTracker.unbindService(zzo, zzcdVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else if (!this.zzb) {
                this.zza.zzQ("onServiceConnected received after the timeout limit");
                this.zza.zzq().zzi(new zzcb(this, zzfaVar2));
            } else {
                this.zzc = zzfaVar2;
            }
            notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().zzi(new zzcc(this, componentName));
    }

    public final zzfa zza() {
        zzcd zzcdVar;
        com.google.android.gms.analytics.zzr.zzh();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcdVar = this.zza.zza;
            boolean bindService = connectionTracker.bindService(zzo, intent, zzcdVar, 129);
            this.zza.zzO("Bind to service requested", Boolean.valueOf(bindService));
            if (!bindService) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(((Long) zzew.zzL.zzb()).longValue());
            } catch (InterruptedException unused) {
                this.zza.zzQ("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzfa zzfaVar = this.zzc;
            this.zzc = null;
            if (zzfaVar == null) {
                this.zza.zzI("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzfaVar;
        }
    }
}
