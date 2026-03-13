package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
/* renamed from: AF  reason: default package */
/* loaded from: classes.dex */
public final class AF extends AbstractC3003wF {
    public final Serializable b;

    public AF(Boolean bool) {
        bool.getClass();
        this.b = bool;
    }

    public static boolean j(AF af) {
        Serializable serializable = af.b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC3003wF
    public final boolean e() {
        Serializable serializable = this.b;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(g());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AF.class != obj.getClass()) {
            return false;
        }
        AF af = (AF) obj;
        Serializable serializable = this.b;
        Serializable serializable2 = af.b;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (j(this) && j(af)) {
            if (h().longValue() == af.h().longValue()) {
                return true;
            }
            return false;
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = h().doubleValue();
            double doubleValue2 = af.h().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        } else {
            return serializable.equals(serializable2);
        }
    }

    @Override // defpackage.AbstractC3003wF
    public final String g() {
        Serializable serializable = this.b;
        if (serializable instanceof Number) {
            return h().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    public final Number h() {
        Serializable serializable = this.b;
        if (serializable instanceof String) {
            return new C1887jG((String) serializable);
        }
        return (Number) serializable;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.b;
        if (serializable == null) {
            return 31;
        }
        if (j(this)) {
            doubleToLongBits = h().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public AF(Number number) {
        number.getClass();
        this.b = number;
    }

    public AF(String str) {
        str.getClass();
        this.b = str;
    }
}
