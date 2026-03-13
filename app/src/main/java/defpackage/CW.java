package defpackage;

import android.content.res.Resources;
import java.util.Objects;
/* renamed from: CW  reason: default package */
/* loaded from: classes.dex */
public final class CW {
    public final Resources a;
    public final Resources.Theme b;

    public CW(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CW.class != obj.getClass()) {
            return false;
        }
        CW cw = (CW) obj;
        if (this.a.equals(cw.a) && Objects.equals(this.b, cw.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
