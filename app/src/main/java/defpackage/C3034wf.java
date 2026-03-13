package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: wf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3034wf {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final InterfaceC0450Mf f;
    public final Set g;

    public C3034wf(String str, Set set, Set set2, int i, int i2, InterfaceC0450Mf interfaceC0450Mf, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC0450Mf;
        this.g = Collections.unmodifiableSet(set3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vf, java.lang.Object] */
    public static C2948vf a(C1531hU c1531hU) {
        C1531hU[] c1531hUArr = new C1531hU[0];
        ?? obj = new Object();
        obj.a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.e = new HashSet();
        obj.b = 0;
        obj.c = 0;
        obj.f = new HashSet();
        hashSet.add(c1531hU);
        for (C1531hU c1531hU2 : c1531hUArr) {
            AbstractC1424g90.q(c1531hU2, "Null interface");
        }
        Collections.addAll((HashSet) obj.d, c1531hUArr);
        return obj;
    }

    public static C2948vf b(Class cls) {
        return new C2948vf(cls, new Class[0]);
    }

    public static C3034wf c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1531hU.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC1424g90.q(cls2, "Null interface");
            hashSet.add(C1531hU.a(cls2));
        }
        return new C3034wf(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C2862uf(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
