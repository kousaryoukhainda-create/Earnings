package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: G60  reason: default package */
/* loaded from: classes2.dex */
public class G60 {
    public static final F60 d = new Object();
    public boolean a;
    public long b;
    public long c;

    public G60 a() {
        this.a = false;
        return this;
    }

    public G60 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public G60 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public G60 g(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j >= 0) {
            this.c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(BK.l(j, "timeout < 0: ").toString());
    }
}
