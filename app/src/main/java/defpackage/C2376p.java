package defpackage;
/* renamed from: p  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2376p extends AbstractC2756tQ {
    public static final C2376p b = new Object();

    @Override // defpackage.AbstractC2756tQ
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.AbstractC2756tQ
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
