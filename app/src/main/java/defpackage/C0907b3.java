package defpackage;
/* renamed from: b3  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907b3 extends LA {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C0907b3 DEFAULT_INSTANCE;
    private static volatile OQ PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX WARN: Type inference failed for: r0v0, types: [b3, LA] */
    static {
        ?? la = new LA();
        DEFAULT_INSTANCE = la;
        LA.s(C0907b3.class, la);
    }

    public static void u(C0907b3 c0907b3, long j) {
        c0907b3.bitField0_ |= 1;
        c0907b3.clientTimeUs_ = j;
    }

    public static void v(C0907b3 c0907b3, int i) {
        c0907b3.bitField0_ |= 2;
        c0907b3.usedAppJavaHeapMemoryKb_ = i;
    }

    public static C0816a3 w() {
        return (C0816a3) DEFAULT_INSTANCE.l();
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
                return new HU(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new LA();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (C0907b3.class) {
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
}
