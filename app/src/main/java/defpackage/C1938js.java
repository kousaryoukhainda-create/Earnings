package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: js  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1938js implements Cloneable {
    public L5 b;
    public ArrayList c = new ArrayList();

    public C1938js(L5 l5) {
        this.b = l5;
    }

    public final void a(int i, C1938js c1938js, int i2) {
        int size = c1938js.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C2024ks c2024ks = (C2024ks) c1938js.c.get(size);
                int i3 = c2024ks.a + i2;
                int i4 = c2024ks.b + i2;
                int i5 = c2024ks.c + i2;
                if (i3 < i4) {
                    this.c.add(i, new C2024ks(i3, i4, i5, c2024ks.d));
                }
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            C2024ks c2024ks = (C2024ks) it.next();
            int i3 = c2024ks.a;
            if (i3 > i || (z && i3 == i)) {
                i3 += i2;
            }
            c2024ks.a = i3;
            int i4 = c2024ks.b;
            if (i4 > i || (z && i4 == i)) {
                i4 += i2;
            }
            c2024ks.b = i4;
            int i5 = c2024ks.c;
            if (i5 > i || (z && i5 == i)) {
                i5 += i2;
            }
            c2024ks.c = i5;
        }
    }

    public final Object clone() {
        C1938js c1938js = (C1938js) super.clone();
        c1938js.c = new ArrayList(this.c);
        return c1938js;
    }
}
