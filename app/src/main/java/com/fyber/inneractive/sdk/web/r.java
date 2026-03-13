package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.ignite.c;
import com.fyber.inneractive.sdk.ignite.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.e0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class r implements com.fyber.inneractive.sdk.ignite.n {
    public boolean B;
    public final WebView a;
    public final com.fyber.inneractive.sdk.ignite.c b;
    public final String c;
    public com.fyber.inneractive.sdk.ignite.k d;
    public final String e;
    public final String f;
    public final String g;
    public final com.fyber.inneractive.sdk.ignite.j h;
    public g i;
    public String k;
    public com.fyber.inneractive.sdk.config.global.s m;
    public long o;
    public Runnable p;
    public WeakReference<InternalStoreWebpageActivity> q;
    public String j = "invalid_task_id";
    public boolean l = false;
    public long n = 10;
    public boolean r = false;
    public boolean s = false;
    public final AtomicInteger t = new AtomicInteger(0);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final WebViewClient E = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewClient {

        /* renamed from: com.fyber.inneractive.sdk.web.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0112a implements Runnable {
            public RunnableC0112a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                r rVar = r.this;
                if (!rVar.y) {
                    rVar.g(rVar.k);
                }
            }
        }

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.u.a(r.this.q);
            if (activity != null) {
                activity.finish();
            }
            com.fyber.inneractive.sdk.util.q.b.postDelayed(new RunnableC0112a(), 1000L);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            if (str.endsWith("success")) {
                r rVar = r.this;
                Runnable runnable = rVar.p;
                if (runnable != null) {
                    com.fyber.inneractive.sdk.util.q.b.removeCallbacks(runnable);
                    rVar.p = null;
                }
                r rVar2 = r.this;
                rVar2.getClass();
                IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.a(rVar2), Long.valueOf(System.currentTimeMillis() - r.this.o));
                r.this.l = true;
                return true;
            } else if (!str.startsWith("exit")) {
                return false;
            } else {
                Activity activity = (Activity) com.fyber.inneractive.sdk.util.u.a(r.this.q);
                if (activity == null) {
                    return true;
                }
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("target");
                    boolean equals = TextUtils.equals("mail", parse.getAuthority());
                    if (equals) {
                        str2 = "android.intent.action.SENDTO";
                    } else {
                        str2 = "android.intent.action.VIEW";
                    }
                    Intent intent = new Intent(str2, Uri.parse(queryParameter));
                    if (equals) {
                        intent = Intent.createChooser(intent, "Choose an application");
                    }
                    com.fyber.inneractive.sdk.util.b0.a(activity, intent);
                } catch (Throwable th) {
                    com.fyber.inneractive.sdk.network.t.a(th, null, null);
                }
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.a("injecting JS: %s", this.a);
            try {
                if (this.a != null) {
                    WebView webView = r.this.a;
                    webView.loadUrl("javascript:" + this.a);
                }
            } catch (Exception unused) {
                IAlog.a("Failed to inject JS", new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements com.fyber.inneractive.sdk.ignite.h {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void a() {
            r.this.b();
            r rVar = r.this;
            ((p.a) rVar.h).a(com.fyber.inneractive.sdk.network.q.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.a, this.b, rVar.d);
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void b() {
            r rVar = r.this;
            rVar.b.a(rVar.c, new c.d(rVar.f, rVar.d, com.fyber.inneractive.sdk.flow.p.this));
            r.this.f("onShowInstallStarted();");
        }
    }

    /* loaded from: classes.dex */
    public class d implements com.fyber.inneractive.sdk.ignite.h {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void a() {
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void b() {
            r.this.e(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements g.b {
        public e() {
        }

        public void a(boolean z) {
            if (r.this.u.compareAndSet(false, true)) {
                r rVar = r.this;
                rVar.f("onCancelResult(" + z + ");");
                r.this.v.set(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (r.this.u.compareAndSet(false, true)) {
                r.this.f("onCancelResult(true);");
                r.this.v.set(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h {
        public h() {
        }

        @JavascriptInterface
        public void onBackButtonPressed() {
            WeakReference<InternalStoreWebpageActivity> weakReference = r.this.q;
            if (weakReference != null && weakReference.get() != null) {
                r.this.q.get().finish();
            }
        }

        @JavascriptInterface
        public void onCancelButtonPressed() {
            com.fyber.inneractive.sdk.ignite.k kVar;
            r rVar = r.this;
            if (rVar.B) {
                kVar = com.fyber.inneractive.sdk.ignite.k.TRUE_SINGLE_TAP;
            } else {
                kVar = com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP;
            }
            rVar.d = kVar;
            rVar.e(rVar.j);
            r rVar2 = r.this;
            if (rVar2.h != null && !rVar2.r && rVar2.d != null) {
                rVar2.r = true;
                r rVar3 = r.this;
                ((p.a) rVar3.h).a(com.fyber.inneractive.sdk.network.r.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, rVar3.d);
            }
        }

        @JavascriptInterface
        public void onInstallButtonPressed() {
            com.fyber.inneractive.sdk.ignite.k kVar;
            r rVar = r.this;
            if (rVar.B) {
                kVar = com.fyber.inneractive.sdk.ignite.k.TRUE_SINGLE_TAP;
            } else {
                kVar = com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP;
            }
            rVar.d = kVar;
            rVar.b.a(rVar.c, new c.d(rVar.f, kVar, com.fyber.inneractive.sdk.flow.p.this));
            r rVar2 = r.this;
            if (rVar2.h != null && !rVar2.s && rVar2.d != null) {
                rVar2.s = true;
                r rVar3 = r.this;
                ((p.a) rVar3.h).a(com.fyber.inneractive.sdk.network.r.IGNITE_FLOW_INSTALL_CLICKED, rVar3.d);
            }
        }

        @JavascriptInterface
        public void onNavigatedInsideStorePage() {
            r.this.w = true;
        }

        @JavascriptInterface
        public void onNavigatedToMainPage() {
            r.this.w = false;
        }

        @JavascriptInterface
        public void onOpenButtonPressed() {
            Intent launchIntentForPackage;
            if (!TextUtils.isEmpty(r.this.c)) {
                if (!TextUtils.isEmpty(r.this.g)) {
                    launchIntentForPackage = new Intent("android.intent.action.MAIN");
                    r rVar = r.this;
                    launchIntentForPackage.setClassName(rVar.c, rVar.g);
                } else {
                    launchIntentForPackage = com.fyber.inneractive.sdk.util.p.a.getPackageManager().getLaunchIntentForPackage(r.this.c);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setFlags(268435456);
                    try {
                        com.fyber.inneractive.sdk.util.p.a.startActivity(launchIntentForPackage);
                        return;
                    } catch (Exception e) {
                        com.fyber.inneractive.sdk.ignite.j jVar = r.this.h;
                        if (jVar != null) {
                            String simpleName = e.getClass().getSimpleName();
                            String message = e.getMessage();
                            com.fyber.inneractive.sdk.flow.p pVar = com.fyber.inneractive.sdk.flow.p.this;
                            com.fyber.inneractive.sdk.network.t.a(simpleName, message, pVar.a, pVar.b);
                            return;
                        }
                        return;
                    }
                }
                r rVar2 = r.this;
                rVar2.getClass();
                IAlog.e("%sPackage %s not found", IAlog.a(rVar2), r.this.c);
                return;
            }
            r rVar3 = r.this;
            rVar3.getClass();
            IAlog.e("%smPackageName is null", IAlog.a(rVar3));
        }

        @JavascriptInterface
        public void onTransitionEnded() {
            r.this.x = false;
        }

        @JavascriptInterface
        public void onTransitionStarting() {
            r.this.x = true;
        }
    }

    public r(t tVar) {
        this.c = tVar.a;
        this.d = tVar.b;
        this.e = tVar.c;
        this.m = tVar.d;
        this.f = tVar.e;
        this.g = tVar.f;
        this.h = tVar.g;
        com.fyber.inneractive.sdk.ignite.c d2 = IAConfigManager.d();
        this.b = d2;
        d2.a(this);
        this.a = new WebView(com.fyber.inneractive.sdk.util.p.a());
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void b(String str) {
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void d(String str) {
    }

    public void f(String str) {
        com.fyber.inneractive.sdk.util.q.b.post(new b(str));
    }

    public void g(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            this.k = str;
            WebSettings settings = this.a.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            this.a.setInitialScale(1);
            this.a.setBackgroundColor(-1);
            this.a.setWebViewClient(this.E);
            WebView webView = this.a;
            webView.setLongClickable(false);
            webView.setOnLongClickListener(new e0());
            this.a.addJavascriptInterface(new h(), "nativeInterface");
            this.a.loadUrl(str);
            com.fyber.inneractive.sdk.config.global.s sVar = this.m;
            if (sVar != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Integer b2 = ((com.fyber.inneractive.sdk.config.global.features.p) sVar.a(com.fyber.inneractive.sdk.config.global.features.p.class)).b("load_timeout");
                int i2 = 10;
                if (b2 != null) {
                    i = b2.intValue();
                } else {
                    i = 10;
                }
                if (i < 30 && i > 2) {
                    i2 = i;
                }
                long millis = timeUnit.toMillis(i2);
                this.n = millis;
                IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
            }
            this.o = System.currentTimeMillis();
            s sVar2 = new s(this);
            this.p = sVar2;
            com.fyber.inneractive.sdk.util.q.b.postDelayed(sVar2, this.n);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.c)) {
            return;
        }
        this.j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void c(String str) {
        this.z = false;
        this.A = true;
        if (this.j.equals(str)) {
            this.b.b();
            f("onInstallationSuccess();");
        }
    }

    public void e(String str) {
        com.fyber.inneractive.sdk.ignite.k kVar;
        if (str != null) {
            this.v.set(true);
            this.u.set(false);
            com.fyber.inneractive.sdk.ignite.c cVar = this.b;
            e eVar = new e();
            if (cVar.d() && !cVar.f()) {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = cVar.b;
                    Bundle bundle = cVar.g;
                    cVar.h.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.b(eVar));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    eVar.a(false);
                }
            } else {
                for (com.fyber.inneractive.sdk.ignite.n nVar : cVar.i) {
                    if (nVar != null) {
                        nVar.a((String) null, (cVar.f() ? com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED).e(), (String) null);
                    }
                }
            }
            com.fyber.inneractive.sdk.util.q.b.postDelayed(new f(), 2500L);
            com.fyber.inneractive.sdk.ignite.j jVar = this.h;
            if (jVar == null || this.r || (kVar = this.d) == null) {
                return;
            }
            this.r = true;
            ((p.a) jVar).a(com.fyber.inneractive.sdk.network.r.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, kVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void b(String str, String str2, String str3) {
        if (this.D) {
            this.z = false;
            if (this.j.equals(str)) {
                this.b.b();
                if (!this.v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    f("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED.e()) || str2.equals(com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED.e()))) || !this.b.d()) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new c(str2, str3));
                    return;
                }
                b();
                if (!this.b.e()) {
                    a((String) null, com.fyber.inneractive.sdk.ignite.i.FAILED_TO_BIND_SERVICE);
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.i.DOWNLOAD_IS_CANCELLED.e())) {
                b();
            }
            com.fyber.inneractive.sdk.ignite.k kVar = this.d;
            if (kVar != null) {
                ((p.a) this.h).a(com.fyber.inneractive.sdk.network.q.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, kVar);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str) {
        this.z = true;
        if (this.j.equals(str)) {
            this.b.b();
            f("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, int i, double d2) {
        if (this.j.equals(str)) {
            if (i == 0) {
                f(String.format("onDownloadProgress(%f);", Double.valueOf(d2)));
            } else if (i != 1) {
            } else {
                f("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, String str2, String str3) {
        if (this.v.get() && str2 != null) {
            if (str2.equals(com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED.e()) || str2.equals(com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED.e())) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new d(str));
                } else if (this.b.e()) {
                } else {
                    a((String) null, com.fyber.inneractive.sdk.ignite.i.FAILED_TO_BIND_SERVICE);
                }
            }
        }
    }

    public void a(String str, com.fyber.inneractive.sdk.ignite.i iVar) {
        com.fyber.inneractive.sdk.ignite.j jVar;
        com.fyber.inneractive.sdk.ignite.c cVar = this.b;
        if (cVar.j || (jVar = this.h) == null) {
            return;
        }
        cVar.j = true;
        ((p.a) jVar).a(com.fyber.inneractive.sdk.network.q.IGNITE_FLOW_FAILED_TO_START, null, iVar.e(), null);
    }

    public final void b() {
        this.b.b();
        f("onInstallationFailed();");
    }

    public void a() {
        this.y = true;
        this.D = false;
        this.b.i.remove(this);
        this.i = null;
        IAlog.a("destroy internalStoreWebpageController", new Object[0]);
    }
}
