package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
class JdkWithJettyBootPlatform extends Platform {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    /* loaded from: classes2.dex */
    public static class JettyNegoProvider implements InvocationHandler {
        public final ArrayList a;
        public boolean b;
        public String c;

        public JettyNegoProvider(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            }
            boolean equals = name.equals("protocols");
            ArrayList arrayList = this.a;
            if (equals && objArr.length == 0) {
                return arrayList;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (arrayList.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.c = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.a("unable to remove alpn", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f, this.g}, new JettyNegoProvider(Platform.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.a("unable to set alpn", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String i(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            boolean z = jettyNegoProvider.b;
            if (!z && jettyNegoProvider.c == null) {
                Platform.a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z) {
                return null;
            } else {
                return jettyNegoProvider.c;
            }
        } catch (IllegalAccessException e) {
            e = e;
            throw Util.a("unable to get selected protocol", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw Util.a("unable to get selected protocol", e);
        }
    }
}
