package com.fyber.fairbid;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class sf extends b4 {
    public final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(int i, long j, int i2, long j2, @NotNull String sdkSessionId, @NotNull String connectionType, @NotNull String userSessionId) {
        super(i, j, i2, sdkSessionId, connectionType, userSessionId);
        Intrinsics.checkNotNullParameter(sdkSessionId, "sdkSessionId");
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        Intrinsics.checkNotNullParameter(userSessionId, "userSessionId");
        this.g = j2;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return C2148mJ.e(new JQ("connection_type", this.e), new JQ("sdk_session_id", this.d), new JQ("sdk_init_timestamp", Long.valueOf(this.g)), new JQ("event_version", Integer.valueOf(this.c)), new JQ("event_creation_timestamp", Long.valueOf(this.b)), new JQ("event_id", Integer.valueOf(this.a)), new JQ("user_session_id", this.f));
    }
}
