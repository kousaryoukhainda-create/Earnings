package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: MR  reason: default package */
/* loaded from: classes2.dex */
public final class MR extends AbstractC1148d0 {
    @Override // defpackage.AbstractC1148d0
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
