package defpackage;
/* renamed from: M40  reason: default package */
/* loaded from: classes.dex */
public final class M40 implements Comparable {
    public final long b;
    public final byte[] c;

    public M40(long j, byte[] bArr) {
        this.b = j;
        this.c = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((M40) obj).b);
    }
}
