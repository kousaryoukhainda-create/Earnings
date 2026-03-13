package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class u7 {
    private final String b;
    private final Map c;
    private final String a = UUID.randomUUID().toString();
    private final long d = System.currentTimeMillis();

    public u7(String str, Map map) {
        this.b = str;
        this.c = map;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public Map d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.d != u7Var.d || !Objects.equals(this.b, u7Var.b) || !Objects.equals(this.c, u7Var.c)) {
            return false;
        }
        return Objects.equals(this.a, u7Var.a);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.c;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.d;
        int i5 = (((i4 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.a;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }
}
