package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class e0 {
    public static final e0 a = new b();
    public static final e0 b = new c();

    public abstract void a(Object obj, long j);

    public abstract <L> void a(Object obj, Object obj2, long j);

    public abstract <L> List<L> b(Object obj, long j);

    /* loaded from: classes.dex */
    public static final class c extends e0 {
        public c() {
            super();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public void a(Object obj, long j) {
            ((y.j) p1.g(obj, j)).b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public <L> List<L> b(Object obj, long j) {
            int i;
            y.j jVar = (y.j) p1.g(obj, j);
            if (!jVar.d()) {
                int size = jVar.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                y.j b = jVar.b(i);
                p1.a(obj, j, b);
                return b;
            }
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public <E> void a(Object obj, Object obj2, long j) {
            y.j<E> jVar = (y.j) p1.g(obj, j);
            y.j<E> jVar2 = (y.j) p1.g(obj2, j);
            int size = jVar.size();
            int size2 = jVar2.size();
            y.j<E> jVar3 = jVar;
            jVar3 = jVar;
            if (size > 0 && size2 > 0) {
                boolean d = jVar.d();
                y.j<E> jVar4 = jVar;
                if (!d) {
                    jVar4 = jVar.b(size2 + size);
                }
                jVar4.addAll(jVar2);
                jVar3 = jVar4;
            }
            if (size > 0) {
                jVar2 = jVar3;
            }
            p1.a(obj, j, jVar2);
        }
    }

    public e0() {
    }

    /* loaded from: classes.dex */
    public static final class b extends e0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public void a(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) p1.g(obj, j);
            if (list instanceof d0) {
                unmodifiableList = ((d0) list).a();
            } else if (c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof x0) && (list instanceof y.j)) {
                    y.j jVar = (y.j) list;
                    if (jVar.d()) {
                        jVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p1.a(obj, j, unmodifiableList);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public <L> List<L> b(Object obj, long j) {
            return a(obj, j, 10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e0
        public <E> void a(Object obj, Object obj2, long j) {
            List list = (List) p1.g(obj2, j);
            List a = a(obj, j, list.size());
            int size = a.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                a.addAll(list);
            }
            if (size > 0) {
                list = a;
            }
            p1.a(obj, j, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> a(Object obj, long j, int i) {
            c0 c0Var;
            List<L> arrayList;
            List<L> list = (List) p1.g(obj, j);
            if (list.isEmpty()) {
                if (list instanceof d0) {
                    arrayList = new c0(i);
                } else if ((list instanceof x0) && (list instanceof y.j)) {
                    arrayList = ((y.j) list).b(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                p1.a(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i);
                arrayList2.addAll(list);
                p1.a(obj, j, arrayList2);
                c0Var = arrayList2;
            } else if (list instanceof n1) {
                c0 c0Var2 = new c0(list.size() + i);
                c0Var2.addAll(c0Var2.b.size(), (n1) list);
                p1.a(obj, j, c0Var2);
                c0Var = c0Var2;
            } else if ((list instanceof x0) && (list instanceof y.j)) {
                y.j jVar = (y.j) list;
                if (jVar.d()) {
                    return list;
                }
                y.j b = jVar.b(list.size() + i);
                p1.a(obj, j, b);
                return b;
            } else {
                return list;
            }
            return c0Var;
        }
    }
}
