package defpackage;

import java.util.Arrays;
/* renamed from: S7  reason: default package */
/* loaded from: classes.dex */
public final class S7 extends AbstractC2698sj {
    public final String a;
    public final byte[] b;

    public S7(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        S7 s7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2698sj)) {
            return false;
        }
        AbstractC2698sj abstractC2698sj = (AbstractC2698sj) obj;
        if (this.a.equals(((S7) abstractC2698sj).a)) {
            if (abstractC2698sj instanceof S7) {
                s7 = (S7) abstractC2698sj;
            } else {
                s7 = (S7) abstractC2698sj;
            }
            if (Arrays.equals(this.b, s7.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
