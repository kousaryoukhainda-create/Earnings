package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: Ji0  reason: default package */
/* loaded from: classes2.dex */
public final class Ji0 extends Fi0 {
    public final /* synthetic */ int b;
    public final ArrayList c;

    public /* synthetic */ Ji0(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    public final JSONObject g() {
        switch (this.b) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Platform", "android");
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    Ii0 ii0 = (Ii0) it.next();
                    ii0.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("AppID", ii0.b);
                    jSONObject2.put("SecondsCum", ii0.c);
                    jSONObject2.put("IsSystemApp", ii0.d);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("userAppsUsageHistory", jSONArray);
                return jSONObject;
            case 1:
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Platform", "android");
                jSONObject3.put("PartnerAppsOnly", false);
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    C2528qj0 c2528qj0 = (C2528qj0) it2.next();
                    c2528qj0.getClass();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("AppID", c2528qj0.b);
                    jSONObject4.put("InstalledAt", c2528qj0.c);
                    jSONObject4.put("InstalledAtInUnixTime", c2528qj0.d);
                    jSONObject4.put("DeviceTimeZoneID", c2528qj0.f);
                    if (!Eg0.b(c2528qj0.g) || !Eg0.b(c2528qj0.h)) {
                        JSONObject jSONObject5 = new JSONObject();
                        if (!Eg0.b(c2528qj0.g)) {
                            jSONObject5.put("ClickUUID", c2528qj0.g);
                        }
                        if (!Eg0.b(c2528qj0.h)) {
                            jSONObject5.put("ViewUUID", c2528qj0.h);
                        }
                        jSONObject5.put("AdFormat", c2528qj0.i);
                        jSONObject4.put("InstallSource", jSONObject5);
                    }
                    jSONObject4.put("Installer", c2528qj0.j);
                    if (c2528qj0.k) {
                        jSONObject4.put("HasLaunchIntent", true);
                    }
                    if (c2528qj0.l) {
                        jSONObject4.put("HasSystemFlag", true);
                    }
                    jSONObject4.put("Signatures", c2528qj0.m);
                    jSONArray2.put(jSONObject4);
                }
                jSONObject3.put("UserApps", jSONArray2);
                return jSONObject3;
            default:
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("Platform", "android");
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.c.iterator();
                while (it3.hasNext()) {
                    Bj0 bj0 = (Bj0) it3.next();
                    bj0.getClass();
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("AppID", bj0.b);
                    jSONObject7.put("StartAt", bj0.c);
                    jSONObject7.put("StopAt", bj0.d);
                    jSONObject7.put("CampaignApp", bj0.f);
                    jSONArray3.put(jSONObject7);
                }
                jSONObject6.put("UserAppUsages", jSONArray3);
                return jSONObject6;
        }
    }
}
