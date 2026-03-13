package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public abstract class b {
    public e a;
    public String b;
    public j c;
    public boolean d = true;

    public abstract e a();

    public void a(n nVar) {
        this.a = a();
    }

    public abstract void a(String str, a0 a0Var) throws Exception;

    public abstract boolean b();

    public e a(String str) throws Exception {
        this.d = str != null;
        e eVar = this.a;
        eVar.getClass();
        eVar.c = System.currentTimeMillis();
        this.c.a(this);
        String a = this.c.a();
        this.a.h = a;
        a0 b = com.fyber.inneractive.sdk.config.a.b(this.b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.b);
        IAlog.a("%s%s", IAlog.a(this), b);
        if (this.d) {
            a(str, b);
        } else if (!(this instanceof com.fyber.inneractive.sdk.dv.e)) {
            h hVar = new h(a);
            if (hVar.a) {
                String str2 = hVar.b;
                if (str2 != null && !TextUtils.isEmpty(str2.trim())) {
                    a(str2, b);
                } else {
                    throw new Exception("empty ad content detected. failing fast.");
                }
            }
        } else {
            a(a, b);
        }
        return this.a;
    }
}
