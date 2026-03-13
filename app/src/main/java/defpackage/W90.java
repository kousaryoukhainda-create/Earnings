package defpackage;

import sun.misc.Unsafe;
/* renamed from: W90  reason: default package */
/* loaded from: classes.dex */
public final class W90 extends AbstractC0857aa0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W90(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.AbstractC0857aa0
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC1033ca0.g) {
                    return AbstractC1033ca0.b(j, obj);
                }
                return AbstractC1033ca0.c(j, obj);
            default:
                if (AbstractC1033ca0.g) {
                    return AbstractC1033ca0.b(j, obj);
                }
                return AbstractC1033ca0.c(j, obj);
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final double d(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(g(j, obj));
            default:
                return Double.longBitsToDouble(g(j, obj));
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final float e(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(f(j, obj));
            default:
                return Float.intBitsToFloat(f(j, obj));
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (AbstractC1033ca0.g) {
                    AbstractC1033ca0.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC1033ca0.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (AbstractC1033ca0.g) {
                    AbstractC1033ca0.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC1033ca0.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (AbstractC1033ca0.g) {
                    AbstractC1033ca0.k(obj, j, b);
                    return;
                } else {
                    AbstractC1033ca0.l(obj, j, b);
                    return;
                }
            default:
                if (AbstractC1033ca0.g) {
                    AbstractC1033ca0.k(obj, j, b);
                    return;
                } else {
                    AbstractC1033ca0.l(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(Float.floatToIntBits(f), j, obj);
                return;
            default:
                n(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    @Override // defpackage.AbstractC0857aa0
    public final boolean r() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
