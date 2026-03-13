package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* renamed from: fz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403fz extends AbstractC1575hz {
    public static boolean t(Transition transition) {
        if (AbstractC1575hz.h(transition.getTargetIds()) && AbstractC1575hz.h(transition.getTargetNames()) && AbstractC1575hz.h(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC1575hz
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // defpackage.AbstractC1575hz
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!t(transition) && AbstractC1575hz.h(transition.getTargets())) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // defpackage.AbstractC1575hz
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.AbstractC1575hz
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.AbstractC1575hz
    public final void i() {
        if (Log.isLoggable("FragmentManager", 4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // defpackage.AbstractC1575hz
    public final Object k(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.AbstractC1575hz
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1146cz(view, arrayList));
    }

    @Override // defpackage.AbstractC1575hz
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C1231dz(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.AbstractC1575hz
    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC1575hz.g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0984bz(0, rect));
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final void o(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C0984bz(1, rect));
    }

    @Override // defpackage.AbstractC1575hz
    public final void p(Object obj, C1997kc c1997kc, W1 w1) {
        ((Transition) obj).addListener(new C1317ez(w1));
    }

    @Override // defpackage.AbstractC1575hz
    public final void q(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1575hz.d((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.AbstractC1575hz
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC1575hz
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                u(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!t(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }
}
