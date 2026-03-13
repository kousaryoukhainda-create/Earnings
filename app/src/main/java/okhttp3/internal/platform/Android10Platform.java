package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
class Android10Platform extends AndroidPlatform {
    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    public final void f(SSLSocket sSLSocket, String str, List list) {
        boolean isSupportedSocket;
        try {
            isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
            if (isSupportedSocket) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Platform.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // okhttp3.internal.platform.AndroidPlatform, okhttp3.internal.platform.Platform
    public final String i(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !applicationProtocol.isEmpty()) {
            return applicationProtocol;
        }
        return null;
    }
}
