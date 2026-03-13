package com.fyber;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieSyncManager;
import com.fyber.fairbid.e7;
import com.fyber.fairbid.fl;
import com.fyber.fairbid.g9;
import com.fyber.fairbid.mf;
import com.fyber.fairbid.vi;
import com.fyber.fairbid.y5;
/* loaded from: classes.dex */
public final class e {
    public static final e g = new e();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public final c a;
    public g9 b;
    public final e7 c;
    public y5 d;
    public final y5.a e;
    public final vi f;

    public e() {
        this.a = c.c;
        this.b = null;
        this.c = null;
        this.d = y5.d;
    }

    public e(Context context, String str) {
        if (g9.b()) {
            if (mf.b(21)) {
                CookieSyncManager.createInstance(context);
            }
            this.a = new c();
            this.c = new e7();
            this.f = new vi();
        } else {
            C2053lA.g("Configurations", "Only devices with webkit installed and running Android API level 14 and above are supported");
            this.a = c.c;
            this.c = null;
        }
        this.d = y5.d;
        this.e = new y5.a(str).a(fl.a(context));
    }
}
