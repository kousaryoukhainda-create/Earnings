package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: w5  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2988w5 extends G60 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static C2988w5 l;
    public boolean e;
    public C2988w5 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, w5] */
    public final void h() {
        C2988w5 c2988w5;
        long j2 = this.c;
        boolean z = this.a;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0 && !z) {
            return;
        }
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                this.e = true;
                if (l == null) {
                    l = new Object();
                    Thread thread = new Thread("Okio Watchdog");
                    thread.setDaemon(true);
                    thread.start();
                }
                long nanoTime = System.nanoTime();
                if (i2 != 0 && z) {
                    this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (i2 != 0) {
                    this.g = j2 + nanoTime;
                } else if (z) {
                    this.g = c();
                } else {
                    throw new AssertionError();
                }
                long j3 = this.g - nanoTime;
                C2988w5 c2988w52 = l;
                Intrinsics.b(c2988w52);
                while (true) {
                    c2988w5 = c2988w52.f;
                    if (c2988w5 == null || j3 < c2988w5.g - nanoTime) {
                        break;
                    }
                    c2988w52 = c2988w5;
                }
                this.f = c2988w5;
                c2988w52.f = this;
                if (c2988w52 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            C2988w5 c2988w5 = l;
            while (c2988w5 != null) {
                C2988w5 c2988w52 = c2988w5.f;
                if (c2988w52 == this) {
                    c2988w5.f = this.f;
                    this.f = null;
                    return false;
                }
                c2988w5 = c2988w52;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
