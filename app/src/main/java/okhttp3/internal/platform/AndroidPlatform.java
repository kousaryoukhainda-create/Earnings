package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
/* loaded from: classes2.dex */
class AndroidPlatform extends Platform {
    public final OptionalMethod c;
    public final OptionalMethod d;
    public final OptionalMethod e;
    public final OptionalMethod f;
    public final CloseGuard g;

    /* loaded from: classes2.dex */
    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        public final Object a;
        public final Method b;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public final List a(String str, List list) {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AndroidTrustRootIndex implements TrustRootIndex {
        public final X509TrustManager a;
        public final Method b;

        public AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e) {
                throw Util.a("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidTrustRootIndex)) {
                return false;
            }
            AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
            if (this.a.equals(androidTrustRootIndex.a) && this.b.equals(androidTrustRootIndex.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CloseGuard {
        public final Method a;
        public final Method b;
        public final Method c;

        public CloseGuard(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public AndroidPlatform(OptionalMethod optionalMethod, OptionalMethod optionalMethod2, OptionalMethod optionalMethod3, OptionalMethod optionalMethod4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.g = new CloseGuard(method3, method2, method);
        this.c = optionalMethod;
        this.d = optionalMethod2;
        this.e = optionalMethod3;
        this.f = optionalMethod4;
    }

    public static boolean n(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kb, java.lang.Object] */
    @Override // okhttp3.internal.platform.Platform
    public void f(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.c.c(sSLSocket, Boolean.TRUE);
            this.d.c(sSLSocket, str);
        }
        OptionalMethod optionalMethod = this.f;
        if (optionalMethod != null && optionalMethod.a(sSLSocket.getClass()) != null) {
            ?? obj = new Object();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = (Protocol) list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    obj.C(protocol.b.length());
                    obj.F(protocol.b);
                }
            }
            try {
                optionalMethod.b(sSLSocket, obj.j(obj.c));
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
                AssertionError assertionError = new AssertionError("Unexpected exception");
                assertionError.initCause(targetException);
                throw assertionError;
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (Util.o(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L13;
     */
    @Override // okhttp3.internal.platform.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.net.ssl.SSLContext h() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L6
            r1 = 22
            if (r0 >= r1) goto Ld
        L6:
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Ld
            return r0
        Ld:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.AndroidPlatform.h():javax.net.ssl.SSLContext");
    }

    @Override // okhttp3.internal.platform.Platform
    public String i(SSLSocket sSLSocket) {
        OptionalMethod optionalMethod = this.e;
        if (optionalMethod == null || optionalMethod.a(sSLSocket.getClass()) == null) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) optionalMethod.b(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Util.d);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object j() {
        CloseGuard closeGuard = this.g;
        Method method = closeGuard.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            closeGuard.b.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean k(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return n(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw Util.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw Util.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw Util.a("unable to determine cleartext support", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void l(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void m(Object obj, String str) {
        CloseGuard closeGuard = this.g;
        closeGuard.getClass();
        if (obj != null) {
            try {
                closeGuard.c.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        l(5, str, null);
    }
}
