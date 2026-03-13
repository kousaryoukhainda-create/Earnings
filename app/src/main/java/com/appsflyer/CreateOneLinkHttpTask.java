package com.appsflyer;

import com.appsflyer.internal.AFc1tSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1vSDK;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask implements AFc1uSDK {
    @NotNull
    private final AFc1vSDK valueOf;

    @Deprecated
    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    public final void valueOf(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFc1tSDK(bArr, map, 2000).AFInAppEventParameterName()) {
            this.valueOf.values();
        }
    }

    public CreateOneLinkHttpTask(AFc1vSDK aFc1vSDK) {
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        this.valueOf = aFc1vSDK;
    }
}
