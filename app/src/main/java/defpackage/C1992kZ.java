package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* renamed from: kZ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1992kZ implements X509TrustManager {
    public final ArrayList a = new ArrayList();

    public C1992kZ(InputStream inputStream) {
        if (inputStream != null) {
            System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, "".toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.a.add((X509TrustManager) trustManager);
                        }
                    }
                    AbstractC0867af0.e(inputStream);
                } finally {
                    AbstractC0867af0.e(inputStream);
                }
            } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                AbstractC2618rm.l("SX509TM", "loadInputStream: exception : " + e.getMessage());
            }
            System.currentTimeMillis();
            return;
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        AbstractC2618rm.o("SX509TM", "checkClientTrusted: ");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                AbstractC2618rm.l("SX509TM", "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        AbstractC2618rm.o("SX509TM", "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Objects.toString(x509Certificate.getSubjectDN());
            Objects.toString(x509Certificate.getIssuerDN());
            Objects.toString(x509Certificate.getSerialNumber());
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC2618rm.o("SX509TM", "check server i=" + i);
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    AbstractC2618rm.o("SX509TM", "client root ca size=" + acceptedIssuers.length);
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        Objects.toString(x509Certificate2.getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                AbstractC2618rm.o("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                AbstractC2618rm.l("SX509TM", "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        AbstractC2618rm.l("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            AbstractC2618rm.l("SX509TM", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
