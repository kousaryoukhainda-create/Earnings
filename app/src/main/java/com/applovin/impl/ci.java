package com.applovin.impl;
/* loaded from: classes.dex */
final class ci {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    /* loaded from: classes.dex */
    public static final class a {
        private final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }

        public b a(int i) {
            return this.a[i];
        }

        public int a() {
            return this.a.length;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.a = i;
            if (fArr.length * 2 == fArr2.length * 3) {
                z = true;
            } else {
                z = false;
            }
            b1.a(z);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public ci(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public static ci a(float f, int i, int i2, float f2, float f3, int i3) {
        float f4;
        float f5;
        int i4;
        int i5;
        int i6 = i;
        b1.a(f > 0.0f);
        b1.a(i6 >= 1);
        b1.a(i2 >= 1);
        b1.a(f2 > 0.0f && f2 <= 180.0f);
        b1.a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f6 = radians / i6;
        float f7 = radians2 / i2;
        int i7 = i2 + 1;
        int i8 = ((i7 * 2) + 2) * i6;
        float[] fArr = new float[i8 * 3];
        float[] fArr2 = new float[i8 * 2];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i6) {
            float f8 = radians / 2.0f;
            float f9 = (i9 * f6) - f8;
            int i12 = i9 + 1;
            float f10 = (i12 * f6) - f8;
            int i13 = 0;
            while (i13 < i7) {
                int i14 = i12;
                float f11 = f9;
                int i15 = i11;
                int i16 = 0;
                while (i16 < 2) {
                    if (i16 == 0) {
                        f4 = f11;
                        f5 = f10;
                    } else {
                        f4 = f10;
                        f5 = f4;
                    }
                    float f12 = i13 * f7;
                    float f13 = f7;
                    float f14 = radians;
                    double d = f;
                    int i17 = i7;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i18 = i13;
                    double d3 = f4;
                    float f15 = radians2;
                    int i19 = i16;
                    fArr[i10] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    float f16 = f6;
                    fArr[i10 + 1] = (float) (Math.sin(d3) * d);
                    int i20 = i10 + 3;
                    fArr[i10 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                    fArr2[i15] = f12 / f15;
                    int i21 = i15 + 2;
                    fArr2[i15 + 1] = ((i9 + i19) * f16) / f14;
                    if (i18 == 0 && i19 == 0) {
                        i5 = i19;
                        i4 = i18;
                    } else {
                        i4 = i18;
                        i5 = i19;
                        if (i4 != i2 || i5 != 1) {
                            i15 = i21;
                            i10 = i20;
                            i13 = i4;
                            f6 = f16;
                            i16 = i5 + 1;
                            f10 = f5;
                            f7 = f13;
                            radians = f14;
                            i7 = i17;
                            radians2 = f15;
                        }
                    }
                    System.arraycopy(fArr, i10, fArr, i20, 3);
                    i10 += 6;
                    System.arraycopy(fArr2, i15, fArr2, i21, 2);
                    i15 += 4;
                    i13 = i4;
                    f6 = f16;
                    i16 = i5 + 1;
                    f10 = f5;
                    f7 = f13;
                    radians = f14;
                    i7 = i17;
                    radians2 = f15;
                }
                i12 = i14;
                f9 = f11;
                i11 = i15;
                i13++;
                f10 = f10;
                radians = radians;
                radians2 = radians2;
            }
            i6 = i;
            i9 = i12;
        }
        return new ci(new a(new b(0, fArr, fArr2, 1)), i3);
    }

    public ci(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }

    public static ci a(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
