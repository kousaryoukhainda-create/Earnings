package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
/* renamed from: MI  reason: default package */
/* loaded from: classes.dex */
public abstract class MI {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        a = bArr;
    }
}
