package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: LA  reason: default package */
/* loaded from: classes.dex */
public abstract class LA extends Z {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, LA> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C90 unknownFields;

    public LA() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C90.f;
    }

    public static LA n(Class cls) {
        LA la = defaultInstanceMap.get(cls);
        if (la == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                la = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (la == null) {
            la = (LA) ((LA) AbstractC0948ba0.b(cls)).m(6);
            if (la != null) {
                defaultInstanceMap.put(cls, la);
            } else {
                throw new IllegalStateException();
            }
        }
        return la;
    }

    public static Object o(Method method, Z z, Object... objArr) {
        try {
            return method.invoke(z, objArr);
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

    public static InterfaceC2487qE r(InterfaceC2487qE interfaceC2487qE) {
        int i;
        int size = interfaceC2487qE.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return interfaceC2487qE.i(i);
    }

    public static void s(Class cls, LA la) {
        la.q();
        defaultInstanceMap.put(cls, la);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RT rt = RT.c;
        rt.getClass();
        return rt.a(getClass()).g(this, (LA) obj);
    }

    @Override // defpackage.Z
    public final int f(UY uy) {
        int f;
        int f2;
        if (p()) {
            if (uy == null) {
                RT rt = RT.c;
                rt.getClass();
                f2 = rt.a(getClass()).f(this);
            } else {
                f2 = uy.f(this);
            }
            if (f2 >= 0) {
                return f2;
            }
            throw new IllegalStateException(AbstractC0324Hi.e(f2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (uy == null) {
            RT rt2 = RT.c;
            rt2.getClass();
            f = rt2.a(getClass()).f(this);
        } else {
            f = uy.f(this);
        }
        t(f);
        return f;
    }

    public final int hashCode() {
        if (p()) {
            RT rt = RT.c;
            rt.getClass();
            return rt.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            RT rt2 = RT.c;
            rt2.getClass();
            this.memoizedHashCode = rt2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    @Override // defpackage.Z
    public final void i(C0190Ce c0190Ce) {
        RT rt = RT.c;
        rt.getClass();
        UY a = rt.a(getClass());
        WC wc = c0190Ce.k;
        if (wc == null) {
            wc = new WC(c0190Ce);
        }
        a.e(this, wc);
    }

    public final void j() {
        this.memoizedHashCode = 0;
    }

    public final void k() {
        t(Integer.MAX_VALUE);
    }

    public final HA l() {
        return (HA) m(5);
    }

    public abstract Object m(int i);

    public final boolean p() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void t(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(AbstractC0324Hi.e(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC1893jM.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC1893jM.c(this, sb, 0);
        return sb.toString();
    }
}
