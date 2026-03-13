package defpackage;

import java.util.Arrays;
/* renamed from: A8  reason: default package */
/* loaded from: classes.dex */
public final class A8 extends AbstractC1311et {
    public final byte[] a;
    public final byte[] b;

    public A8(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1311et)) {
            return false;
        }
        AbstractC1311et abstractC1311et = (AbstractC1311et) obj;
        boolean z = abstractC1311et instanceof A8;
        if (z) {
            bArr = ((A8) abstractC1311et).a;
        } else {
            bArr = ((A8) abstractC1311et).a;
        }
        if (Arrays.equals(this.a, bArr)) {
            if (z) {
                bArr2 = ((A8) abstractC1311et).b;
            } else {
                bArr2 = ((A8) abstractC1311et).b;
            }
            if (Arrays.equals(this.b, bArr2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
