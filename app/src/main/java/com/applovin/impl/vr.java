package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class vr {
    private int f;
    private int h;
    private float o;
    private String a = "";
    private String b = "";
    private Set c = Collections.emptySet();
    private String d = "";
    private String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.e;
    }

    public float e() {
        return this.o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h() {
        int i;
        int i2 = this.l;
        if (i2 == -1 && this.m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        if (this.j == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.k == 1) {
            return true;
        }
        return false;
    }

    public vr b(boolean z) {
        this.q = z;
        return this;
    }

    public vr d(int i) {
        this.p = i;
        return this;
    }

    public vr b(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public void d(String str) {
        this.d = str;
    }

    public int a(String str, String str2, Set set, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a = a(a(a(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (a == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return (this.c.size() * 4) + a;
    }

    public vr c(int i) {
        this.n = i;
        return this;
    }

    public vr d(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.a = str;
    }

    public vr c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.b = str;
    }

    public vr a(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public vr a(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public vr a(String str) {
        this.e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public vr a(float f) {
        this.o = f;
        return this;
    }

    public void a(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
