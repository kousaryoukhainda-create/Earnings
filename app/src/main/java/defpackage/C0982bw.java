package defpackage;

import java.util.Map;
/* renamed from: bw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982bw extends AbstractC1023cR {
    public static final Z2 b = Z2.d();
    public final E70 a;

    public C0982bw(E70 e70) {
        this.a = e70;
    }

    public static boolean d(E70 e70, int i) {
        if (e70 == null) {
            return false;
        }
        Z2 z2 = b;
        if (i > 1) {
            z2.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : e70.F().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String trim = str.trim();
                if (trim.isEmpty()) {
                    z2.f("counterId is empty");
                } else if (trim.length() > 100) {
                    z2.f("counterId exceeded max length 100");
                } else if (((Long) entry.getValue()) == null) {
                    z2.f("invalid CounterValue:" + entry.getValue());
                    return false;
                }
            }
            z2.f("invalid CounterId:" + ((String) entry.getKey()));
            return false;
        }
        for (E70 e702 : e70.L()) {
            if (!d(e702, i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(E70 e70, int i) {
        Long l;
        Z2 z2 = b;
        if (e70 == null) {
            z2.f("TraceMetric is null");
            return false;
        } else if (i > 1) {
            z2.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else {
            String J = e70.J();
            if (J != null) {
                String trim = J.trim();
                if (!trim.isEmpty() && trim.length() <= 100) {
                    if (e70.I() > 0) {
                        if (!e70.M()) {
                            z2.f("clientStartTimeUs is null.");
                            return false;
                        } else if (e70.J().startsWith("_st_") && ((l = (Long) e70.F().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                            z2.f("non-positive totalFrames in screen trace " + e70.J());
                            return false;
                        } else {
                            for (E70 e702 : e70.L()) {
                                if (!e(e702, i + 1)) {
                                    return false;
                                }
                            }
                            for (Map.Entry entry : e70.G().entrySet()) {
                                try {
                                    AbstractC1023cR.b((String) entry.getKey(), (String) entry.getValue());
                                } catch (IllegalArgumentException e) {
                                    z2.f(e.getLocalizedMessage());
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                    z2.f("invalid TraceDuration:" + e70.I());
                    return false;
                }
            }
            z2.f("invalid TraceId:" + e70.J());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[ORIG_RETURN, RETURN] */
    @Override // defpackage.AbstractC1023cR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r5 = this;
            E70 r0 = r5.a
            r1 = 0
            boolean r2 = e(r0, r1)
            Z2 r3 = defpackage.C0982bw.b
            if (r2 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid Trace:"
            r2.<init>(r4)
            java.lang.String r0 = r0.J()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.f(r0)
            return r1
        L21:
            int r2 = r0.E()
            if (r2 <= 0) goto L28
            goto L42
        L28:
            qE r2 = r0.L()
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r2.next()
            E70 r4 = (defpackage.E70) r4
            int r4 = r4.E()
            if (r4 <= 0) goto L30
        L42:
            boolean r2 = d(r0, r1)
            if (r2 != 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid Counters for Trace:"
            r2.<init>(r4)
            java.lang.String r0 = r0.J()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.f(r0)
            return r1
        L5e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0982bw.a():boolean");
    }
}
