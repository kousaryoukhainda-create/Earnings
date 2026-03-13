package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final class E {
    public EnumC1498h30 a;
    public EnumC1412g30 b;
    public final n c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final B l;

    public E(EnumC1498h30 finalState, EnumC1412g30 lifecycleImpact, B fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        n fragment = fragmentStateManager.c;
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.a = finalState;
        this.b = lifecycleImpact;
        this.c = fragment;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = fragmentStateManager;
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (AbstractC1326f30 abstractC1326f30 : C0553Qe.A(this.k)) {
            abstractC1326f30.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            if (!abstractC1326f30.b) {
                abstractC1326f30.b(container);
            }
            abstractC1326f30.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.k();
    }

    public final void c(AbstractC1326f30 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(EnumC1498h30 finalState, EnumC1412g30 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        EnumC1498h30 enumC1498h30 = EnumC1498h30.b;
        n nVar = this.c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                    }
                    this.a = enumC1498h30;
                    this.b = EnumC1412g30.d;
                    this.i = true;
                }
            } else if (this.a == enumC1498h30) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = EnumC1498h30.c;
                this.b = EnumC1412g30.c;
                this.i = true;
            }
        } else if (this.a != enumC1498h30) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + nVar + " mFinalState = " + this.a + " -> " + finalState + '.');
            }
            this.a = finalState;
        }
    }

    public final String toString() {
        StringBuilder m = AbstractC0324Hi.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        m.append(this.a);
        m.append(" lifecycleImpact = ");
        m.append(this.b);
        m.append(" fragment = ");
        m.append(this.c);
        m.append('}');
        return m.toString();
    }
}
