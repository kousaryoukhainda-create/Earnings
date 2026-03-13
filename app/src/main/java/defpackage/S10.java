package defpackage;
/* renamed from: S10  reason: default package */
/* loaded from: classes2.dex */
public class S10 extends U10 {
    public static final /* synthetic */ int m = 0;
    public String k;
    public V10[] l;

    /* JADX WARN: Type inference failed for: r0v0, types: [S10, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.k = "java.lang.Object";
        obj.l = null;
    }

    public S10(String str, int i, int i2, V10[] v10Arr) {
        this.k = str.substring(i, i2).replace('/', '.');
        this.l = v10Arr;
    }

    @Override // defpackage.AbstractC2618rm
    public final String B() {
        StringBuilder sb = new StringBuilder();
        S10 a0 = a0();
        if (a0 != null) {
            sb.append(a0.B());
            sb.append('$');
        }
        return b0(sb);
    }

    public S10 a0() {
        return null;
    }

    public final String b0(StringBuilder sb) {
        sb.append(this.k);
        V10[] v10Arr = this.l;
        if (v10Arr != null) {
            sb.append('<');
            int length = v10Arr.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(v10Arr[i].toString());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        S10 a0 = a0();
        if (a0 != null) {
            sb.append(a0.toString());
            sb.append('.');
        }
        return b0(sb);
    }
}
