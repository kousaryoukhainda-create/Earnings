package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: sz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2718sz extends C0335Ht {
    public static HandlerThread i;
    public static Handler j;
    public final int d;
    public SparseIntArray[] f;
    public final ArrayList g;
    public final Window$OnFrameMetricsAvailableListenerC2632rz h;

    public C2718sz() {
        super(3);
        this.f = new SparseIntArray[9];
        this.g = new ArrayList();
        this.h = new Window$OnFrameMetricsAvailableListenerC2632rz(this);
        this.d = 1;
    }

    @Override // defpackage.C0335Ht
    public final SparseIntArray[] A() {
        return this.f;
    }

    @Override // defpackage.C0335Ht
    public final SparseIntArray[] C(Activity activity) {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.h);
        return this.f;
    }

    @Override // defpackage.C0335Ht
    public final SparseIntArray[] D() {
        SparseIntArray[] sparseIntArrayArr = this.f;
        this.f = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // defpackage.C0335Ht
    public final void v(Activity activity) {
        if (i == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            i = handlerThread;
            handlerThread.start();
            j = new Handler(i.getLooper());
        }
        for (int i2 = 0; i2 <= 8; i2++) {
            SparseIntArray[] sparseIntArrayArr = this.f;
            if (sparseIntArrayArr[i2] == null && (this.d & (1 << i2)) != 0) {
                sparseIntArrayArr[i2] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.h, j);
        this.g.add(new WeakReference(activity));
    }
}
