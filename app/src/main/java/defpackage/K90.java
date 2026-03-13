package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: K90  reason: default package */
/* loaded from: classes.dex */
public final class K90 extends AbstractList implements InterfaceC2489qG, RandomAccess {
    public final C2403pG b;

    public K90(C2403pG c2403pG) {
        this.b = c2403pG;
    }

    @Override // defpackage.InterfaceC2489qG
    public final void a(C0291Gb c0291Gb) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J90, java.util.Iterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.b = this.b.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I90, java.util.ListIterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.b = this.b.listIterator(i);
        return obj;
    }

    @Override // defpackage.InterfaceC2489qG
    public final List m() {
        return Collections.unmodifiableList(this.b.c);
    }

    @Override // defpackage.InterfaceC2489qG
    public final Object s(int i) {
        return this.b.c.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.c.size();
    }

    @Override // defpackage.InterfaceC2489qG
    public final InterfaceC2489qG q() {
        return this;
    }
}
