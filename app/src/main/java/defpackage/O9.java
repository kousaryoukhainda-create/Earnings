package defpackage;

import java.util.NoSuchElementException;
/* renamed from: O9  reason: default package */
/* loaded from: classes.dex */
public abstract class O9 implements InterfaceC1891jK {
    public final long b;
    public final long c;
    public long d;

    public O9(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    public final void a() {
        long j = this.d;
        if (j >= this.b && j <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.InterfaceC1891jK
    public final boolean next() {
        boolean z;
        long j = this.d + 1;
        this.d = j;
        if (j > this.c) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
