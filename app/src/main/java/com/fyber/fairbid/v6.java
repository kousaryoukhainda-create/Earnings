package com.fyber.fairbid;

import com.fyber.fairbid.common.lifecycle.EventStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class v6 {
    public static final <V> void a(@NotNull EventStream<V> eventStream, @NotNull Executor executor, @NotNull EventStream.EventListener<V> listener) {
        Intrinsics.checkNotNullParameter(eventStream, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        eventStream.addListener(listener, executor);
    }
}
