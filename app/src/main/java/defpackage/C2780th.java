package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: th  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2780th implements NZ {
    public final AtomicReference a;

    public C2780th(NZ sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.a = new AtomicReference(sequence);
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        NZ nz = (NZ) this.a.getAndSet(null);
        if (nz != null) {
            return nz.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
