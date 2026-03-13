package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;
/* loaded from: classes.dex */
public class p {
    public static final Comparator<c> h = new a();
    public static final Comparator<c> i = new b();
    public final int a;
    public int e;
    public int f;
    public int g;
    public final c[] c = new c[5];
    public final ArrayList<c> b = new ArrayList<>();
    public int d = -1;

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            float f = cVar.c;
            float f2 = cVar2.c;
            if (f < f2) {
                return -1;
            }
            if (f2 < f) {
                return 1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int a;
        public int b;
        public float c;
    }

    public p(int i2) {
        this.a = i2;
    }
}
