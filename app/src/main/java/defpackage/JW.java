package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: JW  reason: default package */
/* loaded from: classes2.dex */
public final class JW implements Serializable {
    public final Object b;

    public /* synthetic */ JW(Object obj) {
        this.b = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof IW) {
            return ((IW) obj).b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JW)) {
            return false;
        }
        if (!Intrinsics.a(this.b, ((JW) obj).b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof IW) {
            return ((IW) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
