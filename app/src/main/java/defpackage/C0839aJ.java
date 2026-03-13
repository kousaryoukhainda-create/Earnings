package defpackage;

import java.util.Map;
/* renamed from: aJ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839aJ {
    public static int a(int i, Object obj, Object obj2) {
        int w0;
        int f;
        int u0;
        int w02;
        int f2;
        int u02;
        YI yi = (YI) obj;
        WI wi = (WI) obj2;
        int i2 = 0;
        if (!yi.isEmpty()) {
            for (Map.Entry entry : yi.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                wi.getClass();
                int s0 = C0190Ce.s0(i);
                C3244z4 c3244z4 = wi.a;
                int i3 = C2112lu.c;
                int s02 = C0190Ce.s0(1);
                C0956be0 c0956be0 = EnumC1546he0.g;
                Zd0 zd0 = (Zd0) c3244z4.c;
                if (zd0 == c0956be0) {
                    s02 *= 2;
                }
                switch (zd0.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        w0 = 8;
                        break;
                    case 1:
                        ((Float) key).getClass();
                        w0 = 4;
                        break;
                    case 2:
                        w0 = C0190Ce.w0(((Long) key).longValue());
                        break;
                    case 3:
                        w0 = C0190Ce.w0(((Long) key).longValue());
                        break;
                    case 4:
                        w0 = C0190Ce.k0(((Integer) key).intValue());
                        break;
                    case 5:
                        ((Long) key).getClass();
                        w0 = 8;
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        w0 = 4;
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        w0 = 1;
                        break;
                    case 8:
                        if (key instanceof C0291Gb) {
                            w0 = C0190Ce.c0((C0291Gb) key);
                            break;
                        } else {
                            w0 = C0190Ce.r0((String) key);
                            break;
                        }
                    case 9:
                        w0 = ((LA) ((Z) key)).f(null);
                        break;
                    case 10:
                        f = ((LA) ((Z) key)).f(null);
                        u0 = C0190Ce.u0(f);
                        w0 = f + u0;
                        break;
                    case 11:
                        if (key instanceof C0291Gb) {
                            w0 = C0190Ce.c0((C0291Gb) key);
                            break;
                        } else {
                            f = ((byte[]) key).length;
                            u0 = C0190Ce.u0(f);
                            w0 = f + u0;
                            break;
                        }
                    case 12:
                        w0 = C0190Ce.u0(((Integer) key).intValue());
                        break;
                    case 13:
                        if (key instanceof R4) {
                            w0 = C0190Ce.k0(((R4) key).b);
                            break;
                        } else {
                            w0 = C0190Ce.k0(((Integer) key).intValue());
                            break;
                        }
                    case 14:
                        ((Integer) key).getClass();
                        w0 = 4;
                        break;
                    case 15:
                        ((Long) key).getClass();
                        w0 = 8;
                        break;
                    case 16:
                        int intValue = ((Integer) key).intValue();
                        w0 = C0190Ce.u0((intValue >> 31) ^ (intValue << 1));
                        break;
                    case 17:
                        long longValue = ((Long) key).longValue();
                        w0 = C0190Ce.w0((longValue << 1) ^ (longValue >> 63));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                int i4 = w0 + s02;
                EnumC1546he0 enumC1546he0 = (EnumC1546he0) c3244z4.d;
                int s03 = C0190Ce.s0(2);
                if (enumC1546he0 == c0956be0) {
                    s03 *= 2;
                }
                switch (enumC1546he0.ordinal()) {
                    case 0:
                        ((Double) value).getClass();
                        w02 = 8;
                        break;
                    case 1:
                        ((Float) value).getClass();
                        w02 = 4;
                        break;
                    case 2:
                        w02 = C0190Ce.w0(((Long) value).longValue());
                        break;
                    case 3:
                        w02 = C0190Ce.w0(((Long) value).longValue());
                        break;
                    case 4:
                        w02 = C0190Ce.k0(((Integer) value).intValue());
                        break;
                    case 5:
                        ((Long) value).getClass();
                        w02 = 8;
                        break;
                    case 6:
                        ((Integer) value).getClass();
                        w02 = 4;
                        break;
                    case 7:
                        ((Boolean) value).getClass();
                        w02 = 1;
                        break;
                    case 8:
                        if (value instanceof C0291Gb) {
                            w02 = C0190Ce.c0((C0291Gb) value);
                            break;
                        } else {
                            w02 = C0190Ce.r0((String) value);
                            break;
                        }
                    case 9:
                        w02 = ((LA) ((Z) value)).f(null);
                        break;
                    case 10:
                        f2 = ((LA) ((Z) value)).f(null);
                        u02 = C0190Ce.u0(f2);
                        w02 = u02 + f2;
                        break;
                    case 11:
                        if (value instanceof C0291Gb) {
                            w02 = C0190Ce.c0((C0291Gb) value);
                            break;
                        } else {
                            f2 = ((byte[]) value).length;
                            u02 = C0190Ce.u0(f2);
                            w02 = u02 + f2;
                            break;
                        }
                    case 12:
                        w02 = C0190Ce.u0(((Integer) value).intValue());
                        break;
                    case 13:
                        if (value instanceof R4) {
                            w02 = C0190Ce.k0(((R4) value).b);
                            break;
                        } else {
                            w02 = C0190Ce.k0(((Integer) value).intValue());
                            break;
                        }
                    case 14:
                        ((Integer) value).getClass();
                        w02 = 4;
                        break;
                    case 15:
                        ((Long) value).getClass();
                        w02 = 8;
                        break;
                    case 16:
                        int intValue2 = ((Integer) value).intValue();
                        w02 = C0190Ce.u0((intValue2 >> 31) ^ (intValue2 << 1));
                        break;
                    case 17:
                        long longValue2 = ((Long) value).longValue();
                        w02 = C0190Ce.w0((longValue2 >> 63) ^ (longValue2 << 1));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                int i5 = w02 + s03 + i4;
                i2 += C0190Ce.u0(i5) + i5 + s0;
            }
        }
        return i2;
    }

    public static void b(Object obj) {
        ((YI) obj).b = false;
    }
}
