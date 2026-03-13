package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
abstract class j1 {
    public final int a;

    /* loaded from: classes.dex */
    public static final class a extends j1 {
        public final long b;
        public final List c;
        public final List d;

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void a(a aVar) {
            this.d.add(aVar);
        }

        public a d(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.d.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.c.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.applovin.impl.j1
        public String toString() {
            return j1.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }

        public void a(b bVar) {
            this.c.add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j1 {
        public final ah b;

        public b(int i, ah ahVar) {
            super(i);
            this.b = ahVar;
        }
    }

    public j1(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int b(int i) {
        return i & 16777215;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
