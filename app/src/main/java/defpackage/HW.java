package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: HW  reason: default package */
/* loaded from: classes2.dex */
public abstract class HW extends GW implements InterfaceC1253eA {
    public final int b;

    public HW(InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.b = 2;
    }

    @Override // defpackage.InterfaceC1253eA
    public final int getArity() {
        return this.b;
    }

    @Override // defpackage.K9
    public final String toString() {
        if (getCompletion() == null) {
            AbstractC3019wV.a.getClass();
            String a = BV.a(this);
            Intrinsics.checkNotNullExpressionValue(a, "renderLambdaToString(...)");
            return a;
        }
        return super.toString();
    }
}
