package com.iab.omid.library.fyber;

import android.content.Context;
/* loaded from: classes2.dex */
public final class Omid {
    private static b INSTANCE = new b();
    public static final /* synthetic */ int a = 0;

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.a();
    }

    public static boolean isActive() {
        return INSTANCE.b();
    }

    public static void updateLastActivity() {
        INSTANCE.c();
    }
}
