package com.applovin.impl;

import java.util.Map;
/* renamed from: com.applovin.impl.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1077s {
    private final String a;
    private final String b;
    private final Map c;
    private final boolean d;

    public C1077s(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.b;
    }

    public Map b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.a + "', backupUrl='" + this.b + "', headers='" + this.c + "', shouldFireInWebView='" + this.d + "'}";
    }

    public C1077s(String str, String str2, Map map, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
    }
}
