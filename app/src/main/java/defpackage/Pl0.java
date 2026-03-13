package defpackage;

import com.android.billingclient.api.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.auth.AuthStateChannelStreamHandler;
import io.flutter.plugins.firebase.auth.IdTokenChannelStreamHandler;
import io.flutter.plugins.inapppurchase.b;
import java.util.ArrayList;
/* renamed from: Pl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Pl0 implements Runnable {
    public final /* synthetic */ int b;
    public Object c;
    public /* synthetic */ Object d;

    public /* synthetic */ Pl0() {
        this.b = 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                a aVar = (a) this.c;
                aVar.getClass();
                C0316Ha c0316Ha = Im0.l;
                aVar.J(24, 11, c0316Ha);
                ((b) this.d).g(c0316Ha, null);
                return;
            case 1:
                a aVar2 = (a) this.c;
                aVar2.getClass();
                C0316Ha c0316Ha2 = Im0.l;
                aVar2.J(24, 7, c0316Ha2);
                ((io.flutter.plugins.inapppurchase.a) this.d).a(c0316Ha2, new ArrayList());
                return;
            case 2:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C1571hv.f((String) this.c));
                FirebaseUser firebaseUser = firebaseAuth.f;
                if (firebaseUser != null) {
                    Task j = firebaseAuth.j(firebaseUser, true);
                    Rl0.e.v("Token refreshing started", new Object[0]);
                    j.addOnFailureListener(new C0942bV(this, 18));
                    return;
                }
                return;
            case 3:
                ((AbstractC2156mR) this.c).onVerificationFailed((C0285Fv) this.d);
                return;
            case 4:
                YC yc = (YC) this.c;
                IdTokenChannelStreamHandler.a(yc.a, yc.b, yc.c, (FirebaseAuth) this.d);
                return;
            case 5:
                a aVar3 = (a) this.c;
                C0316Ha c0316Ha3 = (C0316Ha) this.d;
                if (((InterfaceC1273eU) aVar3.e.d) != null) {
                    ((InterfaceC1273eU) aVar3.e.d).onPurchasesUpdated(c0316Ha3, null);
                    return;
                } else {
                    zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 6:
                C3248z6 c3248z6 = (C3248z6) this.c;
                AuthStateChannelStreamHandler.a(c3248z6.a, c3248z6.b, c3248z6.c, (FirebaseAuth) this.d);
                return;
            case 7:
                a aVar4 = (a) this.c;
                aVar4.getClass();
                aVar4.I((b) this.d, Im0.l, 24, null);
                return;
            case 8:
                a aVar5 = (a) this.c;
                aVar5.getClass();
                C0316Ha c0316Ha4 = Im0.l;
                aVar5.J(24, 3, c0316Ha4);
                ((b) this.d).a(c0316Ha4);
                return;
            case 9:
                a aVar6 = (a) this.c;
                aVar6.getClass();
                C0316Ha c0316Ha5 = Im0.l;
                aVar6.J(24, 13, c0316Ha5);
                ((b) this.d).e(c0316Ha5, null);
                return;
            default:
                a aVar7 = (a) this.c;
                aVar7.getClass();
                aVar7.D((b) this.d, Im0.l, 24, null);
                return;
        }
    }

    public /* synthetic */ Pl0(a aVar, Object obj, int i) {
        this.b = i;
        this.c = aVar;
        this.d = obj;
    }

    public /* synthetic */ Pl0(FirebaseAuth firebaseAuth, Object obj, int i) {
        this.b = i;
        this.c = obj;
        this.d = firebaseAuth;
    }

    public Pl0(Rl0 rl0, String str) {
        this.b = 2;
        this.d = rl0;
        this.c = Preconditions.checkNotEmpty(str);
    }
}
