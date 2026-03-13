package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: C00  reason: default package */
/* loaded from: classes.dex */
public final class C00 extends Handler {
    public boolean a;
    public long b;
    public final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.c = new ArrayList();
    }

    public final void a() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        InterfaceC2549r00 interfaceC2549r00 = (InterfaceC2549r00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).k.get();
        C2292o00 sessionDetails = ((C2893v00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).m.get()).e;
        if (sessionDetails != null) {
            C2807u00 c2807u00 = (C2807u00) interfaceC2549r00;
            c2807u00.getClass();
            Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
            AbstractC1281eb.B(AbstractC1281eb.a(c2807u00.e), new C2635s00(c2807u00, sessionDetails, null));
            Iterator it = new ArrayList(this.c).iterator();
            while (it.hasNext()) {
                Messenger it2 = (Messenger) it.next();
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                b(it2);
            }
            return;
        }
        Intrinsics.f("currentSession");
        throw null;
    }

    public final void b(Messenger messenger) {
        try {
            String str = null;
            if (this.a) {
                C2292o00 c2292o00 = ((C2893v00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).m.get()).e;
                if (c2292o00 != null) {
                    d(messenger, c2292o00.a);
                    return;
                } else {
                    Intrinsics.f("currentSession");
                    throw null;
                }
            }
            C3145xw c3145xw = (C3145xw) ((C1948k00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).j.get()).c.get();
            if (c3145xw != null) {
                str = c3145xw.a;
            }
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e);
        }
    }

    public final void c() {
        String a;
        try {
            C2893v00 c2893v00 = (C2893v00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).m.get();
            int i = c2893v00.d + 1;
            c2893v00.d = i;
            if (i == 0) {
                a = c2893v00.c;
            } else {
                a = c2893v00.a();
            }
            String str = a;
            int i2 = c2893v00.d;
            c2893v00.a.getClass();
            c2893v00.e = new C2292o00(str, c2893v00.c, i2, 1000 * System.currentTimeMillis());
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            C1948k00 c1948k00 = (C1948k00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).j.get();
            C2292o00 c2292o00 = ((C2893v00) ((C0741Xk) ((InterfaceC2973vw) AbstractC1906jZ.x().c(InterfaceC2973vw.class))).m.get()).e;
            if (c2292o00 != null) {
                String sessionId = c2292o00.a;
                c1948k00.getClass();
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                AbstractC1281eb.B(AbstractC1281eb.a(c1948k00.a), new C1862j00(c1948k00, sessionId, null));
                return;
            }
            Intrinsics.f("currentSession");
            throw null;
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e);
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x010d, code lost:
        if (defpackage.C3053wq.b(r8) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
        if (defpackage.C3053wq.b(r8) == false) goto L29;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C00.handleMessage(android.os.Message):void");
    }
}
