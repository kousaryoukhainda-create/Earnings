package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887e extends AbstractC1326f30 {
    public final C0886d c;
    public AnimatorSet d;

    public C0887e(C0886d animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.c = animatorInfo;
    }

    @Override // defpackage.AbstractC1326f30
    public final void b(ViewGroup container) {
        String str;
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.d;
        E e = this.c.a;
        if (animatorSet == null) {
            e.c(this);
            return;
        }
        if (e.g) {
            if (Build.VERSION.SDK_INT >= 26) {
                C2020ko.a.a(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(e);
            sb.append(" has been canceled");
            if (e.g) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            sb.append(str);
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.AbstractC1326f30
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        E e = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            e.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + e + " has started.");
        }
    }

    @Override // defpackage.AbstractC1326f30
    public final void d(C2652s9 backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        E e = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            e.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && e.c.mTransitioning) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + e);
            }
            long a = C1934jo.a.a(animatorSet);
            long j = backEvent.c * ((float) a);
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + e);
            }
            C2020ko.a.b(animatorSet, j);
        }
    }

    @Override // defpackage.AbstractC1326f30
    public final void e(ViewGroup container) {
        AnimatorSet animatorSet;
        boolean z;
        Intrinsics.checkNotNullParameter(container, "container");
        C0886d c0886d = this.c;
        if (c0886d.a()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C0647Tu b = c0886d.b(context);
        if (b != null) {
            animatorSet = (AnimatorSet) b.d;
        } else {
            animatorSet = null;
        }
        this.d = animatorSet;
        E e = c0886d.a;
        n nVar = e.c;
        if (e.a == EnumC1498h30.d) {
            z = true;
        } else {
            z = false;
        }
        View view = nVar.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new C1649io(container, view, z, e, this));
        }
        AnimatorSet animatorSet3 = this.d;
        if (animatorSet3 != null) {
            animatorSet3.setTarget(view);
        }
    }
}
