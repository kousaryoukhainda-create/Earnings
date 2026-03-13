package com.fyber.fairbid;

import android.app.Activity;
import android.webkit.WebView;
import java.util.Locale;
/* renamed from: com.fyber.fairbid.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099h extends um {
    public final boolean b;

    public C1099h(Activity activity, boolean z) {
        super(activity);
        this.b = z;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        com.fyber.b bVar;
        Locale locale = Locale.ENGLISH;
        C2053lA.d("ActivityOfferWebClient", "OfferWall WebView triggered an error. Error code: " + i + ", error description: " + str + ". Failing URL: " + str2);
        if (i != -7 && i != -2) {
            bVar = com.fyber.b.f;
        } else {
            bVar = com.fyber.b.g;
        }
        a(nk.a(bVar));
    }
}
