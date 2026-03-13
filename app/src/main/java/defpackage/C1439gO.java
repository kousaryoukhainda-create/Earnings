package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
/* renamed from: gO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439gO extends AbstractC0401Kh {
    public static final String j = EI.e("NetworkStateTracker");
    public final ConnectivityManager g;
    public final C1353fO h;
    public final C2381p2 i;

    public C1439gO(Context context, N50 n50) {
        super(context, n50);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = new C1353fO(this);
        } else {
            this.i = new C2381p2(this, 4);
        }
    }

    @Override // defpackage.AbstractC0401Kh
    public final Object a() {
        return f();
    }

    @Override // defpackage.AbstractC0401Kh
    public final void d() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        String str = j;
        if (z) {
            try {
                EI.c().a(str, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                EI.c().b(str, "Received exception while registering network callback", e);
                return;
            }
        }
        EI.c().a(str, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.AbstractC0401Kh
    public final void e() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        String str = j;
        if (z) {
            try {
                EI.c().a(str, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                EI.c().b(str, "Received exception while unregistering network callback", e);
                return;
            }
        }
        EI.c().a(str, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eO] */
    public final C1267eO f() {
        boolean z;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean z2;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = connectivityManager.getActiveNetwork();
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            } catch (SecurityException e) {
                EI.c().b(j, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z2 = true;
                    boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z3 = true;
                    }
                    ?? obj = new Object();
                    obj.a = z;
                    obj.b = z2;
                    obj.c = isActiveNetworkMetered;
                    obj.d = z3;
                    return obj;
                }
            }
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z3 = true;
        }
        ?? obj2 = new Object();
        obj2.a = z;
        obj2.b = z2;
        obj2.c = isActiveNetworkMetered2;
        obj2.d = z3;
        return obj2;
    }
}
