package com.fyber.fairbid;

import android.app.Activity;
import android.app.Application;
import com.fyber.fairbid.internal.ActivityProvider;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095f extends C1097g {
    @NotNull
    public final List<String> a;
    @NotNull
    public final ActivityProvider b;
    @NotNull
    public final Function1 c;
    @NotNull
    public final Function1 d;

    public C1095f(List<String> list, ActivityProvider activityProvider, Function1 function1, Function1 function12) {
        this.a = list;
        this.b = activityProvider;
        this.c = function1;
        this.d = function12;
    }

    @Override // com.fyber.fairbid.C1097g, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName != null && this.a.contains(canonicalName) && ((Boolean) this.d.invoke(activity)).booleanValue()) {
            this.c.invoke(activity);
            this.b.a((Application.ActivityLifecycleCallbacks) this);
        }
    }
}
