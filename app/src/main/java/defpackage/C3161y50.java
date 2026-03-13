package defpackage;

import android.os.Handler;
import java.util.ArrayList;
/* renamed from: y50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3161y50 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public C3161y50(Handler handler) {
        this.a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C3075x50 b() {
        C3075x50 c3075x50;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    c3075x50 = new Object();
                } else {
                    c3075x50 = (C3075x50) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3075x50;
    }

    public final C3075x50 a(int i, Object obj) {
        C3075x50 b2 = b();
        b2.a = this.a.obtainMessage(i, obj);
        return b2;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void d(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        this.a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
