package defpackage;
/* renamed from: a8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826a8 extends AbstractC0403Kj {
    public final long a;
    public final String b;
    public final C0917b8 c;
    public final C2135m8 d;
    public final C2221n8 e;
    public final C2564r8 f;

    public C0826a8(long j, String str, C0917b8 c0917b8, C2135m8 c2135m8, C2221n8 c2221n8, C2564r8 c2564r8) {
        this.a = j;
        this.b = str;
        this.c = c0917b8;
        this.d = c2135m8;
        this.e = c2221n8;
        this.f = c2564r8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z7] */
    public final Z7 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0403Kj)) {
            return false;
        }
        C0826a8 c0826a8 = (C0826a8) ((AbstractC0403Kj) obj);
        if (this.a == c0826a8.a) {
            if (this.b.equals(c0826a8.b) && this.c.equals(c0826a8.c) && this.d.equals(c0826a8.d)) {
                C2221n8 c2221n8 = c0826a8.e;
                C2221n8 c2221n82 = this.e;
                if (c2221n82 != null ? c2221n82.equals(c2221n8) : c2221n8 == null) {
                    C2564r8 c2564r8 = c0826a8.f;
                    C2564r8 c2564r82 = this.f;
                    if (c2564r82 == null) {
                        if (c2564r8 == null) {
                            return true;
                        }
                    } else if (c2564r82.equals(c2564r8)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        C2221n8 c2221n8 = this.e;
        if (c2221n8 == null) {
            hashCode = 0;
        } else {
            hashCode = c2221n8.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        C2564r8 c2564r8 = this.f;
        if (c2564r8 != null) {
            i = c2564r8.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
