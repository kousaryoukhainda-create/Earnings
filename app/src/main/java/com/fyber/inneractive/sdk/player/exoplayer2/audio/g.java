package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final short[] f;
    public int g;
    public short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int q;
    public int r;
    public int s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int m = 0;
    public int n = 0;
    public int u = 0;
    public float o = 1.0f;
    public float p = 1.0f;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i / 400;
        int i3 = i / 65;
        this.d = i3;
        int i4 = i3 * 2;
        this.e = i4;
        this.f = new short[i4];
        this.g = i4;
        int i5 = i2 * i4;
        this.h = new short[i5];
        this.i = i4;
        this.j = new short[i5];
        this.k = i4;
        this.l = new short[i5];
    }

    public final void a(int i) {
        int i2 = this.q + i;
        int i3 = this.g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.g = i4;
            this.h = Arrays.copyOf(this.h, i4 * this.b);
        }
    }

    public final void b(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.i = i4;
            this.j = Arrays.copyOf(this.j, i4 * this.b);
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        b(i2);
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, this.j, this.r * i3, i3 * i2);
        this.r += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f[i7] = (short) (i8 / i5);
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.w = i6 / i7;
        this.x = i8 / i5;
        return i7;
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.r;
        float f = this.o / this.p;
        double d = f;
        int i10 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.h, 0, this.q);
            this.q = 0;
        } else {
            int i11 = this.q;
            if (i11 >= this.e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.t;
                    if (i13 > 0) {
                        int min = Math.min(this.e, i13);
                        a(this.h, i12, min);
                        this.t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.h;
                        int i14 = this.a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.b == i10 && i15 == i10) {
                            i = a(sArr, i12, this.c, this.d);
                        } else {
                            b(sArr, i12, i15);
                            int a = a(this.f, 0, this.c / i15, this.d / i15);
                            if (i15 != i10) {
                                int i16 = a * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.b == i10) {
                                    i = a(sArr, i12, i18, i19);
                                } else {
                                    b(sArr, i12, i10);
                                    i = a(this.f, 0, i18, i19);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i22 = this.w;
                        int i23 = (i22 == 0 || (i4 = this.u) == 0 || this.x > i22 * 3 || i22 * 2 <= this.v * 3) ? i : i4;
                        this.v = i22;
                        this.u = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.h;
                            if (f >= 2.0f) {
                                i3 = (int) (i23 / (f - 1.0f));
                            } else {
                                this.t = (int) (((2.0f - f) * i23) / (f - 1.0f));
                                i3 = i23;
                            }
                            b(i3);
                            int i24 = i3;
                            a(i3, this.b, this.j, this.r, sArr2, i12, sArr2, i12 + i23);
                            this.r += i24;
                            i12 = i23 + i24 + i12;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.h;
                            if (f < 0.5f) {
                                i2 = (int) ((i25 * f) / (1.0f - f));
                            } else {
                                this.t = (int) ((((2.0f * f) - 1.0f) * i25) / (1.0f - f));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            b(i26);
                            int i27 = this.b;
                            System.arraycopy(sArr3, i12 * i27, this.j, this.r * i27, i27 * i25);
                            a(i2, this.b, this.j, this.r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.r += i26;
                            i12 += i2;
                        }
                    }
                    if (this.e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.q - i12;
                short[] sArr4 = this.h;
                int i29 = this.b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.q = i28;
            }
        }
        float f2 = this.p;
        if (f2 == 1.0f || this.r == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f2);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.r - i9;
        int i33 = this.s + i32;
        int i34 = this.k;
        if (i33 > i34) {
            int i35 = (i34 / 2) + i32 + i34;
            this.k = i35;
            this.l = Arrays.copyOf(this.l, i35 * this.b);
        }
        short[] sArr5 = this.j;
        int i36 = this.b;
        System.arraycopy(sArr5, i9 * i36, this.l, this.s * i36, i36 * i32);
        this.r = i9;
        this.s += i32;
        int i37 = 0;
        while (true) {
            i5 = this.s;
            i6 = i5 - 1;
            if (i37 >= i6) {
                break;
            }
            while (true) {
                i7 = this.m + 1;
                int i38 = i7 * i31;
                i8 = this.n;
                if (i38 <= i8 * i30) {
                    break;
                }
                b(1);
                int i39 = 0;
                while (true) {
                    int i40 = this.b;
                    if (i39 < i40) {
                        short[] sArr6 = this.l;
                        int i41 = (i37 * i40) + i39;
                        short s = sArr6[i41];
                        short s2 = sArr6[i41 + i40];
                        int i42 = this.m;
                        int i43 = i42 * i31;
                        int i44 = (i42 + 1) * i31;
                        int i45 = i44 - (this.n * i30);
                        int i46 = i44 - i43;
                        this.j[(this.r * i40) + i39] = (short) ((((i46 - i45) * s2) + (s * i45)) / i46);
                        i39++;
                    }
                }
                this.n++;
                this.r++;
            }
            this.m = i7;
            if (i7 == i30) {
                this.m = 0;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(i8 == i31);
                this.n = 0;
            }
            i37++;
        }
        if (i6 == 0) {
            return;
        }
        short[] sArr7 = this.l;
        int i47 = this.b;
        System.arraycopy(sArr7, i6 * i47, sArr7, 0, (i5 - i6) * i47);
        this.s -= i6;
    }

    public static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
