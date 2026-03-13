package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* renamed from: v2  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2896v2 implements InterfaceC0298Gi {
    public final InterfaceC0298Gi a;
    public final float b;

    public C2896v2(float f, InterfaceC0298Gi interfaceC0298Gi) {
        while (interfaceC0298Gi instanceof C2896v2) {
            interfaceC0298Gi = ((C2896v2) interfaceC0298Gi).a;
            f += ((C2896v2) interfaceC0298Gi).b;
        }
        this.a = interfaceC0298Gi;
        this.b = f;
    }

    @Override // defpackage.InterfaceC0298Gi
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2896v2)) {
            return false;
        }
        C2896v2 c2896v2 = (C2896v2) obj;
        if (this.a.equals(c2896v2.a) && this.b == c2896v2.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
