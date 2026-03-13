package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class b0 extends p {
    public static final /* synthetic */ int b = 0;

    /* loaded from: classes.dex */
    public static final class a {
        public final d a;
        public final Throwable b;

        public a(d dVar, Throwable th, String str) {
            this.a = dVar;
            this.b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DO_NOT_OPEN_IN_INTERNAL_BROWSER,
        OPEN_EVERYTHING
    }

    /* loaded from: classes.dex */
    public enum d {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE,
        OPENED_INTERNAL_STORE
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static boolean d(String str) {
        if (!str.startsWith("http%3A%2F%2F") && !str.startsWith("https%3A%2F%2F")) {
            return false;
        }
        return true;
    }

    public static boolean e(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith("mailto:") && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.e("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    public static boolean f(String str) {
        if (str != null && ((!t.a() || IAConfigManager.M.r) && (str.startsWith("http://") || str.startsWith("http%3A%2F%2F")))) {
            return false;
        }
        return true;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        intent.putExtra("spotId", str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }
}
