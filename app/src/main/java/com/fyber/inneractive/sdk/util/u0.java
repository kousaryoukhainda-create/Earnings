package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public class u0 {
    public static boolean a(String str) {
        int i = com.fyber.inneractive.sdk.config.f.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash")) {
            return true;
        }
        return false;
    }
}
