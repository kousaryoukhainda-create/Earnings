package defpackage;

import java.util.List;
/* renamed from: wk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3044wk {
    public final AbstractC2571rD a;
    public final long b;
    public final long c;
    public final long d;

    public C3044wk(List list, long j, long j2) {
        this.a = AbstractC2571rD.r(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
