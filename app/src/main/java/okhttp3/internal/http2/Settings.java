package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes2.dex */
public final class Settings {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
    }
}
