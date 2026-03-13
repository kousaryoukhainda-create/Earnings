package defpackage;
/* renamed from: F7  reason: default package */
/* loaded from: classes.dex */
public final class F7 {
    public final int a;
    public final long b;

    public F7(int i, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F7)) {
            return false;
        }
        F7 f7 = (F7) obj;
        if (AbstractC0324Hi.a(this.a, f7.a) && this.b == f7.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((AbstractC0324Hi.A(this.a) ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return BK.n(sb, this.b, "}");
    }
}
