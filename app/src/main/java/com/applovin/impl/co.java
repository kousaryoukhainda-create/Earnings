package com.applovin.impl;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class co extends ki {
    public static final o2.a d = new C2394p80(20);
    private final boolean b;
    private final boolean c;

    public co() {
        this.b = false;
        this.c = false;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public static co b(Bundle bundle) {
        boolean z;
        if (bundle.getInt(a(0), -1) == 3) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        if (bundle.getBoolean(a(1), false)) {
            return new co(bundle.getBoolean(a(2), false));
        }
        return new co();
    }

    public static /* synthetic */ co d(Bundle bundle) {
        return b(bundle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        if (this.c != coVar.c || this.b != coVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public co(boolean z) {
        this.b = true;
        this.c = z;
    }
}
