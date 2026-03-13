package com.fyber.fairbid.internal;

import android.annotation.TargetApi;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class InsetCompatV28 {
    @Keep
    public static int getBottomInset(View view) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int safeInsetBottom;
        if (view != null) {
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                return safeInsetBottom;
            }
            return 0;
        }
        return 0;
    }

    @Keep
    @TargetApi(28)
    public static int getTopInset(View view) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int safeInsetTop;
        if (view != null) {
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                safeInsetTop = displayCutout.getSafeInsetTop();
                return safeInsetTop;
            }
            return 0;
        }
        return 0;
    }

    @Keep
    @TargetApi(28)
    public static boolean isLayoutInDisplayCutoutShortEdges(Window window) {
        int i;
        if (window != null) {
            i = window.getAttributes().layoutInDisplayCutoutMode;
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
