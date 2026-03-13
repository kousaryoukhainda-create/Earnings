package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.net.URISyntaxException;
import java.util.List;
/* loaded from: classes.dex */
public class g implements a {
    public final boolean a(Uri uri) {
        return uri != null && CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equalsIgnoreCase(uri.getScheme());
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        if (a(uri)) {
            try {
                Intent parseUri = Intent.parseUri(uri.toString(), 1);
                if (b0.a(context, parseUri)) {
                    int i = IAlog.a;
                    IAlog.a(1, null, "%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new i(uri.toString(), true, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return l.a(uri.toString(), l.d.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme");
                }
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (TextUtils.isEmpty(stringExtra)) {
                    if (list != null) {
                        list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return l.a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
                try {
                    context.startActivity(b0.a(context, stringExtra));
                    IAlog.a(1, null, "%s %s", "Intent opened successfully, url:", stringExtra);
                    if (list != null) {
                        list.add(new i(uri.toString(), false, l.d.DEEP_LINK, null));
                        list.add(new i(stringExtra, true, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return l.a(uri.toString(), l.d.OPEN_IN_EXTERNAL_APPLICATION, "IntentScheme");
                } catch (ActivityNotFoundException unused) {
                    IAlog.a(1, null, "%s %s", "Intent failed, url:", stringExtra);
                }
            } catch (URISyntaxException e) {
                IAlog.a("failed parsing uri with error: %s", e.getLocalizedMessage());
                if (list != null) {
                    list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new b(uri.toString(), l.d.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }
}
