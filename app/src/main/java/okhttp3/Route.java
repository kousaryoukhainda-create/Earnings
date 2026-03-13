package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* loaded from: classes2.dex */
public final class Route {
    public final Address a;
    public final Proxy b;
    public final InetSocketAddress c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address != null) {
            if (inetSocketAddress != null) {
                this.a = address;
                this.b = proxy;
                this.c = inetSocketAddress;
                return;
            }
            throw new NullPointerException("inetSocketAddress == null");
        }
        throw new NullPointerException("address == null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (route.a.equals(this.a) && route.b.equals(this.b) && route.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
