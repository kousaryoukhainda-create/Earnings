package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.fyber.fairbid.sdk.session.UserSessionStorage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.adjoe.sdk.internal.AdjoeActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: xh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3125xh0 implements Runnable, Comparable {
    public final long b;
    public final int c;
    public final int d;
    public final boolean f;
    public final C3039wh0 g = new C3039wh0(this, 1);
    public final long h;
    public final Object i;
    public final Object j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final C2407pK q;
    public final AtomicReference r;
    public final AtomicReference s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public final AtomicReference v;
    public final AtomicBoolean w;
    public long x;
    public boolean y;
    public ArrayList z;

    public RunnableC3125xh0(String str, FrameLayout frameLayout, String str2, String str3, String str4, String str5, int i, C2407pK c2407pK) {
        DateTimeFormatter dateTimeFormatter = Kj0.a;
        this.h = System.currentTimeMillis();
        this.i = new Object();
        this.j = new Object();
        this.w = new AtomicBoolean(false);
        this.k = str;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.l = str2;
        this.p = i;
        this.q = c2407pK;
        this.r = new AtomicReference(frameLayout);
        this.s = new AtomicReference(null);
        this.t = new AtomicInteger(0);
        this.u = new AtomicInteger(0);
        this.v = new AtomicReference("");
        if (i != 2 && i != 3) {
            this.b = 8000L;
            this.c = 3;
            this.d = 20;
            this.f = true;
            return;
        }
        this.b = 2500L;
        this.c = 1;
        this.d = 20;
        this.f = false;
    }

    public static void f(RunnableC3125xh0 runnableC3125xh0, int i, String str) {
        runnableC3125xh0.getClass();
        AbstractC1930jl0.k("TLL2", "Failed to load tracking link (code " + i + "): " + str);
        runnableC3125xh0.v.set(str);
        if (i == 181472784 || i == 181472785) {
            runnableC3125xh0.k("crash_render_process_gone");
        }
        runnableC3125xh0.m();
    }

    public static void g(RunnableC3125xh0 runnableC3125xh0, String str, WebView webView, String str2, Object[] objArr) {
        runnableC3125xh0.getClass();
        try {
            AbstractC1930jl0.c("TLL2", str + ": " + str2 + " :: " + Arrays.toString(objArr));
            ArrayList arrayList = runnableC3125xh0.z;
            StringBuilder sb = new StringBuilder("[");
            DateTimeFormatter dateTimeFormatter = Kj0.a;
            sb.append(Kj0.a(System.currentTimeMillis()));
            sb.append(" -::- ");
            sb.append(str);
            sb.append(" -::- ");
            sb.append(webView);
            sb.append(" -::- ");
            sb.append(str2);
            sb.append(" -::- ");
            sb.append(Arrays.toString(objArr));
            sb.append("]");
            arrayList.add(sb.toString());
        } catch (Exception e) {
            AbstractC1930jl0.e("Pokemon", e);
        }
    }

    public final void e() {
        AtomicReference atomicReference = this.s;
        if (atomicReference.get() != null) {
            AbstractC1930jl0.f("TLL2", "createWebView called with existing WebView");
        }
        AbstractC1930jl0.c("TLL2", "Creating WebView");
        AtomicReference atomicReference2 = this.r;
        Context context = ((FrameLayout) atomicReference2.get()).getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        FrameLayout frameLayout = (FrameLayout) atomicReference2.get();
        WebView webView = (WebView) frameLayout.findViewById(708878);
        if (webView == null) {
            AbstractC1930jl0.c("TLL2", "No existing WebView found, creating it new");
            webView = new WebView(context.getApplicationContext());
            webView.setId(708878);
            frameLayout.addView(webView, layoutParams);
        }
        atomicReference.set(webView);
    }

    public final void h(String str, String str2) {
        C2407pK c2407pK;
        int i = this.p;
        boolean z = false;
        if (i == 2) {
            o("tracking_link_autoclick_load", str2);
        } else if (i == 3) {
            o("tracking_link_view_load", str2);
        } else {
            try {
                z = l(str, str2);
            } catch (Exception e) {
                AbstractC1930jl0.g("TLL2", "finishLoading: play store open failed with exception", e);
                FrameLayout frameLayout = (FrameLayout) this.r.get();
                if (frameLayout != null && frameLayout.getContext() != null) {
                    Context context = frameLayout.getContext();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(603979776);
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                        o("tracking_link_load", str2);
                        AbstractC1930jl0.c("TLL2", AbstractC0957bf.a("Started PlayStore with ", str));
                        z = true;
                    } else {
                        AbstractC1930jl0.k("TLL2", AbstractC0957bf.a("No App Market installed, or market deeplink changed: ", str));
                    }
                }
            }
        }
        if (this.w.getAndSet(true)) {
            AbstractC1930jl0.k("TLL2", "Task already timed out.");
            return;
        }
        this.g.cancel();
        WebView webView = (WebView) this.s.get();
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(null);
        webView.stopLoading();
        webView.setVisibility(4);
        AbstractC1930jl0.c("TLL2", "Finished loading of " + this.k);
        synchronized (this.i) {
            this.i.notifyAll();
        }
        if (this.p == 1 && (c2407pK = this.q) != null) {
            if (z) {
                String str3 = this.l;
                AdjoeActivity c = ((C2951vg0) c2407pK.c).c();
                if (c != null) {
                    c.runOnUiThread(new RunnableC1207dg0(str3, c));
                    return;
                }
                return;
            }
            String str4 = this.l;
            AdjoeActivity c2 = ((C2951vg0) c2407pK.c).c();
            if (c2 != null) {
                c2.runOnUiThread(new RunnableC1207dg0(str4, c2));
            }
        }
    }

    public final void i() {
        AbstractC1930jl0.c("TLL2", "Destroying WebView");
        AtomicReference atomicReference = this.r;
        if (atomicReference.get() != null) {
            ((FrameLayout) atomicReference.get()).removeAllViews();
        }
        WebView webView = (WebView) this.s.getAndSet(null);
        if (webView != null) {
            webView.setWebViewClient(new WebViewClient());
            webView.stopLoading();
            webView.onPause();
            webView.removeAllViews();
            webView.destroy();
        }
    }

    public final void j(String str) {
        WebView webView = (WebView) this.s.get();
        Context context = ((FrameLayout) this.r.get()).getContext();
        if (this.p == 2 && str.contains("https://prod.adjoe.zone")) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("type", "1").toString();
        }
        if (str.contains("{gaid}")) {
            str = str.replace("{gaid}", (CharSequence) C2176mf0.b.o(context).b("c", String.class, null));
        }
        String str2 = this.k;
        if (!str2.startsWith("http://play.google.com") && !str2.startsWith("https://play.google.com") && !str2.startsWith("market://")) {
            webView.setVisibility(0);
            webView.loadUrl(str);
            return;
        }
        AbstractC1930jl0.c("TLL2", "We got a market link.");
        n(str2);
    }

    public final void k(String str) {
        FrameLayout frameLayout = (FrameLayout) this.r.get();
        if (frameLayout != null && frameLayout.getContext() != null) {
            Context context = frameLayout.getContext();
            try {
                C1049ci0 c1049ci0 = C1049ci0.a;
                C1049ci0.c().k(context, this.m, this.n, this.l, this.o, str, (String) this.v.get(), this.k);
            } catch (Exception e) {
                AbstractC1930jl0.g("TLL2", "Error while posting failed tracking link", e);
            }
        }
    }

    public final boolean l(String str, String str2) {
        FrameLayout frameLayout = (FrameLayout) this.r.get();
        if (frameLayout == null || frameLayout.getContext() == null) {
            return false;
        }
        Context context = frameLayout.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(603979776);
        intent.setPackage("com.android.vending");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            o("tracking_link_load", str2);
            AbstractC1930jl0.c("TLL2", AbstractC0957bf.a("Started PlayStore with ", str));
            return true;
        }
        AbstractC1930jl0.f("TLL2", AbstractC0957bf.a("Play Store not installed, or market deeplink changed: ", str));
        o("tracking_link_load_no_playstore", str2);
        return false;
    }

    public final void m() {
        AtomicInteger atomicInteger = this.t;
        int andIncrement = atomicInteger.getAndIncrement();
        int i = this.c;
        int i2 = this.p;
        if (andIncrement < i) {
            StringBuilder b = Ki0.b("Retry ");
            b.append(atomicInteger);
            AbstractC1930jl0.c("TLL2", b.toString());
            this.u.set(0);
            WebView webView = (WebView) this.s.get();
            String str = (String) C2176mf0.b.o(((FrameLayout) this.r.get()).getContext()).b("d", String.class, null);
            if (str == null || str.isEmpty()) {
                str = webView.getSettings().getUserAgentString();
            }
            StringBuilder b2 = Ki0.b("Preparing WebView, user agent is '");
            b2.append(webView.getSettings().getUserAgentString());
            b2.append("'");
            AbstractC1930jl0.c("TLL2", b2.toString());
            String substring = str.substring(str.length() - 2);
            if (substring.equals(" .") || substring.equals(" ,") || substring.equals(" :")) {
                str = str.substring(0, str.length() - 2);
            }
            if (i2 != 0) {
                int i3 = i2 - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            str = AbstractC0957bf.a(str, " :");
                        }
                    } else {
                        str = AbstractC0957bf.a(str, " ,");
                    }
                } else {
                    str = AbstractC0957bf.a(str, " .");
                }
                AbstractC1930jl0.c("TLL2", "Set user agent to '" + str + "'");
                webView.getSettings().setUserAgentString(str);
                webView.loadUrl("about:blank");
                webView.clearHistory();
                webView.clearFormData();
                webView.clearMatches();
                webView.clearSslPreferences();
                if (this.y) {
                    AbstractC1930jl0.c("TLL2", "WebView is already prepared");
                } else {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                    webView.getSettings().setLoadsImagesAutomatically(false);
                    webView.getSettings().setCacheMode(2);
                    webView.setWebChromeClient(new C2209n2(this, 2));
                    webView.setWebViewClient(new C1296ei0(this, webView));
                    webView.setVisibility(4);
                    this.y = true;
                }
                StringBuilder b3 = Ki0.b("Loading URL ");
                String str2 = this.k;
                b3.append(str2);
                AbstractC1930jl0.c("TLL2", b3.toString());
                j(str2);
                return;
            }
            throw null;
        } else if (i2 == 1) {
            k("too_many_retries");
            StringBuilder b4 = Ki0.b("market://details?id=");
            b4.append(this.l);
            h(b4.toString(), "too_many_retries");
        } else {
            h((String) this.v.get(), "too_many_retries");
        }
    }

    public final void n(String str) {
        boolean z;
        this.v.set(str);
        if (!str.startsWith("http://play.google.com") && !str.startsWith("https://play.google.com") && !str.startsWith("market://")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AbstractC1930jl0.c("TLL2", AbstractC0957bf.a(str, " is Play Store URL"));
            String str2 = this.l;
            if (str2 == null || str2.isEmpty() || !str.contains(str2)) {
                int i = this.p;
                if (str2 != null || i != 2) {
                    if (i == 1) {
                        k("resolved_no_appid");
                        AbstractC1930jl0.c("TLL2", "Replacing URL with default");
                        StringBuilder b = Ki0.b("market://details?id=");
                        b.append(str2);
                        h(b.toString(), "resolved_no_appid");
                        return;
                    }
                    h(str, "resolved_no_appid");
                    return;
                }
            }
            h(str, "resolved");
            return;
        }
        if (!str.startsWith("msew:/")) {
            AtomicInteger atomicInteger = this.u;
            if (atomicInteger.incrementAndGet() < this.d) {
                AbstractC1930jl0.c("TLL2", AbstractC0957bf.a("Redirect to ", str));
                atomicInteger.incrementAndGet();
                j(str);
                return;
            }
        }
        m();
    }

    public final void o(String str, String str2) {
        FrameLayout frameLayout = (FrameLayout) this.r.get();
        if (frameLayout != null && frameLayout.getContext() != null) {
            try {
                Context context = frameLayout.getContext();
                HashMap hashMap = new HashMap();
                hashMap.put("tracking_link", this.k);
                hashMap.put("resolved_url", this.v.get());
                hashMap.put(Constants.REASON, str2);
                hashMap.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.l);
                hashMap.put("click_uuid", this.n);
                hashMap.put("targeting_group_uuid", this.m);
                hashMap.put("campaign_uuid", this.o);
                hashMap.put("retries", Integer.valueOf(this.t.get()));
                hashMap.put("redirects", this.u);
                DateTimeFormatter dateTimeFormatter = Kj0.a;
                hashMap.put(UserSessionStorage.DURATION, Long.valueOf(System.currentTimeMillis() - this.x));
                C1049ci0.d().h(context, new Ei0(str, Ri0.d, new HashMap(), hashMap, null));
            } catch (Exception e) {
                AbstractC1930jl0.e("TLL2", e);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: p */
    public final int compareTo(RunnableC3125xh0 runnableC3125xh0) {
        char c;
        if (runnableC3125xh0 == null) {
            return -1;
        }
        char c2 = 2;
        int i = runnableC3125xh0.p;
        if (i == 1) {
            c = 3;
        } else if (i == 2) {
            c = 2;
        } else if (i == 3) {
            c = 1;
        } else {
            throw null;
        }
        int i2 = this.p;
        if (i2 == 1) {
            c2 = 3;
        } else if (i2 != 2) {
            if (i2 == 3) {
                c2 = 1;
            } else {
                throw null;
            }
        }
        if (c > c2) {
            return 1;
        }
        return Long.valueOf(this.h).compareTo(Long.valueOf(runnableC3125xh0.h));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.i) {
                DateTimeFormatter dateTimeFormatter = Kj0.a;
                long currentTimeMillis = System.currentTimeMillis() + this.b;
                AbstractC3211yh0.a.post(new RunnableC2953vh0(this, 0));
                while (System.currentTimeMillis() < currentTimeMillis && !this.w.get()) {
                    this.i.wait(this.b);
                }
                AbstractC3211yh0.a.postDelayed(new C3039wh0(this, 0), 1500L);
                long currentTimeMillis2 = System.currentTimeMillis() + this.b;
                while (System.currentTimeMillis() < currentTimeMillis2 && this.r.get() != null) {
                    synchronized (this.j) {
                        this.j.wait(this.b);
                    }
                }
            }
        } catch (Exception e) {
            AbstractC1930jl0.e("Pokemon", e);
        }
    }

    public final String toString() {
        StringBuilder b = Ki0.b("LoaderTask{waitTime=");
        b.append(this.b);
        b.append(", maxRetries=");
        b.append(this.c);
        b.append(", maxRedirects=");
        b.append(this.d);
        b.append(", redirectAutoClicksManually=");
        b.append(this.f);
        b.append(", waitingTask=");
        b.append(this.g);
        b.append(", scheduledAt=");
        b.append(this.h);
        b.append(", lock=");
        b.append(this.i);
        b.append(", container=");
        b.append(this.r);
        b.append(", webView=");
        b.append(this.s);
        b.append(", trackingLink='");
        b.append(this.k);
        b.append('\'');
        b.append(", appId='");
        b.append(this.l);
        b.append('\'');
        b.append(", targetingGroupUUID='");
        b.append(this.m);
        b.append('\'');
        b.append(", clickUUID='");
        b.append(this.n);
        b.append('\'');
        b.append(", campaignUUID='");
        b.append(this.o);
        b.append('\'');
        b.append(", type=");
        int i = this.p;
        if (i != 0) {
            b.append(i - 1);
            b.append(", retries=");
            b.append(this.t);
            b.append(", redirects=");
            b.append(this.u);
            b.append(", currentUrl='");
            b.append(this.v);
            b.append('\'');
            b.append(", loadingStart=");
            b.append(this.x);
            b.append(", webViewPrepared=");
            b.append(this.y);
            b.append('}');
            return b.toString();
        }
        throw null;
    }
}
