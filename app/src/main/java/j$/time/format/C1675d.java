package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.d  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1675d implements InterfaceC1677f {
    private final char a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1675d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC1677f
    public final boolean l(z zVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.InterfaceC1677f
    public final int n(w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (!wVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
