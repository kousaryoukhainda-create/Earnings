package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class h implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ g b;

    public h(g gVar, boolean z) {
        this.b = gVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.b;
        if (gVar.g) {
            return;
        }
        try {
            for (g.f fVar : gVar.b) {
                fVar.e(this.a);
            }
        } catch (Exception e) {
            if (IAlog.a <= 3) {
                g gVar2 = this.b;
                gVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e, IAlog.a(gVar2));
            }
        }
    }
}
