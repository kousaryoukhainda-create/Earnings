package defpackage;

import java.util.Arrays;
/* renamed from: HE  reason: default package */
/* loaded from: classes.dex */
public final class HE {
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;
    public boolean e;

    public HE(int i) {
        long[] jArr = new long[i];
        this.a = jArr;
        boolean[] zArr = new boolean[i];
        this.b = zArr;
        this.c = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] a() {
        boolean z;
        synchronized (this) {
            try {
                if (this.d && !this.e) {
                    int length = this.a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i < length) {
                            if (this.a[i] > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean[] zArr = this.b;
                            if (z != zArr[i]) {
                                int[] iArr = this.c;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.c[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        } else {
                            this.e = true;
                            this.d = false;
                            return this.c;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
