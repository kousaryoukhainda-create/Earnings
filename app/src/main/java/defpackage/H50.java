package defpackage;
/* renamed from: H50  reason: default package */
/* loaded from: classes.dex */
public final class H50 implements Comparable {
    public final int b;
    public final int c;
    public final String d;
    public final String f;

    public H50(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.f = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        H50 h50 = (H50) obj;
        int i = this.b - h50.b;
        if (i == 0) {
            return this.c - h50.c;
        }
        return i;
    }
}
