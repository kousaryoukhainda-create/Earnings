package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;
/* loaded from: classes.dex */
public class i implements Comparator<e> {
    @Override // java.util.Comparator
    public int compare(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.d < eVar4.d) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
