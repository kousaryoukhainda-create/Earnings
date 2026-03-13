package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class SharedPreferencesPigeonOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final String fileName;
    private final boolean useDataStore;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SharedPreferencesPigeonOptions fromList(@NotNull List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(1);
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions((String) pigeonVar_list.get(0), ((Boolean) obj).booleanValue());
        }

        private Companion() {
        }
    }

    public SharedPreferencesPigeonOptions(String str, boolean z) {
        this.fileName = str;
        this.useDataStore = z;
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i & 2) != 0) {
            z = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component2() {
        return this.useDataStore;
    }

    @NotNull
    public final SharedPreferencesPigeonOptions copy(String str, boolean z) {
        return new SharedPreferencesPigeonOptions(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedPreferencesPigeonOptions) {
            SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions = (SharedPreferencesPigeonOptions) obj;
            return Intrinsics.a(this.fileName, sharedPreferencesPigeonOptions.fileName) && this.useDataStore == sharedPreferencesPigeonOptions.useDataStore;
        }
        return false;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public int hashCode() {
        String str = this.fileName;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.useDataStore ? 1231 : 1237);
    }

    @NotNull
    public final List<Object> toList() {
        return C0346Ie.c(this.fileName, Boolean.valueOf(this.useDataStore));
    }

    @NotNull
    public String toString() {
        String str = this.fileName;
        boolean z = this.useDataStore;
        return "SharedPreferencesPigeonOptions(fileName=" + str + ", useDataStore=" + z + ")";
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z);
    }
}
