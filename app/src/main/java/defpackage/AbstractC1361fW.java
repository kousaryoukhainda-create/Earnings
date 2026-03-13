package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.FragmentC1533hW;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: fW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1361fW {
    public static void a(Activity activity, AG event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof HG) {
            CG lifecycle = ((HG) activity).getLifecycle();
            if (lifecycle instanceof JG) {
                ((JG) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC1533hW.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new FragmentC1533hW.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
