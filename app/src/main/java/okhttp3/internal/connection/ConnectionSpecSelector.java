package okhttp3.internal.connection;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;
/* loaded from: classes2.dex */
public final class ConnectionSpecSelector {
    public final List a;
    public int b = 0;
    public boolean c;
    public boolean d;

    public ConnectionSpecSelector(List list) {
        this.a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) {
        boolean z;
        ConnectionSpec connectionSpec;
        int i = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            z = true;
            if (i < size) {
                connectionSpec = (ConnectionSpec) list.get(i);
                if (connectionSpec.a(sSLSocket)) {
                    this.b = i + 1;
                    break;
                }
                i++;
            } else {
                connectionSpec = null;
                break;
            }
        }
        if (connectionSpec != null) {
            int i2 = this.b;
            while (true) {
                if (i2 < list.size()) {
                    if (((ConnectionSpec) list.get(i2)).a(sSLSocket)) {
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            this.c = z;
            Internal.a.c(connectionSpec, sSLSocket, this.d);
            return connectionSpec;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
