package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;
/* loaded from: classes.dex */
public class g implements Comparator<e> {
    public g(h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (eVar3 != null && eVar4 != null) {
            if (eVar4.d - eVar3.d > 0) {
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
