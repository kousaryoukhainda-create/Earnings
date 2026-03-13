package com.applovin.impl;
/* loaded from: classes.dex */
public class f4 {
    public static int c = -1;
    public static int d = -100;
    public static int e = -200;
    public static int f = -300;
    private final int a;
    private final String b;

    public f4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinConsentFlowErrorImpl{code=");
        sb.append(this.a);
        sb.append(", message='");
        return AbstractC0324Hi.h(sb, this.b, "'}");
    }
}
