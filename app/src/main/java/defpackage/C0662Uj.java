package defpackage;

import com.applovin.impl.fi;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* renamed from: Uj  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0662Uj implements Continuation, fi.b {
    public final /* synthetic */ Runnable b;

    public /* synthetic */ C0662Uj(Runnable runnable) {
        this.b = runnable;
    }

    @Override // com.applovin.impl.fi.b
    public void a(boolean z, Object obj, Object obj2) {
        fi.e(this.b, z, obj, obj2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.b.run();
        return Tasks.forResult(null);
    }
}
