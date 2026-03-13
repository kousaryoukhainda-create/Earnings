package com.fyber.fairbid.internal;

import android.os.Build;
import android.widget.PopupWindow;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class PopupWindowCompatLayoutType {
    @Keep
    public static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            PopupWindowCompatLayoutTypeV23.setWindowLayoutType(popupWindow, i);
        }
    }
}
