package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* renamed from: Go  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304Go {
    public final String a;
    public final VA b;

    public C0304Go(Set set, VA va) {
        this.a = b(set);
        this.b = va;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H8 h8 = (H8) it.next();
            sb.append(h8.a);
            sb.append('/');
            sb.append(h8.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        VA va = this.b;
        synchronized (((HashSet) va.c)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) va.c);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(va.H());
    }
}
