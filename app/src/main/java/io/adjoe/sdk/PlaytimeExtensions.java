package io.adjoe.sdk;

import android.text.TextUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class PlaytimeExtensions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final PlaytimeExtensions f = new Builder().build();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;

        @NotNull
        public final PlaytimeExtensions build() {
            return new PlaytimeExtensions(this.a, this.b, this.c, this.d, this.e);
        }

        @NotNull
        public final Builder setSubId1(String str) {
            this.a = str;
            return this;
        }

        @NotNull
        public final Builder setSubId2(String str) {
            this.b = str;
            return this;
        }

        @NotNull
        public final Builder setSubId3(String str) {
            this.c = str;
            return this;
        }

        @NotNull
        public final Builder setSubId4(String str) {
            this.d = str;
            return this;
        }

        @NotNull
        public final Builder setSubId5(String str) {
            this.e = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PlaytimeExtensions getEMPTY() {
            return PlaytimeExtensions.f;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PlaytimeExtensions(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static /* synthetic */ PlaytimeExtensions copy$default(PlaytimeExtensions playtimeExtensions, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playtimeExtensions.a;
        }
        if ((i & 2) != 0) {
            str2 = playtimeExtensions.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = playtimeExtensions.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = playtimeExtensions.d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = playtimeExtensions.e;
        }
        return playtimeExtensions.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final Builder buildUpon() {
        return new Builder().setSubId1(this.a).setSubId2(this.b).setSubId3(this.c).setSubId4(this.d).setSubId5(this.e);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    @NotNull
    public final PlaytimeExtensions copy(String str, String str2, String str3, String str4, String str5) {
        return new PlaytimeExtensions(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaytimeExtensions) {
            PlaytimeExtensions playtimeExtensions = (PlaytimeExtensions) obj;
            return Intrinsics.a(this.a, playtimeExtensions.a) && Intrinsics.a(this.b, playtimeExtensions.b) && Intrinsics.a(this.c, playtimeExtensions.c) && Intrinsics.a(this.d, playtimeExtensions.d) && Intrinsics.a(this.e, playtimeExtensions.e);
        }
        return false;
    }

    public final String getSubId1() {
        return this.a;
    }

    public final String getSubId2() {
        return this.b;
    }

    public final String getSubId3() {
        return this.c;
    }

    public final String getSubId4() {
        return this.d;
    }

    public final String getSubId5() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("SubID1", str);
        }
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("SubID2", str2);
        }
        String str3 = this.c;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("SubID3", str3);
        }
        String str4 = this.d;
        if (!TextUtils.isEmpty(str4)) {
            jSONObject.put("SubID4", str4);
        }
        String str5 = this.e;
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("SubID5", str5);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder b = Ki0.b("PlaytimeExtensions(subId1=");
        b.append(this.a);
        b.append(", subId2=");
        b.append(this.b);
        b.append(", subId3=");
        b.append(this.c);
        b.append(", subId4=");
        b.append(this.d);
        b.append(", subId5=");
        b.append(this.e);
        b.append(')');
        return b.toString();
    }
}
