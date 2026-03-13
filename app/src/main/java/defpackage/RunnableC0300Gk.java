package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
/* renamed from: Gk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0300Gk implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Parcelable f;
    public final /* synthetic */ Object g;

    public RunnableC0300Gk(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.g = systemForegroundService;
        this.c = i;
        this.f = notification;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((BinderC0352Ik) this.g).c.onActivityResized(this.c, this.d, (Bundle) this.f);
                return;
            default:
                int i = Build.VERSION.SDK_INT;
                Notification notification = (Notification) this.f;
                int i2 = this.c;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.g;
                if (i >= 29) {
                    systemForegroundService.startForeground(i2, notification, this.d);
                    return;
                } else {
                    systemForegroundService.startForeground(i2, notification);
                    return;
                }
        }
    }

    public RunnableC0300Gk(BinderC0352Ik binderC0352Ik, int i, int i2, Bundle bundle) {
        this.g = binderC0352Ik;
        this.c = i;
        this.d = i2;
        this.f = bundle;
    }
}
