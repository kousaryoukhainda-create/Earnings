package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: R0  reason: default package */
/* loaded from: classes.dex */
public final class R0 {
    public final AccessibilityNodeInfo.CollectionItemInfo a;

    public R0(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }

    public static R0 a(boolean z, int i, int i2, int i3, int i4) {
        return new R0(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
