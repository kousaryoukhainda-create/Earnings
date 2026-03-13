package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public interface m extends Comparable {
    InterfaceC1662b D(int i, int i2, int i3);

    InterfaceC1662b G(Map map, j$.time.format.F f);

    j$.time.temporal.w H(j$.time.temporal.a aVar);

    ChronoZonedDateTime I(Instant instant, ZoneId zoneId);

    List K();

    boolean N(long j);

    n O(int i);

    boolean equals(Object obj);

    int g(n nVar, int i);

    String getId();

    int hashCode();

    InterfaceC1662b k(long j);

    InterfaceC1662b o(TemporalAccessor temporalAccessor);

    InterfaceC1665e r(LocalDateTime localDateTime);

    String t();

    String toString();

    InterfaceC1662b w(int i, int i2);
}
