package com.applovin.impl;
/* loaded from: classes.dex */
abstract class lk {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(k8 k8Var) {
        return a(k8Var, true, false);
    }

    private static boolean a(k8 k8Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        long a2 = k8Var.a();
        long j = 4096;
        long j2 = -1;
        int i2 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        if (i2 != 0 && a2 <= 4096) {
            j = a2;
        }
        int i3 = (int) j;
        ah ahVar = new ah(64);
        boolean z5 = false;
        int i4 = 0;
        boolean z6 = false;
        while (i4 < i3) {
            ahVar.d(8);
            if (!k8Var.b(ahVar.c(), z5 ? 1 : 0, 8, true)) {
                break;
            }
            long y = ahVar.y();
            int j3 = ahVar.j();
            if (y == 1) {
                k8Var.c(ahVar.c(), 8, 8);
                ahVar.e(16);
                y = ahVar.s();
                i = 16;
            } else {
                if (y == 0) {
                    long a3 = k8Var.a();
                    if (a3 != j2) {
                        y = (a3 - k8Var.d()) + 8;
                    }
                }
                i = 8;
            }
            long j4 = i;
            if (y < j4) {
                return z5;
            }
            i4 += i;
            if (j3 == 1836019574) {
                i3 += (int) y;
                if (i2 != 0 && i3 > a2) {
                    i3 = (int) a2;
                }
                j2 = -1;
            } else if (j3 == 1836019558 || j3 == 1836475768) {
                z3 = true;
                z4 = true;
                break;
            } else {
                int i5 = i2;
                if ((i4 + y) - j4 >= i3) {
                    break;
                }
                int i6 = (int) (y - j4);
                i4 += i6;
                if (j3 == 1718909296) {
                    if (i6 < 8) {
                        return false;
                    }
                    ahVar.d(i6);
                    k8Var.c(ahVar.c(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        if (i8 == 1) {
                            ahVar.g(4);
                        } else if (a(ahVar.j(), z2)) {
                            z6 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z6) {
                        return false;
                    }
                } else if (i6 != 0) {
                    k8Var.c(i6);
                }
                i2 = i5;
                j2 = -1;
                z5 = false;
            }
        }
        z3 = true;
        z4 = false;
        if (z6 && z == z4) {
            return z3;
        }
        return false;
    }

    public static boolean a(k8 k8Var, boolean z) {
        return a(k8Var, false, z);
    }
}
