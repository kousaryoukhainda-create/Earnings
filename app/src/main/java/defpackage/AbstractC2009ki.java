package defpackage;

import android.content.Context;
import java.io.File;
/* renamed from: ki  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2009ki {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
