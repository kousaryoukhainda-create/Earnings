package defpackage;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;
/* renamed from: cz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146cz implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public C1146cz(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
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
