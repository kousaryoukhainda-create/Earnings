package defpackage;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Rt  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0594Rt extends AbstractC1148d0 {
    public final C0568Qt d = new ThreadLocal();

    @Override // defpackage.AbstractC1148d0
    public final Random a() {
        Object obj = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
