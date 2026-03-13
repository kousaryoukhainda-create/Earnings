package com.fyber.fairbid;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.internal.Logger;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class pi {
    @NotNull
    public final SharedPreferences a;
    @NotNull
    public final SharedPreferences b;
    @NotNull
    public final ArrayList c;
    @NotNull
    public final ArrayList d;

    /* loaded from: classes.dex */
    public interface a {
        void onCcpaChange(@NotNull String str);

        void onCcpaClear();

        void onCpraOptOut(boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onGdprChange(int i);
    }

    public pi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        this.a = defaultSharedPreferences;
        SharedPreferences sharedPreferences = context.getSharedPreferences("fairbid.privacy", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void a(boolean z) {
        Logger.debug("Setting the GDPR consent to " + z);
        if (z != a(a())) {
            this.b.edit().putInt("gdpr_consent", z ? 1 : 0).apply();
            for (b bVar : C0553Qe.A(this.c)) {
                bVar.onGdprChange(z ? 1 : 0);
            }
        }
    }

    public final void b(boolean z) {
        Logger.debug("Setting the LGPD consent to " + z);
        if (z != a(b())) {
            this.b.edit().putInt("lgpd_consent", z ? 1 : 0).apply();
        }
    }

    public final Boolean b() {
        if (this.b.contains("lgpd_consent")) {
            return Boolean.valueOf(this.b.getInt("lgpd_consent", 0) == 1);
        }
        return null;
    }

    public final void b(String str) {
        Boolean bool;
        SharedPreferences.Editor edit = this.a.edit();
        if (str == null) {
            Logger.debug("Clearing IAB US Privacy String");
            edit.remove("IABUSPrivacy_String");
        } else {
            Logger.debug("Setting IAB US Privacy String to: ".concat(str));
            edit.putString("IABUSPrivacy_String", str);
        }
        edit.apply();
        if (str == null) {
            for (a aVar : C0553Qe.A(this.d)) {
                aVar.onCcpaClear();
            }
            return;
        }
        if (str.equals("1YYN")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("1YNN") ? Boolean.FALSE : null;
        }
        for (a aVar2 : C0553Qe.A(this.d)) {
            aVar2.onCcpaChange(str);
            if (bool != null) {
                aVar2.onCpraOptOut(bool.booleanValue());
            }
        }
    }

    public final Boolean a() {
        if (this.b.contains("gdpr_consent")) {
            return Boolean.valueOf(this.b.getInt("gdpr_consent", 0) == 1);
        }
        return null;
    }

    public static int a(Boolean bool) {
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            return 1;
        }
        return Intrinsics.a(bool, Boolean.FALSE) ? 0 : -1;
    }

    public final void a(String str) {
        SharedPreferences.Editor edit = this.b.edit();
        if (str == null) {
            Logger.debug("Clearing the GDPR Consent String");
            edit.remove(Constants.GDPR_CONSENT_STRING_URL_KEY);
        } else {
            Logger.debug("Setting GDPR Consent String to: ".concat(str));
            edit.putString(Constants.GDPR_CONSENT_STRING_URL_KEY, str);
        }
        edit.apply();
    }
}
