package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
/* renamed from: hZ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1536hZ extends SSLSocketFactory {
    public static final String d;
    public static volatile C1536hZ e;
    public final SSLContext a;
    public Context b;
    public String[] c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        d = C1536hZ.class.getSimpleName();
        e = null;
    }

    public C1536hZ(Context context) {
        SSLContext sSLContext;
        InputStream inputStream;
        this.a = null;
        if (context == null) {
            AbstractC2618rm.l(d, "SecureSSLSocketFactory: context is null");
            return;
        }
        this.b = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 29) {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } else {
            sSLContext = SSLContext.getInstance("TLSv1.2");
        }
        this.a = sSLContext;
        System.currentTimeMillis();
        if (AbstractC1522hL.q == null) {
            AbstractC1522hL.q = context.getApplicationContext();
        }
        if (AbstractC1906jZ.a == null) {
            synchronized (AbstractC1906jZ.class) {
                if (AbstractC1906jZ.a == null) {
                    try {
                        inputStream = AbstractC0575Ra.j(context);
                    } catch (RuntimeException unused) {
                        AbstractC2618rm.l("SecureX509SingleInstance", "get files bks error");
                        inputStream = null;
                    }
                    if (inputStream == null) {
                        AbstractC2618rm.o("SecureX509SingleInstance", "get assets bks");
                        inputStream = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        AbstractC2618rm.o("SecureX509SingleInstance", "get files bks");
                    }
                    AbstractC1906jZ.a = new C1992kZ(inputStream);
                }
            }
        }
        System.currentTimeMillis();
        this.a.init(null, new X509TrustManager[]{AbstractC1906jZ.a}, null);
    }

    public static C1536hZ a(Context context) {
        System.currentTimeMillis();
        if (context != null && AbstractC1522hL.q == null) {
            AbstractC1522hL.q = context.getApplicationContext();
        }
        if (e == null) {
            synchronized (C1536hZ.class) {
                try {
                    if (e == null) {
                        e = new C1536hZ(context);
                    }
                } finally {
                }
            }
        }
        if (e.b == null && context != null) {
            C1536hZ c1536hZ = e;
            c1536hZ.getClass();
            c1536hZ.b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        String str2 = d;
        AbstractC2618rm.o(str2, "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            AbstractC2618rm.o(str2, "set default protocols");
            AbstractC2618rm.O(sSLSocket);
            AbstractC2618rm.o(str2, "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = AbstractC2618rm.f;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(strArr);
                for (String str3 : enabledCipherSuites) {
                    if (asList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = AbstractC2618rm.g;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str4);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        String str2 = d;
        AbstractC2618rm.o(str2, "createSocket s host port autoClose");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            AbstractC2618rm.o(str2, "set default protocols");
            AbstractC2618rm.O(sSLSocket);
            AbstractC2618rm.o(str2, "set default cipher suites");
            if (sSLSocket != null) {
                String[] strArr = AbstractC2618rm.f;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(strArr);
                for (String str3 : enabledCipherSuites) {
                    if (asList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = AbstractC2618rm.g;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : enabledCipherSuites2) {
                        String upperCase = str4.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str4);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
