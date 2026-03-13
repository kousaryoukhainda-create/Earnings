package defpackage;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: ri  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610ri {
    public static final C2610ri a = new Object();

    @NotNull
    public final Pd0 a(@NotNull Context context) {
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        Intrinsics.checkNotNullParameter(context, "context");
        systemService = context.getSystemService(WindowManager.class);
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        Pd0 g = Pd0.g(windowInsets, null);
        Intrinsics.checkNotNullExpressionValue(g, "toWindowInsetsCompat(platformInsets)");
        return g;
    }
}
