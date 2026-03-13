package io.flutter.plugins.firebase.analytics;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class AnalyticsEvent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String name;
    private final Map<String, Object> parameters;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AnalyticsEvent fromList(@NotNull List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
            return new AnalyticsEvent((String) obj, (Map) pigeonVar_list.get(1));
        }

        private Companion() {
        }
    }

    public AnalyticsEvent(@NotNull String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsEvent.name;
        }
        if ((i & 2) != 0) {
            map = analyticsEvent.parameters;
        }
        return analyticsEvent.copy(str, map);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.parameters;
    }

    @NotNull
    public final AnalyticsEvent copy(@NotNull String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AnalyticsEvent(name, map);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return GeneratedAndroidFirebaseAnalyticsPigeonUtils.INSTANCE.deepEquals(toList(), ((AnalyticsEvent) obj).toList());
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    @NotNull
    public final List<Object> toList() {
        return C0346Ie.c(this.name, this.parameters);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        Map<String, Object> map = this.parameters;
        return "AnalyticsEvent(name=" + str + ", parameters=" + map + ")";
    }

    public /* synthetic */ AnalyticsEvent(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
