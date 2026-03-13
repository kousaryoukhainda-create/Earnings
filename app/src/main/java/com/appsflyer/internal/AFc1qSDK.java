package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class AFc1qSDK<ResponseBody> {
    private final AFc1lSDK AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    public final AFa1aSDK valueOf;
    private final AFc1hSDK<ResponseBody> values;

    public AFc1qSDK(AFa1aSDK aFa1aSDK, ExecutorService executorService, AFc1lSDK aFc1lSDK, AFc1hSDK<ResponseBody> aFc1hSDK) {
        this.valueOf = aFa1aSDK;
        this.AFInAppEventType = executorService;
        this.AFInAppEventParameterName = aFc1lSDK;
        this.values = aFc1hSDK;
    }

    public final AFc1gSDK<ResponseBody> AFInAppEventType() throws IOException {
        if (!this.AFKeystoreWrapper.getAndSet(true)) {
            AFc1gSDK<String> AFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.valueOf);
            try {
                return new AFc1gSDK<>(this.values.values(AFInAppEventParameterName.getBody()), AFInAppEventParameterName.valueOf, AFInAppEventParameterName.AFKeystoreWrapper, AFInAppEventParameterName.AFInAppEventType, AFInAppEventParameterName.values);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, AFInAppEventParameterName);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
