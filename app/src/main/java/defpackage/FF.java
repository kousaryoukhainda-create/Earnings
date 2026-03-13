package defpackage;

import java.io.Writer;
/* renamed from: FF  reason: default package */
/* loaded from: classes.dex */
public final class FF extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw new AssertionError();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        throw new AssertionError();
    }
}
