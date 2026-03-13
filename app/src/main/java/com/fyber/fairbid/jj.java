package com.fyber.fairbid;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class jj {
    @NotNull
    public static final Handler a = new Handler(Looper.getMainLooper());

    @NotNull
    public static Handler a() {
        HandlerThread handlerThread = new HandlerThread("adTransparencyHandlerThread");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
