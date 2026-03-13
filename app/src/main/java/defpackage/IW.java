package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: IW  reason: default package */
/* loaded from: classes2.dex */
public final class IW implements Serializable {
    public final Throwable b;

    public IW(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.b = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IW) {
            if (Intrinsics.a(this.b, ((IW) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.b + ')';
    }
}
