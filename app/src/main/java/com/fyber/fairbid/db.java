package com.fyber.fairbid;

import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.common.lifecycle.FetchResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class db {
    public final long a;
    public final boolean b;
    @NotNull
    public final SettableFuture<FetchResult> c;

    public db(long j, boolean z, @NotNull SettableFuture<FetchResult> fetchResultFuture) {
        Intrinsics.checkNotNullParameter(fetchResultFuture, "fetchResultFuture");
        this.a = j;
        this.b = z;
        this.c = fetchResultFuture;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ db(long r3) {
        /*
            r2 = this;
            com.fyber.fairbid.common.concurrency.SettableFuture r0 = com.fyber.fairbid.common.concurrency.SettableFuture.create()
            java.lang.String r1 = "create()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.db.<init>(long):void");
    }
}
