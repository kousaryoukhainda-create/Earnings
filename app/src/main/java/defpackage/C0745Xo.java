package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Xo  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0745Xo implements Iterator, RF {
    public int b = -1;
    public int c;
    public int d;
    public C2057lE f;
    public int g;
    public final /* synthetic */ C0771Yo h;

    public C0745Xo(C0771Yo c0771Yo) {
        this.h = c0771Yo;
        int n = AbstractC0957bf.n(c0771Yo.b, c0771Yo.a.length());
        this.c = n;
        this.d = n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r6 < r3) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [lE, jE] */
    /* JADX WARN: Type inference failed for: r0v8, types: [lE, jE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.d
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.b = r1
            r0 = 0
            r7.f = r0
            goto L7b
        Lb:
            Yo r2 = r7.h
            int r3 = r2.c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.g
            int r6 = r6 + r5
            r7.g = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            lE r0 = new lE
            int r1 = r7.c
            java.lang.CharSequence r2 = r2.a
            int r2 = kotlin.text.d.r(r2)
            r0.<init>(r1, r2, r5)
            r7.f = r0
            r7.d = r4
            goto L79
        L34:
            Tz r0 = r2.d
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            JQ r0 = (defpackage.JQ) r0
            if (r0 != 0) goto L58
            lE r0 = new lE
            int r1 = r7.c
            java.lang.CharSequence r2 = r2.a
            int r2 = kotlin.text.d.r(r2)
            r0.<init>(r1, r2, r5)
            r7.f = r0
            r7.d = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.c
            lE r3 = defpackage.AbstractC0957bf.r0(r3, r2)
            r7.f = r3
            int r2 = r2 + r0
            r7.c = r2
            if (r0 != 0) goto L76
            r1 = 1
        L76:
            int r2 = r2 + r1
            r7.d = r2
        L79:
            r7.b = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0745Xo.b():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            b();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == -1) {
            b();
        }
        if (this.b != 0) {
            C2057lE c2057lE = this.f;
            Intrinsics.c(c2057lE, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f = null;
            this.b = -1;
            return c2057lE;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
