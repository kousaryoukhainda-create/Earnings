package com.applovin.impl;

import android.os.Looper;
import android.os.Message;
import com.applovin.impl.a9;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class gc {
    private final l3 a;
    private final ia b;
    private final b c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private boolean g;

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj, a9 a9Var);
    }

    public gc(Looper looper, l3 l3Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, l3Var, bVar);
    }

    public static /* synthetic */ boolean a(gc gcVar, Message message) {
        return gcVar.a(message);
    }

    private gc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, l3 l3Var, b bVar) {
        this.a = l3Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = l3Var.a(looper, new C2919vH(this, 5));
    }

    public void a(Object obj) {
        if (this.g) {
            return;
        }
        b1.a(obj);
        this.d.add(new c(obj));
    }

    public void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final Object a;
        private a9.b b = new a9.b();
        private boolean c;
        private boolean d;

        public c(Object obj) {
            this.a = obj;
        }

        public void a(int i, a aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.a(this.a);
        }

        public void b(b bVar) {
            this.d = true;
            if (this.c) {
                bVar.a(this.a, this.b.a());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void a(b bVar) {
            if (this.d || !this.c) {
                return;
            }
            a9 a = this.b.a();
            this.b = new a9.b();
            this.c = false;
            bVar.a(this.a, a);
        }
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(0)) {
            ia iaVar = this.b;
            iaVar.a(iaVar.d(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public void b(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a.equals(obj)) {
                cVar.b(this.c);
                this.d.remove(cVar);
            }
        }
    }

    public void b(int i, a aVar) {
        a(i, aVar);
        a();
    }

    public boolean a(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.c);
            if (this.b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public void a(int i, a aVar) {
        this.f.add(new RunnableC2279np(new CopyOnWriteArraySet(this.d), i, aVar, 10));
    }

    public gc a(Looper looper, b bVar) {
        return new gc(this.d, looper, this.a, bVar);
    }
}
