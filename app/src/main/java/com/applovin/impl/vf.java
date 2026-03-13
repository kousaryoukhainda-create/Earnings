package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class vf {

    /* loaded from: classes.dex */
    public class a extends d {
        final /* synthetic */ Comparator a;

        public a(Comparator comparator) {
            this.a = comparator;
        }

        @Override // com.applovin.impl.vf.d
        public Map b() {
            return new TreeMap(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Supplier, Serializable {
        private final int a;

        public b(int i) {
            this.a = p3.a(i, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends vf {
        public c() {
            super(null);
        }

        public abstract ec b();
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public class a extends c {
            final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // com.applovin.impl.vf.c
            public ec b() {
                return wf.a(d.this.b(), new b(this.a));
            }
        }

        public c a() {
            return a(2);
        }

        public abstract Map b();

        public c a(int i) {
            p3.a(i, "expectedValuesPerKey");
            return new a(i);
        }
    }

    private vf() {
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public /* synthetic */ vf(uf ufVar) {
        this();
    }

    public static d a() {
        return a(vg.a());
    }
}
