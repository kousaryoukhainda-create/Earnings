package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFb1iSDK {
    @NotNull
    public static final AFa1vSDK valueOf = AFa1vSDK.AFInAppEventType;

    @Metadata
    /* loaded from: classes.dex */
    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK AFInAppEventType = new AFa1vSDK();
        private static long values = 500;

        private AFa1vSDK() {
        }

        public static long AFInAppEventType() {
            return values;
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public interface AFa1wSDK {
        void AFInAppEventType(@NotNull Context context);

        void values(@NotNull Activity activity);
    }

    void AFInAppEventType(@NotNull Context context);

    boolean AFInAppEventType();

    void AFKeystoreWrapper(@NotNull Context context, @NotNull AFa1wSDK aFa1wSDK);
}
