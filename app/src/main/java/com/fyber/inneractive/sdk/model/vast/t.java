package com.fyber.inneractive.sdk.model.vast;

import com.fyber.fairbid.sdk.session.UserSessionStorage;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum t {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START(UserSessionStorage.START),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_PAUSE("pause"),
    EVENT_RESUME("resume"),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND("expand"),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    EVENT_PROGRESS("progress"),
    UNKNOWN("UnkownEvent");
    
    private static final Map<String, t> sEventsMap = new HashMap();
    private final String mKey;

    static {
        t[] values;
        for (t tVar : values()) {
            sEventsMap.put(tVar.mKey, tVar);
        }
    }

    t(String str) {
        this.mKey = str;
    }

    public static t a(String str) {
        Map<String, t> map = sEventsMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return UNKNOWN;
    }

    public String e() {
        return this.mKey;
    }
}
