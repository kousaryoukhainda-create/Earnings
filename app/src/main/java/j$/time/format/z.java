package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class z {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.z.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D b() {
        return this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(j$.time.temporal.t tVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object y = temporalAccessor.y(tVar);
        if (y == null && this.c == 0) {
            throw new RuntimeException("Unable to extract " + tVar + " from temporal " + temporalAccessor);
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.s sVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.f(sVar)) {
            return Long.valueOf(temporalAccessor.u(sVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
