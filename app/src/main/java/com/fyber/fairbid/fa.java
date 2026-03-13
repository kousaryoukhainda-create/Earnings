package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.PauseSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface fa extends PauseSignal.a {

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @NotNull
        public final String a;
        @NotNull
        public final String b;

        public b(@NotNull String id, @NotNull String scope) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.a = id;
            this.b = scope;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    b a(long j);

    a b(long j);
}
