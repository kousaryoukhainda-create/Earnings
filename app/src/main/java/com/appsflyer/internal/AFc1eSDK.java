package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AFc1eSDK {
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final AFc1aSDK valueOf;
    public final String values;

    public AFc1eSDK(@NotNull String str, String str2, @NotNull AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1aSDK, "");
        this.AFInAppEventType = str;
        this.values = str2;
        this.valueOf = aFc1aSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AFc1eSDK) {
            AFc1eSDK aFc1eSDK = (AFc1eSDK) obj;
            return Intrinsics.a(this.AFInAppEventType, aFc1eSDK.AFInAppEventType) && Intrinsics.a(this.values, aFc1eSDK.values) && this.valueOf == aFc1eSDK.valueOf;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.AFInAppEventType.hashCode() * 31;
        String str = this.values;
        return this.valueOf.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HostMeta(name=");
        sb.append(this.AFInAppEventType);
        sb.append(", prefix=");
        sb.append(this.values);
        sb.append(", method=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
