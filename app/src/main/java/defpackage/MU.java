package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: MU  reason: default package */
/* loaded from: classes.dex */
public final class MU extends AbstractC0910b40 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU(Throwable readException, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.b = readException;
    }
}
