package com.applovin.impl;
/* loaded from: classes.dex */
public class x0 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;

    public x0(String str) {
        this(str, -1);
    }

    public boolean a(Object obj) {
        return obj instanceof x0;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (!x0Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = x0Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        String c = c();
        String c2 = x0Var.c();
        if (c != null ? !c.equals(c2) : c2 != null) {
            return false;
        }
        String e = e();
        String e2 = x0Var.e();
        if (e != null ? !e.equals(e2) : e2 != null) {
            return false;
        }
        String a = a();
        String a2 = x0Var.a();
        if (a != null ? a.equals(a2) : a2 == null) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.a.equals("applovin.com");
    }

    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String b = b();
        int i = 43;
        if (b == null) {
            hashCode = 43;
        } else {
            hashCode = b.hashCode();
        }
        String c = c();
        int i2 = (hashCode + 59) * 59;
        if (c == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = c.hashCode();
        }
        int i3 = i2 + hashCode2;
        String e = e();
        int i4 = i3 * 59;
        if (e == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = e.hashCode();
        }
        int i5 = i4 + hashCode3;
        String a = a();
        int i6 = i5 * 59;
        if (a != null) {
            i = a.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public x0(String str, int i) {
        this.e = str;
        this.f = i;
        String[] split = str.split(",");
        boolean z = split.length == 3 || split.length == 4;
        this.g = z;
        if (z) {
            this.a = a(split[0]);
            this.b = a(split[1]);
            this.c = a(split[2]);
            this.d = split.length == 4 ? a(split[3]) : "";
            return;
        }
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public String a() {
        return this.d;
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }
}
