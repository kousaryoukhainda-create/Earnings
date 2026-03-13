package defpackage;
/* renamed from: b9  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0919b9 {
    public final String a;
    public final String b;
    public final boolean c;

    public C0919b9(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0919b9)) {
            return false;
        }
        C0919b9 c0919b9 = (C0919b9) obj;
        if (this.a.equals(c0919b9.a) && this.b.equals(c0919b9.b) && this.c == c0919b9.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
