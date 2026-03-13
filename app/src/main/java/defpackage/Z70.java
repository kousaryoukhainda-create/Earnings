package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Z70  reason: default package */
/* loaded from: classes2.dex */
public final class Z70 implements NZ {
    public final NZ a;
    public final Function1 b;

    public Z70(NZ sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.a = sequence;
        this.b = transformer;
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        return new Y70(this);
    }
}
