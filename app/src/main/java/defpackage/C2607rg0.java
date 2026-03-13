package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
/* renamed from: rg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2607rg0 implements InterfaceC1660j {
    public static final HashMap h = new HashMap();
    public static final Object i = new Object();
    public final Context a;
    public final String b;
    public volatile C2935vX c;
    public final Object d = new Object();
    public C1490h e = C1490h.b;
    public final HashMap f = new HashMap();
    public volatile U5 g;

    public C2607rg0(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static C2607rg0 e(Context context) {
        C2607rg0 c2607rg0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (i) {
            try {
                HashMap hashMap = h;
                c2607rg0 = (C2607rg0) hashMap.get(packageName);
                if (c2607rg0 == null) {
                    c2607rg0 = new C2607rg0(context, packageName);
                    hashMap.put(packageName, c2607rg0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2607rg0;
    }

    @Override // defpackage.InterfaceC1660j
    public final String a() {
        return "DEFAULT_INSTANCE";
    }

    @Override // defpackage.InterfaceC1660j
    public final String b(String str) {
        Pf0 pf0;
        String a;
        if (this.c == null) {
            d();
        }
        int i2 = 0;
        if (str.length() > 0) {
            while (str.charAt(i2) == '/') {
                i2++;
            }
        }
        String str2 = "/" + str.substring(i2);
        String str3 = (String) this.f.get(str2);
        if (str3 == null) {
            HashMap hashMap = BF.a;
            if (!hashMap.containsKey(str2) || (pf0 = (Pf0) hashMap.get(str2)) == null) {
                a = null;
            } else {
                a = pf0.a(this);
            }
            if (a == null) {
                String string = this.c.getString(str2, null);
                if (U5.a(string)) {
                    return this.g.c(string);
                }
                return string;
            }
            return a;
        }
        return str3;
    }

    @Override // defpackage.InterfaceC1660j
    public final C1490h c() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.e == C1490h.b && this.c == null) {
            d();
        }
        return this.e;
    }

    public final void d() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = new C2935vX(this.a, this.b);
                        this.g = new U5(this.c);
                    }
                    if (this.e == C1490h.b) {
                        if (this.c != null) {
                            this.e = AbstractC2870uj.E(this.c.getString("/region", null), this.c.getString("/agcgw/url", null));
                        } else {
                            Log.w("AGConnectServiceConfig", "get route fail , config not ready");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1660j
    public final Context getContext() {
        return this.a;
    }
}
