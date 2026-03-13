package defpackage;

import android.app.ActivityManager;
import android.content.Context;
/* renamed from: tA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2740tA {
    public final Runtime a = Runtime.getRuntime();
    public final ActivityManager b;
    public final ActivityManager.MemoryInfo c;

    static {
        Z2.d();
    }

    public C2740tA(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
