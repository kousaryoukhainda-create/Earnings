package com.applovin.impl;

import java.io.EOFException;
/* loaded from: classes.dex */
public abstract class m8 {
    public static void a(boolean z, String str) {
        if (!z) {
            throw ch.a(str, null);
        }
    }

    public static boolean b(k8 k8Var, byte[] bArr, int i, int i2) {
        try {
            k8Var.d(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(k8 k8Var, byte[] bArr, int i, int i2, boolean z) {
        try {
            return k8Var.b(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int a(k8 k8Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int b = k8Var.b(bArr, i + i3, i2 - i3);
            if (b == -1) {
                break;
            }
            i3 += b;
        }
        return i3;
    }

    public static boolean a(k8 k8Var, int i) {
        try {
            k8Var.a(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
