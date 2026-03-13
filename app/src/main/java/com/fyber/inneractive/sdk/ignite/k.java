package com.fyber.inneractive.sdk.ignite;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum k {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE(DevicePublicKeyStringDef.NONE);
    
    private static final Map<String, k> CONSTANTS = new HashMap();
    private final String value;

    static {
        k[] values;
        for (k kVar : values()) {
            CONSTANTS.put(kVar.value, kVar);
        }
    }

    k(String str) {
        this.value = str;
    }

    public static k a(String str) {
        return CONSTANTS.get(str);
    }

    public boolean e() {
        if (this == TRUE_SINGLE_TAP) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.value;
    }
}
