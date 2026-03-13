package defpackage;

import androidx.media3.common.DrmInitData;
/* renamed from: QB  reason: default package */
/* loaded from: classes.dex */
public abstract class QB implements Comparable {
    public final String b;
    public final PB c;
    public final long d;
    public final int f;
    public final long g;
    public final DrmInitData h;
    public final String i;
    public final String j;
    public final long k;
    public final long l;
    public final boolean m;

    public QB(String str, PB pb, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.b = str;
        this.c = pb;
        this.d = j;
        this.f = i;
        this.g = j2;
        this.h = drmInitData;
        this.i = str2;
        this.j = str3;
        this.k = j3;
        this.l = j4;
        this.m = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.g;
        if (j > longValue) {
            return 1;
        }
        if (j < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
