package j$.time.temporal;

import j$.time.chrono.AbstractC1669i;
import j$.time.format.F;
import java.util.HashMap;
/* loaded from: classes4.dex */
enum k implements s {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient w b;
    private final transient long c;

    @Override // j$.time.temporal.s
    public final boolean z() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = w.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.s
    public final w l() {
        return this.b;
    }

    @Override // j$.time.temporal.s
    public final boolean q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.s
    public final w y(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.EPOCH_DAY)) {
            throw new RuntimeException("Unsupported field: " + this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.s
    public final long p(TemporalAccessor temporalAccessor) {
        return temporalAccessor.u(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.s
    public final m u(m mVar, long j) {
        if (!this.b.i(j)) {
            throw new RuntimeException("Invalid value: " + this.a + " " + j);
        }
        return mVar.d(j$.com.android.tools.r8.a.m(j, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.s
    public final TemporalAccessor n(HashMap hashMap, TemporalAccessor temporalAccessor, F f) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.m q = AbstractC1669i.q(temporalAccessor);
        F f2 = F.LENIENT;
        long j = this.c;
        if (f == f2) {
            return q.k(j$.com.android.tools.r8.a.m(longValue, j));
        }
        this.b.b(longValue, this);
        return q.k(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
