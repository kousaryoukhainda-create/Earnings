package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFf1lSDK extends AFf1pSDK {
    final ProviderInfo AFInAppEventType;
    private final AFc1xSDK valueOf;

    public AFf1lSDK(ProviderInfo providerInfo, Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFc1xSDK;
        this.AFInAppEventType = providerInfo;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(final Context context) {
        this.valueOf.AFInAppEventType().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1lSDK.2
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
                r0.release();
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
                r0.release();
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
                if (android.os.Build.VERSION.SDK_INT < 24) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 291
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1lSDK.AnonymousClass2.run():void");
            }
        });
    }

    public static ContentProviderClient valueOf(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }
}
