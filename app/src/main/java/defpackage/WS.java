package defpackage;
/* renamed from: WS  reason: default package */
/* loaded from: classes.dex */
public final class WS extends MA {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final WS DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile PQ PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        WS ws = new WS();
        DEFAULT_INSTANCE = ws;
        MA.l(WS.class, ws);
    }

    public static VS F() {
        return (VS) ((IA) DEFAULT_INSTANCE.e(5));
    }

    public static void n(WS ws, long j) {
        ws.valueCase_ = 4;
        ws.value_ = Long.valueOf(j);
    }

    public static void o(WS ws, String str) {
        ws.getClass();
        str.getClass();
        ws.valueCase_ = 5;
        ws.value_ = str;
    }

    public static void p(WS ws, US us) {
        ws.getClass();
        ws.value_ = us;
        ws.valueCase_ = 6;
    }

    public static void q(WS ws, double d) {
        ws.valueCase_ = 7;
        ws.value_ = Double.valueOf(d);
    }

    public static void r(WS ws, C0317Hb c0317Hb) {
        ws.getClass();
        ws.valueCase_ = 8;
        ws.value_ = c0317Hb;
    }

    public static void s(WS ws, boolean z) {
        ws.valueCase_ = 1;
        ws.value_ = Boolean.valueOf(z);
    }

    public static void t(WS ws, float f) {
        ws.valueCase_ = 2;
        ws.value_ = Float.valueOf(f);
    }

    public static void u(WS ws, int i) {
        ws.valueCase_ = 3;
        ws.value_ = Integer.valueOf(i);
    }

    public static WS x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final US D() {
        if (this.valueCase_ == 6) {
            return (US) this.value_;
        }
        return US.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [PQ, java.lang.Object] */
    @Override // defpackage.MA
    public final Object e(int i) {
        switch (AbstractC0324Hi.A(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new IU(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", US.class});
            case 3:
                return new WS();
            case 4:
                return new IA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                PQ pq = PARSER;
                PQ pq2 = pq;
                if (pq == null) {
                    synchronized (WS.class) {
                        try {
                            PQ pq3 = PARSER;
                            PQ pq4 = pq3;
                            if (pq3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                pq4 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return pq2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0317Hb w() {
        if (this.valueCase_ == 8) {
            return (C0317Hb) this.value_;
        }
        return C0317Hb.d;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
