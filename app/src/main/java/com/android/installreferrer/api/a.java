package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener b;
    public final /* synthetic */ b c;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.c = bVar;
        if (installReferrerStateListener != null) {
            this.b = installReferrerStateListener;
            return;
        }
        throw new RuntimeException("Please specify a listener to know when setup is done.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CC ac;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = BC.b;
        if (iBinder == null) {
            ac = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof CC) {
                ac = (CC) queryLocalInterface;
            } else {
                ac = new AC(iBinder);
            }
        }
        b bVar = this.c;
        bVar.c = ac;
        bVar.a = 2;
        this.b.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.c;
        bVar.c = null;
        bVar.a = 0;
        this.b.onInstallReferrerServiceDisconnected();
    }
}
