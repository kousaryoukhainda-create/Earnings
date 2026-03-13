package defpackage;

import android.os.Build;
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
/* renamed from: iZ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1622iZ extends SSLSocketFactory {
    public final SSLContext a;
    public String[] b;

    public C1622iZ(C1992kZ c1992kZ) {
        SSLContext sSLContext;
        this.a = null;
        if (Build.VERSION.SDK_INT >= 29) {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } else {
            sSLContext = SSLContext.getInstance("TLSv1.2");
        }
        this.a = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{c1992kZ}, null);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        AbstractC2618rm.o("SSLFNew", "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            AbstractC2618rm.o("SSLFNew", "set default protocols");
            AbstractC2618rm.O(sSLSocket);
            AbstractC2618rm.o("SSLFNew", "set default cipher");
            if (sSLSocket != null) {
                String[] strArr = AbstractC2618rm.f;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (asList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = AbstractC2618rm.g;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str3);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.b;
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
        AbstractC2618rm.o("SSLFNew", "createSocket");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            AbstractC2618rm.o("SSLFNew", "set default protocols");
            AbstractC2618rm.O(sSLSocket);
            AbstractC2618rm.o("SSLFNew", "set default cipher");
            if (sSLSocket != null) {
                String[] strArr = AbstractC2618rm.f;
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList = new ArrayList();
                List asList = Arrays.asList(strArr);
                for (String str2 : enabledCipherSuites) {
                    if (asList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    String[] strArr2 = AbstractC2618rm.g;
                    String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : enabledCipherSuites2) {
                        String upperCase = str3.toUpperCase(Locale.ENGLISH);
                        int i2 = 0;
                        while (true) {
                            if (i2 < 16) {
                                if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                    break;
                                }
                                i2++;
                            } else {
                                arrayList2.add(str3);
                                break;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                }
            }
            this.b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
