package defpackage;

import androidx.media3.common.b;
import java.util.ArrayList;
/* renamed from: t30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2727t30 {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final b[] j;
    public final int k;
    public final String l;
    public final String m;
    public final ArrayList n;
    public final long[] o;
    public final long p;

    public C2727t30(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, b[] bVarArr, ArrayList arrayList, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.a = i;
        this.b = str3;
        this.c = j;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = bVarArr;
        this.n = arrayList;
        this.o = jArr;
        this.p = j2;
        this.k = arrayList.size();
    }

    public final C2727t30 a(b[] bVarArr) {
        long[] jArr = this.o;
        return new C2727t30(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, bVarArr, this.n, jArr, this.p);
    }

    public final long b(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }
}
