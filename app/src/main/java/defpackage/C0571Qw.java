package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Qw  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0571Qw implements NZ {
    public final NZ a;
    public final Function1 b;
    public final Function1 c;

    public C0571Qw(NZ sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.a = sequence;
        this.b = transformer;
        this.c = iterator;
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        return new C0673Uu(this);
    }
}
