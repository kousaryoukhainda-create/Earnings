package io.adjoe.sdk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class PlaytimeEvent {
    public final String a;
    public final long b;

    public PlaytimeEvent(@NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = j;
    }

    public static /* synthetic */ PlaytimeEvent copy$default(PlaytimeEvent playtimeEvent, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playtimeEvent.a;
        }
        if ((i & 2) != 0) {
            j = playtimeEvent.b;
        }
        return playtimeEvent.copy(str, j);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    @NotNull
    public final PlaytimeEvent copy(@NotNull String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PlaytimeEvent(name, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaytimeEvent) {
            PlaytimeEvent playtimeEvent = (PlaytimeEvent) obj;
            return Intrinsics.a(this.a, playtimeEvent.a) && this.b == playtimeEvent.b;
        }
        return false;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final long getOccurredAt() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b = Ki0.b("PlaytimeEvent(name=");
        b.append(this.a);
        b.append(", occurredAt=");
        b.append(this.b);
        b.append(')');
        return b.toString();
    }
}
