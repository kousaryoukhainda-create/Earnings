package defpackage;

import java.util.ArrayList;
/* renamed from: cu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1141cu {
    public L5 a;
    public int c;
    public String d;
    public int e;
    public int b = 0;
    public ArrayList f = null;

    public C1141cu(L5 l5) {
        this.a = l5;
    }

    public final String a() {
        return this.a.p(this.e);
    }

    public final String b() {
        if (this.d == null) {
            this.d = this.a.p(this.c);
        }
        return this.d;
    }

    public final String toString() {
        return b() + " " + a();
    }
}
