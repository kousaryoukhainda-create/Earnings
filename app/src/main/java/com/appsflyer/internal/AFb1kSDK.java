package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1iSDK;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFb1kSDK implements AFb1iSDK {
    @NotNull
    private final Executor AFInAppEventParameterName;
    @NotNull
    private final AFf1vSDK AFInAppEventType;
    private AFb1jSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1sSDK values;

    public AFb1kSDK(@NotNull Executor executor, @NotNull AFb1sSDK aFb1sSDK, @NotNull AFf1vSDK aFf1vSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1vSDK, "");
        this.AFInAppEventParameterName = executor;
        this.values = aFb1sSDK;
        this.AFInAppEventType = aFf1vSDK;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper != null;
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void AFKeystoreWrapper(@NotNull Context context, @NotNull AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFKeystoreWrapper != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFKeystoreWrapper);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.AFKeystoreWrapper = null;
        AFb1jSDK aFb1jSDK = new AFb1jSDK(this.AFInAppEventParameterName, this.values, this.AFInAppEventType, aFa1wSDK);
        this.AFKeystoreWrapper = aFb1jSDK;
        if (context instanceof Activity) {
            aFb1jSDK.onActivityResumed((Activity) context);
        }
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 != null) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(this.AFKeystoreWrapper);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    @Override // com.appsflyer.internal.AFb1iSDK
    public final void AFInAppEventType(@NotNull Context context) {
        AFb1iSDK.AFa1wSDK aFa1wSDK;
        Intrinsics.checkNotNullParameter(context, "");
        AFb1jSDK aFb1jSDK = this.AFKeystoreWrapper;
        if (aFb1jSDK == null || (aFa1wSDK = aFb1jSDK.AFInAppEventParameterName) == null) {
            return;
        }
        aFa1wSDK.AFInAppEventType(context);
    }
}
