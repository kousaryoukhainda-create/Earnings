package io.adjoe.sdk.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class TimedRewardMultiplierConfig {
    @NotNull
    public static final A60 Companion = new Object();
    public final boolean a;
    public final List b;

    public TimedRewardMultiplierConfig(boolean z, @NotNull List<TimedRewardMultiplierEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.a = z;
        this.b = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimedRewardMultiplierConfig copy$default(TimedRewardMultiplierConfig timedRewardMultiplierConfig, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = timedRewardMultiplierConfig.a;
        }
        if ((i & 2) != 0) {
            list = timedRewardMultiplierConfig.b;
        }
        return timedRewardMultiplierConfig.copy(z, list);
    }

    public static final TimedRewardMultiplierConfig fromJson(JSONObject jSONObject) {
        Companion.getClass();
        return A60.a(jSONObject);
    }

    public final boolean component1() {
        return this.a;
    }

    @NotNull
    public final List<TimedRewardMultiplierEvent> component2() {
        return this.b;
    }

    @NotNull
    public final TimedRewardMultiplierConfig copy(boolean z, @NotNull List<TimedRewardMultiplierEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new TimedRewardMultiplierConfig(z, events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimedRewardMultiplierConfig) {
            TimedRewardMultiplierConfig timedRewardMultiplierConfig = (TimedRewardMultiplierConfig) obj;
            return this.a == timedRewardMultiplierConfig.a && Intrinsics.a(this.b, timedRewardMultiplierConfig.b);
        }
        return false;
    }

    @NotNull
    public final List<TimedRewardMultiplierEvent> getEvents() {
        return this.b;
    }

    public int hashCode() {
        int i;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.b.hashCode() + (i * 31);
    }

    public final boolean isPlaytimeWithMultiplier() {
        return this.a;
    }

    @NotNull
    public String toString() {
        StringBuilder b = Ki0.b("TimedRewardMultiplierConfig(isPlaytimeWithMultiplier=");
        b.append(this.a);
        b.append(", events=");
        b.append(this.b);
        b.append(')');
        return b.toString();
    }
}
