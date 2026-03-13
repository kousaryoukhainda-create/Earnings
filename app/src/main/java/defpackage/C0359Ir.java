package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ir  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359Ir {
    public final byte[] a;
    public final String b;
    public final byte[] c;

    public C0359Ir(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.a = encryptedTopic;
        this.b = keyIdentifier;
        this.c = encapsulatedKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0359Ir)) {
            return false;
        }
        C0359Ir c0359Ir = (C0359Ir) obj;
        if (Arrays.equals(this.a, c0359Ir.a) && this.b.contentEquals(c0359Ir.b) && Arrays.equals(this.c, c0359Ir.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncryptedTopic=");
        byte[] bArr = this.a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Charset charset = AbstractC1543hd.a;
        sb.append(new String(bArr, charset));
        sb.append(", KeyIdentifier=");
        sb.append(this.b);
        sb.append(", EncapsulatedKey=");
        byte[] bArr2 = this.c;
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        sb.append(new String(bArr2, charset));
        sb.append(" }");
        return AbstractC2437ph.g("EncryptedTopic { ", sb.toString());
    }
}
