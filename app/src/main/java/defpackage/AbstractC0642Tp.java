package defpackage;
/* renamed from: Tp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0642Tp {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        boolean z;
        long j;
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != 0.0d) {
            if (Math.getExponent(d) <= 1023) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int exponent = Math.getExponent(d);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (exponent == -1023) {
                    j = doubleToRawLongBits << 1;
                } else {
                    j = doubleToRawLongBits | 4503599627370496L;
                }
                if (52 - Long.numberOfTrailingZeros(j) > Math.getExponent(d)) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("not a normal value");
            }
        }
        return true;
    }
}
