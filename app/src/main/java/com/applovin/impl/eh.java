package com.applovin.impl;

import java.util.Map;
/* loaded from: classes.dex */
public class eh {
    private final String a;
    private Map b;

    private eh(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static eh a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.b + "'}";
    }

    public Map a() {
        return this.b;
    }

    public static eh a(String str, Map map) {
        return new eh(str, map);
    }
}
