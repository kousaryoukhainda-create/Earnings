package com.applovin.impl;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class a4 {
    private static final a a = new a("Age Restricted User", uj.m);
    private static final a b = new a("Has User Consent", uj.l);
    private static final a c = new a("\"Do Not Sell\"", uj.n);

    /* loaded from: classes.dex */
    public static class a {
        private final String a;
        private final uj b;

        public a(String str, uj ujVar) {
            this.a = str;
            this.b = ujVar;
        }

        public Boolean b(Context context) {
            if (context == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to get value for key: " + this.b);
                return null;
            }
            return (Boolean) vj.a(this.b, (Object) null, context);
        }

        public String a() {
            return this.a;
        }

        public String a(Context context) {
            Boolean b = b(context);
            return b != null ? b.toString() : "No value set";
        }
    }

    private static boolean a(uj ujVar, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Failed to update compliance value for key: " + ujVar);
            return false;
        }
        Boolean bool2 = (Boolean) vj.a(ujVar, (Object) null, context);
        vj.b(ujVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    public static a b() {
        return b;
    }

    public static a c() {
        return a;
    }

    public static boolean b(boolean z, Context context) {
        return a(uj.l, Boolean.valueOf(z), context);
    }

    public static a a() {
        return c;
    }

    public static boolean a(boolean z, Context context) {
        return a(uj.n, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(b, context) + a(c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.a + " - " + aVar.a(context);
    }
}
