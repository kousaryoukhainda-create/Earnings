package j$.util.function;

import java.util.function.LongToIntFunction;
/* loaded from: classes4.dex */
public final /* synthetic */ class U {
    public final /* synthetic */ LongToIntFunction a;

    private /* synthetic */ U(LongToIntFunction longToIntFunction) {
        this.a = longToIntFunction;
    }

    public static /* synthetic */ U a(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return new U(longToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToIntFunction longToIntFunction = this.a;
        if (obj instanceof U) {
            obj = ((U) obj).a;
        }
        return longToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
