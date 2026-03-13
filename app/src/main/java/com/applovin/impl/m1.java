package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* loaded from: classes.dex */
final class m1 {
    private final Context a;
    private final a b;
    private boolean c;

    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {
        private final b a;
        private final Handler b;

        public a(Handler handler, b bVar) {
            this.b = handler;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.c) {
                this.a.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    public m1(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else if (z || !this.c) {
        } else {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
