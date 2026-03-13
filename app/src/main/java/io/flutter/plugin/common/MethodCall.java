package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class MethodCall {
    public final Object arguments;
    public final String method;

    public MethodCall(@NonNull String str, Object obj) {
        this.method = str;
        this.arguments = obj;
    }

    public <T> T argument(@NonNull String str) {
        Object obj = this.arguments;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T arguments() {
        return (T) this.arguments;
    }

    public boolean hasArgument(@NonNull String str) {
        Object obj = this.arguments;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
