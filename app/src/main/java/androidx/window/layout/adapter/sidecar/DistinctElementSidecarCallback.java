package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final J10 d;
    public final SidecarInterface.SidecarCallback e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(J10 j10, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = j10;
        this.e = sidecarCallback;
    }

    public void onDeviceStateChanged(@NonNull SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.a) {
            try {
                J10 j10 = this.d;
                SidecarDeviceState sidecarDeviceState2 = this.b;
                j10.getClass();
                if (J10.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.b = sidecarDeviceState;
                this.e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(@NonNull IBinder iBinder, @NonNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.a) {
            try {
                this.d.getClass();
                if (J10.d((SidecarWindowLayoutInfo) this.c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
