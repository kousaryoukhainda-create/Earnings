package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import android.content.res.AssetManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes2.dex */
public class a {
    private static final HostnameVerifier a = new Object();

    public static HostnameVerifier a() {
        return a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            AssetManager assets = context.getAssets();
            return new C1622iZ(new C1992kZ(assets.open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
