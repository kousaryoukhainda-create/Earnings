package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes4.dex */
public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    
    private final String a;

    static {
        Duration duration = Duration.c;
        Duration.y(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.u
    public final m l(m mVar, long j) {
        return mVar.e(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
