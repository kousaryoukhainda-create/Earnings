package j$.time.format;
/* loaded from: classes4.dex */
final class l implements InterfaceC1677f {
    private final InterfaceC1677f a;
    private final int b;
    private final char c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(InterfaceC1677f interfaceC1677f, int i, char c) {
        this.a = interfaceC1677f;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC1677f
    public final boolean l(z zVar, StringBuilder sb) {
        int length = sb.length();
        if (this.a.l(zVar, sb)) {
            int length2 = sb.length() - length;
            int i = this.b;
            if (length2 <= i) {
                for (int i2 = 0; i2 < i - length2; i2++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new RuntimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
        }
        return false;
    }

    @Override // j$.time.format.InterfaceC1677f
    public final int n(w wVar, CharSequence charSequence, int i) {
        boolean l = wVar.l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int i2 = this.b + i;
        if (i2 > charSequence.length()) {
            if (l) {
                return ~i;
            }
            i2 = charSequence.length();
        }
        int i3 = i;
        while (i3 < i2 && wVar.b(charSequence.charAt(i3), this.c)) {
            i3++;
        }
        int n = this.a.n(wVar, charSequence.subSequence(0, i2), i3);
        return (n == i2 || !l) ? n : ~(i + i3);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
