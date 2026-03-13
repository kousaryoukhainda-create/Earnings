package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* loaded from: classes3.dex */
public final class zzfmb extends zzfma {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfmb(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzn(webView);
    }
}
