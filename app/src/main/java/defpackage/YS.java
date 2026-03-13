package defpackage;
/* renamed from: YS  reason: default package */
/* loaded from: classes.dex */
public final class YS extends AbstractC2756tQ {
    public final Object b;

    public YS(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.AbstractC2756tQ
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.AbstractC2756tQ
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YS) {
            return this.b.equals(((YS) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.b + ")";
    }
}
