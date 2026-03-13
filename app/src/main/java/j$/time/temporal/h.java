package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.AbstractC1669i;
import j$.time.format.F;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
abstract class h implements s {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ h[] b;

    public /* synthetic */ TemporalAccessor n(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
        return null;
    }

    @Override // j$.time.temporal.s
    public final boolean z() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.s
            public final w l() {
                return w.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.s
            public final boolean q(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR)) {
                    s sVar = j.a;
                    if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final w y(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                long u = temporalAccessor.u(h.QUARTER_OF_YEAR);
                if (u == 1) {
                    return j$.time.chrono.t.d.N(temporalAccessor.u(a.YEAR)) ? w.j(1L, 91L) : w.j(1L, 90L);
                } else if (u == 2) {
                    return w.j(1L, 91L);
                } else {
                    if (u == 3 || u == 4) {
                        return w.j(1L, 92L);
                    }
                    return l();
                }
            }

            @Override // j$.time.temporal.s
            public final long p(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                int n = temporalAccessor.n(a.DAY_OF_YEAR);
                int n2 = temporalAccessor.n(a.MONTH_OF_YEAR);
                long u = temporalAccessor.u(a.YEAR);
                iArr = h.a;
                return n - iArr[((n2 - 1) / 3) + (j$.time.chrono.t.d.N(u) ? 4 : 0)];
            }

            @Override // j$.time.temporal.s
            public final m u(m mVar, long j) {
                long p = p(mVar);
                l().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j - p) + mVar.u(aVar), aVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final TemporalAccessor n(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
                long j;
                j$.time.g gVar;
                a aVar = a.YEAR;
                Long l = (Long) hashMap.get(aVar);
                s sVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) hashMap.get(sVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int Q = aVar.Q(l.longValue());
                long longValue = ((Long) hashMap.get(h.DAY_OF_QUARTER)).longValue();
                s sVar2 = j.a;
                if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                    if (f == F.LENIENT) {
                        gVar = j$.time.g.d0(Q, 1, 1).j0(j$.com.android.tools.r8.a.j(j$.com.android.tools.r8.a.m(l2.longValue(), 1L), 3));
                        j = j$.com.android.tools.r8.a.m(longValue, 1L);
                    } else {
                        j$.time.g d0 = j$.time.g.d0(Q, ((sVar.l().a(l2.longValue(), sVar) - 1) * 3) + 1, 1);
                        if (longValue < 1 || longValue > 90) {
                            if (f == F.STRICT) {
                                y(d0).b(longValue, this);
                            } else {
                                l().b(longValue, this);
                            }
                        }
                        j = longValue - 1;
                        gVar = d0;
                    }
                    hashMap.remove(this);
                    hashMap.remove(aVar);
                    hashMap.remove(sVar);
                    return gVar.i0(j);
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.s
            public final w l() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.s
            public final boolean q(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.MONTH_OF_YEAR)) {
                    s sVar = j.a;
                    if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final long p(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.u(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.s
            public final w y(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return l();
            }

            @Override // j$.time.temporal.s
            public final m u(m mVar, long j) {
                long p = p(mVar);
                l().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j - p) * 3) + mVar.u(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.s
            public final w l() {
                return w.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.s
            public final boolean q(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.EPOCH_DAY)) {
                    s sVar = j.a;
                    if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final w y(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.U(j$.time.g.S(temporalAccessor));
            }

            @Override // j$.time.temporal.s
            public final long p(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.R(j$.time.g.S(temporalAccessor));
            }

            @Override // j$.time.temporal.s
            public final m u(m mVar, long j) {
                l().b(j, this);
                return mVar.e(j$.com.android.tools.r8.a.m(j, p(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final TemporalAccessor n(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
                j$.time.g d;
                long j;
                long j2;
                s sVar = h.WEEK_BASED_YEAR;
                Long l = (Long) hashMap.get(sVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) hashMap.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = sVar.l().a(l.longValue(), sVar);
                long longValue = ((Long) hashMap.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                s sVar2 = j.a;
                if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                    j$.time.g d0 = j$.time.g.d0(a2, 1, 4);
                    if (f == F.LENIENT) {
                        long longValue2 = l2.longValue();
                        if (longValue2 > 7) {
                            long j3 = longValue2 - 1;
                            d0 = d0.k0(j3 / 7);
                            j2 = j3 % 7;
                        } else {
                            j = 1;
                            if (longValue2 < 1) {
                                d0 = d0.k0(j$.com.android.tools.r8.a.m(longValue2, 7L) / 7);
                                j2 = (longValue2 + 6) % 7;
                            }
                            d = d0.k0(j$.com.android.tools.r8.a.m(longValue, j)).d(longValue2, aVar);
                        }
                        j = 1;
                        longValue2 = j2 + 1;
                        d = d0.k0(j$.com.android.tools.r8.a.m(longValue, j)).d(longValue2, aVar);
                    } else {
                        int Q = aVar.Q(l2.longValue());
                        if (longValue < 1 || longValue > 52) {
                            if (f == F.STRICT) {
                                h.U(d0).b(longValue, this);
                            } else {
                                l().b(longValue, this);
                            }
                        }
                        d = d0.k0(longValue - 1).d(Q, aVar);
                    }
                    hashMap.remove(this);
                    hashMap.remove(sVar);
                    hashMap.remove(aVar);
                    return d;
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.s
            public final w l() {
                return a.YEAR.l();
            }

            @Override // j$.time.temporal.s
            public final boolean q(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.EPOCH_DAY)) {
                    s sVar = j.a;
                    if (AbstractC1669i.q(temporalAccessor).equals(j$.time.chrono.t.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final long p(TemporalAccessor temporalAccessor) {
                int V;
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                V = h.V(j$.time.g.S(temporalAccessor));
                return V;
            }

            @Override // j$.time.temporal.s
            public final w y(TemporalAccessor temporalAccessor) {
                if (!q(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                return l();
            }

            @Override // j$.time.temporal.s
            public final m u(m mVar, long j) {
                int W;
                if (!q(mVar)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.l().a(j, h.WEEK_BASED_YEAR);
                j$.time.g S = j$.time.g.S(mVar);
                a aVar = a.DAY_OF_WEEK;
                int n = S.n(aVar);
                int R = h.R(S);
                if (R == 53) {
                    W = h.W(a2);
                    if (W == 52) {
                        R = 52;
                    }
                }
                j$.time.g d0 = j$.time.g.d0(a2, 1, 4);
                return mVar.p(d0.i0(((R - 1) * 7) + (n - d0.n(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w U(j$.time.g gVar) {
        return w.j(1L, W(V(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int W(int i) {
        j$.time.g d0 = j$.time.g.d0(i, 1, 1);
        if (d0.V() != DayOfWeek.THURSDAY) {
            return (d0.V() == DayOfWeek.WEDNESDAY && d0.F()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(j$.time.g gVar) {
        int ordinal = gVar.V().ordinal();
        int i = 1;
        int W = gVar.W() - 1;
        int i2 = (3 - ordinal) + W;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (W < i4) {
            return (int) w.j(1L, W(V(gVar.p0(180).l0(-1L)))).d();
        }
        int i5 = ((W - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && gVar.F())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int V(j$.time.g gVar) {
        int Y = gVar.Y();
        int W = gVar.W();
        if (W <= 3) {
            return W - gVar.V().ordinal() < -2 ? Y - 1 : Y;
        } else if (W >= 363) {
            return ((W - 363) - (gVar.F() ? 1 : 0)) - gVar.V().ordinal() >= 0 ? Y + 1 : Y;
        } else {
            return Y;
        }
    }
}
