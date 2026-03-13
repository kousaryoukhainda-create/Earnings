package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* renamed from: CH  reason: default package */
/* loaded from: classes.dex */
public final class CH extends AbstractSequentialList implements Serializable {
    public final AbstractCollection b;
    public final InterfaceC0548Pz c;

    public CH(List list, InterfaceC0548Pz interfaceC0548Pz) {
        list.getClass();
        this.b = (AbstractCollection) list;
        this.c = interfaceC0548Pz;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new AH(this, this.b.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.b.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
