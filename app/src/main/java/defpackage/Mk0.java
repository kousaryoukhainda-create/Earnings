package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Mk0  reason: default package */
/* loaded from: classes2.dex */
public final class Mk0 extends Fi0 {
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final JSONArray i;
    public final boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final JSONArray n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final int r;
    public final JSONObject s;
    public final ArrayList t;

    public Mk0(JSONObject jSONObject) {
        boolean z;
        this.b = jSONObject.optString("ExternalUserID", null);
        this.c = jSONObject.optString("UserUUID", null);
        this.d = jSONObject.optBoolean("IntervalRewardEnabled", false);
        this.f = jSONObject.optBoolean("HasCampaigns", false);
        this.g = jSONObject.optBoolean("HasPIRCampaigns", false);
        this.h = jSONObject.optBoolean("IsNewUser", false);
        this.i = jSONObject.optJSONArray("Configs");
        this.j = jSONObject.optBoolean("DownloadBundles", true);
        this.k = jSONObject.optString("Gender", null);
        this.l = jSONObject.optString("DayOfBirth", null);
        String optString = jSONObject.optString("SDKFeatures", "");
        this.m = jSONObject.optString("HostedBundleUrl", "");
        this.r = jSONObject.optInt("TestGroup", -1);
        if (!optString.contains("PostInstallRewards") && !jSONObject.optBoolean("PIREnabled")) {
            z = false;
        } else {
            z = true;
        }
        this.o = z;
        this.p = jSONObject.optString("SentryLogLevel", "error");
        this.q = jSONObject.optBoolean("GetUsageCampaigns", true);
        this.s = jSONObject.optJSONObject("Permission");
        JSONArray optJSONArray = jSONObject.optJSONArray("Bundles");
        this.t = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.t.add(new Kg0(optJSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    AbstractC1930jl0.i("AdjoeBackend", "Could not read bundles from SDK init Response", e);
                }
            }
        }
        this.n = jSONObject.optJSONArray("BundleConfigs");
    }
}
