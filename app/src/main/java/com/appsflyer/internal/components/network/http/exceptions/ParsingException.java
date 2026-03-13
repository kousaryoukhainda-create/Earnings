package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    @NonNull
    private final AFc1gSDK<String> AFKeystoreWrapper;

    public ParsingException(String str, Throwable th, @NonNull AFc1gSDK<String> aFc1gSDK) {
        super(str, th);
        this.AFKeystoreWrapper = aFc1gSDK;
    }

    @NonNull
    public AFc1gSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }
}
