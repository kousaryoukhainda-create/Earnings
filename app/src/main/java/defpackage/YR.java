package defpackage;

import java.util.Locale;
/* renamed from: YR  reason: default package */
/* loaded from: classes.dex */
public final class YR {
    public static final YR d = new YR(1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        Ha0.H(0);
        Ha0.H(1);
    }

    public YR(float f) {
        this(f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || YR.class != obj.getClass()) {
            return false;
        }
        YR yr = (YR) obj;
        if (this.a == yr.a && this.b == yr.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = Ha0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public YR(float f, float f2) {
        B10.j(f > 0.0f);
        B10.j(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }
}
