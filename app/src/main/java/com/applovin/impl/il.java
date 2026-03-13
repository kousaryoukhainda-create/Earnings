package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class il {
    private final Context a;
    private final Handler b;
    private final b c;
    private final AudioManager d;
    private c e;
    private int f;
    private int g;
    private boolean h;

    /* loaded from: classes.dex */
    public interface b {
        void a(int i, boolean z);

        void d(int i);
    }

    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            il.this.b.post(new Q(il.this, 1));
        }
    }

    public il(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) b1.b((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        this.h = a(audioManager, this.f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            oc.c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int b2 = b(this.d, this.f);
        boolean a2 = a(this.d, this.f);
        if (this.g != b2 || this.h != a2) {
            this.g = b2;
            this.h = a2;
            this.c.a(b2, a2);
        }
    }

    public void c() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                oc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    private static int b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            oc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public int a() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public void a(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        d();
        this.c.d(i);
    }

    public int b() {
        int streamMinVolume;
        if (xp.a >= 28) {
            streamMinVolume = this.d.getStreamMinVolume(this.f);
            return streamMinVolume;
        }
        return 0;
    }

    private static boolean a(AudioManager audioManager, int i) {
        boolean isStreamMute;
        if (xp.a < 23) {
            return b(audioManager, i) == 0;
        }
        isStreamMute = audioManager.isStreamMute(i);
        return isStreamMute;
    }
}
