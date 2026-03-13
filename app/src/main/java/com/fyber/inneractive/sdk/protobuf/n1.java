package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class n1 extends AbstractList<String> implements d0, RandomAccess {
    public final d0 a;

    /* loaded from: classes.dex */
    public class a implements ListIterator<String> {
        public ListIterator<String> a;

        public a(n1 n1Var, int i) {
            this.a = n1Var.a.listIterator(i);
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a.nextIndex();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Iterator<String> {
        public Iterator<String> a;

        public b(n1 n1Var) {
            this.a = n1Var.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n1(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public d0 a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public List<?> c() {
        return this.a.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new a(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.a.size();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public Object a(int i) {
        return this.a.a(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public void a(i iVar) {
        throw new UnsupportedOperationException();
    }
}
