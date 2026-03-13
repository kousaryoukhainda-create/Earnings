package defpackage;
/* renamed from: V2  reason: default package */
/* loaded from: classes.dex */
public final class V2 extends LA {
    private static final V2 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile OQ PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        V2 v2 = new V2();
        DEFAULT_INSTANCE = v2;
        LA.s(V2.class, v2);
    }

    public static T2 A() {
        return (T2) DEFAULT_INSTANCE.l();
    }

    public static void u(V2 v2, String str) {
        v2.getClass();
        str.getClass();
        v2.bitField0_ |= 1;
        v2.packageName_ = str;
    }

    public static void v(V2 v2) {
        v2.getClass();
        v2.bitField0_ |= 2;
        v2.sdkVersion_ = "21.0.5";
    }

    public static void w(V2 v2, String str) {
        v2.getClass();
        v2.bitField0_ |= 4;
        v2.versionName_ = str;
    }

    public static V2 x() {
        return DEFAULT_INSTANCE;
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
                return new HU(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new V2();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (V2.class) {
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
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }
}
