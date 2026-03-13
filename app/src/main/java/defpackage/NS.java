package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: NS  reason: default package */
/* loaded from: classes.dex */
public final class NS {
    public final String a;

    public NS(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NS) {
            return Intrinsics.a(this.a, ((NS) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
