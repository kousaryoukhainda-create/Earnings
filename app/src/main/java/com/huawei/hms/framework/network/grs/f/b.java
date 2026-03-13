package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class b {
    private static final Map<String, b> b = new ConcurrentHashMap(16);
    private static final Object c = new Object();
    private a a;

    public b(Context context, boolean z) {
        a(context, z);
        b.put(context.getPackageName(), this);
    }

    public static b a(String str) {
        return b.get(str);
    }

    public Set<String> b() {
        return this.a.b();
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.a.a();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String a;
        synchronized (c) {
            a = this.a.a(context, aVar, grsBaseInfo, str, str2, z);
        }
        return a;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> a;
        synchronized (c) {
            a = this.a.a(context, aVar, grsBaseInfo, str, z);
        }
        return a;
    }

    private void a(Context context, boolean z) {
        long currentTimeMillis;
        String[] split;
        StringBuilder sb;
        long currentTimeMillis2 = System.currentTimeMillis();
        String a = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "Io.getConfigContent timeCost:" + (System.currentTimeMillis() - currentTimeMillis2));
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent:" + a);
        if (TextUtils.isEmpty(a)) {
            Logger.i("LocalManagerProxy", "Get config files list by AssetsManager");
            currentTimeMillis = System.currentTimeMillis();
            split = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            sb = new StringBuilder("list timeCost:");
        } else {
            currentTimeMillis = System.currentTimeMillis();
            Logger.i("LocalManagerProxy", "Get config files list use configFileListContent: " + a);
            split = a.split("#");
            sb = new StringBuilder("list timeCost:");
        }
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        Logger.i("LocalManagerProxy", sb.toString());
        List<String> arrayList = split == null ? new ArrayList<>() : Arrays.asList(split);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        Logger.i("LocalManagerProxy", "contains APP_20_CONFIG_FILE_NAME: " + arrayList.contains("grs_app_global_route_config.json"));
        this.a = new d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.a = new d(context, appConfigName, z);
        }
        if (!this.a.c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.a = new c(context, z);
        }
        this.a.a(context, arrayList);
        StringBuilder sb2 = new StringBuilder("on initLocalManager finish, check appGrs: ");
        sb2.append(this.a.a == null);
        Logger.i("LocalManagerProxy", sb2.toString());
    }
}
