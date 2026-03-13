package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.c6;
import com.applovin.impl.h5;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class u5 implements h5 {
    private final Context a;
    private final List b = new ArrayList();
    private final h5 c;
    private h5 d;
    private h5 e;
    private h5 f;
    private h5 g;
    private h5 h;
    private h5 i;
    private h5 j;
    private h5 k;

    /* loaded from: classes.dex */
    public static final class a implements h5.a {
        private final Context a;
        private final h5.a b;
        private xo c;

        public a(Context context) {
            this(context, new c6.b());
        }

        @Override // com.applovin.impl.h5.a
        /* renamed from: b */
        public u5 a() {
            u5 u5Var = new u5(this.a, this.b.a());
            xo xoVar = this.c;
            if (xoVar != null) {
                u5Var.a(xoVar);
            }
            return u5Var;
        }

        public a(Context context, h5.a aVar) {
            this.a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public u5(Context context, h5 h5Var) {
        this.a = context.getApplicationContext();
        this.c = (h5) b1.a(h5Var);
    }

    private void a(h5 h5Var) {
        for (int i = 0; i < this.b.size(); i++) {
            h5Var.a((xo) this.b.get(i));
        }
    }

    private h5 g() {
        if (this.e == null) {
            c1 c1Var = new c1(this.a);
            this.e = c1Var;
            a(c1Var);
        }
        return this.e;
    }

    private h5 h() {
        if (this.f == null) {
            r4 r4Var = new r4(this.a);
            this.f = r4Var;
            a(r4Var);
        }
        return this.f;
    }

    private h5 i() {
        if (this.i == null) {
            g5 g5Var = new g5();
            this.i = g5Var;
            a(g5Var);
        }
        return this.i;
    }

    private h5 j() {
        if (this.d == null) {
            o8 o8Var = new o8();
            this.d = o8Var;
            a(o8Var);
        }
        return this.d;
    }

    private h5 k() {
        if (this.j == null) {
            li liVar = new li(this.a);
            this.j = liVar;
            a(liVar);
        }
        return this.j;
    }

    private h5 l() {
        if (this.g == null) {
            try {
                h5 h5Var = (h5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.g = h5Var;
                a(h5Var);
            } catch (ClassNotFoundException unused) {
                oc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private h5 m() {
        if (this.h == null) {
            np npVar = new np();
            this.h = npVar;
            a(npVar);
        }
        return this.h;
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        h5 h5Var = this.k;
        if (h5Var == null) {
            return null;
        }
        return h5Var.c();
    }

    @Override // com.applovin.impl.h5
    public void close() {
        h5 h5Var = this.k;
        if (h5Var != null) {
            try {
                h5Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.applovin.impl.h5
    public Map e() {
        h5 h5Var = this.k;
        if (h5Var == null) {
            return Collections.emptyMap();
        }
        return h5Var.e();
    }

    @Override // com.applovin.impl.h5
    public void a(xo xoVar) {
        b1.a(xoVar);
        this.c.a(xoVar);
        this.b.add(xoVar);
        a(this.d, xoVar);
        a(this.e, xoVar);
        a(this.f, xoVar);
        a(this.g, xoVar);
        a(this.h, xoVar);
        a(this.i, xoVar);
        a(this.j, xoVar);
    }

    private void a(h5 h5Var, xo xoVar) {
        if (h5Var != null) {
            h5Var.a(xoVar);
        }
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        b1.b(this.k == null);
        String scheme = k5Var.a.getScheme();
        if (xp.a(k5Var.a)) {
            String path = k5Var.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                this.k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.k = h();
        } else if ("rtmp".equals(scheme)) {
            this.k = l();
        } else if ("udp".equals(scheme)) {
            this.k = m();
        } else if ("data".equals(scheme)) {
            this.k = i();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.k = this.c;
        } else {
            this.k = k();
        }
        return this.k.a(k5Var);
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        return ((h5) b1.a(this.k)).a(bArr, i, i2);
    }
}
