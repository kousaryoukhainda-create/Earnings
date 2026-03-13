package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: fl0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1388fl0 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1388fl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                C3121xf0 c3121xf0 = (C3121xf0) this.b;
                c3121xf0.b.b("reportBinderDeath", new Object[0]);
                if (c3121xf0.j.get() == null) {
                    c3121xf0.b.b("%s : Binder has died.", c3121xf0.c);
                    Iterator it = c3121xf0.d.iterator();
                    while (it.hasNext()) {
                        ((Zk0) it.next()).a(new RemoteException(String.valueOf(c3121xf0.c).concat(" : Binder has died.")));
                    }
                    c3121xf0.d.clear();
                    synchronized (c3121xf0.f) {
                        c3121xf0.e();
                    }
                    return;
                }
                throw new ClassCastException();
            default:
                tn0 tn0Var = (tn0) this.b;
                tn0Var.b.i("reportBinderDeath", new Object[0]);
                if (tn0Var.i.get() == null) {
                    String str = tn0Var.c;
                    tn0Var.b.i("%s : Binder has died.", str);
                    ArrayList arrayList = tn0Var.d;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                        TaskCompletionSource taskCompletionSource = ((Ym0) it2.next()).b;
                        if (taskCompletionSource != null) {
                            taskCompletionSource.trySetException(remoteException);
                        }
                    }
                    arrayList.clear();
                    tn0Var.b();
                    return;
                }
                throw new ClassCastException();
        }
    }
}
