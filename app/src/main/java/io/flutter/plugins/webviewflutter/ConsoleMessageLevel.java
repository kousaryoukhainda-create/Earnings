package io.flutter.plugins.webviewflutter;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class ConsoleMessageLevel {
    private static final /* synthetic */ InterfaceC0462Mr $ENTRIES;
    private static final /* synthetic */ ConsoleMessageLevel[] $VALUES;
    @NotNull
    public static final Companion Companion;
    private final int raw;
    public static final ConsoleMessageLevel DEBUG = new ConsoleMessageLevel("DEBUG", 0, 0);
    public static final ConsoleMessageLevel ERROR = new ConsoleMessageLevel("ERROR", 1, 1);
    public static final ConsoleMessageLevel LOG = new ConsoleMessageLevel("LOG", 2, 2);
    public static final ConsoleMessageLevel TIP = new ConsoleMessageLevel("TIP", 3, 3);
    public static final ConsoleMessageLevel WARNING = new ConsoleMessageLevel("WARNING", 4, 4);
    public static final ConsoleMessageLevel UNKNOWN = new ConsoleMessageLevel(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, 5);

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConsoleMessageLevel ofRaw(int i) {
            ConsoleMessageLevel[] values;
            for (ConsoleMessageLevel consoleMessageLevel : ConsoleMessageLevel.values()) {
                if (consoleMessageLevel.getRaw() == i) {
                    return consoleMessageLevel;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ConsoleMessageLevel[] $values() {
        return new ConsoleMessageLevel[]{DEBUG, ERROR, LOG, TIP, WARNING, UNKNOWN};
    }

    static {
        ConsoleMessageLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1281eb.u($values);
        Companion = new Companion(null);
    }

    private ConsoleMessageLevel(String str, int i, int i2) {
        this.raw = i2;
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return $ENTRIES;
    }

    public static ConsoleMessageLevel valueOf(String str) {
        return (ConsoleMessageLevel) Enum.valueOf(ConsoleMessageLevel.class, str);
    }

    public static ConsoleMessageLevel[] values() {
        return (ConsoleMessageLevel[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
