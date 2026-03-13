package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: gG  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1431gG implements InterfaceC1253eA, Serializable {
    private final int arity;

    public AbstractC1431gG(int i) {
        this.arity = i;
    }

    @Override // defpackage.InterfaceC1253eA
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        AbstractC3019wV.a.getClass();
        String a = BV.a(this);
        Intrinsics.checkNotNullExpressionValue(a, "renderLambdaToString(...)");
        return a;
    }
}
