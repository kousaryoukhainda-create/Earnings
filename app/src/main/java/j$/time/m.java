package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.time.chrono.AbstractC1669i;
import j$.time.temporal.TemporalAccessor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m implements TemporalAccessor, j$.time.temporal.o {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;
    private static final m[] a;
    private static final /* synthetic */ m[] b;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) b.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.m] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r7 = new Enum("JULY", 6);
        JULY = r7;
        ?? r6 = new Enum("AUGUST", 7);
        AUGUST = r6;
        ?? r5 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r5;
        ?? r4 = new Enum("OCTOBER", 9);
        OCTOBER = r4;
        ?? r3 = new Enum("NOVEMBER", 10);
        NOVEMBER = r3;
        ?? r2 = new Enum("DECEMBER", 11);
        DECEMBER = r2;
        b = new m[]{r12, r13, r14, r15, r9, r8, r7, r6, r5, r4, r3, r2};
        a = values();
    }

    public static m T(int i) {
        if (i < 1 || i > 12) {
            throw new RuntimeException("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.MONTH_OF_YEAR : sVar != null && sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w q(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return sVar.l();
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return sVar.p(this);
    }

    public final m U() {
        int i = ((int) 1) + 12;
        return a[(i + ordinal()) % 12];
    }

    public final int R(boolean z) {
        int i = l.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int S() {
        int i = l.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int Q(boolean z) {
        switch (l.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + ModuleDescriptor.MODULE_VERSION;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object y(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.t.d;
        }
        if (tVar == j$.time.temporal.n.j()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m z(j$.time.temporal.m mVar) {
        if (!AbstractC1669i.q(mVar).equals(j$.time.chrono.t.d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
