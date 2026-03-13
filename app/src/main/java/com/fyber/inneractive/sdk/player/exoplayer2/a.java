package com.fyber.inneractive.sdk.player.exoplayer2;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class a implements n {
    public final int a;
    public o b;
    public int c;
    public int d;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.o e;
    public long f;
    public boolean g = true;
    public boolean h;

    public a(int i) {
        this.a = i;
    }

    public abstract void a(long j, boolean z) throws d;

    public abstract void a(boolean z) throws d;

    public void a(i[] iVarArr) throws d {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void c() {
        this.h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void d() throws d {
        boolean z;
        if (this.d == 2) {
            z = true;
        } else {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z);
        this.d = 1;
        r();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void e() throws IOException {
        this.e.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void f() throws d {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z);
        this.d = 2;
        q();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final boolean g() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final boolean h() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g j() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final int k() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void l() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(z);
        this.d = 0;
        this.e = null;
        this.h = false;
        p();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final a m() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.o n() {
        return this.e;
    }

    public abstract void p();

    public abstract void q() throws d;

    public abstract void r() throws d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(int i) {
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final int a() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(o oVar, i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar2, long j, boolean z, long j2) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.d == 0);
        this.b = oVar;
        this.d = 1;
        a(z);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.h);
        this.e = oVar2;
        this.g = false;
        this.f = j2;
        a(iVarArr);
        a(j, z);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar, long j) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.h);
        this.e = oVar;
        this.g = false;
        this.f = j;
        a(iVarArr);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(long j) throws d {
        this.h = false;
        this.g = false;
        a(j, false);
    }

    public final int a(j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z) {
        int a = this.e.a(jVar, bVar, z);
        if (a == -4) {
            if (bVar.b(4)) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            bVar.d += this.f;
        } else if (a == -5) {
            i iVar = jVar.a;
            long j = iVar.w;
            if (j != Long.MAX_VALUE) {
                jVar.a = iVar.a(j + this.f);
            }
        }
        return a;
    }
}
