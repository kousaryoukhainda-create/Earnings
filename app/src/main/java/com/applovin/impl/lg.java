package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class lg {
    protected final AppLovinAdBase a;
    protected final com.applovin.impl.sdk.j b;
    protected final com.applovin.impl.sdk.n c;
    protected final String d;
    protected boolean e;
    protected AdSession f;
    protected AdEvents g;

    public lg(AppLovinAdBase appLovinAdBase) {
        this.a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.c = appLovinAdBase.getSdk().I();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder p = BK.p(str, ":");
            p.append(appLovinAdBase.getDspName());
            str = p.toString();
        }
        this.d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new RunnableC3301zj0(this, 0));
    }

    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a;
        if (!this.a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.d(this.d, "Skip starting session - Open Measurement disabled");
            }
        } else if (this.f != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.c;
                String str = this.d;
                nVar.k(str, "Attempting to start session again for ad: " + this.a);
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.d, "Starting session");
            }
            AdSessionConfiguration a2 = a();
            if (a2 == null || (a = a(webView)) == null) {
                return;
            }
            try {
                AdSession createAdSession = AdSession.createAdSession(a2, a);
                this.f = createAdSession;
                try {
                    this.g = AdEvents.createAdEvents(createAdSession);
                    a(this.f);
                    this.f.start();
                    this.e = true;
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.d, "Session started");
                    }
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.d, "Failed to create ad events", th);
                    }
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.d, "Failed to create session", th2);
                }
            }
        }
    }

    public /* synthetic */ void c() {
        this.g.impressionOccurred();
    }

    public /* synthetic */ void d() {
        this.g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new RunnableC3301zj0(this, 1));
    }

    public void g() {
        b("track impression event", new RunnableC3301zj0(this, 2));
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.e) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.c;
                    String str2 = this.d;
                    nVar.a(str2, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.c;
                String str3 = this.d;
                nVar2.a(str3, "Failed to run operation: " + str, th);
            }
        }
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new RunnableC1290ef0(28, this, webView));
    }

    public /* synthetic */ void a(String str) {
        this.f.error(ErrorType.VIDEO, str);
    }

    public /* synthetic */ void a(View view, List list) {
        this.f.registerAdView(view);
        this.f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ng ngVar = (ng) it.next();
            if (ngVar.c() != null) {
                try {
                    this.f.addFriendlyObstruction(ngVar.c(), ngVar.b(), ngVar.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.c;
                        String str = this.d;
                        nVar.a(str, "Failed to add friendly obstruction (" + ngVar + ")", th);
                    }
                }
            }
        }
    }

    public /* synthetic */ void b() {
        this.e = false;
        this.f.finish();
        this.f = null;
        this.g = null;
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new RunnableC1382fi0(2, this, str, runnable));
    }

    public void b(String str) {
        b("track error", new RunnableC1290ef0(27, this, str));
    }

    public void b(View view, List list) {
        b("update main view: " + view, new RunnableC1382fi0(3, this, view, list));
    }
}
