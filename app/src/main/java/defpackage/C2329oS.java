package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* renamed from: oS  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2329oS {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;

    public C2329oS(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("Name");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.a = string;
        String string2 = json.getString("Description");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.b = string2;
        this.c = json.getInt("Coins");
        this.d = json.optInt("Type");
        String optString = json.optString("RewardedAt");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        this.e = optString;
        this.f = json.optLong("TimedCoinsDuration");
        this.g = json.optInt("TimedCoins");
        this.h = json.optInt("RewardsCount");
        this.i = json.optInt("CompletedRewards");
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PlaytimeAdvancePlusEvent{name='");
        b.append(this.a);
        b.append("', description='");
        b.append(this.b);
        b.append("', coins=");
        b.append(this.c);
        b.append(", type=");
        b.append(this.d);
        b.append(", rewardedAt='");
        b.append(this.e);
        b.append("', timedCoinsDuration='");
        b.append(this.f);
        b.append("', timedCoins='");
        b.append(this.g);
        b.append("'rewardsCount='");
        b.append(this.h);
        b.append("'completedRewards='");
        return AbstractC2437ph.k(b, this.i, "'}");
    }
}
