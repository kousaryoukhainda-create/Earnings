package com.fyber.fairbid;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public final class vj {
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;

    public vj(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, false, "");
    }

    public vj(int i, int i2, int i3, int i4, boolean z, @NonNull String str) {
        this.a = i;
        this.b = str;
        this.c = 0;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public vj(int i, int i2, int i3) {
        this.a = 3;
        this.b = null;
        this.c = i3;
        this.d = true;
        this.e = i;
        this.f = i2;
        this.g = 3;
    }
}
