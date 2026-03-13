package com.fyber.fairbid;

import com.fyber.fairbid.ads.RequestFailure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class bd {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2234nJ.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final RequestFailure a(@NotNull EnumC2234nJ enumC2234nJ) {
        Intrinsics.checkNotNullParameter(enumC2234nJ, "<this>");
        int i = a.a[enumC2234nJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return RequestFailure.UNKNOWN;
                        }
                        return RequestFailure.INTERNAL;
                    }
                    return RequestFailure.INTERNAL;
                }
                return RequestFailure.INTERNAL;
            }
            return RequestFailure.CONFIGURATION_ERROR;
        }
        return RequestFailure.UNAVAILABLE;
    }
}
