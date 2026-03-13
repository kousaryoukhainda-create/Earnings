package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.jk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class mj {
    private static final Splitter d = Splitter.on(':');
    private static final Splitter e = Splitter.on('*');
    private final List a = new ArrayList();
    private int b = 0;
    private int c;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private void a(k8 k8Var, th thVar) {
        ah ahVar = new ah(8);
        k8Var.d(ahVar.c(), 0, 8);
        this.c = ahVar.m() + 8;
        if (ahVar.j() != 1397048916) {
            thVar.a = 0L;
            return;
        }
        thVar.a = k8Var.f() - (this.c - 12);
        this.b = 2;
    }

    private void b(k8 k8Var, th thVar) {
        long a2 = k8Var.a();
        int i = this.c - 20;
        ah ahVar = new ah(i);
        k8Var.d(ahVar.c(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            ahVar.g(2);
            short o = ahVar.o();
            if (o != 2192 && o != 2816 && o != 2817 && o != 2819 && o != 2820) {
                ahVar.g(8);
            } else {
                this.a.add(new a(o, (a2 - this.c) - ahVar.m(), ahVar.m()));
            }
        }
        if (this.a.isEmpty()) {
            thVar.a = 0L;
            return;
        }
        this.b = 3;
        thVar.a = ((a) this.a.get(0)).b;
    }

    private static int a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ch.a("Invalid SEF name", null);
        }
    }

    public int a(k8 k8Var, th thVar, List list) {
        int i = this.b;
        long j = 0;
        if (i == 0) {
            long a2 = k8Var.a();
            if (a2 != -1 && a2 >= 8) {
                j = a2 - 8;
            }
            thVar.a = j;
            this.b = 1;
        } else if (i == 1) {
            a(k8Var, thVar);
        } else if (i == 2) {
            b(k8Var, thVar);
        } else if (i == 3) {
            a(k8Var, list);
            thVar.a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(k8 k8Var, List list) {
        long f = k8Var.f();
        int a2 = (int) ((k8Var.a() - k8Var.f()) - this.c);
        ah ahVar = new ah(a2);
        k8Var.d(ahVar.c(), 0, a2);
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = (a) this.a.get(i);
            ahVar.f((int) (aVar.b - f));
            ahVar.g(4);
            int m = ahVar.m();
            int a3 = a(ahVar.c(m));
            int i2 = aVar.c - (m + 8);
            if (a3 == 2192) {
                list.add(a(ahVar, i2));
            } else if (a3 != 2816 && a3 != 2817 && a3 != 2819 && a3 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static jk a(ah ahVar, int i) {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = e.splitToList(ahVar.c(i));
        for (int i2 = 0; i2 < splitToList.size(); i2++) {
            List<String> splitToList2 = d.splitToList(splitToList.get(i2));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new jk.b(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e2) {
                    throw ch.a(null, e2);
                }
            } else {
                throw ch.a(null, null);
            }
        }
        return new jk(arrayList);
    }

    public void a() {
        this.a.clear();
        this.b = 0;
    }
}
