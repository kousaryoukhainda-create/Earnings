package defpackage;
/* renamed from: u8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2822u8 extends AbstractC0454Mj {
    public final String a;

    public C2822u8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0454Mj) {
            return this.a.equals(((C2822u8) ((AbstractC0454Mj) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0324Hi.h(new StringBuilder("User{identifier="), this.a, "}");
    }
}
