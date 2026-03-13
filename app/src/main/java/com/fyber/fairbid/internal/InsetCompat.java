package com.fyber.fairbid.internal;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class InsetCompat {
    @Keep
    public static int getBottomInset(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return InsetCompatV28.getBottomInset(view);
        }
        return 0;
    }

    @Keep
    public static int getTopInset(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return InsetCompatV28.getTopInset(view);
        }
        return 0;
    }

    @Keep
    public static boolean isLayoutInDisplayCutoutShortEdges(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            return InsetCompatV28.isLayoutInDisplayCutoutShortEdges(window);
        }
        return false;
    }
}
