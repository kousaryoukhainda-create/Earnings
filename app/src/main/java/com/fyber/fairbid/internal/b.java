package com.fyber.fairbid.internal;

import android.app.Activity;
import com.fyber.fairbid.C1097g;
import com.fyber.fairbid.internal.ActivityProvider;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class b extends C1097g {
    public final /* synthetic */ ContextReference a;

    public b(ContextReference contextReference) {
        this.a = contextReference;
    }

    @Override // com.fyber.fairbid.C1097g, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug("ContextReference - onActivityPaused: " + activity);
        if (this.a.getForegroundActivity() == activity) {
            Logger.debug("ContextReference - onActivityPaused - was foreground activity");
            ContextReference contextReference = this.a;
            contextReference.b = null;
            for (ActivityProvider.a aVar : Collections.unmodifiableList(contextReference.e)) {
                aVar.a(this.a, null);
            }
        }
    }

    @Override // com.fyber.fairbid.C1097g, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug("ContextReference - onActivityResumed: " + activity);
        ContextReference contextReference = this.a;
        contextReference.b = activity;
        if (contextReference.getApplicationContext() != activity.getApplicationContext()) {
            Logger.debug("The existing application context is not the same as the one from the foreground activity. Updating it....");
            this.a.a = activity.getApplicationContext();
        }
        for (ActivityProvider.a aVar : Collections.unmodifiableList(this.a.e)) {
            ContextReference contextReference2 = this.a;
            aVar.a(contextReference2, contextReference2.getForegroundActivity());
        }
    }
}
