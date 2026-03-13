package defpackage;
/* renamed from: o20  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296o20 extends AbstractC3001wD {
    public final transient Object f;

    public C2296o20(Object obj) {
        obj.getClass();
        this.f = obj;
    }

    @Override // defpackage.AbstractC2056lD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // defpackage.AbstractC3001wD, defpackage.AbstractC2056lD
    public final AbstractC2571rD e() {
        return AbstractC2571rD.x(this.f);
    }

    @Override // defpackage.AbstractC2056lD
    public final int f(int i, Object[] objArr) {
        objArr[i] = this.f;
        return i + 1;
    }

    @Override // defpackage.AbstractC3001wD, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.AbstractC2056lD
    public final boolean l() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OE, H90] */
    @Override // defpackage.AbstractC2056lD
    public final H90 n() {
        ?? h90 = new H90(0);
        h90.c = this.f;
        return h90;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f.toString() + ']';
    }
}
