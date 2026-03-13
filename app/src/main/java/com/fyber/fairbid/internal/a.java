package com.fyber.fairbid.internal;

import com.fyber.fairbid.AbstractC1114o0;
import com.fyber.fairbid.aj;
import com.fyber.fairbid.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.fyber.fairbid.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0048a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Constants.AdType.values().length];
            try {
                iArr[Constants.AdType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Constants.AdType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Constants.AdType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Constants.AdType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final AbstractC1114o0 a(@NotNull Constants.AdType adType, @NotNull aj ajVar) {
        Intrinsics.checkNotNullParameter(ajVar, "<this>");
        Intrinsics.checkNotNullParameter(adType, "adType");
        int i = C0048a.a[adType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new RuntimeException();
                    }
                    throw new IllegalArgumentException("Should not happen™");
                }
                return ajVar.b();
            }
            return ajVar.c();
        }
        return ajVar.a();
    }
}
