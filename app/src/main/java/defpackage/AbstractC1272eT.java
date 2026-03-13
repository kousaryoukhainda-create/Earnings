package defpackage;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: eT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1272eT {
    public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
