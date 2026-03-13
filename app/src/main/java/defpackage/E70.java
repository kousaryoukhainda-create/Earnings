package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: E70  reason: default package */
/* loaded from: classes.dex */
public final class E70 extends LA {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final E70 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile OQ PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private YI counters_;
    private YI customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private InterfaceC2487qE perfSessions_;
    private InterfaceC2487qE subtraces_;

    static {
        E70 e70 = new E70();
        DEFAULT_INSTANCE = e70;
        LA.s(E70.class, e70);
    }

    public E70() {
        YI yi = YI.c;
        this.counters_ = yi;
        this.customAttributes_ = yi;
        this.name_ = "";
        TT tt = TT.f;
        this.subtraces_ = tt;
        this.perfSessions_ = tt;
    }

    public static void A(E70 e70, List list) {
        InterfaceC2487qE interfaceC2487qE = e70.perfSessions_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            e70.perfSessions_ = LA.r(interfaceC2487qE);
        }
        Z.b(list, e70.perfSessions_);
    }

    public static void B(E70 e70, long j) {
        e70.bitField0_ |= 4;
        e70.clientStartTimeUs_ = j;
    }

    public static void C(E70 e70, long j) {
        e70.bitField0_ |= 8;
        e70.durationUs_ = j;
    }

    public static E70 H() {
        return DEFAULT_INSTANCE;
    }

    public static B70 N() {
        return (B70) DEFAULT_INSTANCE.l();
    }

    public static void u(E70 e70, String str) {
        e70.getClass();
        str.getClass();
        e70.bitField0_ |= 1;
        e70.name_ = str;
    }

    public static YI v(E70 e70) {
        YI yi = e70.counters_;
        if (!yi.b) {
            e70.counters_ = yi.d();
        }
        return e70.counters_;
    }

    public static void w(E70 e70, E70 e702) {
        e70.getClass();
        e702.getClass();
        InterfaceC2487qE interfaceC2487qE = e70.subtraces_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            e70.subtraces_ = LA.r(interfaceC2487qE);
        }
        e70.subtraces_.add(e702);
    }

    public static void x(E70 e70, ArrayList arrayList) {
        InterfaceC2487qE interfaceC2487qE = e70.subtraces_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            e70.subtraces_ = LA.r(interfaceC2487qE);
        }
        Z.b(arrayList, e70.subtraces_);
    }

    public static YI y(E70 e70) {
        YI yi = e70.customAttributes_;
        if (!yi.b) {
            e70.customAttributes_ = yi.d();
        }
        return e70.customAttributes_;
    }

    public static void z(E70 e70, C1270eR c1270eR) {
        e70.getClass();
        InterfaceC2487qE interfaceC2487qE = e70.perfSessions_;
        if (!((AbstractC1233e0) interfaceC2487qE).b) {
            e70.perfSessions_ = LA.r(interfaceC2487qE);
        }
        e70.perfSessions_.add(c1270eR);
    }

    public final boolean D() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int E() {
        return this.counters_.size();
    }

    public final Map F() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map G() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long I() {
        return this.durationUs_;
    }

    public final String J() {
        return this.name_;
    }

    public final InterfaceC2487qE K() {
        return this.perfSessions_;
    }

    public final InterfaceC2487qE L() {
        return this.subtraces_;
    }

    public final boolean M() {
        if ((this.bitField0_ & 4) != 0) {
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
                return new HU(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C70.a, "subtraces_", E70.class, "customAttributes_", D70.a, "perfSessions_", C1270eR.class});
            case 3:
                return new E70();
            case 4:
                return new HA(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                OQ oq = PARSER;
                OQ oq2 = oq;
                if (oq == null) {
                    synchronized (E70.class) {
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
