package com.appsflyer.internal;

import java.text.ParseException;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface AFf1iSDK {

    @Metadata
    /* loaded from: classes.dex */
    public static final class AFa1ySDK {
        static final /* synthetic */ AFa1ySDK AFInAppEventParameterName = new AFa1ySDK();

        private AFa1ySDK() {
        }
    }

    void AFInAppEventParameterName();

    void AFInAppEventType();

    @NotNull
    Map<String, Object> valueOf();

    @NotNull
    Map<String, Object> values() throws ParseException;
}
