package defpackage;
/* renamed from: sA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2654sA extends LA {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C2654sA DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile OQ PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        C2654sA c2654sA = new C2654sA();
        DEFAULT_INSTANCE = c2654sA;
        LA.s(C2654sA.class, c2654sA);
    }

    public static void u(C2654sA c2654sA, int i) {
        c2654sA.bitField0_ |= 16;
        c2654sA.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void v(C2654sA c2654sA, int i) {
        c2654sA.bitField0_ |= 32;
        c2654sA.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void w(C2654sA c2654sA, int i) {
        c2654sA.bitField0_ |= 8;
        c2654sA.deviceRamSizeKb_ = i;
    }

    public static C2654sA x() {
        return DEFAULT_INSTANCE;
    }

    public static C2568rA z() {
        return (C2568rA) DEFAULT_INSTANCE.l();
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
                return new HU(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new C2654sA();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (C2654sA.class) {
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

    public final boolean y() {
        if ((this.bitField0_ & 16) != 0) {
            return true;
        }
        return false;
    }
}
