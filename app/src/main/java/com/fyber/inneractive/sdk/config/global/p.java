package com.fyber.inneractive.sdk.config.global;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class p implements n {
    public n a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        n nVar = this.a;
        if (nVar != null && nVar.a() != null && this.a.a().size() > 0) {
            return this.a.b(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        n nVar = this.a;
        if (nVar != null && nVar.a() != null && this.a.a().size() > 0) {
            return this.a.c(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        n nVar = this.a;
        if (nVar != null && nVar.a() != null && this.a.a().size() > 0) {
            return this.a.d(str);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        n nVar = this.a;
        if (nVar == null || nVar.a() == null || this.a.a().size() <= 0) {
            return null;
        }
        return this.a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Map<String, Object> a() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
