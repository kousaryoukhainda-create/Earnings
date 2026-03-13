package com.applovin.impl;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public interface wj {

    /* loaded from: classes.dex */
    public static class a implements wj {
        private final Random a;
        private final int[] b;
        private final int[] c;

        public a(int i) {
            this(i, new Random());
        }

        @Override // com.applovin.impl.wj
        public wj a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 < i || i6 >= i2) {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    } else {
                        i5++;
                    }
                    i4++;
                } else {
                    return new a(iArr, new Random(this.a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.wj
        public wj b(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.a.nextInt(this.b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new a(iArr3, new Random(this.a.nextLong()));
                }
            }
        }

        @Override // com.applovin.impl.wj
        public int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public wj d() {
            return new a(0, new Random(this.a.nextLong()));
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        private a(int[] iArr, Random random) {
            this.b = iArr;
            this.a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.applovin.impl.wj
        public int a() {
            return this.b.length;
        }

        @Override // com.applovin.impl.wj
        public int a(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public int b() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }
    }

    int a();

    int a(int i);

    wj a(int i, int i2);

    int b();

    int b(int i);

    wj b(int i, int i2);

    int c();

    wj d();
}
