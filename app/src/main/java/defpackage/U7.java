package defpackage;

import java.util.List;
/* renamed from: U7  reason: default package */
/* loaded from: classes.dex */
public final class U7 extends AbstractC0480Nj {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final V7 g;
    public final C2822u8 h;
    public final C2736t8 i;
    public final Y7 j;
    public final List k;
    public final int l;

    public U7(String str, String str2, String str3, long j, Long l, boolean z, V7 v7, C2822u8 c2822u8, C2736t8 c2736t8, Y7 y7, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = v7;
        this.h = c2822u8;
        this.i = c2736t8;
        this.j = y7;
        this.k = list;
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T7, java.lang.Object] */
    public final T7 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0480Nj)) {
            return false;
        }
        U7 u7 = (U7) ((AbstractC0480Nj) obj);
        if (this.a.equals(u7.a)) {
            if (this.b.equals(u7.b)) {
                String str = u7.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == u7.d) {
                        Long l = u7.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == u7.f && this.g.equals(u7.g)) {
                                C2822u8 c2822u8 = u7.h;
                                C2822u8 c2822u82 = this.h;
                                if (c2822u82 != null ? c2822u82.equals(c2822u8) : c2822u8 == null) {
                                    C2736t8 c2736t8 = u7.i;
                                    C2736t8 c2736t82 = this.i;
                                    if (c2736t82 != null ? c2736t82.equals(c2736t8) : c2736t8 == null) {
                                        Y7 y7 = u7.j;
                                        Y7 y72 = this.j;
                                        if (y72 != null ? y72.equals(y7) : y7 == null) {
                                            List list = u7.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == u7.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        C2822u8 c2822u8 = this.h;
        if (c2822u8 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2822u8.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        C2736t8 c2736t8 = this.i;
        if (c2736t8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c2736t8.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        Y7 y7 = this.j;
        if (y7 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = y7.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return AbstractC2437ph.k(sb, this.l, "}");
    }
}
