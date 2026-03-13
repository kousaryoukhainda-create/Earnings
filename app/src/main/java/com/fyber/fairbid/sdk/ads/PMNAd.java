package com.fyber.fairbid.sdk.ads;

import com.fyber.fairbid.fm;
import com.fyber.fairbid.mediation.pmn.ProgrammaticNetworkInfo;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public final class PMNAd {
    @NotNull
    public static final a Companion = new a();
    @NotNull
    public final String a;
    @NotNull
    public final String b;
    public final double c;
    @NotNull
    public final b d;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public static PMNAd a(String str, JSONObject jSONObject, double d, @NotNull List programmaticNetworkInfoList) throws JSONException, RuntimeException {
            b bVar;
            Object obj;
            Intrinsics.checkNotNullParameter(programmaticNetworkInfoList, "programmaticNetworkInfoList");
            if (str != null) {
                if (jSONObject != null) {
                    String optString = jSONObject.optString("form_factor");
                    Intrinsics.checkNotNullExpressionValue(optString, "pmn.optString(\"form_factor\")");
                    if (Intrinsics.a(optString, Constants.SIGN_IN_METHOD_PHONE)) {
                        bVar = b.a;
                    } else if (Intrinsics.a(optString, "tablet")) {
                        bVar = b.b;
                    } else {
                        bVar = b.c;
                    }
                    b bVar2 = bVar;
                    String string = jSONObject.getString("pmn_id");
                    Iterator it = programmaticNetworkInfoList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.a(((ProgrammaticNetworkInfo) obj).getProgrammaticName(), string)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    ProgrammaticNetworkInfo programmaticNetworkInfo = (ProgrammaticNetworkInfo) obj;
                    if (programmaticNetworkInfo != null) {
                        return new PMNAd(programmaticNetworkInfo.getNetworkName(), str, d, bVar2);
                    }
                    throw new IllegalArgumentException("There is no programmatic network whose identifier is '" + string + '\'');
                }
                throw new JSONException("PMNAd cannot be instantiated because there is no PMN data");
            }
            throw new JSONException("PMNAd cannot be instantiated because there is no PMN markup");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        a,
        b,
        c;

        b() {
        }
    }

    public PMNAd(@NotNull String pmnId, @NotNull String markup, double d, @NotNull b formFactor) {
        Intrinsics.checkNotNullParameter(pmnId, "pmnId");
        Intrinsics.checkNotNullParameter(markup, "markup");
        Intrinsics.checkNotNullParameter(formFactor, "formFactor");
        this.a = pmnId;
        this.b = markup;
        this.c = d;
        this.d = formFactor;
    }

    public static /* synthetic */ PMNAd copy$default(PMNAd pMNAd, String str, String str2, double d, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pMNAd.a;
        }
        if ((i & 2) != 0) {
            str2 = pMNAd.b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = pMNAd.c;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            bVar = pMNAd.d;
        }
        return pMNAd.copy(str, str3, d2, bVar);
    }

    @NotNull
    public static final PMNAd fromPmnDataResponse(String str, JSONObject jSONObject, double d, @NotNull List<ProgrammaticNetworkInfo> list) throws JSONException, RuntimeException {
        Companion.getClass();
        return a.a(str, jSONObject, d, list);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final double component3() {
        return this.c;
    }

    @NotNull
    public final b component4() {
        return this.d;
    }

    @NotNull
    public final PMNAd copy(@NotNull String pmnId, @NotNull String markup, double d, @NotNull b formFactor) {
        Intrinsics.checkNotNullParameter(pmnId, "pmnId");
        Intrinsics.checkNotNullParameter(markup, "markup");
        Intrinsics.checkNotNullParameter(formFactor, "formFactor");
        return new PMNAd(pmnId, markup, d, formFactor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PMNAd) {
            PMNAd pMNAd = (PMNAd) obj;
            return Intrinsics.a(this.a, pMNAd.a) && Intrinsics.a(this.b, pMNAd.b) && Double.compare(this.c, pMNAd.c) == 0 && this.d == pMNAd.d;
        }
        return false;
    }

    @NotNull
    public final b getFormFactor() {
        return this.d;
    }

    @NotNull
    public final String getMarkup() {
        return this.b;
    }

    @NotNull
    public final String getPmnId() {
        return this.a;
    }

    public final double getPrice() {
        return this.c;
    }

    public int hashCode() {
        int a2 = fm.a(this.b, this.a.hashCode() * 31, 31);
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return this.d.hashCode() + ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + a2) * 31);
    }

    @NotNull
    public String toString() {
        return "PMNAd(pmnId=" + this.a + ", markup=" + this.b + ", price=" + this.c + ", formFactor=" + this.d + ')';
    }
}
