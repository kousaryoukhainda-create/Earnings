package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* renamed from: ba0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0948ba0 {
    public static final Unsafe a;
    public static final Class b;
    public static final Z90 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    static {
        boolean s;
        boolean r;
        Unsafe j = j();
        a = j;
        b = R2.a;
        boolean f2 = f(Long.TYPE);
        boolean f3 = f(Integer.TYPE);
        Z90 z90 = null;
        if (j != null) {
            if (R2.a()) {
                if (f2) {
                    z90 = new V90(j, 1);
                } else if (f3) {
                    z90 = new V90(j, 0);
                }
            } else {
                z90 = new Z90(j);
            }
        }
        c = z90;
        boolean z = false;
        if (z90 == null) {
            s = false;
        } else {
            s = z90.s();
        }
        d = s;
        if (z90 == null) {
            r = false;
        } else {
            r = z90.r();
        }
        e = r;
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e2 = e();
        if (e2 != null && z90 != null) {
            z90.j(e2);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        }
        g = z;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(AbstractC0948ba0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (R2.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!R2.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return c.d(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new T90());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int g2 = c.g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(((255 & b2) << i) | (g2 & (~(255 << i))), j2, obj);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(((255 & b2) << i) | (c.g(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void n(int i, long j, Object obj) {
        c.o(i, j, obj);
    }

    public static void o(Object obj, long j, Object obj2) {
        c.q(obj, j, obj2);
    }
}
