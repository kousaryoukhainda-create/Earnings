package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class b extends c {
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final a l;
    public final List<a> m;
    public final List<String> n;
    public final long o;

    /* loaded from: classes.dex */
    public static final class a implements Comparable<Long> {
        public final String a;
        public final long b;
        public final int c;
        public final long d;
        public final boolean e;
        public final String f;
        public final String g;
        public final long h;
        public final long i;

        public a(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = j2;
            this.e = z;
            this.f = str2;
            this.g = str3;
            this.h = j3;
            this.i = j4;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l) {
            Long l2 = l;
            if (this.d > l2.longValue()) {
                return 1;
            }
            if (this.d < l2.longValue()) {
                return -1;
            }
            return 0;
        }
    }

    public b(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, a aVar, List<a> list, List<String> list2) {
        super(str);
        long j4;
        this.b = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = j3;
        this.j = z2;
        this.k = z3;
        this.l = aVar;
        this.m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            a aVar2 = list.get(list.size() - 1);
            this.o = aVar2.d + aVar2.b;
        } else {
            this.o = 0L;
        }
        if (j == -9223372036854775807L) {
            j4 = -9223372036854775807L;
        } else if (j >= 0) {
            j4 = j;
        } else {
            j4 = this.o + j;
        }
        this.c = j4;
        this.n = Collections.unmodifiableList(list2);
    }
}
