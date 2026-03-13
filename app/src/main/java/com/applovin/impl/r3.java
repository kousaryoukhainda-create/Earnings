package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class r3 implements o2 {
    public static final o2.a g = new Fk0(0);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    public r3(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r3.class != obj.getClass()) {
            return false;
        }
        r3 r3Var = (r3) obj;
        if (this.a == r3Var.a && this.b == r3Var.b && this.c == r3Var.c && Arrays.equals(this.d, r3Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.d) + ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.f;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r3 a(Bundle bundle) {
        return new r3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }
}
