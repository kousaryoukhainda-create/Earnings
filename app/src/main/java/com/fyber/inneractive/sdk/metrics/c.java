package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    public static final c d = new c();
    public final Map<String, f> a = new HashMap();
    public final Map<String, g> b = new HashMap();
    public final f c = new e();

    public f a(String str) {
        try {
            if (str == null) {
                return this.c;
            }
            f fVar = this.a.get(str);
            if (fVar == null) {
                d dVar = new d();
                this.a.put(str, dVar);
                return dVar;
            }
            return fVar;
        } catch (Exception unused) {
            return this.c;
        }
    }

    public g b(String str) {
        g gVar = this.b.get(str);
        if (gVar == null) {
            gVar = new h();
        }
        this.b.put(str, gVar);
        return gVar;
    }
}
