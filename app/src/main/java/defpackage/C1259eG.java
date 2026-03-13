package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: eG  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1259eG implements Comparable {
    public static final C1259eG c = new C1259eG();
    public final int b = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1259eG other = (C1259eG) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.b - other.b;
    }

    public final boolean equals(Object obj) {
        C1259eG c1259eG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1259eG) {
            c1259eG = (C1259eG) obj;
        } else {
            c1259eG = null;
        }
        if (c1259eG != null && this.b == c1259eG.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "2.1.0";
    }
}
