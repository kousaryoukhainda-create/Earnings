package com.fyber;

import android.app.Activity;
import android.content.Context;
import com.fyber.fairbid.g9;
import com.fyber.fairbid.j2;
import com.fyber.fairbid.oi;
import com.fyber.fairbid.plugin.adtransparency.AdTransparencyPlugin;
import com.fyber.fairbid.y5;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class d {
    public static final String d;
    public static d e;
    public final Context a;
    public final e b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        Locale locale = Locale.ENGLISH;
        d = AdTransparencyPlugin.currentFairBidSdkVersion;
    }

    public d(String str, Activity activity) {
        this.b = new e(activity.getApplicationContext(), str);
        this.a = activity.getApplicationContext();
    }

    public static e a() {
        d dVar = e;
        if (dVar != null) {
            return dVar.b;
        }
        return e.g;
    }

    public static d c(String str, Activity activity) {
        String str2;
        d dVar = e;
        if (dVar == null) {
            if (activity != null) {
                if (!Wh0.P(str)) {
                    if (Wh0.O(str) && str.length() > 16) {
                        throw new IllegalArgumentException("Advertisers cannot start the sdk");
                    }
                    synchronized (d.class) {
                        try {
                            if (e == null) {
                                e = new d(str, activity);
                            }
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("App id cannot be null nor empty.");
                }
            } else {
                throw new IllegalArgumentException("Activity cannot be null.");
            }
        } else if (!dVar.c.get()) {
            y5.a aVar = e.b.e;
            aVar.getClass();
            if (str != null) {
                str2 = str.trim();
            } else {
                str2 = null;
            }
            aVar.a = str2;
        }
        return e;
    }

    public final void b() {
        if (this.c.compareAndSet(false, true) && g9.b()) {
            e eVar = this.b;
            Context context = this.a;
            if (eVar.b == null) {
                if (g9.r == null) {
                    synchronized (g9.class) {
                        try {
                            if (g9.r == null) {
                                oi.b(context);
                                g9.r = new g9(context);
                            }
                        } finally {
                        }
                    }
                }
                eVar.b = g9.r;
            }
            y5.a aVar = this.b.e;
            aVar.getClass();
            y5 y5Var = new y5(aVar);
            this.b.d = y5Var;
            try {
                String str = y5Var.a;
                if (Wh0.O(str) && str.length() > 16) {
                    throw new IllegalArgumentException("Advertiser AppID cannot be used to report an appstart");
                }
                new j2(str).report(this.a);
            } catch (VC unused) {
            }
        }
        c cVar = this.b.a;
    }
}
