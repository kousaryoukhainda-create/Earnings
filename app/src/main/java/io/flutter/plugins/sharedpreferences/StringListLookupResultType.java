package io.flutter.plugins.sharedpreferences;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class StringListLookupResultType {
    private static final /* synthetic */ InterfaceC0462Mr $ENTRIES;
    private static final /* synthetic */ StringListLookupResultType[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int raw;
    public static final StringListLookupResultType PLATFORM_ENCODED = new StringListLookupResultType("PLATFORM_ENCODED", 0, 0);
    public static final StringListLookupResultType JSON_ENCODED = new StringListLookupResultType("JSON_ENCODED", 1, 1);
    public static final StringListLookupResultType UNEXPECTED_STRING = new StringListLookupResultType("UNEXPECTED_STRING", 2, 2);

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StringListLookupResultType ofRaw(int i) {
            StringListLookupResultType[] values;
            for (StringListLookupResultType stringListLookupResultType : StringListLookupResultType.values()) {
                if (stringListLookupResultType.getRaw() == i) {
                    return stringListLookupResultType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ StringListLookupResultType[] $values() {
        return new StringListLookupResultType[]{PLATFORM_ENCODED, JSON_ENCODED, UNEXPECTED_STRING};
    }

    static {
        StringListLookupResultType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1281eb.u($values);
        Companion = new Companion(null);
    }

    private StringListLookupResultType(String str, int i, int i2) {
        this.raw = i2;
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return $ENTRIES;
    }

    public static StringListLookupResultType valueOf(String str) {
        return (StringListLookupResultType) Enum.valueOf(StringListLookupResultType.class, str);
    }

    public static StringListLookupResultType[] values() {
        return (StringListLookupResultType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
