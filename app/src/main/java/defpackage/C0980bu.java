package defpackage;

import java.util.Collections;
import java.util.Map;
/* renamed from: bu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980bu {
    public final String a;
    public final Map b;

    public C0980bu(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static C0980bu a(String str) {
        return new C0980bu(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0980bu)) {
            return false;
        }
        C0980bu c0980bu = (C0980bu) obj;
        if (this.a.equals(c0980bu.a) && this.b.equals(c0980bu.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
