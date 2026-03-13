package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import java.util.List;
/* loaded from: classes.dex */
public class h implements a {
    public final String a;
    public boolean b;

    public h(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return "fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.a) || this.b;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        String str;
        b0.a aVar;
        String uri2 = uri.toString();
        b0.c cVar = b0.c.OPEN_EVERYTHING;
        try {
            str = context.getClass().getName();
        } catch (Throwable unused) {
            str = "failed";
        }
        try {
            IAlog.a("IAJavaUtil - valid url found: '%s' opening browser", uri2);
            try {
                context.startActivity(b0.a(context, uri2));
                aVar = new b0.a(b0.d.OPEN_IN_EXTERNAL_BROWSER, null, str);
            } catch (ActivityNotFoundException unused2) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://navigate?url=" + uri2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                aVar = new b0.a(b0.d.OPENED_USING_CHROME_NAVIGATE, null, str);
            } catch (Throwable unused3) {
                if (!b0.e(uri2) && !b0.d(uri2) && cVar != b0.c.DO_NOT_OPEN_IN_INTERNAL_BROWSER) {
                    context.startActivity(b0.a(context, uri2, (String) null));
                    aVar = new b0.a(b0.d.OPENED_IN_INTERNAL_BROWSER, null, str);
                } else {
                    aVar = new b0.a(b0.d.FAILED, new b0.b("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"), str);
                }
            }
        } catch (Throwable th) {
            IAlog.a("IAJavaUtil - could not open a browser for url: %s", uri2);
            aVar = new b0.a(b0.d.FAILED, th, str);
        }
        if (list != null) {
            Throwable th2 = aVar.b;
            if (th2 != null) {
                list.add(new i(uri2, false, null, th2.toString()));
            } else {
                list.add(new i(uri2, true, l.d.OPENED_IN_EXTERNAL_BROWSER, null));
            }
        }
        return l.a(uri.toString(), l.d.OPENED_IN_EXTERNAL_BROWSER, "FyberNativeBrowser");
    }
}
