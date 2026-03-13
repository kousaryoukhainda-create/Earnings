package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public class o implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a a;

    public o(com.fyber.inneractive.sdk.cache.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (p.a != null && (aVar = this.a) != null) {
                p.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
