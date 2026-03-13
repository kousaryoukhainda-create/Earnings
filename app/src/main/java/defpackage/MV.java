package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: MV  reason: default package */
/* loaded from: classes3.dex */
public final class MV implements InterfaceC0298Gi {
    public final float a;

    public MV(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC0298Gi
    public final float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MV) && this.a == ((MV) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
