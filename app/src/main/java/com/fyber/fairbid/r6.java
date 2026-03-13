package com.fyber.fairbid;

import com.fyber.fairbid.ads.offerwall.user.Education;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class r6 {
    @NotNull
    public static final Map<EnumC2338oa0, Education> a;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Education.values().length];
            try {
                iArr[Education.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    static {
        EnumC2338oa0 enumC2338oa0 = EnumC2338oa0.other;
        Education education = Education.OTHER;
        a = C2148mJ.e(new JQ(enumC2338oa0, education), new JQ(EnumC2338oa0.none, education), new JQ(EnumC2338oa0.high_school, Education.HIGHSCHOOL), new JQ(EnumC2338oa0.in_college, education), new JQ(EnumC2338oa0.some_college, education), new JQ(EnumC2338oa0.associates, education), new JQ(EnumC2338oa0.bachelors, Education.BACHELOR), new JQ(EnumC2338oa0.masters, Education.MASTER), new JQ(EnumC2338oa0.doctorate, Education.PHD));
    }
}
