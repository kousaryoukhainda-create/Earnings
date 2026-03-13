package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes2.dex */
class FlutterRequestAgentProvider {
    static final String GAME_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION";
    static final String NEWS_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION";
    private String gameTemplateVersion;
    private String newsTemplateVersion;

    public FlutterRequestAgentProvider(Context context) {
        processGameAndNewsTemplateVersions(context);
    }

    private void processGameAndNewsTemplateVersions(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.ApplicationInfoFlags.of(128L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of);
            } else {
                applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.gameTemplateVersion = bundle.getString(GAME_VERSION_KEY);
                this.newsTemplateVersion = applicationInfo.metaData.getString(NEWS_VERSION_KEY);
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    public String getRequestAgent() {
        StringBuilder sb = new StringBuilder(Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        if (this.newsTemplateVersion != null) {
            sb.append("_News-");
            sb.append(this.newsTemplateVersion);
        }
        if (this.gameTemplateVersion != null) {
            sb.append("_Game-");
            sb.append(this.gameTemplateVersion);
        }
        return sb.toString();
    }
}
