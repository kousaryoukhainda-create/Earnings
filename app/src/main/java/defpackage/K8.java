package defpackage;

import java.util.ArrayList;
/* renamed from: K8  reason: default package */
/* loaded from: classes.dex */
public final class K8 extends AbstractC3264zI {
    public final long a;
    public final long b;
    public final H7 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public K8(long j, long j2, H7 h7, Integer num, String str, ArrayList arrayList) {
        EnumC1359fU enumC1359fU = EnumC1359fU.b;
        this.a = j;
        this.b = j2;
        this.c = h7;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3264zI)) {
            return false;
        }
        K8 k8 = (K8) ((AbstractC3264zI) obj);
        if (this.a == k8.a) {
            if (this.b == k8.b) {
                if (this.c.equals(k8.c)) {
                    Integer num = k8.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = k8.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f.equals(k8.f)) {
                                Object obj2 = EnumC1359fU.b;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return EnumC1359fU.b.hashCode() ^ ((((i2 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + EnumC1359fU.b + "}";
    }
}
