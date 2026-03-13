package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: k80  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964k80 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public C1964k80(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1964k80) {
            C1964k80 c1964k80 = (C1964k80) obj;
            if (this.b == c1964k80.b && this.a.equals(c1964k80.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder p = BK.p("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        p.append(this.b);
        p.append("\n");
        String f = AbstractC0324Hi.f(p.toString(), "    values:");
        for (String str : this.a.keySet()) {
            f = f + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return f;
    }
}
