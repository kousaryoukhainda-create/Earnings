package com.fyber.fairbid;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class nj implements kh {
    public final Map<String, String> a = Collections.singletonMap("session_id", UUID.randomUUID().toString());

    @Override // com.fyber.fairbid.kh
    public final synchronized Map<String, String> getParameters() {
        return this.a;
    }
}
