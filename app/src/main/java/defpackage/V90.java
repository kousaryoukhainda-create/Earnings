package defpackage;

import sun.misc.Unsafe;
/* renamed from: V90  reason: default package */
/* loaded from: classes.dex */
public final class V90 extends Z90 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V90(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.Z90
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC0948ba0.g) {
                    if (AbstractC0948ba0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC0948ba0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC0948ba0.g) {
                    if (AbstractC0948ba0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC0948ba0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.Z90
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (AbstractC0948ba0.g) {
                    return AbstractC0948ba0.h(j, obj);
                }
                return AbstractC0948ba0.i(j, obj);
            default:
                if (AbstractC0948ba0.g) {
                    return AbstractC0948ba0.h(j, obj);
                }
                return AbstractC0948ba0.i(j, obj);
        }
    }

    @Override // defpackage.Z90
    public final double e(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(h(j, obj));
            default:
                return Double.longBitsToDouble(h(j, obj));
        }
    }

    @Override // defpackage.Z90
    public final float f(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(g(j, obj));
            default:
                return Float.intBitsToFloat(g(j, obj));
        }
    }

    @Override // defpackage.Z90
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (AbstractC0948ba0.g) {
                    AbstractC0948ba0.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC0948ba0.m(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (AbstractC0948ba0.g) {
                    AbstractC0948ba0.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC0948ba0.m(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.Z90
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (AbstractC0948ba0.g) {
                    AbstractC0948ba0.l(obj, j, b);
                    return;
                } else {
                    AbstractC0948ba0.m(obj, j, b);
                    return;
                }
            default:
                if (AbstractC0948ba0.g) {
                    AbstractC0948ba0.l(obj, j, b);
                    return;
                } else {
                    AbstractC0948ba0.m(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.Z90
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.Z90
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(Float.floatToIntBits(f), j, obj);
                return;
            default:
                o(Float.floatToIntBits(f), j, obj);
                return;
        }
    }

    @Override // defpackage.Z90
    public final boolean s() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
