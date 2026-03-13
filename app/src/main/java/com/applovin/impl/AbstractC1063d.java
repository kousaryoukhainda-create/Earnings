package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
/* renamed from: com.applovin.impl.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1063d extends pp {
    private b a = b.NOT_READY;
    private Object b;

    /* renamed from: com.applovin.impl.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.applovin.impl.d$b */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.a = b.FAILED;
        this.b = a();
        if (this.a != b.DONE) {
            this.a = b.READY;
            return true;
        }
        return false;
    }

    public abstract Object a();

    public final Object b() {
        this.a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.a != b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = b.NOT_READY;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
