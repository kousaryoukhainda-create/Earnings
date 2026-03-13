package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public c(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.b;
        int i = this.a;
        String c = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        aVar.seekTo(i);
        IAlog.d(c + "timelog: seekTo took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
