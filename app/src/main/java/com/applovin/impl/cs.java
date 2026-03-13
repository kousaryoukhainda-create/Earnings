package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class cs {
    private final WifiManager a;
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public cs(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                oc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
