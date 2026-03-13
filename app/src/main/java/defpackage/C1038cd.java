package defpackage;
/* renamed from: cd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038cd extends AbstractC0953bd {
    public final char b;

    public C1038cd(char c) {
        this.b = c;
    }

    @Override // defpackage.AbstractC0953bd
    public final boolean a(char c) {
        if (c == this.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.b;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
