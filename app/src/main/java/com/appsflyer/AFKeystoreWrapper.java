package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.AFa1fSDK;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFInAppEventParameterName;
    public KeyStore AFInAppEventType;
    public final Object valueOf = new Object();
    public String AFKeystoreWrapper = "";
    public int values = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventParameterName = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventType = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.valueOf) {
            i = this.values;
        }
        return i;
    }

    public final boolean AFKeystoreWrapper() {
        boolean z;
        synchronized (this.valueOf) {
            try {
                KeyStore keyStore = this.AFInAppEventType;
                z = false;
                if (keyStore != null) {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (true) {
                        if (!aliases.hasMoreElements()) {
                            break;
                        }
                        String nextElement = aliases.nextElement();
                        if (nextElement != null && AFInAppEventParameterName(nextElement)) {
                            String[] split = nextElement.split(",");
                            if (split.length == 3) {
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(nextElement));
                                z = true;
                                String[] split2 = split[1].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
                                String[] split3 = split[2].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
                                if (split2.length == 2 && split3.length == 2) {
                                    this.AFKeystoreWrapper = split2[1].trim();
                                    this.values = Integer.parseInt(split3[1].trim());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final String valueOf() {
        String str;
        synchronized (this.valueOf) {
            str = this.AFKeystoreWrapper;
        }
        return str;
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.valueOf) {
            sb.append(this.AFKeystoreWrapper);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.values);
        }
        return sb.toString();
    }

    public final void AFKeystoreWrapper(String str) {
        AlgorithmParameterSpec build;
        KeyGenParameterSpec.Builder certificateSubject;
        KeyGenParameterSpec.Builder certificateSerialNumber;
        KeyGenParameterSpec.Builder certificateNotBefore;
        KeyGenParameterSpec.Builder certificateNotAfter;
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.valueOf) {
                if (!this.AFInAppEventType.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.g();
                        certificateSubject = a.d(str).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer"));
                        certificateSerialNumber = certificateSubject.setCertificateSerialNumber(BigInteger.ONE);
                        certificateNotBefore = certificateSerialNumber.setCertificateNotBefore(calendar.getTime());
                        certificateNotAfter = certificateNotBefore.setCertificateNotAfter(calendar2.getTime());
                        build = certificateNotAfter.build();
                    } else {
                        build = !AFa1fSDK.valueOf() ? new KeyPairGeneratorSpec.Builder(this.AFInAppEventParameterName).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build() : null;
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }
}
