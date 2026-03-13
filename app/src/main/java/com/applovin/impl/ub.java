package com.applovin.impl;

import java.lang.ref.WeakReference;
import java.util.Stack;
/* loaded from: classes.dex */
public interface ub {

    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public static class c implements ub {
        private final int a;
        private final Stack b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.ub
        public synchronized Object a(a aVar) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            return this.b.isEmpty() ? aVar.a() : this.b.pop();
        }

        public c(int i) {
            this.b = new Stack();
            this.a = i;
        }

        @Override // com.applovin.impl.ub
        public synchronized void a(Object obj, b bVar) {
            if (this.b.size() < this.a) {
                this.b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e) {
                    p6.a((Throwable) e);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements ub {
        private final c a = new c();

        @Override // com.applovin.impl.ub
        public Object a(a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.a.a(new C1055cl0(aVar))).get();
            } while (obj == null);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.ub
        public void a(Object obj, b bVar) {
            p6.a(obj);
            this.a.a(new WeakReference(obj), new C2959vk0(6, bVar, obj));
        }
    }

    Object a(a aVar);

    void a(Object obj, b bVar);
}
