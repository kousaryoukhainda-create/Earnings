package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;
/* loaded from: classes2.dex */
public final class ConnectionSpec {
    public static final ConnectionSpec e;
    public static final ConnectionSpec f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(boolean z) {
            this.a = z;
        }

        public final void a(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.b = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final void b(CipherSuite... cipherSuiteArr) {
            if (this.a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i = 0; i < cipherSuiteArr.length; i++) {
                    strArr[i] = cipherSuiteArr[i].a;
                }
                a(strArr);
                return;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final void c(String... strArr) {
            if (this.a) {
                if (strArr.length != 0) {
                    this.c = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final void d(TlsVersion... tlsVersionArr) {
            if (this.a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i = 0; i < tlsVersionArr.length; i++) {
                    strArr[i] = tlsVersionArr[i].b;
                }
                c(strArr);
                return;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.q;
        CipherSuite cipherSuite2 = CipherSuite.r;
        CipherSuite cipherSuite3 = CipherSuite.s;
        CipherSuite cipherSuite4 = CipherSuite.t;
        CipherSuite cipherSuite5 = CipherSuite.u;
        CipherSuite cipherSuite6 = CipherSuite.k;
        CipherSuite cipherSuite7 = CipherSuite.m;
        CipherSuite cipherSuite8 = CipherSuite.l;
        CipherSuite cipherSuite9 = CipherSuite.n;
        CipherSuite cipherSuite10 = CipherSuite.p;
        CipherSuite cipherSuite11 = CipherSuite.o;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, cipherSuite10, cipherSuite11, CipherSuite.i, CipherSuite.j, CipherSuite.g, CipherSuite.h, CipherSuite.e, CipherSuite.f, CipherSuite.d};
        Builder builder = new Builder(true);
        builder.b(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.d(tlsVersion, tlsVersion2);
        if (builder.a) {
            builder.d = true;
            new ConnectionSpec(builder);
            Builder builder2 = new Builder(true);
            builder2.b(cipherSuiteArr2);
            TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
            builder2.d(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3);
            if (builder2.a) {
                builder2.d = true;
                e = new ConnectionSpec(builder2);
                Builder builder3 = new Builder(true);
                builder3.b(cipherSuiteArr2);
                builder3.d(tlsVersion3);
                if (builder3.a) {
                    builder3.d = true;
                    new ConnectionSpec(builder3);
                    f = new ConnectionSpec(new Builder(false));
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public ConnectionSpec(Builder builder) {
        this.a = builder.a;
        this.c = builder.b;
        this.d = builder.c;
        this.b = builder.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Util.p(Util.f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 != null && !Util.p(CipherSuite.b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2 && (!Arrays.equals(this.c, connectionSpec.c) || !Arrays.equals(this.d, connectionSpec.d) || this.b != connectionSpec.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.c;
        if (strArr == null) {
            str = "[all enabled]";
        } else {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(CipherSuite.a(str3));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str4 : strArr2) {
                arrayList2.add(TlsVersion.a(str4));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder q = BK.q("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions=");
        q.append(this.b);
        q.append(")");
        return q.toString();
    }
}
