package com.fyber.fairbid;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public final class y5 {
    public static final y5 d = new y5();
    public final String a;
    public String b;
    public final String c;

    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;
        public String c;

        public a(@NonNull String str) {
            String str2;
            if (str != null) {
                str2 = str.trim();
            } else {
                str2 = null;
            }
            this.a = str2;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }
    }

    public y5() {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        String str3 = "N/A";
        if (!Wh0.O(this.b)) {
            str = "N/A";
        } else {
            str = this.b;
        }
        if (Wh0.O(this.c)) {
            str3 = this.c;
        }
        StringBuilder q = BK.q("AppId - ", str2, "\nUserId - ", str, "\nSecurityToken - ");
        q.append(str3);
        return q.toString();
    }

    public y5(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }
}
