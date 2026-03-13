package com.fyber.fairbid;

import androidx.annotation.NonNull;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class s5 {
    public String a;
    public String b;
    public int[] c;
    public HashMap d;
    public String e;
    public wi f;

    public s5() {
    }

    public final s5 a(String str, Object obj) {
        if (Wh0.O(str)) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, obj);
        }
        return this;
    }

    public final s5 b(String str) {
        this.e = str;
        return this;
    }

    public final String c() {
        return this.e;
    }

    public s5(s5 s5Var) {
        this.a = s5Var.a;
        this.b = s5Var.b;
        this.c = s5Var.c;
        if (lc.a(s5Var.d)) {
            this.d = new HashMap(s5Var.d);
        }
    }

    public final wi b() {
        if (this.f == null) {
            a();
        }
        return this.f;
    }

    public final void a() {
        String str = this.b;
        C1967kA c1967kA = C1967kA.b;
        c1967kA.getClass();
        this.f = new wi(new el(Wh0.P(null) ? (String) c1967kA.a.get(str) : null, com.fyber.d.a().d));
        if (com.fyber.d.a().d != y5.d) {
            vi viVar = com.fyber.d.a().f;
            wi wiVar = this.f;
            viVar.getClass();
            int[] iArr = this.c;
            if (iArr != null) {
                for (int i : iArr) {
                    viVar.a.get(i).a(this, wiVar);
                }
            }
        }
        wi wiVar2 = this.f;
        wiVar2.a = wiVar2.c.a();
    }

    public final <T> T a(@NonNull String str) {
        HashMap hashMap = this.d;
        if (hashMap != null && hashMap.get(str) != null) {
            return (T) this.d.get(str);
        }
        com.fyber.e a = com.fyber.d.a();
        a.getClass();
        boolean equals = str.equals("CLOSE_ON_REDIRECT");
        com.fyber.c cVar = a.a;
        if (equals) {
            cVar.getClass();
            return (T) Boolean.FALSE;
        } else if (str.equals("NOTIFY_USER_ON_REWARD")) {
            cVar.getClass();
            return (T) Boolean.TRUE;
        } else {
            return null;
        }
    }
}
