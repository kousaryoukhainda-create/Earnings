package j$.time;

import j$.time.temporal.TemporalAccessor;
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements j$.time.temporal.t {
    public final /* synthetic */ int a;

    @Override // j$.time.temporal.t
    public final Object g(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return LocalDateTime.R(temporalAccessor);
            default:
                return ZonedDateTime.Q(temporalAccessor);
        }
    }
}
