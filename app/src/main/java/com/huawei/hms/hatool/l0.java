package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class l0 {
    private String a;
    private String b;
    private String c;
    private List<b1> d;
    private String e;

    public l0(String str, String str2, String str3, List<b1> list, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
    }

    private String a(String str, String str2) {
        String str3;
        String f = a1.f(str, str2);
        if (TextUtils.isEmpty(f)) {
            v.a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else if (!"diffprivacy".equals(str2)) {
            return "";
        } else {
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f);
    }

    private void b() {
        if (c0.a(q0.i(), "backup_event", 5242880)) {
            v.d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c = c();
        String a = n1.a(this.a, this.b, this.e);
        v.c("hmsSdk", "Update data cached into backup,spKey: " + a);
        d.b(q0.i(), "backup_event", a, c.toString());
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (b1 b1Var : this.d) {
            try {
                jSONArray.put(b1Var.d());
            } catch (JSONException unused) {
                v.c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private h1 d() {
        return k.a(this.d, this.a, this.b, this.e, this.c);
    }

    public void a() {
        g d1Var;
        b0 c;
        String str;
        String a = a(this.a, this.b);
        if (!TextUtils.isEmpty(a) || "preins".equals(this.b)) {
            if (!"_hms_config_tag".equals(this.a) && !"_openness_config_tag".equals(this.a)) {
                b();
            }
            h1 d = d();
            if (d != null) {
                byte[] a2 = a(d);
                if (a2.length == 0) {
                    str = "request body is empty";
                } else {
                    d1Var = new f(a2, a, this.a, this.b, this.e, this.d);
                    c = b0.b();
                }
            } else {
                d1Var = new d1(this.d, this.a, this.e, this.b);
                c = b0.c();
            }
            c.a(d1Var);
            return;
        }
        str = "collectUrl is empty";
        v.e("hmsSdk", str);
    }

    private byte[] a(h1 h1Var) {
        String str;
        try {
            JSONObject a = h1Var.a();
            if (a == null) {
                v.e("hmsSdk", "uploadEvents is null");
                return new byte[0];
            }
            return k1.a(a.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            v.e("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            v.e("hmsSdk", str);
            return new byte[0];
        }
    }
}
