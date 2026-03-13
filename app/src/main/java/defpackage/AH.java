package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;
/* renamed from: AH  reason: default package */
/* loaded from: classes.dex */
public final class AH extends W70 implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AH(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.c = i;
        this.d = abstractList;
    }

    @Override // defpackage.W70
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                return ((BH) this.d).c.apply(obj);
            default:
                return ((CH) this.d).c.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
