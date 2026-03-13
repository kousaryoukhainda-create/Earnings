package defpackage;
/* renamed from: Q4  reason: default package */
/* loaded from: classes.dex */
public final class Q4 extends LA {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final Q4 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile OQ PARSER;
    private V2 androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private YI customAttributes_ = YI.c;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        Q4 q4 = new Q4();
        DEFAULT_INSTANCE = q4;
        LA.s(Q4.class, q4);
    }

    public static Q4 A() {
        return DEFAULT_INSTANCE;
    }

    public static N4 F() {
        return (N4) DEFAULT_INSTANCE.l();
    }

    public static void u(Q4 q4, String str) {
        q4.getClass();
        str.getClass();
        q4.bitField0_ |= 1;
        q4.googleAppId_ = str;
    }

    public static void v(Q4 q4, R4 r4) {
        q4.getClass();
        q4.applicationProcessState_ = r4.b;
        q4.bitField0_ |= 8;
    }

    public static YI w(Q4 q4) {
        YI yi = q4.customAttributes_;
        if (!yi.b) {
            q4.customAttributes_ = yi.d();
        }
        return q4.customAttributes_;
    }

    public static void x(Q4 q4, String str) {
        q4.getClass();
        str.getClass();
        q4.bitField0_ |= 2;
        q4.appInstanceId_ = str;
    }

    public static void y(Q4 q4, V2 v2) {
        q4.getClass();
        q4.androidAppInfo_ = v2;
        q4.bitField0_ |= 4;
    }

    public final boolean B() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
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
                return new HU(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C2999wB.c, "customAttributes_", O4.a});
            case 3:
                return new Q4();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (Q4.class) {
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

    public final V2 z() {
        V2 v2 = this.androidAppInfo_;
        if (v2 == null) {
            return V2.x();
        }
        return v2;
    }
}
