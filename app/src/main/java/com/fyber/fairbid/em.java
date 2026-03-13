package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class em {
    public static em c;
    public final y5 a = com.fyber.d.a().d;
    public final SharedPreferences b;

    public em(Context context) {
        this.b = context.getSharedPreferences("FyberPreferences", 0);
    }

    public static em a(Context context) {
        if (c == null) {
            synchronized (em.class) {
                try {
                    if (c == null) {
                        c = new em(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getString("DEFAULT_CURRENCY_ID_KEY_" + this.a.a, "");
    }
}
