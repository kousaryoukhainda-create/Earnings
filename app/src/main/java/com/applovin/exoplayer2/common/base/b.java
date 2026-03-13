package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class b implements Iterator {
    private EnumC0003b a = EnumC0003b.NOT_READY;
    private Object b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0003b.values().length];
            a = iArr;
            try {
                iArr[EnumC0003b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0003b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0003b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.a = EnumC0003b.FAILED;
        this.b = a();
        if (this.a != EnumC0003b.DONE) {
            this.a = EnumC0003b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.a = EnumC0003b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.a != EnumC0003b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = EnumC0003b.NOT_READY;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
