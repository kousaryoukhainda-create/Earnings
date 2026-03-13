package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Oi  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0505Oi implements InterfaceC0402Ki {
    public final AbstractC1431gG b;
    public final InterfaceC0402Ki c;

    public C0505Oi(InterfaceC0402Ki baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.b = (AbstractC1431gG) safeCast;
        this.c = baseKey instanceof C0505Oi ? ((C0505Oi) baseKey).c : baseKey;
    }
}
