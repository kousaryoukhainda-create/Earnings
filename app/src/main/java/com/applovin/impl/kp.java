package com.applovin.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class kp implements nl {
    private final gp a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map f;

    public kp(gp gpVar, Map map, Map map2, Map map3) {
        Map emptyMap;
        this.a = gpVar;
        this.d = map2;
        this.f = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.c = emptyMap;
        this.b = gpVar.b();
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        return this.b[i];
    }

    @Override // com.applovin.impl.nl
    public List b(long j) {
        return this.a.a(j, this.c, this.d, this.f);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int a = xp.a(this.b, j, false, false);
        if (a < this.b.length) {
            return a;
        }
        return -1;
    }
}
