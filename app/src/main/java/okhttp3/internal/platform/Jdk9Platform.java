package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
final class Jdk9Platform extends Platform {
    public final Method c;
    public final Method d;

    public Jdk9Platform(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b = Platform.b(list);
            this.c.invoke(sSLParameters, b.toArray(new String[b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Util.a("unable to set ssl parameters", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw Util.a("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw Util.a("failed to get ALPN selected protocol", e2);
        }
    }
}
