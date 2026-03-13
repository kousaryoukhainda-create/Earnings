package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* renamed from: cZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031cZ extends AbstractC2121m1 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable d(int i, NQ nq) {
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(nq.o()));
                                nq.H(2);
                                return date;
                            }
                            int y = nq.y();
                            ArrayList arrayList = new ArrayList(y);
                            for (int i2 = 0; i2 < y; i2++) {
                                Serializable d = d(nq.u(), nq);
                                if (d != null) {
                                    arrayList.add(d);
                                }
                            }
                            return arrayList;
                        }
                        return e(nq);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String f = f(nq);
                        int u = nq.u();
                        if (u == 9) {
                            return hashMap;
                        }
                        Serializable d2 = d(u, nq);
                        if (d2 != null) {
                            hashMap.put(f, d2);
                        }
                    }
                } else {
                    return f(nq);
                }
            } else {
                if (nq.u() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(nq.o()));
        }
    }

    public static HashMap e(NQ nq) {
        int y = nq.y();
        HashMap hashMap = new HashMap(y);
        for (int i = 0; i < y; i++) {
            String f = f(nq);
            Serializable d = d(nq.u(), nq);
            if (d != null) {
                hashMap.put(f, d);
            }
        }
        return hashMap;
    }

    public static String f(NQ nq) {
        int A = nq.A();
        int i = nq.b;
        nq.H(A);
        return new String(nq.a, i, A);
    }
}
