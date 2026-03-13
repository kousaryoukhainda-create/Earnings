package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
/* loaded from: classes4.dex */
final class i extends j {
    private final Set d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set d() {
        return this.d;
    }

    @Override // j$.time.zone.j
    protected final f c(String str) {
        if (this.d.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new RuntimeException("Not a built-in time zone: " + str);
    }
}
