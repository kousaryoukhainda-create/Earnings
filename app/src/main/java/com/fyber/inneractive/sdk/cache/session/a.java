package com.fyber.inneractive.sdk.cache.session;

import java.util.HashMap;
/* loaded from: classes.dex */
public class a extends HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, h> {
    public final /* synthetic */ int a;

    public a(d dVar, int i) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        this.a = i;
        for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
            if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.NONE) {
                put(bVar, new h(this.a));
            }
        }
    }
}
