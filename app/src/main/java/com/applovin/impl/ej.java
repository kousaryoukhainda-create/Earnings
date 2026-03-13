package com.applovin.impl;

import com.fyber.fairbid.sdk.session.UserSessionStorage;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class ej extends xl {
    private long b;
    private long[] c;
    private long[] d;

    public ej() {
        super(new h7());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    private static Double d(ah ahVar) {
        return Double.valueOf(Double.longBitsToDouble(ahVar.s()));
    }

    private static HashMap e(ah ahVar) {
        int A = ahVar.A();
        HashMap hashMap = new HashMap(A);
        for (int i = 0; i < A; i++) {
            String h = h(ahVar);
            Object a = a(ahVar, i(ahVar));
            if (a != null) {
                hashMap.put(h, a);
            }
        }
        return hashMap;
    }

    private static HashMap f(ah ahVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String h = h(ahVar);
            int i = i(ahVar);
            if (i == 9) {
                return hashMap;
            }
            Object a = a(ahVar, i);
            if (a != null) {
                hashMap.put(h, a);
            }
        }
    }

    private static ArrayList g(ah ahVar) {
        int A = ahVar.A();
        ArrayList arrayList = new ArrayList(A);
        for (int i = 0; i < A; i++) {
            Object a = a(ahVar, i(ahVar));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private static String h(ah ahVar) {
        int C = ahVar.C();
        int d = ahVar.d();
        ahVar.g(C);
        return new String(ahVar.c(), d, C);
    }

    private static int i(ah ahVar) {
        return ahVar.w();
    }

    @Override // com.applovin.impl.xl
    public boolean a(ah ahVar) {
        return true;
    }

    public long[] b() {
        return this.d;
    }

    public long[] c() {
        return this.c;
    }

    private static Date c(ah ahVar) {
        Date date = new Date((long) d(ahVar).doubleValue());
        ahVar.g(2);
        return date;
    }

    public long a() {
        return this.b;
    }

    @Override // com.applovin.impl.xl
    public boolean b(ah ahVar, long j) {
        if (i(ahVar) == 2 && "onMetaData".equals(h(ahVar)) && i(ahVar) == 8) {
            HashMap e = e(ahVar);
            Object obj = e.get(UserSessionStorage.DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = e.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.c = new long[size];
                    this.d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.d[i] = ((Double) obj5).longValue();
                        } else {
                            this.c = new long[0];
                            this.d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    private static Object a(ah ahVar, int i) {
        if (i != 8) {
            if (i != 10) {
                if (i != 11) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return f(ahVar);
                            }
                            return h(ahVar);
                        }
                        return b(ahVar);
                    }
                    return d(ahVar);
                }
                return c(ahVar);
            }
            return g(ahVar);
        }
        return e(ahVar);
    }

    private static Boolean b(ah ahVar) {
        return Boolean.valueOf(ahVar.w() == 1);
    }
}
