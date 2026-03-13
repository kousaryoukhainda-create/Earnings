package com.fyber.inneractive.sdk.config.global.features;
/* loaded from: classes.dex */
public class b extends g {
    public b() {
        super("child_mode");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public int d() {
        int i;
        Integer b = b("skip_time_sec");
        if (b != null) {
            i = b.intValue();
        } else {
            i = 5;
        }
        if (i < 0 || i > 8) {
            return 5;
        }
        return i;
    }
}
