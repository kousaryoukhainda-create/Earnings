package defpackage;

import android.view.ViewGroup;
/* renamed from: Yb0  reason: default package */
/* loaded from: classes.dex */
public abstract class Yb0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }
}
