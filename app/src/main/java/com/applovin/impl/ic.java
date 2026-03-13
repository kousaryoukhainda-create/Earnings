package com.applovin.impl;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ic implements Comparable {
    private final String a;
    private final String b;
    private final boolean c;
    private final je d;

    public ic(String str, String str2, boolean z, je jeVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = jeVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ic icVar) {
        return this.b.compareToIgnoreCase(icVar.b);
    }

    public List b() {
        List l = this.d.l();
        if (l != null && !l.isEmpty()) {
            return l;
        }
        return Collections.singletonList(this.a);
    }

    public String c() {
        return this.a;
    }

    public je d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ic icVar = (ic) obj;
        String str = this.a;
        if (str == null ? icVar.a != null : !str.equals(icVar.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? icVar.b != null : !str2.equals(icVar.b)) {
            return false;
        }
        if (this.c == icVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + (this.c ? 1 : 0);
    }

    public String a() {
        return this.b;
    }
}
