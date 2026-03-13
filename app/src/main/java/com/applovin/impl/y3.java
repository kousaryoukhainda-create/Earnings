package com.applovin.impl;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class y3 {
    private static final y3 a = new a();
    private static final y3 b = new b(-1);
    private static final y3 c = new b(1);

    /* loaded from: classes.dex */
    public class a extends y3 {
        public a() {
            super(null);
        }

        public y3 a(int i) {
            if (i < 0) {
                return y3.b;
            }
            return i > 0 ? y3.c : y3.a;
        }

        @Override // com.applovin.impl.y3
        public y3 b(boolean z, boolean z2) {
            return a(k2.a(z2, z));
        }

        @Override // com.applovin.impl.y3
        public int d() {
            return 0;
        }

        @Override // com.applovin.impl.y3
        public y3 a(int i, int i2) {
            return a(tb.a(i, i2));
        }

        @Override // com.applovin.impl.y3
        public y3 a(long j, long j2) {
            return a(rc.a(j, j2));
        }

        @Override // com.applovin.impl.y3
        public y3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.y3
        public y3 a(boolean z, boolean z2) {
            return a(k2.a(z, z2));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y3 {
        final int d;

        public b(int i) {
            super(null);
            this.d = i;
        }

        @Override // com.applovin.impl.y3
        public y3 a(int i, int i2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 b(boolean z, boolean z2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public int d() {
            return this.d;
        }

        @Override // com.applovin.impl.y3
        public y3 a(long j, long j2) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.y3
        public y3 a(boolean z, boolean z2) {
            return this;
        }
    }

    private y3() {
    }

    public static y3 e() {
        return a;
    }

    public abstract y3 a(int i, int i2);

    public abstract y3 a(long j, long j2);

    public abstract y3 a(Object obj, Object obj2, Comparator comparator);

    public abstract y3 a(boolean z, boolean z2);

    public abstract y3 b(boolean z, boolean z2);

    public abstract int d();

    public /* synthetic */ y3(a aVar) {
        this();
    }
}
