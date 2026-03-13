package io.flutter.plugins.webviewflutter;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class FileChooserMode {
    private static final /* synthetic */ InterfaceC0462Mr $ENTRIES;
    private static final /* synthetic */ FileChooserMode[] $VALUES;
    @NotNull
    public static final Companion Companion;
    public static final FileChooserMode OPEN = new FileChooserMode("OPEN", 0, 0);
    public static final FileChooserMode OPEN_MULTIPLE = new FileChooserMode("OPEN_MULTIPLE", 1, 1);
    public static final FileChooserMode SAVE = new FileChooserMode("SAVE", 2, 2);
    public static final FileChooserMode UNKNOWN = new FileChooserMode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, 3);
    private final int raw;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileChooserMode ofRaw(int i) {
            FileChooserMode[] values;
            for (FileChooserMode fileChooserMode : FileChooserMode.values()) {
                if (fileChooserMode.getRaw() == i) {
                    return fileChooserMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FileChooserMode[] $values() {
        return new FileChooserMode[]{OPEN, OPEN_MULTIPLE, SAVE, UNKNOWN};
    }

    static {
        FileChooserMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1281eb.u($values);
        Companion = new Companion(null);
    }

    private FileChooserMode(String str, int i, int i2) {
        this.raw = i2;
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return $ENTRIES;
    }

    public static FileChooserMode valueOf(String str) {
        return (FileChooserMode) Enum.valueOf(FileChooserMode.class, str);
    }

    public static FileChooserMode[] values() {
        return (FileChooserMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
