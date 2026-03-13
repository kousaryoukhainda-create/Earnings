package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.z3;
/* loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m;
        loadUrl("about:blank");
        int v0 = bVar.v0();
        if (v0 >= 0) {
            setLayerType(v0, null);
        }
        if (z3.d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(bVar.H());
        }
        if (z3.e() && bVar.L0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m w0 = bVar.w0();
        if (w0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = w0.b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean e = w0.e();
            if (e != null) {
                settings.setAllowFileAccess(e.booleanValue());
            }
            Boolean i = w0.i();
            if (i != null) {
                settings.setLoadWithOverviewMode(i.booleanValue());
            }
            Boolean q = w0.q();
            if (q != null) {
                settings.setUseWideViewPort(q.booleanValue());
            }
            Boolean d = w0.d();
            if (d != null) {
                settings.setAllowContentAccess(d.booleanValue());
            }
            Boolean p = w0.p();
            if (p != null) {
                settings.setBuiltInZoomControls(p.booleanValue());
            }
            Boolean h = w0.h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean l = w0.l();
            if (l != null) {
                settings.setSaveFormData(l.booleanValue());
            }
            Boolean c = w0.c();
            if (c != null) {
                settings.setGeolocationEnabled(c.booleanValue());
            }
            Boolean j = w0.j();
            if (j != null) {
                settings.setNeedInitialFocus(j.booleanValue());
            }
            Boolean f = w0.f();
            if (f != null) {
                settings.setAllowFileAccessFromFileURLs(f.booleanValue());
            }
            Boolean g = w0.g();
            if (g != null) {
                settings.setAllowUniversalAccessFromFileURLs(g.booleanValue());
            }
            Boolean o = w0.o();
            if (o != null) {
                settings.setLoadsImagesAutomatically(o.booleanValue());
            }
            Boolean n = w0.n();
            if (n != null) {
                settings.setBlockNetworkImage(n.booleanValue());
            }
            if (z3.f()) {
                Integer a = w0.a();
                if (a != null) {
                    settings.setMixedContentMode(a.intValue());
                }
                if (z3.g()) {
                    Boolean k = w0.k();
                    if (k != null) {
                        settings.setOffscreenPreRaster(k.booleanValue());
                    }
                    if (z3.l() && (m = w0.m()) != null) {
                        settings.setAlgorithmicDarkeningAllowed(m.booleanValue());
                    }
                }
            }
        }
    }
}
