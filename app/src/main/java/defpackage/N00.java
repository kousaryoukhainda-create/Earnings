package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
/* renamed from: N00  reason: default package */
/* loaded from: classes.dex */
public final class N00 extends Q00 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ Set f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N00(Set set, Set set2, int i) {
        super(1);
        this.c = i;
        this.d = set;
        this.f = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.c) {
            case 0:
                if (!this.d.contains(obj) && !this.f.contains(obj)) {
                    return false;
                }
                return true;
            default:
                if (((AbstractC3001wD) this.d).contains(obj) && ((AbstractC3001wD) this.f).contains(obj)) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.c) {
            case 1:
                if (((AbstractC3001wD) this.d).containsAll(collection) && ((AbstractC3001wD) this.f).containsAll(collection)) {
                    return true;
                }
                return false;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.c) {
            case 0:
                if (this.d.isEmpty() && this.f.isEmpty()) {
                    return true;
                }
                return false;
            default:
                return Collections.disjoint((AbstractC3001wD) this.f, (AbstractC3001wD) this.d);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                return new M00(this);
            default:
                return new ME(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.c) {
            case 0:
                Set set = this.d;
                int size = set.size();
                for (Object obj : this.f) {
                    if (!set.contains(obj)) {
                        size++;
                    }
                }
                return size;
            default:
                int i = 0;
                for (Object obj2 : (AbstractC3001wD) this.d) {
                    if (((AbstractC3001wD) this.f).contains(obj2)) {
                        i++;
                    }
                }
                return i;
        }
    }
}
