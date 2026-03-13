package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b {
    public final HashMap<com.fyber.inneractive.sdk.response.a, InterfaceC0068b> a = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {
        public static b a = new b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0068b {
        com.fyber.inneractive.sdk.interfaces.a a();

        com.fyber.inneractive.sdk.response.b b();
    }

    public com.fyber.inneractive.sdk.response.b a(com.fyber.inneractive.sdk.response.a aVar) {
        InterfaceC0068b interfaceC0068b = this.a.get(aVar);
        if (interfaceC0068b != null) {
            return interfaceC0068b.b();
        }
        return null;
    }

    public void a(com.fyber.inneractive.sdk.response.a aVar, InterfaceC0068b interfaceC0068b) {
        if (this.a.containsKey(aVar)) {
            IAlog.e("Handler already exists for ad type %s! : %s", aVar, this.a.get(aVar));
        } else {
            this.a.put(aVar, interfaceC0068b);
        }
    }
}
