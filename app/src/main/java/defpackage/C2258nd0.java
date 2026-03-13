package defpackage;
/* renamed from: nd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2258nd0 implements Comparable {
    public final int b;
    public final C1914jd0 c;

    public C2258nd0(int i, C1914jd0 c1914jd0) {
        this.b = i;
        this.c = c1914jd0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((C2258nd0) obj).b);
    }
}
