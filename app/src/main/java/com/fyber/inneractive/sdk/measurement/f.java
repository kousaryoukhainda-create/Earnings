package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.t;
import com.fyber.inneractive.sdk.response.i;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class f implements i {
    public URL a;
    public String b;
    public String d;
    public String e;
    public String f;
    public Map<t, List<String>> c = new HashMap();
    public boolean g = false;

    public void a(t tVar, String str) {
        List<String> list = this.c.get(tVar);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(tVar, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    public boolean b() {
        String str;
        if (this.g && this.a != null && ((str = this.b) == null || (!TextUtils.isEmpty(str) && this.b.equalsIgnoreCase("omid")))) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Verification{mJavaScriptResource=");
        sb.append(this.a);
        sb.append(", mTrackingEvents=");
        sb.append(this.c);
        sb.append(", mVerificationParameters='");
        sb.append(this.d);
        sb.append("', mVendor='");
        return AbstractC0324Hi.h(sb, this.e, "'}");
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(t tVar) {
        Map<t, List<String>> map;
        if (tVar == null || (map = this.c) == null) {
            return null;
        }
        return map.get(tVar);
    }

    public String a() {
        if (!this.g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.b)) {
            return "apiFramework = ";
        }
        if (!this.b.equalsIgnoreCase("omid")) {
            return AbstractC2437ph.g("apiFramework = ", this.b);
        }
        return AbstractC2437ph.g("JavaScriptResource_url = ", TextUtils.isEmpty(this.f) ? "" : this.f);
    }
}
