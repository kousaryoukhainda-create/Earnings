package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class ma extends ki {
    public static final o2.a d = new Jh0(15);
    private final boolean b;
    private final boolean c;

    public ma() {
        this.b = false;
        this.c = false;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static ma b(Bundle bundle) {
        boolean z;
        if (bundle.getInt(a(0), -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        if (bundle.getBoolean(a(1), false)) {
            return new ma(bundle.getBoolean(a(2), false));
        }
        return new ma();
    }

    public static /* synthetic */ ma d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        if (this.c != maVar.c || this.b != maVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public ma(boolean z) {
        this.b = true;
        this.c = z;
    }
}
