package com.fyber.fairbid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.fyber.fairbid.internal.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class tg {
    @NotNull
    public static final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String format = String.format(Locale.ENGLISH, "%s (%d)", Arrays.copyOf(new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            return format;
        } catch (Exception e) {
            Logger.debug("Unable to get the version", e);
            return "0";
        }
    }

    public static final long b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean a(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage != null) {
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
                Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
                if (!queryIntentActivities.isEmpty()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
