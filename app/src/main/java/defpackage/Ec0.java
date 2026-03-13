package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
/* renamed from: Ec0  reason: default package */
/* loaded from: classes.dex */
public abstract class Ec0 {
    public static final String a = EI.e("WakeLocks");
    public static final WeakHashMap b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, concat);
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
