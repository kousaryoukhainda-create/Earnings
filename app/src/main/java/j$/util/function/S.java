package j$.util.function;

import java.util.function.LongPredicate;
/* loaded from: classes4.dex */
public final /* synthetic */ class S {
    public final /* synthetic */ LongPredicate a;

    private /* synthetic */ S(LongPredicate longPredicate) {
        this.a = longPredicate;
    }

    public static /* synthetic */ S a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new S(longPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongPredicate longPredicate = this.a;
        if (obj instanceof S) {
            obj = ((S) obj).a;
        }
        return longPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
