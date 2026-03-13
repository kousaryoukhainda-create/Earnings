package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzaf;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements InterfaceC2595ra0 {
    public abstract void A(ArrayList arrayList);

    public abstract String w();

    public abstract boolean x();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [nv, Em0] */
    public final Task y() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C1571hv.f(((zzaf) this).d));
        firebaseAuth.getClass();
        ?? c2285nv = new C2285nv(firebaseAuth, 0);
        Preconditions.checkNotNull(this);
        return firebaseAuth.e.zza(firebaseAuth.a, this, (Em0) c2285nv);
    }

    public abstract zzaf z(ArrayList arrayList);
}
