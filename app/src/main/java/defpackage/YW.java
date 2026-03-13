package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: YW  reason: default package */
/* loaded from: classes.dex */
public abstract class YW {
    public volatile C3148xz a;
    public Executor b;
    public InterfaceC1330f50 c;
    public final JE d;
    public boolean e;
    public boolean f;
    public ArrayList g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public YW() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        if (this.e || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void b() {
        if (!((SQLiteDatabase) this.c.o().c).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        C3148xz o = this.c.o();
        this.d.c(o);
        o.a();
    }

    public abstract JE d();

    public abstract InterfaceC1330f50 e(C2293o1 c2293o1);

    public final void f() {
        this.c.o().h();
        if (!((SQLiteDatabase) this.c.o().c).inTransaction()) {
            JE je = this.d;
            if (je.d.compareAndSet(false, true)) {
                je.c.b.execute(je.i);
            }
        }
    }

    public final Cursor g(InterfaceC1416g50 interfaceC1416g50) {
        a();
        b();
        return this.c.o().j(interfaceC1416g50);
    }

    public final void h() {
        this.c.o().l();
    }
}
