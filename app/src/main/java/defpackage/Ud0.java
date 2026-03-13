package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ud0  reason: default package */
/* loaded from: classes.dex */
public final class Ud0 {
    public final Object a;

    public Ud0(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.a = displayFeatures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ud0.class.equals(obj.getClass())) {
            return this.a.equals(((Ud0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    public final String toString() {
        return C0553Qe.p(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
