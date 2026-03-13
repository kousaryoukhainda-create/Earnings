package com.applovin.impl;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class w0 {
    private final Map a;
    private final List b;

    public w0(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    public boolean a(Object obj) {
        return obj instanceof w0;
    }

    public List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!w0Var.a(this)) {
            return false;
        }
        Map a = a();
        Map a2 = w0Var.a();
        if (a != null ? !a.equals(a2) : a2 != null) {
            return false;
        }
        List b = b();
        List b2 = w0Var.b();
        if (b != null ? b.equals(b2) : b2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Map a = a();
        int i = 43;
        if (a == null) {
            hashCode = 43;
        } else {
            hashCode = a.hashCode();
        }
        List b = b();
        int i2 = (hashCode + 59) * 59;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.a;
    }
}
