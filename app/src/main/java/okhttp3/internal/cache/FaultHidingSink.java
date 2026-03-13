package okhttp3.internal.cache;

import java.io.IOException;
/* loaded from: classes2.dex */
class FaultHidingSink extends AbstractC2975vy {
    public boolean c;

    @Override // defpackage.AbstractC2975vy, defpackage.E20, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.c = true;
            a();
        }
    }

    @Override // defpackage.AbstractC2975vy, defpackage.E20, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.c = true;
            a();
        }
    }

    @Override // defpackage.AbstractC2975vy, defpackage.E20
    public final void r(long j, C1995kb c1995kb) {
        if (this.c) {
            c1995kb.w(j);
            return;
        }
        try {
            super.r(j, c1995kb);
        } catch (IOException unused) {
            this.c = true;
            a();
        }
    }

    public void a() {
    }
}
