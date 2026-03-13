package com.fyber.fairbid.internal;

import android.annotation.TargetApi;
import android.widget.PopupWindow;
import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public class PopupWindowCompatLayoutTypeV23 {
    @Keep
    @TargetApi(23)
    public static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
