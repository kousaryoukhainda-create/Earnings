package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class i implements Runnable {
    public final /* synthetic */ g a;

    public i(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            for (g.f fVar : this.a.b) {
                fVar.g();
            }
        } catch (Exception e) {
            if (IAlog.a <= 3) {
                g gVar = this.a;
                gVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e, IAlog.a(gVar));
            }
        }
    }
}
