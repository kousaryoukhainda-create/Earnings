package defpackage;

import java.util.NoSuchElementException;
/* renamed from: OE  reason: default package */
/* loaded from: classes.dex */
public final class OE extends H90 {
    public static final Object d = new Object();
    public Object c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.c;
        Object obj2 = d;
        if (obj != obj2) {
            this.c = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
