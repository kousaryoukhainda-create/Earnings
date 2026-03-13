package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes3.dex */
public final class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzl("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzp(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static Bundle zzc(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    public static Bundle zzd(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zze(String str, long j) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j);
        return bundle;
    }

    public static C0316Ha zzf(Intent intent, String str) {
        if (intent == null) {
            zzl("BillingHelper", "Got null intent!");
            C0264Fa a = C0316Ha.a();
            a.a = 6;
            a.b = "An internal error occurred.";
            return a.a();
        }
        C0264Fa a2 = C0316Ha.a();
        a2.a = zzb(intent.getExtras(), str);
        a2.b = zzh(intent.getExtras(), str);
        return a2.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xD] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xD] */
    public static C3087xD zzg(Bundle bundle, String str) {
        if (bundle == null) {
            return new Object();
        }
        zzp(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new Object();
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static String zzi(int i) {
        return zzd.zza(i).toString();
    }

    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            int size = stringArrayList.size();
            zzk("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase zzq = zzq(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzq != null) {
                    arrayList.add(zzq);
                }
            }
        } else {
            Purchase zzq2 = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq2 == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq2);
        }
        return arrayList;
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i = 40000;
                while (!str2.isEmpty() && i > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, Throwable th) {
        try {
            if (!Log.isLoggable(str, 5)) {
                return;
            }
            if (th == null) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, th);
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzn(C0316Ha c0316Ha, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c0316Ha.a);
        bundle.putString("DEBUG_MESSAGE", c0316Ha.b);
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Bundle zzo(C0316Ha c0316Ha, int i, String str) {
        Bundle zzn = zzn(c0316Ha, 5);
        if (str != null) {
            zzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return zzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzq(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        zzk("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
