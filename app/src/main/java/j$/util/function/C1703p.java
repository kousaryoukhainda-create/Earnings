package j$.util.function;

import java.util.function.DoublePredicate;
/* renamed from: j$.util.function.p  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1703p {
    public final /* synthetic */ DoublePredicate a;

    private /* synthetic */ C1703p(DoublePredicate doublePredicate) {
        this.a = doublePredicate;
    }

    public static /* synthetic */ C1703p a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C1703p(doublePredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoublePredicate doublePredicate = this.a;
        if (obj instanceof C1703p) {
            obj = ((C1703p) obj).a;
        }
        return doublePredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
