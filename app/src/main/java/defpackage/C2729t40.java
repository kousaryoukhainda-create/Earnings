package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* renamed from: t40  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2729t40 implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            AbstractC2618rm.o("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            AbstractC1045cg0.a(x509Certificate, str);
            AsyncTaskC2693sg0.a();
            return true;
        } catch (SSLException e) {
            AbstractC2618rm.l("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
