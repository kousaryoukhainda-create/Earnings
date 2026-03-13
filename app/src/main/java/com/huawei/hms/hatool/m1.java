package com.huawei.hms.hatool;
/* loaded from: classes2.dex */
public class m1 {
    private static m1 b = new m1();
    private a a = new a();

    /* loaded from: classes2.dex */
    public class a {
        String a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.a.c = j;
        }

        public void b(String str) {
            m1.this.a.a = str;
        }

        public void a(String str) {
            m1.this.a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public long b() {
        return this.a.c;
    }

    public String c() {
        return this.a.a;
    }

    public String a() {
        return this.a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String c = w0.c(str, str2);
        if (c == null || c.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b2 == 0) {
            b2 = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - b2 <= 43200000) {
            return;
        }
        String c2 = AbstractC0333Hr.c(16);
        String a2 = h0.a(c, c2);
        this.a.a(b2);
        this.a.b(c2);
        this.a.a(a2);
    }
}
