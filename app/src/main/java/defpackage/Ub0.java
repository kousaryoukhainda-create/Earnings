package defpackage;

import android.view.ViewConfiguration;
/* renamed from: Ub0  reason: default package */
/* loaded from: classes.dex */
public abstract class Ub0 {
    public static int a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
