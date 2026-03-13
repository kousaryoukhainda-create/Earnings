package defpackage;

import android.os.Handler;
import android.os.Looper;
/* renamed from: fg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1377fg {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
