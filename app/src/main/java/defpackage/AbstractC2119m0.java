package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: m0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2119m0 implements InterfaceFutureC2490qH {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g = Logger.getLogger(AbstractC2119m0.class.getName());
    public static final Wh0 h;
    public static final Object i;
    public volatile Object b;
    public volatile C1577i0 c;
    public volatile C2033l0 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Wh0] */
    /* JADX WARN: Type inference failed for: r3v7 */
    static {
        C1861j0 c1861j0;
        try {
            th = null;
            c1861j0 = new C1861j0(AtomicReferenceFieldUpdater.newUpdater(C2033l0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2033l0.class, C2033l0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2119m0.class, C2033l0.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2119m0.class, C1577i0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2119m0.class, Object.class, "b"));
        } catch (Throwable th) {
            th = th;
            c1861j0 = new Object();
        }
        h = c1861j0;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i = new Object();
    }

    public static void f(AbstractC2119m0 abstractC2119m0) {
        C2033l0 c2033l0;
        C1577i0 c1577i0;
        C1577i0 c1577i02;
        C1577i0 c1577i03;
        do {
            c2033l0 = abstractC2119m0.d;
        } while (!h.m(abstractC2119m0, c2033l0, C2033l0.c));
        while (true) {
            c1577i0 = null;
            if (c2033l0 == null) {
                break;
            }
            Thread thread = c2033l0.a;
            if (thread != null) {
                c2033l0.a = null;
                LockSupport.unpark(thread);
            }
            c2033l0 = c2033l0.b;
        }
        abstractC2119m0.e();
        do {
            c1577i02 = abstractC2119m0.c;
        } while (!h.k(abstractC2119m0, c1577i02, C1577i0.d));
        while (true) {
            c1577i03 = c1577i0;
            c1577i0 = c1577i02;
            if (c1577i0 == null) {
                break;
            }
            c1577i02 = c1577i0.c;
            c1577i0.c = c1577i03;
        }
        while (c1577i03 != null) {
            C1577i0 c1577i04 = c1577i03.c;
            g(c1577i03.a, c1577i03.b);
            c1577i03 = c1577i04;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            g.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object h(Object obj) {
        if (!(obj instanceof C1405g0)) {
            if (!(obj instanceof C1491h0)) {
                if (obj == i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C1491h0) obj).a);
        }
        CancellationException cancellationException = ((C1405g0) obj).b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object i(AbstractC2119m0 abstractC2119m0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC2119m0.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object i2 = i(this);
            sb.append("SUCCESS, result=[");
            if (i2 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(i2);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // defpackage.InterfaceFutureC2490qH
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C1577i0 c1577i0 = this.c;
        C1577i0 c1577i02 = C1577i0.d;
        if (c1577i0 != c1577i02) {
            C1577i0 c1577i03 = new C1577i0(runnable, executor);
            do {
                c1577i03.c = c1577i0;
                if (h.k(this, c1577i0, c1577i03)) {
                    return;
                }
                c1577i0 = this.c;
            } while (c1577i0 != c1577i02);
            g(runnable, executor);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1405g0 c1405g0;
        Object obj = this.b;
        if (obj != null) {
            return false;
        }
        if (f) {
            c1405g0 = new C1405g0(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            c1405g0 = C1405g0.c;
        } else {
            c1405g0 = C1405g0.d;
        }
        if (!h.l(this, obj, c1405g0)) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.b;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C2033l0 c2033l0 = this.d;
                C2033l0 c2033l02 = C2033l0.c;
                if (c2033l0 != c2033l02) {
                    C2033l0 c2033l03 = new C2033l0();
                    do {
                        Wh0 wh0 = h;
                        wh0.T(c2033l03, c2033l0);
                        if (wh0.m(this, c2033l0, c2033l03)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.b;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    k(c2033l03);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(c2033l03);
                        } else {
                            c2033l0 = this.d;
                        }
                    } while (c2033l0 != c2033l02);
                    return h(this.b);
                }
                return h(this.b);
            }
            while (nanos > 0) {
                Object obj3 = this.b;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC2119m0 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder k = AbstractC0324Hi.k(j, "Waited ", " ");
            k.append(timeUnit.toString().toLowerCase(locale));
            String sb = k.toString();
            if (nanos + 1000 < 0) {
                String f2 = AbstractC0324Hi.f(sb, " (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str = f2 + convert + " " + lowerCase;
                    if (z) {
                        str = AbstractC0324Hi.f(str, ",");
                    }
                    f2 = AbstractC0324Hi.f(str, " ");
                }
                if (z) {
                    f2 = f2 + nanos2 + " nanoseconds ";
                }
                sb = AbstractC0324Hi.f(f2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC0324Hi.f(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0324Hi.g(sb, " for ", abstractC2119m0));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof C1405g0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public String j() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void k(C2033l0 c2033l0) {
        c2033l0.a = null;
        while (true) {
            C2033l0 c2033l02 = this.d;
            if (c2033l02 == C2033l0.c) {
                return;
            }
            C2033l0 c2033l03 = null;
            while (c2033l02 != null) {
                C2033l0 c2033l04 = c2033l02.b;
                if (c2033l02.a != null) {
                    c2033l03 = c2033l02;
                } else if (c2033l03 != null) {
                    c2033l03.b = c2033l04;
                    if (c2033l03.a == null) {
                        break;
                    }
                } else if (!h.m(this, c2033l02, c2033l04)) {
                    break;
                }
                c2033l02 = c2033l04;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = i;
        }
        if (h.l(this, null, obj)) {
            f(this);
            return true;
        }
        return false;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (h.l(this, null, new C1491h0(th))) {
            f(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof C1405g0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = j();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                AbstractC0324Hi.w(sb, "PENDING, info=[", str, "]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if (obj2 != null) {
                return h(obj2);
            }
            C2033l0 c2033l0 = this.d;
            C2033l0 c2033l02 = C2033l0.c;
            if (c2033l0 != c2033l02) {
                C2033l0 c2033l03 = new C2033l0();
                do {
                    Wh0 wh0 = h;
                    wh0.T(c2033l03, c2033l0);
                    if (wh0.m(this, c2033l0, c2033l03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                k(c2033l03);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    c2033l0 = this.d;
                } while (c2033l0 != c2033l02);
                return h(this.b);
            }
            return h(this.b);
        }
        throw new InterruptedException();
    }
}
