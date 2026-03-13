package com.fyber.fairbid.sdk.session;

import com.fyber.fairbid.internal.Constants;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class UserSessionState {
    public final long a;
    public final long b;
    @NotNull
    public final EnumMap<Constants.AdType, Integer> c;
    @NotNull
    public final EnumMap<Constants.AdType, Integer> d;
    public final int e;

    public UserSessionState(long j, long j2, @NotNull EnumMap<Constants.AdType, Integer> impressions, @NotNull EnumMap<Constants.AdType, Integer> clicks, int i) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(clicks, "clicks");
        this.a = j;
        this.b = j2;
        this.c = impressions;
        this.d = clicks;
        this.e = i;
    }

    public final int clicksFor(@NotNull Constants.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Integer num = this.d.get(adType);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    @NotNull
    public final EnumMap<Constants.AdType, Integer> component3() {
        return this.c;
    }

    @NotNull
    public final EnumMap<Constants.AdType, Integer> component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    @NotNull
    public final UserSessionState copy(long j, long j2, @NotNull EnumMap<Constants.AdType, Integer> impressions, @NotNull EnumMap<Constants.AdType, Integer> clicks, int i) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(clicks, "clicks");
        return new UserSessionState(j, j2, impressions, clicks, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSessionState) {
            UserSessionState userSessionState = (UserSessionState) obj;
            return this.a == userSessionState.a && this.b == userSessionState.b && Intrinsics.a(this.c, userSessionState.c) && Intrinsics.a(this.d, userSessionState.d) && this.e == userSessionState.e;
        }
        return false;
    }

    public final long getAge(long j) {
        return (j - this.a) / 1000;
    }

    @NotNull
    public final EnumMap<Constants.AdType, Integer> getClicks() {
        return this.d;
    }

    public final int getCompletions() {
        return this.e;
    }

    public final long getDuration() {
        return this.b;
    }

    @NotNull
    public final EnumMap<Constants.AdType, Integer> getImpressions() {
        return this.c;
    }

    public final long getStartTimestamp() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (int) (j2 ^ (j2 >>> 32));
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        return this.e + ((hashCode2 + ((hashCode + ((i + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31)) * 31);
    }

    public final int impressionsFor(@NotNull Constants.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Integer num = this.c.get(adType);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @NotNull
    public String toString() {
        return "UserSessionState(startTimestamp=" + this.a + ", duration=" + this.b + ", impressions=" + this.c + ", clicks=" + this.d + ", completions=" + this.e + ')';
    }
}
