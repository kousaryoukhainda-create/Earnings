package defpackage;

import android.app.usage.UsageEvents;
import java.util.Iterator;
/* renamed from: Lk0  reason: default package */
/* loaded from: classes2.dex */
public final class Lk0 implements Iterator {
    public final UsageEvents b;
    public C1560hl0 c = b();

    public Lk0(UsageEvents usageEvents) {
        this.b = usageEvents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hl0] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ul0] */
    public final C1560hl0 b() {
        C1560hl0 c1560hl0 = 0;
        while (c1560hl0 == 0) {
            UsageEvents usageEvents = this.b;
            if (!usageEvents.hasNextEvent()) {
                break;
            }
            UsageEvents.Event event = new UsageEvents.Event();
            usageEvents.getNextEvent(event);
            String packageName = event.getPackageName();
            if (event.getEventType() == 12 && AbstractC2102ll0.a(packageName)) {
                c1560hl0 = new C2875ul0(event.getPackageName(), event.getTimeStamp());
            }
        }
        return c1560hl0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1560hl0 c1560hl0 = this.c;
        if (c1560hl0 == null) {
            return null;
        }
        this.c = b();
        return c1560hl0;
    }
}
