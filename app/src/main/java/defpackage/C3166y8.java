package defpackage;

import java.util.Arrays;
import java.util.HashMap;
/* renamed from: y8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3166y8 {
    public final String a;
    public final Integer b;
    public final C0203Cr c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public C3166y8(String str, Integer num, C0203Cr c0203Cr, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = c0203Cr;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x8, java.lang.Object] */
    public final C3080x8 c() {
        ?? obj = new Object();
        String str = this.a;
        if (str != null) {
            obj.a = str;
            obj.c = this.b;
            obj.d = this.g;
            obj.b = this.h;
            obj.i = this.i;
            obj.j = this.j;
            C0203Cr c0203Cr = this.c;
            if (c0203Cr != null) {
                obj.e = c0203Cr;
                obj.f = Long.valueOf(this.d);
                obj.g = Long.valueOf(this.e);
                obj.h = new HashMap(this.f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3166y8)) {
            return false;
        }
        C3166y8 c3166y8 = (C3166y8) obj;
        if (this.a.equals(c3166y8.a)) {
            Integer num = c3166y8.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(c3166y8.c) && this.d == c3166y8.d && this.e == c3166y8.e && this.f.equals(c3166y8.f)) {
                    Integer num3 = c3166y8.g;
                    Integer num4 = this.g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c3166y8.h;
                        String str2 = this.h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.i, c3166y8.i) && Arrays.equals(this.j, c3166y8.j)) {
                                return true;
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
        int hashCode3 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
