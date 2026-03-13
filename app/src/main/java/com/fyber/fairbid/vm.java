package com.fyber.fairbid;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
/* loaded from: classes.dex */
public final class vm {
    public static void a(WebSettings webSettings) {
        if (mf.b(20)) {
            webSettings.setPluginState(WebSettings.PluginState.ON);
        }
    }

    public static void b(WebView webView) {
        WebSettings settings = webView.getSettings();
        Context context = webView.getContext();
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        File databasePath = context.getDatabasePath("webviewCache");
        if (!databasePath.exists()) {
            databasePath.mkdirs();
        }
        settings.setDatabaseEnabled(true);
        if (mf.b(19)) {
            settings.setDatabasePath(databasePath.getPath());
        }
        settings.setJavaScriptEnabled(true);
    }

    @TargetApi(21)
    public static void a(WebView webView) {
        if (mf.a(21)) {
            CookieManager.getInstance().acceptThirdPartyCookies(webView);
        }
    }
}
