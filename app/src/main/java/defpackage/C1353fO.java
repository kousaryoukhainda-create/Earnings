package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* renamed from: fO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353fO extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C1439gO a;

    public C1353fO(C1439gO c1439gO) {
        this.a = c1439gO;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        EI c = EI.c();
        String str = C1439gO.j;
        c.a(str, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
        C1439gO c1439gO = this.a;
        c1439gO.c(c1439gO.f());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        EI.c().a(C1439gO.j, "Network connection lost", new Throwable[0]);
        C1439gO c1439gO = this.a;
        c1439gO.c(c1439gO.f());
    }
}
