package defpackage;

import java.util.HashMap;
/* renamed from: P1  reason: default package */
/* loaded from: classes.dex */
public final class P1 extends N1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ L1 c;
    public final /* synthetic */ S1 d;

    public /* synthetic */ P1(S1 s1, String str, L1 l1, int i) {
        this.a = i;
        this.d = s1;
        this.b = str;
        this.c = l1;
    }

    @Override // defpackage.N1
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                S1 s1 = this.d;
                HashMap hashMap = s1.b;
                String str = this.b;
                Integer num = (Integer) hashMap.get(str);
                L1 l1 = this.c;
                if (num != null) {
                    s1.d.add(str);
                    try {
                        s1.b(num.intValue(), l1, obj);
                        return;
                    } catch (Exception e) {
                        s1.d.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + l1 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                S1 s12 = this.d;
                HashMap hashMap2 = s12.b;
                String str2 = this.b;
                Integer num2 = (Integer) hashMap2.get(str2);
                L1 l12 = this.c;
                if (num2 != null) {
                    s12.d.add(str2);
                    try {
                        s12.b(num2.intValue(), l12, obj);
                        return;
                    } catch (Exception e2) {
                        s12.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + l12 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.d.f(this.b);
    }
}
