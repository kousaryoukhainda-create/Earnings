package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class MixedContentMode {
    private static final /* synthetic */ InterfaceC0462Mr $ENTRIES;
    private static final /* synthetic */ MixedContentMode[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int raw;
    public static final MixedContentMode ALWAYS_ALLOW = new MixedContentMode("ALWAYS_ALLOW", 0, 0);
    public static final MixedContentMode COMPATIBILITY_MODE = new MixedContentMode("COMPATIBILITY_MODE", 1, 1);
    public static final MixedContentMode NEVER_ALLOW = new MixedContentMode("NEVER_ALLOW", 2, 2);

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MixedContentMode ofRaw(int i) {
            MixedContentMode[] values;
            for (MixedContentMode mixedContentMode : MixedContentMode.values()) {
                if (mixedContentMode.getRaw() == i) {
                    return mixedContentMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MixedContentMode[] $values() {
        return new MixedContentMode[]{ALWAYS_ALLOW, COMPATIBILITY_MODE, NEVER_ALLOW};
    }

    static {
        MixedContentMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1281eb.u($values);
        Companion = new Companion(null);
    }

    private MixedContentMode(String str, int i, int i2) {
        this.raw = i2;
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return $ENTRIES;
    }

    public static MixedContentMode valueOf(String str) {
        return (MixedContentMode) Enum.valueOf(MixedContentMode.class, str);
    }

    public static MixedContentMode[] values() {
        return (MixedContentMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
