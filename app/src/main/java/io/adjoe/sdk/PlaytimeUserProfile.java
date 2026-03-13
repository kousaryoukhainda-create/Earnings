package io.adjoe.sdk;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class PlaytimeUserProfile {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public final PlaytimeGender a;
    public final Date b;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PlaytimeGender getGenderFromBackendResponse(String str) {
            if (Intrinsics.a(str, "female")) {
                return PlaytimeGender.FEMALE;
            }
            if (Intrinsics.a(str, "male")) {
                return PlaytimeGender.MALE;
            }
            return PlaytimeGender.UNKNOWN;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaytimeGender.values().length];
            try {
                iArr[PlaytimeGender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaytimeGender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PlaytimeUserProfile(PlaytimeGender playtimeGender, Date date) {
        this.a = playtimeGender;
        this.b = date;
    }

    @NotNull
    public final String getBackendGender() {
        int i;
        PlaytimeGender playtimeGender = this.a;
        if (playtimeGender == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[playtimeGender.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                return "unknown";
            }
            return "female";
        }
        return "male";
    }

    public final Date getBirthday() {
        Date date = this.b;
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }
}
