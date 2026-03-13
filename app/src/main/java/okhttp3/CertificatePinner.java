package okhttp3;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
/* loaded from: classes2.dex */
public final class CertificatePinner {
    public static final CertificatePinner c = new CertificatePinner(new LinkedHashSet(new Builder().a), null);
    public final LinkedHashSet a;
    public final CertificateChainCleaner b;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public final ArrayList a = new ArrayList();
    }

    /* loaded from: classes2.dex */
    public static final class Pin {
        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            ((Pin) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(LinkedHashSet linkedHashSet, CertificateChainCleaner certificateChainCleaner) {
        this.a = linkedHashSet;
        this.b = certificateChainCleaner;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            return "sha256/" + C0343Ib.q(x509Certificate.getPublicKey().getEncoded()).h("SHA-256").e();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final void a(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            CertificateChainCleaner certificateChainCleaner = this.b;
            if (certificateChainCleaner != null) {
                list = certificateChainCleaner.a(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() > 0) {
                    ((Pin) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    ");
                sb.append((Pin) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        ((Pin) it.next()).getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Util.j(this.b, certificatePinner.b) && this.a.equals(certificatePinner.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        CertificateChainCleaner certificateChainCleaner = this.b;
        if (certificateChainCleaner != null) {
            i = certificateChainCleaner.hashCode();
        } else {
            i = 0;
        }
        return this.a.hashCode() + (i * 31);
    }
}
