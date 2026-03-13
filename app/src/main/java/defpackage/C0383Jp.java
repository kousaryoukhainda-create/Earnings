package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;
/* renamed from: Jp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383Jp {
    public final DisplayCutout a;

    public C0383Jp(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0383Jp.class == obj.getClass()) {
            return Objects.equals(this.a, ((C0383Jp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
