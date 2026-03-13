package defpackage;

import java.math.BigDecimal;
/* renamed from: jG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887jG extends Number {
    public final String b;

    public C1887jG(String str) {
        this.b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887jG)) {
            return false;
        }
        String str = ((C1887jG) obj).b;
        String str2 = this.b;
        if (str2 == str || str2.equals(str)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.b;
    }
}
