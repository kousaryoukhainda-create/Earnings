package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Vu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0699Vu implements NZ {
    public final C2129m5 a;
    public final AbstractC1431gG b;

    public C0699Vu(C2129m5 sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.a = sequence;
        this.b = (AbstractC1431gG) predicate;
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        return new C0673Uu(this);
    }
}
