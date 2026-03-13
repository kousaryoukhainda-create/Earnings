package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: pG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2403pG extends AbstractC1233e0 implements InterfaceC2489qG, RandomAccess {
    public final List c;

    static {
        new C2403pG();
    }

    public C2403pG(ArrayList arrayList) {
        super(true);
        this.c = arrayList;
    }

    @Override // defpackage.InterfaceC2489qG
    public final void a(C0291Gb c0291Gb) {
        e();
        this.c.add(c0291Gb);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        e();
        this.c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.c.size(), collection);
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.c;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0291Gb) {
            C0291Gb c0291Gb = (C0291Gb) obj;
            c0291Gb.getClass();
            Charset charset = AbstractC2658sE.a;
            if (c0291Gb.size() == 0) {
                str = "";
            } else {
                str = new String(c0291Gb.c, c0291Gb.e(), c0291Gb.size(), charset);
            }
            int e = c0291Gb.e();
            if (Da0.a.Z(e, c0291Gb.c, c0291Gb.size() + e) == 0) {
                list.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC2658sE.a);
            AbstractC0957bf abstractC0957bf = Da0.a;
            if (Da0.a.Z(0, bArr, bArr.length) == 0) {
                list.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.InterfaceC2487qE
    public final InterfaceC2487qE i(int i) {
        List list = this.c;
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(list);
            return new C2403pG(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.InterfaceC2489qG
    public final List m() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.InterfaceC2489qG
    public final InterfaceC2489qG q() {
        if (this.b) {
            return new K90(this);
        }
        return this;
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        e();
        Object remove = this.c.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C0291Gb) {
            C0291Gb c0291Gb = (C0291Gb) remove;
            c0291Gb.getClass();
            Charset charset = AbstractC2658sE.a;
            if (c0291Gb.size() == 0) {
                return "";
            }
            return new String(c0291Gb.c, c0291Gb.e(), c0291Gb.size(), charset);
        }
        return new String((byte[]) remove, AbstractC2658sE.a);
    }

    @Override // defpackage.InterfaceC2489qG
    public final Object s(int i) {
        return this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        Object obj2 = this.c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C0291Gb) {
            C0291Gb c0291Gb = (C0291Gb) obj2;
            c0291Gb.getClass();
            Charset charset = AbstractC2658sE.a;
            if (c0291Gb.size() == 0) {
                return "";
            }
            return new String(c0291Gb.c, c0291Gb.e(), c0291Gb.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC2658sE.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public C2403pG() {
        super(false);
        this.c = Collections.emptyList();
    }

    @Override // defpackage.AbstractC1233e0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof InterfaceC2489qG) {
            collection = ((InterfaceC2489qG) collection).m();
        }
        boolean addAll = this.c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public C2403pG(int i) {
        this(new ArrayList(i));
    }
}
