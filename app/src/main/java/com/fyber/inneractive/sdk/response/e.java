package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class e {
    public String A;
    public String C;
    public String D;
    public String E;
    public String G;
    public long a;
    public long b;
    public long c;
    public String d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public UnitDisplayType n;
    public String o;
    public Map<String, String> p;
    public String q;
    public ImpressionData r;
    public com.fyber.inneractive.sdk.dv.g s;
    public String v;
    public Exception x;
    public String y;
    public String z;
    public int t = 0;
    public float u = -1.0f;
    public int w = -1;
    public boolean B = false;
    public com.fyber.inneractive.sdk.ignite.k F = com.fyber.inneractive.sdk.ignite.k.NONE;
    public boolean H = false;
    public long I = 0;

    public UnitDisplayType a() {
        return this.n;
    }

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest);

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar);

    public boolean b() {
        if (this.F != com.fyber.inneractive.sdk.ignite.k.NONE && !TextUtils.isEmpty(this.y) && !TextUtils.isEmpty(this.E) && !TextUtils.isEmpty(this.G)) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.a < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void a(com.fyber.inneractive.sdk.ignite.k kVar) {
        if (kVar == null) {
            kVar = com.fyber.inneractive.sdk.ignite.k.NONE;
        }
        this.F = kVar;
    }
}
