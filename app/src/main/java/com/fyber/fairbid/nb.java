package com.fyber.fairbid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class nb {
    public static boolean a(Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (uri != null) {
            intent.setData(uri);
        }
        if (activity.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }
}
