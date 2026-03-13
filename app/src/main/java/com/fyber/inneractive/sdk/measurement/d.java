package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.flow.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d {
    public AdSession a;
    public AdEvents b;
    public MediaEvents c;
    public f0 f;
    public boolean d = false;
    public boolean e = false;
    public WebViewClient g = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            IAlog.d("%s Resources to load: %s", "OMVideo", str);
            IAlog.a(1, null, "%s %s", "RESOURCES", str);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            d.this.a();
            com.fyber.inneractive.sdk.util.f0.a(webView);
            return true;
        }
    }

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String g = AbstractC2437ph.g("OpenMeasurementNativeVideoTracker - ", th.getMessage());
        f0 f0Var = this.f;
        t.a(simpleName, g, f0Var != null ? f0Var.a : null, f0Var != null ? (com.fyber.inneractive.sdk.response.g) f0Var.b : null);
    }

    public List<VerificationScriptResource> a(List<f> list) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (fVar.a != null) {
                    if (!TextUtils.isEmpty(fVar.e) && !TextUtils.isEmpty(fVar.d)) {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(fVar.e, fVar.a, fVar.d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(fVar.a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.a != null) {
            IAlog.a("%s destroy", "OMVideo");
            try {
                this.a.finish();
            } catch (Throwable th) {
                a(th);
            }
        }
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
