package defpackage;
/* renamed from: V10  reason: default package */
/* loaded from: classes2.dex */
public final class V10 {
    public final U10 a;
    public final char b;

    public V10(U10 u10, char c) {
        this.a = u10;
        this.b = c;
    }

    public final String toString() {
        char c = this.b;
        if (c == '*') {
            return "?";
        }
        String obj = this.a.toString();
        if (c == ' ') {
            return obj;
        }
        if (c == '+') {
            return AbstractC2437ph.g("? extends ", obj);
        }
        return AbstractC2437ph.g("? super ", obj);
    }
}
