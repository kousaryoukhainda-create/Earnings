package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class cl extends ki {
    public static final o2.a d = new C2394p80(19);
    private final int b;
    private final float c;

    public cl(int i) {
        b1.a(i > 0, "maxStars must be a positive integer");
        this.b = i;
        this.c = -1.0f;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static cl b(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(a(0), -1) == 2) {
            z = true;
        }
        b1.a(z);
        int i = bundle.getInt(a(1), 5);
        float f = bundle.getFloat(a(2), -1.0f);
        if (f == -1.0f) {
            return new cl(i);
        }
        return new cl(i, f);
    }

    public static /* synthetic */ cl d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        if (this.b != clVar.b || this.c != clVar.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public cl(int i, float f) {
        boolean z = false;
        b1.a(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        b1.a(z, "starRating is out of range [0, maxStars]");
        this.b = i;
        this.c = f;
    }
}
