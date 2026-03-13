package com.huawei.hms.flutter.iap.utils;

import io.flutter.plugin.common.MethodCall;
import java.util.Objects;
/* loaded from: classes2.dex */
public class ValueGetter {
    private ValueGetter() {
    }

    public static Boolean getBoolean(String str, MethodCall methodCall) {
        Object argument = methodCall.argument(str);
        if (argument instanceof Boolean) {
            return (Boolean) argument;
        }
        throw new IllegalArgumentException();
    }

    public static int getInt(String str, MethodCall methodCall) {
        Object argument = methodCall.argument(str);
        Objects.requireNonNull(argument);
        if (argument instanceof Number) {
            return ((Number) argument).intValue();
        }
        throw new IllegalArgumentException();
    }

    public static String getString(String str, MethodCall methodCall) {
        Object argument = methodCall.argument(str);
        if (argument instanceof String) {
            return (String) argument;
        }
        throw new IllegalArgumentException();
    }
}
