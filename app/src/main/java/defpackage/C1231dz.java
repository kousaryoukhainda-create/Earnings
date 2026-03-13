package defpackage;

import android.transition.Transition;
import java.util.ArrayList;
/* renamed from: dz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231dz implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ C1403fz e;

    public C1231dz(C1403fz c1403fz, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = c1403fz;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C1403fz c1403fz = this.e;
        Object obj = this.a;
        if (obj != null) {
            c1403fz.u(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            c1403fz.u(obj2, this.d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
