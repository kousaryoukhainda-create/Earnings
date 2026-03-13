package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m implements com.fyber.inneractive.sdk.cache.a<l> {
    @Override // com.fyber.inneractive.sdk.cache.a
    public /* bridge */ /* synthetic */ void a(l lVar) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public l a(String str) throws Exception {
        try {
            return l.a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        int i = com.fyber.inneractive.sdk.config.f.a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") == null) {
            Locale locale = Locale.ENGLISH;
            return "https://cdn2.inner-active.mobi/ia-sdk-config/features_config.json";
        }
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }
}
