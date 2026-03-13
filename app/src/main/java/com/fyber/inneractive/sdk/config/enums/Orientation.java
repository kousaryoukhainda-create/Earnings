package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum Orientation {
    LANDSCAPE("landscape", false),
    PORTRAIT("portrait", false),
    USER(Constants.USER, true),
    NONE(DevicePublicKeyStringDef.NONE, true);
    
    private static final Map<String, Orientation> CONSTANTS = new HashMap();
    public boolean allowOrientationChange;
    private final String value;

    static {
        Orientation[] values;
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    Orientation(String str, boolean z) {
        this.value = str;
        this.allowOrientationChange = z;
    }

    public static Orientation fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }
}
