package defpackage;

import java.util.Date;
import java.util.HashMap;
/* renamed from: vF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2917vF implements InterfaceC0255Er {
    public static final C2659sF e = new C2659sF(0);
    public static final C2745tF f = new Oa0() { // from class: tF
        @Override // defpackage.InterfaceC0229Dr
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((Pa0) obj2).b((String) obj);
                    return;
                default:
                    ((Pa0) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final C2745tF g = new Oa0() { // from class: tF
        @Override // defpackage.InterfaceC0229Dr
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((Pa0) obj2).b((String) obj);
                    return;
                default:
                    ((Pa0) obj2).c(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };
    public static final C2831uF h = new Object();
    public final HashMap a;
    public final HashMap b;
    public final C2659sF c;
    public boolean d;

    public C2917vF() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC0255Er a(Class cls, InterfaceC2154mP interfaceC2154mP) {
        this.a.put(cls, interfaceC2154mP);
        this.b.remove(cls);
        return this;
    }
}
