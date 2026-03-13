package com.fyber.fairbid;

import android.net.Uri;
import android.util.SparseArray;
import com.fyber.fairbid.g9;
import com.fyber.fairbid.oi;
import com.huawei.hms.framework.common.ContainerUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class el {
    public static final SparseArray<kh> j;
    public final String a;
    public final y5 b;
    public String c;
    public String d;
    public HashMap e;
    public boolean f = false;
    public boolean g = false;
    public boolean h = true;
    public boolean i = false;

    static {
        SparseArray<kh> sparseArray = new SparseArray<>(10);
        sparseArray.put(6, new d9());
        sparseArray.put(3, new g9.f());
        sparseArray.put(4, new g9.e());
        sparseArray.put(5, new g9.d());
        sparseArray.put(2, new g9.c());
        sparseArray.put(1, new g9.b());
        sparseArray.put(9, new oi.a());
        sparseArray.put(0, new bj());
        sparseArray.put(8, new nj());
        sparseArray.put(7, new jk());
        j = sparseArray;
    }

    public el(String str, y5 y5Var) {
        this.a = str;
        this.b = y5Var;
    }

    public final String a() {
        String str;
        HashMap hashMap = new HashMap();
        a(hashMap, 6);
        if (lc.a(this.e)) {
            hashMap.putAll(this.e);
        }
        hashMap.put("appid", this.b.a);
        if (this.h) {
            hashMap.put("uid", this.b.b);
        }
        a(hashMap, 0);
        a(hashMap, 2);
        a(hashMap, 1);
        a(hashMap, 8);
        a(hashMap, 7);
        a(hashMap, 9);
        String str2 = this.d;
        if (str2 != null) {
            hashMap.put("placement_id", str2);
        }
        if (this.f) {
            a(hashMap, 3);
        }
        if (this.g) {
            a(hashMap, 4);
        }
        a(hashMap, 5);
        if (Wh0.O(this.c)) {
            hashMap.put("request_id", this.c);
        }
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str3 = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            if (entry.getValue() != null) {
                str3 = (String) entry.getValue();
            }
            buildUpon.appendQueryParameter(str4, str3);
        }
        if (this.i) {
            String str5 = this.b.c;
            if (Wh0.O(str5)) {
                Iterator it2 = new TreeSet(hashMap.keySet()).iterator();
                String str6 = "";
                while (it2.hasNext()) {
                    String str7 = (String) it2.next();
                    String str8 = (String) hashMap.get(str7);
                    StringBuilder l = AbstractC0324Hi.l(str6);
                    if (str8 == null) {
                        str8 = "";
                    }
                    l.append(str7 + ContainerUtils.KEY_VALUE_DELIMITER + str8 + ContainerUtils.FIELD_DELIMITER);
                    str6 = l.toString();
                }
                try {
                    byte[] digest = MessageDigest.getInstance("SHA1").digest(AbstractC0324Hi.f(str6, str5).getBytes());
                    Formatter formatter = new Formatter();
                    int length = digest.length;
                    for (int i = 0; i < length; i++) {
                        formatter.format("%02x", Byte.valueOf(digest[i]));
                    }
                    str = formatter.toString();
                    formatter.close();
                } catch (NoSuchAlgorithmException e) {
                    C2053lA.c(e, "UrlBuilder", "SHA1 algorithm not available.");
                    str = "nosha1";
                }
                buildUpon.appendQueryParameter("signature", str);
            } else {
                C2053lA.b("UrlBuilder", "It was impossible to add the signature, the SecretKey has not been provided");
            }
        }
        return buildUpon.build().toString();
    }

    public static void a(HashMap hashMap, int i) {
        kh khVar = j.get(i);
        if (khVar != null) {
            hashMap.putAll(khVar.getParameters());
        }
    }
}
