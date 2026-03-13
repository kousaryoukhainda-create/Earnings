package defpackage;

import java.io.Closeable;
import java.io.Flushable;
/* renamed from: E20  reason: default package */
/* loaded from: classes2.dex */
public interface E20 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    G60 g();

    void r(long j, C1995kb c1995kb);
}
