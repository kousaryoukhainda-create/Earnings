package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: Bt  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC0179Bt implements ServiceConnection {
    public boolean b = false;
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
