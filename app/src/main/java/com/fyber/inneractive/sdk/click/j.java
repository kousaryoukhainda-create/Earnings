package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class j implements com.fyber.inneractive.sdk.click.a {
    public static final Comparator<ResolveInfo> a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<ResolveInfo> {
        @Override // java.util.Comparator
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            ActivityInfo activityInfo;
            String str;
            ResolveInfo resolveInfo3 = resolveInfo2;
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 != null && (activityInfo = resolveInfo3.activityInfo) != null && (str = activityInfo2.packageName) != null) {
                return str.compareTo(activityInfo.packageName);
            }
            return 1;
        }
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public b a(Context context, Uri uri, List<i> list) {
        Intent intent;
        ResolveInfo resolveInfo;
        if (Build.VERSION.SDK_INT > 29) {
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpConnection.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                return a(context, intent2, uri, list);
            }
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 32);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.fyber.com")), 32);
        TreeSet treeSet = new TreeSet(a);
        treeSet.addAll(queryIntentActivities2);
        queryIntentActivities.removeAll(treeSet);
        if (queryIntentActivities.size() <= 0 || (resolveInfo = queryIntentActivities.get(0)) == null) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", uri);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
        }
        if (intent != null) {
            return a(context, intent, uri, list);
        }
        return null;
    }

    public final b a(Context context, Intent intent, Uri uri, List<i> list) {
        try {
            context.startActivity(intent);
            if (list != null) {
                list.add(new i(uri.toString(), true, a(intent), null));
            }
            return l.a(uri.toString(), a(intent), "Resolver");
        } catch (Exception e) {
            IAlog.a("failed starting activity with error: %s", e.getLocalizedMessage());
            if (list != null) {
                list.add(new i(uri.toString(), false, l.d.OPEN_IN_EXTERNAL_APPLICATION, null));
            }
            return l.a(uri.toString(), "Resolver", "failed starting resolved activity - " + e.getMessage());
        }
    }

    public final l.d a(Intent intent) {
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (!TextUtils.isEmpty(uri)) {
                Uri parse = Uri.parse(uri);
                String host = parse.getHost();
                String scheme = parse.getScheme();
                if (((uri.startsWith("http:") || uri.startsWith("https:")) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host))) || "market".equalsIgnoreCase(scheme)) {
                    return l.d.OPEN_GOOGLE_STORE;
                }
            }
        }
        return l.d.OPEN_IN_EXTERNAL_APPLICATION;
    }
}
