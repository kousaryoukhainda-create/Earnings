package defpackage;
/* renamed from: cj  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050cj extends LA {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C1050cj DEFAULT_INSTANCE;
    private static volatile OQ PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX WARN: Type inference failed for: r0v0, types: [LA, cj] */
    static {
        ?? la = new LA();
        DEFAULT_INSTANCE = la;
        LA.s(C1050cj.class, la);
    }

    public static void u(C1050cj c1050cj, long j) {
        c1050cj.bitField0_ |= 1;
        c1050cj.clientTimeUs_ = j;
    }

    public static void v(C1050cj c1050cj, long j) {
        c1050cj.bitField0_ |= 2;
        c1050cj.userTimeUs_ = j;
    }

    public static void w(C1050cj c1050cj, long j) {
        c1050cj.bitField0_ |= 4;
        c1050cj.systemTimeUs_ = j;
    }

    public static C0965bj x() {
        return (C0965bj) DEFAULT_INSTANCE.l();
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
                return new HU(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
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
                    synchronized (C1050cj.class) {
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
