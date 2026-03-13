package com.applovin.impl.sdk;
/* loaded from: classes.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");
    private final int a;
    private final String b;

    public AppLovinError(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        if (message != null ? message.equals(message2) : message2 == null) {
            return true;
        }
        return false;
    }

    public int getCode() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        String message = getMessage();
        int code = (getCode() + 59) * 59;
        if (message == null) {
            hashCode = 43;
        } else {
            hashCode = message.hashCode();
        }
        return code + hashCode;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
