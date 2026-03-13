package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.entity.pay.PayStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public class j extends g {
    public j() {
        super("load_timeouts");
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "all_mediators";
        }
        return str.toLowerCase(Locale.US);
    }

    public int b(String str, String str2) {
        return a(a(str, "bidding", "global_timeout", i(str2)), a(a(str, "bidding", "global_timeout", "all_mediators"), a(a(str, "global_timeout", "all_mediators"), g(str) ? PayStatusCodes.PAY_STATE_CANCEL : HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
    }

    public int c(String str, String str2) {
        int i;
        String a = a(str, "global_timeout", i(str2));
        String a2 = a(str, "global_timeout", "all_mediators");
        if (g(str)) {
            i = PayStatusCodes.PAY_STATE_CANCEL;
        } else {
            i = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        }
        return a(a, a(a2, a(a(str, "global_timeout", "all_mediators"), i)));
    }

    public int d() {
        return a(a("timeout", "threshold"), 300);
    }

    public int e(String str) {
        return a(AbstractC0324Hi.f(str, "_global_timeout"), g(str) ? PayStatusCodes.PAY_STATE_CANCEL : HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    }

    public int f(String str) {
        return a(a("timeout", "threshold", i(str)), a(a("timeout", "threshold", "all_mediators"), 300));
    }

    public boolean g(String str) {
        if (!UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) && !UnitDisplayType.REWARDED.name().equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public final int h(String str) {
        "read".equalsIgnoreCase(str);
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        j jVar = new j();
        a(jVar);
        return jVar;
    }

    public boolean e() {
        return a("reverse_retries", true);
    }
}
