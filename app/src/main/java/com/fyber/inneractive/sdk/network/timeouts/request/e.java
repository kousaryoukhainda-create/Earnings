package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;
/* loaded from: classes.dex */
public class e extends a {
    public e(String str, j jVar, String str2) {
        super(str, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int a(j jVar, String str) {
        return jVar.c(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int b(j jVar, String str) {
        String str2 = this.l;
        jVar.getClass();
        String a = j.a(str, "min", "rat", j.i(str2));
        jVar.h(str);
        return jVar.a(a, jVar.a(j.a(str, "min", "rat", "all_mediators"), 5000));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int c(j jVar, String str) {
        int i;
        String str2 = this.l;
        jVar.getClass();
        String a = j.a(str, "rat", "perc", j.i(str2));
        String a2 = j.a(str, "rat", "perc", "all_mediators");
        if ("read".equalsIgnoreCase(str)) {
            i = 15;
        } else {
            i = 10;
        }
        return jVar.a(a, jVar.a(a2, i));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int a(j jVar) {
        return jVar.f(this.l);
    }
}
