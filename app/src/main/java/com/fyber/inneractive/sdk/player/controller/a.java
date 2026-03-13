package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class a extends g {
    public com.fyber.inneractive.sdk.player.mediaplayer.a p;
    public int q;
    public int r;
    public int s;
    public boolean t;

    public a(Context context) {
        super(context);
        this.q = 0;
        this.r = 2;
        this.s = 0;
        this.t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            aVar.reset();
            this.p.release();
            this.p = null;
        }
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void d(boolean z) {
        c(false);
        if (i() || !this.n) {
            this.n = z;
            com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
            if (aVar != null) {
                IAlog.a("%s unmute", aVar.c());
                aVar.d = false;
                if (aVar.b()) {
                    aVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.d(aVar));
                } else {
                    IAlog.a("%s unmute called when player is not ready!", aVar.c());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public Bitmap e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public String f() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int g() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            return aVar.t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int h() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            return aVar.s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean i() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            return aVar.d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void k() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            aVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void l() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", aVar.c(), Integer.valueOf(i), Boolean.valueOf(z));
            if (!aVar.b()) {
                IAlog.a("%s seek called when player is not ready!", aVar.c());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = aVar.b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", aVar.c());
                return;
            }
            aVar.a(bVar2);
            aVar.c = z;
            aVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.c(aVar, i));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b(boolean z) {
        c(true);
        if (i() && this.n) {
            return;
        }
        this.n = z;
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int d() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            return aVar.r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.p;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(boolean z) {
        if (this.p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.p = new com.fyber.inneractive.sdk.player.mediaplayer.a(this.a, this, this.i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(String str, int i) {
        this.p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i) {
        this.i.post(new g.b(i));
        if (i >= d()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i == this.q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i2 = this.s + 1;
            this.s = i2;
            if (i2 == this.r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.t = true;
            }
        } else if (this.t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.s = 0;
            this.t = false;
        }
        this.q = i;
    }
}
