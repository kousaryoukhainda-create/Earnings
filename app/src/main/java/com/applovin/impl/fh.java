package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class fh extends ki {
    public static final o2.a c = new Jh0(0);
    private final float b;

    public fh() {
        this.b = -1.0f;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static fh b(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(a(0), -1) == 1) {
            z = true;
        }
        b1.a(z);
        float f = bundle.getFloat(a(1), -1.0f);
        if (f == -1.0f) {
            return new fh();
        }
        return new fh(f);
    }

    public static /* synthetic */ fh d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fh) || this.b != ((fh) obj).b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.b));
    }

    public fh(float f) {
        b1.a(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.b = f;
    }
}
