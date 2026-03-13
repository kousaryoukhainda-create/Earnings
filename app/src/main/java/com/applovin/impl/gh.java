package com.applovin.impl;

import android.content.Context;
/* loaded from: classes.dex */
public class gh {
    private final String a;
    private final String b;
    private final boolean c;

    public gh(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = z3.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }
}
