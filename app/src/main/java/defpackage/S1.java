package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: S1  reason: default package */
/* loaded from: classes.dex */
public abstract class S1 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        J1 j1;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        Q1 q1 = (Q1) this.e.get(str);
        if (q1 != null && (j1 = q1.a) != null && this.d.contains(str)) {
            j1.f(q1.b.c(i2, intent));
            this.d.remove(str);
            return true;
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void b(int i, L1 l1, Object obj);

    public final P1 c(String str, L1 l1, J1 j1) {
        e(str);
        this.e.put(str, new Q1(l1, j1));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            j1.f(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            j1.f(l1.c(activityResult.b, activityResult.c));
        }
        return new P1(this, str, l1, 1);
    }

    public final P1 d(String str, HG hg, L1 l1, J1 j1) {
        CG lifecycle = hg.getLifecycle();
        JG jg = (JG) lifecycle;
        if (!jg.c.a(BG.f)) {
            e(str);
            HashMap hashMap = this.c;
            R1 r1 = (R1) hashMap.get(str);
            if (r1 == null) {
                r1 = new R1(lifecycle);
            }
            O1 o1 = new O1(this, str, j1, l1);
            r1.a.a(o1);
            r1.b.add(o1);
            hashMap.put(str, r1);
            return new P1(this, str, l1, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + hg + " is attempting to register while current state is " + jg.c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final void e(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        AU.b.getClass();
        int nextInt = AU.c.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(Integer.valueOf(i))) {
                AU.b.getClass();
                nextInt = AU.c.a().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            StringBuilder m = AbstractC0324Hi.m("Dropping pending result for request ", str, ": ");
            m.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", m.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder m2 = AbstractC0324Hi.m("Dropping pending result for request ", str, ": ");
            m2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", m2.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        R1 r1 = (R1) hashMap2.get(str);
        if (r1 != null) {
            ArrayList arrayList = r1.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r1.a.b((FG) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
