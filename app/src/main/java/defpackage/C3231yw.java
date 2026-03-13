package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: yw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3231yw {
    public final DN a;
    public C1297ej b;

    public C3231yw(DN mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.a = mutex;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3231yw)) {
            return false;
        }
        C3231yw c3231yw = (C3231yw) obj;
        if (this.a.equals(c3231yw.a) && Intrinsics.a(this.b, c3231yw.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        C1297ej c1297ej = this.b;
        if (c1297ej == null) {
            hashCode = 0;
        } else {
            hashCode = c1297ej.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
