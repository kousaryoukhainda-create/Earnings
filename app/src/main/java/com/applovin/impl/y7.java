package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public interface y7 {

    /* loaded from: classes.dex */
    public static final class a {
        private final byte[] a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(y7 y7Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        y7 a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final byte[] a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    a a(byte[] bArr, List list, int i, HashMap hashMap);

    void a();

    void a(b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, String str);

    d b();

    Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    y4 d(byte[] bArr);

    byte[] d();
}
