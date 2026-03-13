package defpackage;

import java.util.Arrays;
/* renamed from: J8  reason: default package */
/* loaded from: classes.dex */
public final class J8 extends AbstractC3006wI {
    public final long a;
    public final Integer b;
    public final I7 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final M8 h;
    public final A8 i;

    public J8(long j, Integer num, I7 i7, long j2, byte[] bArr, String str, long j3, M8 m8, A8 a8) {
        this.a = j;
        this.b = num;
        this.c = i7;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = m8;
        this.i = a8;
    }

    public final boolean equals(Object obj) {
        Integer num;
        I7 i7;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3006wI)) {
            return false;
        }
        AbstractC3006wI abstractC3006wI = (AbstractC3006wI) obj;
        J8 j8 = (J8) abstractC3006wI;
        if (this.a == j8.a && ((num = this.b) != null ? num.equals(j8.b) : j8.b == null) && ((i7 = this.c) != null ? i7.equals(j8.c) : j8.c == null)) {
            if (this.d == j8.d) {
                if (abstractC3006wI instanceof J8) {
                    bArr = ((J8) abstractC3006wI).e;
                } else {
                    bArr = j8.e;
                }
                if (Arrays.equals(this.e, bArr)) {
                    String str = j8.f;
                    String str2 = this.f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.g == j8.g) {
                            M8 m8 = j8.h;
                            M8 m82 = this.h;
                            if (m82 != null ? m82.equals(m8) : m8 == null) {
                                A8 a8 = j8.i;
                                A8 a82 = this.i;
                                if (a82 == null) {
                                    if (a8 == null) {
                                        return true;
                                    }
                                } else if (a82.equals(a8)) {
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        I7 i7 = this.c;
        if (i7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = i7.hashCode();
        }
        long j2 = this.d;
        int hashCode5 = (((((i3 ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j3 = this.g;
        int i4 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        M8 m8 = this.h;
        if (m8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = m8.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        A8 a8 = this.i;
        if (a8 != null) {
            i2 = a8.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
