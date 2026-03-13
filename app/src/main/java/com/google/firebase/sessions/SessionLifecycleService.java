package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread b = new HandlerThread("FirebaseSessions_HandlerThread");
    public C00 c;
    public Messenger d;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            messenger = (Messenger) parcelableExtra;
        } else {
            messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            C00 c00 = this.c;
            if (c00 != null) {
                c00.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.d;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.c = new C00(looper);
        this.d = new Messenger(this.c);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.quit();
    }
}
