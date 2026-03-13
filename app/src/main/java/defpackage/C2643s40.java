package defpackage;
/* renamed from: s40  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2643s40 implements CharSequence {
    public char[] b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.b, i, i2 - i);
    }
}
