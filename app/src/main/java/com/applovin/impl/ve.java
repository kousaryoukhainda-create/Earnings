package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ve {
    private static final Set b = new HashSet();
    public static final ve c = a("ar");
    public static final ve d = a("ttdasi_ms");
    private String a;

    /* loaded from: classes.dex */
    public interface a {
        Object a(Object obj);
    }

    private ve(String str) {
        this.a = str;
    }

    public boolean a(Object obj) {
        return obj instanceof ve;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (!veVar.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = veVar.a();
        if (a2 != null ? a2.equals(a3) : a3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String a2 = a();
        if (a2 == null) {
            hashCode = 43;
        } else {
            hashCode = a2.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return this.a;
    }

    public String a() {
        return this.a;
    }

    private static ve a(String str) {
        Set set = b;
        if (!set.contains(str)) {
            set.add(str);
            return new ve(str);
        }
        throw new IllegalArgumentException(AbstractC2437ph.g("Key has already been used: ", str));
    }
}
