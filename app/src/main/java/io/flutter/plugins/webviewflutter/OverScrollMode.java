package io.flutter.plugins.webviewflutter;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class OverScrollMode {
    private static final /* synthetic */ InterfaceC0462Mr $ENTRIES;
    private static final /* synthetic */ OverScrollMode[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int raw;
    public static final OverScrollMode ALWAYS = new OverScrollMode("ALWAYS", 0, 0);
    public static final OverScrollMode IF_CONTENT_SCROLLS = new OverScrollMode("IF_CONTENT_SCROLLS", 1, 1);
    public static final OverScrollMode NEVER = new OverScrollMode("NEVER", 2, 2);
    public static final OverScrollMode UNKNOWN = new OverScrollMode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, 3);

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OverScrollMode ofRaw(int i) {
            OverScrollMode[] values;
            for (OverScrollMode overScrollMode : OverScrollMode.values()) {
                if (overScrollMode.getRaw() == i) {
                    return overScrollMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OverScrollMode[] $values() {
        return new OverScrollMode[]{ALWAYS, IF_CONTENT_SCROLLS, NEVER, UNKNOWN};
    }

    static {
        OverScrollMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1281eb.u($values);
        Companion = new Companion(null);
    }

    private OverScrollMode(String str, int i, int i2) {
        this.raw = i2;
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return $ENTRIES;
    }

    public static OverScrollMode valueOf(String str) {
        return (OverScrollMode) Enum.valueOf(OverScrollMode.class, str);
    }

    public static OverScrollMode[] values() {
        return (OverScrollMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
