package j$.time;

import j$.time.chrono.AbstractC1669i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    public static Instant T() {
        a.b.getClass();
        return U(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int e = j$.com.android.tools.r8.a.e(this.a, instant2.a);
        return e != 0 ? e : this.b - instant2.b;
    }

    static {
        W(-31557014167219200L, 0L);
        W(31556889864403199L, 999999999L);
    }

    public static Instant V(long j) {
        return Q(j, 0);
    }

    public static Instant W(long j, long j2) {
        return Q(j$.com.android.tools.r8.a.k(j, j$.com.android.tools.r8.a.g(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.l(j2, 1000000000L));
    }

    public static Instant U(long j) {
        long j2 = 1000;
        return Q(j$.com.android.tools.r8.a.g(j, j2), ((int) j$.com.android.tools.r8.a.l(j, j2)) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return W(temporalAccessor.u(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.n(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + name, e);
        }
    }

    private static Instant Q(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new RuntimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.NANO_OF_SECOND || sVar == j$.time.temporal.a.MICRO_OF_SECOND || sVar == j$.time.temporal.a.MILLI_OF_SECOND : sVar != null && sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i = e.a[((j$.time.temporal.a) sVar).ordinal()];
            int i2 = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return i2 / 1000000;
                    }
                    if (i == 4) {
                        j$.time.temporal.a.INSTANT_SECONDS.Q(this.a);
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                }
                return i2 / 1000;
            }
            return i2;
        }
        return j$.time.temporal.n.d(this, sVar).a(sVar.p(this), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        int i;
        if (sVar instanceof j$.time.temporal.a) {
            int i2 = e.a[((j$.time.temporal.a) sVar).ordinal()];
            int i3 = this.b;
            if (i2 != 1) {
                if (i2 == 2) {
                    i = i3 / 1000;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        return this.a;
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                } else {
                    i = i3 / 1000000;
                }
                return i;
            }
            return i3;
        }
        return sVar.p(this);
    }

    public final long R() {
        return this.a;
    }

    public final int S() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.R(j);
            int i = e.a[aVar.ordinal()];
            int i2 = this.b;
            long j2 = this.a;
            if (i != 1) {
                if (i == 2) {
                    int i3 = ((int) j) * 1000;
                    if (i3 != i2) {
                        return Q(j2, i3);
                    }
                } else if (i == 3) {
                    int i4 = ((int) j) * 1000000;
                    if (i4 != i2) {
                        return Q(j2, i4);
                    }
                } else if (i != 4) {
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                } else {
                    if (j != j2) {
                        return Q(j, i2);
                    }
                }
            } else if (j != i2) {
                return Q(j2, (int) j);
            }
            return this;
        }
        return (Instant) sVar.u(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Y */
    public final Instant e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (e.b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return X(0L, j);
                case 2:
                    return X(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return X(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return X(j, 0L);
                case 5:
                    return X(j$.com.android.tools.r8.a.j(j, 60), 0L);
                case 6:
                    return X(j$.com.android.tools.r8.a.j(j, 3600), 0L);
                case 7:
                    return X(j$.com.android.tools.r8.a.j(j, 43200), 0L);
                case 8:
                    return X(j$.com.android.tools.r8.a.j(j, 86400), 0L);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        }
        return (Instant) uVar.l(this, j);
    }

    private Instant X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return W(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.k(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object y(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.j()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.l() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.i() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.g(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m z(j$.time.temporal.m mVar) {
        return mVar.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.R(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.R(this, zoneId);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        if (j < 0 && i > 0) {
            return j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.j(j + 1, 1000), (i / 1000000) - 1000);
        }
        return j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.j(j, 1000), i / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.a == instant.a && this.b == instant.b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.h.format(this);
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(g gVar) {
        return (Instant) AbstractC1669i.a(gVar, this);
    }
}
