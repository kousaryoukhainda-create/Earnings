package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.adjoe.sdk.Playtime;
/* renamed from: op  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2365op implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1930jl0.b("Adjoe Service Connected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1930jl0.k(Playtime.TAG, "Adjoe Service Disconnected");
    }
}
