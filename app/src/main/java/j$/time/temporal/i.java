package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes4.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    
    private final String a;

    static {
        Duration duration = Duration.c;
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.u
    public final m l(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            s sVar = j.c;
            return mVar.d(j$.com.android.tools.r8.a.k(mVar.n(sVar), j), sVar);
        } else if (i == 2) {
            return mVar.e(j / 4, b.YEARS).e((j % 4) * 3, b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
