package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: E  reason: default package */
/* loaded from: classes.dex */
public abstract class E implements InterfaceFutureC2490qH {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger g = Logger.getLogger(E.class.getName());
    public static final AbstractC1424g90 h;
    public static final Object i;
    public volatile Object b;
    public volatile C3235z c;
    public volatile D d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [g90] */
    /* JADX WARN: Type inference failed for: r3v7 */
    static {
        A a;
        try {
            th = null;
            a = new A(AtomicReferenceFieldUpdater.newUpdater(D.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(D.class, D.class, "b"), AtomicReferenceFieldUpdater.newUpdater(E.class, D.class, "d"), AtomicReferenceFieldUpdater.newUpdater(E.class, C3235z.class, "c"), AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "b"));
        } catch (Throwable th) {
            th = th;
            a = new Object();
        }
        h = a;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        i = new Object();
    }

    public static void b(E e) {
        C3235z c3235z;
        C3235z c3235z2;
        C3235z c3235z3 = null;
        while (true) {
            D d = e.d;
            if (h.o(e, d, D.c)) {
                while (d != null) {
                    Thread thread = d.a;
                    if (thread != null) {
                        d.a = null;
                        LockSupport.unpark(thread);
                    }
                    d = d.b;
                }
                do {
                    c3235z = e.c;
                } while (!h.m(e, c3235z, C3235z.d));
                while (true) {
                    c3235z2 = c3235z3;
                    c3235z3 = c3235z;
                    if (c3235z3 == null) {
                        break;
                    }
                    c3235z = c3235z3.c;
                    c3235z3.c = c3235z2;
                }
                while (c3235z2 != null) {
                    c3235z3 = c3235z2.c;
                    Runnable runnable = c3235z2.a;
                    if (runnable instanceof B) {
                        B b = (B) runnable;
                        e = b.b;
                        if (e.b == b) {
                            if (h.n(e, b, e(b.c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, c3235z2.b);
                    }
                    c3235z2 = c3235z3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            g.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof C2977w)) {
            if (!(obj instanceof C3149y)) {
                if (obj == i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C3149y) obj).a);
        }
        CancellationException cancellationException = ((C2977w) obj).b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object e(InterfaceFutureC2490qH interfaceFutureC2490qH) {
        if (interfaceFutureC2490qH instanceof E) {
            Object obj = ((E) interfaceFutureC2490qH).b;
            if (obj instanceof C2977w) {
                C2977w c2977w = (C2977w) obj;
                if (c2977w.a) {
                    if (c2977w.b != null) {
                        return new C2977w(false, c2977w.b);
                    }
                    return C2977w.d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = interfaceFutureC2490qH.isCancelled();
        if ((!f) & isCancelled) {
            return C2977w.d;
        }
        try {
            Object f2 = f(interfaceFutureC2490qH);
            if (f2 == null) {
                return i;
            }
            return f2;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new C3149y(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2490qH, e));
            }
            return new C2977w(false, e);
        } catch (ExecutionException e2) {
            return new C3149y(e2.getCause());
        } catch (Throwable th) {
            return new C3149y(th);
        }
    }

    public static Object f(InterfaceFutureC2490qH interfaceFutureC2490qH) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC2490qH.get();
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
            Object f2 = f(this);
            sb.append("SUCCESS, result=[");
            if (f2 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f2);
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
        C3235z c3235z = this.c;
        C3235z c3235z2 = C3235z.d;
        if (c3235z != c3235z2) {
            C3235z c3235z3 = new C3235z(runnable, executor);
            do {
                c3235z3.c = c3235z;
                if (h.m(this, c3235z, c3235z3)) {
                    return;
                }
                c3235z = this.c;
            } while (c3235z != c3235z2);
            c(runnable, executor);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C2977w c2977w;
        boolean z3;
        Object obj = this.b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof B)) {
            if (f) {
                c2977w = new C2977w(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c2977w = C2977w.c;
            } else {
                c2977w = C2977w.d;
            }
            boolean z4 = false;
            E e = this;
            while (true) {
                if (h.n(e, obj, c2977w)) {
                    b(e);
                    if (!(obj instanceof B)) {
                        return true;
                    }
                    InterfaceFutureC2490qH interfaceFutureC2490qH = ((B) obj).c;
                    if (interfaceFutureC2490qH instanceof E) {
                        e = (E) interfaceFutureC2490qH;
                        obj = e.b;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof B))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        interfaceFutureC2490qH.cancel(z);
                        return true;
                    }
                } else {
                    obj = e.b;
                    if (!(obj instanceof B)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    public final String g() {
        String valueOf;
        Object obj = this.b;
        if (obj instanceof B) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC2490qH interfaceFutureC2490qH = ((B) obj).c;
            if (interfaceFutureC2490qH == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(interfaceFutureC2490qH);
            }
            return AbstractC0324Hi.h(sb, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(D d) {
        d.a = null;
        while (true) {
            D d2 = this.d;
            if (d2 == D.c) {
                return;
            }
            D d3 = null;
            while (d2 != null) {
                D d4 = d2.b;
                if (d2.a != null) {
                    d3 = d2;
                } else if (d3 != null) {
                    d3.b = d4;
                    if (d3.a == null) {
                        break;
                    }
                } else if (!h.o(this, d2, d4)) {
                    break;
                }
                d2 = d4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof C2977w;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.b;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof B)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof C2977w) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof B))) {
                return d(obj2);
            }
            D d = this.d;
            D d2 = D.c;
            if (d != d2) {
                D d3 = new D();
                do {
                    AbstractC1424g90 abstractC1424g90 = h;
                    abstractC1424g90.R(d3, d);
                    if (abstractC1424g90.o(this, d, d3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                h(d3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof B))));
                        return d(obj);
                    }
                    d = this.d;
                } while (d != d2);
                return d(this.b);
            }
            return d(this.b);
        }
        throw new InterruptedException();
    }
}
