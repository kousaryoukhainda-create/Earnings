package com.fyber.fairbid.internal;

import android.app.Activity;
import android.app.Application;
import com.fyber.fairbid.C1097g;
import com.fyber.fairbid.m3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface ActivityProvider {

    /* loaded from: classes.dex */
    public interface a {
        void a(@NotNull ActivityProvider activityProvider, Activity activity);
    }

    @NotNull
    m3 a();

    void a(@NotNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void a(@NotNull C1097g c1097g);

    void a(@NotNull a aVar);

    void b(@NotNull a aVar);

    Activity getForegroundActivity();
}
