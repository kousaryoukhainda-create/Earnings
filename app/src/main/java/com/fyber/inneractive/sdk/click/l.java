package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.q0;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.q;
import com.fyber.inneractive.sdk.web.r;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class l {
    public Context a;
    public String b;
    public boolean c;
    public b d;
    public q0 g;
    public r i;
    public boolean j;
    public com.fyber.inneractive.sdk.ignite.k k;
    public long f = 0;
    public final ArrayList<com.fyber.inneractive.sdk.click.a> h = new ArrayList<>();
    public final List<i> e = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ com.fyber.inneractive.sdk.click.b a;

        public a(com.fyber.inneractive.sdk.click.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = l.this.d;
            if (bVar != null) {
                bVar.a(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.fyber.inneractive.sdk.click.b bVar);
    }

    /* loaded from: classes.dex */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        FAILED("failed"),
        OPEN_GOOGLE_STORE("store"),
        OPENED_IN_INTERNAL_BROWSER("internal browser"),
        OPENED_IN_EXTERNAL_BROWSER("external browser"),
        INTERNAL_REDIRECT("internal redirect"),
        OPEN_IN_EXTERNAL_APPLICATION("external app"),
        DEEP_LINK("deep link"),
        OPENED_USING_CHROME_NAVIGATE("chrome navigate"),
        OPEN_INTERNAL_STORE("internal store");
        
        public String simpleName;

        d(String str) {
            this.simpleName = str;
        }
    }

    public l(boolean z) {
        this.c = z;
    }

    public static void a(l lVar, com.fyber.inneractive.sdk.click.c cVar, String str, boolean z) {
        lVar.getClass();
        for (String str2 : cVar.a) {
            if (!TextUtils.equals(str2, str)) {
                lVar.e.add(new i(str2, z, d.INTERNAL_REDIRECT, null));
            }
        }
    }

    public void a(Context context, String str, b bVar, r rVar, boolean z, com.fyber.inneractive.sdk.ignite.k kVar, String str2) {
        Uri uri;
        this.a = context;
        this.b = str;
        this.d = bVar;
        this.j = z;
        this.f = System.currentTimeMillis();
        this.i = rVar;
        this.k = kVar;
        com.fyber.inneractive.sdk.click.b a2 = a(this.b);
        IAlog.a(1, null, "%s EVENT_CLICK %s %s", "VAST_EVENT", a2, str);
        if (a2 == null) {
            String str3 = this.b;
            try {
                try {
                    if (!b0.d(str3)) {
                        uri = Uri.parse(URLDecoder.decode(str3, "utf-8"));
                    } else {
                        uri = Uri.parse(str3);
                    }
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String uri2 = uri.toString();
                    q0 q0Var = new q0(new k(this, uri2, str2), uri2, x.a().b());
                    this.g = q0Var;
                    IAConfigManager.M.s.b(q0Var);
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e);
                this.e.add(new i(str3, false, d.INTERNAL_REDIRECT, null));
                a(new com.fyber.inneractive.sdk.click.b(str3, d.FAILED, "followRedirects", e));
            }
        }
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.e.add(new i(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || !(scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(HttpConnection.DEFAULT_SCHEME))) {
            IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
            IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
            List<i> list = this.e;
            String uri2 = uri.toString();
            list.add(new i(uri2, false, null, "Invalid scheme: " + uri.getScheme()));
            a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
            return false;
        }
        return true;
    }

    public final com.fyber.inneractive.sdk.click.b a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.e.add(new i(str, false, null, "illegal uri"));
            return a(a(str, (String) null, "illegal uri"));
        } else if (this.h.size() <= 0) {
            this.e.add(new i(str, false, null, "no click handlers found"));
            return a(a(str, (String) null, "no click handlers found"));
        } else {
            Iterator<com.fyber.inneractive.sdk.click.a> it = this.h.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.click.a next = it.next();
                if (next.a(uri, this)) {
                    Context context = this.a;
                    com.fyber.inneractive.sdk.click.b a2 = context != null ? next.a(context, uri, this.e) : null;
                    if (a2 != null) {
                        return a(a2);
                    }
                }
            }
            return null;
        }
    }

    public static void a(l lVar, String str, String str2, String str3) {
        if (lVar.c) {
            Intent intent = new Intent(lVar.a, InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str2);
            intent.putExtra("spotId", str3);
            if (!(lVar.a instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = lVar.a;
                if (context != null) {
                    context.startActivity(intent);
                }
                List<i> list = lVar.e;
                d dVar = d.OPENED_IN_INTERNAL_BROWSER;
                list.add(new i(str2, true, dVar, null));
                lVar.a(a(str2, dVar, "followRedirects"));
            } catch (ActivityNotFoundException unused) {
                lVar.e.add(new i(str2, false, d.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                lVar.a(a(str2, "followRedirects", "internal browser not registered"));
            }
        }
    }

    public static com.fyber.inneractive.sdk.click.b a(String str, String str2, String str3) {
        return new com.fyber.inneractive.sdk.click.b(str, d.FAILED, str2, new c(str3));
    }

    public static com.fyber.inneractive.sdk.click.b a(String str, d dVar, String str2) {
        return new com.fyber.inneractive.sdk.click.b(str, dVar, str2, null);
    }

    public final com.fyber.inneractive.sdk.click.b a(com.fyber.inneractive.sdk.click.b bVar) {
        bVar.f = this.e;
        bVar.e = System.currentTimeMillis() - this.f;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        q.b.post(new a(bVar));
        return bVar;
    }
}
