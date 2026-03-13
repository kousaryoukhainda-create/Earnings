package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.p;
/* loaded from: classes.dex */
public class c implements a<String> {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fyber.inneractive.sdk.cache.a
    public String a(String str) throws Exception {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return String.valueOf(("fmp.endcard_" + this.a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public void a(String str) {
        String str2 = str;
        if (str2 != null) {
            p.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("fmp.endcard.data", str2).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        return this.a;
    }
}
