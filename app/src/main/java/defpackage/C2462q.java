package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: q  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2462q implements InterfaceC0298Gi {
    public final float a;

    public C2462q(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC0298Gi
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2462q) && this.a == ((C2462q) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
