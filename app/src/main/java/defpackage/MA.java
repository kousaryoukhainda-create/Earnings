package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: MA  reason: default package */
/* loaded from: classes.dex */
public abstract class MA extends AbstractC0810a0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, MA> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected D90 unknownFields;

    public MA() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = D90.f;
    }

    public static MA f(Class cls) {
        MA ma = defaultInstanceMap.get(cls);
        if (ma == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ma = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ma == null) {
            ma = (MA) ((MA) AbstractC1033ca0.d(cls)).e(6);
            if (ma != null) {
                defaultInstanceMap.put(cls, ma);
            } else {
                throw new IllegalStateException();
            }
        }
        return ma;
    }

    public static Object g(Method method, AbstractC0810a0 abstractC0810a0, Object... objArr) {
        try {
            return method.invoke(abstractC0810a0, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean h(MA ma, boolean z) {
        byte byteValue = ((Byte) ma.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ST st = ST.c;
        st.getClass();
        boolean c = st.a(ma.getClass()).c(ma);
        if (z) {
            ma.e(2);
        }
        return c;
    }

    public static void l(Class cls, MA ma) {
        ma.j();
        defaultInstanceMap.put(cls, ma);
    }

    @Override // defpackage.AbstractC0810a0
    public final int a(VY vy) {
        int h;
        int h2;
        if (i()) {
            if (vy == null) {
                ST st = ST.c;
                st.getClass();
                h2 = st.a(getClass()).h(this);
            } else {
                h2 = vy.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            throw new IllegalStateException(AbstractC0324Hi.e(h2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (vy == null) {
            ST st2 = ST.c;
            st2.getClass();
            h = st2.a(getClass()).h(this);
        } else {
            h = vy.h(this);
        }
        m(h);
        return h;
    }

    @Override // defpackage.AbstractC0810a0
    public final void b(C0242Ee c0242Ee) {
        ST st = ST.c;
        st.getClass();
        VY a = st.a(getClass());
        Oc0 oc0 = c0242Ee.A;
        if (oc0 == null) {
            oc0 = new Oc0(c0242Ee);
        }
        a.e(this, oc0);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ST st = ST.c;
        st.getClass();
        return st.a(getClass()).i(this, (MA) obj);
    }

    public final int hashCode() {
        if (i()) {
            ST st = ST.c;
            st.getClass();
            return st.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            ST st2 = ST.c;
            st2.getClass();
            this.memoizedHashCode = st2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MA k() {
        return (MA) e(4);
    }

    public final void m(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC1979kM.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC1979kM.c(this, sb, 0);
        return sb.toString();
    }
}
