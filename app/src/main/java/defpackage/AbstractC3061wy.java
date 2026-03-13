package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: wy  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3061wy implements InterfaceC0817a30 {
    public final InterfaceC0817a30 b;

    public AbstractC3061wy(InterfaceC0817a30 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.b = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.InterfaceC0817a30
    public long d(long j, C1995kb sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.b.d(j, sink);
    }

    @Override // defpackage.InterfaceC0817a30
    public final G60 g() {
        return this.b.g();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.b + ')';
    }
}
