package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: h50  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1502h50 extends AbstractC3040wi implements InterfaceC1253eA {
    private final int arity;

    public AbstractC1502h50(int i, InterfaceC2868ui interfaceC2868ui) {
        super(interfaceC2868ui);
        this.arity = i;
    }

    @Override // defpackage.InterfaceC1253eA
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.K9
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            AbstractC3019wV.a.getClass();
            String a = BV.a(this);
            Intrinsics.checkNotNullExpressionValue(a, "renderLambdaToString(...)");
            return a;
        }
        return super.toString();
    }
}
