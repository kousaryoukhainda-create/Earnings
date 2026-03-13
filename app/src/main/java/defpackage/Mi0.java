package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahq;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Mi0  reason: default package */
/* loaded from: classes2.dex */
public abstract class Mi0 {
    public static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i = Build.VERSION.SDK_INT;
        try {
            if (i <= 21) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.importance <= 100 && runningAppProcessInfo.importanceReasonCode != 2 && runningAppProcessInfo.importanceReasonComponent == null) {
                            return runningAppProcessInfo.pkgList[0];
                        }
                    }
                    return null;
                }
                return null;
            } else if (i == 22) {
                UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                if (usageStatsManager == null) {
                    return null;
                }
                DateTimeFormatter dateTimeFormatter = Kj0.a;
                long currentTimeMillis = System.currentTimeMillis();
                List<UsageStats> queryUsageStats = usageStatsManager.queryUsageStats(4, currentTimeMillis - 900000, currentTimeMillis);
                if (queryUsageStats == null || queryUsageStats.isEmpty()) {
                    return null;
                }
                Collections.sort(queryUsageStats, new C0272Fi(6));
                return queryUsageStats.get(0).getPackageName();
            } else {
                return c(context);
            }
        } catch (Exception e) {
            AbstractC1930jl0.e("Pokemon", e);
            Intrinsics.checkNotNullParameter("usage-collection", "category");
            C2521qg c2521qg = new C2521qg("usage-collection");
            c2521qg.e = "Exception in getActivePackage";
            c2521qg.f = e;
            c2521qg.e();
            return null;
        }
    }

    public static final boolean b(Throwable th, Class expected) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        if (th != null && (expected.isInstance(th) || b(th.getCause(), expected))) {
            return true;
        }
        return false;
    }

    public static String c(Context context) {
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        if (usageStatsManager == null) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = Kj0.a;
        long currentTimeMillis = System.currentTimeMillis();
        List<UsageStats> queryUsageStats = usageStatsManager.queryUsageStats(4, currentTimeMillis - 14400000, currentTimeMillis);
        if (queryUsageStats != null && !queryUsageStats.isEmpty()) {
            Collections.sort(queryUsageStats, new C0272Fi(7));
            String packageName = queryUsageStats.get(0).getPackageName();
            int i = 1;
            while (true) {
                long j = i;
                if (j > 16) {
                    break;
                }
                UsageEvents queryEvents = usageStatsManager.queryEvents(currentTimeMillis - (j * 900000), currentTimeMillis - ((i - 1) * 900000));
                UsageEvents.Event event = null;
                UsageEvents.Event event2 = null;
                while (queryEvents.hasNextEvent()) {
                    UsageEvents.Event event3 = new UsageEvents.Event();
                    queryEvents.getNextEvent(event3);
                    if (event3.getEventType() == 1) {
                        event = event3;
                    }
                    if (event3.getPackageName().equals(packageName)) {
                        event2 = event3;
                    }
                }
                if (event == null) {
                    i++;
                } else if (event.getPackageName().equals(packageName)) {
                    return packageName;
                } else {
                    if (event.getTimeStamp() > queryUsageStats.get(0).getLastTimeUsed()) {
                        return event.getPackageName();
                    }
                    if (event2 != null && event2.getEventType() != 1) {
                        return event.getPackageName();
                    }
                    return packageName;
                }
            }
        }
        return null;
    }

    public static MultiFactorInfo d(zzahq zzahqVar) {
        if (zzahqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahqVar.zze())) {
            return new PhoneMultiFactorInfo(zzahqVar.zza(), zzahqVar.zzd(), zzahqVar.zzc(), Preconditions.checkNotEmpty(zzahqVar.zze()));
        } else if (zzahqVar.zzb() == null) {
            return null;
        } else {
            return new TotpMultiFactorInfo(zzahqVar.zzd(), zzahqVar.zzc(), zzahqVar.zza(), (zzair) Preconditions.checkNotNull(zzahqVar.zzb(), "totpInfo cannot be null."));
        }
    }

    public static ArrayList e(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo d = d((zzahq) it.next());
                if (d != null) {
                    arrayList.add(d);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
