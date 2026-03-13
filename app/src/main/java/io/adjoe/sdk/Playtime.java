package io.adjoe.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import io.adjoe.sdk.PlaytimeNotInitializedException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class Playtime {
    public static final int EVENT_TEASER_SHOWN = 14;
    @NotNull
    public static final String TAG = "Playtime";
    @NotNull
    public static final Playtime INSTANCE = new Object();
    public static final Si0 a = new Object();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class CampaignType {
        public static final CampaignType AFFILIATE;
        public static final CampaignType INCENT;
        public static final CampaignType NETWORK;
        public static final CampaignType NONE;
        public static final CampaignType ORGANIC;
        public static final /* synthetic */ CampaignType[] b;
        public static final /* synthetic */ C0488Nr c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, io.adjoe.sdk.Playtime$CampaignType] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, io.adjoe.sdk.Playtime$CampaignType] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, io.adjoe.sdk.Playtime$CampaignType] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, io.adjoe.sdk.Playtime$CampaignType] */
        /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, io.adjoe.sdk.Playtime$CampaignType] */
        static {
            ?? r5 = new Enum("ORGANIC", 0);
            ORGANIC = r5;
            ?? r6 = new Enum("AFFILIATE", 1);
            AFFILIATE = r6;
            ?? r7 = new Enum("INCENT", 2);
            INCENT = r7;
            ?? r8 = new Enum("NETWORK", 3);
            NETWORK = r8;
            ?? r9 = new Enum("NONE", 4);
            NONE = r9;
            CampaignType[] campaignTypeArr = {r5, r6, r7, r8, r9};
            b = campaignTypeArr;
            c = AbstractC1281eb.u(campaignTypeArr);
        }

        @NotNull
        public static InterfaceC0462Mr getEntries() {
            return c;
        }

        public static CampaignType valueOf(String str) {
            return (CampaignType) Enum.valueOf(CampaignType.class, str);
        }

        public static CampaignType[] values() {
            return (CampaignType[]) b.clone();
        }
    }

    private Playtime() {
    }

    public static final void a(boolean z) {
        a.a = z;
    }

    public static final void addEventListener(@NotNull PlaytimeEventListener playtimeEventListener) {
        Intrinsics.checkNotNullParameter(playtimeEventListener, "eventListener");
        Intrinsics.checkNotNullParameter(playtimeEventListener, "playtimeEventListener");
        C1049ci0.d().d = playtimeEventListener;
    }

    @NotNull
    public static final Intent getCatalogIntent(@NotNull Context context) throws PlaytimeException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return getCatalogIntent(context, null);
    }

    public static final PlaytimeCatalogListener getCatalogListener() {
        return a.b;
    }

    public static final int getPreReleaseVersion() {
        return 0;
    }

    public static /* synthetic */ void getPreReleaseVersion$annotations() {
    }

    public static final String getUserId(@NotNull Context ctx) {
        String str;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Context L = Kj0.L(ctx);
        Set<String> set = null;
        if (L == null) {
            AbstractC1930jl0.b("Cannot retrieve user because the context is null.");
            return null;
        }
        SharedPreferences d = C2176mf0.b.o(L).d();
        try {
            C0423Ld a2 = AbstractC3019wV.a(String.class);
            if (a2.equals(AbstractC3019wV.a(String.class))) {
                str = d.getString("g", "");
            } else if (a2.equals(AbstractC3019wV.a(Integer.TYPE))) {
                str = (String) Integer.valueOf(d.getInt("g", -1));
            } else if (a2.equals(AbstractC3019wV.a(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(d.getBoolean("g", false));
            } else if (a2.equals(AbstractC3019wV.a(Float.TYPE))) {
                str = (String) Float.valueOf(d.getFloat("g", -1.0f));
            } else if (a2.equals(AbstractC3019wV.a(Long.TYPE))) {
                str = (String) Long.valueOf(d.getLong("g", -1L));
            } else if (a2.equals(AbstractC3019wV.a(Set.class))) {
                if ("" instanceof Set) {
                }
                if (set == null) {
                    set = C3312zr.b;
                }
                str = (String) new ConcurrentSkipListSet(d.getStringSet("g", set));
            } else {
                throw new IllegalArgumentException("Unsupported type: " + AbstractC3019wV.a(String.class).b());
            }
            return str;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final int getVersion() {
        return 304000;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    @NotNull
    public static final String getVersionName() {
        return "3.4.0";
    }

    public static /* synthetic */ void getVersionName$annotations() {
    }

    public static final boolean hasAcceptedTOS(@NotNull Context ctx) {
        C0423Ld a2;
        Set<String> set;
        Boolean bool;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Context L = Kj0.L(ctx);
        if (L == null) {
            return false;
        }
        C2176mf0 o = C2176mf0.b.o(L);
        Boolean bool2 = Boolean.FALSE;
        SharedPreferences d = o.d();
        try {
            a2 = AbstractC3019wV.a(Boolean.class);
            set = null;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        if (a2.equals(AbstractC3019wV.a(String.class))) {
            bool = (Boolean) d.getString("i", null);
        } else if (a2.equals(AbstractC3019wV.a(Integer.TYPE))) {
            bool = (Boolean) Integer.valueOf(d.getInt("i", -1));
        } else if (a2.equals(AbstractC3019wV.a(Boolean.TYPE))) {
            bool = Boolean.valueOf(d.getBoolean("i", false));
        } else if (a2.equals(AbstractC3019wV.a(Float.TYPE))) {
            bool = (Boolean) Float.valueOf(d.getFloat("i", -1.0f));
        } else if (a2.equals(AbstractC3019wV.a(Long.TYPE))) {
            bool = (Boolean) Long.valueOf(d.getLong("i", -1L));
        } else if (a2.equals(AbstractC3019wV.a(Set.class))) {
            if (bool2 instanceof Set) {
                set = (Set) bool2;
            }
            if (set == null) {
                set = C3312zr.b;
            }
            bool2 = (Boolean) new ConcurrentSkipListSet(d.getStringSet("i", set));
            Intrinsics.b(bool2);
            return bool2.booleanValue();
        } else {
            throw new IllegalArgumentException("Unsupported type: " + AbstractC3019wV.a(Boolean.class).b());
        }
        bool2 = bool;
        Intrinsics.b(bool2);
        return bool2.booleanValue();
    }

    public static final boolean hasAcceptedUsagePermission(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Context L = Kj0.L(ctx);
        if (L == null) {
            return false;
        }
        return Kj0.H(L);
    }

    public static final void init(@NotNull Context context, @NotNull String sdkHash) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        AbstractC2526qi0.a(context, sdkHash, null, null, 28);
    }

    public static final boolean isInitialized() {
        return Ki0.b;
    }

    public static final void removeCatalogListener() {
        a.b = null;
    }

    public static final void removeEventListener() {
        C1049ci0.d().d = null;
    }

    public static final void sendUserEvent(@NotNull Context ctx, int i, String str, PlaytimeParams playtimeParams) throws PlaytimeNotInitializedException {
        String str2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Context L = Kj0.L(ctx);
        if (!Ki0.b) {
            AbstractC1930jl0.b("Cannot send a user event because the SDK is not initialized.");
            throw PlaytimeNotInitializedException.Errors.SDK_NOT_INITIALIZED.m33getThrowable();
        } else if (L == null) {
            AbstractC1930jl0.b("Cannot send a user event because the context is null.");
        } else if (!"custom".equalsIgnoreCase(Kj0.K(L)) && 14 != i && 12 != i) {
            AbstractC1930jl0.b("Cannot send a user event. Please check with Adjoe team about custom integration.");
        } else {
            Yh0.b(L, playtimeParams);
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                switch (i) {
                    case 1:
                        str2 = "agb_shown";
                        break;
                    case 2:
                        str2 = "agb_accepted";
                        break;
                    case 3:
                        str2 = "agb_declined";
                        break;
                    case 4:
                        str2 = "usage_permission_accepted";
                        break;
                    case 5:
                        str2 = "usage_permission_denied";
                        break;
                    case 6:
                    case 11:
                    default:
                        return;
                    case 7:
                        str2 = "video_play";
                        if (str != null) {
                            linkedHashMap.put("VideoAppId", str);
                            break;
                        }
                        break;
                    case 8:
                        str2 = "video_pause";
                        if (str != null) {
                            linkedHashMap.put("VideoAppId", str);
                            break;
                        }
                        break;
                    case 9:
                        str2 = "video_ended";
                        if (str != null) {
                            linkedHashMap.put("VideoAppId", str);
                            break;
                        }
                        break;
                    case 10:
                        str2 = "campaigns_screen_shown";
                        break;
                    case 12:
                        str2 = "app_open";
                        break;
                    case 13:
                        str2 = "first_impression";
                        break;
                    case 14:
                        str2 = "teaser_shown";
                        break;
                }
                AbstractC1930jl0.b("Sending user event \"" + str2 + "\".");
                C1049ci0.d().h(L, new Ei0(str2, null, C3054wr.b, linkedHashMap, playtimeParams, 2));
            } catch (Exception e) {
                AbstractC1930jl0.e("Pokemon", e);
                AbstractC1930jl0.b("An error occurred while sending a user event.");
            }
        }
    }

    public static final void setCatalogListener(@NotNull PlaytimeCatalogListener playtimeCatalogListener) {
        Intrinsics.checkNotNullParameter(playtimeCatalogListener, "catalogListener");
        Si0 si0 = a;
        Intrinsics.checkNotNullParameter(playtimeCatalogListener, "playtimeCatalogListener");
        si0.b = playtimeCatalogListener;
    }

    public static final void setUAParams(@NotNull Context context, @NotNull PlaytimeParams params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        Yh0.b(context, params);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:20|21|22|23|(2:25|26)(2:79|(1:81)(2:82|(1:84)(2:85|(1:87)(2:88|(1:90)(2:91|(15:93|(1:95)(1:99)|(1:97)|98|28|29|30|31|(2:33|34)(2:52|(1:54)(2:55|(1:57)(2:58|(1:60)(2:61|(1:63)(2:64|(9:66|(1:68)(1:73)|(1:70)(1:72)|71|36|(2:38|(2:40|(2:42|43)))|45|46|47)(2:74|75))))))|35|36|(0)|45|46|47)(2:100|101))))))|27|28|29|30|31|(0)(0)|35|36|(0)|45|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x034c, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ad A[Catch: ClassCastException -> 0x02aa, TryCatch #4 {ClassCastException -> 0x02aa, blocks: (B:105:0x0290, B:109:0x02a1, B:113:0x02ad, B:115:0x02ba, B:116:0x02c6, B:118:0x02d2, B:119:0x02dc, B:121:0x02e8, B:122:0x02f5, B:124:0x0301, B:125:0x030e, B:127:0x0318, B:129:0x031c, B:134:0x0325, B:135:0x0332, B:136:0x034b), top: B:163:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void showCatalog(@org.jetbrains.annotations.NotNull android.app.Activity r18, @org.jetbrains.annotations.NotNull io.adjoe.sdk.PlaytimeOptions r19) throws io.adjoe.sdk.PlaytimeException {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.adjoe.sdk.Playtime.showCatalog(android.app.Activity, io.adjoe.sdk.PlaytimeOptions):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:29|(3:30|31|32)|(4:(2:34|35)(2:92|(1:94)(2:95|(1:97)(2:98|(1:100)(2:101|(1:103)(2:104|(17:106|(1:108)(1:112)|(1:110)|111|37|38|39|40|(2:42|43)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(11:79|(1:81)(1:86)|(1:83)(1:85)|84|45|46|47|(2:49|(2:51|(2:53|54)))|56|57|58)(2:87|88))))))|44|45|46|47|(0)|56|57|58)(2:113|114))))))|56|57|58)|36|37|38|39|40|(0)(0)|44|45|46|47|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:29|30|31|32|(2:34|35)(2:92|(1:94)(2:95|(1:97)(2:98|(1:100)(2:101|(1:103)(2:104|(17:106|(1:108)(1:112)|(1:110)|111|37|38|39|40|(2:42|43)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(11:79|(1:81)(1:86)|(1:83)(1:85)|84|45|46|47|(2:49|(2:51|(2:53|54)))|56|57|58)(2:87|88))))))|44|45|46|47|(0)|56|57|58)(2:113|114))))))|36|37|38|39|40|(0)(0)|44|45|46|47|(0)|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0370, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0412, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0373 A[Catch: ClassCastException -> 0x0370, TryCatch #6 {ClassCastException -> 0x0370, blocks: (B:142:0x0356, B:146:0x0367, B:150:0x0373, B:152:0x0380, B:153:0x038c, B:155:0x0398, B:156:0x03a2, B:158:0x03ae, B:159:0x03bb, B:161:0x03c7, B:162:0x03d4, B:164:0x03de, B:166:0x03e2, B:171:0x03eb, B:172:0x03f8, B:173:0x0411), top: B:207:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a8  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Class] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent getCatalogIntent(@org.jetbrains.annotations.NotNull android.content.Context r19, io.adjoe.sdk.PlaytimeParams r20) throws io.adjoe.sdk.PlaytimeException {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.adjoe.sdk.Playtime.getCatalogIntent(android.content.Context, io.adjoe.sdk.PlaytimeParams):android.content.Intent");
    }

    public static final void init(@NotNull Context context, @NotNull String sdkHash, @NotNull PlaytimeInitialisationListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC2526qi0.a(context, sdkHash, null, listener, 20);
    }

    public static final void init(@NotNull Context context, @NotNull String sdkHash, @NotNull PlaytimeOptions options) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(options, "options");
        AbstractC2526qi0.a(context, sdkHash, options, null, 24);
    }

    public static final void init(@NotNull Context context, @NotNull String sdkHash, @NotNull PlaytimeOptions options, @NotNull PlaytimeInitialisationListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkHash, "sdkHash");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC2526qi0.a(context, sdkHash, options, listener, 16);
    }

    public static final void sendUserEvent(@NotNull Context context, int i, String str) throws PlaytimeNotInitializedException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        sendUserEvent(context, i, str, null);
    }
}
