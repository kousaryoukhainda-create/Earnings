package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public final class p7 {
    public static final o7 a(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -213632750) {
                if (hashCode != 3387192) {
                    if (hashCode != 106934601) {
                        if (hashCode == 1989774883 && str2.equals("exchange")) {
                            return o7.b;
                        }
                    } else if (str2.equals("price")) {
                        return o7.d;
                    }
                } else if (str2.equals(DevicePublicKeyStringDef.NONE)) {
                    return o7.e;
                }
            } else if (str2.equals("waterfall")) {
                return o7.a;
            }
        }
        Logger.debug("Couldn't find a fallback mode (on request) for " + str);
        return null;
    }

    public static final o7 b(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -213632750) {
                if (hashCode != 3387192) {
                    if (hashCode != 106934601) {
                        if (hashCode == 1989774883 && str2.equals("exchange")) {
                            return o7.b;
                        }
                    } else if (str2.equals("price")) {
                        return o7.d;
                    }
                } else if (str2.equals(DevicePublicKeyStringDef.NONE)) {
                    return o7.e;
                }
            } else if (str2.equals("waterfall")) {
                return o7.a;
            }
        }
        Logger.debug("Couldn't find a fallback mode (on show) for " + str);
        return null;
    }
}
