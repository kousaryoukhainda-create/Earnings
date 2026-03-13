package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v0;
import java.util.List;
/* loaded from: classes.dex */
public class d implements a {
    public final boolean a(Uri uri) {
        return uri != null && "smartlink".equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return "smartlink".equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        Uri uri2;
        Uri uri3;
        if (a(uri)) {
            com.fyber.inneractive.sdk.util.l lVar = new com.fyber.inneractive.sdk.util.l();
            String queryParameter = uri.getQueryParameter("primaryUrl");
            if (!TextUtils.isEmpty(queryParameter) && r.a(context, Uri.parse(queryParameter))) {
                List<String> queryParameters = uri.getQueryParameters("primaryTrackingUrl");
                v0.a aVar = v0.a.Primary;
                try {
                    uri3 = Uri.parse(queryParameter);
                } catch (Exception unused) {
                    uri3 = null;
                }
                if (uri3 != null) {
                    lVar.a.offer(new v0(aVar, uri3, queryParameters));
                }
                if (list != null) {
                    list.add(new i(uri.toString(), true, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
            } else if (list != null) {
                list.add(new i(uri.toString(), false, l.d.DEEP_LINK, null));
            }
            String queryParameter2 = uri.getQueryParameter("fallbackUrl");
            if (!TextUtils.isEmpty(queryParameter2) && r.a(context, Uri.parse(queryParameter2))) {
                List<String> queryParameters2 = uri.getQueryParameters("fallbackTrackingUrl");
                v0.a aVar2 = v0.a.FallBack;
                try {
                    uri2 = Uri.parse(queryParameter2);
                } catch (Exception unused2) {
                    uri2 = null;
                }
                if (uri2 != null) {
                    lVar.a.offer(new v0(aVar2, uri2, queryParameters2));
                }
                if (list != null) {
                    list.add(new i(queryParameter2, true, l.d.OPENED_IN_EXTERNAL_BROWSER, null));
                }
            } else if (list != null && queryParameter2 != null) {
                list.add(new i(queryParameter2, false, l.d.DEEP_LINK, null));
            }
            if (lVar.a.size() > 0) {
                if (r.a(context, lVar)) {
                    return l.a(uri.toString(), l.d.OPEN_IN_EXTERNAL_APPLICATION, "FyberDeepLink");
                }
                return l.a(uri.toString(), "FyberDeepLink", "IADeeplinkUtil.tryHandleDeepLinkWithExternalApp has failed");
            }
            return l.a(uri.toString(), "FyberDeepLink", "fyberDeepLink is not valid");
        }
        return null;
    }
}
