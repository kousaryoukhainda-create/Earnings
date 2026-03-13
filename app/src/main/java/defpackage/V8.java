package defpackage;

import java.util.HashMap;
/* renamed from: V8  reason: default package */
/* loaded from: classes.dex */
public final class V8 {
    public final InterfaceC1459ge a;
    public final HashMap b;

    public V8(InterfaceC1459ge interfaceC1459ge, HashMap hashMap) {
        this.a = interfaceC1459ge;
        this.b = hashMap;
    }

    public final long a(EnumC0849aT enumC0849aT, long j, int i) {
        long j2;
        long g = j - this.a.g();
        W8 w8 = (W8) this.b.get(enumC0849aT);
        long j3 = w8.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), g), w8.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V8)) {
            return false;
        }
        V8 v8 = (V8) obj;
        if (this.a.equals(v8.a) && this.b.equals(v8.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
