package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Uu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0673Uu implements Iterator, RF {
    public final /* synthetic */ int b;
    public final Iterator c;
    public int d;
    public Object f;
    public final /* synthetic */ NZ g;

    public C0673Uu(C0699Vu c0699Vu) {
        this.b = 0;
        this.g = c0699Vu;
        this.c = c0699Vu.a.iterator();
        this.d = -1;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gG, kotlin.jvm.functions.Function1] */
    public void b() {
        Object next;
        do {
            Iterator it = this.c;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.d = 0;
                return;
            }
        } while (((Boolean) ((C0699Vu) this.g).b.invoke(next)).booleanValue());
        this.f = next;
        this.d = 1;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f;
        if (it2 != null && it2.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            Iterator it3 = this.c;
            if (it3.hasNext()) {
                Object next = it3.next();
                C0571Qw c0571Qw = (C0571Qw) this.g;
                it = (Iterator) c0571Qw.c.invoke(c0571Qw.b.invoke(next));
            } else {
                this.d = 2;
                this.f = null;
                return false;
            }
        } while (!it.hasNext());
        this.f = it;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.d == -1) {
                    b();
                }
                if (this.d == 1) {
                    return true;
                }
                return false;
            default:
                int i = this.d;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                if (this.d == -1) {
                    b();
                }
                if (this.d != 0) {
                    Object obj = this.f;
                    this.f = null;
                    this.d = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                int i = this.d;
                if (i != 2) {
                    if (i == 0 && !c()) {
                        throw new NoSuchElementException();
                    }
                    this.d = 0;
                    Iterator it = (Iterator) this.f;
                    Intrinsics.b(it);
                    return it.next();
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0673Uu(C0571Qw c0571Qw) {
        this.b = 1;
        this.g = c0571Qw;
        this.c = c0571Qw.a.iterator();
    }
}
