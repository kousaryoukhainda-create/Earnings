package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public final class q6 implements o2 {
    public static final q6 d = new q6(0, 0, 0);
    public static final o2.a f = new Jh0(26);
    public final int a;
    public final int b;
    public final int c;

    public q6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        if (this.a == q6Var.a && this.b == q6Var.b && this.c == q6Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q6 a(Bundle bundle) {
        return new q6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
