package defpackage;

import android.view.ViewGroup;
import android.view.WindowId;
/* renamed from: wd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3031wd0 {
    public final WindowId a;

    public C3031wd0(ViewGroup viewGroup) {
        this.a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C3031wd0) && ((C3031wd0) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
