package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;
/* loaded from: classes.dex */
public class b extends a {
    public b(String str, j jVar) {
        super(str, jVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int a(j jVar, String str) {
        return jVar.e(str);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int b(j jVar, String str) {
        jVar.getClass();
        String a = j.a(str, "min", "rat");
        jVar.h(str);
        return jVar.a(a, 5000);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int c(j jVar, String str) {
        int i;
        jVar.getClass();
        String a = j.a(str, "rat_perc");
        if ("read".equalsIgnoreCase(str)) {
            i = 15;
        } else {
            i = 10;
        }
        return jVar.a(a, i);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public int a(j jVar) {
        return jVar.d();
    }
}
