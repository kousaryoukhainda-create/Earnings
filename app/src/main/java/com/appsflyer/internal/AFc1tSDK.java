package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFc1tSDK {
    @NotNull
    private static String valueOf;
    @NotNull
    private byte[] AFInAppEventParameterName;
    private Map<String, String> AFKeystoreWrapper;
    private final int values;

    @Metadata
    /* loaded from: classes.dex */
    public static final class AFa1wSDK {
        private AFa1wSDK() {
        }

        public /* synthetic */ AFa1wSDK(byte b) {
            this();
        }
    }

    static {
        new AFa1wSDK((byte) 0);
        valueOf = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    }

    public AFc1tSDK(@NotNull byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = bArr;
        this.AFKeystoreWrapper = map;
        this.values = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0184, code lost:
        if (r10 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventParameterName() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1tSDK.AFInAppEventParameterName():boolean");
    }
}
