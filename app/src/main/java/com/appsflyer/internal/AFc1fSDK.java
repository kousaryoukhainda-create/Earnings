package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFc1fSDK {
    @NotNull
    final String AFInAppEventParameterName;
    @NotNull
    final String valueOf;

    public AFc1fSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventParameterName = str;
        this.valueOf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AFc1fSDK) {
            AFc1fSDK aFc1fSDK = (AFc1fSDK) obj;
            return Intrinsics.a(this.AFInAppEventParameterName, aFc1fSDK.AFInAppEventParameterName) && Intrinsics.a(this.valueOf, aFc1fSDK.valueOf);
        }
        return false;
    }

    public final int hashCode() {
        return this.valueOf.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", host=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
