package defpackage;
/* renamed from: OK  reason: default package */
/* loaded from: classes.dex */
public class OK {
    public final long a;

    static {
        new OK(new C0467Mw());
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
        Ha0.H(3);
        Ha0.H(4);
        Ha0.H(5);
        Ha0.H(6);
    }

    public OK(C0467Mw c0467Mw) {
        c0467Mw.getClass();
        int i = Ha0.a;
        this.a = c0467Mw.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OK)) {
            return false;
        }
        OK ok = (OK) obj;
        ok.getClass();
        if (this.a == ok.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
