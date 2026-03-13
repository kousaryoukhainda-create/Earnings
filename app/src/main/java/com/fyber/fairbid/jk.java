package com.fyber.fairbid;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class jk implements kh {
    public final HashMap a;

    public jk() {
        HashMap hashMap = new HashMap(2);
        this.a = hashMap;
        hashMap.put("timezone_id", TimeZone.getDefault().getID());
    }

    @Override // com.fyber.fairbid.kh
    public final synchronized Map<String, String> getParameters() {
        this.a.put(Constants.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        return this.a;
    }
}
