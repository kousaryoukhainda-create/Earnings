package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gr {
    private final PowerManager a;
    private PowerManager.WakeLock b;
    private boolean c;
    private boolean d;

    public gr(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            PowerManager powerManager = this.a;
            if (powerManager == null) {
                oc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.c = z;
        a();
    }

    public void b(boolean z) {
        this.d = z;
        a();
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
