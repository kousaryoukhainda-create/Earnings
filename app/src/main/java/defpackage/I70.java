package defpackage;

import androidx.media3.common.b;
import java.util.Arrays;
/* renamed from: I70  reason: default package */
/* loaded from: classes.dex */
public final class I70 {
    public final int a;
    public final String b;
    public final int c;
    public final b[] d;
    public int e;

    static {
        Ha0.H(0);
        Ha0.H(1);
    }

    public I70(String str, b... bVarArr) {
        boolean z;
        if (bVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        this.b = str;
        this.d = bVarArr;
        this.a = bVarArr.length;
        int g = UM.g(bVarArr[0].m);
        this.c = g == -1 ? UM.g(bVarArr[0].l) : g;
        String str2 = bVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i = bVarArr[0].f | 16384;
        for (int i2 = 1; i2 < bVarArr.length; i2++) {
            String str3 = bVarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                c(i2, "languages", bVarArr[0].d, bVarArr[i2].d);
                return;
            } else if (i != (bVarArr[i2].f | 16384)) {
                c(i2, "role flags", Integer.toBinaryString(bVarArr[0].f), Integer.toBinaryString(bVarArr[i2].f));
                return;
            }
        }
    }

    public static void c(int i, String str, String str2, String str3) {
        StringBuilder q = BK.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        q.append(str3);
        q.append("' (track ");
        q.append(i);
        q.append(")");
        Wh0.z("TrackGroup", "", new IllegalStateException(q.toString()));
    }

    public final b a() {
        return this.d[0];
    }

    public final int b(b bVar) {
        int i = 0;
        while (true) {
            b[] bVarArr = this.d;
            if (i < bVarArr.length) {
                if (bVar == bVarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I70.class != obj.getClass()) {
            return false;
        }
        I70 i70 = (I70) obj;
        if (this.b.equals(i70.b) && Arrays.equals(this.d, i70.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + AbstractC2437ph.b(527, 31, this.b);
        }
        return this.e;
    }
}
