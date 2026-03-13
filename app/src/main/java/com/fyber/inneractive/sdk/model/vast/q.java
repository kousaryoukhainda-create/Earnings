package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum q {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN("unknown");
    
    private static final Map<String, q> sMediaTypeMap = new HashMap();
    public final String mimeType;

    static {
        q[] values;
        for (q qVar : values()) {
            sMediaTypeMap.put(qVar.mimeType, qVar);
        }
    }

    q(String str) {
        this.mimeType = str;
    }

    public static q a(String str) {
        Map<String, q> map = sMediaTypeMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return UNKNOWN;
    }
}
