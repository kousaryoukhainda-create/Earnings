package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: IG  reason: default package */
/* loaded from: classes.dex */
public final class IG {
    public BG a;
    public FG b;

    public final void a(HG hg, AG event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BG e = event.e();
        BG state1 = this.a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (e.compareTo(state1) < 0) {
            state1 = e;
        }
        this.a = state1;
        this.b.onStateChanged(hg, event);
        this.a = e;
    }
}
