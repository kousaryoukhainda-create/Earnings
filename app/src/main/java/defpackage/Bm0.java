package defpackage;

import j$.util.function.Predicate;
/* renamed from: Bm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Bm0 implements Predicate {
    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        C0212Da c0212Da = (C0212Da) obj;
        return false;
    }
}
