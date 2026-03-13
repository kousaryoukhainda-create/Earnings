package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: n0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2205n0 {
    public AbstractC2291o0[] b;
    public int c;
    public int d;

    public final void a(C1242e40 c1242e40) {
        synchronized (this) {
            try {
                int i = this.c - 1;
                this.c = i;
                if (i == 0) {
                    this.d = 0;
                }
                Intrinsics.c(c1242e40, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                C1157d40 c1157d40 = (C1157d40) this;
                C1242e40.a.set(c1242e40, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
