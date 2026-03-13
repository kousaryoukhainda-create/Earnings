package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.user.Ethnicity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class t6 {
    @NotNull
    public static final Map<EnumC2424pa0, Ethnicity> a;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Ethnicity.values().length];
            try {
                iArr[Ethnicity.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    static {
        JQ jq = new JQ(EnumC2424pa0.asian, Ethnicity.ASIAN);
        JQ jq2 = new JQ(EnumC2424pa0.black, Ethnicity.BLACK);
        JQ jq3 = new JQ(EnumC2424pa0.hispanic, Ethnicity.HISPANIC);
        EnumC2424pa0 enumC2424pa0 = EnumC2424pa0.indian;
        Ethnicity ethnicity = Ethnicity.OTHER;
        a = C2148mJ.e(jq, jq2, jq3, new JQ(enumC2424pa0, ethnicity), new JQ(EnumC2424pa0.middle_eastern, ethnicity), new JQ(EnumC2424pa0.native_american, ethnicity), new JQ(EnumC2424pa0.pacific_islander, ethnicity), new JQ(EnumC2424pa0.white, Ethnicity.WHITE), new JQ(EnumC2424pa0.other, ethnicity));
    }
}
