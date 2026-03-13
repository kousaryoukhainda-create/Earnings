package kotlin.text;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public class CharsKt__CharJVMKt {
    public static final boolean a(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "radix ", " was not in valid range ");
        i2.append(new C1885jE(2, 36, 1));
        throw new IllegalArgumentException(i2.toString());
    }
}
