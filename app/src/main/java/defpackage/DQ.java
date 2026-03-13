package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: DQ  reason: default package */
/* loaded from: classes2.dex */
public final class DQ implements InterfaceC0293Gd {
    public final Class b;

    public DQ(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.b = jClass;
    }

    @Override // defpackage.InterfaceC0293Gd
    public final Class a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DQ) {
            if (Intrinsics.a(this.b, ((DQ) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b + " (Kotlin reflection is not available)";
    }
}
