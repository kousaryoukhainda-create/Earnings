package com.fyber.fairbid.mediation.adapter;

import com.fyber.fairbid.EnumC1119r0;
import com.fyber.fairbid.internal.Utils;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.mediation.abstr.AdapterException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class AdapterConfiguration {
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public static final JSONObject c = new JSONObject("{\"name\": \"" + Network.FYBERMARKETPLACE.getCanonicalName() + "\"}");
    @NotNull
    public final String a;
    @NotNull
    public final Map<String, Object> b;

    @Metadata
    /* loaded from: classes.dex */
    public static final class AdapterConfigurationError extends Exception {
        public AdapterConfigurationError() {
            super("No canonical network name.");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
    }

    public /* synthetic */ AdapterConfiguration(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    @NotNull
    public final String getCanonicalName() {
        String lowerCase = this.a.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final String getValue(String str) {
        if (this.b.containsKey(str)) {
            return String.valueOf(this.b.get(str));
        }
        return null;
    }

    public final int optInt(String str, int i) throws AdapterException {
        String optValue = optValue(str, null);
        if (optValue != null) {
            try {
                return Integer.parseInt(optValue);
            } catch (NumberFormatException unused) {
                throw new AdapterException(EnumC1119r0.UNKNOWN, AbstractC0324Hi.g(str, " invalid: ", optValue));
            }
        }
        return i;
    }

    public final String optValue(String str, String str2) {
        if (str != null && this.b.containsKey(str)) {
            return String.valueOf(this.b.get(str));
        }
        return str2;
    }

    @NotNull
    public String toString() {
        String format = String.format("<AdapterConfiguration name: %s>", Arrays.copyOf(new Object[]{getCanonicalName()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public AdapterConfiguration(JSONObject jSONObject) {
        String name = jSONObject.optString("name");
        Intrinsics.checkNotNullExpressionValue(name, "name");
        if (name.length() != 0) {
            this.a = name;
            Map<String, Object> createMapFromJsonObject = Utils.createMapFromJsonObject(jSONObject.optJSONObject("data"));
            Intrinsics.checkNotNullExpressionValue(createMapFromJsonObject, "createMapFromJsonObject(…on.optJSONObject(\"data\"))");
            this.b = createMapFromJsonObject;
            return;
        }
        throw new AdapterConfigurationError();
    }
}
