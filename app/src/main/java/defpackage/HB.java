package defpackage;

import android.os.SystemClock;
import java.util.List;
/* renamed from: HB  reason: default package */
/* loaded from: classes.dex */
public final class HB extends S9 {
    public int g;

    @Override // defpackage.InterfaceC1225dt
    public final void b(long j, long j2, long j3, List list, InterfaceC1891jK[] interfaceC1891jKArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.g, elapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!a(i, elapsedRealtime)) {
                this.g = i;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int e() {
        return this.g;
    }

    @Override // defpackage.InterfaceC1225dt
    public final int o() {
        return 0;
    }

    @Override // defpackage.InterfaceC1225dt
    public final Object r() {
        return null;
    }
}
