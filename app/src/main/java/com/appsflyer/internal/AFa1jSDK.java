package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFa1jSDK implements AFa1iSDK {
    @NotNull
    private Map<String, String> valueOf = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1iSDK
    @NotNull
    public final Map<String, String> valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.valueOf.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.valueOf.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.valueOf.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.valueOf.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.valueOf.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.valueOf.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.valueOf.put("size", String.valueOf(resources.getConfiguration().screenLayout & 15));
        }
        return this.valueOf;
    }
}
