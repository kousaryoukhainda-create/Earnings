package defpackage;

import android.hardware.display.DisplayManager;
/* renamed from: rb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597rb0 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ C2769tb0 b;

    public C2597rb0(C2769tb0 c2769tb0, DisplayManager displayManager) {
        this.b = c2769tb0;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C2769tb0.a(this.b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
