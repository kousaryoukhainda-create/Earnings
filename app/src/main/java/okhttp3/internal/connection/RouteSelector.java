package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public final class RouteSelector {
    public final Address a;
    public final RouteDatabase b;
    public final Call c;
    public final EventListener d;
    public final List e;
    public int f;
    public List g = Collections.emptyList();
    public final ArrayList h = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class Selection {
        public final ArrayList a;
        public int b = 0;

        public Selection(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List m;
        this.e = Collections.emptyList();
        this.a = address;
        this.b = routeDatabase;
        this.c = call;
        this.d = eventListener;
        List<Proxy> select = address.g.select(address.a.m());
        if (select != null && !select.isEmpty()) {
            m = Util.l(select);
        } else {
            m = Util.m(Proxy.NO_PROXY);
        }
        this.e = m;
        this.f = 0;
    }

    public final void a(Route route, IOException iOException) {
        Address address;
        ProxySelector proxySelector;
        if (route.b.type() != Proxy.Type.DIRECT && (proxySelector = (address = this.a).g) != null) {
            proxySelector.connectFailed(address.a.m(), route.b.address(), iOException);
        }
        RouteDatabase routeDatabase = this.b;
        synchronized (routeDatabase) {
            routeDatabase.a.add(route);
        }
    }

    public final Selection b() {
        boolean z;
        String str;
        int i;
        boolean contains;
        if (this.f < this.e.size() || !this.h.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            while (this.f < this.e.size()) {
                if (this.f < this.e.size()) {
                    z = true;
                } else {
                    z = false;
                }
                Address address = this.a;
                if (z) {
                    List list = this.e;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    Proxy proxy = (Proxy) list.get(i2);
                    this.g = new ArrayList();
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress address2 = proxy.address();
                        if (address2 instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                            InetAddress address3 = inetSocketAddress.getAddress();
                            if (address3 == null) {
                                str = inetSocketAddress.getHostName();
                            } else {
                                str = address3.getHostAddress();
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address2.getClass());
                        }
                    } else {
                        HttpUrl httpUrl = address.a;
                        str = httpUrl.d;
                        i = httpUrl.e;
                    }
                    if (i >= 1 && i <= 65535) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            this.g.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            this.d.getClass();
                            List a = address.b.a(str);
                            if (!a.isEmpty()) {
                                int size = a.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    this.g.add(new InetSocketAddress((InetAddress) a.get(i3), i));
                                }
                            } else {
                                throw new UnknownHostException(address.b + " returned no addresses for " + str);
                            }
                        }
                        int size2 = this.g.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Route route = new Route(this.a, proxy, (InetSocketAddress) this.g.get(i4));
                            RouteDatabase routeDatabase = this.b;
                            synchronized (routeDatabase) {
                                contains = routeDatabase.a.contains(route);
                            }
                            if (contains) {
                                this.h.add(route);
                            } else {
                                arrayList.add(route);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + address.a.d + "; exhausted proxy configurations: " + this.e);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
