package okhttp3;

import com.fyber.fairbid.http.connection.HttpConnection;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public final class Address {
    public final HttpUrl a;
    public final Dns b;
    public final SocketFactory c;
    public final Authenticator d;
    public final List e;
    public final List f;
    public final ProxySelector g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final CertificatePinner j;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, List list, List list2, ProxySelector proxySelector) {
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str2 = sSLSocketFactory != null ? HttpConnection.DEFAULT_SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            builder.a = "http";
        } else if (str2.equalsIgnoreCase(HttpConnection.DEFAULT_SCHEME)) {
            builder.a = HttpConnection.DEFAULT_SCHEME;
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str != null) {
            String b = Util.b(HttpUrl.i(false, str, 0, str.length()));
            if (b != null) {
                builder.d = b;
                if (i > 0 && i <= 65535) {
                    builder.e = i;
                    this.a = builder.a();
                    if (dns != null) {
                        this.b = dns;
                        if (socketFactory != null) {
                            this.c = socketFactory;
                            if (authenticator != null) {
                                this.d = authenticator;
                                if (list != null) {
                                    this.e = Util.l(list);
                                    if (list2 != null) {
                                        this.f = Util.l(list2);
                                        if (proxySelector != null) {
                                            this.g = proxySelector;
                                            this.h = sSLSocketFactory;
                                            this.i = hostnameVerifier;
                                            this.j = certificatePinner;
                                            return;
                                        }
                                        throw new NullPointerException("proxySelector == null");
                                    }
                                    throw new NullPointerException("connectionSpecs == null");
                                }
                                throw new NullPointerException("protocols == null");
                            }
                            throw new NullPointerException("proxyAuthenticator == null");
                        }
                        throw new NullPointerException("socketFactory == null");
                    }
                    throw new NullPointerException("dns == null");
                }
                throw new IllegalArgumentException(AbstractC0324Hi.e(i, "unexpected port: "));
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(Address address) {
        if (this.b.equals(address.b) && this.d.equals(address.d) && this.e.equals(address.e) && this.f.equals(address.f) && this.g.equals(address.g) && Util.j(null, null) && Util.j(this.h, address.h) && Util.j(this.i, address.i) && Util.j(this.j, address.j) && this.a.e == address.a.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (this.a.equals(address.a) && a(address)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int b = AbstractC2437ph.b(527, 31, this.a.i);
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        int hashCode3 = this.f.hashCode();
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.b.hashCode() + b) * 31)) * 31)) * 31)) * 31)) * 961;
        int i3 = 0;
        SSLSocketFactory sSLSocketFactory = this.h;
        if (sSLSocketFactory != null) {
            i = sSLSocketFactory.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode4 + i) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        if (hostnameVerifier != null) {
            i2 = hostnameVerifier.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        CertificatePinner certificatePinner = this.j;
        if (certificatePinner != null) {
            i3 = certificatePinner.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.a;
        sb.append(httpUrl.d);
        sb.append(":");
        sb.append(httpUrl.e);
        sb.append(", proxySelector=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
