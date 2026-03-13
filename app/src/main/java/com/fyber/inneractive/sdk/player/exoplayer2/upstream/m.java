package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
/* loaded from: classes.dex */
public final class m implements g {
    public final g a;
    public final g b;
    public final g c;
    public final g d;
    public g e;

    public m(Context context, a0<? super g> a0Var, g gVar) {
        this.a = (g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.b = new q(a0Var);
        this.c = new c(context, a0Var);
        this.d = new e(context, a0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.e == null);
        String scheme = jVar.a.getScheme();
        Uri uri = jVar.a;
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals(Constants.FILE)) {
            if ("asset".equals(scheme)) {
                this.e = this.c;
            } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
                this.e = this.d;
            } else {
                this.e = this.a;
            }
        } else if (jVar.a.getPath().startsWith("/android_asset/")) {
            this.e = this.c;
        } else {
            this.e = this.b;
        }
        return this.e.a(jVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        g gVar = this.e;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        return this.e.a(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        g gVar = this.e;
        if (gVar == null) {
            return null;
        }
        return gVar.a();
    }
}
