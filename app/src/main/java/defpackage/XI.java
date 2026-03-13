package defpackage;
/* renamed from: XI  reason: default package */
/* loaded from: classes.dex */
public final class XI {
    public final C3244z4 a;

    public XI(C0865ae0 c0865ae0, C1288ee0 c1288ee0, WS ws) {
        this.a = new C3244z4(22, c0865ae0, c1288ee0, ws);
    }

    public static int a(C3244z4 c3244z4, Object obj, Object obj2) {
        int z0;
        int size;
        int x0;
        int size2;
        int x02;
        int i = 1;
        int i2 = C2198mu.c;
        int v0 = C0242Ee.v0(1);
        C1041ce0 c1041ce0 = EnumC1632ie0.f;
        C0865ae0 c0865ae0 = (C0865ae0) c3244z4.c;
        if (c0865ae0 == c1041ce0) {
            v0 *= 2;
        }
        switch (c0865ae0.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                z0 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                z0 = 4;
                break;
            case 2:
                z0 = C0242Ee.z0(((Long) obj).longValue());
                break;
            case 3:
                z0 = C0242Ee.z0(((Long) obj).longValue());
                break;
            case 4:
                z0 = C0242Ee.z0(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                z0 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                z0 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                z0 = 1;
                break;
            case 8:
                if (obj instanceof C0317Hb) {
                    size = ((C0317Hb) obj).size();
                    x0 = C0242Ee.x0(size);
                    z0 = size + x0;
                    break;
                } else {
                    z0 = C0242Ee.u0((String) obj);
                    break;
                }
            case 9:
                z0 = ((MA) ((AbstractC0810a0) obj)).a(null);
                break;
            case 10:
                size = ((MA) ((AbstractC0810a0) obj)).a(null);
                x0 = C0242Ee.x0(size);
                z0 = size + x0;
                break;
            case 11:
                if (obj instanceof C0317Hb) {
                    size = ((C0317Hb) obj).size();
                    x0 = C0242Ee.x0(size);
                } else {
                    size = ((byte[]) obj).length;
                    x0 = C0242Ee.x0(size);
                }
                z0 = size + x0;
                break;
            case 12:
                z0 = C0242Ee.x0(((Integer) obj).intValue());
                break;
            case 13:
                z0 = C0242Ee.z0(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                z0 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                z0 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                z0 = C0242Ee.x0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                z0 = C0242Ee.z0((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int i3 = z0 + v0;
        int v02 = C0242Ee.v0(2);
        C1288ee0 c1288ee0 = (C1288ee0) c3244z4.d;
        if (c1288ee0 == c1041ce0) {
            v02 *= 2;
        }
        switch (c1288ee0.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i = 4;
                break;
            case 2:
                i = C0242Ee.z0(((Long) obj2).longValue());
                break;
            case 3:
                i = C0242Ee.z0(((Long) obj2).longValue());
                break;
            case 4:
                i = C0242Ee.z0(((Integer) obj2).intValue());
                break;
            case 5:
                ((Long) obj2).getClass();
                i = 8;
                break;
            case 6:
                ((Integer) obj2).getClass();
                i = 4;
                break;
            case 7:
                ((Boolean) obj2).getClass();
                break;
            case 8:
                if (obj2 instanceof C0317Hb) {
                    size2 = ((C0317Hb) obj2).size();
                    x02 = C0242Ee.x0(size2);
                    i = x02 + size2;
                    break;
                } else {
                    i = C0242Ee.u0((String) obj2);
                    break;
                }
            case 9:
                i = ((MA) ((AbstractC0810a0) obj2)).a(null);
                break;
            case 10:
                size2 = ((MA) ((AbstractC0810a0) obj2)).a(null);
                x02 = C0242Ee.x0(size2);
                i = x02 + size2;
                break;
            case 11:
                if (obj2 instanceof C0317Hb) {
                    size2 = ((C0317Hb) obj2).size();
                    x02 = C0242Ee.x0(size2);
                } else {
                    size2 = ((byte[]) obj2).length;
                    x02 = C0242Ee.x0(size2);
                }
                i = x02 + size2;
                break;
            case 12:
                i = C0242Ee.x0(((Integer) obj2).intValue());
                break;
            case 13:
                i = C0242Ee.z0(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                i = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                i = 8;
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                i = C0242Ee.x0((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i = C0242Ee.z0((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i + v02 + i3;
    }
}
