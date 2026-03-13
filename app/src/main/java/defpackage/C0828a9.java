package defpackage;
/* renamed from: a9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828a9 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public C0828a9(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str != null) {
            this.b = str;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = z;
            this.g = i3;
            if (str2 != null) {
                this.h = str2;
                if (str3 != null) {
                    this.i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0828a9)) {
            return false;
        }
        C0828a9 c0828a9 = (C0828a9) obj;
        if (this.a == c0828a9.a && this.b.equals(c0828a9.b) && this.c == c0828a9.c && this.d == c0828a9.d && this.e == c0828a9.e && this.f == c0828a9.f && this.g == c0828a9.g && this.h.equals(c0828a9.h) && this.i.equals(c0828a9.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.d;
        long j2 = this.e;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return AbstractC0324Hi.h(sb, this.i, "}");
    }
}
