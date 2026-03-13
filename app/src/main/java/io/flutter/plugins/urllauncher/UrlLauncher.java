package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.flutter.plugins.urllauncher.Messages;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
final class UrlLauncher implements Messages.UrlLauncherApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "UrlLauncher";
    private Activity activity;
    @NonNull
    private final Context applicationContext;
    @NonNull
    private final IntentResolver intentResolver;

    /* loaded from: classes2.dex */
    public interface IntentResolver {
        String getHandlerComponentName(@NonNull Intent intent);
    }

    public UrlLauncher(@NonNull Context context, @NonNull IntentResolver intentResolver) {
        this.applicationContext = context;
        this.intentResolver = intentResolver;
    }

    private static boolean containsRestrictedHeader(Map<String, String> map) {
        for (String str : map.keySet()) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (lowerCase.equals("accept")) {
                        c = 0;
                        continue;
                    } else {
                        continue;
                    }
                case -1229727188:
                    if (lowerCase.equals("content-language")) {
                        c = 1;
                        continue;
                    } else {
                        continue;
                    }
                case 785670158:
                    if (lowerCase.equals("content-type")) {
                        c = 2;
                        continue;
                    } else {
                        continue;
                    }
                case 802785917:
                    if (lowerCase.equals("accept-language")) {
                        c = 3;
                        continue;
                    } else {
                        continue;
                    }
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    private void ensureActivity() {
        if (this.activity != null) {
            return;
        }
        throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
    }

    @NonNull
    private static Bundle extractBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean openCustomTab(@NonNull Context context, @NonNull Uri uri, @NonNull Bundle bundle, @NonNull Messages.BrowserOptions browserOptions) {
        C0481Nk c0481Nk = new C0481Nk();
        c0481Nk.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", browserOptions.getShowTitle().booleanValue() ? 1 : 0);
        C0507Ok a = c0481Nk.a();
        a.a.putExtra("com.android.browser.headers", bundle);
        try {
            a.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean canLaunchUrl(@NonNull String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String handlerComponentName = this.intentResolver.getHandlerComponentName(intent);
        if (handlerComponentName == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(handlerComponentName));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean launchUrl(@NonNull String str, @NonNull Map<String, String> map) {
        ensureActivity();
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", extractBundle(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean openUrlInApp(@NonNull String str, @NonNull Boolean bool, @NonNull Messages.WebViewOptions webViewOptions, @NonNull Messages.BrowserOptions browserOptions) {
        ensureActivity();
        Bundle extractBundle = extractBundle(webViewOptions.getHeaders());
        if (bool.booleanValue() && !containsRestrictedHeader(webViewOptions.getHeaders())) {
            if (openCustomTab(this.activity, Uri.parse(str), extractBundle, browserOptions)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.activity.startActivity(WebViewActivity.createIntent(this.activity, str, webViewOptions.getEnableJavaScript().booleanValue(), webViewOptions.getEnableDomStorage().booleanValue(), extractBundle));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean supportsCustomTabs() {
        boolean z = false;
        if (AbstractC0378Jk.b(this.applicationContext, Collections.emptyList(), false) != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public UrlLauncher(@NonNull final Context context) {
        this(context, new IntentResolver() { // from class: io.flutter.plugins.urllauncher.b
            @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
            public final String getHandlerComponentName(Intent intent) {
                String lambda$new$0;
                lambda$new$0 = UrlLauncher.lambda$new$0(context, intent);
                return lambda$new$0;
            }
        });
    }
}
