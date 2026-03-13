package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: JQ  reason: default package */
/* loaded from: classes2.dex */
public final class JQ implements Serializable {
    public final Object b;
    public final Object c;

    public JQ(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public final Object a() {
        return this.b;
    }

    public final Object b() {
        return this.c;
    }

    public final Object c() {
        return this.b;
    }

    public final Object d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JQ)) {
            return false;
        }
        JQ jq = (JQ) obj;
        if (Intrinsics.a(this.b, jq.b) && Intrinsics.a(this.c, jq.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.c;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "(" + this.b + ", " + this.c + ')';
    }
}
