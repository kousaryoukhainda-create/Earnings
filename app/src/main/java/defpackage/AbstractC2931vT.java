package defpackage;

import android.os.Handler;
import android.os.Looper;
/* renamed from: vT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2931vT {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
