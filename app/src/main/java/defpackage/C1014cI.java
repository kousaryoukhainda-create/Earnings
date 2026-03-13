package defpackage;

import java.util.Arrays;
/* renamed from: cI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014cI {
    public final long a;
    public final float b;
    public final long c;

    public C1014cI(C0929bI c0929bI) {
        this.a = c0929bI.a;
        this.b = c0929bI.b;
        this.c = c0929bI.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014cI)) {
            return false;
        }
        C1014cI c1014cI = (C1014cI) obj;
        if (this.a == c1014cI.a && this.b == c1014cI.b && this.c == c1014cI.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
