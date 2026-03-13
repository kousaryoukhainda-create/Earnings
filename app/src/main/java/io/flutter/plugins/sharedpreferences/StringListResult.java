package io.flutter.plugins.sharedpreferences;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class StringListResult {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final String jsonEncodedValue;
    @NotNull
    private final StringListLookupResultType type;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StringListResult fromList(@NotNull List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(1);
            Intrinsics.c(obj, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
            return new StringListResult((String) pigeonVar_list.get(0), (StringListLookupResultType) obj);
        }

        private Companion() {
        }
    }

    public StringListResult(String str, @NotNull StringListLookupResultType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.jsonEncodedValue = str;
        this.type = type;
    }

    public static /* synthetic */ StringListResult copy$default(StringListResult stringListResult, String str, StringListLookupResultType stringListLookupResultType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringListResult.jsonEncodedValue;
        }
        if ((i & 2) != 0) {
            stringListLookupResultType = stringListResult.type;
        }
        return stringListResult.copy(str, stringListLookupResultType);
    }

    public final String component1() {
        return this.jsonEncodedValue;
    }

    @NotNull
    public final StringListLookupResultType component2() {
        return this.type;
    }

    @NotNull
    public final StringListResult copy(String str, @NotNull StringListLookupResultType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StringListResult(str, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StringListResult) {
            StringListResult stringListResult = (StringListResult) obj;
            return Intrinsics.a(this.jsonEncodedValue, stringListResult.jsonEncodedValue) && this.type == stringListResult.type;
        }
        return false;
    }

    public final String getJsonEncodedValue() {
        return this.jsonEncodedValue;
    }

    @NotNull
    public final StringListLookupResultType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.jsonEncodedValue;
        return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final List<Object> toList() {
        return C0346Ie.c(this.jsonEncodedValue, this.type);
    }

    @NotNull
    public String toString() {
        String str = this.jsonEncodedValue;
        StringListLookupResultType stringListLookupResultType = this.type;
        return "StringListResult(jsonEncodedValue=" + str + ", type=" + stringListLookupResultType + ")";
    }

    public /* synthetic */ StringListResult(String str, StringListLookupResultType stringListLookupResultType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, stringListLookupResultType);
    }
}
