package com.fyber.inneractive.sdk.player.ui;
/* loaded from: classes.dex */
public class n implements Runnable {
    public final /* synthetic */ l a;

    public n(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l lVar = this.a;
        int i = lVar.E + 200;
        lVar.E = i;
        lVar.x.setProgress(i);
        l lVar2 = this.a;
        if (lVar2.E == lVar2.F) {
            lVar2.G = null;
            lVar2.E = 0;
            lVar2.F = 0;
            return;
        }
        lVar2.postDelayed(lVar2.G, 200L);
    }
}
