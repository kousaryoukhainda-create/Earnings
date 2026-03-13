package defpackage;

import android.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* renamed from: Vh0  reason: default package */
/* loaded from: classes.dex */
public final class Vh0 extends Fragment {
    public static final WeakHashMap c = new WeakHashMap();
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.app.Activity r7, defpackage.C0960bg0 r8) {
        /*
            java.lang.String r0 = "LifecycleCallbackFrg"
            java.lang.String r1 = "com.huawei.hmf.tasks.lifecycle_fragment_tag"
            java.util.WeakHashMap r2 = defpackage.Vh0.c
            java.lang.Object r3 = r2.get(r7)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L1b
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L1b
            java.lang.Object r7 = r3.get()
            Vh0 r7 = (defpackage.Vh0) r7
            goto L78
        L1b:
            android.app.FragmentManager r3 = r7.getFragmentManager()
            r4 = 0
            android.app.Fragment r5 = r3.findFragmentByTag(r1)     // Catch: java.lang.ClassCastException -> L60
            Vh0 r5 = (defpackage.Vh0) r5     // Catch: java.lang.ClassCastException -> L60
            if (r5 != 0) goto L54
            Vh0 r6 = new Vh0     // Catch: java.lang.Exception -> L3c
            r6.<init>()     // Catch: java.lang.Exception -> L3c
            android.app.FragmentTransaction r3 = r3.beginTransaction()     // Catch: java.lang.Exception -> L39
            android.app.FragmentTransaction r1 = r3.add(r6, r1)     // Catch: java.lang.Exception -> L39
            r1.commitAllowingStateLoss()     // Catch: java.lang.Exception -> L39
            goto L53
        L39:
            r1 = move-exception
            r4 = r6
            goto L3d
        L3c:
            r1 = move-exception
        L3d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L5e
            java.lang.String r6 = "create fragment failed."
            r3.<init>(r6)     // Catch: java.lang.ClassCastException -> L5e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.ClassCastException -> L5e
            r3.append(r1)     // Catch: java.lang.ClassCastException -> L5e
            java.lang.String r1 = r3.toString()     // Catch: java.lang.ClassCastException -> L5e
            android.util.Log.e(r0, r1)     // Catch: java.lang.ClassCastException -> L5e
            r6 = r4
        L53:
            r5 = r6
        L54:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.ClassCastException -> L5e
            r1.<init>(r5)     // Catch: java.lang.ClassCastException -> L5e
            r2.put(r7, r1)     // Catch: java.lang.ClassCastException -> L5e
        L5c:
            r7 = r5
            goto L78
        L5e:
            r7 = move-exception
            goto L62
        L60:
            r7 = move-exception
            r5 = r4
        L62:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "found LifecycleCallbackFragment but the type do not match. "
            r1.<init>(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.e(r0, r7)
            goto L5c
        L78:
            if (r7 == 0) goto L8c
            java.util.ArrayList r0 = r7.b
            monitor-enter(r0)
            java.util.ArrayList r7 = r7.b     // Catch: java.lang.Throwable -> L89
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L89
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L89
            r7.add(r1)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r7
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Vh0.a(android.app.Activity, bg0):void");
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    C0960bg0 c0960bg0 = (C0960bg0) ((WeakReference) it.next()).get();
                    if (c0960bg0 != null) {
                        c0960bg0.a();
                    }
                }
                this.b.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
