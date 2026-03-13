package defpackage;
/* renamed from: vA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2912vA extends LA {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C2912vA DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile OQ PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private InterfaceC2487qE androidMemoryReadings_;
    private int bitField0_;
    private InterfaceC2487qE cpuMetricReadings_;
    private C2654sA gaugeMetadata_;
    private String sessionId_ = "";

    static {
        C2912vA c2912vA = new C2912vA();
        DEFAULT_INSTANCE = c2912vA;
        LA.s(C2912vA.class, c2912vA);
    }

    public C2912vA() {
        TT tt = TT.f;
        this.cpuMetricReadings_ = tt;
        this.androidMemoryReadings_ = tt;
    }

    public static C2912vA A() {
        return DEFAULT_INSTANCE;
    }

    public static C2826uA E() {
        return (C2826uA) DEFAULT_INSTANCE.l();
    }

    public static void u(C2912vA c2912vA, String str) {
        c2912vA.getClass();
        str.getClass();
        c2912vA.bitField0_ |= 1;
        c2912vA.sessionId_ = str;
    }

    public static void v(C2912vA c2912vA, C0907b3 c0907b3) {
        c2912vA.getClass();
        c0907b3.getClass();
        InterfaceC2487qE interfaceC2487qE = c2912vA.androidMemoryReadings_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            c2912vA.androidMemoryReadings_ = LA.r(interfaceC2487qE);
        }
        c2912vA.androidMemoryReadings_.add(c0907b3);
    }

    public static void w(C2912vA c2912vA, C2654sA c2654sA) {
        c2912vA.getClass();
        c2654sA.getClass();
        c2912vA.gaugeMetadata_ = c2654sA;
        c2912vA.bitField0_ |= 2;
    }

    public static void x(C2912vA c2912vA, C1050cj c1050cj) {
        c2912vA.getClass();
        c1050cj.getClass();
        InterfaceC2487qE interfaceC2487qE = c2912vA.cpuMetricReadings_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            c2912vA.cpuMetricReadings_ = LA.r(interfaceC2487qE);
        }
        c2912vA.cpuMetricReadings_.add(c1050cj);
    }

    public final C2654sA B() {
        C2654sA c2654sA = this.gaugeMetadata_;
        if (c2654sA == null) {
            return C2654sA.x();
        }
        return c2654sA;
    }

    public final boolean C() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [OQ, java.lang.Object] */
    @Override // defpackage.LA
    public final Object m(int i) {
        switch (AbstractC0324Hi.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new HU(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C1050cj.class, "gaugeMetadata_", "androidMemoryReadings_", C0907b3.class});
            case 3:
                return new C2912vA();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (C2912vA.class) {
                        try {
                            OQ oq3 = PARSER;
                            OQ oq4 = oq3;
                            if (oq3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                oq4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return oq2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int y() {
        return this.androidMemoryReadings_.size();
    }

    public final int z() {
        return this.cpuMetricReadings_.size();
    }
}
