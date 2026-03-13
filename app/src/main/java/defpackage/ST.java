package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* renamed from: ST  reason: default package */
/* loaded from: classes.dex */
public final class ST {
    public static final ST c = new ST();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final WC a = new WC(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [oM] */
    /* JADX WARN: Type inference failed for: r4v8, types: [oM] */
    public final VY a(Class cls) {
        C2455pt c2455pt;
        C2151mM x;
        C2455pt c2455pt2;
        C2151mM c2151mM;
        Class cls2;
        AbstractC2744tE.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        VY vy = (VY) concurrentHashMap.get(cls);
        if (vy == null) {
            WC wc = this.a;
            wc.getClass();
            Class cls3 = ZY.a;
            if (!MA.class.isAssignableFrom(cls) && (cls2 = ZY.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            IU a = ((VI) wc.c).a(cls);
            if ((a.d & 2) == 2) {
                boolean isAssignableFrom = MA.class.isAssignableFrom(cls);
                MA ma = a.a;
                if (isAssignableFrom) {
                    c2151mM = new C2323oM(ZY.c, AbstractC2626rt.a, ma);
                } else {
                    F90 f90 = ZY.b;
                    C2455pt c2455pt3 = AbstractC2626rt.b;
                    if (c2455pt3 != null) {
                        c2151mM = new C2323oM(f90, c2455pt3, ma);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                x = c2151mM;
            } else if (MA.class.isAssignableFrom(cls)) {
                C2153mO c2153mO = AbstractC2325oO.b;
                C1346fH c1346fH = AbstractC1432gH.b;
                F90 f902 = ZY.c;
                if (AbstractC0324Hi.A(a.d()) != 1) {
                    c2455pt2 = AbstractC2626rt.a;
                } else {
                    c2455pt2 = null;
                }
                C0930bJ c0930bJ = AbstractC1177dJ.b;
                int[] iArr = C2151mM.n;
                if (a instanceof IU) {
                    x = C2151mM.x(a, c2153mO, c1346fH, f902, c2455pt2, c0930bJ);
                } else {
                    a.getClass();
                    throw new ClassCastException();
                }
            } else {
                C2153mO c2153mO2 = AbstractC2325oO.a;
                C1346fH c1346fH2 = AbstractC1432gH.a;
                F90 f903 = ZY.b;
                if (AbstractC0324Hi.A(a.d()) != 1) {
                    c2455pt = AbstractC2626rt.b;
                    if (c2455pt == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    c2455pt = null;
                }
                C0930bJ c0930bJ2 = AbstractC1177dJ.a;
                int[] iArr2 = C2151mM.n;
                if (a instanceof IU) {
                    x = C2151mM.x(a, c2153mO2, c1346fH2, f903, c2455pt, c0930bJ2);
                } else {
                    a.getClass();
                    throw new ClassCastException();
                }
            }
            VY vy2 = (VY) concurrentHashMap.putIfAbsent(cls, x);
            if (vy2 != null) {
                return vy2;
            }
            return x;
        }
        return vy;
    }
}
