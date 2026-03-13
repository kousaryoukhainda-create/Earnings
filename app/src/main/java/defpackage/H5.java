package defpackage;
/* renamed from: H5  reason: default package */
/* loaded from: classes.dex */
public abstract class H5 {
    public final /* synthetic */ int b = 1;
    public int c;

    public /* synthetic */ H5() {
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public void b(int i) {
        this.c = i | this.c;
    }

    public boolean d(int i) {
        if ((this.c & i) == i) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return c(this.c);
            default:
                return super.toString();
        }
    }

    public H5(int i) {
        this.c = i;
    }
}
