package io.adjoe.sdk.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class TimedRewardMultiplierEvent {
    @NotNull
    public static final b Companion = new Object();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final Status e;
    public final Date f;
    public final Date g;
    public final int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Status {
        public static final Status ACTIVE;
        @NotNull
        public static final a Companion;
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final /* synthetic */ Status[] c;
        public static final /* synthetic */ C0488Nr d;
        public final String b;

        /* JADX WARN: Type inference failed for: r0v2, types: [io.adjoe.sdk.internal.a, java.lang.Object] */
        static {
            Status status = new Status("ACTIVE", 0, "Active");
            ACTIVE = status;
            Status status2 = new Status("FINISHED", 1, "Finished");
            FINISHED = status2;
            Status status3 = new Status("PENDING", 2, "Pending");
            PENDING = status3;
            Status[] statusArr = {status, status2, status3};
            c = statusArr;
            d = AbstractC1281eb.u(statusArr);
            Companion = new Object();
        }

        public Status(String str, int i, String str2) {
            this.b = str2;
        }

        @NotNull
        public static InterfaceC0462Mr getEntries() {
            return d;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) c.clone();
        }

        @NotNull
        public final String getValue() {
            return this.b;
        }
    }

    public TimedRewardMultiplierEvent(@NotNull String eventName, int i, int i2, @NotNull String description, Status status, Date date, Date date2, int i3) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = eventName;
        this.b = i;
        this.c = i2;
        this.d = description;
        this.e = status;
        this.f = date;
        this.g = date2;
        this.h = i3;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    public final Status component5() {
        return this.e;
    }

    public final Date component6() {
        return this.f;
    }

    public final Date component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    @NotNull
    public final TimedRewardMultiplierEvent copy(@NotNull String eventName, int i, int i2, @NotNull String description, Status status, Date date, Date date2, int i3) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(description, "description");
        return new TimedRewardMultiplierEvent(eventName, i, i2, description, status, date, date2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimedRewardMultiplierEvent) {
            TimedRewardMultiplierEvent timedRewardMultiplierEvent = (TimedRewardMultiplierEvent) obj;
            return Intrinsics.a(this.a, timedRewardMultiplierEvent.a) && this.b == timedRewardMultiplierEvent.b && this.c == timedRewardMultiplierEvent.c && Intrinsics.a(this.d, timedRewardMultiplierEvent.d) && this.e == timedRewardMultiplierEvent.e && Intrinsics.a(this.f, timedRewardMultiplierEvent.f) && Intrinsics.a(this.g, timedRewardMultiplierEvent.g) && this.h == timedRewardMultiplierEvent.h;
        }
        return false;
    }

    public final Date getActivatedAt() {
        return this.f;
    }

    @NotNull
    public final String getDescription() {
        return this.d;
    }

    @NotNull
    public final String getEventName() {
        return this.a;
    }

    public final Date getLastUsedAt() {
        return this.g;
    }

    public final int getMultiplierFactorPercentage() {
        return this.b;
    }

    public final int getMultiplierLevels() {
        return this.c;
    }

    public final Status getStatus() {
        return this.e;
    }

    public final int getUsedLevels() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.b;
        int b = AbstractC2437ph.b((this.c + ((i + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int i2 = 0;
        Status status = this.e;
        if (status == null) {
            hashCode = 0;
        } else {
            hashCode = status.hashCode();
        }
        int i3 = (b + hashCode) * 31;
        Date date = this.f;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Date date2 = this.g;
        if (date2 != null) {
            i2 = date2.hashCode();
        }
        return this.h + ((i4 + i2) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b = Ki0.b("TimedRewardMultiplierEvent(eventName=");
        b.append(this.a);
        b.append(", multiplierFactorPercentage=");
        b.append(this.b);
        b.append(", multiplierLevels=");
        b.append(this.c);
        b.append(", description=");
        b.append(this.d);
        b.append(", status=");
        b.append(this.e);
        b.append(", activatedAt=");
        b.append(this.f);
        b.append(", lastUsedAt=");
        b.append(this.g);
        b.append(", usedLevels=");
        b.append(this.h);
        b.append(')');
        return b.toString();
    }
}
