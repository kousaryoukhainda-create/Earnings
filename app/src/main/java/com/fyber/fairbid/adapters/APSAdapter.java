package com.fyber.fairbid.adapters;

import com.fyber.fairbid.d1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class APSAdapter {
    @NotNull
    public static final APSAdapter INSTANCE = new APSAdapter();
    @NotNull
    public static final LinkedHashMap a = new LinkedHashMap();
    @NotNull
    public static final LinkedHashMap b = new LinkedHashMap();
    public static SlotLoader c;

    @Metadata
    /* loaded from: classes.dex */
    public interface SlotLoader {
        void loadAPSBannerSlot(@NotNull String str, int i, int i2);

        void loadAPSInterstitialSlot(@NotNull String str);

        void loadAPSRewardedSlot(@NotNull String str);
    }

    public static final SlotLoader getSlotLoader() {
        return c;
    }

    public static /* synthetic */ void getSlotLoader$annotations() {
    }

    public static final void setBidInfo(@NotNull String slotUUID, @NotNull String encodedPricePoint, @NotNull String bidInfo) {
        B90 b90;
        Intrinsics.checkNotNullParameter(slotUUID, "slotUUID");
        Intrinsics.checkNotNullParameter(encodedPricePoint, "encodedPricePoint");
        Intrinsics.checkNotNullParameter(bidInfo, "bidInfo");
        d1 d1Var = (d1) a.remove(slotUUID);
        if (d1Var != null) {
            d1Var.a(bidInfo, encodedPricePoint);
            b90 = B90.a;
        } else {
            b90 = null;
        }
        if (b90 == null) {
            b.put(slotUUID, new JQ(bidInfo, encodedPricePoint));
        }
    }

    public static final void setSlotLoader(SlotLoader slotLoader) {
        c = slotLoader;
    }
}
