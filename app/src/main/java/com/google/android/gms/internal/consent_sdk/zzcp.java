package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
/* loaded from: classes3.dex */
public final class zzcp {
    private static Boolean zza;

    private zzcp() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzcp.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
