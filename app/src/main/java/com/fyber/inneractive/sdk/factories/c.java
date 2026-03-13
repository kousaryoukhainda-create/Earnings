package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {
    public final Set<a> a = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(InneractiveAdSpot inneractiveAdSpot);

        com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* loaded from: classes.dex */
    public static class b {
        public static c a = new c();
    }

    public com.fyber.inneractive.sdk.interfaces.c a(InneractiveAdSpot inneractiveAdSpot) {
        for (a aVar : this.a) {
            if (aVar.a(inneractiveAdSpot)) {
                return aVar.b(inneractiveAdSpot);
            }
        }
        return null;
    }
}
