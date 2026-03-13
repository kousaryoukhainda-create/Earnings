package defpackage;

import android.content.SharedPreferences;
/* renamed from: t20  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2725t20 implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C2811u20 c;

    public RunnableC2725t20(C2811u20 c2811u20, boolean z) {
        this.c = c2811u20;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit = this.c.b().edit();
        edit.putBoolean("stop_all_tracking", this.b);
        edit.commit();
    }
}
