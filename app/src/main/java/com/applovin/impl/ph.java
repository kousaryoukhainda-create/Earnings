package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class ph implements o2 {
    public static final ph d = new ph(1.0f);
    public static final o2.a f = new Jh0(23);
    public final float a;
    public final float b;
    private final int c;

    public ph(float f2) {
        this(f2, 1.0f);
    }

    public static /* synthetic */ ph b(Bundle bundle) {
        return a(bundle);
    }

    public long a(long j) {
        return j * this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ph.class != obj.getClass()) {
            return false;
        }
        ph phVar = (ph) obj;
        if (this.a == phVar.a && this.b == phVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public String toString() {
        return xp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public ph(float f2, float f3) {
        b1.a(f2 > 0.0f);
        b1.a(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static /* synthetic */ ph a(Bundle bundle) {
        return new ph(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public ph a(float f2) {
        return new ph(f2, this.b);
    }
}
