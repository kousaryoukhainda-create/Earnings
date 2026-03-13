package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Z4  reason: default package */
/* loaded from: classes.dex */
public class Z4 extends AbstractSet {
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;

    public /* synthetic */ Z4(Map map, int i) {
        this.b = i;
        this.c = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    Object value = entry.getValue();
                    ((J20) this.c).put((Comparable) entry.getKey(), value);
                    return true;
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    Object value2 = entry2.getValue();
                    ((K20) this.c).put((Comparable) entry2.getKey(), value2);
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.b) {
            case 1:
                ((J20) this.c).clear();
                return;
            case 2:
                ((K20) this.c).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((J20) this.c).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((K20) this.c).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2 && (obj3 == null || !obj3.equals(value2))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.b) {
            case 0:
                return new C0996c5((C1243e5) this.c);
            case 1:
                return new P20((J20) this.c, 0);
            default:
                return new P20((K20) this.c, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((J20) this.c).remove(entry.getKey());
                    return true;
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((K20) this.c).remove(entry2.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.b) {
            case 0:
                return ((C1243e5) this.c).d;
            case 1:
                return ((J20) this.c).size();
            default:
                return ((K20) this.c).size();
        }
    }
}
