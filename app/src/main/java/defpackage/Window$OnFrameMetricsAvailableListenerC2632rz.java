package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
/* renamed from: rz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class Window$OnFrameMetricsAvailableListenerC2632rz implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ C2718sz a;

    public Window$OnFrameMetricsAvailableListenerC2632rz(C2718sz c2718sz) {
        this.a = c2718sz;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C2718sz c2718sz = this.a;
        if ((c2718sz.d & 1) != 0) {
            SparseIntArray sparseIntArray = c2718sz.f[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
        int i3 = this.a.d;
    }
}
