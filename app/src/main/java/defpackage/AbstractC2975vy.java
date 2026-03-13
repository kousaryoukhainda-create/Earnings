package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: vy  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2975vy implements E20 {
    public final E20 b;

    public AbstractC2975vy(E20 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.b = delegate;
    }

    @Override // defpackage.E20, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.E20, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    @Override // defpackage.E20
    public final G60 g() {
        return this.b.g();
    }

    @Override // defpackage.E20
    public void r(long j, C1995kb source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.b.r(j, source);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.b + ')';
    }
}
