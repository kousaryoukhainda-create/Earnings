package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class oo implements o2 {
    public static final o2.a d = new Jh0(22);
    public final int a;
    private final e9[] b;
    private int c;

    public oo(e9... e9VarArr) {
        boolean z;
        if (e9VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.b = e9VarArr;
        this.a = e9VarArr.length;
        a();
    }

    public static /* synthetic */ oo b(Bundle bundle) {
        return a(bundle);
    }

    private static int c(int i) {
        return i | 16384;
    }

    public e9 a(int i) {
        return this.b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo.class != obj.getClass()) {
            return false;
        }
        oo ooVar = (oo) obj;
        if (this.a == ooVar.a && Arrays.equals(this.b, ooVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    public int a(e9 e9Var) {
        int i = 0;
        while (true) {
            e9[] e9VarArr = this.b;
            if (i >= e9VarArr.length) {
                return -1;
            }
            if (e9Var == e9VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private void a() {
        String a = a(this.b[0].c);
        int c = c(this.b[0].f);
        int i = 1;
        while (true) {
            e9[] e9VarArr = this.b;
            if (i >= e9VarArr.length) {
                return;
            }
            if (!a.equals(a(e9VarArr[i].c))) {
                e9[] e9VarArr2 = this.b;
                a("languages", e9VarArr2[0].c, e9VarArr2[i].c, i);
                return;
            } else if (c != c(this.b[i].f)) {
                a("role flags", Integer.toBinaryString(this.b[0].f), Integer.toBinaryString(this.b[i].f), i);
                return;
            } else {
                i++;
            }
        }
    }

    public static /* synthetic */ oo a(Bundle bundle) {
        return new oo((e9[]) p2.a(e9.I, bundle.getParcelableArrayList(b(0)), db.h()).toArray(new e9[0]));
    }

    private static void a(String str, String str2, String str3, int i) {
        StringBuilder q = BK.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        q.append(str3);
        q.append("' (track ");
        q.append(i);
        q.append(")");
        oc.a("TrackGroup", "", new IllegalStateException(q.toString()));
    }
}
